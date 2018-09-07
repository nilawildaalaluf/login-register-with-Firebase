package com.example.irobot.myapplication;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RegistrationActivity extends AppCompatActivity {
    @BindView(R.id.textLogin)TextView textLogin;
    @BindView(R.id.buttonRegister)Button buttonRegister;
    @BindView(R.id.editEmailRegister)EditText editEmailRegister;
    @BindView(R.id.editPasswordRegister)EditText editPasswordRegister;
    @BindView(R.id.editNamaRegister)EditText editNamaRegister;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        ButterKnife.bind(this);
        firebaseAuth = FirebaseAuth.getInstance();


        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent i = new Intent(getApplicationContext(), HomeActivity.class);
//                startActivity(i);
                if(validate()){
                    //Upload to database
                    String user_email = editEmailRegister.getText().toString().trim();
                    String user_Password = editPasswordRegister.getText().toString().trim();
//                    Log.d("e,ail",editEmailRegister);

                    firebaseAuth.createUserWithEmailAndPassword(user_email, user_Password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {

                            if (task.isSuccessful()){
                                Toast.makeText(RegistrationActivity.this, "Registration Successful", Toast.LENGTH_LONG).show();
                                Intent i = new Intent(getApplicationContext(), HomeActivity.class);
                                startActivity(i);
                            }else{
                                Toast.makeText(RegistrationActivity.this, "Registration Failed", Toast.LENGTH_LONG).show();
                            }
                        }
                    });
                }

            }
        });

        textLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(i);
            }
        });
    }

    private Boolean validate() {
        Boolean result = false;

        String name = editNamaRegister.getText().toString();
        String password = editPasswordRegister.getText().toString();
        String email = editEmailRegister.getText().toString();

        if(name.isEmpty() && password.isEmpty() && email.isEmpty()){
            Toast.makeText(this, "Please enter all detail", Toast.LENGTH_LONG).show();
        }else {
            result = true;
        }

        return result;
    }
}
