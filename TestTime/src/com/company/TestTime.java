package com.company;

import java.util.Collection;
import java.util.List;

/**
 * @author - SV
 */

public class TestTime {
    /**
     * количество повторений
     */
    public static int ITERATIONS = 100000;

    /**
     *
     * @param collection исследуемая структура
     * @return - время
     */
    public static long testAdd(Collection<Integer> collection) {
        long startTime = System.nanoTime();

        for (int i = 0; i < ITERATIONS; i++) {
            collection.add(i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;

    }

    /**
     *
     * @param collection исследуемая структура
     * @return - время
     */
    public static long testGet(List<Integer> collection) {
        long startTime = System.nanoTime();

        for (int i = 0; i < ITERATIONS; i++) {
            collection.get(i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;

    }
    /**
     *
     * @param collection исследуемая структура
     * @return - время
     */
    public static long testDelete(List<Integer> collection) {


        long startTime = System.nanoTime();

        if (ITERATIONS > 1) {
            collection.subList(1, ITERATIONS).clear();
        }
        long endTime = System.nanoTime();
        return endTime - startTime;

    }
}
