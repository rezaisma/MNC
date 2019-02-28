package com.example.reza.form;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.reza.form.network.RegisterAPI;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TanggalSurveyArea extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    @BindView(R.id.spinerRegion)
    Spinner spinerRegion;
    @BindView(R.id.btnNextTanggal)
    Button btnNextTanggal;

    String text1;
//    String hasilSpinerRegion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanggal_survey_area);
        ButterKnife.bind(this);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.str_region, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinerRegion.setAdapter(adapter);
        spinerRegion.setOnItemSelectedListener(this);

        Bundle bundle = new Bundle();
        bundle.putString("text1", text1);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        text1 = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text1, Toast.LENGTH_SHORT).show();
        View selectedView = spinerRegion.getSelectedView();
         if (selectedView != null && selectedView instanceof TextView);
            spinerRegion.requestFocus();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @OnClick({ R.id.btnNextTanggal})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnNextTanggal:
                Intent intent3 = new Intent(this, InfoKabKota.class);
                startActivity(intent3);
                break;
        }
    }

}
