package sda.hibernate;

import sda.hibernate.entity.Uzytkownik;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] arg) {
        List<Uzytkownik> listaUzytkownikow = new ArrayList<Uzytkownik>();
        listaUzytkownikow.add(new Uzytkownik("user111","nazwisko111"));
        listaUzytkownikow.add(new Uzytkownik("user112","nazwisko112"));
        listaUzytkownikow.add(new Uzytkownik("user113","nazwisko113"));
        listaUzytkownikow.add(new Uzytkownik("user114","nazwisko114"));
        listaUzytkownikow.add(new Uzytkownik("user115","nazwisko115"));

        UzytkownikDAO uzytkownikDAO=new UzytkownikDAO();
        // wstawianie do bazy danych
        for(Uzytkownik dozapisu:listaUzytkownikow){
            uzytkownikDAO.insert(dozapisu);
        }

        // update nazwisko imie
        for(Uzytkownik dozapisu:listaUzytkownikow){
            dozapisu.setNazwisko(dozapisu.getImie()+" "+dozapisu.getNazwisko());
            uzytkownikDAO.update(dozapisu);
        }

        // pierwszy i ostatni z listy (dodanych) jest usuwany z bazy
        uzytkownikDAO.delete(listaUzytkownikow.get(0).getId());
        uzytkownikDAO.delete(listaUzytkownikow.get(4).getId());
    }
}
