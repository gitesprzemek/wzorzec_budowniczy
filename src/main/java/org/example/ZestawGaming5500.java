package org.example;

import java.sql.SQLException;

public class ZestawGaming5500 extends BudowniczyZestawu{
    BazaKomputer baza;

    @Override
    public void dodajProcka(){
        try {
            baza = new BazaKomputer();
            baza.usunprocesor("Intel Core i5-10400F");
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
            baza.usunchipset("B460");
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
            baza.usunkarte("RTX 2060");
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
            baza.usunram("8 GB");
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
            baza.usundysk("960 GB");
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
            baza.usunchlodzenie("Fera 5");
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
            baza.usunobudowe("G4M3R 500");
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
            baza.add("Intel Core i5-10400F","B460","RTX 2060","16 GB","960 GB","Fera 5","G4M3R 500");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
