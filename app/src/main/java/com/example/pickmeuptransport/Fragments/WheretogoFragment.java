package com.example.pickmeuptransport.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.pickmeuptransport.Adapters.WhereToGoAdapter;
import com.example.pickmeuptransport.R;

public class WheretogoFragment extends Fragment implements View.OnClickListener {

    private View view;
    private TextView heading;
    private RelativeLayout setLocationMap;
    private RecyclerView locationRecyclerView;
    private WhereToGoAdapter whereToGoAdapter;


    public WheretogoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_wheretogo, container, false);
        ids();
        setup();
        click();
        return view;
    }

    private void click() {
        setLocationMap.setOnClickListener(this);
    }

    private void setup() {

        heading.setText("Where to go");

        whereToGoAdapter = new WhereToGoAdapter(getActivity(), new WhereToGoAdapter.Select() {
            @Override
            public void Position(int position) {
                Navigation.findNavController(view).navigate(R.id.action_wheretogoFragment_to_confirmFragment);
            }
        });
        locationRecyclerView.setAdapter(whereToGoAdapter);
    }

    private void ids() {
        locationRecyclerView = view.findViewById(R.id.locationRecyclerView);
        heading = view.findViewById(R.id.heading);
        setLocationMap = view.findViewById(R.id.setLocationMap);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.setLocationMap:
                Navigation.findNavController(view).navigate(R.id.action_wheretogoFragment_to_confirmFragment);
                break;
        }
    }
}