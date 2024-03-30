package X;

import com.whatsapp.util.Log;

/* renamed from: X.66n  reason: invalid class name and case insensitive filesystem */
public class C1269966n {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass1H3 A02;

    public C1269966n(AnonymousClass1H3 r1, int i, int i2) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = i2;
    }

    public void A00() {
        AnonymousClass1H3 r2 = this.A02;
        int i = this.A00;
        C18740tg.A0C(AnonymousClass000.A1O(r2.A05(i)));
        Log.e("CategoryManager/onManifestError/manifest was errory");
        r2.A0B(2, i);
        AnonymousClass1H3.A02(r2, (String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
        if ((r3 + 3600000) <= X.C19970wo.A00(r5.A06)) goto L_0x0091;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C131636Pw r9) {
        /*
            r8 = this;
            X.1H3 r5 = r8.A02
            int r6 = r8.A00
            r7 = 0
            int r3 = r8.A01
            int r0 = r5.A05(r6)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            X.C18740tg.A0C(r0)
            java.lang.String r2 = r5.A08()
            if (r9 != 0) goto L_0x0029
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "CategoryManager/onManifestReady/No info in manifest for category "
            X.C36321k7.A1P(r0, r2, r1)
            r1 = 2
        L_0x0022:
            r5.A0B(r1, r6)
            X.AnonymousClass1H3.A02(r5, r7)
            return
        L_0x0029:
            java.lang.String r0 = r9.A01
            boolean r0 = r2.equals(r0)
            X.C18740tg.A0C(r0)
            X.6Pw r2 = r5.A06()
            if (r2 == 0) goto L_0x006c
            java.lang.String r1 = r2.A01()
            java.lang.String r0 = r9.A01()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            java.lang.String r1 = r2.A03(r6)
            java.lang.String r0 = r9.A03(r6)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006c
            boolean r0 = r5.A0E(r6)
            if (r0 == 0) goto L_0x0069
            r0 = 5
            r5.A0B(r0, r6)
            java.lang.String r0 = r2.A03(r6)
            X.AnonymousClass1H3.A02(r5, r0)
            X.AnonymousClass1H3.A00(r5, r6)
            return
        L_0x0069:
            r5.A09()
        L_0x006c:
            if (r3 != 0) goto L_0x0091
            monitor-enter(r5)
            android.util.SparseArray r0 = r5.A02     // Catch:{ all -> 0x00a0 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x00a0 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x00a0 }
            if (r0 != 0) goto L_0x007a
            goto L_0x007f
        L_0x007a:
            long r3 = r0.longValue()     // Catch:{ all -> 0x00a0 }
            goto L_0x0081
        L_0x007f:
            r3 = 0
        L_0x0081:
            monitor-exit(r5)
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            long r3 = r3 + r0
            X.0wo r0 = r5.A06
            long r1 = X.C19970wo.A00(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 4
            if (r0 > 0) goto L_0x0022
        L_0x0091:
            r0 = 3
            r5.A0B(r0, r6)
            X.0wU r1 = r5.A0E
            X.1iP r0 = new X.1iP
            r0.<init>(r5, r9, r6)
            r1.Boy(r0)
            return
        L_0x00a0:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1269966n.A01(X.6Pw):void");
    }
}
