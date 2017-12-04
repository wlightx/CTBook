package com.retailservices.camcp.ctbook;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;

public class Login extends AppCompatActivity {

    //region Vistas
    private TextInputEditText etUserLogin, etPassLogin;
    private Button btnIngresarLogin;
    private RadioButton sesion;
    //endregion

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUserLogin = (TextInputEditText)findViewById(R.id.etUserLogin);
        etPassLogin = (TextInputEditText)findViewById(R.id.etPassLogin);
        btnIngresarLogin = (Button)findViewById(R.id.btnIngresarLogin);
        sesion = (RadioButton) findViewById(R.id.rbSesionLogin);
    }
}
