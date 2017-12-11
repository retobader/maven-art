package de.art.maven.examples.conflict.lib2;

import de.art.maven.examples.conflict.lib.ConflictedLib;

public class Lib2 {
    public void doAlsoImportantStuff() {
        new ConflictedLib().doStuff("Lib2 called", "second param");
    }
}
