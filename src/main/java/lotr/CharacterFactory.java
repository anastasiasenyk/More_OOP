package lotr;

import java.util.ArrayList;
import java.util.Random;

public class CharacterFactory {
    private ArrayList<Character> characters = new ArrayList<>();

    @Override
    public String toString() {
        return "CharacterFactory{" +
                "characters=" + characters +
                '}';
    }

    public void addCharacter(Character c){
        characters.add(c);
    }

    public Character createCharacter() {
        Random rn = new Random();
        return characters.get(rn.nextInt(characters.size()));
    }

}
