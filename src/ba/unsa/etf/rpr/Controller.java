package ba.unsa.etf.rpr;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller {
    public Button btnOne;
    public Button btnTwo;
    public Button btnThree;
    public Button btnFour;
    public Button btnFive;
    public Button btnSix;
    public Button btnSeven;
    public Button btnEight;
    public Button btnNine;
    public Button btnPercentage;
    public Button btnDivide;
    public Button btnMultiple;
    public Button btnZero;
    public Button btnDecimal;
    public Button btnEqual;
    public Button btnPlus;
    public Button btnMinus;
    public Label labelaDisplay;

    //Ovdje je potrebno napraviti jednostruko povezivanje.
    // Prvo dodajem SimpleStringProperty

    public SimpleStringProperty rezultat;

    // Drugo, kreiramo settere i getter.


    public String getRezultat() {
        return rezultat.get();
    }

    public SimpleStringProperty rezultatProperty() {
        return rezultat;
    }

    public void setRezultat(String rezultat) {
        this.rezultat.set(rezultat);
    }

    // Trece, treba ga popuniti u konstruktoru

    public Controller(){
        rezultat = new SimpleStringProperty("");
    }

    public void btnOneClick(ActionEvent actionEvent) {
    }

    public void btnTwoClick(ActionEvent actionEvent) {
    }

    public void btnThreeClick(ActionEvent actionEvent) {
    }

    public void btnFourClick(ActionEvent actionEvent) {
    }

    public void btnFiveClick(ActionEvent actionEvent) {
    }

    public void btnSixClick(ActionEvent actionEvent) {
    }

    public void btnSevenClick(ActionEvent actionEvent) {
    }

    public void btnEightClick(ActionEvent actionEvent) {
    }

    public void btnNineClick(ActionEvent actionEvent) {
    }

    public void btnPercentageClick(ActionEvent actionEvent) {
    }

    public void btnMultipleClick(ActionEvent actionEvent) {
    }

    public void btnZeroClick(ActionEvent actionEvent) {
    }

    public void btnDecimalClick(ActionEvent actionEvent) {
    }

    public void btnEqualClick(ActionEvent actionEvent) {
    }

    public void btnPlusClick(ActionEvent actionEvent) {
    }

    public void btnMinusClick(ActionEvent actionEvent) {
    }

    public void btnDivideClick(ActionEvent actionEvent) {
    }
}
