package com.example.tms.viewHolder;

import android.content.Context;
import android.os.Trace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.tms.R;
import com.example.tms.model.Order;

public class OrderViewHolder extends RecyclerView.ViewHolder {

    private TextView orderNumber;
    private TextView eventName;
    private TextView ticketCategory;
    private TextView orderDate;
    private TextView numberOfTickets;
    private TextView totalPrice;
    private Button editButton;
    private Button deleteButton;

    Context context;

    public OrderViewHolder(Context context, ViewGroup container) {
        super(LayoutInflater.from(context).inflate(R.layout.order_cell,container, false));
        this.context = context;
        this.orderNumber = (TextView) itemView.findViewById(R.id.orderNumber);
        this.eventName = (TextView) itemView.findViewById(R.id.orderEventName);
        this.ticketCategory = (TextView) itemView.findViewById(R.id.orderTicketType);
        this.orderDate = (TextView) itemView.findViewById(R.id.orderDate);
        this.numberOfTickets = (TextView) itemView.findViewById(R.id.orderNumberOfTickets);
        this.totalPrice = (TextView) itemView.findViewById(R.id.orderPrice);
        this.editButton = (Button) itemView.findViewById(R.id.editButton);
        this.deleteButton = (Button) itemView.findViewById(R.id.deleteButton);
    }

    public void bind(Order order){
        orderNumber.setText("Order " + order.getOrderNumber());
        eventName.setText(order.getEventName());
        ticketCategory.setText(order.getTicketCategory() + " Ticket");
        orderDate.setText("Order made at: " + order.getOrderTime());
        numberOfTickets.setText("Tickets bought: " + order.getNumberOfTickets());
        totalPrice.setText("Total paid: " + order.getTotalPrice());
        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Going to edit order number " + order.getOrderNumber(), Toast.LENGTH_SHORT).show();
            }
        });
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Going to delete order number " + order.getOrderNumber(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
