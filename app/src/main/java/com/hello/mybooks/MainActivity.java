package com.hello.mybooks;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button btnallbooks, btncurrent, btnred, btnwanted, btnfav, btnabout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        btnallbooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AllBooksActivity.class);
                startActivity(intent);
            }
        });
    }
    private void initViews(){
        btnallbooks = findViewById(R.id.btnallbooks);
        btncurrent = findViewById(R.id.btncurrent);
        btnred = findViewById(R.id.btnred);
        btnwanted = findViewById(R.id.btnwanted);
        btnfav = findViewById(R.id.btnfav);
        btnabout = findViewById(R.id.btnabout);
    }
}