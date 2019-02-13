package com.example.reza.form.loginactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import com.example.reza.form.R;
import com.example.reza.form.TanggalSurveyArea;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginUserActivity extends AppCompatActivity {

    @BindView(R.id.ETlogin1)
    EditText ETlogin1;
    @BindView(R.id.ETlogin2)
    EditText ETlogin2;
    @BindView(R.id.btnuserlogin)
    Button btnuserlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_user_activity);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnuserlogin)
    public void onViewClicked() {
        Intent intent9 = new Intent(this, TanggalSurveyArea.class);
        startActivity(intent9);
    }
}
