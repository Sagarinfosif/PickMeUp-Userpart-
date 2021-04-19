package com.example.pickmeuptransport.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.pickmeuptransport.Adapters.TripAdapter;
import com.example.pickmeuptransport.R;

public class TripFragment extends Fragment {

    private View view;
    private TextView heading;
    private TripAdapter tripAdapter;
    private RecyclerView trips_recyclerView;

    public TripFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_trip, container, false);
        ids();
        setup();
        return view;
    }

    private void setup() {
        heading.setText("Your Trips");
        tripAdapter=new TripAdapter(getActivity(), new TripAdapter.Select() {
            @Override
            public void Position(int position) {
                Navigation.findNavController(view).navigate(R.id.action_tripFragment_to_tripDetailFragment);
            }
        });
        trips_recyclerView.setAdapter(tripAdapter);
    }

    private void ids() {
        heading=view.findViewById(R.id.heading);
        trips_recyclerView=view.findViewById(R.id.trips_recyclerView);
    }
}