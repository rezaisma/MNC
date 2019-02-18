package com.example.reza.form;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class InformasiDetailSurveyArea extends AppCompatActivity {

    @BindView(R.id.cbAjenisPro)
    CheckBox cbAjenisPro;
    @BindView(R.id.cbBjenisPro)
    CheckBox cbBjenisPro;
    @BindView(R.id.cbCjenisPro)
    CheckBox cbCjenisPro;
    @BindView(R.id.cbAKlarifikasiTipe)
    CheckBox cbAKlarifikasiTipe;
    @BindView(R.id.cbBKlarifikasiTipe)
    CheckBox cbBKlarifikasiTipe;
    @BindView(R.id.cbCKlarifikasiTipe)
    CheckBox cbCKlarifikasiTipe;
    @BindView(R.id.cbDKlarifikasiTipe)
    CheckBox cbDKlarifikasiTipe;
    @BindView(R.id.cbEKlarifikasiTipe)
    CheckBox cbEKlarifikasiTipe;
    @BindView(R.id.cbFKlarifikasiTipe)
    CheckBox cbFKlarifikasiTipe;
    @BindView(R.id.edDataHomePass)
    EditText edDataHomePass;
    @BindView(R.id.rbMobilMotor)
    RadioButton rbMobilMotor;
    @BindView(R.id.rbMotor)
    RadioButton rbMotor;
    @BindView(R.id.cbAMetode)
    CheckBox cbAMetode;
    @BindView(R.id.cbBMetode)
    CheckBox cbBMetode;
    @BindView(R.id.cbCMetode)
    CheckBox cbCMetode;
    @BindView(R.id.cbDMetode)
    CheckBox cbDMetode;
    @BindView(R.id.edMetode)
    EditText edMetode;
    @BindView(R.id.etAkses)
    TextView etAkses;
    @BindView(R.id.cbAAkses)
    CheckBox cbAAkses;
    @BindView(R.id.cbBAkses)
    CheckBox cbBAkses;
    @BindView(R.id.cbCAkses)
    CheckBox cbCAkses;
    @BindView(R.id.cbDAkses)
    CheckBox cbDAkses;
    @BindView(R.id.edAkses)
    EditText edAkses;
    @BindView(R.id.etkompetitor)
    TextView etkompetitor;
    @BindView(R.id.cbAkompetitor)
    CheckBox cbAkompetitor;
    @BindView(R.id.cbBkompetitor)
    CheckBox cbBkompetitor;
    @BindView(R.id.cbCkompetitor)
    CheckBox cbCkompetitor;
    @BindView(R.id.cbDkompetitor)
    CheckBox cbDkompetitor;
    @BindView(R.id.cbEkompetitor)
    CheckBox cbEkompetitor;
    @BindView(R.id.cbFKompetitor)
    CheckBox cbFKompetitor;
    @BindView(R.id.edkompetitor)
    EditText edkompetitor;
    @BindView(R.id.cbAMayoritas)
    CheckBox cbAMayoritas;
    @BindView(R.id.cbBMayoritas)
    CheckBox cbBMayoritas;
    @BindView(R.id.cbCMayoritas)
    CheckBox cbCMayoritas;
    @BindView(R.id.cbDMayoritas)
    CheckBox cbDMayoritas;
    @BindView(R.id.cbEMayoritas)
    CheckBox cbEMayoritas;
    @BindView(R.id.cbFMayoritas)
    CheckBox cbFMayoritas;
    @BindView(R.id.edMayoritas)
    EditText edMayoritas;
    @BindView(R.id.edRata2BiayaInternet)
    EditText edRata2BiayaInternet;
    @BindView(R.id.btnNextDetailSurvey)
    Button btnNextDetailSurvey;
    @BindView(R.id.btnBackDetailSurvey)
    Button btnBackDetailSurvey;
    @BindView(R.id.scrollKab)
    ScrollView scrollKab;
    @BindView(R.id.etDataHomePass)
    TextView etDataHomePass;
    @BindView(R.id.etMayoritasKendaraan)
    TextView etMayoritasKendaraan;
    @BindView(R.id.etMetodePembangunan)
    TextView etMetodePembangunan;
    @BindView(R.id.etMayoritasProvider)
    TextView etMayoritasProvider;
    RadioGroup Radiogroup1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasi_detail_survey_area);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btnNextDetailSurvey, R.id.btnBackDetailSurvey})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnNextDetailSurvey:

                if (TextUtils.isEmpty(edDataHomePass.getText())) {
                    edDataHomePass.setError("Harus Diisi");

                }
                if (TextUtils.isEmpty(edRata2BiayaInternet.getText())) {
                    edRata2BiayaInternet.setError("Harus Diisi");
//
//                    }if (TextUtils.isEmpty(edDeveloper.getText())) {
//                    edDeveloper.setError("Harus Diisi");

                } else {
                    Intent intent6 = new Intent(this, Identita_Surveyor.class);
                    startActivity(intent6);
                    break;
                }
            case R.id.btnBackDetailSurvey:
                Intent intent7 = new Intent(this, InfoKabKota.class);
                startActivity(intent7);
                break;

        }
    }
}