import lotr.*;

import lotr.Character;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CharacterFactoryTest {
    private CharacterFactory factory;

    @BeforeEach
    public void init() {
        factory = new CharacterFactory();
    }

    @Test
    public void testToString() {
        factory.addCharacter(new Elf());
        factory.addCharacter(new Hobbit());
        assertEquals(factory.toString(), "CharacterFactory{characters=[Elf{hp=10, power=10}, Hobbit{hp=3, power=0}]}");
    }

    @Test
    public void testcreateCharacter() {
        factory.addCharacter(new Elf());
        factory.addCharacter(new Hobbit());
        factory.addCharacter(new Elf());
        assertTrue(factory.createCharacter() instanceof Character);

    }
}
