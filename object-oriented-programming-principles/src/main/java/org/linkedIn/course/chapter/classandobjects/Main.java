package org.linkedIn.course.chapter.classandobjects;

public class Main
{
    public static void main(String[] args)
    {
        Tree myFavouriteOakTree = new Tree(120, 5, TreeType.OAK);
        Tree myFavouriteMaple = new Tree(90, 30, TreeType.MAPLE);

        myFavouriteOakTree.announceTallTree();
        myFavouriteMaple.announceTallTree();

        System.out.println(Tree.TRUNK_COLOR);
        Tree.announceTree();
    }
}
