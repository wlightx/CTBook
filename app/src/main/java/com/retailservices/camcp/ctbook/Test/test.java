package com.retailservices.camcp.ctbook.Test;




import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.v4.app.DialogFragment;

import com.retailservices.camcp.ctbook.R;
import com.retailservices.camcp.ctbook.Register.Dialogs.RegisterBusinessName;

public class test extends AppCompatActivity {

    Button btnDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        btnDialog = findViewById(R.id.btnDialog);

        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                DialogFragment dialog = new RegisterBusinessName();
                dialog.show(getSupportFragmentManager(), "undialogo");

            }
        });

    }
}




