package com.pranavjayaraj.healofy.Adapter;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.pranavjayaraj.healofy.R;

public class ViewHolder
        extends RecyclerView.ViewHolder {
    TextView Name;
    TextView Message;
    TextView Date;
    RelativeLayout relativeLayout;

    ViewHolder(View itemView)
    {
        super(itemView);
        Date
                = (TextView)itemView
                .findViewById(R.id.examDate);
        Message
                = (TextView)itemView
                .findViewById(R.id.examMessage);
        relativeLayout = (RelativeLayout)itemView.findViewById(R.id.relative);
    }
}