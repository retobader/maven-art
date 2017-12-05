package de.art.maven.examples.simple.library;

import org.apache.commons.math3.stat.Frequency;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Feature {

    private static final Logger LOG = LoggerFactory.getLogger(Main.class);


    public void doFeature() {
        Frequency f = new Frequency();
        f.addValue(1);
        f.addValue(new Integer(1));
        f.addValue(new Long(1));
        f.addValue(2);
        f.addValue(new Integer(-1));
        LOG.warn("Frequency:\n" + f.toString());
    }
}
