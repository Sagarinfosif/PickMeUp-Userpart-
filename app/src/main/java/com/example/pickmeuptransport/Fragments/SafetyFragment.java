package com.example.pickmeuptransport.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.pickmeuptransport.R;

public class SafetyFragment extends Fragment implements View.OnClickListener {

  private View view;
  private TextView heading;
  private LinearLayout tv_trip_check,emergencyAssistance,safetycentre;

    public SafetyFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_safety, container, false);
        ids();
        setup();
        return view;
    }

    private void setup() {
        heading.setText("Safety");
        tv_trip_check.setOnClickListener(this);
        emergencyAssistance.setOnClickListener(this);
        safetycentre.setOnClickListener(this);
    }

    private void ids() {
        heading=view.findViewById(R.id.heading);
        tv_trip_check=view.findViewById(R.id.tv_trip_check);
        emergencyAssistance=view.findViewById(R.id.emergencyAssistance);
        safetycentre=view.findViewById(R.id.safetycentre);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tv_trip_check:
                Navigation.findNavController(view).navigate(R.id.action_safetyFragment_to_tripCheckFragment);
                break;
            case R.id.emergencyAssistance:
                Navigation.findNavController(view).navigate(R.id.action_safetyFragment_to_emergencyAssistanceFragment);
                break;
            case R.id.safetycentre:
                Navigation.findNavController(view).navigate(R.id.action_safetyFragment_to_safetyCentreFragment);
                break;
        }
    }
}