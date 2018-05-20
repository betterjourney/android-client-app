package com.betterjourney.android.pilot.ui.goals;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.betterjourney.android.pilot.R;

public class GoalsViewFragment extends Fragment {

    private RecyclerView mRecyclerView;

    private GoalsViewAdapter mGoalsViewAdapter;

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.fragment_goals_view);
//
//        mRecyclerView = findViewById(R.id.recyclerview_goals);
//
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
//        mRecyclerView.setLayoutManager(layoutManager);
//        mRecyclerView.setHasFixedSize(true);
//
//        mGoalsViewAdapter = new GoalsViewAdapter();
//        mRecyclerView.setAdapter(mGoalsViewAdapter);
//
//    }
}
