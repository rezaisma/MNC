package com.example.reza.form;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.reza.form.loginactivity.MainActivity;
import com.example.reza.form.model.mob;
import com.example.reza.form.network.RegisterAPI;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.reza.form.network.ApiClient.BASE_URL;

public class InfoKabKota  extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private ProgressDialog progress;

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

    String kecamatan;
    String kelurahan;
    String developer;
    String text2;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_kab_kota);
        ButterKnife.bind(this);


        kecamatan = edKecamtan.getText().toString();
        kelurahan = edKelurahan.getText().toString();
        developer = edDeveloper.getText().toString();

        Bundle bundle = new Bundle();
        bundle.putString("kecamatan", kecamatan);
        bundle.putString("kelurahan", kelurahan);
        bundle.putString("developer", developer);
        bundle.putString("text2", text2);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.str_kab, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerKabKota.setAdapter(adapter);
        spinnerKabKota.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        text2 = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text2, Toast.LENGTH_SHORT).show();
        View selectedView = spinnerKabKota.getSelectedView();
        if (selectedView != null && selectedView instanceof TextView);
        spinnerKabKota.requestFocus();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @OnClick({R.id.btnNextKab, R.id.btnBackKab})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnNextKab:

                progress = new ProgressDialog(this);
                progress.setCancelable(false);
                progress.setMessage("Loading ...");
                progress.show();

                if (TextUtils.isEmpty(edKecamtan.getText())) {
                    edKecamtan.setError("Harus Diisi");

                }if (TextUtils.isEmpty(edKelurahan.getText())) {
                    edKelurahan.setError("Harus Diisi");

                }if (TextUtils.isEmpty(edDeveloper.getText())) {
                    edDeveloper.setError("Harus Diisi");

                }else {
                    Intent intent4 = new Intent(this, InformasiDetailSurveyArea.class);
                    startActivity(intent4);


                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
                RegisterAPI api = retrofit.create(RegisterAPI.class);
                Call<Value> call = api.daftar(kecamatan,kelurahan,developer);
                call.enqueue(new Callback<Value>() {
                    @Override
                    public void onResponse(Call<Value> call, Response<Value> response) {
                        String value = response.body().getValue();
                        String message = response.body().getMessage();
                        progress.dismiss();
                        if (value.equals("1")) {
                            Toast.makeText(InfoKabKota.this, message, Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(InfoKabKota.this, message, Toast.LENGTH_SHORT).show();

                        }

                    }

                    @Override
                    public void onFailure(Call<Value> call, Throwable t) {
                        progress.dismiss();
                        Toast.makeText(InfoKabKota.this, "Jaringan Error!", Toast.LENGTH_SHORT).show();
                    }
                });


            };
                break;

            case R.id.btnBackKab:
                Intent intent5 = new Intent(this, TanggalSurveyArea.class);
                startActivity(intent5);
                break;

        }
    }

}
