package flyweight;

import java.util.ArrayList;
import java.util.List;

public class AttributedCharacter {

    private static List<AttributedCharacter> charachters = new ArrayList<>();

    private final char c;
    private final boolean bold;

    public static AttributedCharacter getInstance(final char c, final boolean bold) {
        for(var character: charachters) {
            if( c == character.c && bold == character.bold)
                return character;
        }
        return new AttributedCharacter(c,bold);
    }

    private AttributedCharacter(final char c, final boolean bold) {
        this.c = c;
        this.bold = bold;
        charachters.add(this);
    }

    public char getC() {
        return c;
    }

    public boolean isBold() {
        return bold;
    }
}
