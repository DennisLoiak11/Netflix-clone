package users;

import prodotti.Film;
import prodotti.Prodotto;

public class Utente {

    //attributi
    private String nome;
    private String avatar;
    private boolean isKid;
    private String pin;
    private Account account;

    private Prodotto ListaPreferiti[];


    //costruttore


    public Utente(String nome, String avatar, boolean isKid, String pin, Account account) {
        this.nome = nome;
        this.avatar = avatar;
        this.isKid = isKid;
        this.pin = pin;
        this.account = account;
    }

    public Utente(String nome, String avatar, boolean isKid, String pin, Account account, Prodotto[] listaPreferiti) {
        this.nome = nome;
        this.avatar = avatar;
        this.isKid = isKid;
        this.pin = pin;
        this.account = account;
        ListaPreferiti = new Prodotto [10];
    }

    //getter e setter


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public boolean isKid() {
        return isKid;
    }

    public void setKid(boolean kid) {
        isKid = kid;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Prodotto[] getListaPreferiti() {
        return ListaPreferiti;
    }

    public void setListaPreferiti(Prodotto[] listaPreferiti) {
        ListaPreferiti = listaPreferiti;
    }

    //metodi
    public void AddInLista(Prodotto p){
        if (isPresentInLista(p)) throw new IllegalArgumentException("Prodotto già presente in lista");
        boolean flag = false;
        for(int i = 0; i < ListaPreferiti.length; i++){
            if (ListaPreferiti[i] == null) {
                ListaPreferiti[i] = p;
                System.out.println("sono nell'if");
                flag = true;
            }
        }
        if (!flag) throw new IllegalArgumentException("La tua lista è piena!");
    }

    public void RemoveFromLista(Prodotto p) {
        if (isPresentInLista(p)) {
            for (int i = 0; i < ListaPreferiti.length; i++) {
                if (ListaPreferiti[i] == p) {
                    ListaPreferiti[i] = null;
                }
            }
        }
        else throw new IllegalArgumentException("Il prodotto non è presente nella lista!");
    }
    private boolean isPresentInLista(Prodotto p) {
        for (int i = 0; i < ListaPreferiti.length; i++) {
            if (p.equals(ListaPreferiti[i])) {
                return true;
            }
        }
        return false;
    }
}





