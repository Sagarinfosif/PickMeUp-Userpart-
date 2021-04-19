package com.example.pickmeuptransport.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pickmeuptransport.Activity.Deliver.DeliverActivity;
import com.example.pickmeuptransport.HomeActivity;
import com.example.pickmeuptransport.R;


public class SelectCategorieFragment extends Fragment {

   private CardView cardCar,cardTruck;
   private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view= inflater.inflate(R.layout.fragment_select_categorie, container, false);
    findIDS();
    clicks();
        return view;
    }

    private void clicks() {
        cardCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), HomeActivity.class);
                getActivity().finish();
                startActivity(intent);
            }
        });

        cardTruck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), DeliverActivity.class);
                getActivity().finish();
                startActivity(intent);
            }
        });
    }

    private void findIDS() {
        cardCar=view.findViewById(R.id.cardTaxi);
        cardTruck=view.findViewById(R.id.cardTruck);
    }
}