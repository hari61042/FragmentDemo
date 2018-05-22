package com.hari.fragmentdemo

import android.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.JavascriptInterface

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fmanager = fragmentManager
        var tx= fmanager.beginTransaction()
        tx.add(R.id.frag1,Welcome_frag())
        tx.isAddToBackStackAllowed
        tx.commit()
    }

    @JavascriptInterface
    fun load(v:View){

        var fmanager=fragmentManager
        var tx= fmanager.beginTransaction()

        if(v.id==R.id.flipkart){
            tx.replace(R.id.frag1,Flipkart_frag())
        }else if(v.id==R.id.amazon){
            tx.replace(R.id.frag1,Amazon_frag())
        }else if(v.id==R.id.myntra){
            tx.replace(R.id.frag1,Myntra_frag())
        } else if(v.id==R.id.snapdeal){
            tx.replace(R.id.frag1,Snapdeal_frag())
        }else if(v.id==R.id.github){
            tx.replace(R.id.frag1,Github_frag())
        }
        //tx.addToBackStack(true.toString())
        tx.addToBackStack(null).commit()
    }
}
