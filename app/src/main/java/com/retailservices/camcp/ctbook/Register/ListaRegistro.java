package com.retailservices.camcp.ctbook.Register;


import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.retailservices.camcp.ctbook.R;
import com.retailservices.camcp.ctbook.Register.Dialogs.RegisterBusinessName;
import com.retailservices.camcp.ctbook.Register.Dialogs.RegisterRemoteConnection;

public class ListaRegistro extends AppCompatActivity {

    Button btnRegisterBN, btnRegisterRC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_registro);

        btnRegisterBN = findViewById(R.id.btnRegisterBusinessName);
        btnRegisterRC = findViewById(R.id.btnRegisterRemoteConnection);

        btnRegisterBN.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                DialogFragment dialog = new RegisterBusinessName();
                dialog.show(getSupportFragmentManager(), "undialogo");

            }
        });

        btnRegisterRC.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                DialogFragment dialog = new RegisterRemoteConnection();
                dialog.show(getSupportFragmentManager(), "undialogo");

            }
        });

    }
}




