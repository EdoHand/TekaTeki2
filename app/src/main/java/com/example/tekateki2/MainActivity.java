package com.example.tekateki2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText password;
    private EditText username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("admin") || password.getText().toString().equals("admin")) {
                    Intent i = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(i);
                } else {
                    Toast.makeText(MainActivity.this, "username atau password salah !", Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        });
    }
}
