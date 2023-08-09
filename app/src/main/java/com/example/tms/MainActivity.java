package com.example.tms;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tms.adapter.EventsAdapter;
import com.example.tms.model.Event;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView eventsRecyclerView;
    private List<Event> events = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eventsRecyclerView = findViewById(R.id.eventRecyclerView);
        eventsRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        events = new ArrayList<>();
        Event event1 = new Event("Untold", "Muzica Electronica si nu numai", R.drawable._untold1);
        Event event2 = new Event("Electric Castle", "Muzica Electronica si nu numai", R.drawable.electric_castle1);
        Event event3 = new Event("Football", "Meci de fotbal", R.drawable._football);
        Event event4 = new Event("Wine Festival", "Festival de vin", R.drawable.wine_festival);
//        event1.setEventDescription("Muzica Electronica si nu numai");
//        event2.setEventDescription("Muzica Electronica si nu numai");
//        event3.setEventDescription("Meci de fotbal");
//        event4.setEventDescription("Festival de vin");
//        event1.setEventImage(R.drawable._untold);
//        event2.setEventImage(R.drawable.electric_castle);
//        event3.setEventImage(R.drawable._football);
//        event4.setEventImage(R.drawable.wine_festival);
        events.add(event1);
        events.add(event2);
        events.add(event3);
        events.add(event4);

        eventsRecyclerView.setAdapter(new EventsAdapter(MainActivity.this, events));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.account) {
            showPopUpMenu();
            return true;
        }
        if (id == R.id.view_orders) {
            Toast.makeText(this, "Going to the orders page", Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
//        switch (item.getItemId()){
//            case R.id.account:
//                showPopUpMenu();
//                return true;
//            case R.id.view_orders:
//                Toast.makeText(this, "Going to the orders page", Toast.LENGTH_SHORT).show();
//                return true;
//
//            default:
//                return super.onOptionsItemSelected(item);
//
//        }
    }

    private void showPopUpMenu(){
        PopupMenu popupMenu = new PopupMenu(this, findViewById(R.id.toolbar), Gravity.END);
        popupMenu.getMenuInflater().inflate(R.menu.account_popup, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(this::onPopupMenuItemClick);
        popupMenu.show();
    }

    private boolean onPopupMenuItemClick(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.view_orders) {
            //Toast.makeText(this, "Going to the orders page", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, OrdersActivity.class);
            startActivity(intent);
            return true;
        }
        return false;
//        switch (id){
//            case R.id.view_orders:
//                Toast.makeText(this, "Going to the orders page", Toast.LENGTH_SHORT).show();
//                return true;
//
//            default:
//                return false;
    }
}
