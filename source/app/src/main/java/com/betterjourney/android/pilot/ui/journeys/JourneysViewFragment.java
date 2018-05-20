package com.betterjourney.android.pilot.ui.journeys;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.betterjourney.android.pilot.R;


public class JourneysViewFragment extends Fragment {

    String[] mDemoData  = {"Journey 1", "Journey 2", "Journey 3", "Journey 4", "Journey 5", "Journey 6", "Journey 7", "Journey 8",
            "Journey 9", "Journey 10", };


    public static JourneysViewFragment newInstance() {
        return new JourneysViewFragment();
    }

    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_journeys_view, container, false);
        RecyclerView mRecyclerView = rootView.findViewById(R.id.rv_journeys);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this.getActivity(), LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setHasFixedSize(true);

       JourneysViewAdapter mJourneysViewAdapter = new JourneysViewAdapter(this.getActivity());
        mJourneysViewAdapter.setJourneysData(mDemoData);
        mRecyclerView.setAdapter(mJourneysViewAdapter);

        return rootView;
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
