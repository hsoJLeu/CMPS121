package com.example.assignment1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.SharedPreferences.Editor;

public class bikingActivity extends AppCompatActivity {

    Button btnOk;
    Button btnDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biking);

        btnOk     = findViewById(R.id.btnOk);
        btnDelete =  findViewById(R.id.btnDelete);

    }

    public void delete(View view){


    }
    public void goBack(View view){
        Intent intent= new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}
