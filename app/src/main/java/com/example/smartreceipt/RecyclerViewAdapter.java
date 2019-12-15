package com.example.smartreceipt;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {


    Context mContext;
    List<Receipt> mData;
    Dialog myDialog;

    public RecyclerViewAdapter(Context mContext, List<Receipt> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_receipt, parent, false);
        final MyViewHolder vHolder = new MyViewHolder(v);

        //dialog init
        myDialog = new Dialog(mContext);
        myDialog.setContentView(R.layout.dialog_receipt);
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));


        vHolder.item_receipt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView dialog_receiptName_tv = (TextView) myDialog.findViewById(R.id.dialog_receiptName);
                TextView dialog_receiptCost_tv = (TextView) myDialog.findViewById(R.id.dialog_receiptCost);
                ImageView dialog_image_tv = (ImageView) myDialog.findViewById(R.id.dialog_receipt_image);

                dialog_receiptName_tv.setText(mData.get(vHolder.getAdapterPosition()).getName());
                dialog_receiptCost_tv.setText(mData.get(vHolder.getAdapterPosition()).getCost());
                dialog_image_tv.setImageResource(mData.get(vHolder.getAdapterPosition()).getPhoto());

                //test click
//                Toast.makeText(mContext, "test click" + String.valueOf(vHolder.getAdapterPosition()), Toast.LENGTH_SHORT).show();
                myDialog.show();
            }
        });


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

        private LinearLayout item_receipt;

        private TextView tv_name;
        private TextView tv_cost;
        private ImageView img;

        public MyViewHolder(@NonNull View itemView) {

            super(itemView);

            item_receipt = (LinearLayout) itemView.findViewById(R.id.receipt_item_id);
            tv_name = itemView.findViewById(R.id.name_receipt);
            tv_cost = itemView.findViewById(R.id.cost_receipt);
            img = itemView.findViewById(R.id.img_receipt);

        }
    }

}
