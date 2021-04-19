package com.example.pickmeuptransport.Activity.Deliver.Fragment;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.pickmeuptransport.Adapters.ListAdapter;
import com.example.pickmeuptransport.R;
import com.infideap.drawerbehavior.AdvanceDrawerLayout;

public class HomeFragment extends Fragment {

    private View view;
    private RecyclerView recyclerView;
    private ListAdapter listAdapter;
    AppCompatImageView imgNav;
    AdvanceDrawerLayout advanceDrawerLayout;
    private AppCompatButton btnContinue;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home2, container, false);
        findIDS();
        listAdapter = new ListAdapter(getActivity());
        recyclerView.setAdapter(listAdapter);
        CLICKS();

        return view;
    }

    private void CLICKS() {
        imgNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                advanceDrawerLayout = getActivity().findViewById(R.id.advance_drawer);
                advanceDrawerLayout.openDrawer(GravityCompat.START);
            }
        });
        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_homeFragment2_to_shipmentFragmentFragment);
            }
        });
    }

    private void findIDS() {
        imgNav = view.findViewById(R.id.imgNav);
        recyclerView = view.findViewById(R.id.recyclerTrucks);
        btnContinue = view.findViewById(R.id.btnContinue);

    }
}