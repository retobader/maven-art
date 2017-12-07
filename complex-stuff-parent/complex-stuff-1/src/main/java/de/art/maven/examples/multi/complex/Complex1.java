package de.art.maven.examples.multi.complex;

import de.art.maven.examples.multi.data.Data1;
import de.art.maven.examples.multi.model.Model1;
import de.art.maven.examples.multi.model.Model2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Complex1 {
    private static final Logger LOG = LoggerFactory.getLogger(Model2.class);


    public Model1 normal() {
        LOG.warn("normal");
        return new Model1();
    }

    public Model2 feature() {
        LOG.warn("feature");
        Data1 data1 = new Data1();
        Model1 model1 = data1.doStuff();
        return data1.doStuff(model1);
    }
}
