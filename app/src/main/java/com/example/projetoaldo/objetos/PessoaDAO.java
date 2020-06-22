package com.example.projetoaldo.objetos;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class PessoaDAO {

    private Conexao conexao;
    private SQLiteDatabase banco;

    public PessoaDAO(Context context){
        conexao = new Conexao(context);
        banco = conexao.getWritableDatabase();
    }

    public long inserir(Pessoa pessoa){
        ContentValues values = new ContentValues();
        values.put("nome", pessoa.getNome());
        values.put("telefone,", pessoa.getTelefone());
        return banco.insert("pessoa",null,values);
    }
}
