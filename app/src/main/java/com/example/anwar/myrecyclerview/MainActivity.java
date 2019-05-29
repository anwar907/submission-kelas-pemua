package com.example.anwar.myrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Data>CardView;

    @BindView(R.id.rv_category)
    RecyclerView rvCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        rvCategory.setHasFixedSize(true);

        CardView = new ArrayList<>();
        CardView.addAll(DataValue.getListData());

        showRecyclerList();


    }
    private void showSecekcted(DataValue dataValue){
        Toast.makeText(this, "Like This Logo"+dataValue.getClass(), Toast.LENGTH_SHORT).show();
    }
    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewAdapter cardViewAdapter = new CardViewAdapter(this, new CardViewAdapter.OnClick() {
            @Override
            public void onClick(Object president) {
                Data data1 = (Data) president;
                Intent intent = new Intent(MainActivity.this, Detail.class);
                intent.putExtra("data", data1);
                startActivity(intent);
            }
        });
        cardViewAdapter.setListData(CardView);
        rvCategory.setAdapter(cardViewAdapter);
    }

}
