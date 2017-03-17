package com.inducesmile.simpulogin;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by kenny on 11/29/16.
 */

public class MainActivity extends AppCompatActivity {

    private Button logBtn;
    private EditText emailTxt;
    private EditText passTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logBtn = (Button) findViewById(R.id.LogBtn);
        emailTxt = (EditText) findViewById(R.id.emailTxt);
        passTxt = (EditText) findViewById(R.id.passTxt);


        logBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = emailTxt.getText().toString();
                String password = passTxt.getText().toString();


                if (!email.matches("[a-zA-Z0-9._-]+@[a-z]+.[a-z]+") || password.matches("")) {

                    emailTxt.setError("Invalid Email Address");
                    passTxt.setError("Invalid Password");

                } else if (email.isEmpty() || password.isEmpty()) {

                    //pass the values to ActivityB
                    Intent intent = new Intent(MainActivity.this, ActivityB.class);
                    intent.putExtra("email", email);
                    intent.putExtra("password", password);

                    startActivity(intent);

                }
            }
        });


    }
}
