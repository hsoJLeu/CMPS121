package com.example.assignment1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class codingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coding);
    }

    public void goBack(View view){
        Intent intent= new Intent(this, MainActivity.class);
        startActivity(intent);

    }
    public void delete(View view){
        SharedPreferences shared = getSharedPreferences("Prefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = shared.edit();
        editor.putBoolean("codingKey", true);
        editor.apply();

        String keyStatus = Boolean.toString(shared.getBoolean("codingKey", true));
        Log.d("DELETE", "**********getBoolean called************");
        Log.d("DELETE", "**********"+ keyStatus + "************");


        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
