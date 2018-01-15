package de.art.maven.examples.multi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OtherMain extends Main {
    private static final Logger LOG = LoggerFactory.getLogger(OtherMain.class);

    public static void main(String[] args) {
        Main.main(args);
        LOG.info(new Other().getOther());
    }
}
