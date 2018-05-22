package com.hari.fragmentdemo

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView

class Myntra_frag:Fragment(){
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        var v = inflater?.inflate(R.layout.myntra,container,false)
        var wview3:WebView= v!!.findViewById(R.id.wview3)
        var WebSettings=wview3?.settings
        WebSettings?.javaScriptEnabled=true
        wview3.loadUrl("https://www.myntra.com")
        return v
    }
}