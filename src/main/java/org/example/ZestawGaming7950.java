package org.example;

import java.sql.SQLException;

public class ZestawGaming7950 extends BudowniczyZestawu{
    BazaKomputer baza;

    @Override
    public void dodajProcka(){
        try {
            baza = new BazaKomputer();
            baza.usunprocesor("Intel Core i7-10700F");
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
            baza.usunchipset("Z490");
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
            baza.usunkarte("RTX 3060");
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
            baza.usunchlodzenie("Fera 5 Dual Fan");
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
            baza.add("Intel Core i7-10700F","Z490","RTX 3060","16 GB","960 GB","Fera 5 Dual Fan","G4M3R 500");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
