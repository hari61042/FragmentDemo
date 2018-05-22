package com.hari.fragmentdemo

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView

class Amazon_frag:Fragment(){
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        var v = inflater?.inflate(R.layout.amazon,container,false)
        var wview2:WebView= v!!.findViewById(R.id.wview2)
        var WebSettings=wview2?.settings
        WebSettings?.javaScriptEnabled=true
        wview2.loadUrl("https://www.amazon.in")
        return v
    }
}