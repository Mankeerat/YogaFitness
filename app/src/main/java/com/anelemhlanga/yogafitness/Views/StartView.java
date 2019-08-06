package com.anelemhlanga.yogafitness.Views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.anelemhlanga.yogafitness.R;

public class StartView extends AppCompatActivity {

    private Button btnExercises;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_view);

        btnExercises = findViewById(R.id.btnExercises);
        btnExercises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startExtercise = new Intent(getApplicationContext(), ListExercises.class);
                startActivity(startExtercise);
            }
        });

        imageView = findViewById(R.id.btnTraining);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startExtercise = new Intent(getApplicationContext(), ListExercises.class);
                startActivity(startExtercise);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public  boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if (id == R.id.action_alarm){
            Intent startExtercise = new Intent(getApplicationContext(), AlarmView.class);
            startActivity(startExtercise);
            return true;
        }

        return super.onOptionsItemSelected(item);

    }

}
