package flyweight;

public class Caracteristica {
    private String level;
    private String guilda;

    public Caracteristica(String level, String guilda) {
        this.level = level;
        this.guilda = guilda;
    }

    public String getLevel() {
        return level;
    }

    public String getGuilda() {
        return guilda;
    }
}
