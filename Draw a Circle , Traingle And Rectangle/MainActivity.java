package com.example.draw_a_circle_and_basic_graphical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(new MyView(this));
    }

    //circle
    public class MyView extends View {

        public MyView(Context context) {
            super(context);
        }



        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            int x = getWidth();
            int y = getHeight();

            int radius;

            radius = 200;

            Paint paint = new Paint();
            Path path =new Path();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.WHITE);
            canvas.drawPaint(paint);



            paint.setColor(Color.parseColor("blue"));
            canvas.drawCircle(x / 2, y / 2, radius, paint);


            //rectangle
            paint.setColor(Color.parseColor("green"));
            canvas.drawRect(100,50,300,300,paint);


            //traingle

            Point a=new Point(350,50);
            Point b=new Point(350,300);
            Point c=new Point(550,50);
            paint.setColor(Color.parseColor("red"));

            //Path path1 =new Path();
            path.setFillType(Path.FillType.EVEN_ODD);
            path.lineTo(a.x,a.y);

            path.lineTo(b.x,b.y);

            path.lineTo(c.x,c.y);
            path.lineTo(a.x,a.y);
            path.close();

            canvas.drawPath(path,paint);






        }

    }
}
