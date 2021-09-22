package cs301.birthdaycake;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Square {
    private float cx,cy;
    private Paint color1, color2;

    public Square(float x, float y) {
        cx = x;
        cy = y;
        color1.setColor(Color.RED);
        color2.setColor(Color.GREEN);

    }
    public void draw(Canvas canvas) {
        canvas.drawRect(cx -10,cy -10,cx,cy,color1);
    }

}
