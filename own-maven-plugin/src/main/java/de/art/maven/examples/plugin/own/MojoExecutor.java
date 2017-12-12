package de.art.maven.examples.plugin.own;


import org.apache.maven.execution.MavenSession;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.BuildPluginManager;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Component;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

import static org.twdata.maven.mojoexecutor.MojoExecutor.*;

@Mojo(name = "executor", defaultPhase = LifecyclePhase.PREPARE_PACKAGE)
public class MojoExecutor extends AbstractMojo {
    @Parameter(defaultValue = "${project}", required = true, readonly = true)
    private MavenProject mavenProject;

    @Parameter(defaultValue = "${session}", required = true, readonly = true)
    private MavenSession mavenSession;

    @Component
    private BuildPluginManager pluginManager;

    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().warn("executor " + mavenProject.getArtifactId());
        ExecutionEnvironment environment = executionEnvironment(mavenProject, mavenSession, pluginManager);

        executeJar(environment);
        executeCopyResources(environment);
    }

    private void executeJar(ExecutionEnvironment environment) throws MojoExecutionException {
        getLog().info("create jar");
        //@formatter:off
        executeMojo(
                plugin(
                        groupId("org.apache.maven.plugins"),
                        artifactId("maven-jar-plugin"),
                        version("3.0.2")
                ),
                goal("jar"),
                configuration(element("finalName", "mojo-jar")),
                environment
        );
        //@formatter:on
    }

    private void executeCopyResources(ExecutionEnvironment environment) throws MojoExecutionException {
        getLog().info("copy resources");
        //@formatter:off
        executeMojo(
                plugin(
                        groupId("org.apache.maven.plugins"),
                        artifactId("maven-resources-plugin"),
                        version("3.0.2")
                ),
                goal("copy-resources"),
                configuration(
                        element("outputDirectory", mavenProject.getBuild().getDirectory() + "/export"),
                        element("overwrite", "true"),
                        element("resources",
                                element("resource",
                                        element("directory", mavenProject.getBasedir().getAbsolutePath() + "/src/main/resource")
                                )
                        )
                ),
                environment
        );
        //@formatter:on
    }
}
