package org.linkedIn.course.chapter.encapsulation;

import org.linkedIn.course.chapter.classandobjects.TreeType;

import java.awt.*;

//Encapsulation: Hiding implementation details and exposing only necessary information
public class Tree
{
    // Attributes
    protected static Color TRUNK_COLOR = new Color(102, 51, 0);

    private double heightFt;
    private double trunkDiameterInches;
    private TreeType treeType;

    // Constructor - a special type of function that is called when an object is created
    public Tree(double heightFt, double trunkDiameterInches, TreeType treeType)
    {
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }

    // accessible methods
    public double getHeightFt()
    {
        return heightFt;
    }

    public double getTrunkDiameterInches()
    {
        return trunkDiameterInches;
    }

    public void setTrunkDiameterInches(double trunkDiameterInches){
        this.trunkDiameterInches = trunkDiameterInches;
    }

    public TreeType getTreeType()
    {
        return treeType;
    }

    // Behaviors
    public void grow()
    {
        this.heightFt = this.heightFt + 10;
        this.trunkDiameterInches = this.trunkDiameterInches + 1;
    }

    public static void announceTree()
    {
        System.out.println("Look out for that " + TRUNK_COLOR + " tree!");
    }

    public void announceTallTree()
    {
        if (this.heightFt > 100) {
            System.out.println("That's a tall " + this.treeType + " tree!");
        }
    }
}
