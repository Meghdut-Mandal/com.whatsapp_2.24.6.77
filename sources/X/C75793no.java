package X;

import android.os.SystemClock;

/* renamed from: X.3no  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C75793no implements AnonymousClass4TM {
    public final /* synthetic */ C75273mx A00;
    public final /* synthetic */ AnonymousClass1O8 A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ C75793no(C75273mx r1, AnonymousClass1O8 r2, boolean z) {
        this.A01 = r2;
        this.A02 = z;
        this.A00 = r1;
    }

    public /* synthetic */ void onError(Throwable th) {
    }

    public final void Bbg(C28981Uw r5) {
        AnonymousClass1O8 r0 = this.A01;
        boolean z = this.A02;
        C75273mx r3 = this.A00;
        C124245xp A002 = r0.A04.A00(r5, z);
        if (A002 != null) {
            r3.Bdf(A002, SystemClock.elapsedRealtime());
        }
    }
}
