package com.example.pickmeuptransport.Activity.Deliver.Fragment;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

import com.example.pickmeuptransport.Activity.Deliver.Adapter.CurrentShipmentAdapter;
import com.example.pickmeuptransport.R;


public class CurrentShipmentFragment extends Fragment {

    private View view;
    AppCompatImageView imgFilter, imgBack;
    AppCompatTextView txtTopBar;
    private RecyclerView recyclerView;
    private CurrentShipmentAdapter currentShipmentAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_current_shipment, container, false);
        FINDIDS();
        CLICKS();
        SETADAPTER();
        txtTopBar.setText("Current Shipment");
        return view;
    }

    private void SETADAPTER() {
        currentShipmentAdapter = new CurrentShipmentAdapter(getActivity(), new CurrentShipmentAdapter.Click() {
            @Override
            public void onClick(int position) {

            }
        });
        recyclerView.setAdapter(currentShipmentAdapter);
    }

    private void CLICKS() {

        imgFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(getActivity());
                dialog.setContentView(R.layout.dialog_filter);


                Window window = dialog.getWindow();
                WindowManager.LayoutParams wlp = window.getAttributes();

                wlp.gravity = Gravity.RIGHT;
                window.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.FILL_PARENT);


                dialog.show();
            }
        });

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });
    }

    private void FINDIDS() {
        imgFilter = view.findViewById(R.id.imgFilter);
        txtTopBar = view.findViewById(R.id.txtTopBar);
        imgBack = view.findViewById(R.id.imgBack);
        recyclerView = view.findViewById(R.id.recyclerCurrentShipment);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onResume() {
        super.onResume();
        imgFilter.setBackgroundResource(R.drawable.ic_baseline_filter_alt_24);
        imgFilter.setBackgroundTintList(ContextCompat.getColorStateList(getActivity(), R.color.white));
    }
}