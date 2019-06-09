package com.example.talkwithme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class telaClassificacao extends AppCompatActivity {

    private Button cVoltar, mAnimal, mAlimento, mFerramenta, mObjeto, mEletronico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telaclassificacao);

        //código para mudar tela

        cVoltar = (Button)findViewById(R.id.aVoltarID);
        cVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(telaClassificacao.this, telaInicial.class);
                startActivity(intent);
                finish();
            }
        });

           /* deixa tela diretoria como tela inicial, no futuro só precisara mudar para a tela
               relacionada a animais, alimentos, etc... */

        // para tela animais

        mAnimal = (Button)findViewById(R.id.edtAnimalID);
        mAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(telaClassificacao.this, telaInicial.class);
                startActivity(intent2);
                finish();
            }
        });
        // para tela alimentos

        mAlimento = (Button)findViewById(R.id.edtAlimentoID);
        mAlimento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(telaClassificacao.this, telaInicial.class);
                startActivity(intent3);
                finish();
            }
        });
        // para tela ferramentas

        mFerramenta = (Button)findViewById(R.id.edtFerramentaID);
        mFerramenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(telaClassificacao.this, telaInicial.class);
                startActivity(intent4);
                finish();
            }
        });

        // para tela objetos

        mObjeto = (Button)findViewById(R.id.edtObjetoID);
        mObjeto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(telaClassificacao.this, telaInicial.class);
                startActivity(intent5);
                finish();
            }
        });
        // Tela Eletronicos

        mEletronico = (Button)findViewById(R.id.edtEletronicoID);
        mEletronico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(telaClassificacao.this, telaInicial.class);
                startActivity(intent6);
                finish();


            }
        });
    }
}




