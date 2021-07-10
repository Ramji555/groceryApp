package com.example.grocery;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class SignupForm extends AppCompatActivity {


    TextInputEditText emailEdt, passEdt;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_form);
        emailEdt=findViewById(R.id.emailEdt);
        passEdt=findViewById(R.id.passEdt);

        submit=findViewById(R.id.submit);



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String emailStr=emailEdt.getText().toString().trim();
                String passStr=passEdt.getText().toString().trim();

                Toast.makeText(SignupForm.this, "Signup success", Toast.LENGTH_SHORT).show();
                Intent loginintent=new Intent(SignupForm.this,LogIn.class);
                startActivity(loginintent);
                finish();
            }
        });


    }
}