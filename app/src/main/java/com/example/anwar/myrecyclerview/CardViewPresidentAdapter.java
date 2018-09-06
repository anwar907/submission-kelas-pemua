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

public class CardViewPresidentAdapter extends RecyclerView.Adapter<CardViewPresidentAdapter.CardViewViewHolder>{
    private ArrayList<President> listPresident;
    private Context context;
    private OnClick onClick;

    public CardViewPresidentAdapter(Context context, OnClick onClick) {
        this.context = context;
        this.onClick = onClick;

    }

    public ArrayList<President> getListPresident() {
        return listPresident;
    }

    public void setListPresident(ArrayList<President> listPresident) {
        this.listPresident = listPresident;
    }
    @Override
    public CardViewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_president, parent, false);
        CardViewViewHolder viewHolder = new CardViewViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewViewHolder holder, int position) {
        President p = getListPresident().get(position);
        holder.showContent(p,onClick);
    }

    @Override
    public int getItemCount() {
        return getListPresident().size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName, tvRemarks;
        Button btnShare;


        public CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            btnShare = itemView.findViewById(R.id.btn_set_share);
        }
        public void showContent(final President president, final OnClick OnItemClick){
            tvName.setText(president.getName());
            tvRemarks.setText(president.getRemarks());
            Glide.with(context)
                    .load(president.getPhoto())
                    .into(imgPhoto);
            btnShare.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    OnItemClick.onClick(president);
                }
            });
        }
    }
    public interface OnClick{
        void onClick(Object president);
    }
}
