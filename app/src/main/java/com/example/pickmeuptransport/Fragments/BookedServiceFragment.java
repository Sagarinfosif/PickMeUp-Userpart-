package com.example.pickmeuptransport.Fragments;

import android.app.AlertDialog;
import android.os.Bundle;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.pickmeuptransport.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BookedServiceFragment extends BottomSheetDialogFragment implements View.OnClickListener {

    private RelativeLayout mainContentLayout;
    private LinearLayout progress_layout,cancel_ride;
    private View bottomSheet;
    private ImageView contact_img;
    private TextView yes, no;
    private AlertDialog alert11;

    public BookedServiceFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view= inflater.inflate(R.layout.fragment_booked_service, container, false);
        ids(view);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (progress_layout.getVisibility() == View.VISIBLE) {

                    progress_layout.setVisibility(View.GONE);
                    mainContentLayout.setVisibility(View.VISIBLE);
                }

            }
        }, 2000);

        return view;
    }

    private void ids(View view) {
        mainContentLayout = view.findViewById(R.id.mainContentLayout);
        progress_layout = view.findViewById(R.id.progress_layout);

        contact_img = view.findViewById(R.id.contact_img);
        contact_img.setOnClickListener(this);

        cancel_ride = view.findViewById(R.id.cancel_ride);
        cancel_ride.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.contact_img:

                break;

            case R.id.cancel_ride:
                openDialog();
                break;
        }
    }

    private void openDialog() {
        LayoutInflater factory = LayoutInflater.from(getActivity());
        final View DialogView = factory.inflate(R.layout.dialog_cancel_ride, null);
        DialogView.setPadding(0,0,0,0);

        final AlertDialog.Builder builder1 = new AlertDialog.Builder(getActivity(),R.style.Theme_AppCompat_Dialog_Alert);

        yes = DialogView.findViewById(R.id.yesText);
        no = DialogView.findViewById(R.id.noText);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                alert11.dismiss();
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alert11.dismiss();
            }
        });
    }
}