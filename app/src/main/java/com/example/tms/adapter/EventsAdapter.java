package com.example.tms.adapter;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tms.model.Event;
import com.example.tms.viewHolder.EventViewHolder;

import java.util.List;

public class EventsAdapter extends RecyclerView.Adapter<EventViewHolder> {
    private List<Event> events;
    Context context;
    public EventsAdapter(Context context, List<Event> events) {
        super();
        this.events = events;
        this.context = context;
    }

    @NonNull
    @Override
    public EventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new EventViewHolder(context,parent);
    }

    @Override
    public void onBindViewHolder(@NonNull EventViewHolder holder, int position) {
        holder.bind(this.events.get(position));
    }

    @Override
    public int getItemCount() {
        return this.events.size();
    }
}


