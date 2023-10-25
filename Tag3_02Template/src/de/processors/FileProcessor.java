package de.processors;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileProcessor {


    private List<FileHandler> handlers = new ArrayList<>();

    public void addFileHandler(FileHandler handler) {
        handlers.add(handler);
    }

    public void removeFileHandler(FileHandler handler) {
        handlers.remove(handler);
    }
    // C:\Users\JoachimWagner\git\gothaer\gothaer-design-pattern-oktober-2023\Tag3_02Template\src\setupact.log
    public final void run(String filename){
        try (FileReader reader = new FileReader(filename)){
            init();
            int c;
            while((c = reader.read()) != -1)
                process((char) c);

            close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void init() {
        handlers.forEach(FileHandler::init);
    }
    private void process(char c){
        handlers.forEach(h->h.process(c));
    }

    private void close() {
        handlers.forEach(FileHandler::close);
    }

}
