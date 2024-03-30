package X;

import android.graphics.PointF;

/* renamed from: X.6LM  reason: invalid class name */
public class AnonymousClass6LM {
    public long A00;
    public final AnonymousClass643 A01;
    public final C91064bP A02 = new C91064bP();
    public final C91064bP A03;
    public final C91064bP A04;
    public final C91064bP A05;

    public static void A00(AnonymousClass6LM r6) {
        C91064bP r3 = r6.A04;
        C91064bP r2 = r6.A02;
        C91064bP r5 = r6.A03;
        float f = r2.x - r5.x;
        r3.x = f;
        float f2 = r2.y - r5.y;
        r3.y = f2;
        float f3 = f * 0.05f;
        r3.x = f3;
        float f4 = f2 * 0.05f;
        r3.y = f4;
        C91064bP r32 = r6.A05;
        float f5 = r32.x + f3;
        r32.x = f5;
        float f6 = r32.y + f4;
        r32.y = f6;
        float f7 = f5 * 0.7f;
        r32.x = f7;
        float f8 = f6 * 0.7f;
        r32.y = f8;
        r5.x += f7;
        r5.y += f8;
        long j = (long) (((double) r6.A00) + 3.0d);
        r6.A00 = j;
        r6.A01.A00(r5, j);
    }

    public AnonymousClass6LM(PointF pointF, long j) {
        C91064bP r2 = new C91064bP();
        this.A03 = r2;
        C91064bP r1 = new C91064bP();
        this.A05 = r1;
        this.A04 = new C91064bP();
        this.A01 = new AnonymousClass643(pointF, j);
        this.A00 = j;
        r2.set(pointF);
        r1.set(0.0f, 0.0f);
    }
}
