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

public class AddressOriginFragment extends Fragment {

  private  View view;
private AppCompatButton btnNext;
AppCompatImageView imgBack;
AppCompatTextView txtTopBar;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_address_origin, container, false);
    FINDIDS();
    txtTopBar.setText("Address");
    CLICKS();
        return view;
    }

    private void CLICKS() {
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_addressOriginFragment_to_addressDestinationFragment);
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
        btnNext=view.findViewById(R.id.btnNext);
        imgBack=view.findViewById(R.id.imgBack);
        txtTopBar=view.findViewById(R.id.txtTopBar);
    }
}