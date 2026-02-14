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

    static void announceTree()
    {
        System.out.println("Look out for that " + TRUNK_COLOR + " tree!");
    }

    void announceTallTree()
    {
        if (this.heightFt > 100) {
            System.out.println("That's a tall " + this.treeType + " tree!");
        }
    }
}
