package com.example.pickmeuptransport.Activity.Deliver.Fragment;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pickmeuptransport.R;


public class ShipmentDetailFragment extends Fragment {

    private View view;
    AppCompatImageView imgBack, imgEdit;
    AppCompatTextView txtTopBar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_shipment_detail, container, false);
        FINDIDS();
        txtTopBar.setText("Details");
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
    }

    private void FINDIDS() {
        imgBack = view.findViewById(R.id.imgBack);
        imgEdit = view.findViewById(R.id.imgFilter);
        txtTopBar = view.findViewById(R.id.txtTopBar);

    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onResume() {
        super.onResume();
        imgEdit.setBackgroundResource(R.drawable.ic_baseline_edit_24);
        imgEdit.setBackgroundTintList(ContextCompat.getColorStateList(getActivity(), R.color.white));
    }
}