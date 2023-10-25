package de.processors;

import java.io.FileWriter;
import java.io.IOException;

public class FileCopyProcessor extends AbstractFileHandler{

    private FileWriter writer;
    @Override
    public void process(final char c) {
        try {
            writer.write(c);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void init() {
        try {
            writer = new FileWriter("ausgabe.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void close() {
        try {
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
