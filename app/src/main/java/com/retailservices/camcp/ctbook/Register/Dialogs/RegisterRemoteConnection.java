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

public class RegisterRemoteConnection extends DialogFragment {

    //region Vistas
    EditText etNameRC, etIdAnydeskRC, etPassAnydeskRC, etIdTeamViewerRC, etPassTeamViewerRC, etIpRemoteDesktopRC, etPassRemoteDesktopRC, etIpVpnRC, etPassVpnRC;
    //endregion

    //region Variables
    String nameRC, idAnydeskRC, passAnydeskRC, idTeamViewerRC, passTeamViewerRC, ipRemoteDesktopRC, passRemoteDesktopRC, ipVpnRC, passVpnRC;
    //endregion

    public Dialog onCreateDialog(Bundle savedInstanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        View view = getActivity().getLayoutInflater().inflate(R.layout.dialog_register_remote_connection, null);

        etNameRC = view.findViewById(R.id.etNameRemoteConnection);
        etIdAnydeskRC = view.findViewById(R.id.etIdAnydeskRemoteConnection);
        etPassAnydeskRC = view.findViewById(R.id.etPassAnydeskRemoteConnection);
        etIdTeamViewerRC = view.findViewById(R.id.etIdTeamViewerRemoteConnection);
        etPassTeamViewerRC = view.findViewById(R.id.etPassTeamViewerRemoteConnection);
        etIpRemoteDesktopRC = view.findViewById(R.id.etIpRemoteDesktopRemoteConnection);
        etPassRemoteDesktopRC = view.findViewById(R.id.etPassRemoteDesktopRemoteConnection);
        etIpVpnRC = view.findViewById(R.id.etIpVpnRemoteConnection);
        etPassVpnRC = view.findViewById(R.id.etPassVpnRemoteConnection);

        builder.setView(getActivity().getLayoutInflater().inflate(R.layout.dialog_register_remote_connection, null))
                .setTitle("Razón Social")
                .setPositiveButton("Guardar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        nameRC = etNameRC.getText().toString();
                        idAnydeskRC = etIdAnydeskRC.getText().toString();
                        passAnydeskRC = etPassAnydeskRC.getText().toString();
                        idTeamViewerRC = etIdTeamViewerRC.getText().toString();
                        passTeamViewerRC = etPassTeamViewerRC.getText().toString();
                        ipRemoteDesktopRC = etIpRemoteDesktopRC.getText().toString();
                        passRemoteDesktopRC = etPassRemoteDesktopRC.getText().toString();
                        ipVpnRC = etIpVpnRC.getText().toString();
                        passVpnRC = etPassVpnRC.getText().toString();

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
