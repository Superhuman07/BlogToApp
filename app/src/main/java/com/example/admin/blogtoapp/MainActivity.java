package com.example.admin.blogtoapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView = (WebView) findViewById(R.id.webView);
        webView.setWebViewClient(new MyBrowser());
        // set the previously chosen url
        String url = "http://simplecodeforyou.blogspot.in/";
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        //webView.getScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        // load it
        webView.loadUrl(url);
    }
}
