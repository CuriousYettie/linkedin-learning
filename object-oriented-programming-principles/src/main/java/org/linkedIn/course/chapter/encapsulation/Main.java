package org.linkedIn.course.chapter.encapsulation;

import org.linkedIn.course.chapter.classandobjects.TreeType;

public class Main
{
    public static void main(String[] args)
    {
        Tree myFavouriteMaple = new Tree(120, 5, TreeType.MAPLE);

        System.out.println(myFavouriteMaple.getTreeType());
        System.out.println(myFavouriteMaple.getHeightFt());
        System.out.println(myFavouriteMaple.getTrunkDiameterInches());

        myFavouriteMaple.grow();
    }
}
