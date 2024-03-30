package X;

import android.os.SystemClock;

/* renamed from: X.3nJ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C75483nJ implements C87924Qs {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C39471sS A01;

    public /* synthetic */ C75483nJ(C39471sS r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }

    public final void Bc9(C145166tS r7, boolean z) {
        C39471sS r5 = this.A01;
        long elapsedRealtime = 1000 - (SystemClock.elapsedRealtime() - this.A00);
        if (elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        r5.A0H.A0I(new AnonymousClass752(r5, r7, 19, z), elapsedRealtime);
    }
}
