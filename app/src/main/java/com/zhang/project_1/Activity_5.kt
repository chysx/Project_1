package com.zhang.project_1

import android.animation.Animator
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class Activity_5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_5)

        initView()
    }

    private fun initView(){
        val btnClick = findViewById<Button>(R.id.btn_click)
        btnClick.setOnClickListener {
            setAnimation()
        }
    }

    private fun setAnimation(){
        val view = findViewById<TestView>(R.id.tv_test)
        view.scrollBy(-10,-10)
    }

}
