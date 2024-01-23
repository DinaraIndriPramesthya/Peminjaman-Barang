package com.uti.pinjambarang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    Button btnMasuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnMasuk = (Button) findViewById(R.id.btnMasuk);
        btnMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginUser();
            }
        });
    }

    public void loginUser() {
        Intent btnMasuk = new Intent(this, HomeActivity.class);
        startActivity(btnMasuk);
    }

    public void onRegisterCliked(View view) {
        Intent Register = new Intent(this, RegisterActivity.class);
        startActivity(Register);
    }
}