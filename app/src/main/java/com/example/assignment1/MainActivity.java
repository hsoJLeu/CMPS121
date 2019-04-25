package com.example.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void goToBike(View view){
        Intent intent = new Intent(this, bikingActivity.class);
        startActivity(intent);
    }
    public void goToCook(View view){
        Intent intent = new Intent(this, cookingActivity.class);
        startActivity(intent);
    }
}