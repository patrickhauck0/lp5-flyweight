package flyweight;

public class Personagem {
    private String nome;
    private Caracteristica caracteristicaLevel;

    public Personagem(String nome, Caracteristica caracteristicaLevel) {
        this.nome = nome;
        this.caracteristicaLevel = caracteristicaLevel;
    }

    public String obterPersonagem() {
        return "Personagem{" +
                "nome='" + this.nome + '\'' +
                ", level='" + caracteristicaLevel.getLevel() + '\'' +
                ", guilda='" + caracteristicaLevel.getGuilda() + '\'' +
                '}';
    }
}
