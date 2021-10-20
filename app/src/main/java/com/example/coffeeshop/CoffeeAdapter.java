package com.example.coffeeshop;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class CoffeeAdapter extends RecyclerView.Adapter<CoffeeAdapter.itemHolder> {

    Context context;
    List<CoffeeModel> coffeeModels = new ArrayList<>();


    public CoffeeAdapter(Context context, List<CoffeeModel> coffeeModels) {
        this.context = context;
        this.coffeeModels = coffeeModels;
    }

    @NonNull
    @Override
    public CoffeeAdapter.itemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cofeescustom, parent, false);

        return new itemHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CoffeeAdapter.itemHolder holder, int position) {
        holder.imageView.setImageResource(coffeeModels.get(position).getImage());
        holder.textViewName.setText("" + coffeeModels.get(position).getName());
        holder.textViewCost.setText("" + coffeeModels.get(position).getCost());

        holder.plusbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(context.getApplicationContext(), "plus is clicked", Toast.LENGTH_LONG).show();
                         }
        });
        holder.minusbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context.getApplicationContext(), "minus is clicked", Toast.LENGTH_LONG).show();
                //holder.OrderCount = Integer.parseInt(holder.txtSubMenuCount.getText().toString());

            }
        });

        holder.parentlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context.getApplicationContext(), "This is layout", Toast.LENGTH_LONG).show();

            }
        });
    }


    @Override
    public int getItemCount() {
        return coffeeModels.size();
    }

    public class itemHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textViewName;
        TextView textViewCost;
        Button plusbutton, minusbutton;
        LinearLayout parentlayout;

        public itemHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.coffees_image);
            textViewName = itemView.findViewById(R.id.coffee_name);
            textViewCost = itemView.findViewById(R.id.cost);
            plusbutton = itemView.findViewById(R.id.plus);
            minusbutton = itemView.findViewById(R.id.minus);
            parentlayout = itemView.findViewById(R.id.parentlayout);
        }
    }


}
