package com.example.pickmeuptransport.Fragments;

import android.os.Bundle;

import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pickmeuptransport.R;

import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.material.card.MaterialCardView;
import com.infideap.drawerbehavior.AdvanceDrawerLayout;

public class HomeFragment extends Fragment implements View.OnClickListener, OnMapReadyCallback{

    private View view;
    private AdvanceDrawerLayout advance_drawer;
    private ImageView img_side_menu;
    private MaterialCardView where_to_go;
    private TextView nav_profile, nav_trip, nav_payment, nav_promo, nav_wallet,nav_faq,nav_contactus,nav_setting,nav_safety,nav_refer,nav_logout;
    private GoogleMap map;


    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);
        initView();
        SetUps();
        performActions();
        return view;
    }

    private void SetUps() {
        img_side_menu.setOnClickListener(this);
        where_to_go.setOnClickListener(this);
        nav_profile.setOnClickListener(this);
        nav_wallet.setOnClickListener(this);
        nav_trip.setOnClickListener(this);
        nav_faq.setOnClickListener(this);
        nav_setting.setOnClickListener(this);
        nav_contactus.setOnClickListener(this);
        nav_safety.setOnClickListener(this);
        nav_promo.setOnClickListener(this);
        nav_payment.setOnClickListener(this);

    }

    private void initView() {
        advance_drawer = view.findViewById(R.id.advance_drawer);
        img_side_menu = view.findViewById(R.id.img_side_menu);
        nav_profile = view.findViewById(R.id.nav_profile);
        nav_trip = view.findViewById(R.id.nav_trip);
        nav_payment = view.findViewById(R.id.nav_payment);
        nav_promo = view.findViewById(R.id.nav_promo);
        nav_wallet = view.findViewById(R.id.nav_wallet);
        nav_faq = view.findViewById(R.id.nav_faq);
        nav_contactus = view.findViewById(R.id.nav_contactus);
        nav_setting = view.findViewById(R.id.nav_setting);
        nav_refer = view.findViewById(R.id.nav_refer);
        nav_logout = view.findViewById(R.id.nav_logout);
        where_to_go = view.findViewById(R.id.where_to_go);
        nav_safety = view.findViewById(R.id.nav_safety);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.img_side_menu:
                advance_drawer.openDrawer(GravityCompat.START);
                break;
            case R.id.nav_profile:
//                Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_profileFragment);
                advance_drawer.closeDrawer(GravityCompat.START);
                break;
            case R.id.nav_wallet:
                Toast.makeText(getActivity(), "Coming Soon ", Toast.LENGTH_SHORT).show();
//                Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_walletFragment);
                advance_drawer.closeDrawer(GravityCompat.START);
                break;

            case R.id.nav_promo:
                Toast.makeText(getActivity(), "Coming Soon ", Toast.LENGTH_SHORT).show();
//                Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_promoCodeFragment);
                advance_drawer.closeDrawer(GravityCompat.START);

                break;
            case R.id.nav_trip:
                Toast.makeText(getActivity(), "Coming Soon ", Toast.LENGTH_SHORT).show();
//                Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_tripFragment);
                advance_drawer.closeDrawer(GravityCompat.START);
                break;

            case R.id.nav_payment:
                Toast.makeText(getActivity(), "Coming Soon ", Toast.LENGTH_SHORT).show();
//                Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_paymentFragment);
                advance_drawer.closeDrawer(GravityCompat.START);
                break;

            case R.id.nav_faq:
                Toast.makeText(getActivity(), "Coming Soon ", Toast.LENGTH_SHORT).show();
//                Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_FAQFragment);
                advance_drawer.closeDrawer(GravityCompat.START);
                break;

            case R.id.nav_setting:
                Toast.makeText(getActivity(), "Coming Soon ", Toast.LENGTH_SHORT).show();
//                Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_settingFragment);
                advance_drawer.closeDrawer(GravityCompat.START);
                break;
            case R.id.nav_safety:
                Toast.makeText(getActivity(), "Coming Soon ", Toast.LENGTH_SHORT).show();
//                Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_safetyFragment);
                advance_drawer.closeDrawer(GravityCompat.START);
                break;
            case R.id.nav_contactus:
                Toast.makeText(getActivity(), "Coming Soon ", Toast.LENGTH_SHORT).show();
//                Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_contactUsFragment);
                advance_drawer.closeDrawer(GravityCompat.START);
                break;
            case R.id.where_to_go:
                Toast.makeText(getActivity(), "Coming Soon ", Toast.LENGTH_SHORT).show();
//                Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_wheretogoFragment);
                break;
        }

    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
         map = googleMap;

    }
    private void performActions() {

        advance_drawer.useCustomBehavior(Gravity.START);
        advance_drawer.setRadius(Gravity.START, 35);//set end container's corner radius (dimension)
        advance_drawer.setViewScale(Gravity.START, 0.9f);
        advance_drawer.setViewElevation(Gravity.START, 20);
    }



}