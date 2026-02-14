package org.linkedIn.course.chapter.polymorphism.compiletime;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Main
{
    public static void main(String[] args)
    {


        Predicate<Integer> isDivisibleByThree = n -> n % 3 == 0;
        ConditionArrayList divisibleByThreeListy = new ConditionArrayList(isDivisibleByThree);

        ConditionArrayList divisibleByThreeListy2 = new ConditionArrayList(isDivisibleByThree, 1, 2, 3, 4, 5, 6, 9);

        ArrayList<Integer> numsList = new ArrayList<>();
        numsList.add(1);
        numsList.add(4);
        numsList.add(3);
        numsList.add(6);
        numsList.add(13);

        /*
             // Comes up with "Cannot resolve constructor"
             // Because there is no constructor that takes in a list!!
             ConditionArrayList divisibleByThreeListy3 = new ConditionArrayList(isDivisibleByThree, numsList);
         */

        // ** BUT **
        /*
            To solve this issue, we can implement compile-time polymorphism, with method overloading.
            Add another constructor with the same name but give it a different set of parameters.
         */
        ConditionArrayList divisibleByThreeListy3 = new ConditionArrayList(isDivisibleByThree, numsList);

        // the error goes away because we used compile-time polymorphism to
        // initialize our ConditionArrayList in different ways :)

        Predicate<Integer> isDivisibleBySix = n -> n % 6 == 0;
        ConditionArrayList divisibleBySixListy = new ConditionArrayList(isDivisibleBySix, numsList);
    }
}
