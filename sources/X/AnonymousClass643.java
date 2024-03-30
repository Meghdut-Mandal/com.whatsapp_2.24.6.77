package X;

import android.graphics.PointF;

/* renamed from: X.643  reason: invalid class name */
public class AnonymousClass643 {
    public C91064bP A00;
    public C91064bP A01;
    public final long A02;
    public final AnonymousClass6NK A03;
    public final C91064bP A04;

    public void A00(PointF pointF, long j) {
        if (j >= this.A02) {
            C91064bP r5 = this.A00;
            C91064bP r4 = this.A01;
            if (r5 == r4) {
                this.A00 = new C91064bP(pointF);
                return;
            }
            C91064bP r3 = this.A04;
            float f = pointF.x - r4.x;
            r3.x = f;
            float f2 = pointF.y - r4.y;
            r3.y = f2;
            r3.x = f * 0.5f;
            r3.y = f2 * 0.5f;
            this.A03.A00(r5, r3);
            this.A01.set(this.A00);
            this.A00.set(pointF);
            return;
        }
        throw AnonymousClass001.A09("events must deliver in order");
    }

    public AnonymousClass643(PointF pointF, long j) {
        AnonymousClass6NK r2 = new AnonymousClass6NK();
        this.A03 = r2;
        C91064bP r1 = new C91064bP();
        this.A04 = r1;
        C91064bP r0 = new C91064bP(pointF);
        this.A00 = r0;
        this.A01 = r0;
        this.A02 = j;
        r2.A00(r0, r1);
    }
}
