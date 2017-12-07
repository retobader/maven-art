package de.art.maven.examples.multi.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Model2 extends Model1 {

    private static final Logger LOG = LoggerFactory.getLogger(Model2.class);

    @Override
    public void print() {
        LOG.info("Model2");
    }
}
