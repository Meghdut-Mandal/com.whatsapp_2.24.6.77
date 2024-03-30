package X;

import android.os.SystemClock;

/* renamed from: X.1Uh  reason: invalid class name and case insensitive filesystem */
public final class C28851Uh implements AnonymousClass0z8 {
    public final C20810yC A00;
    public final AnonymousClass00T A01 = new AnonymousClass00U(new C28861Ui(this));
    public final C233318b A02;
    public final AnonymousClass005 A03;

    public C28851Uh(C20810yC r3, C233318b r4, AnonymousClass005 r5) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r5, 3);
        this.A00 = r3;
        this.A02 = r4;
        this.A03 = r5;
    }

    public void BRC() {
        if (((Boolean) this.A01.getValue()).booleanValue()) {
            AnonymousClass1N6 r3 = (AnonymousClass1N6) this.A03.get();
            r3.A02.Boy(new C35731jA((Object) r3, 47));
        }
    }

    public void onAppBackgrounded() {
        if (((Boolean) this.A01.getValue()).booleanValue()) {
            AnonymousClass1N6 r3 = (AnonymousClass1N6) this.A03.get();
            r3.A02.Boy(new C35731jA((Object) r3, 46));
        }
        C233318b r4 = this.A02;
        if (r4.A04) {
            r4.A02(((SystemClock.elapsedRealtime() / 1000) - r4.A01) + 1);
            Runnable runnable = r4.A02;
            if (runnable != null) {
                r4.A09.Bnx(runnable);
            }
        }
    }
}
