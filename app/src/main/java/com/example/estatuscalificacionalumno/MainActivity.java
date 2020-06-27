package com.example.estatuscalificacionalumno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Encapsulamos
    private EditText et1;
    private EditText et2;
    private EditText et3;
    private TextView tv1;
    private TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Relación de valores entre la parte gráfica y la parte lógica
        et1 = (EditText)findViewById(R.id.txt_mate);
        et2 = (EditText)findViewById(R.id.txt_fisica);
        et3 = (EditText)findViewById(R.id.txt_quimica);
        tv1 = (TextView)findViewById(R.id.tv_resultado);
        tv2 = (TextView)findViewById(R.id.tv_estatus);
    }

    // Método para calcular el promedio al dar click al botón
    public void Promedio(View view){

        //Nos traemos el texto de la parte gráfica (llegan en formato String)
        String strMate = et1.getText().toString();
        String strFis = et2.getText().toString();
        String strQuim = et3.getText().toString();

        //Pasamos los valores a enteros para poder hacer operaciones
        int intMate = Integer.parseInt(strMate);
        int intFis = Integer.parseInt(strFis);
        int intQuim = Integer.parseInt(strQuim);

        //Hacemos los cálculos
        int prom = (intMate + intFis + intQuim)/3;

        // Pasamos el resultado a String
        String Resultado = String.valueOf(prom);

        // Enviamos el resultado a la GUI
        tv1.setText(Resultado);

        if(prom >= 6){
            tv2.setText("Estas Aprobado");
        }else if(prom <=5){
            tv2.setText("Estas Reprobado");
        }

    }

}