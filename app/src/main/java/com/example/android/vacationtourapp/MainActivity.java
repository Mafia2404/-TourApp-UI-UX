package com.example.android.vacationtourapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.android.vacationtourapp.adapter.RecentsAdapter;
import com.example.android.vacationtourapp.adapter.TopPlacesAdapter;
import com.example.android.vacationtourapp.model.RecentsData;
import com.example.android.vacationtourapp.model.TopPlacesData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recentRecycler,topPlacesRecyler;
    RecentsAdapter recentsAdapter;
    TopPlacesAdapter topPlacesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Here we'll add some dummy data in our model class
        List<RecentsData>  recentsDataList=new ArrayList<>();
        recentsDataList.add(new RecentsData("AM Lake","India","From $200",R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Nilgri Hillls","India","From $300",R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("AM Lake","India","From $200",R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Nilgri Hillls","India","From $300",R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("AM Lake","India","From $200",R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Nilgri Hillls","India","From $300",R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("AM Lake","India","From $200",R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Nilgri Hillls","India","From $300",R.drawable.recentimage2));

        setRecentRecycler(recentsDataList);

        List<TopPlacesData> topPlacesDataList=new ArrayList<>();
        topPlacesDataList.add(new TopPlacesData("AM Lake","India","From $200",R.drawable.recentimage1));
        topPlacesDataList.add(new TopPlacesData("Nilgri Hillls","India","From $300",R.drawable.recentimage2));
       topPlacesDataList.add(new TopPlacesData("AM Lake","India","From $200",R.drawable.recentimage1));
        topPlacesDataList.add(new TopPlacesData("Nilgri Hillls","India","From $300",R.drawable.recentimage2));
        topPlacesDataList.add(new TopPlacesData("AM Lake","India","From $200",R.drawable.recentimage1));
        topPlacesDataList.add(new TopPlacesData("Nilgri Hillls","India","From $300",R.drawable.recentimage2));
        topPlacesDataList.add(new TopPlacesData("AM Lake","India","From $200",R.drawable.recentimage1));
        topPlacesDataList.add(new TopPlacesData("Nilgri Hillls","India","From $300",R.drawable.recentimage2));

        setTopPlacesRecycler(topPlacesDataList);


    }

    private void setTopPlacesRecycler(List<TopPlacesData> topPlacesDataList) {
        topPlacesRecyler=findViewById(R.id.topPlaces_recycler);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        topPlacesRecyler.setLayoutManager(layoutManager);
        topPlacesAdapter=new TopPlacesAdapter(this,topPlacesDataList);
        topPlacesRecyler.setAdapter(topPlacesAdapter);
    }

    private void setRecentRecycler(List<RecentsData> recentsDataList){
        recentRecycler = findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsAdapter = new RecentsAdapter(this, recentsDataList);
        recentRecycler.setAdapter(recentsAdapter);


    }
}