package com.zhang.project_1

import android.animation.ValueAnimator
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class Activity_1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)

        initView()
    }

    private fun initView(){
        val btnClick = findViewById<Button>(R.id.btn_click)
        btnClick.setOnClickListener {
            setAnimation()
        }
    }

    private fun setAnimation(){
        val btnAnimation = findViewById<Button>(R.id.btn_animation)
        val valueAnimator = ValueAnimator.ofInt(btnAnimation.layoutParams.width,500)
        valueAnimator.duration = 2000
        valueAnimator.addUpdateListener {
            btnAnimation.layoutParams.width = it.animatedValue as Int
            btnAnimation.requestLayout()
        }
        valueAnimator.start()
    }

}
