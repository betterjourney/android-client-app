package com.betterjourney.android.pilot.ui.goals;

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

public class GoalsAdapter extends RecyclerView.Adapter<GoalsAdapter.GoalsAdapterViewHolder> {

    private String[] mGoalsData;

    public GoalsAdapter() {

    }

    @Override
    public GoalsAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.goals_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, parent, shouldAttachToParentImmediately);
        return new GoalsAdapterViewHolder(view);
    }

    class GoalsAdapterViewHolder extends RecyclerView.ViewHolder {

        public final TextView mGoalTextView;
        public final ImageView mGoalImageView;
        public final ProgressBar mGoalProgressBar;

        public GoalsAdapterViewHolder(View itemView) {
            super(itemView);
            mGoalTextView = itemView.findViewById(R.id.rv_list_item_text_view);
            mGoalImageView = itemView.findViewById(R.id.rv_list_item_image_view);
            mGoalProgressBar = itemView.findViewById(R.id.rv_list_item_progress_bar);
        }
    }

    @Override
    public void onBindViewHolder(GoalsAdapterViewHolder holder, int position) {
        String goalsForToday = mGoalsData[position];
        holder.mGoalTextView.setText(goalsForToday);
        holder.mGoalProgressBar.getProgress();
        holder.mGoalImageView.getDrawable();
    }

    @Override
    public int getItemCount() {
        if (null == mGoalsData) return 0;
        return mGoalsData.length;
    }

    public void setGoalsData(String[] goalsData) {
        mGoalsData = goalsData;
        notifyDataSetChanged();
    }
}
