package com.example.projetoaldo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.projetoaldo.objetos.Pessoa;
import com.example.projetoaldo.objetos.PessoaDAO;


public class Agenda extends AppCompatActivity {
    private EditText editTextNome;
    private EditText editTextIdade;
    private PessoaDAO dao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);

        editTextNome = findViewById(R.id.editTextNome);
        editTextIdade = findViewById(R.id.editTextIdade);
        dao = new PessoaDAO(this);

    }
    public void setBotaoSalvar(View view){
        Pessoa pessoas =  new Pessoa();
        pessoas.setNome(editTextNome.getText().toString());
        pessoas.setTelefone(editTextIdade.getText().toString());
        long id = dao.inserir(pessoas);
        Toast.makeText(this, "Telefone inserido com sucesso", Toast.LENGTH_SHORT).show();
    }
    }
