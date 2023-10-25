package main;

import de.processors.CharacterCounter;
import de.processors.FileProcessor;
import de.processors.FileCopyProcessor;
import de.processors.LineCounter;

public class Main {
    public static void main(String[] args) {

        FileProcessor processor = new FileProcessor();
        processor.addFileHandler(new CharacterCounter());
        processor.addFileHandler(new LineCounter());
        processor.run("C:\\Users\\JoachimWagner\\git\\gothaer\\gothaer-design-pattern-oktober-2023\\Tag3_02Template\\src\\setupact.log");
    }
}