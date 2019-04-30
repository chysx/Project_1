package com.zhang.project_1

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.util.Log
import android.view.View

class TestView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    var paint: Paint? = null

    init {
        paint = Paint()
        paint?.isAntiAlias = true
        paint?.color = Color.RED
    }

    override fun onDraw(canvas: Canvas?) {
        Log.e("TestView",canvas?.matrix?.toShortString())
        canvas?.drawColor(Color.GRAY)
        canvas?.drawCircle(0f,0f,40.0f,paint)
    }

}

