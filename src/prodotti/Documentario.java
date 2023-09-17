package prodotti;

import actors.Attore;
import enums.Genere;
import enums.GenereDocumentario;

public class Documentario extends Prodotto {

    private GenereDocumentario genereDocumentario;

    public Documentario(String titolo, int anno, Attore[] cast, Genere genere, boolean pg, boolean original,
                        GenereDocumentario genereDocumentario) {
        super(titolo, anno, cast, genere, pg, original);
        this.genereDocumentario = genereDocumentario;
    }

    public GenereDocumentario getGenereDocumentario() {
        return genereDocumentario;
    }

    public void setGenereDocumentario(GenereDocumentario genereDocumentario) {
        this.genereDocumentario = genereDocumentario;
    }
}
