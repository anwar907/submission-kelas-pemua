package com.example.anwar.myrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Detail extends AppCompatActivity {
    @BindView(R.id.img_detail)
    ImageView tvimage;

    @BindView(R.id.title_detail)
    TextView tvdetail;

    @BindView(R.id.remarks)
    TextView remarks;

    @BindView(R.id.lahir)
    TextView tvlahir;

    @BindView(R.id.wafat)
    TextView tvwafat;

    @BindView(R.id.tinggi)
    TextView tvtinggi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);
        ButterKnife.bind(this);

        President president= getIntent().getParcelableExtra("data");

        tvdetail.setText(president.getName());
        remarks.setText(president.getRemarks());
        tvlahir.setText(president.getDate());
        tvwafat.setText(president.getWafat());
        tvtinggi.setText(president.getHeight());
        Glide.with(this)
                .load(president.getPhoto())
                .into(tvimage);
    }
}
