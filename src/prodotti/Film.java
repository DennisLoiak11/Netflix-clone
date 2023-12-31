package prodotti;

import actors.Attore;
import enums.Genere;

import java.util.Arrays;

public class Film extends Prodotto {

    private int durata;

    public Film(String titolo, int anno, Attore[] cast, Genere genere, boolean pg, boolean original, int durata) {
        super(titolo, anno, cast, genere, pg, original);
        this.durata = durata;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    @Override
    public String toString() {
        return "Film{" +
                "durata=" + durata +
                ", titolo='" + titolo + '\'' +
                ", anno=" + anno +
                '}';
    }
}
