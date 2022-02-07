package com.example.mypall;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    //Method checks if the value for LBP inputted is true
    public boolean valueCheckLBP() {
        EditText value_LBP = (EditText) findViewById(R.id.valueLBP);
        String lbp_string = value_LBP.getText().toString();

        for (int i = 0; i < lbp_string.length(); i++) {
            if (!(lbp_string.charAt(i) >= 48 && lbp_string.charAt(i) <= 57))
                return false;
        }

        //To avoid false "return true" errors caused by empty inputs
        if (lbp_string.isEmpty()) {
            return false;
        }

        return true;
    }

    //Method checks if the value for USD inputted is true
    public boolean valueCheckUSD() {
        EditText value_USD = (EditText) findViewById(R.id.valueUSD);

        String usd_string = value_USD.getText().toString();

        for (int i = 0; i < usd_string.length(); i++) {
            if (!(usd_string.charAt(i) >= 48 && usd_string.charAt(i) <= 57))
                return false;
        }
        //To avoid false "return true" errors caused by empty inputs
        if (usd_string.isEmpty()) {
            return false;
        }

        return true;
    }

    public void OnClickConvert(View view) {
        EditText value_LBP = (EditText) findViewById(R.id.valueLBP);
        EditText value_USD = (EditText) findViewById(R.id.valueUSD);

        //USD Dialogue Box for information about USD value text box
        TextView dialogue1 = (TextView) findViewById(R.id.dialogBoxUSD);

        //LBP Dialogue Box for information about LBP value text box
        TextView dialogue2 = (TextView) findViewById(R.id.dialogBoxLBP);

        //Universal Dialogue Box for information when both values might cause an error.
        TextView dialogue3 = (TextView) findViewById(R.id.dialogBoxUniversal);


        //Checks if user has given an input.
        //The && operator will solve the issue when the user wants to perform
        //several conversions by informing that one text box should be filled.
        if (valueCheckUSD() && valueCheckLBP()) {
            dialogue3.setText("Please leave one currency text box with a value.");
        } else {
            //Convert from USD to LBP
            if (valueCheckUSD()) {
                double temp_USD = Double.parseDouble(String.valueOf(value_USD.getText()));
                double result_LBP = temp_USD * 22000;
                value_LBP.setText(String.format("%.2f", result_LBP));

                //Set all warning dialogues to an empty string since conversion is successful
                dialogue1.setText("");
                dialogue2.setText("");
                dialogue3.setText("");
            }
            //Convert from LBP to USD
            else if (valueCheckLBP()) {
                double temp_LBP = Double.parseDouble(String.valueOf(value_LBP.getText()));
                double result_USD = temp_LBP / 22000;
                value_USD.setText(String.format("%.2f", result_USD));

                //Set all warning dialogues to an empty string since conversion is successful
                dialogue1.setText("");
                dialogue2.setText("");
                dialogue3.setText("");
            } else {
                dialogue3.setText("Please leave only one currency text box with value.");
            }

        }

    }
}