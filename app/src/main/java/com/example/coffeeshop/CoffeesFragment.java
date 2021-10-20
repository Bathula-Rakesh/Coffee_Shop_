package com.example.coffeeshop;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class CoffeesFragment extends Fragment {

    RecyclerView recyclerView;
    CoffeeModel coffeeModel;
    CoffeeAdapter coffeeAdapter;
    EditText price_edittext;

    List<CoffeeModel> coffeeModels = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_coffees, container, false);
        recyclerView = view.findViewById(R.id.recycler_view_coffee);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));

//        price_edittext = view.findViewById(R.id.pric_ed);

        coffeeAdapter = new CoffeeAdapter(getContext(), coffeeModels);
        recyclerView.setAdapter(coffeeAdapter);
        loadData();
        return view;
    }

    private void loadData() {
        coffeeModel = new CoffeeModel(R.drawable.plus, R.drawable.minus,
                R.drawable.cofe_black, "25", "BLACK EYE");
        coffeeModels.add(coffeeModel);

        coffeeModel = new CoffeeModel(R.drawable.plus, R.drawable.minus,
                R.drawable.cofe_moccha, "50", "MOCCHA");
        coffeeModels.add(coffeeModel);

        coffeeModel = new CoffeeModel(R.drawable.plus, R.drawable.minus,
                R.drawable.cofe_flat, "75", "FLAT WHITE");
        coffeeModels.add(coffeeModel);

        coffeeModel = new CoffeeModel(R.drawable.plus, R.drawable.minus,
                R.drawable.cofe_cafe, "100", "CAFE LATTE");
        coffeeModels.add(coffeeModel);

        coffeeModel = new CoffeeModel(R.drawable.plus, R.drawable.minus,
                R.drawable.coffe_dry, "125", "DRY CAPPUCCINO");
        coffeeModels.add(coffeeModel);

        coffeeModel = new CoffeeModel(R.drawable.plus, R.drawable.minus,
                R.drawable.cofe_cappuccino, "125", "CAPPUCCINO");
        coffeeModels.add(coffeeModel);

        coffeeModel = new CoffeeModel(R.drawable.plus, R.drawable.minus,
                R.drawable.cofe_doppio, "150", "DOPPIO");
        coffeeModels.add(coffeeModel);

        coffeeModel = new CoffeeModel(R.drawable.plus, R.drawable.minus,
                R.drawable.cofe_americano, "175", "AMERICANO");
        coffeeModels.add(coffeeModel);

        coffeeModel = new CoffeeModel(R.drawable.plus, R.drawable.minus,
                R.drawable.cofe_latte, "200", "LATTE");
        coffeeModels.add(coffeeModel);

        coffeeModel = new CoffeeModel(R.drawable.plus, R.drawable.minus,
                R.drawable.cofe_caramel, "225", "CARAMEL MOCCHI");
        coffeeModels.add(coffeeModel);

        coffeeModel = new CoffeeModel(R.drawable.plus, R.drawable.minus,
                R.drawable.cofe_latte, "250", "LATTE MOCCHIATO");
        coffeeModels.add(coffeeModel);

        coffeeModel = new CoffeeModel(R.drawable.plus, R.drawable.minus,
                R.drawable.cofe_espress0, "300", "ESPRESSO");
        coffeeModels.add(coffeeModel);

        coffeeAdapter.notifyDataSetChanged();
    }

}