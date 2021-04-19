package com.example.pickmeuptransport.Activity.Deliver.Fragment;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pickmeuptransport.R;


public class TripEstimateFragment extends Fragment {

    private  View view;
private AppCompatButton btnConfirm;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_trip_estimate, container, false);
    FINDIDS();
    CLICKS();
        return view;
    }

    private void CLICKS() {
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_tripEstimateFragment_to_paymentFragment2);
            }
        });
    }

    private void FINDIDS() {
btnConfirm=view.findViewById(R.id.btnConfirm);
    }
}