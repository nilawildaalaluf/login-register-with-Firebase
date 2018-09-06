package com.example.irobot.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity {
    @BindView(R.id.editEmailLogin)EditText emailLogin;
    @BindView(R.id.editPasswordLogin)EditText passwordLogin;
    @BindView(R.id.textRegister)TextView textRegister;
    @BindView(R.id.button_login)Button buttonLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButterKnife.bind(this);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(emailLogin.getText().toString(), passwordLogin.getText().toString());
            }
        });

        textRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), RegistrationActivity.class);
                startActivity(i);
            }
        });
    }
    private void validate(String userName, String userPassword){
        if ((userName.equals("admin")) && (userPassword.equals("12345"))){
            Intent i = new Intent(getApplicationContext(), HomeActivity.class);
            startActivity(i);
        }else {
            Toast.makeText(this, "Error login", Toast.LENGTH_LONG).show();
        }

    }
}
