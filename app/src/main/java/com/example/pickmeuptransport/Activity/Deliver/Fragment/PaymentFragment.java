package com.example.pickmeuptransport.Activity.Deliver.Fragment;

import android.app.AlertDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pickmeuptransport.R;


public class PaymentFragment extends Fragment {

   private View view;
private AppCompatButton btnConfirm;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_payment2, container, false);
    FINDIDS();
    CLICKS();
        return view;
    }

    private void CLICKS() {
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                final AlertDialog.Builder alert=new AlertDialog.Builder ( getActivity() );
                View mview=getLayoutInflater ().inflate ( R.layout.dialog_confirm_payment,null );
                alert.setView ( mview );
                final AlertDialog alertDialog=alert.create ();
                alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                alertDialog.show ();

            }
        });
    }

    private void FINDIDS() {
btnConfirm=view.findViewById(R.id.btnConfirm);
    }
}