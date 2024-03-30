package X;

import android.content.Context;
import android.view.TextureView;

/* renamed from: X.4dH  reason: invalid class name and case insensitive filesystem */
public class C92194dH extends TextureView {
    public int A00;
    public int A01;
    public boolean A02;

    public void onMeasure(int i, int i2) {
        double d;
        int i3;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.A02) {
            double d2 = (double) measuredWidth;
            double d3 = (double) measuredHeight;
            int i4 = this.A01;
            int i5 = i4;
            double d4 = (double) i4;
            int i6 = this.A00;
            double d5 = (double) i6;
            double d6 = d4 / d5;
            if (Math.min(C90504aG.A00(d2 / d3, d6), C90504aG.A00(d3 / d2, d6)) > 0.01d) {
                boolean z = true;
                boolean A1T = C90474aD.A1T(measuredWidth, measuredHeight);
                if (i5 <= i6) {
                    z = false;
                }
                if (A1T == z) {
                    d = Math.max(d2 / d4, d3 / d5);
                    if (d < 1.0d) {
                        d = 1.0d / d;
                    }
                    i3 = (int) (d4 * d);
                } else {
                    double max = Math.max(d2 / d5, d3 / d4);
                    if (max < 1.0d) {
                        max = 1.0d / max;
                    }
                    i3 = (int) (d5 * d);
                    i6 = i5;
                }
                setMeasuredDimension(i3, (int) (d * ((double) i6)));
            }
        }
    }

    public C92194dH(Context context) {
        super(context);
    }
}
