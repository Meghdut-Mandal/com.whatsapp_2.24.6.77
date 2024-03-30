package X;

import android.content.Context;

/* renamed from: X.6iU  reason: invalid class name and case insensitive filesystem */
public final class C138666iU implements C162147o6 {
    public boolean A00;
    public final Context A01;
    public final C130666Ly A02;
    public final String A03;
    public final AnonymousClass00T A04 = C36431kI.A1I(new AnonymousClass7JO(this));
    public final boolean A05;
    public final boolean A06;

    public void close() {
        AnonymousClass00T r1 = this.A04;
        if (r1.BM2()) {
            ((C91044bM) r1.getValue()).close();
        }
    }

    public C138666iU(Context context, C130666Ly r3, String str, boolean z, boolean z2) {
        this.A01 = context;
        this.A03 = str;
        this.A02 = r3;
        this.A06 = z;
        this.A05 = z2;
    }
}
