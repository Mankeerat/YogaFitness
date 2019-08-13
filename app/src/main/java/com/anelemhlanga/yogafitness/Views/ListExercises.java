package com.anelemhlanga.yogafitness.Views;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


import com.anelemhlanga.yogafitness.Adapter.RecyclerViewAdapter;
import com.anelemhlanga.yogafitness.Model.Exercise;
import com.anelemhlanga.yogafitness.R;

import java.util.ArrayList;
import java.util.List;

public class ListExercises extends AppCompatActivity {

    List<Exercise> exerciseList = new ArrayList<>();
    RecyclerView.LayoutManager layoutManager;
    RecyclerView recyclerView;
    RecyclerViewAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_exercises);

        startExercise();

        recyclerView = findViewById(R.id.list_ex);
        adapter = new RecyclerViewAdapter(exerciseList, getBaseContext());
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    private void startExercise() {

        exerciseList.add(new Exercise(R.drawable.chair_pose, "Chair"));
        exerciseList.add(new Exercise(R.drawable.chaturanga, "Chaturanga"));
        exerciseList.add(new Exercise(R.drawable.down_dog, "Downward Facing Dog"));
        exerciseList.add(new Exercise(R.drawable.high_lunge, "High Lunge"));
        exerciseList.add(new Exercise(R.drawable.peaceful_warrior, "Peaceful Warrior"));
        exerciseList.add(new Exercise(R.drawable.plank_pose_yoga, "Plank"));
        exerciseList.add(new Exercise(R.drawable.savasana_pose, "Resting Pose-Savasana"));
        exerciseList.add(new Exercise(R.drawable.standing_forward_bend, "Standing Forward Bend"));
        exerciseList.add(new Exercise(R.drawable.three_legged_dog_yoga_pose, "Three Legged Dog"));
        exerciseList.add(new Exercise(R.drawable.upward_facing_dog, "Upward Facing Dog"));
        exerciseList.add(new Exercise(R.drawable.warrior_2, "Warrior II"));
        exerciseList.add(new Exercise(R.drawable.warrior_3, "Warrior III"));
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
