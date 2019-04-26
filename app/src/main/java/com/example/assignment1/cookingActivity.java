package com.example.assignment1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class cookingActivity extends AppCompatActivity {
        Intent intent;
//        MainActivity main;

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
        SharedPreferences shared = getSharedPreferences("Prefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = shared.edit();
        editor.putBoolean("cookingKey", true);
        editor.apply();

        String keyStatus = Boolean.toString(shared.getBoolean("cookingKey", true));
        Log.d("DELETE", "**********getBoolean called************");
        Log.d("DELETE", "**********"+ keyStatus + "************");

        intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}