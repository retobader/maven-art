package de.art.maven.examples.fat;

import org.apache.http.client.fluent.Request;
import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Created by redmann on 6/23/15.
 */
public class Main {
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);


    public static void main(String[] args) {
        BasicConfigurator.configure();
        LOG.warn("Hello World!!!");
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
}