package idv.yves.drawapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by 202 on 2015/3/26.
 */
public class RecBar extends View{

    private Paint paint = new Paint();//畫筆,可重複使用
    private Rect rect = new Rect();

    public RecBar(Context context){
         super(context);
    }

    public RecBar(Context context, AttributeSet attrs) {//有XML設定所以要有此建構子
        super(context, attrs);
    }

    public Paint getPaint() {
        return paint;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
    }

    @Override
    protected void onDraw(Canvas canvas) {//canvas畫布
        super.onDraw(canvas);
        //取得這個元件的長與寬
        int viewHeight = this.getHeight();
        int viewWidth = this.getWidth();
        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(1.5f);

        rect.set(0,0,viewWidth/2,viewHeight/2);
        canvas.drawRect(rect,paint);
    }

}
