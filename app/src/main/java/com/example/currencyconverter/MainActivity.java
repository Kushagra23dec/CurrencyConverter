package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {

    Button euro, pound, dollar,rubel,dinar, bitcoin, ausdollar, candollar,yen;
    TextView textView;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        euro = findViewById(R.id.Euro);
        dollar = findViewById(R.id.Dollar);
        rubel = findViewById(R.id.ruble);
        bitcoin = findViewById(R.id.Bitcoin);
        dinar = findViewById(R.id.dinar);
        ausdollar = findViewById(R.id.AusDollar);
        candollar = findViewById(R.id.CanDollar);
        yen = findViewById(R.id.Yen);
        pound = findViewById(R.id.pound);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);

        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();
                if(TextUtils.isEmpty(z)){
                    editText.setError("Empty user input");
                }
                else{
                    double n, k;
                    n= Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.012;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));

//                     textView.setText(""+k);
                }
            }
        });


    }
}