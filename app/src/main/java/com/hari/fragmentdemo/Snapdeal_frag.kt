package com.hari.fragmentdemo

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView

class Snapdeal_frag:Fragment(){
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        var v = inflater?.inflate(R.layout.snapdeal,container,false)
        var wview4:WebView= v!!.findViewById(R.id.wview4)
        var WebSettings=wview4?.settings
        WebSettings?.javaScriptEnabled=true
        wview4.loadUrl("https://www.myntra.com")
        return v
    }
}