package com.zhang.project_1

import android.animation.Animator
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class Activity_3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

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
        val objectAnimator1 = ObjectAnimator.ofFloat(btnAnimation,"rotation",0f,360f)
        val objectAnimator2 = ObjectAnimator.ofFloat(btnAnimation,"translationY",
                btnAnimation.translationY,btnAnimation.translationY - 300f,btnAnimation.translationY)

        val animatorSet = AnimatorSet()
        animatorSet.play(objectAnimator1).with(objectAnimator2)
        animatorSet.duration = 5000
        animatorSet.start()
    }

}
