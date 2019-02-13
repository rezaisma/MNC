package com.example.reza.form.loginactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import com.example.reza.form.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginAdminActivity extends AppCompatActivity {

    @BindView(R.id.idAdmin)
    EditText idAdmin;
    @BindView(R.id.passAdmin)
    EditText passAdmin;
    @BindView(R.id.btnAdminLogin)
    Button btnAdminLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_admin);
        ButterKnife.bind(this);
    }
}
