package com.example.reza.form;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.reza.form.loginactivity.LoginAdminActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class InfoKabKota extends AppCompatActivity {

    @BindView(R.id.spinnerKabKota)
    Spinner spinnerKabKota;
    @BindView(R.id.etKecamatan)
    TextView etKecamatan;
    @BindView(R.id.edKecamtan)
    EditText edKecamtan;
    @BindView(R.id.edKelurahan)
    EditText edKelurahan;
    @BindView(R.id.edKompleks)
    EditText edKompleks;
    @BindView(R.id.edDeveloper)
    EditText edDeveloper;
    @BindView(R.id.btnNextKab)
    Button btnNextKab;
    @BindView(R.id.btnBackKab)
    Button btnBackKab;
    @BindView(R.id.scrollKab)
    ScrollView scrollKab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_kab_kota);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btnNextKab, R.id.btnBackKab})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnNextKab:
                Intent intent4 = new Intent(this, InformasiDetailSurveyArea.class);
                startActivity(intent4);
                break;
            case R.id.btnBackKab:
                Intent intent5 = new Intent(this, TanggalSurveyArea.class);
                startActivity(intent5);
                break;
        }
    }
}
