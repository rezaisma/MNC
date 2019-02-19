package com.example.reza.form;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TanggalSurveyArea extends AppCompatActivity {


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
        Intent intent3 = new Intent(this, InfoKabKota.class);
        startActivity(intent3);




    }
}
