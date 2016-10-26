package com.example.admin.mypayapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import c.b.BP;
import c.b.PListener;

public class PayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);
        BP.init(this, "4139fcb9b73dfd67372ce5d6c5b6f7ad");
    }
    //支付
    public void pay(View v){
        Log.i("GoPayActivity", "orderId: ");
        BP.pay("商品名称", "描述", 0.02, true, new PListener() {
            @Override
            public void orderId(String s) {
                Log.i("GoPayActivity", "orderId: ");
            }
            @Override
            public void succeed() {
                Log.i("GoPayActivity", "succeed: ");
            }

            @Override
            public void fail(int i, String s) {
                Log.i("GoPayActivity", "fail: ");
            }

            @Override
            public void unknow() {
                Log.i("GoPayActivity", "unknow: ");
            }
        });
    }
}
