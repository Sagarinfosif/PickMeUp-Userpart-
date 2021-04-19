package com.example.pickmeuptransport.Activity.Deliver.Fragment;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pickmeuptransport.R;


public class ServicesFragment extends Fragment {

    private View view;
    AppCompatTextView txtTopBar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_services, container, false);
        FINDIDS();
        txtTopBar.setText("Services");
        return view;
    }

    private void FINDIDS() {
        txtTopBar = view.findViewById(R.id.txtTopBar);
    }
}