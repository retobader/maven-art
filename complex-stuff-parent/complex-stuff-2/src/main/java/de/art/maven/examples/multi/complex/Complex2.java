package de.art.maven.examples.multi.complex;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Complex2 {
    private static final Logger LOG = LoggerFactory.getLogger(Complex2.class);


    public static void main(String[] args) {
        BasicConfigurator.configure();
        LOG.warn("Start complex 2");
        new Complex1().normal().print();
        new Complex1().feature().print();
    }
}
