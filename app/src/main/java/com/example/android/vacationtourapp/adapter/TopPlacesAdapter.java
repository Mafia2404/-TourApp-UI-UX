package com.example.android.vacationtourapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.vacationtourapp.R;
import com.example.android.vacationtourapp.model.RecentsData;
import com.example.android.vacationtourapp.model.TopPlacesData;

import java.util.List;

public class TopPlacesAdapter extends RecyclerView.Adapter<TopPlacesAdapter.TopPlacesViewHolder> {

    Context context;
    List<TopPlacesData> TopPlacesDataList;

    public TopPlacesAdapter(Context context, List<TopPlacesData> TopPlacesDataList) {
        this.context = context;
        this.TopPlacesDataList = TopPlacesDataList;
    }

    @NonNull
    @Override
    public TopPlacesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.top_places_row_item,parent,false);

        //here we create  recycler row item layout file

        return new TopPlacesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopPlacesViewHolder holder, int position) {
        holder.countryName.setText(TopPlacesDataList.get(position).getCountryName());
        holder.placeName.setText(TopPlacesDataList.get(position).getPlaceName());
        holder.price.setText(TopPlacesDataList.get(position).getPrice());
        holder.placeImage.setImageResource(TopPlacesDataList.get(position).getImageUrl());

    }

    @Override
    public int getItemCount() {
        return TopPlacesDataList.size();
    }

    public static final class TopPlacesViewHolder extends RecyclerView.ViewHolder{

        ImageView placeImage;
        TextView placeName,countryName,price;

        public TopPlacesViewHolder(@NonNull View itemView) {
            super(itemView);

            placeImage=itemView.findViewById(R.id.place_image);
            placeName=itemView.findViewById(R.id.place_name);
            countryName=itemView.findViewById(R.id.country_name);
            price=itemView.findViewById(R.id.price);
        }
    }
}
