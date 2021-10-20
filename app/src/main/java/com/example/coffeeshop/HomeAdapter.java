package com.example.coffeeshop;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyHolder> {
    Context context;
    List<HomeModel> homeModels = new ArrayList<>();
    Dialog myDialog;
    AlertDialog alertDialog;
    int i;
    public HomeAdapter(Context context, List<HomeModel> homeModels) {
        this.context = context;
        this.homeModels = homeModels;
    }

    @NonNull
    @Override
    public HomeAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.homecustom,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {

        HomeModel homeModel=homeModels.get(position);

        holder.imageView.setImageResource(homeModels.get(position).getImage());
        holder.textView.setText(homeModels.get(position).getName());
        holder.item_content.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                View root=inflater.inflate(R.layout.imagepopup,null);
                ImageView i=root.findViewById(R.id.image);
//                TextView textView=root.findViewById(R.id.image_name);
                TextView textView2=root.findViewById(R.id.desc_box_tv);
                Button close=root.findViewById(R.id.close_btn);
                builder.setView(root);
                builder.create();

                i.setImageResource(homeModel.getImage());
//                textView.setText(homeModel.getName());
                textView2.setText(homeModel.getDesc());

                close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                alertDialog = builder.create();
                alertDialog.show();

            }
        });
    }

    @Override
    public int getItemCount() {
        return homeModels.size();
    }

    public class MyHolder  extends RecyclerView.ViewHolder{

        LinearLayout item_content;
        ImageView imageView;
        TextView textView;
        public MyHolder(@NonNull View itemView) {
            super(itemView);

            imageView =itemView.findViewById(R.id.coffe_home_img_iv);
            textView = itemView.findViewById(R.id.name_home_tv);
            item_content = itemView.findViewById(R.id.itemcontentview);
        }
    }
}
