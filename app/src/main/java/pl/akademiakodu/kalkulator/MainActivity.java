package pl.akademiakodu.kalkulator;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    Button buttonAdd, buttonSubstr, buttonMulti, buttonDivide, buttonResult, buttonClear, buttonDot;
    EditText text, textDzialanie;

    StringBuilder numberOne;
    StringBuilder numberTwo;
    String dzialanie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberOne = new StringBuilder();
        numberTwo = new StringBuilder();
        dzialanie = "";

        button0 = (Button) findViewById(R.id.button0);
        button0.setOnClickListener(this);
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);
        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(this);
        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(this);
        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(this);
        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(this);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonAdd.setOnClickListener(this);
        buttonSubstr = (Button) findViewById(R.id.buttonSubstr);
        buttonSubstr.setOnClickListener(this);
        buttonMulti = (Button) findViewById(R.id.buttonMulti);
        buttonMulti.setOnClickListener(this);
        buttonDivide = (Button) findViewById(R.id.buttonDivide);
        buttonDivide.setOnClickListener(this);
        buttonResult = (Button) findViewById(R.id.buttonResult);
        buttonResult.setOnClickListener(this);
        buttonClear = (Button) findViewById(R.id.buttonClear);
        buttonClear.setOnClickListener(this);
        buttonDot = (Button) findViewById(R.id.buttonDot);
        buttonDot.setOnClickListener(this);
        text = (EditText) findViewById(R.id.editText);
        textDzialanie = (EditText) findViewById(R.id.editTextDzialanie);
    }

    @Override
    public void onClick(View view) {
        if (dzialanie.equals("")) {
            if (view.getId() == button0.getId()) {
                if (numberOne.length()>7) textDzialanie.setText(numberOne);
                else{
                    if (!numberOne.toString().contains(".") && !numberOne.toString().isEmpty() && Double.valueOf(numberOne.toString())==0) textDzialanie.setText(numberOne);
                    else{
                        numberOne.append(0);
                        textDzialanie.setText(numberOne);
                    }
                }
            }
            if (view.getId() == button1.getId()) {
                if (numberOne.length()>7) textDzialanie.setText(numberOne);
                else {
                    if (!numberOne.toString().contains(".") && !numberOne.toString().isEmpty() && Double.valueOf(numberOne.toString())==0){
                        numberOne.delete(0, numberOne.length());
                        numberOne.append(1);
                    }
                    else numberOne.append(1);
//                for (int i=0; i<numberOne.length(); i++){
//                    if (numberOne.charAt(0)==0 & numberOne.length()>1)
//                }
                    textDzialanie.setText(numberOne);
                }
            }
            if (view.getId() == button2.getId()) {
                if (numberOne.length()>7) textDzialanie.setText(numberOne);
                else {
                    if (!numberOne.toString().contains(".") && !numberOne.toString().isEmpty() && Double.valueOf(numberOne.toString())==0){
                        numberOne.delete(0, numberOne.length());
                        numberOne.append(2);
                    }
                    else numberOne.append(2);
                    textDzialanie.setText(numberOne);
                }
            }
            if (view.getId() == button3.getId()) {
                if (numberOne.length()>7) textDzialanie.setText(numberOne);
                else {
                    if (!numberOne.toString().contains(".") && !numberOne.toString().isEmpty() && Double.valueOf(numberOne.toString())==0){
                        numberOne.delete(0, numberOne.length());
                        numberOne.append(3);
                    }
                    else numberOne.append(3);
                    textDzialanie.setText(numberOne);
                }
            }
            if (view.getId() == button4.getId()) {
                if (numberOne.length()>7) textDzialanie.setText(numberOne);
                else {
                    if (!numberOne.toString().contains(".") && !numberOne.toString().isEmpty() && Double.valueOf(numberOne.toString())==0){
                        numberOne.delete(0, numberOne.length());
                        numberOne.append(4);
                    }
                    else numberOne.append(4);
                    textDzialanie.setText(numberOne);
                }
            }
            if (view.getId() == button5.getId()) {
                if (numberOne.length()>7) textDzialanie.setText(numberOne);
                else {
                    if (!numberOne.toString().contains(".") && !numberOne.toString().isEmpty() && Double.valueOf(numberOne.toString())==0){
                        numberOne.delete(0, numberOne.length());
                        numberOne.append(5);
                    }
                    else numberOne.append(5);
                    textDzialanie.setText(numberOne);
                }
            }
            if (view.getId() == button6.getId()) {
                if (numberOne.length()>7) textDzialanie.setText(numberOne);
                else {
                    if (!numberOne.toString().contains(".") && !numberOne.toString().isEmpty() && Double.valueOf(numberOne.toString())==0){
                        numberOne.delete(0, numberOne.length());
                        numberOne.append(6);
                    }
                    else numberOne.append(6);
                    textDzialanie.setText(numberOne);
                }
            }
            if (view.getId() == button7.getId()) {
                if (numberOne.length()>7) textDzialanie.setText(numberOne);
                else {
                    if (!numberOne.toString().contains(".") && !numberOne.toString().isEmpty() && Double.valueOf(numberOne.toString())==0){
                        numberOne.delete(0, numberOne.length());
                        numberOne.append(7);
                    }
                    else numberOne.append(7);
                    textDzialanie.setText(numberOne);
                }
            }
            if (view.getId() == button8.getId()) {
                if (numberOne.length()>7) textDzialanie.setText(numberOne);
                else {
                    if (!numberOne.toString().contains(".") && !numberOne.toString().isEmpty() && Double.valueOf(numberOne.toString())==0){
                        numberOne.delete(0, numberOne.length());
                        numberOne.append(8);
                    }
                    else numberOne.append(8);
                    textDzialanie.setText(numberOne);
                }
            }
            if (view.getId() == button9.getId()) {
                if (numberOne.length()>7) textDzialanie.setText(numberOne);
                else {
                    if (!numberOne.toString().contains(".") && !numberOne.toString().isEmpty() && Double.valueOf(numberOne.toString())==0){
                        numberOne.delete(0, numberOne.length());
                        numberOne.append(9);
                    }
                    else numberOne.append(9);
                    textDzialanie.setText(numberOne);
                }
            }
            if (view.getId() == buttonDot.getId()) {
                if (numberOne.length()>7) textDzialanie.setText(numberOne);
                else {
                    if (numberOne.toString().contains(".")){
                        textDzialanie.setText(numberOne);
                    }
                    else{
                        if (numberOne.toString().isEmpty()) numberOne.append("0.");
                        else numberOne.append(".");
                        textDzialanie.setText(numberOne);
                    }
                }
            }

        }
        if (view.getId() == buttonAdd.getId()) {
            //TODO
         //   if (numberOne.toString().subSequence(numberOne.length(), numberOne.length())==".") numberOne.deleteCharAt(numberOne.length());
            if (!dzialanie.equals("") && !numberTwo.toString().isEmpty()){
                if (numberOne.toString().endsWith(".")) numberOne.deleteCharAt(numberOne.toString().lastIndexOf("."));
                double wynik = oblicz(numberOne, numberTwo);
                dzialanie = "+";
                textDzialanie.setText(String.valueOf(wynik) + " " + dzialanie);
                numberOne.append(String.valueOf(wynik));
            }
            else{
                if (numberOne.toString().endsWith(".")) numberOne.deleteCharAt(numberOne.toString().lastIndexOf("."));
                dzialanie = "+";
                if (numberOne.toString().isEmpty()) {
                    if (text.getText().toString().equals("")) numberOne.append(0);
                    else numberOne.append(text.getText());
                }
                textDzialanie.setText(numberOne + " " + dzialanie);
            }
        }
        if (view.getId() == buttonSubstr.getId()) {
            if (!dzialanie.equals("") && !numberTwo.toString().isEmpty()){
                if (numberOne.toString().endsWith(".")) numberOne.deleteCharAt(numberOne.toString().lastIndexOf("."));
                double wynik = oblicz(numberOne, numberTwo);
                dzialanie = "-";
                textDzialanie.setText(String.valueOf(wynik) + " " + dzialanie);
                numberOne.append(String.valueOf(wynik));
            }
            else {
                if (numberOne.toString().endsWith(".")) numberOne.deleteCharAt(numberOne.toString().lastIndexOf("."));
                dzialanie = "-";
                if (numberOne.toString().isEmpty()) {
                    if (text.getText().toString().equals("")) numberOne.append(0);
                    else numberOne.append(text.getText());
                }
                textDzialanie.setText(numberOne + " " + dzialanie);
            }
        }
        if (view.getId() == buttonMulti.getId()) {
            if (!dzialanie.equals("") && !numberTwo.toString().isEmpty()){
                if (numberOne.toString().endsWith(".")) numberOne.deleteCharAt(numberOne.toString().lastIndexOf("."));
                double wynik = oblicz(numberOne, numberTwo);
                dzialanie = "*";
                textDzialanie.setText(String.valueOf(wynik) + " " + dzialanie);
                numberOne.append(String.valueOf(wynik));
            }
            else {
                if (numberOne.toString().endsWith(".")) numberOne.deleteCharAt(numberOne.toString().lastIndexOf("."));
                dzialanie = "*";
                if (numberOne.toString().isEmpty()) {
                    if (text.getText().toString().equals("")) numberOne.append(0);
                    else numberOne.append(text.getText());
                }
                textDzialanie.setText(numberOne + " " + dzialanie);
            }
        }
        if (view.getId() == buttonDivide.getId()) {
            if (!dzialanie.equals("") && !numberTwo.toString().isEmpty()){
                if (numberOne.toString().endsWith(".")) numberOne.deleteCharAt(numberOne.toString().lastIndexOf("."));
                double wynik = oblicz(numberOne, numberTwo);
                dzialanie = "/";
                textDzialanie.setText(String.valueOf(wynik) + " " + dzialanie);
                numberOne.append(String.valueOf(wynik));
            }
            else {
                if (numberOne.toString().endsWith(".")) numberOne.deleteCharAt(numberOne.toString().lastIndexOf("."));
                dzialanie = "/";
                if (numberOne.toString().isEmpty()) {
                    if (text.getText().toString().equals("")) numberOne.append(0);
                    else numberOne.append(text.getText());
                }
                textDzialanie.setText(numberOne + " " + dzialanie);
            }
        }

        if (!dzialanie.equals("")) {

            if (view.getId() == button0.getId()) {
                if (numberTwo.length()>7) textDzialanie.setText(numberOne + " " + dzialanie + " " + numberTwo);
                else {
                    if (!numberTwo.toString().contains(".") && !numberTwo.toString().isEmpty() && Double.valueOf(numberTwo.toString())==0) textDzialanie.setText(numberOne + " " + dzialanie + " " + numberTwo);
                    else {
                        numberTwo.append(0);
                        textDzialanie.setText(numberOne + " " + dzialanie + " " + numberTwo);
                    }
                }
            }
            if (view.getId() == button1.getId()) {
                if (numberTwo.length()>7) textDzialanie.setText(numberOne + " " + dzialanie + " " + numberTwo);
                else {
                    if (!numberTwo.toString().contains(".") && !numberTwo.toString().isEmpty() && Double.valueOf(numberTwo.toString())==0){
                        numberTwo.delete(0, numberTwo.length());
                        numberTwo.append(1);
                    }
                    else numberTwo.append(1);
                    textDzialanie.setText(numberOne + " " + dzialanie + " " + numberTwo);
                }
            }
            if (view.getId() == button2.getId()) {
                if (numberTwo.length()>7) textDzialanie.setText(numberOne + " " + dzialanie + " " + numberTwo);
                else {
                    if (!numberTwo.toString().contains(".") && !numberTwo.toString().isEmpty() && Double.valueOf(numberTwo.toString())==0){
                        numberTwo.delete(0, numberTwo.length());
                        numberTwo.append(2);
                    }
                    else numberTwo.append(2);
                    textDzialanie.setText(numberOne + " " + dzialanie + " " + numberTwo);
                }
            }
            if (view.getId() == button3.getId()) {
                if (numberTwo.length()>7) textDzialanie.setText(numberOne + " " + dzialanie + " " + numberTwo);
                else {
                    if (!numberTwo.toString().contains(".") && !numberTwo.toString().isEmpty() && Double.valueOf(numberTwo.toString())==0){
                        numberTwo.delete(0, numberTwo.length());
                        numberTwo.append(3);
                    }
                    else numberTwo.append(3);
                    textDzialanie.setText(numberOne + " " + dzialanie + " " + numberTwo);
                }
            }
            if (view.getId() == button4.getId()) {
                if (numberTwo.length()>7) textDzialanie.setText(numberOne + " " + dzialanie + " " + numberTwo);
                else {
                    if (!numberTwo.toString().contains(".") && !numberTwo.toString().isEmpty() && Double.valueOf(numberTwo.toString())==0){
                        numberTwo.delete(0, numberTwo.length());
                        numberTwo.append(4);
                    }
                    else numberTwo.append(4);
                    textDzialanie.setText(numberOne + " " + dzialanie + " " + numberTwo);
                }
            }
            if (view.getId() == button5.getId()) {
                if (numberTwo.length()>7) textDzialanie.setText(numberOne + " " + dzialanie + " " + numberTwo);
                else {
                    if (!numberTwo.toString().contains(".") && !numberTwo.toString().isEmpty() && Double.valueOf(numberTwo.toString())==0){
                        numberTwo.delete(0, numberTwo.length());
                        numberTwo.append(5);
                    }
                    else numberTwo.append(5);
                    textDzialanie.setText(numberOne + " " + dzialanie + " " + numberTwo);
                }
            }
            if (view.getId() == button6.getId()) {
                if (numberTwo.length()>7) textDzialanie.setText(numberOne + " " + dzialanie + " " + numberTwo);
                else {
                    if (!numberTwo.toString().contains(".") && !numberTwo.toString().isEmpty() && Double.valueOf(numberTwo.toString())==0){
                        numberTwo.delete(0, numberTwo.length());
                        numberTwo.append(6);
                    }
                    else numberTwo.append(6);
                    textDzialanie.setText(numberOne + " " + dzialanie + " " + numberTwo);
                }
            }
            if (view.getId() == button7.getId()) {
                if (numberTwo.length()>7) textDzialanie.setText(numberOne + " " + dzialanie + " " + numberTwo);
                else {
                    if (!numberTwo.toString().contains(".") && !numberTwo.toString().isEmpty() && Double.valueOf(numberTwo.toString())==0){
                        numberTwo.delete(0, numberTwo.length());
                        numberTwo.append(7);
                    }
                    else numberTwo.append(7);
                    textDzialanie.setText(numberOne + " " + dzialanie + " " + numberTwo);
                }
            }
            if (view.getId() == button8.getId()) {
                if (numberTwo.length()>7) textDzialanie.setText(numberOne + " " + dzialanie + " " + numberTwo);
                else {
                    if (!numberTwo.toString().contains(".") && !numberTwo.toString().isEmpty() && Double.valueOf(numberTwo.toString())==0){
                        numberTwo.delete(0, numberTwo.length());
                        numberTwo.append(8);
                    }
                    else numberTwo.append(8);
                    textDzialanie.setText(numberOne + " " + dzialanie + " " + numberTwo);
                }
            }
            if (view.getId() == button9.getId()) {
                if (numberTwo.length()>7) textDzialanie.setText(numberOne + " " + dzialanie + " " + numberTwo);
                else {
                    if (!numberTwo.toString().contains(".") && !numberTwo.toString().isEmpty() && Double.valueOf(numberTwo.toString())==0){
                        numberTwo.delete(0, numberTwo.length());
                        numberTwo.append(9);
                    }
                    else numberTwo.append(9);
                    textDzialanie.setText(numberOne + " " + dzialanie + " " + numberTwo);
                }
            }
            if (view.getId() == buttonDot.getId()) {
                if (numberTwo.length()>7) textDzialanie.setText(numberOne + " " + dzialanie + " " + numberTwo);
                else {
                    if (numberTwo.toString().contains(".")){
                        textDzialanie.setText(numberOne + " " + dzialanie + " " + numberTwo);
                    }
                    else {
                        if (numberTwo.toString().isEmpty()) {
                            numberTwo.append("0.");
                        } else {
                            numberTwo.append(".");
                        }
                        textDzialanie.setText(numberOne + " " + dzialanie + " " + numberTwo);
                    }
                }
            }
        }

        if (view.getId() == buttonResult.getId()) {
//            if (!text.getText().toString().equals("")){
//                numberOne.delete(0, numberOne.length());
//                numberOne.append(text);
//                double wynik = oblicz(numberOne, numberTwo);
//                text.setText(String.valueOf(wynik));
//                dzialanie = "";
//                numberOne.delete(0, numberOne.length());
//                numberTwo.delete(0, numberTwo.length());
//            }
//            else{
                if (!numberOne.toString().isEmpty() && !numberTwo.toString().isEmpty()){
                    //textDzialanie.setText(text.getText()+ " =");
                    if (numberTwo.toString().endsWith(".")){
                        numberTwo.deleteCharAt(numberTwo.toString().lastIndexOf("."));
                        textDzialanie.setText(numberOne + " " + dzialanie + " " + numberTwo);
                    }
                    double wynik = oblicz(numberOne, numberTwo);
                    text.setText(String.valueOf(wynik));

                }
                else if (!numberOne.toString().isEmpty() && numberTwo.toString().isEmpty()){
                    double wynik = Double.valueOf(numberOne.toString());
                    text.setText(String.valueOf(wynik));
                }
                else{
                    text.setText(null);
                    textDzialanie.setText(null);
                }
 //           }
        }

        if (view.getId() == buttonClear.getId()) {
            czyscWszystko();
        }
    }

    private double oblicz(StringBuilder numberOne, StringBuilder numberTwo) {
//        BigDecimal number1 = new BigDecimal(numberOne.toString());
//        BigDecimal number2 = new BigDecimal(numberTwo.toString());
        double number1 = Double.valueOf(numberOne.toString());
        double number2 = Double.valueOf(numberTwo.toString());

        // String wynik = "";
        double wynik = 0;
        switch (dzialanie) {
            case "+": {
                wynik = number1 + number2;
                break;
            }
            case "-": {
                wynik = number1 - number2;
                break;
            }
            case "*": {
                wynik = number1 * number2;
                break;
            }
            case "/": {
                if (number2==0){
                    Toast.makeText(MainActivity.this, "Nie dziel przez 0!", Toast.LENGTH_SHORT).show();
                }
                else{
                    wynik = number1 / number2;
                }
                break;
            }
        }

//        if (!text.getText().toString().equals("") && numberTwo.toString().isEmpty()){
//                numberOne.delete(0, numberOne.length());
//                numberOne.append(text);
//                double wynik = oblicz(numberOne, numberTwo);
//                text.setText(String.valueOf(wynik));
//                dzialanie = "";
//                numberOne.delete(0, numberOne.length());
//                numberTwo.delete(0, numberTwo.length());
//            }

        dzialanie = "";
        numberOne.delete(0, numberOne.length());
        numberTwo.delete(0, numberTwo.length());
        return wynik;
    }

    private void czyscWszystko() {
        dzialanie = "";
        numberOne.delete(0, numberOne.length());
        numberTwo.delete(0, numberTwo.length());
        text.setText(null);
        textDzialanie.setText(null);
    }
}
