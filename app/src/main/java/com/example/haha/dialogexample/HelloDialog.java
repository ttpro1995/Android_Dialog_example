package com.example.haha.dialogexample;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import java.security.PublicKey;

/**
 * Created by haha on 3/15/2015.
 */
public class HelloDialog extends DialogFragment {

    public String yes = "HahaTTpro.Yes";
    public String nope = "HahaTTpro.Nope";


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder;
        builder = new AlertDialog.Builder(getActivity());
        builder.setMessage("hello")
                .setPositiveButton("ok",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                      Intent intent = new Intent(yes);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("nope",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(nope);
                        startActivity(intent);
                    }
                });

        return builder.create();
    }
}
