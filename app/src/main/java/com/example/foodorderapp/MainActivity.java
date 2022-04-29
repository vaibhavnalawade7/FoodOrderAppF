package com.example.foodorderapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.foodorderapp.Adapters.MainAdapter;
import com.example.foodorderapp.Models.MainModel;
import com.example.foodorderapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


     ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        ArrayList<MainModel> list =new ArrayList<>();
        list.add(new MainModel(R.drawable.burger,"Burger","Chiken burger with extra Cheese","50"));
        list.add(new MainModel(R.drawable.chiken,"Chiken","This spicy chicken curry recipe is a must-try","100"));
        list.add(new MainModel(R.drawable.pizza,"Pizza","Fresh pizza","66"));
        list.add(new MainModel(R.drawable.sandwich,"Sandwich","Sandwich with extra Cheese","20"));
        list.add(new MainModel(R.drawable.vadapav,"Vadapav","Testy Vadapav","5"));

        MainAdapter adapter=new MainAdapter(list,this);
        binding.recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        binding.recyclerView.setLayoutManager(layoutManager);






    }
}