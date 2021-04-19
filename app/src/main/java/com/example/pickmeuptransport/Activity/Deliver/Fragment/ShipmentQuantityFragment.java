package com.example.pickmeuptransport.Activity.Deliver.Fragment;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pickmeuptransport.R;


public class ShipmentQuantityFragment extends Fragment {

    private View view;
    AppCompatTextView txtTopBar;
    AppCompatImageView imgBack;
    AppCompatButton btnNext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_shipment_quantity, container, false);
        FINDIDS();
        txtTopBar.setText("Shipment Quantity");
        CLICKS();
        return view;
    }

    private void CLICKS() {
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_shipmentQuantityFragment_to_tripEstimateFragment);
            }
        });
    }

    private void FINDIDS() {
        txtTopBar = view.findViewById(R.id.txtTopBar);
        imgBack = view.findViewById(R.id.imgBack);
        btnNext = view.findViewById(R.id.btnNext);
    }
}