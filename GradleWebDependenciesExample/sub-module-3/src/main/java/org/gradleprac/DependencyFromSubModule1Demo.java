package org.gradleprac;
// this dependency is being pulled from project - sub-module-1, and available in sub-module-3
// only because of plugin - 'java-library' and 'api' configuration which allows transitive dependency to be available
// in the sub-project which uses the other project as dependency from which dependency is to be pulled
import org.apache.commons.math3.random.RandomDataImpl;

public class DependencyFromSubModule1Demo {
    public static void main(String[] args) {
        RandomDataImpl randomData = new RandomDataImpl();
        System.out.println(randomData.nextInt(3, 100));
    }
}
