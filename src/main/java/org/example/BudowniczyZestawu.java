package org.example;

import java.sql.SQLException;

public abstract class BudowniczyZestawu {
    public Zestaw getZestaw()
    {
        return zestaw;
    }
    private Zestaw zestaw =null;

    public void nowyzestaw()
    {
        zestaw = new Zestaw();
    }

    public abstract void dodajProcka();
    public abstract void dodajChipset();
    public abstract void dodajKarta();
    public abstract void dodajRam();
    public abstract void dodajDysk();
    public abstract void dodajChlodzenie();
    public abstract void dodajObudowa();
    public abstract void dodajZestaw();
}
