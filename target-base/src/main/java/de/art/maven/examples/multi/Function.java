package de.art.maven.examples.multi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Function {
    private static final Logger LOG = LoggerFactory.getLogger(Function.class);

    public void call() {
        LOG.warn("Call Function");
    }
}
