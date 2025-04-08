package br.com.example.aula5;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView resultado = findViewById(R.id.textViewResultado);
        Button botaoSalvar = findViewById(R.id.buttonSalvar);

        EditText nome = findViewById(R.id.editTextNome);
        EditText telefone = findViewById(R.id.editTextPhone);

        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nomeInformado = nome.getText().toString();
                String telefoneInformado = telefone.getText().toString();
                resultado.setText("O usuário inseriu: " +
                        nomeInformado + " " + telefoneInformado);

            }
        });
    }
}
