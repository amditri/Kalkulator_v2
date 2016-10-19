package com.example.amd.kalkulator_v2;

import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0,
            buttonBagi, buttonHapus, buttonCC, buttonKali, buttonBuka, buttonTutup,
            buttonKurang, buttonX2, buttonRoot, buttonTitik, buttonPersen, buttonTambah, buttonHasil;

    EditText editText;
    float xNilaiX, xNilaiY;
    double xKuadrat, xAkarPangkat;
    boolean xPertambahan, xPengurangan, xPembagian, xPerkalian, xPersentase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button0 = (Button) findViewById(R.id.button0);
        buttonBagi = (Button) findViewById(R.id.buttonBagi);
        buttonHapus = (Button) findViewById(R.id.buttonHapus);
        buttonCC = (Button) findViewById(R.id.buttonCC);
        buttonKali = (Button) findViewById(R.id.buttonKali);
        buttonBuka = (Button) findViewById(R.id.buttonBuka);
        buttonTutup = (Button) findViewById(R.id.buttonTutup);
        buttonKurang = (Button) findViewById(R.id.buttonKurang);
        buttonX2 = (Button) findViewById(R.id.buttonX2);
        buttonRoot = (Button) findViewById(R.id.buttonRoot);
        buttonPersen = (Button) findViewById(R.id.buttonPersen);
        buttonTitik = (Button) findViewById(R.id.buttonTitik);
        buttonTambah = (Button) findViewById(R.id.buttonTambah);
        buttonHasil = (Button) findViewById(R.id.buttonHasil);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
            }
        });

        buttonBuka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "(");
            }
        });

        buttonTutup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + ")");
            }
        });

        buttonTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText == null) {
                    editText.setText("");
                } else {
                    xNilaiX = Float.parseFloat(editText.getText() + "");
                    xPertambahan = true;
                    editText.setText(null);
                }
            }
        });

        buttonKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xNilaiX = Float.parseFloat(editText.getText() + "");
                xPengurangan = true;
                editText.setText(null);
            }
        });

        buttonKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xNilaiX = Float.parseFloat(editText.getText() + "");
                xPerkalian = true;
                editText.setText(null);
            }
        });

        buttonBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xNilaiX = Float.parseFloat(editText.getText() + "");
                xPembagian = true;
                editText.setText(null);
            }
        });

        buttonX2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = editText.getText().toString();
                xKuadrat = Double.parseDouble(x.toString());
                xKuadrat = Math.pow(xKuadrat, 2);
                String answer = Double.toString(xKuadrat);
                editText.setText(answer);
            }

        });

        buttonRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = editText.getText().toString();
                xAkarPangkat = Double.parseDouble(x.toString());
                xAkarPangkat = Math.sqrt(xAkarPangkat);
                String answer = Double.toString(xAkarPangkat);
                editText.setText(answer);
            }
        });

        buttonPersen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xNilaiX = Float.parseFloat(editText.getText() + "");
                xPersentase = true;
                editText.setText(null);
            }
        });

        buttonTitik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + ".");
            }
        });

        buttonHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xNilaiY = Float.parseFloat(editText.getText() + "");

                if (xPertambahan == true) {
                    editText.setText(xNilaiX + xNilaiY + "");
                    xPertambahan = false;
                }

                if (xPengurangan == true) {
                    editText.setText(xNilaiX - xNilaiY + "");
                    xPengurangan = false;
                }

                if (xPerkalian == true) {
                    editText.setText(xNilaiX * xNilaiY + "");
                    xPerkalian = false;
                }

                if (xPembagian == true) {
                    editText.setText(xNilaiX / xNilaiY + "");
                    xPembagian = false;
                }

                if (xPersentase == true) {
                    editText.setText(((xNilaiX / 100) * xNilaiY) + "");
                    xPersentase = false;
                }
            }
        });

        buttonHapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = editText.getText().toString();
                str = str.substring(0, str.length() - 1);
                editText.setText(str);
            }
        });

        buttonCC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });

    }
}