package com.example.simplecanvasandroidapp;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Canvas;

import android.view.View;

public class CanvasClass extends View {
    Paint paint;
    Rect rectangle;

    public CanvasClass(Context context) {
        super(context);
        paint = new Paint();
        rectangle = new Rect();
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        paint.setColor(Color.CYAN);
        paint.setStrokeWidth(5);
        canvas.drawRect(200, 200, 500, 500, paint);
        canvas.drawCircle(800, 350, 150, paint);
        canvas.drawLine(200, 600, 600, 600, paint);
        canvas.drawLine(200, 650, 600, 650, paint);
        canvas.drawLine(200, 700, 600, 700, paint);
    }
}