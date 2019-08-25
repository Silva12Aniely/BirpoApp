package com.example.birpoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button login;
    EditText txtuser, txtpass;

    public static final String EXTRA_MESSAGE = "BirpoApp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (Button) findViewById(R.id.btn_login);
        txtuser = (EditText) findViewById(R.id.edt_Login);
        txtpass = (EditText) findViewById(R.id.edt_senha);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user, pass;

                user = txtuser.getText().toString();
                pass = txtpass.getText().toString();

                if (user.equals("admin") && pass.equals("password")) {
                    Intent intent = new Intent(getApplicationContext(), Produtos_Activity.class);

                    String message = txtuser.getText().toString();
                    intent.putExtra(EXTRA_MESSAGE, message);

                    startActivity(intent);
                    finish();
                }else {
                    Toast.makeText(getApplicationContext(), "Usuário e Senha Inválidos!", Toast.LENGTH_LONG).show();
                    txtuser.setText("");
                    txtpass.setText("");
                    txtuser.requestFocus();
                }
            }
        });

    }
}
