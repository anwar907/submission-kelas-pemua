package com.example.anwar.myrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private ArrayList<President>CardView;

    @BindView(R.id.rv_category)
    RecyclerView rvCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        rvCategory.setHasFixedSize(true);

        CardView = new ArrayList<>();
        CardView.addAll(PresidentData.getListData());

        showRecyclerList();

    }
    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewPresidentAdapter cardViewPresidentAdapter = new CardViewPresidentAdapter(this, new CardViewPresidentAdapter.OnClick() {
            @Override
            public void onClick(Object president) {
                President president1 = (President) president;
                Intent intent = new Intent(MainActivity.this, Detail.class);
                intent.putExtra("data", president1);
                startActivity(intent);
            }
        });
        cardViewPresidentAdapter.setListPresident(CardView);
        rvCategory.setAdapter(cardViewPresidentAdapter);
    }

}
