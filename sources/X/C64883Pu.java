package X;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: X.3Pu  reason: invalid class name and case insensitive filesystem */
public final class C64883Pu {
    public AnonymousClass3XT A00;
    public final C20810yC A01;

    public C64883Pu(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r2 = X.C20800yB.A00(r1, r2, 2467);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A00(X.AnonymousClass3XT r5) {
        /*
            r4 = this;
            r3 = 1
            if (r5 == 0) goto L_0x0025
            X.0yC r2 = r4.A01
            X.0yV r1 = X.C21000yV.A01
            r0 = 2469(0x9a5, float:3.46E-42)
            boolean r0 = X.C20800yB.A01(r1, r2, r0)
            if (r0 == 0) goto L_0x0025
            r0 = 2467(0x9a3, float:3.457E-42)
            int r2 = X.C20800yB.A00(r1, r2, r0)
            java.util.List r0 = r5.A01
            int r1 = r0.size()
            java.util.List r0 = r5.A02
            int r0 = r0.size()
            int r1 = r1 + r0
            if (r1 <= r2) goto L_0x0025
            r3 = 0
        L_0x0025:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64883Pu.A00(X.3XT):boolean");
    }

    public final AnonymousClass3XT A01(Bundle bundle) {
        AnonymousClass00C.A0D(bundle, 0);
        if (bundle.getBoolean("persisted_status_distribution_key", false)) {
            return this.A00;
        }
        return (AnonymousClass3XT) bundle.getParcelable("status_distribution");
    }

    public final void A03(Bundle bundle, AnonymousClass3XT r4) {
        AnonymousClass00C.A0D(bundle, 0);
        if (A00(r4)) {
            bundle.putParcelable("status_distribution", r4);
            return;
        }
        this.A00 = r4;
        bundle.putBoolean("persisted_status_distribution_key", true);
    }

    public final void A02(Intent intent, AnonymousClass3XT r4) {
        if (A00(r4)) {
            intent.putExtra("status_distribution", r4);
            return;
        }
        this.A00 = r4;
        intent.putExtra("persisted_status_distribution_key", true);
    }
}
