package com.company;

import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author - SV
 */
public class Main {
    /**
     * @param args -стандартный аргумент
     */
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("Метод add");
        System.out.println("Количество элементов - 1000000");
        System.out.println("тест метода add  arrayList " + TestTime.testAdd(arrayList));
        System.out.println("тест метода add  linkedList " + TestTime.testAdd(linkedList));

        if ((TestTime.testAdd(arrayList)) <= (TestTime.testAdd(linkedList)))
            System.out.println("ArrayList быстрее");
        else System.out.println(("LinkedList быстрее"));

        //замечу, что для большего количества итераций видно, что ArrayList быстрее, чем LinkedList, и это будет верно. Но для такого количества итераций очень долго прогружаются Get и Delete, всвязи с чем оставил такое//

        System.out.println("Метод get");
        System.out.println("Количество элементов - 1000000");
        System.out.println("тест метода get linkedList " + TestTime.testGet(linkedList));
        System.out.println("тест метода get arrayList " + TestTime.testGet(arrayList));

        if ((TestTime.testGet(arrayList)) <= (TestTime.testGet(linkedList)))
            System.out.println("ArrayList быстрее");
        else System.out.println(("LinkedList быстрее"));


        System.out.println("Метод delete");
        System.out.println("Количество элементов - 1000000");
        System.out.println("тест метода delete linkedList " + TestTime.testDelete(linkedList));
        System.out.println("тест метода delete arrayList " + TestTime.testDelete(arrayList));

        if ((TestTime.testDelete(arrayList)) <= (TestTime.testDelete(linkedList)))
            System.out.println("ArrayList быстрее");
        else System.out.println(("LinkedList быстрее"));


    }
}
