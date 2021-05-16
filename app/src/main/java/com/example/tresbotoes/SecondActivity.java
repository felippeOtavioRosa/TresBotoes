package com.example.tresbotoes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG = "SecondActivity";
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent(); //cria o intent para receber do mainActivity
        int id = intent.getIntExtra(MainActivity.EXTRA_BUTTON_ID, R.id.texto_um); // cria o int id e "acopla" a ele o id do botão selecionado no MainActivity
        Log.d(TAG, "onCreate: Recebido id " + id); // cria o log de debug

        String text = ""; //cria variável para imprimir o texto
        switch (id){
            case R.id.texto_um:
                text = "Texto um Pressinado";
                break;
            case R.id.texto_dois:
                text = "Texto dois pressionado";
                break;
            case R.id.texto_3:
                text = "Texto três pressionado";
                break;
            default:
                text = "Erro! Isso não deveria aparecer!";
                break;
        }
        TextView textView = findViewById(R.id.textView);
        textView.setText(text);
    }
}