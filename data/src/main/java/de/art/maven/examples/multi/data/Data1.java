package de.art.maven.examples.multi.data;

import de.art.maven.examples.multi.model.Model1;
import de.art.maven.examples.multi.model.Model2;

public class Data1 {
    public Model1 doStuff() {
        return new Model1();
    }

    public Model2 doStuff(Model1 model1) {
        return new Model2();
    }
}
