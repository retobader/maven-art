package de.art.maven.examples.simple;

import de.art.maven.examples.simple.library.Feature;
import de.art.maven.examples.simple.library.Lib;
import org.apache.log4j.BasicConfigurator;

/**
 * Created by redmann on 7/14/15.
 */
public class UserMain {


    public static void main(String[] args) {
        BasicConfigurator.configure();
        new Lib().doSomething();
        new Feature().doFeature();
    }
}
