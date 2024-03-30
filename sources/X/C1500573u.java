package X;

import android.view.View;

/* renamed from: X.73u  reason: invalid class name and case insensitive filesystem */
public final class C1500573u implements Runnable {
    public float A00;
    public float A01;
    public long A02 = -1;
    public boolean A03;
    public boolean A04;
    public final View A05;
    public final C135346cY A06;

    public void run() {
        float f;
        float f2;
        if (!this.A04) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.A02;
            if (j != -1) {
                f = (float) (currentTimeMillis - j);
            } else {
                f = 0.0f;
            }
            if (j == -1) {
                this.A02 = currentTimeMillis;
            }
            int i = (f > 100.0f ? 1 : (f == 100.0f ? 0 : -1));
            float f3 = this.A00;
            if (i >= 0) {
                f2 = this.A01;
            } else {
                float f4 = f3;
                float f5 = ((float) 100) - f;
                f3 = (f3 / f5) * 10.0f;
                float f6 = this.A01;
                f2 = (f6 / f5) * 10.0f;
                if (Math.abs(f3) > Math.abs(f4) || Float.isNaN(f3)) {
                    f3 = f4;
                }
                if (Math.abs(f2) > Math.abs(f6) || Float.isNaN(f2)) {
                    f2 = f6;
                }
            }
            C135346cY.A03(this.A06, f3, f2);
            float f7 = this.A00 - f3;
            this.A00 = f7;
            float f8 = this.A01 - f2;
            this.A01 = f8;
            if (f7 == 0.0f && f8 == 0.0f) {
                this.A03 = false;
                this.A04 = true;
            }
            if (!this.A04) {
                this.A05.post(this);
            }
        }
    }

    public C1500573u(View view, C135346cY r4) {
        this.A05 = view;
        this.A06 = r4;
    }
}
