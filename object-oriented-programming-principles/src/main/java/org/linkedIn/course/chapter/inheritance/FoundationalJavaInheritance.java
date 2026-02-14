package org.linkedIn.course.chapter.inheritance;

import java.util.Stack;

public class FoundationalJavaInheritance
{
    public static void main(String[] args)
    {
        // Data structure
        Stack<Character> charStack = new Stack<>();

        // push items onto the stack, Last In First Out
        charStack.push('c');
        charStack.push('a');
        charStack.push('t');

        // pop removed items from the stack, in reverse order, Last In First Out
        System.out.println(charStack.pop());
        System.out.println(charStack.pop());
        System.out.println(charStack.pop());
    }
}
