package com.example.canvases;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

class MyDraw extends View {
    public MyDraw(Context context) {
        super(context);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        //super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.YELLOW);
        paint.setStrokeWidth(20);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        //canvas.drawColor(Color.BLUE);
        canvas.drawCircle(70, 70, 300, paint);

        paint.setColor(Color.DKGRAY);
        canvas.drawRect(0, getHeight(), getWidth(), 1400, paint);

        paint.setColor(Color.GRAY);
        paint.setStrokeWidth(20);
        paint.setStyle(Paint.Style.FILL);
        Path path = new Path();
        path.moveTo(350, 900);
        path.lineTo(100, 1300);
        path.lineTo(100, 1800);
        path.lineTo(600, 1800);
        path.lineTo(600, 1300);
        path.lineTo(350, 900);
        canvas.drawPath(path, paint);

        paint.setColor(Color.GREEN);
        canvas.drawOval(1200, 500, 900,1700, paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.BLACK);
        path.moveTo(100, 1300);
        path.lineTo(600, 1300);
        canvas.drawPath(path, paint);

        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL);
        path.moveTo(900, 2000);
        path.lineTo(900, 2200);
        path.lineTo(950, 2200);
        path.lineTo(950, 2100);
        path.lineTo(1350, 2100);
        path.lineTo(1350, 2200);
        path.lineTo(1400, 2200);
        path.lineTo(1400, 2000);
        canvas.drawPath(path, paint);
    }
}
