package de.art.maven.examples.plugin.own;


import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "set_parameter", defaultPhase = LifecyclePhase.COMPILE)
public class SetParameter extends AbstractMojo {

    @Parameter(alias = "greeting", defaultValue = "default")
    private String text;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().warn("Hello world: " + text);
    }
}
