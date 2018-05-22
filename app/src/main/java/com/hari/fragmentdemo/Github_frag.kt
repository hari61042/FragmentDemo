package com.hari.fragmentdemo

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient

class Github_frag:Fragment(){
    var wview5:WebView?=null
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        var v = inflater?.inflate(R.layout.github,container,false)
        var wview5:WebView= v!!.findViewById(R.id.wview5)
        var WebSettings=wview5?.settings
        WebSettings?.javaScriptEnabled=true
        wview5.loadUrl("https://www.github.com/hari61042")
        wview5?.webViewClient = WebViewClient()
        return v
    }
}