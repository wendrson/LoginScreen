package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    RelativeLayout login_button;
    TextView register_text_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setType();
        loginOnClick();
        registerOnClick();
        
    }

    private void registerOnClick() {
        register_text_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getString(R.string.you_are_not_a_member_register), Toast.LENGTH_LONG).show();
            }
        });
    }

    private void loginOnClick() {
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });
    }

    private void setType() {
        login_button = findViewById(R.id.login_button);
        register_text_view = findViewById(R.id.register_text_view);
    }
}
