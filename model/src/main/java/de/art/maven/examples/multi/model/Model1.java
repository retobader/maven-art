package de.art.maven.examples.multi.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Model1 {
    private static final Logger LOG = LoggerFactory.getLogger(Model1.class);

    public void print() {
        LOG.info("Model2");
    }
}
