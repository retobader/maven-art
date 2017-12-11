package de.art.maven.examples.conflict.user;

import de.art.maven.examples.conflict.lib1.Lib1;
import de.art.maven.examples.conflict.lib2.Lib2;

public class Main {

    public static void main(String[] args) {
        new Lib1().doImportantStuff();
        new Lib2().doAlsoImportantStuff();
    }
}
