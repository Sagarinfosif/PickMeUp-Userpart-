package com.example.pickmeuptransport.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pickmeuptransport.R;

public class WhereToGoAdapter extends RecyclerView.Adapter<WhereToGoAdapter.ViewHolder> {
    Context context;
    Select select;

    public WhereToGoAdapter(Context context, Select select) {
        this.context = context;
        this.select = select;
    }

    public interface Select{
        void Position(int position);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_location,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.search_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select.Position(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout search_location;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            search_location=itemView.findViewById(R.id.search_location);
        }
    }
}
