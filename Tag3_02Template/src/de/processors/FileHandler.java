package de.processors;

public interface FileHandler {

    void init();
    void process(char c);

    void close();
}
