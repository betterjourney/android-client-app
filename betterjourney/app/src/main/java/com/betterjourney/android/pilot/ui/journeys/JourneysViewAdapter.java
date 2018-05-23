package com.betterjourney.android.pilot.ui.journeys;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.betterjourney.android.pilot.R;

/**
 * Created by av7 on 3/17/18.
 */

public class JourneysViewAdapter extends RecyclerView.Adapter<JourneysViewAdapter.JourneysAdapterViewHolder> {

    Context context;
    private String[] mJourneysData;

    public JourneysViewAdapter(Context context) {
        this.context = context;
    }

    @Override
    public JourneysAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.rv_journeys_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, parent, shouldAttachToParentImmediately);
        return new JourneysAdapterViewHolder(view);
    }

    class JourneysAdapterViewHolder extends RecyclerView.ViewHolder {

        public final TextView mGoalTextView;
        public final ImageView mGoalImageView;
        public final ProgressBar mGoalProgressBar;

        public JourneysAdapterViewHolder(View itemView) {
            super(itemView);
            mGoalTextView = itemView.findViewById(R.id.tv_journey_item);
            mGoalImageView = itemView.findViewById(R.id.iv_journey_item);
            mGoalProgressBar = itemView.findViewById(R.id.pb_journey_item);
        }
    }

    @Override
    public void onBindViewHolder(JourneysAdapterViewHolder holder, int position) {
        String journeysForToday = mJourneysData[position];
        holder.mGoalTextView.setText(journeysForToday);
//        holder.mGoalProgressBar.getProgress();
//        holder.mGoalImageView.getDrawable();
    }

    @Override
    public int getItemCount() {
        if (null == mJourneysData) return 0;
        return mJourneysData.length;
    }

    public void setJourneysData(String[] journeysData) {
        mJourneysData = journeysData;
        notifyDataSetChanged();
    }
}
