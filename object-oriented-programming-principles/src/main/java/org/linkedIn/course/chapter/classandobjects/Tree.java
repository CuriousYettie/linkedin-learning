package org.linkedIn.course.chapter.classandobjects;

import java.awt.Color;

//Class is the blueprint for an object containing attributes and behaviors
public class Tree
{
    // Attributes
    double heightFt;
    double trunkDiameterInches;
    TreeType treeType;
    static Color TRUNK_COLOR = new Color(102, 51, 0);

    // Constructor - a special type of function that is called when an object is created
    Tree(double heightFt, double trunkDiameterInches, TreeType treeType)
    {
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }

    // Behaviors
    void grow()
    {
        this.heightFt = this.heightFt + 10;
        this.trunkDiameterInches = this.trunkDiameterInches + 1;
    }

    // static members - is part of a class that is accessible through the class and belongs to the that class.
    // * It should be an attribute or behavior that's not based on a particular instance,
    // * But rather belongs to all the instances of that class.
    static void announceTree()
    {
        System.out.println("Look out for that " + TRUNK_COLOR + " tree!");
    }

    // non-static members - is a part of a class that is accessible with an instance and belongs to that instance.
    // * Means you'll need to create an instance in order to access/use a non-static member.
    void announceTallTree()
    {
        if (this.heightFt > 100) {
            System.out.println("That's a tall " + this.treeType + " tree!");
        }
    }
}
