package de.art.maven.examples.conflict.transitive;

public class ConflictedLib {
    public void doStuff(String param1) {
        System.out.println("Print: " + param1);
    }

//    public void doStuff(String param1, String param2) {
//        System.out.println("Print: " + param1 + " " + param2);
//    }
}
