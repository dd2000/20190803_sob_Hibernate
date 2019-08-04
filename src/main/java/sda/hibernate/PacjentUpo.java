package sda.hibernate;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

public class PacjentUpo {
    @Embedded
    private long id;
    private String imie;
    private String nazwisko;
    private String pesel;
    private Upo upo1;
    private Upo upo2;
    private Upo upo3;

    // konstruktor
    public PacjentUpo(long id, String imie, String nazwisko, String pesel) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.upo1 = null;
        this.upo2 = null;
        this.upo3 = null;
    }  // konstruktor

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Upo getUpo1() {
        return upo1;
    }

    public void setUpo1(Upo upo1) {
        this.upo1 = upo1;
    }

    public Upo getUpo2() {
        return upo2;
    }

    public void setUpo2(Upo upo2) {
        this.upo2 = upo2;
    }

    public Upo getUpo3() {
        return upo3;
    }

    public void setUpo3(Upo upo3) {
        this.upo3 = upo3;
    }
}
