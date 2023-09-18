package main;

import actors.Attore;
import enums.Genere;
import enums.TipoOfferta;
import prodotti.Film;
import users.Account;
import users.Utente;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Account a = new Account("ciccobello@ciccio.com", "CicciobelloBua123", TipoOfferta.BASIC);
        Utente u = new Utente("Ciccio", "Batman", false, "1234ABC", a);
        Film film = new Film("Batman", 2012, new Attore[7], Genere.FANTASY, false, false, 120);

        u.AddInLista(film);
        System.out.println(Arrays.toString(u.getListaPreferiti()));
    }
}
