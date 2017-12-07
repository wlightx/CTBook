package com.retailservices.camcp.ctbook.Test;

import android.app.AlertDialog;
import android.app.Dialog;
import android.support.v4.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.retailservices.camcp.ctbook.R;

/**
 * Created by camcp on 06-12-2017.
 */

public class DialogoPersonalizado extends DialogFragment{

    public Dialog onCreateDialog(Bundle savedInstanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        View view = getActivity().getLayoutInflater().inflate(R.layout.login_test, null);

        EditText etUser = view.findViewById(R.id.etUser);
        EditText etPass = view.findViewById(R.id.etPass);

        builder.setView(getActivity().getLayoutInflater().inflate(R.layout.login_test, null))
                .setTitle("Bienvenido")
                .setPositiveButton("Iniciar sesion", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

            return builder.create();
    }

}
