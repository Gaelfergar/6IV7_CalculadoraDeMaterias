package com.example.calculadoradematerias;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText editP601_1, editP601_2, editP601_3, editP602_1, editP602_2, editP602_3,
            editP603_1, editP603_2, editP603_3, editP604_1, editP604_2, editP604_3,
            editP605_1, editP605_2, editP605_3, editP606_1, editP606_2, editP606_3,
            editP607_1, editP607_2, editP607_3, editP608_1, editP608_2, editP608_3,
            editP609_1, editP609_2, editP609_3, editP610_1, editP610_2, editP610_3;
    private Button btnP601, btnP602, btnP603, btnP604,
            btnP605, btnP606, btnP607, btnP608, btnP609, btnP610;
    private TextView txtP601, txtP602, txtP603, txtP604,
            txtP605, txtP606, txtP607, txtP608, txtP609, txtP610;
    private Button btnTotal;
    private TextView promedioTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editP601_1 = (EditText) findViewById(R.id.editP601_1);
        editP601_2 = findViewById(R.id.editP601_2);
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

        btnP601 = (Button) findViewById(R.id.btnP601);
        btnP601.setOnClickListener(this);
        btnP602 = (Button) findViewById(R.id.btnP602);
        btnP602.setOnClickListener(this);
        btnP603 = (Button) findViewById(R.id.btnP603);
        btnP603.setOnClickListener(this);
        btnP604 = (Button) findViewById(R.id.btnP604);
        btnP604.setOnClickListener(this);
        btnP605 = (Button) findViewById(R.id.btnP605);
        btnP605.setOnClickListener(this);
        btnP606 = (Button) findViewById(R.id.btnP606);
        btnP606.setOnClickListener(this);
        btnP607 = (Button) findViewById(R.id.btnP607);
        btnP607.setOnClickListener(this);
        btnP608 = (Button) findViewById(R.id.btnP608);
        btnP608.setOnClickListener(this);
        btnP609 = (Button) findViewById(R.id.btnP609);
        btnP609.setOnClickListener(this);
        btnP610 = (Button) findViewById(R.id.btnP610);
        btnP610.setOnClickListener(this);
        btnTotal = (Button) findViewById(R.id.btnTotal);
        btnTotal.setOnClickListener(this);
    }

    public void finalP601(View v){
        int par1P601 = Integer.parseInt(editP601_1.getText().toString());
        int par2P601 = Integer.parseInt(editP601_2.getText().toString());
        int par3P601 = Integer.parseInt(editP601_3.getText().toString());
        int finP601 = (par1P601 + par2P601 + par3P601)/3;
        txtP601.setText("Final: "+finP601);
    }
    public void finalP602(View v){
        int par1P602 = Integer.parseInt(editP602_1.getText().toString());
        int par2P602 = Integer.parseInt(editP602_2.getText().toString());
        int par3P602 = Integer.parseInt(editP602_3.getText().toString());
        int finP602 = (par1P602 + par2P602 + par3P602)/3;
        txtP602.setText("Final: "+finP602);
    }
    public void finalP603(View v){
        int par1P603 = Integer.parseInt(editP603_1.getText().toString());
        int par2P603 = Integer.parseInt(editP603_2.getText().toString());
        int par3P603 = Integer.parseInt(editP603_3.getText().toString());
        int finP603 = (par1P603 + par2P603 + par3P603)/3;
        txtP603.setText("Final: "+finP603);
    }
    public void finalP604(View v){
        int par1P604 = Integer.parseInt(editP604_1.getText().toString());
        int par2P604 = Integer.parseInt(editP604_2.getText().toString());
        int par3P604 = Integer.parseInt(editP604_3.getText().toString());
        int finP604 = (par1P604 + par2P604 + par3P604)/3;
        txtP604.setText("Final: "+finP604);
    }
    public void finalP605(View v){
        int par1P605 = Integer.parseInt(editP605_1.getText().toString());
        int par2P605 = Integer.parseInt(editP605_2.getText().toString());
        int par3P605 = Integer.parseInt(editP605_3.getText().toString());
        int finP605 = (par1P605 + par2P605 + par3P605)/3;
        txtP605.setText("Final: "+finP605);
    }
    public void finalP606(View v){
        int par1P606 = Integer.parseInt(editP606_1.getText().toString());
        int par2P606 = Integer.parseInt(editP606_2.getText().toString());
        int par3P606 = Integer.parseInt(editP606_3.getText().toString());
        int finP606 = (par1P606 + par2P606 + par3P606)/3;
        txtP606.setText("Final: "+finP606);
    }
    public void finalP607(View v){
        int par1P607 = Integer.parseInt(editP607_1.getText().toString());
        int par2P607 = Integer.parseInt(editP607_2.getText().toString());
        int par3P607 = Integer.parseInt(editP607_3.getText().toString());
        int finP607 = (par1P607 + par2P607 + par3P607)/3;
        txtP607.setText("Final: "+finP607);
    }
    public void finalP608(View v){
        int par1P608 = Integer.parseInt(editP608_1.getText().toString());
        int par2P608 = Integer.parseInt(editP608_2.getText().toString());
        int par3P608 = Integer.parseInt(editP608_3.getText().toString());
        int finP608 = (par1P608 + par2P608 + par3P608)/3;
        txtP608.setText("Final: "+finP608);
    }
    public void finalP609(View v){
        int par1P609 = Integer.parseInt(editP609_1.getText().toString());
        int par2P609 = Integer.parseInt(editP609_2.getText().toString());
        int par3P609 = Integer.parseInt(editP609_3.getText().toString());
        int finP609 = (par1P609 + par2P609 + par3P609)/3;
        txtP609.setText("Final: "+finP609);
    }
    public void finalP610(View v){
        int par1P610 = Integer.parseInt(editP610_1.getText().toString());
        int par2P610 = Integer.parseInt(editP610_2.getText().toString());
        int par3P610 = Integer.parseInt(editP610_3.getText().toString());
        int finP610 = (par1P610 + par2P610 + par3P610)/3;
        txtP610.setText("Final: "+finP610);
    }

    public void onClick(View v) {
        int finalP601 = Integer.parseInt(txtP601.getText().toString());
        int finalP602 = Integer.parseInt(txtP602.getText().toString());
        int finalP603 = Integer.parseInt(txtP603.getText().toString());
        int finalP604 = Integer.parseInt(txtP604.getText().toString());
        int finalP605 = Integer.parseInt(txtP605.getText().toString());
        int finalP606 = Integer.parseInt(txtP606.getText().toString());
        int finalP607 = Integer.parseInt(txtP607.getText().toString());
        int finalP608 = Integer.parseInt(txtP608.getText().toString());
        int finalP609 = Integer.parseInt(txtP609.getText().toString());
        int finalP610 = Integer.parseInt(txtP610.getText().toString());

        int resultado = (finalP601 + finalP602 + finalP603 + finalP604 +
                finalP605 + finalP606 + finalP607 + finalP608 + finalP609 + finalP610)/10;
        promedioTotal.setText("Promedio total: " + resultado);
    }
}