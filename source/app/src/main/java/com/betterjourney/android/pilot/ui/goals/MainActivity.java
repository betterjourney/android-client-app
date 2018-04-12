package com.betterjourney.android.pilot.ui.goals;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.betterjourney.android.pilot.R;
import com.betterjourney.android.pilot.ui.goals.GoalsAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    private GoalsAdapter mGoalsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerview_goals);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setHasFixedSize(true);

        mGoalsAdapter = new GoalsAdapter();
        mRecyclerView.setAdapter(mGoalsAdapter);

    }
}
