package X;

import android.os.SystemClock;

/* renamed from: X.1Uc  reason: invalid class name and case insensitive filesystem */
public final class C28801Uc implements AnonymousClass0z8 {
    public long A00;
    public final AnonymousClass005 A01;
    public final AnonymousClass005 A02;
    public final AnonymousClass005 A03;

    public C28801Uc(AnonymousClass005 r2, AnonymousClass005 r3, AnonymousClass005 r4) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r4, 3);
        this.A03 = r2;
        this.A02 = r3;
        this.A01 = r4;
    }

    public void BRC() {
    }

    public void onAppBackgrounded() {
        this.A02.get();
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis >= this.A00 + ((long) 5000)) {
            this.A00 = uptimeMillis;
            if (C20800yB.A01(C21000yV.A02, (C20800yB) this.A01.get(), 7156)) {
                ((C21010yW) this.A03.get()).Bph(true);
            }
        }
    }
}
