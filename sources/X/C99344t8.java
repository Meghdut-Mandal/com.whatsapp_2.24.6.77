package X;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;

/* renamed from: X.4t8  reason: invalid class name and case insensitive filesystem */
public class C99344t8 extends C99294t2 {
    public void A0E(Canvas canvas) {
        RectF rectF = this.A00;
        if (rectF.isEmpty()) {
            super.A0E(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(rectF);
        } else {
            canvas.clipRect(rectF, Region.Op.DIFFERENCE);
        }
        super.A0E(canvas);
        canvas.restore();
    }

    public C99344t8(AnonymousClass06J r1) {
        super(r1);
    }
}
