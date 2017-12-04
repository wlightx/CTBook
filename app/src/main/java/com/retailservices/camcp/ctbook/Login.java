package com.retailservices.camcp.ctbook;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Login extends AppCompatActivity {

    //region Vistas
    private TextInputEditText etUserLogin, etPassLogin;
    private Button btnIngresarLogin;
    private RadioButton rbSesion;
    //endregion

    //region Variables
    private String USER = "";
    private String PASS = "";
    //endregion

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUserLogin = (TextInputEditText)findViewById(R.id.etUserLogin);
        etPassLogin = (TextInputEditText)findViewById(R.id.etPassLogin);
        rbSesion = (RadioButton) findViewById(R.id.rbSesionLogin);
        btnIngresarLogin = (Button)findViewById(R.id.btnIngresarLogin);

        btnIngresarLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
