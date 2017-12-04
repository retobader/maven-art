package de.art.maven.examples.simple;

import org.apache.commons.math3.stat.Frequency;
import org.apache.http.client.fluent.Request;
import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Created by redmann on 7/14/15.
 */
public class Main {

    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        new Main().example();
    }

    public void example() {
        try {
            String content = Request.Get("https://www.google.de/search?q=Hello+World")
                    .connectTimeout(1000)
                    .socketTimeout(1000)
                    .execute().returnContent().asString();
            LOG.debug("Request content:\n" + content);
        } catch (IOException e) {
            LOG.warn("Couldn't get data", e);
        }
    }

    public void feature() {
        Frequency f = new Frequency();
        f.addValue(1);
        f.addValue(new Integer(1));
        f.addValue(new Long(1));
        f.addValue(2);
        f.addValue(new Integer(-1));
        LOG.warn("Frequency:\n" + f.toString());
    }
}
