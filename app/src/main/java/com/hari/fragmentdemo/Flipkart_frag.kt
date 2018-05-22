package com.hari.fragmentdemo

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView

class Flipkart_frag:Fragment(){
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        var v = inflater?.inflate(R.layout.flipkart,container,false)
        var wview1:WebView= v!!.findViewById(R.id.wview1)
        var WebSettings=wview1?.settings
        WebSettings?.javaScriptEnabled=true
        wview1.loadUrl("https://www.flipkart.com")
        return v
    }
}