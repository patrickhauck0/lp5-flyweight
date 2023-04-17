package flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void deveRetornarPersonagens() {
        Game game = new Game();

        game.criar("Joao", "10", "Lionhard");
        game.criar("Ricardo", "35", "Lionhard");
        game.criar("Clara", "27", "Lionhard");
        game.criar("Peter", "10", "Lionhard");

        List<String> saida = Arrays.asList(
                "Personagem{nome='Joao', level='10', guilda='Lionhard'}",
                "Personagem{nome='Ricardo', level='35', guilda='Lionhard'}",
                "Personagem{nome='Clara', level='27', guilda='Lionhard'}",
                "Personagem{nome='Peter', level='10', guilda='Lionhard'}");

        assertEquals(saida, game.obterPersonagens());
    }

    @Test
    void deveRetornarTotalLevel() {
        Game game = new Game();

        game.criar("Joao", "10", "Lionhard");
        game.criar("Ricardo", "35", "Lionhard");
        game.criar("Clara", "27", "Lionhard");
        game.criar("Peter", "10", "Lionhard");

        assertEquals(3, CaracteristicaFactory.getTotalLevel());
    }
}