package com.bwie.picturedemo;

import java.util.HashMap;

import io.reactivex.Observable;
import okhttp3.MultipartBody;
import retrofit2.http.HeaderMap;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Url;

public interface UserApiService {

    @Multipart
    @POST
    Observable<ResponseEntity> upload(@Url String url, @HeaderMap HashMap<String,String> headers, @Part MultipartBody.Part filepart);
}
