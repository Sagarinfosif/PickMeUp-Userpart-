package com.example.pickmeuptransport.Fragments;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.pickmeuptransport.R;

public class RegistrationFragment extends Fragment  {

    private View view;
    private AppCompatButton btnSignUp;
    private AppCompatTextView txtSignIn;
    public RegistrationFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_registration, container, false);
findIDS();
clicks();

        return view;
    }


    private void clicks() {
        txtSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_registrationFragment_to_loginFragment);
            }
        });
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_registrationFragment_to_otpFragment);
            }
        });
    }

    private void findIDS() {
        txtSignIn=view.findViewById(R.id.txtSignIn);
        btnSignUp=view.findViewById(R.id.btnSignUp);
    }

}