package com.example.projetoaldo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // Ação para ir a pagina da Calculadora
    public void irParaCalculadora(View view) {
        Intent intent1 = new Intent(getApplicationContext(), Calculadora.class);
        startActivity(intent1);

    }
    // Ação para ir a pagina do Navegador
    public void irParaNavegador(View view) {
        Intent intent1 = new Intent(getApplicationContext(), Navegador.class);
        startActivity(intent1);

    }
    // Ação para ir a pagina para Agenda
    public void irParaAgenda(View view) {
        Intent intent1 = new Intent(getApplicationContext(), Agenda.class);
        startActivity(intent1);
    }
    // Ação para ir a pagina da Localização
    public void irParaLocalizacao(View view) {
        Intent intent1 = new Intent(getApplicationContext(), Localizacao.class);
        startActivity(intent1);
    }
}