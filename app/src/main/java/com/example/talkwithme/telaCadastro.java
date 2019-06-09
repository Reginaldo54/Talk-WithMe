package com.example.talkwithme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class telaCadastro extends AppCompatActivity {

    private Button mVoltar, mProximatela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telacadastro);

        mVoltar  = (Button)findViewById(R.id.aVoltarID);
        mVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(telaCadastro.this, telaInicial.class );
                startActivity(intent);
                finish();    }
                                   }
        );

                mProximatela = (Button)findViewById(R.id.edtRegistroID);
                mProximatela.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent2 = new Intent(telaCadastro.this, telaClassificacao.class);
                        startActivity(intent2);
                        finish();




            }
        }
        );





    }
}
