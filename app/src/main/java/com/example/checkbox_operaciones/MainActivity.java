package com.example.checkbox_operaciones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;

public class MainActivity extends Activity {
    EditText n1,n2;
    Button bcalcular;
    TextView r1,r2,r3,r4;
    CheckBox c1,c2,c3,c4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = (EditText) findViewById(R.id.txt_n1);
        n2 = (EditText) findViewById(R.id.txt_n2);
        r1 = (TextView) findViewById(R.id.txt_r1);
        r2 = (TextView) findViewById(R.id.txt_r2);
        r3 = (TextView) findViewById(R.id.txt_r3);
        r4 = (TextView) findViewById(R.id.txt_r4);
        c1 = (CheckBox) findViewById(R.id.cb1);
        c2 = (CheckBox) findViewById(R.id.cb2);
        c3 = (CheckBox) findViewById(R.id.cb3);
        c4 = (CheckBox) findViewById(R.id.cb4);
        bcalcular = (Button) findViewById(R.id.b1);

    }
    public void Calcular(View v) {
        double valor1=Double.parseDouble(n1.getText().toString());
        double valor2=Double.parseDouble(n2.getText().toString());

        if(c1.isChecked() == true){
            double suma=valor1+valor2;
            r1.setText(suma+"");
            Toast.makeText(this, "Calculo hecho", Toast.LENGTH_SHORT).show();
        }if(c2.isChecked() == true) {
            double resta = valor1 - valor2;
            r2.setText(resta + "");
            Toast.makeText(this, "Calculo hecho", Toast.LENGTH_SHORT).show();
        }if(c3.isChecked() == true) {
            double multiplicación = valor1 * valor2;
            r3.setText(multiplicación + "");
            Toast.makeText(this, "Calculo hecho", Toast.LENGTH_SHORT).show();
        }if(c4.isChecked() == true) {
            double división = valor1 / valor2;
            r4.setText(división + "");
            Toast.makeText(this, "Calculo hecho", Toast.LENGTH_SHORT).show();
        }
    }
}
