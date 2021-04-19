package com.example.pickmeuptransport.Fragments;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.pickmeuptransport.R;


public class OtpFragment extends Fragment  {

    private View view;
    private AppCompatButton btnSubmit;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_otp, container, false);
        findIDS();
        clicks();
        return view;
    }

    private void clicks() {
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_otpFragment_to_congoFragment);
            }
        });
    }

    private void findIDS() {
        btnSubmit=view.findViewById(R.id.btnSubmit);
    }
}