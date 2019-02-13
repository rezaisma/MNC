package com.example.reza.form;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.reza.form.loginactivity.LoginAdminActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Identita_Surveyor extends AppCompatActivity {

    @BindView(R.id.spinnerKabKota)
    Spinner spinnerKabKota;
    @BindView(R.id.etNoTlpn)
    TextView etNoTlpn;
    @BindView(R.id.edNoTlpn)
    EditText edNoTlpn;
    @BindView(R.id.rbYa)
    RadioButton rbYa;
    @BindView(R.id.rbTidak)
    RadioButton rbTidak;
    @BindView(R.id.btnFinish)
    Button btnFinish;
    @BindView(R.id.btnBackIdentitas)
    Button btnBackIdentitas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identita__surveyor);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btnFinish, R.id.btnBackIdentitas})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnFinish:
                break;
            case R.id.btnBackIdentitas:
                Intent intent8 = new Intent(this, InformasiDetailSurveyArea.class);
                startActivity(intent8);
                break;
        }
    }
}
