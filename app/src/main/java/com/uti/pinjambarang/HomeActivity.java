package com.uti.pinjambarang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button btnForm, btnDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnForm = (Button) findViewById(R.id.btnForm);
        btnDaftar = (Button) findViewById(R.id.btnDaftar);

        btnForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnForm = new Intent(HomeActivity.this, FormActivity.class);
                startActivity(btnForm);
            }
        });

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnDaftar = new Intent(HomeActivity.this, DaftarActivity.class);
                startActivity(btnDaftar);
            }
        });
    }
}