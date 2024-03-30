package X;

import android.app.PendingIntent;

/* renamed from: X.19h  reason: invalid class name and case insensitive filesystem */
public final class C236519h {
    public final C236619i A00;

    public C236519h(C21060yb r2) {
        C236619i r0;
        AnonymousClass00C.A0D(r2, 1);
        if (C19550w8.A08()) {
            r0 = new AnonymousClass2LN(r2);
        } else if (C19550w8.A01()) {
            r0 = new C236719j(r2);
        } else {
            r0 = new C236619i(r2);
        }
        this.A00 = r0;
    }

    public final boolean A00(PendingIntent pendingIntent, int i, long j) {
        return this.A00.A02(pendingIntent, i, j, false);
    }
}
