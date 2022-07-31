package org.example;

public class Kierownik {

    private BudowniczyZestawu budowniczyzestawu;

    public void setBudowniczyzestawu (BudowniczyZestawu budowniczyzestawu)
    {
        this.budowniczyzestawu = budowniczyzestawu;
    }

    public void budujzestaw() {
        budowniczyzestawu.dodajProcka();
        budowniczyzestawu.dodajChipset();
        budowniczyzestawu.dodajKarta();
        budowniczyzestawu.dodajRam();
        budowniczyzestawu.dodajDysk();
        budowniczyzestawu.dodajChlodzenie();
        budowniczyzestawu.dodajObudowa();
        budowniczyzestawu.dodajZestaw();
    }


}
