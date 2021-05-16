package com.example.tresbotoes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";
    public static final String EXTRA_BUTTON_ID = "com.example.tresbotoes.extra.button_id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSecondActivity(View view) {
        int id = view.getId(); //obtem o id de acordo com o botão selecionado
        Intent intent = new Intent(this, SecondActivity.class); // Intent da a ligação entre as activities, ele está chamando essa classe (this) e está chamando a secondActiviti. Seria o pacote do malote
        intent.putExtra(EXTRA_BUTTON_ID, id); //referenciar a TAG EXTRA_BUTTO_ID e "acoplar" a ela o o id do botão selecionado. Esse intent seria a etiqueta do pacote, a forma omo ele pode ser reconhecido.
        // Log - usado para entender o ciclio de vida de uma activity, retona a informação da ação executada.
        Log.d(TAG,"launchSecondActivity: Botão 1: "+ R.id.texto_um); // retorna o id do botão 1 para quando realizado o texte, poder verificar se o id retornado é o do botão selecionado
        Log.d(TAG,"launchSecondActivity: Botão 2: "+ R.id.texto_dois);
        Log.d(TAG,"launchSecondActivity: Botão 3: "+ R.id.texto_3);
        Log.d(TAG, "launchSecondActivity: Pressionado o botao com o id: " + id); //retorna o id do botão selecionado
        startActivity(intent); //inicia a atctivity
    }
}