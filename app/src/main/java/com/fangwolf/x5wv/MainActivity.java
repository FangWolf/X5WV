package com.fangwolf.x5wv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;

public class MainActivity extends AppCompatActivity {
    X5WebView x5WebView;
    String url = "https://www.jianshu.com/u/7e5c194cd331";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        x5WebView = findViewById(R.id.x5_wv);
        x5WebView.loadUrl(url);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        //处理返回键
        if (keyCode == KeyEvent.KEYCODE_BACK && x5WebView.canGoBack()) {
            x5WebView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
