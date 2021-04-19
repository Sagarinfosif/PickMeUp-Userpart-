package com.example.pickmeuptransport.Activity.Deliver;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.navigation.Navigation;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.example.pickmeuptransport.MainActivity;
import com.example.pickmeuptransport.R;
import com.infideap.drawerbehavior.AdvanceDrawerLayout;

import java.util.NavigableSet;

public class DeliverActivity extends AppCompatActivity {

    private AdvanceDrawerLayout advanceDrawerLayout;
    private TextView nav_profile, nav_trip, nav_payment, nav_promo, nav_wallet, nav_faq, nav_contactus, nav_setting, nav_safety, nav_refer, nav_logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deliver);
        findIDS();
        performActions();
        CLICKS();
    }

    private void CLICKS() {

        nav_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                advanceDrawerLayout.closeDrawer(GravityCompat.START);
                Navigation.findNavController(DeliverActivity.this, R.id.nav_host_fragment).navigate(R.id.homeFragment2);
            }
        });

        nav_payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                advanceDrawerLayout.closeDrawer(GravityCompat.START);
                Navigation.findNavController(DeliverActivity.this, R.id.nav_host_fragment).navigate(R.id.servicesFragment);

            }
        });

        nav_promo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                advanceDrawerLayout.closeDrawer(GravityCompat.START);
                Navigation.findNavController(DeliverActivity.this, R.id.nav_host_fragment).navigate(R.id.profileFragment3);

            }
        });
    }

    private void findIDS() {
        advanceDrawerLayout = findViewById(R.id.advance_drawer);
        nav_profile = findViewById(R.id.nav_profile);
        nav_trip = findViewById(R.id.nav_trip);
        nav_payment = findViewById(R.id.nav_payment);
        nav_promo = findViewById(R.id.nav_promo);
        nav_wallet = findViewById(R.id.nav_wallet);
        nav_faq = findViewById(R.id.nav_faq);
        nav_contactus = findViewById(R.id.nav_contactus);
        nav_setting = findViewById(R.id.nav_setting);
        nav_refer = findViewById(R.id.nav_refer);
        nav_logout = findViewById(R.id.nav_logout);
        nav_safety = findViewById(R.id.nav_safety);
    }


    private void performActions() {

        advanceDrawerLayout.useCustomBehavior(Gravity.START);
        advanceDrawerLayout.setRadius(Gravity.START, 35);//set end container's corner radius (dimension)
        advanceDrawerLayout.setViewScale(Gravity.START, 0.9f);
        advanceDrawerLayout.setViewElevation(Gravity.START, 20);
    }
}