package com.example.reza.form.network;

import com.example.reza.form.Value;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface RegisterAPI {

    @FormUrlEncoded
    @POST("insert.php")
    Call<Value> daftar(@Field("kecamatan") String kecamatan,
                       @Field("kelurahan") String kelurahan,
                       @Field("developer") String developer);
}
