package com.ulbra.appjokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnReiniciar;



    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnReiniciar = findViewById(R.id.btnReiniciar);
        txtResultado = findViewById(R.id.txtResultado);

        btnReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reiniciarJogo();
            }
        });
    }

    public void reiniciarJogo() {


        txtResultado.setText("RESULTADO");

        ImageView imageResultado = findViewById(R.id.imgApp);

        imageResultado.setImageResource(R.drawable.padrao);
    }

    public void selecionadoPedra(View view) {
        this.opcaoSelecionado("pedra");
    }

    public void selecionadoPapel(View view) {
        this.opcaoSelecionado("papel");
    }

    public void selecionadoTesoura(View view) {
        this.opcaoSelecionado("tesoura");
    }

    public void opcaoSelecionado(String opcaoSelecionada) {

        ImageView imageResultado = findViewById(R.id.imgApp);

        String opcoes[] = {"pedra", "papel", "tesoura"};

        String opcaoApp = opcoes[new Random().nextInt(3)];

        switch (opcaoApp) {

            case "pedra":
                imageResultado.setImageResource(R.drawable.pedra);
                break;

            case "papel":
                imageResultado.setImageResource(R.drawable.papel);
                break;

            case "tesoura":
                imageResultado.setImageResource(R.drawable.tesoura);
                break;
        }

        if ((opcaoApp.equals("tesoura") && opcaoSelecionada.equals("papel")) ||
                (opcaoApp.equals("papel") && opcaoSelecionada.equals("pedra")) ||
                (opcaoApp.equals("pedra") && opcaoSelecionada.equals("tesoura"))) {

            txtResultado.setText("Resultado: Você PERDEU... ");



        } else if ((opcaoSelecionada.equals("tesoura") && opcaoApp.equals("papel")) ||
                (opcaoSelecionada.equals("papel") && opcaoApp.equals("pedra")) ||
                (opcaoSelecionada.equals("pedra") && opcaoApp.equals("tesoura"))) {

            txtResultado.setText("Resultado: Você GANHOU... ");



        } else {

            txtResultado.setText("Resultado: Vocês EMPATARAM... ");
        }
    }
}