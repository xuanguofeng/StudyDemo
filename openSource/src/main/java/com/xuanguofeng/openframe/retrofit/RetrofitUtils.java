package com.xuanguofeng.openframe.retrofit;

import java.io.IOException;

public class RetrofitUtils {

    public void request() throws IOException {



//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("https://api.douban.com")
//                .addConverterFactory(GsonConverterFactory.create())
//                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
//                .build();
//
//        ApiService apiService = retrofit.create(ApiService.class);
//
//        Call<String> call = apiService.listRepos();
//
//
////        call.execute();
//
//        call.enqueue(new Callback<String>() {
//            @Override
//            public void onResponse(Call<String> call, Response<String> response) {
//                Log.i("retrofit--->",response.message());
//            }
//
//            @Override
//            public void onFailure(Call<String> call, Throwable t) {
//                Log.i("retrofit--->",t.getMessage());
//            }
//        });
    }
}
