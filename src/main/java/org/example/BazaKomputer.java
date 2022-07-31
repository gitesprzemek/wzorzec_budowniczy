package org.example;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;

public class BazaKomputer {

    int id_zestawu;

    private final Connection connection;
    ObservableList<Zestaw> list = FXCollections.observableArrayList();

    public BazaKomputer() throws ClassNotFoundException, SQLException{
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/zestawy","postgres","OBsydjan1#");
    }

    public void add(String nazwa_procka, String chipset, String karta_graficzna, String ram, String dysk,String chlodzenie, String obudowa) throws SQLException {
        Statement stmt = connection.createStatement();
        String sql = "INSERT INTO zestaw (nazwa_procka,chipset,karta_graficzna,ram,dysk,chlodzenie,obudowa)" + " VALUES ('" + nazwa_procka + "','" + chipset + "','" + karta_graficzna  + "','" + ram  +"','" + dysk  +"','" + chlodzenie + "','" + obudowa +"');";
        stmt.executeUpdate(sql);
        stmt.close();
    }

    public void usunprocesor(String name) throws SQLException {
        int ilosc;
        Statement stmt = connection.createStatement();
        ResultSet result = stmt.executeQuery("SELECT ilosc FROM procesory WHERE nazwa_procka = '"+ name +"';");
        result.next();
        ilosc = result.getInt("ilosc");
        ilosc = ilosc-1;
        stmt.executeUpdate("UPDATE procesory SET ilosc="+ ilosc + " WHERE nazwa_procka='"+ name +"';" );
        stmt.close();
    }

    public void usunchipset(String name) throws SQLException {
        int ilosc;
        Statement stmt = connection.createStatement();
        ResultSet result = stmt.executeQuery("SELECT ilosc FROM plyta_glowna WHERE chipset = '"+ name +"';");
        result.next();
        ilosc = result.getInt("ilosc");
        ilosc = ilosc-1;
        stmt.executeUpdate("UPDATE plyta_glowna SET ilosc="+ ilosc + " WHERE chipset='"+ name +"';" );
        stmt.close();
    }

    public void usunram(String name) throws SQLException {
        int ilosc;
        Statement stmt = connection.createStatement();
        ResultSet result = stmt.executeQuery("SELECT ilosc FROM ram WHERE wielkosc = '"+ name +"';");
        result.next();
        ilosc = result.getInt("ilosc");
        ilosc = ilosc-2;
        stmt.executeUpdate("UPDATE ram SET ilosc="+ ilosc + " WHERE wielkosc='"+ name +"';" );
        stmt.close();
    }

    public void usundysk(String name) throws SQLException {
        int ilosc;
        Statement stmt = connection.createStatement();
        ResultSet result = stmt.executeQuery("SELECT ilosc FROM dyski WHERE wielkosc = '"+ name +"';");
        result.next();
        ilosc = result.getInt("ilosc");
        ilosc = ilosc-1;
        stmt.executeUpdate("UPDATE dyski SET ilosc="+ ilosc + " WHERE wielkosc='"+ name +"';" );
        stmt.close();
    }

    public void usunchlodzenie(String name) throws SQLException {
        int ilosc;
        Statement stmt = connection.createStatement();
        ResultSet result = stmt.executeQuery("SELECT ilosc FROM chlodzenie WHERE nazwa_chlodzenia = '"+ name +"';");
        result.next();
        ilosc = result.getInt("ilosc");
        ilosc = ilosc-1;
        stmt.executeUpdate("UPDATE chlodzenie SET ilosc="+ ilosc + " WHERE nazwa_chlodzenia='"+ name +"';" );
        stmt.close();
    }

    public void usunkarte(String name) throws SQLException {
        int ilosc;
        Statement stmt = connection.createStatement();
        ResultSet result = stmt.executeQuery("SELECT ilosc FROM karty_graficzne WHERE nazwa_karty = '"+ name +"';");
        result.next();
        ilosc = result.getInt("ilosc");
        ilosc = ilosc-1;
        stmt.executeUpdate("UPDATE karty_graficzne SET ilosc="+ ilosc + " WHERE nazwa_karty='"+ name +"';" );
        stmt.close();
    }

    public void usunobudowe(String name) throws SQLException {
        int ilosc;
        Statement stmt = connection.createStatement();
        ResultSet result = stmt.executeQuery("SELECT ilosc FROM obudowy WHERE nazwa_obudowy = '"+ name +"';");
        result.next();
        ilosc = result.getInt("ilosc");
        ilosc = ilosc-1;
        stmt.executeUpdate("UPDATE obudowy SET ilosc="+ ilosc + " WHERE nazwa_obudowy='"+ name +"';" );
        stmt.close();
    }

    public void update_zap(int id,String text) throws SQLException {

        Statement stmt = connection.createStatement();
        stmt.executeUpdate("UPDATE zestaw SET wyslane='"+ text + "' where id_zestawu=" + id +";");
        stmt.close();
    }

    public void usunwyslane() throws SQLException {
        Statement stmt = connection.createStatement();
        stmt.executeUpdate("DELETE FROM zestaw WHERE wyslane='tak';" );
        stmt.close();
    }


    public ObservableList<Zestaw> wypiszWszystko() throws SQLException
    {
        Statement stmt = connection.createStatement();
        ResultSet result = stmt.executeQuery("SELECT * FROM Zestaw ORDER BY id_zestawu ASC;");
        while (result.next()) {

            id_zestawu = result.getInt("id_zestawu");
            String nazwa_procka = result.getString("nazwa_procka");
            String chipset = result.getString("chipset");
            String karta_graficzna = result.getString("karta_graficzna");
            String ram = result.getString("ram");
            String dysk = result.getString("dysk");
            String chlodzenie = result.getString("chlodzenie");
            String obudowa = result.getString("obudowa");
            String wyslane = result.getString("wyslane");
            Zestaw zestaw = new Zestaw(id_zestawu, nazwa_procka, chipset, karta_graficzna, ram, dysk, chlodzenie, obudowa, wyslane);
            list.add(zestaw);

        }
        return list;
    }

}
