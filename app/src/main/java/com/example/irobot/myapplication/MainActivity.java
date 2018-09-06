package com.example.irobot.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//    Button button_login;
    Button button_tambah;
    EditText editText_angka1, editText_angka2;
    TextView text_hasil;
    Integer angka1, angka2, hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        button_login  = (Button) findViewById(R.id.button_login);
//        button_login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(getApplicationContext(), HomeActivity.class);
//                startActivity(i);
//            }
//        });

        button_tambah = (Button) findViewById(R.id.button_hitung);
        editText_angka1 = (EditText) findViewById(R.id.text_angka1);
        editText_angka2 = (EditText) findViewById(R.id.text_angka2);
        text_hasil = (TextView) findViewById(R.id.text_hasil);

        button_tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                HasilTambah();

            }
        });

    }

    private void HasilTambah() {
        angka1 = Integer.parseInt(editText_angka1.getText().toString());
        angka2 = Integer.parseInt(editText_angka2.getText().toString());

        hasil = angka1 + angka2;

        text_hasil.setText(String.valueOf(hasil));
    }
}
