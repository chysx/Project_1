package com.zhang.project_1

import android.animation.TypeEvaluator
import android.animation.ValueAnimator
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class MyView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {
    var paint: Paint? = null
    var currentPoint: Point? = null
    companion object {
        val RADIUS: Float = 70f
    }

    init {
        paint = Paint()
        paint!!.color = Color.BLUE
        paint!!.isAntiAlias = true
    }

    override fun onDraw(canvas: Canvas?) {
        if(currentPoint == null){
            canvas?.drawCircle(RADIUS, RADIUS, RADIUS,paint)
            var startPoint = Point(RADIUS, RADIUS)
            var endPoint = Point(700f,1000f)
            var valueAnimator = ValueAnimator.ofObject(TypeEvaluator<Point> {
                fraction, startValue, endValue ->
                var x: Float = startValue.x + fraction * (endValue.x - startValue.x)
                var y: Float = startValue.y + fraction * (endPoint.y - startValue.y)
                return@TypeEvaluator Point(x,y)
            },startPoint,endPoint)

            valueAnimator.duration = 5000
            valueAnimator.addUpdateListener {
                currentPoint = it.animatedValue as Point?
                invalidate()
            }
            valueAnimator.start()
        }else{
            canvas?.drawCircle(currentPoint!!.x, currentPoint!!.y, RADIUS,paint)
        }
    }
}