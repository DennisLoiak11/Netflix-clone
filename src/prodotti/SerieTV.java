package prodotti;

import actors.Attore;
import enums.Genere;

public class SerieTV extends Prodotto {

    private int numeroStagioni;
    private int episodiPerStagione;

    public SerieTV(String titolo, int anno, Attore[] cast, Genere genere, boolean pg, boolean original,
                   int numeroStagioni, int episodiPerStagione) {
        super(titolo, anno, cast, genere, pg, original);
        this.numeroStagioni = numeroStagioni;
        this.episodiPerStagione = episodiPerStagione;
    }
}
