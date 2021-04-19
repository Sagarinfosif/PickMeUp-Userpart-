package com.example.pickmeuptransport.Activity.Deliver.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pickmeuptransport.R;

public class CurrentShipmentAdapter extends RecyclerView.Adapter<CurrentShipmentAdapter.ViewHolder> {

    Context context;
Click click;

    public CurrentShipmentAdapter(Context context, Click click) {
        this.context = context;
        this.click = click;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.item_current_shipment, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_currentShipmentFragment_to_shipmentDetailFragment);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        AppCompatButton btnDetail;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            btnDetail=itemView.findViewById(R.id.btnDeatil);
        }
    }

    public  interface Click{
        void  onClick(int position);
    }

}
