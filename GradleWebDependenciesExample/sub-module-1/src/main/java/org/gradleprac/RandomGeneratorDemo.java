package org.gradleprac;

import org.apache.commons.math3.random.RandomDataImpl;

public class RandomGeneratorDemo {

    public static void main(String[] args) {
        RandomDataImpl randomData = new RandomDataImpl();
        System.out.println(randomData.nextInt(5, 10));
    }
}
