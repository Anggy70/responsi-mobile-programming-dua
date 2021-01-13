package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button login;
    String getuser, getpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView gambar = findViewById(R.id.gambar);
        gambar.setImageResource(R.drawable.usericon);
        atribut();
        login();
    }

    public void atribut() {
        username = findViewById(R.id.user);
        username.getText();
        password= findViewById(R.id.pass);
        password.getText();
        login = findViewById((R.id.login));

        getuser = "amikom";
        getpass = "amikom";

    }

    public void login() {
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == login)
                    if (username.getText().toString().equals(getuser) || password.getText().toString().equals(getpass)) {
                        username.setText("amikom");
                        password.setText("amikom");
                        Toast.makeText(getApplicationContext(), "Berhasil Login", Toast.LENGTH_LONG).show();
                        Intent i = new Intent(MainActivity.this, CrudDataBase.class);
                        startActivity(i);

                    } else {
                        Toast.makeText(getApplicationContext(), "Username dan Password Anda Salah", Toast.LENGTH_LONG).show();
                    }
            }
        });
    }

}