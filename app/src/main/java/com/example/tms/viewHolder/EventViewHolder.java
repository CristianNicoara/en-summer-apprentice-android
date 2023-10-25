package com.example.tms.viewHolder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tms.MainActivity;
import com.example.tms.R;
import com.example.tms.model.Event;

public class EventViewHolder extends RecyclerView.ViewHolder {

    ImageView eventImage;

    TextView eventName;
    TextView eventDescription;
    Spinner ticketCategory;
    EditText numberOfTickets;
    Button buyTicketsBtn;
    String[] spinnerData = new String[]{"Standard", "VIP"};
    ArrayAdapter<String> adapter;

    Context context;
    public EventViewHolder(Context context, ViewGroup container) {
        //super(itemView);
        super(LayoutInflater.from(context).inflate(R.layout.event_cell,container, false));
        this.context = context;
        this.eventName = (TextView) itemView.findViewById(R.id.eventName);
        this.eventImage = (ImageView) itemView.findViewById(R.id.eventImage);
        this.eventDescription = (TextView) itemView.findViewById(R.id.eventDescription);
        this.ticketCategory = (Spinner) itemView.findViewById(R.id.selectTicketCategory);
        this.numberOfTickets = (EditText) itemView.findViewById(R.id.numberOfTickets);
        this.buyTicketsBtn = (Button) itemView.findViewById(R.id.buyTickets);

        adapter = new ArrayAdapter<>(context, R.layout.spinner_item, spinnerData);
        adapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
    }

    public void bind(Event event){
        eventName.setText(event.getEventName());
        eventImage.setImageResource(event.getEventImage());
        eventDescription.setText(event.getEventDescription());
        ticketCategory.setAdapter(adapter);
        buyTicketsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Purchase for " + event.getEventName() + " was made", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
