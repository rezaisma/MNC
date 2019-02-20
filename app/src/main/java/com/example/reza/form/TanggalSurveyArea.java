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

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TanggalSurveyArea extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    @BindView(R.id.spinerRegion)
    Spinner spinerRegion;
    @BindView(R.id.btnNextTanggal)
    Button btnNextTanggal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanggal_survey_area);
        ButterKnife.bind(this);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.str_region, android.R.layout.simple_spinner_item);
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, new String[]{""});
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinerRegion.setAdapter(adapter);
        spinerRegion.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
//        ((TextView)spinerRegion.getSelectedView()).setError("Error message");
        View selectedView = spinerRegion.getSelectedView();
         if (selectedView != null && selectedView instanceof TextView);
            spinerRegion.requestFocus();
            TextView selectedTextView = (TextView) selectedView;
            selectedTextView.setError("error");
//            selectedTextView.setTextColor(Color.RED);
//            selectedTextView.setText(error);
            spinerRegion.performClick();
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
