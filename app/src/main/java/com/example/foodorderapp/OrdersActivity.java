package com.example.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.foodorderapp.Adapters.OrdersAdapter;
import com.example.foodorderapp.Models.OrdersModel;
import com.example.foodorderapp.databinding.ActivityOrdersBinding;

import java.util.ArrayList;

public class OrdersActivity extends AppCompatActivity {

    ActivityOrdersBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        binding=ActivityOrdersBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<OrdersModel> list = new ArrayList<>();

        list.add(new OrdersModel(R.drawable.burger,"Cheese Burger","8","4556556"));
        list.add(new OrdersModel(R.drawable.burger,"No Burger","8","4556556"));
        list.add(new OrdersModel(R.drawable.burger,"Cheese Burger","8","4556556"));
        list.add(new OrdersModel(R.drawable.burger,"Cheese Burger","8","4556556"));
        list.add(new OrdersModel(R.drawable.burger,"Cheese Burger","8","4556556"));
        list.add(new OrdersModel(R.drawable.burger,"Cheese Burger","8","4556556"));
        list.add(new OrdersModel(R.drawable.burger,"Cheese Burger","8","4556556"));
        list.add(new OrdersModel(R.drawable.burger,"Cheese Burger","8","4556556"));


        OrdersAdapter adapter=new OrdersAdapter(list,this);
        binding.orderRecyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        binding.orderRecyclerView.setLayoutManager(layoutManager);
    }
}