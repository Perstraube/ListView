package com.contairnes.apix.miprimerproyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNumero1, etNumero2;
    Button btnSuma, btnResta, btnMultiplicacion, btnDivision, btnResiduo;
    TextView tvResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNumero1 = (EditText) findViewById(R.id.editText);
        etNumero2 = (EditText) findViewById(R.id.editText2);

        btnSuma = (Button) findViewById(R.id.button);
        btnResta = (Button) findViewById(R.id.button2);
        btnMultiplicacion = (Button) findViewById(R.id.button3);
        btnDivision = (Button) findViewById(R.id.button4);
        btnResiduo = (Button) findViewById(R.id.button5);

        tvResultado = (TextView) findViewById(R.id.textView);

        btnSuma.setOnClickListener(new OnClicklistenerSuma());
        btnResta.setOnClickListener(new OnClicklistenerResta());
        btnMultiplicacion.setOnClickListener(new OnClicklistenerMultiplicacion());
        btnDivision.setOnClickListener(new OnClicklistenerDivision());
        btnResiduo.setOnClickListener(new OnclicklistenerResiduo());
    }




    private class OnClicklistenerSuma implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            int numero1 = Integer.parseInt(etNumero1.getText().toString());
            int numero2 = Integer.parseInt(etNumero2.getText().toString());
            int res = numero1 + numero2;
            tvResultado.setText("Resultado: " + String.valueOf(res));


        }
    }

    private class OnClicklistenerResta implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            int numero1 = Integer.parseInt(etNumero1.getText().toString());
            int numero2 = Integer.parseInt(etNumero2.getText().toString());
            int res = numero1 - numero2;
            tvResultado.setText("Resultado: " + String.valueOf(res));

        }


    }

    private class OnClicklistenerMultiplicacion implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            int numero1 = Integer.parseInt(etNumero1.getText().toString());
            int numero2 = Integer.parseInt(etNumero2.getText().toString());
            int res = numero1 * numero2;
            tvResultado.setText("Resultado: " + String.valueOf(res));

        }
    }

    private class OnClicklistenerDivision implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            int numero1 = Integer.parseInt(etNumero1.getText().toString());
            int numero2 = Integer.parseInt(etNumero2.getText().toString());
            int res = numero1 / numero2;
            tvResultado.setText("Resultado: " + String.valueOf(res));

        }
    }

    private class OnclicklistenerResiduo implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            int numero1 = Integer.parseInt(etNumero1.getText().toString());
            int numero2 = Integer.parseInt(etNumero2.getText().toString());
            int res = numero1 % numero2;
            tvResultado.setText("Resultado: " + String.valueOf(res));

        }
    }
}


