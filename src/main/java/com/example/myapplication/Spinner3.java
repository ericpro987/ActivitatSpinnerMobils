package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class Spinner3 extends Activity implements View.OnClickListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Mostrar el view frmmensaje creat a layout
        setContentView(R.layout.activity_main);

        //


        // Si no existeix el nomde la variable al bundle, retorna null


        // Codi per retornar valor a l'activity "pare"
        Button cmdOK = (Button) findViewById(R.id.AcceptBtn);
        Button cmdKO = (Button) findViewById(R.id.CancelBtn);
        cmdOK.setOnClickListener(this);
        cmdKO.setOnClickListener(this);

    }
    // Codi per retornar valor a l'activity "pare"
    @Override
    public void onClick(View v) {
        TextView pt = (TextView) findViewById(R.id.PlainText);
        // TODO Auto-generated method stub
        Intent inData = new Intent();
        if (v.getId() == R.id.AcceptBtn) {
            inData.putExtra("RESULTADO", pt.getText().toString());


            setResult(RESULT_OK, inData);
            // Cerramos la Activity
            finish();
        } else if (v.getId() == R.id.CancelBtn) {

            inData.putExtra("RESULTADO", "Resultado Err�neo");
            setResult(RESULT_CANCELED, inData);
            // Cerramos la Activity
            finish();

        }
        }
    }


