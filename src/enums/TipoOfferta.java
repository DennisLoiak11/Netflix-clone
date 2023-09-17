package enums;

public enum TipoOfferta {

    BASIC(1, 7.99), STANDARD(2, 11.99), PLUS(3, 15.99), PREMIUM(4, 19.99);

    private int nUtenti;
    private double prezzo;

    TipoOfferta(int nUtenti, double prezzo) {
        this.nUtenti = nUtenti;
        this.prezzo = prezzo;
    }

    public int getnUtenti() {
        return nUtenti;
    }

    public double getPrezzo() {
        return prezzo;
    }
}
