package de.art.maven.examples.simple.library;

import org.apache.log4j.BasicConfigurator;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        new Lib().doSomething();
        new Feature().doFeature();
    }
}
