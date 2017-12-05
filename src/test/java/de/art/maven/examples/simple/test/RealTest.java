package de.art.maven.examples.simple.test;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by redmann on 7/14/15.
 */
public class RealTest {
    @Test
    public void runTest() {
        System.out.println("Real");

        int equals = new Main().return5();
        Assert.assertEquals(5, equals);
    }
}
