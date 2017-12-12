package de.art.maven.examples.plugin.own;


import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "properties", defaultPhase = LifecyclePhase.COMPILE)
public class OwnPluginProperties extends AbstractMojo {

    @Parameter(property = "project.version", readonly = true, required = true)
    private String version;

    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().warn("properties: " + version);
    }
}
