package com.paymu.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String username = "arifeka";
    String password = "0541";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText txtUsername = findViewById(R.id.txtUsername);
        final EditText txtPassword = findViewById(R.id.txtPassword);
        Button login = findViewById(R.id.Login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtUsername.getText().toString().equalsIgnoreCase(username) &&
                        txtPassword.getText().toString().equalsIgnoreCase(password)) {
                    startActivity(new Intent(MainActivity.this, Recovery.class));
                } else {
                    Toast.makeText(MainActivity.this, "Usernaame atau Password salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}