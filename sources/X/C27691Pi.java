package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.1Pi  reason: invalid class name and case insensitive filesystem */
public class C27691Pi {
    public final C19700wN A00;
    public final AnonymousClass189 A01;
    public final C20810yC A02;
    public final AnonymousClass19A A03;

    public void A00(C122795vR r6) {
        AnonymousClass19A r4 = this.A03;
        Message obtain = Message.obtain((Handler) null, 0, 206, 0, r6);
        String str = r6.A03;
        AnonymousClass00C.A0D(obtain, 0);
        AnonymousClass00C.A0D(str, 1);
        AnonymousClass19A.A01(obtain, r4, str, true);
    }

    public void A01(C122795vR r5) {
        this.A03.A0C(Message.obtain((Handler) null, 0, 206, 0, r5), r5.A03);
    }

    public C27691Pi(C19700wN r1, AnonymousClass189 r2, C20810yC r3, AnonymousClass19A r4) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
    }
}
