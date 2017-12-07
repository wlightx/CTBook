package com.retailservices.camcp.ctbook.Register.Dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.View;
import android.widget.EditText;

import com.retailservices.camcp.ctbook.R;

/**
 * Created by camcp on 06-12-2017.
 */

public class RegisterBusinessName extends DialogFragment {

    //region Vistas
    EditText etNameBN, etRutBN, etAddressBN;
    //endregion

    //region Variables
    String nameBN, rutBN, addressBN;
    //endregion

    public Dialog onCreateDialog(Bundle savedInstanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        View view = getActivity().getLayoutInflater().inflate(R.layout.dialog_register_business_name, null);

        etNameBN = view.findViewById(R.id.etNameBusinessName);
        etRutBN = view.findViewById(R.id.etRutBusinessName);
        etAddressBN = view.findViewById(R.id.etAddressBusinessName);

        builder.setView(getActivity().getLayoutInflater().inflate(R.layout.dialog_register_business_name, null))
                .setTitle("Razón Social")
                .setPositiveButton("Guardar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        nameBN = etNameBN.getText().toString();
                        rutBN = etNameBN.getText().toString();
                        addressBN = etNameBN.getText().toString();

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
