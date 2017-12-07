package de.art.maven.examples.properties;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by redmann on 6/23/15.
 */
public class Main {
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);


    public static void main(String[] args) {
        BasicConfigurator.configure();
        LOG.warn("Hello World!!!");
    }
}