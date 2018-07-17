package com.example.sakshamspc.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class BaseActivity : AppCompatActivity() {
     val TAG ="Lifecycle"
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG,"${javaClass.simpleName}onCreate")
        super.onCreate(savedInstanceState)
    }
    override fun onStart(){
    Log.d(TAG, "${javaClass.simpleName}onStart")
        super.onStart()

    }

    override fun onResume() {
        Log.d(TAG,"${javaClass.simpleName}onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG,"${javaClass.simpleName}onPause")
        super.onPause()
    }

    override fun onRestart() {
        Log.d(TAG,"${javaClass.simpleName}Restart")
        super.onRestart()
    }

    override fun onStop() {
        Log.d(TAG,"${javaClass.simpleName}onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG,"${javaClass.simpleName}onDestroy")
        super.onDestroy()
    }
}

