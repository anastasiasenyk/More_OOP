import lotr.Elf;
import lotr.GameManager;
import lotr.Hobbit;
import lotr.King;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameManagerTest {

    private GameManager game_manager;

    @BeforeEach
    public void init() {
        game_manager = new GameManager();
    }

    @Test
    public void testfight() {
        game_manager.fight(new Elf(), new King());
        System.out.println();
        game_manager.fight(new King(), new Elf());
        System.out.println();
        game_manager.fight(new King(), new Hobbit());
    }

}
