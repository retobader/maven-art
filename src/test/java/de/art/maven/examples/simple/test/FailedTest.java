package de.art.maven.examples.simple.test;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by redmann on 7/14/15.
 */
public class FailedTest {
    @Test
    public void runTest() {
        System.out.println("Failed");
        Assert.assertTrue(false);
    }
}
