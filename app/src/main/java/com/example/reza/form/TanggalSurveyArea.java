package com.example.reza.form;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.reza.form.loginactivity.LoginAdminActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TanggalSurveyArea extends AppCompatActivity {

    @BindView(R.id.EtTanggal)
    TextView EtTanggal;
    @BindView(R.id.spinerTgl)
    Spinner spinerTgl;
    @BindView(R.id.spinerRegion)
    Spinner spinerRegion;
    @BindView(R.id.btnNextTanggal)
    Button btnNextTanggal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanggal_survey_area);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnNextTanggal)
    public void onViewClicked() {
        Intent intent3 = new Intent(this, LoginAdminActivity.class);
        startActivity(intent3);
    }
}
