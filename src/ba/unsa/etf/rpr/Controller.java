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

    boolean plus = false;
    boolean minus = false;
    boolean puta = false;
    boolean podjeljeno = false;
    boolean postotak = false;

    double prviBroj, drugiBroj, rezBroj;
    String rezBrojString;

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

    private String prvi = "";
    private String drugi = "";

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
        rezultat = new SimpleStringProperty("0");
    }

    void odabraniBroj(int broj){
        if(rezultat.get().equals("0") && rezultat.get().length() == 1){
           if(broj == 0) rezultat.set(btnZero.getText());
           else if(broj == 1) rezultat.set(btnOne.getText());
           else if(broj == 2) rezultat.set(btnTwo.getText());
           else if(broj == 3) rezultat.set(btnThree.getText());
           else if(broj == 4) rezultat.set(btnFour.getText());
           else if(broj == 5) rezultat.set(btnFive.getText());
           else if(broj == 6) rezultat.set(btnSix.getText());
           else if(broj == 7) rezultat.set(btnSeven.getText());
           else if(broj == 8) rezultat.set(btnEight.getText());
           else if(broj == 9) rezultat.set(btnNine.getText());
        }
        else{
            if(broj == 0) rezultat.set(rezultat.get() + btnZero.getText());
            else if(broj == 1) rezultat.set(rezultat.get() + btnOne.getText());
            else if(broj == 2) rezultat.set(rezultat.get() + btnTwo.getText());
            else if(broj == 3) rezultat.set(rezultat.get() + btnThree.getText());
            else if(broj == 4) rezultat.set(rezultat.get() + btnFour.getText());
            else if(broj == 5) rezultat.set(rezultat.get() + btnFive.getText());
            else if(broj == 6) rezultat.set(rezultat.get() + btnSix.getText());
            else if(broj == 7) rezultat.set(rezultat.get() + btnSeven.getText());
            else if(broj == 8) rezultat.set(rezultat.get() + btnEight.getText());
            else if(broj == 9) rezultat.set(rezultat.get() + btnNine.getText());
        }

    }

    public void btnOneClick(ActionEvent actionEvent) {
        odabraniBroj(1);
    }

    public void btnTwoClick(ActionEvent actionEvent) {
        odabraniBroj(2);
    }

    public void btnThreeClick(ActionEvent actionEvent) {
        odabraniBroj(3);
    }

    public void btnFourClick(ActionEvent actionEvent) {
        odabraniBroj(4);
    }

    public void btnFiveClick(ActionEvent actionEvent) {
        odabraniBroj(5);
    }

    public void btnSixClick(ActionEvent actionEvent) {
        odabraniBroj(6);
    }

    public void btnSevenClick(ActionEvent actionEvent) {
        odabraniBroj(7);
    }

    public void btnEightClick(ActionEvent actionEvent) {
        odabraniBroj(8);
    }

    public void btnNineClick(ActionEvent actionEvent) {
        odabraniBroj(9);
    }

    public void btnPercentageClick(ActionEvent actionEvent) {
        postotak = true;
    }

    public void btnZeroClick(ActionEvent actionEvent) {
        odabraniBroj(0);
    }

    public void btnDecimalClick(ActionEvent actionEvent) {
        rezultat.set(rezultat.get() + ".");
    }

    public void btnEqualClick(ActionEvent actionEvent) {
        drugi = rezultat.get();

        prviBroj =  Double.parseDouble(prvi);
        drugiBroj = Double.parseDouble(drugi);

        if(postotak == true)
        {
            drugiBroj = prviBroj * (drugiBroj/100);
            postotak = false;
        }

        if(plus == true){
            rezBroj = prviBroj + drugiBroj;
            plus = false;
        }

        if(minus == true){
            rezBroj = prviBroj - drugiBroj;
            minus = false;
        }

        if(puta == true){
            rezBroj = prviBroj * drugiBroj;
            puta = false;
        }

        if(podjeljeno == true){
            if(drugiBroj != 0){
                rezBroj = prviBroj / drugiBroj;
                podjeljeno = false;
            }
            else {
                System.out.println("Zabranjeno je dijeliti sa nulom");
            }
        }

        if(postotak == true){

        }

        rezBrojString = Double.toString(rezBroj);
        rezultat.set(rezBrojString);
    }

    public void btnPlusClick(ActionEvent actionEvent) {
        prvi = rezultat.get();
        rezultat.set("");
        plus = true;
    }

    public void btnMinusClick(ActionEvent actionEvent) {
        prvi = rezultat.get();
        rezultat.set("");
        minus = true;
    }

    public void btnDivideClick(ActionEvent actionEvent) {
        prvi = rezultat.get();
        rezultat.set("");
        podjeljeno = true;
    }

    public void btnMultipleClick(ActionEvent actionEvent) {
        prvi = rezultat.get();
        rezultat.set("");
        puta = true;
    }
}
