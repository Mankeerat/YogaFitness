package com.anelemhlanga.yogafitness.Views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.anelemhlanga.yogafitness.R;
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

public class LaunchingView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_launching_view);
    }
}
