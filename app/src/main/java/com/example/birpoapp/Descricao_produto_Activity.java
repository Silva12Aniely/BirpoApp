package com.example.birpoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Descricao_produto_Activity extends AppCompatActivity {
    private TextView txtNome, txtReward, txtEstoq, txtnomeD;
    private EditText txtquant;
    private ImageView imgProdD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.descricao_produto_layout);

        txtNome = (TextView) findViewById(R.id.nomeProdutoD);
        imgProdD = (ImageView) findViewById(R.id.idimgD);
        txtquant = (EditText) findViewById(R.id.edtQuant);
        txtEstoq = (TextView) findViewById(R.id.idProdAvalt);
        txtReward = (TextView) findViewById(R.id.idProdReward);
        txtnomeD = (TextView) findViewById(R.id.idProdName);

        Intent intent = getIntent();
        String nome = intent.getExtras().getString("Nome");
        String NomeD = intent.getExtras().getString("NomeD");
        int imgProduto = intent.getExtras().getInt("imgProd");

        txtNome.setText(nome);
        txtnomeD.setText(NomeD);
        imgProdD.setImageResource(imgProduto);
    }
}
