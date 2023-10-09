package com.app.lisiku;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewClientDiy extends WebViewClient {
    private Context context;

    public WebViewClientDiy(Context context) {
        this.context = context;
    }

    @Override
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);

        // 获取WebView的WebSettings
        WebSettings webSettings = view.getSettings();

        // 启用JavaScript
        webSettings.setJavaScriptEnabled(true);

        // 启用DOM存储
        webSettings.setDomStorageEnabled(true);
    }
}
