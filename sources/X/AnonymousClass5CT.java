package X;

import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Vibrator;
import android.view.ViewGroup;

/* renamed from: X.5CT  reason: invalid class name */
public class AnonymousClass5CT extends AnonymousClass6F8 {
    public final int A00;
    public final Path A01;

    public AnonymousClass5CT(RectF rectF, Handler handler, Vibrator vibrator, ViewGroup viewGroup, int i) {
        super(rectF, handler, vibrator, viewGroup);
        float f;
        float centerY;
        float f2;
        float centerY2;
        this.A00 = i;
        RectF rectF2 = this.A03;
        if (i != 1) {
            f = rectF2.centerX();
            centerY = rectF2.top;
            f2 = rectF2.centerX();
            centerY2 = rectF2.bottom;
        } else {
            f = rectF2.left;
            centerY = rectF2.centerY();
            f2 = rectF2.right;
            centerY2 = rectF2.centerY();
        }
        Path A0M = C36441kJ.A0M();
        A0M.rewind();
        A0M.moveTo(f, centerY);
        A0M.lineTo(f2, centerY2);
        this.A01 = A0M;
    }
}
