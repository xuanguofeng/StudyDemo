package com.xuanguofeng.openframe.retrofit;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * description:
 * created time: 2018/1/29 21:17
 *
 * @author xuanguofeng
 */

public interface ApiService {

    @GET("v2/book/1220562")
    Call<String> listRepos(@QueryMap HashMap hashMap);



}
