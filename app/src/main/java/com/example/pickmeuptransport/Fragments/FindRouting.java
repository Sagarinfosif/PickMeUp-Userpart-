package com.example.pickmeuptransport.Fragments;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pickmeuptransport.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

import mx.com.pegasus.RippleCircleButton;

public class FindRouting extends Fragment implements View.OnClickListener {

    private View view;
    private TextView heading;
    private Button booking_done;
    private RippleCircleButton rippleCircleButton;
    private BottomSheetBehavior<LinearLayout> behavior;
    private LinearLayout bottomsheeet, progress_layout, cancel_ride;


    public FindRouting() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_find_routing, container, false);
        ids();
        setup();
        click();
        return view;
    }

    private void click() {
        cancel_ride.setOnClickListener(this);
        booking_done.setOnClickListener(this);
        bottomsheeet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void setup() {

        heading.setText("Find Ride");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                rippleCircleButton.setVisibility(View.GONE);
                progress_layout.setVisibility(View.GONE);
                behavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                behavior.setPeekHeight(500);
//                Navigation.findNavController(view).navigate(R.id.action_splashFragment_to_loginFragment);
            }
        }, 6000);
    }

    private void ids() {
        //heading
        heading = view.findViewById(R.id.heading);

        //button
        booking_done = view.findViewById(R.id.booking_done);

        //bottom
        bottomsheeet = view.findViewById(R.id.bottomsheet);
        behavior = BottomSheetBehavior.from(bottomsheeet);
        progress_layout = view.findViewById(R.id.progress_layout);
        cancel_ride = view.findViewById(R.id.cancel_ride);

        //ripple

        rippleCircleButton = view.findViewById(R.id.rippleCircleButton);
        rippleCircleButton.setMainCircleSize(100f); //Value is in DPs
        rippleCircleButton.setMainCircleColor(Color.parseColor("#ffffff"));

        rippleCircleButton.setMainCircleBackgroundImage(ContextCompat.getDrawable(getContext(), R.drawable.ic_location_new));
        rippleCircleButton.setMainCircleBackgroundImageSize(50f); //Value is in DPs

        rippleCircleButton.setSecondaryCirclesNumber(3);
        rippleCircleButton.setSecondaryCirclesColor(Color.parseColor("#1976D2"));

        rippleCircleButton.setAnimationDuration(1700); //Value is in Milliseconds
        rippleCircleButton.setSecondaryCirclesAnimation(RippleCircleButton.EXPAND_AND_DISAPPEAR_ANIMATION);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cancel_ride:
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
                        Navigation.findNavController(getView()).navigate(R.id.action_findRouting_to_homeFragment);
                        Toast.makeText(getActivity(), "Cancel Ride Successfully", Toast.LENGTH_SHORT).show();
                    }
                });
                break;
            case R.id.booking_done:
                Navigation.findNavController(view).navigate(R.id.action_findRouting_to_pickupFragment);
                break;
        }
    }
}