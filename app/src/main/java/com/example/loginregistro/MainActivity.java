package com.example.loginregistro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    EditText eTusuario;
    EditText eTpass;
    Button btnLogin;

    TextView btnRegistrarse;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eTusuario = (EditText) findViewById(R.id.eTusuario);
        eTpass = (EditText) findViewById(R.id.eTpass);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnRegistrarse = (TextView) findViewById(R.id.btnRegistrarse);

        btnRegistrarse.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, registro.class));
            }
        });

        //Toast.makeText(this, leer1, Toast.LENGTH_SHORT).show();



    }
}