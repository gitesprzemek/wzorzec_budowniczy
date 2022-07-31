package org.example;

public class Zestaw {
    private int id_zestawu;
    private String nazwa_procka;
    private String chipset;
    private String karta_graficzna;
    private String ram;
    private String dysk;
    private String chlodzenie;
    private String obudowa;
    private String wyslane;

    public Zestaw() {}

    public Zestaw(int id_zestawu, String nazwa_procka, String chipset, String karta_graficzna, String ram, String dysk, String chlodzenie, String obudowa, String wyslane) {
        this.id_zestawu = id_zestawu;
        this.nazwa_procka = nazwa_procka;
        this.chipset = chipset;
        this.karta_graficzna = karta_graficzna;
        this.ram = ram;
        this.dysk = dysk;
        this.chlodzenie = chlodzenie;
        this.obudowa = obudowa;
        this.wyslane = wyslane;
    }

    public int getId_zestawu() {
        return id_zestawu;
    }

    public void setId_zestawu(int id_zestawu) {
        this.id_zestawu = id_zestawu;
    }

    public String getNazwa_procka() {
        return nazwa_procka;
    }

    public void setNazwa_procka(String nazwa_procka) {
        this.nazwa_procka = nazwa_procka;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getKarta_graficzna() {
        return karta_graficzna;
    }

    public void setKarta_graficzna(String karta_graficzna) {
        this.karta_graficzna = karta_graficzna;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getDysk() {
        return dysk;
    }

    public void setDysk(String dysk) {
        this.dysk = dysk;
    }

    public String getChlodzenie() {
        return chlodzenie;
    }

    public void setChlodzenie(String chlodzenie) {
        this.chlodzenie = chlodzenie;
    }

    public String getObudowa() {
        return obudowa;
    }

    public void setObudowa(String obudowa) {
        this.obudowa = obudowa;
    }

    public String getWyslane() {
        return wyslane;
    }

    public void setWyslane(String wyslane) {
        this.wyslane = wyslane;
    }

    @Override
    public String toString() {
        return "Komputer{" +
                "id_zestawu=" + id_zestawu +
                ", nazwa_procka='" + nazwa_procka + '\'' +
                ", chipset='" + chipset + '\'' +
                ", karta_graficzna='" + karta_graficzna + '\'' +
                ", ram='" + ram + '\'' +
                ", dysk='" + dysk + '\'' +
                ", chlodzenie='" + chlodzenie + '\'' +
                ", obudowa='" + obudowa + '\'' +
                ", wyslane='" + wyslane + '\'' +
                '}';
    }
}
