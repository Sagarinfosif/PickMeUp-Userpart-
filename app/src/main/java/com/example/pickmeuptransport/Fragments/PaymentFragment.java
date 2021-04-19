package com.example.pickmeuptransport.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.pickmeuptransport.R;

public class PaymentFragment extends Fragment implements View.OnClickListener {

    private View view;
    private TextView heading;
    private ImageView p_down_img,c_down_img,p_ok_img,c_ok_img;
    private LinearLayout paypal_layout,cash_layout;

    public PaymentFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_payment, container, false);
        ids();
        setup();
        return view;
    }

    private void ids() {
        heading=view.findViewById(R.id.heading);
        p_down_img=view.findViewById(R.id.p_down_img);
        p_ok_img=view.findViewById(R.id.p_ok_img);
        c_down_img=view.findViewById(R.id.c_down_img);
        paypal_layout=view.findViewById(R.id.paypal_layout);
        cash_layout=view.findViewById(R.id.cash_layout);
        c_ok_img=view.findViewById(R.id.c_ok_img);
    }

    private void setup() {
        heading.setText("Payment");
        p_down_img.setOnClickListener(this);
        c_down_img.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.p_down_img:
                p_down_img.setVisibility(View.INVISIBLE);
                p_ok_img.setVisibility(View.VISIBLE);
                paypal_layout.setVisibility(View.VISIBLE);
                break;
            case R.id.c_down_img:
                c_down_img.setVisibility(View.INVISIBLE);
                c_ok_img.setVisibility(View.VISIBLE);
                cash_layout.setVisibility(View.VISIBLE);
                break;
        }
    }
}