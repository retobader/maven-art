package de.art.maven.examples.conflict.lib1;

import de.art.maven.examples.conflict.lib.ConflictedLib;

public class Lib1 {
    public void doImportantStuff() {
        new ConflictedLib().doStuff("Lib1 called");
    }
}
