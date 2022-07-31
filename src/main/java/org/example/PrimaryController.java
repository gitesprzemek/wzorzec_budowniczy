package org.example;

import javafx.fxml.FXML;

import java.sql.SQLException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;

public class PrimaryController {

    BazaKomputer baza;

    private ObservableList<Zestaw> lista = FXCollections.observableArrayList();

    @FXML
    private TableView<Zestaw> tableView;

    @FXML
    private void initialize() throws SQLException, ClassNotFoundException {
        baza = new BazaKomputer();
       lista = baza.wypiszWszystko();
        tableView.setItems(lista);
    }

    @FXML
    private void zestaw5500() throws SQLException, ClassNotFoundException {
          BudowniczyZestawu zestawza5500 = new ZestawGaming5500();
          Kierownik kierownik = new Kierownik();
          kierownik.setBudowniczyzestawu(zestawza5500);
          kierownik.budujzestaw();
          baza = new BazaKomputer();
          lista = baza.wypiszWszystko();
          tableView.setItems(lista);
    }

    @FXML
    private void zestaw7950() throws SQLException, ClassNotFoundException {
        BudowniczyZestawu zestawza7950 = new ZestawGaming7950();
        Kierownik kierownik = new Kierownik();
        kierownik.setBudowniczyzestawu(zestawza7950);
        kierownik.budujzestaw();
        baza = new BazaKomputer();
        lista = baza.wypiszWszystko();
        tableView.setItems(lista);
    }

    @FXML
    private void zestaw11200() throws SQLException, ClassNotFoundException {
        BudowniczyZestawu zestawza11200 = new ZestawGaming11200();
        Kierownik kierownik = new Kierownik();
        kierownik.setBudowniczyzestawu(zestawza11200);
        kierownik.budujzestaw();
        baza = new BazaKomputer();
        lista = baza.wypiszWszystko();
        tableView.setItems(lista);
    }

    @FXML
    private void zestaw18100() throws SQLException, ClassNotFoundException {
        BudowniczyZestawu zestawza11200 = new ZestawGaming18100();
        Kierownik kierownik = new Kierownik();
        kierownik.setBudowniczyzestawu(zestawza11200);
        kierownik.budujzestaw();
        baza = new BazaKomputer();
        lista = baza.wypiszWszystko();
        tableView.setItems(lista);
    }

    @FXML
    private void usunwyslane() throws SQLException, ClassNotFoundException {
        baza = new BazaKomputer();
        baza.usunwyslane();
        lista = baza.wypiszWszystko();
        tableView.setItems(lista);
    }
    @FXML
    private void oznacz() throws SQLException, ClassNotFoundException {
        Zestaw zestaw = tableView.getSelectionModel().getSelectedItem();
        int id_z = zestaw.getId_zestawu();
        String text = zestaw.getWyslane();
        if(text.equals("tak"))
        {
            baza = new BazaKomputer();
            baza.update_zap(id_z,"nie");
            lista = baza.wypiszWszystko();
            tableView.setItems(lista);

        }
        else
        {
            baza = new BazaKomputer();
            baza.update_zap(id_z,"tak");
            lista = baza.wypiszWszystko();
            tableView.setItems(lista);
        }
    }



}
