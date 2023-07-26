package com.example.loginregistro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class registro extends AppCompatActivity {

    EditText eTnombres;
    EditText eTapellidos;
    EditText eTusuarioRegistro;
    EditText eTcorreo;
    EditText eTtelefono;
    EditText eTfechaNacimiento;
    RadioButton rBmasculino;
    RadioButton rBfemenino;
    RadioButton rBotro;
    EditText eTdireccion;
    EditText eTpassRegistro;
    EditText eTconfirmPassRegistro;
    Button btnRegistrarme;
    Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        eTnombres = (EditText) findViewById(R.id.eTnombres);
        eTapellidos = (EditText) findViewById(R.id.eTapellidos);
        eTusuarioRegistro = (EditText) findViewById(R.id.eTusuarioRegistro);
        eTcorreo = (EditText) findViewById(R.id.eTcorreo);
        eTtelefono = (EditText) findViewById(R.id.eTtelefono);
        eTfechaNacimiento = (EditText) findViewById(R.id.eTfechaNacimiento);
        rBmasculino = (RadioButton) findViewById(R.id.rBmasculino);
        rBfemenino = (RadioButton) findViewById(R.id.rBfemenino);
        rBotro = (RadioButton) findViewById(R.id.rBotro);
        eTdireccion = (EditText) findViewById(R.id.eTdireccion);
        eTpassRegistro = (EditText) findViewById(R.id.eTpassRegistro);
        eTconfirmPassRegistro = (EditText) findViewById(R.id.eTconfirmPassRegistro);
        btnRegistrarme= (Button) findViewById(R.id.btnRegistrarme);
        btnRegresar= (Button) findViewById(R.id.btnRegresar);

        btnRegistrarme.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String textNombre = eTnombres.getText().toString();
                String textApellido = eTapellidos.getText().toString();
                String textUsuarioRegistro = eTusuarioRegistro.getText().toString();
                String textCorreo = eTcorreo.getText().toString();
                String textTelefono = eTtelefono.getText().toString();
                String textFechaNacimiento = eTfechaNacimiento.getText().toString();
                String textDireccion = eTdireccion.getText().toString();
                String textRBMasculino = rBmasculino.getText().toString();
                String textRBFemenino = rBfemenino.getText().toString();
                String textRBOtro = rBotro.getText().toString();
                String info = "Nombre: " + textNombre
                        + "\nApellido: " + textApellido
                        + "\nUsuario: " + textUsuarioRegistro
                        + "\nCorreo: " + textCorreo
                        + "\nTeléfono: " + textTelefono
                        + "\nFecha de nacimiento: " + textFechaNacimiento
                        + "\nDirección: " + textDireccion;
                if (eTnombres.getText().toString().isEmpty() || eTapellidos.getText().toString().isEmpty()
                || eTusuarioRegistro.getText().toString().isEmpty() || eTcorreo.getText().toString().isEmpty()
                || eTcorreo.getText().toString().isEmpty() || eTtelefono.getText().toString().isEmpty()
                || eTfechaNacimiento.getText().toString().isEmpty() || (!rBmasculino.isChecked() && !rBfemenino.isChecked() && !rBotro.isChecked()) || eTdireccion.getText().toString().isEmpty()
                || eTpassRegistro.getText().toString().isEmpty() || eTconfirmPassRegistro.getText().toString().isEmpty()){
                    Toast.makeText(registro.this, "Por favor llene todos los campos", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(registro.this, info, Toast.LENGTH_LONG).show();
                }

            }
        });

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(registro.this, MainActivity.class));
            }
        });
    }
}