package com.xuanguofeng.openframe.okhttp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xuanguofeng.openframe.R;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OkHttpActivity extends AppCompatActivity {
    OkHttpClient client = new OkHttpClient.Builder().readTimeout(5, TimeUnit.SECONDS).build();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ok_http);
        synRequest();
    }


    public void synRequest() {
        Request request = new Request.Builder().url("http://www.baidu.com")
                .get().build();

        Call call = client.newCall(request);
        try {
            Response response = call.execute();
            System.out.println(response.body().string());
            call.enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {

                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {

                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
