package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Personagem> personagens = new ArrayList<>();

    public void criar(String nomePersonagem, String level, String nomeGuilda) {
        Caracteristica caracteristica = CaracteristicaFactory.getCaracteristica(level, nomeGuilda);
        Personagem personagem = new Personagem(nomePersonagem, caracteristica);
        personagens.add(personagem);
    }

    public List<String> obterPersonagens() {
        List<String> saida = new ArrayList<String>();
        for(Personagem personagem : this.personagens) {
            saida.add(personagem.obterPersonagem());
        }
        return saida;
    }
}
