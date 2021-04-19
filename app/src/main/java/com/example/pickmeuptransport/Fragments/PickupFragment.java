package com.example.pickmeuptransport.Fragments;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pickmeuptransport.R;

public class PickupFragment extends Fragment implements View.OnClickListener {

    private View view;
    private RelativeLayout relative_pickup;
    private LinearLayout llCancel;
    public PickupFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view= inflater.inflate(R.layout.fragment_pickup, container, false);
        ids();
        setup();
        return view;
    }

    private void setup() {
        relative_pickup.setOnClickListener(this);
        llCancel.setOnClickListener(this);
    }

    private void ids() {
        relative_pickup=view.findViewById(R.id.relative_pickup);
        llCancel=view.findViewById(R.id.llCancel);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.relative_pickup:

                break;
            case R.id.llCancel:
                final AlertDialog.Builder dialogBuilder1 = new AlertDialog.Builder(getActivity());
                LayoutInflater inflater = getLayoutInflater();
                final View dialogView = inflater.inflate(R.layout.dialog_cancel_ride, null);
                dialogBuilder1.setView(dialogView);
                TextView yesText;
                yesText = dialogView.findViewById(R.id.yesText);
                final AlertDialog alertDialog1 = dialogBuilder1.create();
                alertDialog1.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                alertDialog1.show();
                yesText.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        alertDialog1.dismiss();
                        Navigation.findNavController(getView()).navigate(R.id.action_pickupFragment_to_homeFragment);
                        Toast.makeText(getActivity(), "Cancel Ride Successfully", Toast.LENGTH_SHORT).show();
                    }
                });
                break;
        }
    }
}