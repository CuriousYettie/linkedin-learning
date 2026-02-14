package org.linkedIn.course.chapter.abstraction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public abstract class AbstractFileReader
{
    // we use final keyword, because once it's set it will not change for the instance!
    private final Path filePath;

    protected AbstractFileReader(String filePath)
    {
        this.filePath = Path.of(filePath);
    }

    public Path getPath()
    {
        return filePath;
    }

    List<String> readFile() throws IOException
    {
        return Files.lines(filePath)
                .map(this::parseLine)
                .toList();
    }

    protected abstract String parseLine(String line);
}
