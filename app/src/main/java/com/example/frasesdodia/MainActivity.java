package com.example.frasesdodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // passo 1 : declarar as variaveis e seu tipo

    private TextView novo_texto;
    private Button b_frase;

    private String[] frases = {

            "Uma mente positiva e otimista tem sempre uma jornada linda, repleta de cores novas e alegres. Bom dia!",
            "Não procure sucesso nem riqueza, mas sim pessoas lindas em jornadas especiais como a de hoje. Bom dia!",
            "Desafie seus limites, vá além dos seus horizontes e passe a saborear a vida de uma forma mais plena. Bom dia!",
            "Não importa o que acontece ao seu redor, pois só depende de você a beleza do seu dia!",
            "Não há motivo certo para aproveitar um novo dia. Com chuva ou sol o que é preciso é ser feliz! Bom dia!",
            "A beleza de um dia depende sempre e só de quem o vê e da forma como o enxerga. Tenha um dia lindo do seu jeito!",
            "Bom dia! As oportunidades estão à sua espera, vá e agarre-as!",
            "Que se alegrem os rostos e se preparem os corações para instantes de alegria. Bom dia!",
            "Bom dia, amor! Que as próximas horas sejam de uma beleza e paixão sem limitações."




    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        novo_texto = (TextView) findViewById(R.id.novo_texto);
        b_frase = (Button) findViewById(R.id.b_frase);

        //novo_texto.setText(frases[1]); // chama o arrey(string) declarado logo a cima

        b_frase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // oq fazer quando clicar no botão
                Random aleatorio = new Random();
                int valorAleatorio = aleatorio.nextInt(frases.length); //length sabe o tamnho do array

                novo_texto.setText(frases[ valorAleatorio ]);



            }
        });

    }
}
