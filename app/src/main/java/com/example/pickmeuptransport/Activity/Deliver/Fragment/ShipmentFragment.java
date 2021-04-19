package com.example.pickmeuptransport.Activity.Deliver.Fragment;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pickmeuptransport.R;


public class ShipmentFragment extends Fragment {

    private View view;
    private CardView cardNew, cardCurrentShipment;
    AppCompatImageView imgBack;
    AppCompatTextView txtTopBar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_shipment_fragment, container, false);
        findIDS();
        CLICKS();
        txtTopBar.setText("Shipments");
        return view;
    }

    private void CLICKS() {
        cardNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_shipmentFragmentFragment_to_addressOriginFragment);
            }
        });

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });

        cardCurrentShipment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_shipmentFragmentFragment_to_currentShipmentFragment);
            }
        });
    }

    private void findIDS() {
        cardNew = view.findViewById(R.id.cardNew);
        imgBack = view.findViewById(R.id.imgBack);
        txtTopBar = view.findViewById(R.id.txtTopBar);
        cardCurrentShipment = view.findViewById(R.id.cardCurrentShipment);
    }
}