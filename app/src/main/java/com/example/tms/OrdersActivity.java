package com.example.tms;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tms.adapter.EventsAdapter;
import com.example.tms.adapter.OrdersAdapter;
import com.example.tms.model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrdersActivity extends AppCompatActivity {

    RecyclerView ordersRecyclerView;

    List<Order> orders = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);
        ordersRecyclerView = findViewById(R.id.orderRecyclerView);
        ordersRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        Order order1 = new Order(1,"Wine Festival", "Standard", "21-06-1984", 5, 350.0);
        Order order2 = new Order(2,"Untold", "VIP", "21-07-2023", 3, 4500.0);
        Order order3 = new Order(3,"Electric Castle", "VIP", "23-07-2023", 4, 4800.0);

        orders.add(order1);
        orders.add(order2);
        orders.add(order3);

        ordersRecyclerView.setAdapter(new OrdersAdapter(OrdersActivity.this, orders));
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
            Toast.makeText(this, "Seing account options", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == 16908332){
            Intent intent = new Intent(OrdersActivity.this, MainActivity.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.view_orders) {
            Toast.makeText(this, "Going to the orders page", Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }
}
