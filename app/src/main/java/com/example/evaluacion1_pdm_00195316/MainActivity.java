package com.example.evaluacion1_pdm_00195316;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.evaluacion1_pdm_00195316.Utilidades.AppConstant;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,enviar;
    int cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,aux;
    EditText name,correo;
    String total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Botones
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);
        enviar = findViewById(R.id.enviar);

        //EditText
        name = findViewById(R.id.et_nombre);
        correo = findViewById(R.id.et_correo);

        btn1.setOnClickListener(v -> {
            cont1 += 1;
            btn1.setText("Producto 1 \n" + cont1);
        });

        btn2.setOnClickListener(v -> {
            cont2 += 1;
            btn2.setText("Producto 2 \n" + cont2);
        });

        btn3.setOnClickListener(v -> {
            cont3 += 1;
            btn3.setText("Producto 3 \n" + cont3);
        });
        btn4.setOnClickListener(v -> {
            cont4 += 1;
            btn4.setText("Producto 4 \n" + cont4);
        });
        btn5.setOnClickListener(v -> {
            cont5 += 1;
            btn5.setText("Producto 5 \n" + cont5);
        });

        btn6.setOnClickListener(v -> {
            cont6 += 1;
            btn6.setText("Producto 6 \n" + cont6);
        });

        btn7.setOnClickListener(v -> {
            cont7 += 1;
            btn7.setText("Producto 7 \n" + cont7);
        });

        btn8.setOnClickListener(v -> {
            cont8 += 1;
            btn8.setText("Producto 8 \n" + cont8);
        });

        btn9.setOnClickListener(v -> {
            cont9 += 1;
            btn9.setText("Producto 9 \n" + cont9);
        });

        enviar.setOnClickListener(v ->{
            aux = cont1 + cont2 + cont3 + cont4 + cont5 + cont6 + cont7 + cont8 + cont9;
            total = "" + aux;

            Intent m_Intent = new Intent(MainActivity.this,Main2Activity.class);
            //Botones
            m_Intent.putExtra(AppConstant.TEXT_KEYS,btn1.getText().toString());
            m_Intent.putExtra(AppConstant.TEXT_KEYS1,btn2.getText().toString());
            m_Intent.putExtra(AppConstant.TEXT_KEYS2,btn3.getText().toString());
            m_Intent.putExtra(AppConstant.TEXT_KEYS3,btn4.getText().toString());
            m_Intent.putExtra(AppConstant.TEXT_KEYS4,btn5.getText().toString());
            m_Intent.putExtra(AppConstant.TEXT_KEYS5,btn6.getText().toString());
            m_Intent.putExtra(AppConstant.TEXT_KEYS6,btn7.getText().toString());
            m_Intent.putExtra(AppConstant.TEXT_KEYS7,btn8.getText().toString());
            m_Intent.putExtra(AppConstant.TEXT_KEYS8,btn9.getText().toString());
            //EditText
            m_Intent.putExtra(AppConstant.TEXT_KEYS9,name.getText().toString());
            m_Intent.putExtra(AppConstant.TEXT_KEY10,correo.getText().toString());
            m_Intent.putExtra(AppConstant.TEXT_KEY11,total);

            startActivity(m_Intent);

        });
    }

}
