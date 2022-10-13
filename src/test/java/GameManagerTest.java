import lotr.Character;
import lotr.Elf;
import lotr.GameManager;
import lotr.Hobbit;
import lotr.King;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameManagerTest {

    private GameManager game_manager;

    @BeforeEach
    public void init() {
        game_manager = new GameManager();
    }

    @Test
    public void testfight() {
        Character c1 = new Elf();
        Character c2 = new King();
        game_manager.fight(c1, c2);
        assertTrue(c1.isAlive() || c2.getHp()==0);
        System.out.println();


        Character c3 = new King();
        Character c4 = new Hobbit();
        game_manager.fight(c3, c4);
        assertTrue(c3.isAlive() || c4.getHp()==0);
    }

}
