package com.example.anwar.myrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.CardViewViewHolder>{
    private ArrayList<Data> listData;
    private Context context;
    private OnClick onClick;


    public CardViewAdapter(Context context, OnClick onClick) {
        this.context = context;
        this.onClick = onClick;

    }

    public ArrayList<Data> getListData() {
        return listData;
    }

    public void setListData(ArrayList<Data> listData) {
        this.listData = listData;
    }
    @Override
    public CardViewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_president, parent, false);
        CardViewViewHolder viewHolder = new CardViewViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewViewHolder holder, int position) {
        Data p = getListData().get(position);
        holder.showContent(p,onClick);
    }

    @Override
    public int getItemCount() {
        return getListData().size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName, tvRemarks;
        Button btnShare;
        Button btnLike;

        public CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            btnShare = itemView.findViewById(R.id.btn_set_share);
            btnLike = itemView.findViewById(R.id.btn_like);
        }
        public void showContent(final Data data, final OnClick OnItemClick){
            tvName.setText(data.getName());
            tvRemarks.setText(data.getRemarks());
            Glide.with(context)
                    .load(data.getPhoto())
                    .into(imgPhoto);
            btnLike.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
            imgPhoto.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    OnItemClick.onClick(data);
                }
            });

        }
    }
    public interface OnClick{
        void onClick(Object data);
    }
}
