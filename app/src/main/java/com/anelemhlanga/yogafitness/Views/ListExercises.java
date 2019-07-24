package com.anelemhlanga.yogafitness.Views;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

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
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

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

}
