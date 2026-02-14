package org.linkedIn.course.chapter.abstraction;

// this is concrete class, that extends abstract class
public class DigitsOnlyFileReader extends AbstractFileReader
{
    public DigitsOnlyFileReader(String filePath)
    {
        super(filePath);
    }

    @Override
    protected String parseLine(String line)
    {
        return line.replaceAll("[^0-9]","");
    }
}
