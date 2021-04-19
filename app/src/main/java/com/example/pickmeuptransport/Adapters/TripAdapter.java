package com.example.pickmeuptransport.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pickmeuptransport.R;

public class TripAdapter extends RecyclerView.Adapter<TripAdapter.ViewHolder> {
    Context context;
    Select select;

    public interface Select{
        void Position(int position);
    }

    public TripAdapter(Context context, Select select) {
        this.context = context;
        this.select = select;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(context).inflate(R.layout.trip,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            holder.trip_detail.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    select.Position(position);
                }
            });
    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout trip_detail;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            trip_detail=itemView.findViewById(R.id.trip_detail);
        }
    }
}
