package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner2);

        Button btnAccept = (Button) findViewById (R.id.SelectSpinner);
        btnAccept.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){

                // Generem el Intent per cridar a la segona Activity (layoyt)
                Intent intent = new Intent(getApplicationContext(), Spinner3.class); // (MainActivity.this,frmMensaje.class);

                startActivityForResult(intent, 1 ); // requestCode Identifica la
                // Actividad que estoy llamando. Sirve para luego recoger el resultado
                // y saber de que actividad son.

            }
        });
    }
    ArrayList<String> list = new ArrayList<>();
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        ArrayAdapter<String> arrAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, list);
        Spinner sp = (Spinner) findViewById(R.id.spinnertext);
        if(requestCode == 1){
            if(resultCode == RESULT_OK){
                list.add(data.getStringExtra("RESULTADO"));
                sp.setAdapter(arrAdapter);
            }
        }
    }
}
