package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Ligação do componente de classe com os componentes da interface
        Button btnSomarProg = (Button) findViewById(R.id.btnSomar);
        Button btnMultiplicar = (Button) findViewById(R.id.btnMultiplicar);
        Button btnSubtrairProg = (Button) findViewById(R.id.btnSubtrair);
        Button btnDividirProg = (Button) findViewById(R.id.btnDividir);
        EditText edtValor1Prog = (EditText) findViewById(R.id.edtValor1);
        EditText edtValor2Prog = (EditText) findViewById(R.id.edtValor2);
        EditText edtResultadoProg = (EditText) findViewById(R.id.edtResultado);


        //Método responsável pela captura do evento de Clique do Botão btnSomar
        //e execução da ação realizada após o clique.
        btnSomarProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Conversão e armazenamento dos caracteres obtidos na interface gráfica
                double num1 = Double.parseDouble(edtValor1Prog.getText().toString());
                double num2 = Double.parseDouble(edtValor2Prog.getText().toString());

                //Soma e armazenamento do resultado
                double resultado = num1 + num2;
                //Retorno para a interface gráfica do resultado
                edtResultadoProg.setText(String.valueOf(resultado));
            }
        });

        //Método responsável pela captura do evento de Clique do Botão btMultiplicar
        //e execução da ação realizada após o clique.
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Conversão e armazenamento dos caracteres obtidos na interface gráfica
                double num1 = Double.parseDouble(edtValor1Prog.getText().toString());
                double num2 = Double.parseDouble(edtValor2Prog.getText().toString());

                //Multiplica e armazenamento do resultado
                double resultado = num1 * num2;
                //Retorno para a interface gráfica do resultado
                edtResultadoProg.setText(String.valueOf(resultado));
            }
        });

        //Método responsável pela captura do evento de Clique do Botão btnSubtrair
        //e execução da ação realizada após o clique.
        btnSubtrairProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Conversão e armazenamento dos caracteres obtidos na interface gráfica
                double num1 = Double.parseDouble(edtValor1Prog.getText().toString());
                double num2 = Double.parseDouble(edtValor2Prog.getText().toString());

                //Subtrai e armazenamento do resultado
                double resultado = num1 - num2;
                //Retorno para a interface gráfica do resultado
                edtResultadoProg.setText(String.valueOf(resultado));
            }
        });

        //Método responsável pela captura do evento de Clique do Botão btnDividir
        //e execução da ação realizada após o clique.
        btnDividirProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Conversão e armazenamento dos caracteres obtidos na interface gráfica
                double num1 = Double.parseDouble(edtValor1Prog.getText().toString());
                double num2 = Double.parseDouble(edtValor2Prog.getText().toString());

                // Divide e armazenamento do resultado
                double resultado = num1 / num2;
                //Retorno para a interface gráfica do resultado
                edtResultadoProg.setText(String.valueOf(resultado));
            }
        });

    }
}
