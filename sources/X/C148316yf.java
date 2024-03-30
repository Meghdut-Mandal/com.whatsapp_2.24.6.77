package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.6yf  reason: invalid class name and case insensitive filesystem */
public class C148316yf implements C161077m7 {
    public final C21470zI A00;
    public final C21590zU A01;
    public final C21430zE A02;
    public final C21430zE A03;
    public final AnonymousClass5JT A04;
    public final AnonymousClass1UP A05;
    public final C133056Wm A06;

    public void BsN(int i, int i2, String str) {
        this.A03.BsN(i, i2, str);
    }

    public void BsO(int i, String str) {
        this.A03.BsO(i, str);
    }

    public void markerEnd(int i, int i2, short s) {
        this.A03.markerEnd(i, i2, s);
    }

    public void markerPoint(int i, String str, String str2) {
        this.A03.markerPoint(i, str, str2);
    }

    public void markerStart(int i) {
        C21430zE r0;
        int i2 = C133056Wm.A00(this.A06, i).A00;
        if (i2 == 1) {
            r0 = this.A03;
        } else if (i2 == 2) {
            r0 = this.A02;
        } else {
            return;
        }
        r0.markerStart(i);
    }

    public C148316yf(C21690ze r1, C21470zI r2, C21590zU r3, C21430zE r4, AnonymousClass5JT r5, AnonymousClass1UP r6, C133056Wm r7) {
        this.A03 = r4;
        this.A05 = r6;
        this.A02 = r1;
        this.A04 = r5;
        this.A06 = r7;
        this.A00 = r2;
        this.A01 = r3;
    }

    public void markerAnnotate(int i, int i2, String str, double d) {
        this.A03.markerAnnotate(i, i2, str, d);
    }

    public void markerAnnotate(int i, int i2, String str, int i3) {
        this.A03.markerAnnotate(i, i2, str, i3);
    }

    public void markerAnnotate(int i, int i2, String str, long j) {
        this.A03.markerAnnotate(i, i2, str, j);
    }

    public void markerAnnotate(int i, int i2, String str, String str2) {
        this.A03.markerAnnotate(i, i2, str, str2);
    }

    public void markerAnnotate(int i, int i2, String str, boolean z) {
        this.A03.markerAnnotate(i, i2, str, z);
    }

    public void markerAnnotate(int i, int i2, String str, double[] dArr) {
        this.A03.markerAnnotate(i, i2, str, dArr);
    }

    public void markerAnnotate(int i, int i2, String str, int[] iArr) {
        this.A03.markerAnnotate(i, i2, str, iArr);
    }

    public void markerAnnotate(int i, int i2, String str, long[] jArr) {
        this.A03.markerAnnotate(i, i2, str, jArr);
    }

    public void markerAnnotate(int i, int i2, String str, String[] strArr) {
        this.A03.markerAnnotate(i, i2, str, strArr);
    }

    public void markerAnnotate(int i, int i2, String str, boolean[] zArr) {
        this.A03.markerAnnotate(i, i2, str, zArr);
    }

    public void markerAnnotate(int i, String str, double d) {
        this.A03.markerAnnotate(i, str, d);
    }

    public void markerAnnotate(int i, String str, int i2) {
        this.A03.markerAnnotate(i, str, i2);
    }

    public void markerAnnotate(int i, String str, long j) {
        this.A03.markerAnnotate(i, str, j);
    }

    public void markerAnnotate(int i, String str, String str2) {
        this.A03.markerAnnotate(i, str, str2);
    }

    public void markerAnnotate(int i, String str, boolean z) {
        this.A03.markerAnnotate(i, str, z);
    }

    public void markerAnnotate(int i, String str, double[] dArr) {
        this.A03.markerAnnotate(i, str, dArr);
    }

    public void markerAnnotate(int i, String str, int[] iArr) {
        this.A03.markerAnnotate(i, str, iArr);
    }

    public void markerAnnotate(int i, String str, long[] jArr) {
        this.A03.markerAnnotate(i, str, jArr);
    }

    public void markerAnnotate(int i, String str, String[] strArr) {
        this.A03.markerAnnotate(i, str, strArr);
    }

    public void markerAnnotate(int i, String str, boolean[] zArr) {
        this.A03.markerAnnotate(i, str, zArr);
    }

    public void markerEnd(int i, short s) {
        this.A03.markerEnd(i, s);
    }

    public void markerPoint(int i, int i2, String str, String str2) {
        this.A03.markerPoint(i, i2, str, str2);
    }

    public void markerStart(int i, int i2) {
        C21430zE r0;
        int i3 = C133056Wm.A00(this.A06, i).A00;
        if (i3 == 1) {
            r0 = this.A03;
        } else if (i3 == 2) {
            r0 = this.A02;
        } else {
            return;
        }
        r0.markerStart(i, i2);
    }

    public void markerPoint(int i, String str, String str2, long j, TimeUnit timeUnit) {
        this.A03.markerPoint(i, str, str2, j, timeUnit);
    }

    public void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
        this.A03.markerPoint(i, i2, str, str2, j, timeUnit);
    }
}
