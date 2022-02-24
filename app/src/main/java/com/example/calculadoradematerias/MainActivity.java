package com.example.calculadoradematerias;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText editP601_1, editP601_2, editP601_3, editP602_1, editP602_2, editP602_3,
            editP603_1, editP603_2, editP603_3, editP604_1, editP604_2, editP604_3,
            editP605_1, editP605_2, editP605_3, editP606_1, editP606_2, editP606_3,
            editP607_1, editP607_2, editP607_3, editP608_1, editP608_2, editP608_3,
            editP609_1, editP609_2, editP609_3, editP610_1, editP610_2, editP610_3;
    private TextView txtP601, txtP602, txtP603, txtP604,
            txtP605, txtP606, txtP607, txtP608, txtP609, txtP610;
    private TextView promedioTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editP601_1 = (EditText) findViewById(R.id.editP601_1);
        editP601_2 = (EditText) findViewById(R.id.editP601_2);
        editP601_3 = (EditText) findViewById(R.id.editP601_3);
        editP602_1 = (EditText) findViewById(R.id.editP602_1);
        editP602_2 = (EditText) findViewById(R.id.editP602_2);
        editP602_3 = (EditText) findViewById(R.id.editP602_3);
        editP603_1 = (EditText) findViewById(R.id.editP603_1);
        editP603_2 = (EditText) findViewById(R.id.editP603_2);
        editP603_3 = (EditText) findViewById(R.id.editP603_3);
        editP604_1 = (EditText) findViewById(R.id.editP604_1);
        editP604_2 = (EditText) findViewById(R.id.editP604_2);
        editP604_3 = (EditText) findViewById(R.id.editP604_3);
        editP605_1 = (EditText) findViewById(R.id.editP605_1);
        editP605_2 = (EditText) findViewById(R.id.editP605_2);
        editP605_3 = (EditText) findViewById(R.id.editP605_3);
        editP606_1 = (EditText) findViewById(R.id.editP606_1);
        editP606_2 = (EditText) findViewById(R.id.editP606_2);
        editP606_3 = (EditText) findViewById(R.id.editP606_3);
        editP607_1 = (EditText) findViewById(R.id.editP607_1);
        editP607_2 = (EditText) findViewById(R.id.editP607_2);
        editP607_3 = (EditText) findViewById(R.id.editP607_3);
        editP608_1 = (EditText) findViewById(R.id.editP608_1);
        editP608_2 = (EditText) findViewById(R.id.editP608_2);
        editP608_3 = (EditText) findViewById(R.id.editP608_3);
        editP609_1 = (EditText) findViewById(R.id.editP609_1);
        editP609_2 = (EditText) findViewById(R.id.editP609_2);
        editP609_3 = (EditText) findViewById(R.id.editP609_3);
        editP610_1 = (EditText) findViewById(R.id.editP610_1);
        editP610_2 = (EditText) findViewById(R.id.editP610_2);
        editP610_3 = (EditText) findViewById(R.id.editP610_3);

        txtP601 = (TextView) findViewById(R.id.txtP601);
        txtP602 = (TextView) findViewById(R.id.txtP602);
        txtP603 = (TextView) findViewById(R.id.txtP603);
        txtP604 = (TextView) findViewById(R.id.txtP604);
        txtP605 = (TextView) findViewById(R.id.txtP605);
        txtP606 = (TextView) findViewById(R.id.txtP606);
        txtP607 = (TextView) findViewById(R.id.txtP607);
        txtP608 = (TextView) findViewById(R.id.txtP608);
        txtP609 = (TextView) findViewById(R.id.txtP609);
        txtP610 = (TextView) findViewById(R.id.txtP610);

        promedioTotal = (TextView) findViewById(R.id.promedioTotal);
    }

    public void finalP601(View v){
        double par1P601 = Double.parseDouble(editP601_1.getText().toString());
        double par2P601 = Double.parseDouble(editP601_2.getText().toString());
        double par3P601 = Double.parseDouble(editP601_3.getText().toString());
        txtP601.setText(String.valueOf((par1P601 + par2P601 + par3P601)/3));
    }
    public void finalP602(View v){
        double par1P602 = Double.parseDouble(editP602_1.getText().toString());
        double par2P602 = Double.parseDouble(editP602_2.getText().toString());
        double par3P602 = Double.parseDouble(editP602_3.getText().toString());
        txtP602.setText(String.valueOf((par1P602 + par2P602 + par3P602)/3));
    }
    public void finalP603(View v){
        double par1P603 = Double.parseDouble(editP603_1.getText().toString());
        double par2P603 = Double.parseDouble(editP603_2.getText().toString());
        double par3P603 = Double.parseDouble(editP603_3.getText().toString());
        txtP603.setText(String.valueOf((par1P603 + par2P603 + par3P603)/3));
    }
    public void finalP604(View v){
        double par1P604 = Double.parseDouble(editP604_1.getText().toString());
        double par2P604 = Double.parseDouble(editP604_2.getText().toString());
        double par3P604 = Double.parseDouble(editP604_3.getText().toString());
        txtP604.setText(String.valueOf((par1P604 + par2P604 + par3P604)/3));
    }
    public void finalP605(View v){
        double par1P605 = Double.parseDouble(editP605_1.getText().toString());
        double par2P605 = Double.parseDouble(editP605_2.getText().toString());
        double par3P605 = Double.parseDouble(editP605_3.getText().toString());
        txtP605.setText(String.valueOf((par1P605 + par2P605 + par3P605)/3));
    }
    public void finalP606(View v){
        double par1P606 = Double.parseDouble(editP606_1.getText().toString());
        double par2P606 = Double.parseDouble(editP606_2.getText().toString());
        double par3P606 = Double.parseDouble(editP606_3.getText().toString());
        txtP606.setText(String.valueOf((par1P606 + par2P606 + par3P606)/3));
    }
    public void finalP607(View v){
        double par1P607 = Double.parseDouble(editP607_1.getText().toString());
        double par2P607 = Double.parseDouble(editP607_2.getText().toString());
        double par3P607 = Double.parseDouble(editP607_3.getText().toString());
        txtP607.setText(String.valueOf((par1P607 + par2P607 + par3P607)/3));
    }
    public void finalP608(View v){
        double par1P608 = Double.parseDouble(editP608_1.getText().toString());
        double par2P608 = Double.parseDouble(editP608_2.getText().toString());
        double par3P608 = Double.parseDouble(editP608_3.getText().toString());
        txtP608.setText(String.valueOf((par1P608 + par2P608 + par3P608)/3));
    }
    public void finalP609(View v){
        double par1P609 = Double.parseDouble(editP609_1.getText().toString());
        double par2P609 = Double.parseDouble(editP609_2.getText().toString());
        double par3P609 = Double.parseDouble(editP609_3.getText().toString());
        txtP609.setText(String.valueOf((par1P609 + par2P609 + par3P609)/3));
    }
    public void finalP610(View v){
        double par1P610 = Double.parseDouble(editP610_1.getText().toString());
        double par2P610 = Double.parseDouble(editP610_2.getText().toString());
        double par3P610 = Double.parseDouble(editP610_3.getText().toString());
        txtP610.setText(String.valueOf((par1P610 + par2P610 + par3P610)/3));
    }

    public void onClick(View v) {
        double finalP601 = Double.parseDouble(txtP601.getText().toString());
        double finalP602 = Double.parseDouble(txtP602.getText().toString());
        double finalP603 = Double.parseDouble(txtP603.getText().toString());
        double finalP604 = Double.parseDouble(txtP604.getText().toString());
        double finalP605 = Double.parseDouble(txtP605.getText().toString());
        double finalP606 = Double.parseDouble(txtP606.getText().toString());
        double finalP607 = Double.parseDouble(txtP607.getText().toString());
        double finalP608 = Double.parseDouble(txtP608.getText().toString());
        double finalP609 = Double.parseDouble(txtP609.getText().toString());
        double finalP610 = Double.parseDouble(txtP610.getText().toString());
        promedioTotal.setText(String.valueOf((finalP601 + finalP602 + finalP603 +
                finalP604 + finalP605 + finalP606 + finalP607 + finalP608 +
                finalP609 + finalP610)/10));
    }
}