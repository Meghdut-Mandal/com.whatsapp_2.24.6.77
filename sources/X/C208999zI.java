package X;

import android.os.Handler;

/* renamed from: X.9zI  reason: invalid class name and case insensitive filesystem */
public final class C208999zI implements B0W {
    public final /* synthetic */ C1689082m A00;

    public C208999zI(C1689082m r1) {
        this.A00 = r1;
    }

    public void Bcx() {
        this.A00.A0C = true;
    }

    public void Bjp(int i, long j, long j2) {
        AnonymousClass9QE r2 = this.A00.A0E;
        Handler handler = r2.A00;
        if (handler != null) {
            handler.post(new C80493vU(r2, i, 0, j, j2));
        }
    }
}
