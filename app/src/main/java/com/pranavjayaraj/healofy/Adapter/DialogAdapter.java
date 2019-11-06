package com.pranavjayaraj.healofy.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.pranavjayaraj.healofy.Data;
import com.pranavjayaraj.healofy.R;

import java.util.Collections;
import java.util.List;

public class DialogAdapter
        extends RecyclerView.Adapter<ViewHolder> {

    List<Data> list
            = Collections.emptyList();

    Context context;


    public DialogAdapter(List<Data> list,
                         Context context)
    {
        this.list = list;
        this.context = context;
    }

    @Override
    public ViewHolder
    onCreateViewHolder(ViewGroup parent,
                       int viewType)
    {

        Context context
                = parent.getContext();
        LayoutInflater inflater
                = LayoutInflater.from(context);

        // Inflate the layout

        View photoView
                = inflater
                .inflate(R.layout.dialogitem,
                        parent, false);

        ViewHolder viewHolder
                = new ViewHolder(photoView);
        return viewHolder;
    }

    @Override
    public void
    onBindViewHolder(final ViewHolder viewHolder,
                     final int position)
    {

        viewHolder.Date
                .setText(list.get(position).date);
        viewHolder.Message
                .setText(list.get(position).message);
    }

    @Override
    public int getItemCount()
    {
        return list.size();
    }

    @Override
    public void onAttachedToRecyclerView(
            RecyclerView recyclerView)
    {
        super.onAttachedToRecyclerView(recyclerView);
    }

    // Sample data for RecyclerView
}