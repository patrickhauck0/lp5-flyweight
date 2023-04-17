package flyweight;

import java.util.HashMap;
import java.util.Map;

public class CaracteristicaFactory {
    private static Map<String, Caracteristica> caracteristicas = new HashMap<>();

    public static Caracteristica getCaracteristica(String level, String guilda) {
        Caracteristica caracteristica = caracteristicas.get(level);
        if (caracteristica == null) {
            caracteristica = new Caracteristica(level, guilda);
            caracteristicas.put(level, caracteristica);
        }
        return caracteristica;
    }

    public static int getTotalLevel() {
        return caracteristicas.size();
    }
}
