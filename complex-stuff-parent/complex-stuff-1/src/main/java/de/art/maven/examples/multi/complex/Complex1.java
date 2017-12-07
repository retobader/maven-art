package de.art.maven.examples.multi.complex;

import de.art.maven.examples.multi.data.Data1;
import de.art.maven.examples.multi.model.Model1;
import de.art.maven.examples.multi.model.Model2;

public class Complex1 {
    public Model1 normal() {
        System.out.println("normal");
        return new Model1();
    }

    public Model2 feature() {
        System.out.println("feature");
        Data1 data1 = new Data1();
        Model1 model1 = data1.doStuff();
        return data1.doStuff(model1);
    }
}
