package users;

import enums.TipoOfferta;

public class Account {

    // attributi
    private String email;
    private String password;
    private TipoOfferta tipoOfferta;
    private Utente[] utenti;

    public Account(String email, String password, TipoOfferta tipoOfferta) {
        this.email = email;
        this.password = password;
        this.tipoOfferta = tipoOfferta;
        this.utenti = new Utente[tipoOfferta.getnUtenti()];
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TipoOfferta getTipoOfferta() {
        return tipoOfferta;
    }

    public void setTipoOfferta(TipoOfferta tipoOfferta) {
        this.tipoOfferta = tipoOfferta;
    }

    public Utente[] getUtenti() {
        return utenti;
    }

    public void setUtenti(Utente[] utenti) {
        this.utenti = utenti;
    }

    public void addUser(Utente u) {
        boolean flag = false;
        for (int i = 0; i < utenti.length; i++) {
            if (utenti[i] == null) {
                utenti[i] = u;
                flag = true;
            }
        }
        if (!flag) System.out.println("ERRORE! Numero massimo di utenti raggiunto");
    }

    public void removeUser(Utente u) {
        boolean flag = false;
        for (int i = 0; i < utenti.length; i++) {
            if (utenti[i] == u) {
                utenti[i] = null;
                flag = true;
            }
        }
        if (!flag) System.out.println("L'utente da eliminare non è presente!");
    }

}
