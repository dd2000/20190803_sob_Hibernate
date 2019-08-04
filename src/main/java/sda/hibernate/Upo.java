package sda.hibernate;


public class Upo {
    private String imieUpo = "";
    private String nazwiskoUpo = "";
    private String nrDowoduUpo = "";
    private String dataDodaniaUpo = "";

    public Upo(String imieUpo, String nazwiskoUpo, String nrDowoduUpo, String dataDodaniaUpo) {
        this.imieUpo = imieUpo;
        this.nazwiskoUpo = nazwiskoUpo;
        this.nrDowoduUpo = nrDowoduUpo;
        this.dataDodaniaUpo = dataDodaniaUpo;
    }

    public String getImieUpo() {
        return imieUpo;
    }

    public void setImieUpo(String imieUpo) {
        this.imieUpo = imieUpo;
    }

    public String getNazwiskoUpo() {
        return nazwiskoUpo;
    }

    public void setNazwiskoUpo(String nazwiskoUpo) {
        this.nazwiskoUpo = nazwiskoUpo;
    }

    public String getNrDowoduUpo() {
        return nrDowoduUpo;
    }

    public void setNrDowoduUpo(String nrDowoduUpo) {
        this.nrDowoduUpo = nrDowoduUpo;
    }

    public String getDataDodaniaUpo() {
        return dataDodaniaUpo;
    }

    public void setDataDodaniaUpo(String dataDodaniaUpo) {
        this.dataDodaniaUpo = dataDodaniaUpo;
    }
} // class Upo

