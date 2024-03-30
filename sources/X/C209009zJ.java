package X;

import android.os.Handler;

/* renamed from: X.9zJ  reason: invalid class name and case insensitive filesystem */
public final class C209009zJ implements B0W {
    public final /* synthetic */ AnonymousClass82G A00;

    public C209009zJ(AnonymousClass82G r1) {
        this.A00 = r1;
    }

    public void Bcx() {
        this.A00.A0B = true;
    }

    public void Bjp(int i, long j, long j2) {
        AnonymousClass9QE r2 = this.A00.A0I;
        Handler handler = r2.A00;
        if (handler != null) {
            handler.post(new C80493vU(r2, i, 0, j, j2));
        }
    }
}
