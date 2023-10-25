package com.example.tms.adapter;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tms.model.Order;
import com.example.tms.viewHolder.OrderViewHolder;

import java.util.List;

public class OrdersAdapter extends RecyclerView.Adapter<OrderViewHolder>{

    private List<Order> orders;
    Context context;

    public OrdersAdapter(Context context, List<Order> orders) {
        super();
        this.orders = orders;
        this.context = context;
    }


    @NonNull
    @Override
    public OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new OrderViewHolder(context, parent);
    }

    @Override
    public void onBindViewHolder(@NonNull OrderViewHolder holder, int position) {
        holder.bind(orders.get(position));
    }

    @Override
    public int getItemCount() {
        return this.orders.size();
    }
}
