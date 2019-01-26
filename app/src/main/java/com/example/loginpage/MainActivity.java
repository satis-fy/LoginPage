package com.example.loginpage;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView login=findViewById(R.id.login);
        Typeface mycustomefont = Typeface.createFromAsset(getAssets(), "ARLRDBD.ttf");
        login.setTypeface(mycustomefont);

        Button loginbutton=findViewById(R.id.loginbutton);
        Typeface loginbuttoncustomfont = Typeface.createFromAsset(getAssets(), "ARLRDBD.ttf");
        loginbutton.setTypeface(loginbuttoncustomfont);

        Button signup=findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, com.example.loginpage.signup.class);
                startActivity(i);
            }
        });

    }
}
