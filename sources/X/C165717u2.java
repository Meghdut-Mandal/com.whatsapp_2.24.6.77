package X;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.LocaleList;

/* renamed from: X.7u2  reason: invalid class name and case insensitive filesystem */
public class C165717u2 extends Paint {
    public C165717u2(int i, PorterDuff.Mode mode) {
        super(1);
        C165587tf.A0v(this, mode);
    }

    public void setTextLocales(LocaleList localeList) {
    }

    public void setAlpha(int i) {
        if (Build.VERSION.SDK_INT < 30) {
            int color = getColor();
            PointF pointF = C200579hd.A00;
            setColor((C165607th.A03(255, i, 0) << 24) | (color & 16777215));
            return;
        }
        PointF pointF2 = C200579hd.A00;
        super.setAlpha(C165607th.A03(255, i, 0));
    }

    public C165717u2(PorterDuff.Mode mode) {
        C165587tf.A0v(this, mode);
    }

    public C165717u2(int i) {
        super(i);
    }

    public C165717u2() {
    }
}
