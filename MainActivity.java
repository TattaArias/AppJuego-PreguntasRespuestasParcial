package com.example.apppregustasrespuestasparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView Pregunta;
    private Button RespuestaA;
    private Button RespuestaB;
    private Button RespuestaC;
    private Button RespuestaD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.PreguntasAleatorias);


        Pregunta = (TextView) findViewById(R.id.LabelPregunta);
        Pregunta = (Button) findViewById(R.id.BotonRespuestaA);
        Pregunta = (Button) findViewById(R.id.BotonRespuestaB);
        Pregunta = (Button) findViewById(R.id.BotonRespuestaC);
        Pregunta = (Button) findViewById(R.id.BotonRespuestaD);

    }
}