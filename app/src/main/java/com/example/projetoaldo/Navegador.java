package com.example.projetoaldo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Navegador extends AppCompatActivity {


    private Button botaoURL;
    private EditText textoDaURL;
    private WebView navedadorDaWeb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navegador);

    botaoURL = (Button) findViewById(R.id.botaoDeEntrada);
    textoDaURL = (EditText) findViewById(R.id.colocarURL);
    navedadorDaWeb = (WebView) findViewById(R.id.navedadorDaWeb);

    navedadorDaWeb.getSettings().setJavaScriptEnabled(true);
    navedadorDaWeb.setWebViewClient(new WebViewClient());

    botaoURL.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        navedadorDaWeb.loadUrl(textoDaURL.getText().toString());

        }
    });


    }

}