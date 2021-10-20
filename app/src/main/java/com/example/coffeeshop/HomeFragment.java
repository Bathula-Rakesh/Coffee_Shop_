package com.example.coffeeshop;

import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    RecyclerView recyclerView;
    List<HomeModel> homeModels = new ArrayList<>();
    HomeAdapter homeAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView =view.findViewById(R.id.home_recycler);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),homeModels));
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));

        loaddata();
        homeAdapter = new HomeAdapter(getContext(),homeModels);
        recyclerView.setAdapter(homeAdapter);
        return view;
    }

    private List<HomeModel> loaddata() {
        homeModels = new ArrayList<>();
        homeModels.add(new HomeModel(R.drawable.cofe_black,"BLACK EYE","It helps shrinking blood vessels that remove water."));
        homeModels.add(new HomeModel(R.drawable.cofe_moccha,"MOCCHA","It provides instant energy."));
        homeModels.add(new HomeModel(R.drawable.cofe_flat,"FLAT WHITE"," It contains antioxidants,it will lower type-2 diabetes. "));
        homeModels.add(new HomeModel(R.drawable.cofe_cafe,"CAFE LATTE"," Lattes are known for decreasing the risk of type 2 diabetes."));
        homeModels.add(new HomeModel(R.drawable.coffe_dry,"DRY CAPPUCCINO","It significantly prevent the oxidization of bad cholesterol."));
        homeModels.add(new HomeModel(R.drawable.cofe_cappuccino,"CAPPUCCINO"," It lowers the chances of a stroke and take it without sugar."));
        homeModels.add(new HomeModel(R.drawable.cofe_doppio,"DOPPIO","It Improves High Concentration."));
        homeModels.add(new HomeModel(R.drawable.cofe_americano,"AMERICANO","Coffee contains both large amount of essential nutrients."));
        homeModels.add(new HomeModel(R.drawable.cofe_latteesp,"LATTE","It helps in preventing cardiovascular disorders."));
        homeModels.add(new HomeModel(R.drawable.cofe_caramel,"CARAMEL MOCCHIATO", "It Decreases depression risk."));
        homeModels.add(new HomeModel(R.drawable.cofe_latte,"LATTE MOCCHIATO","It Increases brain power."));
        homeModels.add(new HomeModel(R.drawable.cofe_espress0,"ESPRESSO","It Strengthens Long-Term Memory."));
        return homeModels;
    }
}