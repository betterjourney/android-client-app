package com.betterjourney.android.pilot.ui.messages;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.betterjourney.android.pilot.R;

public class MessagesViewAdapter extends RecyclerView.Adapter<MessagesViewAdapter.MessagesAdapterViewHolder> {

    Context context;
    private String[] mUserNameMessageData;
    private String[] mMessageContentData;

    public MessagesViewAdapter(Context context) {
        this.context = context;
    }

    @Override
    public MessagesAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            Context context = parent.getContext();
            int layoutIdForListItem = R.layout.rv_messages_list_item;
            LayoutInflater inflater = LayoutInflater.from(context);
            boolean shouldAttachToParentImmediately = false;

            View view = inflater.inflate(layoutIdForListItem, parent, shouldAttachToParentImmediately);
            return new MessagesAdapterViewHolder(view);
        }

    class MessagesAdapterViewHolder extends RecyclerView.ViewHolder {

        public final TextView mMessageHeadingTextView;
        public final ImageView mMessageUserImage;
        public final TextView mMessageContentTextView;

        public MessagesAdapterViewHolder(View itemView) {
            super(itemView);
            mMessageHeadingTextView = itemView.findViewById(R.id.tv_message_heading_item);
            mMessageUserImage = itemView.findViewById(R.id.iv_message_user_item);
            mMessageContentTextView = itemView.findViewById(R.id.tv_message_content_item);
        }
    }

    @Override
    public void onBindViewHolder(MessagesAdapterViewHolder holder, int position) {
        String userNamesMessages = mUserNameMessageData[position];
        String messagesContent = mMessageContentData[position];
        holder.mMessageHeadingTextView.setText(userNamesMessages);
        holder.mMessageContentTextView.setText(messagesContent);
    }

    @Override
    public int getItemCount() {
        if (null == mUserNameMessageData) return 0;
        return mUserNameMessageData.length;
    }

    public void setMessagesData(String[] userNamesMessagesData, String[] messageContentData) {
        mUserNameMessageData = userNamesMessagesData;
        mMessageContentData = messageContentData;
        notifyDataSetChanged();
    }
}
