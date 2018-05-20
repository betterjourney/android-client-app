package com.betterjourney.android.pilot.ui.journeys;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.betterjourney.android.pilot.R;


public class JourneysViewFragment extends Fragment {

    public static JourneysViewFragment newInstance() {
        JourneysViewFragment journeysViewFragment = new JourneysViewFragment();
        return journeysViewFragment;
    }

    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_journeys_view, container, false);
    }

//    private RecyclerView mRecyclerView;
//
//    private JourneysViewAdapter mJourneysViewAdapter;
//
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
//        mJourneysViewAdapter = new JourneysViewAdapter();
//        mRecyclerView.setAdapter(mJourneysViewAdapter);
//
//    }
}
