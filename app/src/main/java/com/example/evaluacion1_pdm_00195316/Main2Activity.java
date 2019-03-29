package com.example.evaluacion1_pdm_00195316;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.evaluacion1_pdm_00195316.Utilidades.AppConstant;

public class Main2Activity extends AppCompatActivity {

    EditText nombre,correo,total;
    String sNombre,sCorreo,sTotal,s1,s2,s3,s4,s5,s6,s7,s8,s9;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Button b10;
    JSON J;
    String datos_compartir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nombre = findViewById(R.id.et_respuesta_nombre);
        correo = findViewById(R.id.et_correo);
        total = findViewById(R.id.et_respuesta_total);
        b1 = findViewById(R.id.btn_1);
        b2 = findViewById(R.id.btn_2);
        b3 = findViewById(R.id.btn_3);
        b4 = findViewById(R.id.btn_4);
        b5 = findViewById(R.id.btn_5);
        b6 = findViewById(R.id.btn_6);
        b7 = findViewById(R.id.btn_7);
        b8 = findViewById(R.id.btn_8);
        b9 = findViewById(R.id.btn_9);
        b10 = findViewById(R.id.compartir);

        Intent new_intent = getIntent();

        if (new_intent != null) {
            sNombre =new_intent.getStringExtra(AppConstant.TEXT_KEYS9);
            sCorreo = new_intent.getStringExtra(AppConstant.TEXT_KEY10);
            sTotal = new_intent.getStringExtra(AppConstant.TEXT_KEY11);
            s1 = new_intent.getStringExtra(AppConstant.TEXT_KEYS);
            s2 = new_intent.getStringExtra(AppConstant.TEXT_KEYS1);
            s3 = new_intent.getStringExtra(AppConstant.TEXT_KEYS2);
            s4 = new_intent.getStringExtra(AppConstant.TEXT_KEYS3);
            s5 = new_intent.getStringExtra(AppConstant.TEXT_KEYS4);
            s6 = new_intent.getStringExtra(AppConstant.TEXT_KEYS5);
            s7 = new_intent.getStringExtra(AppConstant.TEXT_KEYS6);
            s8 = new_intent.getStringExtra(AppConstant.TEXT_KEYS7);
            s9 = new_intent.getStringExtra(AppConstant.TEXT_KEYS8);
        }

        nombre.setText(sNombre);
        correo.setText(sCorreo);
        total.setText(sTotal);
        b1.setText(s1);
        b2.setText(s2);
        b3.setText(s3);
        b4.setText(s4);
        b5.setText(s5);
        b6.setText(s6);
        b7.setText(s7);
        b8.setText(s8);
        b9.setText(s9);

        b10.setOnClickListener(v ->{
            Intent m_intent2 = new Intent();
            J = new JSON(nombre.getText().toString(),correo.getText().toString(),b1.getText().toString(),b2.getText().toString(),b3.getText().toString(),b4.getText().toString(),b5.getText().toString(),b6.getText().toString(),b7.getText().toString(),b8.getText().toString(),b9.getText().toString());

            datos_compartir = J.ImprimirJSON();

            m_intent2.setAction(Intent.ACTION_SEND);
            m_intent2.setType("text/plain");

            m_intent2.putExtra(Intent.EXTRA_TEXT,datos_compartir);

            startActivity(m_intent2);
        });

    }
}
