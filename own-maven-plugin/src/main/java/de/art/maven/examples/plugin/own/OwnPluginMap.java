package de.art.maven.examples.plugin.own;


import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.util.Map;

@Mojo(name = "map", defaultPhase = LifecyclePhase.COMPILE)
public class OwnPluginMap extends AbstractMojo {

    @Parameter
    private Map<String, Integer> ownMap;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {

        for (Map.Entry<String, Integer> entry : ownMap.entrySet()) {

            getLog().warn("Entry: " + entry.getKey() + " value: " + entry.getValue());
        }
    }
}
