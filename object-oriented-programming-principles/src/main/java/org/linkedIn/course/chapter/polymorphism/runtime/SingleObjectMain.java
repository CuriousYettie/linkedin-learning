package org.linkedIn.course.chapter.polymorphism.runtime;

import org.linkedIn.course.chapter.polymorphism.OddArrayList;

import java.util.ArrayList;
import java.util.Random;

public class SingleObjectMain
{
    public static void addRandomNumbers(ArrayList<Integer> list)
    {
        int originalSize = list.size();
        Random random = new Random();
        while (originalSize + 1 != list.size()) {
            int n = random.nextInt(1000);
            list.add(n);
        }
    }

    public static void main(String[] args)
    {
        OddArrayList oddListy = new OddArrayList(7);
        oddListy.add(1);
        oddListy.add(2);
        addRandomNumbers(oddListy);
        System.out.println(oddListy);

        ArrayList<Integer> listy = new ArrayList<>();
        listy.add(1);
        listy.add(2);
        addRandomNumbers(listy);
        System.out.println(listy);
    }
}
