package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class cookingActivity extends AppCompatActivity {
        Intent intent;
        MainActivity cookInstance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cooking);
    }
    public void goBack(View view){
        intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
    public void delete(View view){
        cookInstance.setCookKey();

        intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}