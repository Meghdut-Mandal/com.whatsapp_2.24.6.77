package X;

import android.graphics.Matrix;
import android.os.SystemClock;
import android.view.View;
import android.widget.OverScroller;

/* renamed from: X.74L  reason: invalid class name */
public class AnonymousClass74L implements Runnable {
    public float A00;
    public float A01;
    public long A02;
    public long A03;
    public Matrix A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public float A0A;
    public float A0B;
    public float[] A0C = C90524aI.A0v();
    public final View A0D;
    public final OverScroller A0E;
    public final AnonymousClass7c2 A0F;

    public void run() {
        boolean z;
        int i;
        int i2;
        if (!this.A06) {
            if (!this.A09) {
                if (this.A07) {
                    this.A0E.forceFinished(true);
                    this.A00 = 0.0f;
                }
                this.A07 = false;
                this.A09 = true;
            }
            OverScroller overScroller = this.A0E;
            if (overScroller.computeScrollOffset()) {
                float[] fArr = this.A0C;
                fArr[0] = (float) overScroller.getCurrX();
                fArr[1] = (float) overScroller.getCurrY();
                Matrix matrix = this.A04;
                if (matrix != null) {
                    matrix.mapPoints(fArr);
                }
                float f = fArr[0];
                float f2 = fArr[1];
                if (this.A08) {
                    this.A08 = false;
                    this.A0A = f;
                    this.A0B = f2;
                }
                AnonymousClass7c2 r6 = this.A0F;
                float f3 = f - this.A0A;
                float f4 = f2 - this.A0B;
                C92794ej r62 = (C92794ej) r6;
                double d = r62.A04;
                long j = r62.A0J;
                float f5 = (float) j;
                r62.A04 = C92794ej.A00(d - ((double) (f3 / f5)));
                r62.A05 = r62.A0B(r62.A05 - ((double) (f4 / f5)), j);
                this.A0A = f;
                this.A0B = f2;
                z = true;
            } else {
                z = false;
            }
            double d2 = (double) this.A01;
            if (d2 < -0.01d || d2 > 0.01d) {
                long j2 = this.A03;
                int i3 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
                long uptimeMillis = SystemClock.uptimeMillis();
                if (i3 == 0) {
                    this.A03 = uptimeMillis;
                    i2 = 1;
                } else {
                    i2 = ((int) (uptimeMillis - j2)) / 10;
                    this.A03 = j2 + ((long) (i2 * 10));
                }
                float pow = (float) (d2 * Math.pow(0.9150000214576721d, (double) i2));
                this.A01 = pow;
                C92794ej r2 = (C92794ej) this.A0F;
                if (C92794ej.A0A(r2, pow + 1.0f, r2.A0A, r2.A0B)) {
                    z = true;
                } else {
                    this.A01 = 0.0f;
                }
            }
            double d3 = (double) this.A00;
            if (d3 < -0.01d || d3 > 0.01d) {
                long j3 = this.A02;
                int i4 = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
                long uptimeMillis2 = SystemClock.uptimeMillis();
                if (i4 == 0) {
                    this.A02 = uptimeMillis2;
                    i = 1;
                } else {
                    i = ((int) (uptimeMillis2 - j3)) / 10;
                    this.A02 = j3 + ((long) (i * 10));
                }
                float pow2 = (float) (d3 * Math.pow(0.8500000238418579d, (double) i));
                this.A00 = pow2;
                C92794ej r3 = (C92794ej) this.A0F;
                r3.A0E(r3.A0C + pow2, r3.A0A, r3.A0B);
            } else if (!z) {
                this.A09 = false;
                this.A05 = false;
            }
            View view = this.A0D;
            view.invalidate();
            view.postOnAnimation(this);
            return;
        }
        C92794ej r1 = (C92794ej) this.A0F;
        r1.A0M.A04();
        C92794ej.A07(r1);
    }

    public AnonymousClass74L(View view, AnonymousClass7c2 r4) {
        this.A0D = view;
        this.A0F = r4;
        OverScroller overScroller = new OverScroller(view.getContext());
        this.A0E = overScroller;
        overScroller.setFriction(0.035f);
    }
}
