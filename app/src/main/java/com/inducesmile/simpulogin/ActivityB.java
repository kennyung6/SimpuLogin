package com.inducesmile.simpulogin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by kenny on 11/29/16.
 */

public class ActivityB extends AppCompatActivity {

    private TextView textTip;
    private TextView textTip2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);


        //Glue the TextViews to the activity
        textTip = (TextView) findViewById(R.id.textTip);
        textTip2 = (TextView) findViewById(R.id.textTip2);


        //Function to get data from Activity A
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if (bundle != null) {
            String email = (String) bundle.get("email");
            String password = (String) bundle.get("password");
            textTip.setText(email);
            textTip2.setText(password);
        }
    }
}
