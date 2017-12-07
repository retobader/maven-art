package de.art.maven.examples.management;

import org.apache.http.client.fluent.Request;
import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Main {
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        LOG.info("Hello World!");

        final List<Integer> myList = new LinkedList<>();
        for (int i = 0; i < 10; i++) myList.add(i);
        myList.forEach(integer -> LOG.info("Java 8 stream: " + integer));

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
