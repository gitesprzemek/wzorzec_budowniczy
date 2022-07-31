package org.example;

import java.sql.SQLException;

public class ZestawGaming18100 extends BudowniczyZestawu{
    BazaKomputer baza;

    @Override
    public void dodajProcka(){
        try {
            baza = new BazaKomputer();
            baza.usunprocesor("Intel Core i9-11900K");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public void dodajChipset(){
        try {
            baza = new BazaKomputer();
            baza.usunchipset("Z590");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public void dodajKarta(){
        try {
            baza = new BazaKomputer();
            baza.usunkarte("RTX 3080 Ti");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public void dodajRam(){
        try {
            baza = new BazaKomputer();
            baza.usunram("32 GB");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public void dodajDysk(){
        try {
            baza = new BazaKomputer();
            baza.usundysk("2000 GB");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public void dodajChlodzenie() {
        try {
            baza = new BazaKomputer();
            baza.usunchlodzenie("Dark Rock 4");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public void dodajObudowa() {
        try {
            baza = new BazaKomputer();
            baza.usunobudowe("G4M3R 600");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public void dodajZestaw() {
        try {
            baza = new BazaKomputer();
            baza.add("Intel Core i9-11900K","Z590","RTX 3080 Ti","64 GB","2000 GB","Dark Rock 4","G4M3R 600");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
