package com.example.smartreceipt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {


    Context mContext;
    List<Receipt> mData;

    public RecyclerViewAdapter(Context mContext, List<Receipt> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_receipt,parent,false);
        MyViewHolder vHolder = new MyViewHolder(v);


         return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tv_name.setText(mData.get(position).getName());
        holder.tv_cost.setText(mData.get(position).getCost());
        holder.img.setImageResource(mData.get(position).getPhoto());


    }

    @Override
    public int getItemCount() {

//        return mData == null ? 0 : mData.size();
        return mData.size();

    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView tv_name;
        private TextView tv_cost;
        private ImageView img;

        public MyViewHolder(@NonNull View itemView) {

            super(itemView);


            tv_name = (TextView) itemView.findViewById(R.id.name_receipt);
            tv_cost = (TextView) itemView.findViewById(R.id.cost_receipt);
            img = (ImageView) itemView.findViewById(R.id.img_receipt);

        }
    }

}
