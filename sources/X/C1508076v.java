package X;

import java.util.concurrent.Callable;

/* renamed from: X.76v  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1508076v implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ C1493370u A06;

    public /* synthetic */ C1508076v(C1493370u r1, int i, int i2, int i3, int i4, int i5, long j) {
        this.A06 = r1;
        this.A05 = j;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A04 = i5;
    }

    public final Object call() {
        C1493370u r3 = this.A06;
        long j = this.A05;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A02;
        int i4 = this.A03;
        int i5 = this.A04;
        int i6 = 0;
        if (!C1493370u.A09(r3)) {
            int i7 = r3.A01 + 1;
            r3.A01 = i7;
            if (i7 >= 8) {
                i6 = -6;
            }
            return Integer.valueOf(i6);
        }
        r3.A0E.renderNativeFrame(j, i, i2, i3, i4, i5);
        r3.A01 = 0;
        return Integer.valueOf(C1493370u.A01(r3));
    }
}
