package org.linkedIn.course.chapter.abstraction;

import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        DigitsOnlyFileReader digitsOnlyFileReader = new DigitsOnlyFileReader("src/main/resources/message.txt");
        System.out.println(digitsOnlyFileReader.readFile());
        System.out.println(digitsOnlyFileReader.getPath());
    }
}
