package com.example.loginpage;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        TextView signup=findViewById(R.id.signup);
        Typeface mycustomefont = Typeface.createFromAsset(getAssets(), "ARLRDBD.ttf");
        signup.setTypeface(mycustomefont);

    }
}
