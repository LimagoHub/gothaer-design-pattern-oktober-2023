package de.processors;

public class CharacterCounter extends AbstractCounter{


    @Override
    public void process(final char c) {
        counter++;
    }


}
