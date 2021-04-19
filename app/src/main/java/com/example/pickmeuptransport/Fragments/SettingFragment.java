package com.example.pickmeuptransport.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.pickmeuptransport.R;

public class SettingFragment extends Fragment implements View.OnClickListener {

    private View view;
    private TextView heading;
    private RelativeLayout termsandcondition;

    public SettingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_setting, container, false);
        ids();
        setup();
        return view;
    }

    private void setup() {
        heading.setText("Settings");
        termsandcondition.setOnClickListener(this);
    }

    private void ids() {
        heading = view.findViewById(R.id.heading);
        termsandcondition = view.findViewById(R.id.termsandcondition);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.termsandcondition:
                Navigation.findNavController(view).navigate(R.id.action_settingFragment_to_termandConditionFragment);
                break;
        }
    }
}