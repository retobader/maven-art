package de.art.maven.examples.simple.test;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by redmann on 7/14/15.
 */
public class RunTest {
    @Test
    public void runTest() {
        System.out.println("Run");
        Assert.assertTrue(true);
    }

    @Test
    public void runOtherTest() {
        System.out.println("Run Other");
        Assert.assertTrue(true);
    }
}
