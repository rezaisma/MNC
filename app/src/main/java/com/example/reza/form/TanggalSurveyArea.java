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

import com.example.reza.form.loginactivity.MainActivity;

import java.util.Calendar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TanggalSurveyArea extends AppCompatActivity {

    @BindView(R.id.EtTanggal)
    TextView EtTanggal;
    @BindView(R.id.spinerRegion)
    Spinner spinerRegion;
    @BindView(R.id.btnNextTanggal)
    Button btnNextTanggal;
    @BindView(R.id.tvDatePicker)
    TextView tvDatePicker;

    //TODO DATE PICKER
    private static final String TAG = "TanggalSurveyArea";
    private TextView mDisplayDate;
    private DatePickerDialog.OnDateSetListener mDateSetListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanggal_survey_area);
        ButterKnife.bind(this);
        mDisplayDate = (TextView) findViewById(R.id.tvDatePicker);
    }

    @OnClick(R.id.btnNextTanggal)
    public void onViewClicked() {
        Intent intent3 = new Intent(this, InfoKabKota.class);
        startActivity(intent3);



        //TODO https://www.youtube.com/watch?v=hwe1abDO2Ag  link date picker

        mDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        TanggalSurveyArea.this,
                        android.R.style.Theme_Light_WallpaperSettings,
                        mDateSetListener,
                        year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });

        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;
                Log.d(TAG, "onDateSet: mm/dd/yyy: " + month + "/" + day + "/" + year);

                String date = month + "/" + day + "/" + year;
                mDisplayDate.setText(date);
            }
        };

    }
}
