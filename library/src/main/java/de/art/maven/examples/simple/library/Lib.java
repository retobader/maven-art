package de.art.maven.examples.simple.library;

import org.apache.http.client.fluent.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class Lib {
    private static final Logger LOG = LoggerFactory.getLogger(Lib.class);

    public void doSomething() {
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
