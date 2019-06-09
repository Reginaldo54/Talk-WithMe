package com.example.talkwithme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class telaInicial extends AppCompatActivity {

    private EditText entradaNome, entradaSenha;
    private Button butaoEntrar, butaocadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telainicial);


    inicializarComponentes();

    //Botão para troca de tela
        butaocadastrar = (Button) findViewById(R.id.edtSighID);
        butaocadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(telaInicial.this, telaCadastro.class);
                startActivity(intent2);
                finish();
            }
        });





    //Ação do botão

        butaoEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = entradaNome.getText().toString();
                String senha = entradaSenha.getText().toString();

                //Exibir nome e senha com "Toast"

                Toast.makeText(getApplicationContext(),"Olá"+ nome + " você digitou a senha"+ senha,Toast.LENGTH_LONG).show();
            }
        }    );

    }

    private void inicializarComponentes() {
        entradaNome = findViewById(R.id.edtNomeID);
        entradaSenha = findViewById(R.id.edtSenhaID);
        butaoEntrar = findViewById(R.id.btEntrarID);

    }


}
