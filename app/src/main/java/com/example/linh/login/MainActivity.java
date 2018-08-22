package com.example.linh.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnThoat;
    Button btnHello;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnThoat = findViewById(R.id.btnThoat);
        btnHello = findViewById(R.id.btnHello);
        editText = findViewById(R.id.editText);

        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sayHello = "Xin chào: "+editText.getText().toString();
                Toast.makeText(MainActivity.this, sayHello, Toast.LENGTH_LONG).show();
            }
        });
    }
}
