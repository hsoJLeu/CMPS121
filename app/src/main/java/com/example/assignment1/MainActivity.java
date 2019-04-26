package com.example.assignment1;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public SharedPreferences sh;
    public SharedPreferences.Editor editor;

    public final static String Prefs = "Prefs";
    public final static String Cook = "cookingKey";
    public final static String Bike = "bikingKey";
    public final static String Code = "codingKey";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnBike = findViewById(R.id.btnBike);
        Button btnCook = findViewById(R.id.btnCook);
        Button btnCode = findViewById(R.id.btnCode);

        //Instantiate sharedPreference managers
        sh     = getSharedPreferences(Prefs, MODE_PRIVATE);
        editor = sh.edit();

        // Check if sharedprefs for activities are false
        if(sh.getBoolean(Cook, false) == true){
            btnCook.setVisibility(View.INVISIBLE);
        }
        if (sh.getBoolean(Code, false) == true){
            btnCode.setVisibility(View.INVISIBLE);

        }
        if(sh.getBoolean(Bike, false) == true) {
            btnBike.setVisibility(View.INVISIBLE);
        }
    }

    public void goToBike(View view){
        Intent intent = new Intent(this, bikingActivity.class);
        startActivity(intent);
    }
    public void goToCook(View view){
        Intent intent = new Intent(this, cookingActivity.class);
        startActivity(intent);
    }
    public void goToCode(View view){
        Intent intent = new Intent(this, codingActivity.class);
        startActivity(intent);
    }
    public void exitApp(View view){
        Intent home = new Intent(Intent.ACTION_MAIN);
        home.addCategory( Intent.CATEGORY_HOME );
        home.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(home);

    }
}