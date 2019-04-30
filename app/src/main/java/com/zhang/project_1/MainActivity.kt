package com.zhang.project_1

import android.animation.ValueAnimator
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    private fun initView(){
        findViewById<Button>(R.id.btn_1).setOnClickListener(this)
        findViewById<Button>(R.id.btn_2).setOnClickListener(this)
        findViewById<Button>(R.id.btn_3).setOnClickListener(this)
        findViewById<Button>(R.id.btn_4).setOnClickListener(this)
        findViewById<Button>(R.id.btn_5).setOnClickListener(this)

    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.btn_1 -> {
                startActivity(Intent(MainActivity@this,Activity_1::class.java))
            }
            R.id.btn_2 -> {
                startActivity(Intent(MainActivity@this,Activity_2::class.java))
            }
            R.id.btn_3 -> {
                startActivity(Intent(MainActivity@this,Activity_3::class.java))
            }
            R.id.btn_4 -> {
                startActivity(Intent(MainActivity@this,Activity_4::class.java))
            }
            R.id.btn_5 -> {
                startActivity(Intent(MainActivity@this,Activity_5::class.java))
            }
        }
    }

}
