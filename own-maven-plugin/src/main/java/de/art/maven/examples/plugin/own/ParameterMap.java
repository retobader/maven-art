package de.art.maven.examples.plugin.own;


import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.util.Map;

@Mojo(name = "map", defaultPhase = LifecyclePhase.COMPILE)
public class ParameterMap extends AbstractMojo {

    @Parameter
    private Map<String, Integer> pluginMap;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {

        for (Map.Entry<String, Integer> entry : pluginMap.entrySet()) {

            getLog().warn("Hello entry: " + entry.getKey() + " value: " + entry.getValue());
        }
    }
}
