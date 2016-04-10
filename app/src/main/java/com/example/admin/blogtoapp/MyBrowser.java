package com.example.admin.blogtoapp;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Admin on 10-04-2016.
 */
public class MyBrowser extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url)
    {
        view.loadUrl(url);
        return true;
    }
}
