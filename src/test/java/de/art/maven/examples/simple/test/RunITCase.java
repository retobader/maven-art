package de.art.maven.examples.simple.test;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by redmann on 7/14/15.
 */
public class RunITCase {
    @Test
    public void runTest() throws InterruptedException {
        System.out.println("Run IT");
        Thread.sleep(5000l);
        Assert.assertTrue(true);
    }
}
