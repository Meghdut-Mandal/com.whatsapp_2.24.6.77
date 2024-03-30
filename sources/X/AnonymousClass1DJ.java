package X;

/* renamed from: X.1DJ  reason: invalid class name */
public abstract class AnonymousClass1DJ {
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004e, code lost:
        if (X.C20800yB.A01(X.C21000yV.A02, r4.A01, 6111) == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006a, code lost:
        if (X.C20800yB.A01(X.C21000yV.A02, r4.A01, 6506) == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0086, code lost:
        if (X.C20800yB.A01(X.C21000yV.A02, r4.A01, 7237) == false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0032, code lost:
        if (X.C20800yB.A01(X.C21000yV.A02, r4.A01, 5876) == false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.C28551Tc
            if (r0 == 0) goto L_0x0098
            r4 = r7
            X.1Tc r4 = (X.C28551Tc) r4
            java.util.Set r1 = X.C28551Tc.A00(r4)
            X.00T r0 = r4.A02
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.containsAll(r1)
            if (r0 == 0) goto L_0x0091
            X.00T r0 = r4.A06
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0034
            X.0yC r2 = r4.A01
            r1 = 5876(0x16f4, float:8.234E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            r6 = 1
            if (r0 != 0) goto L_0x0035
        L_0x0034:
            r6 = 0
        L_0x0035:
            X.00T r0 = r4.A07
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0050
            X.0yC r2 = r4.A01
            r1 = 6111(0x17df, float:8.563E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            r5 = 1
            if (r0 != 0) goto L_0x0051
        L_0x0050:
            r5 = 0
        L_0x0051:
            X.00T r0 = r4.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x006c
            X.0yC r2 = r4.A01
            r1 = 6506(0x196a, float:9.117E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            r3 = 1
            if (r0 != 0) goto L_0x006d
        L_0x006c:
            r3 = 0
        L_0x006d:
            X.00T r0 = r4.A04
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0088
            X.0yC r2 = r4.A01
            r1 = 7237(0x1c45, float:1.0141E-41)
            X.0yV r0 = X.C21000yV.A02
            boolean r1 = X.C20800yB.A01(r0, r2, r1)
            r0 = 1
            if (r1 != 0) goto L_0x0089
        L_0x0088:
            r0 = 0
        L_0x0089:
            if (r6 != 0) goto L_0x0091
            if (r5 != 0) goto L_0x0091
            if (r3 != 0) goto L_0x0091
            if (r0 == 0) goto L_0x0097
        L_0x0091:
            X.0v0 r1 = r4.A00
            r0 = 1
            r1.A1s(r0)
        L_0x0097:
            return
        L_0x0098:
            boolean r0 = r7 instanceof X.C31191bQ
            if (r0 == 0) goto L_0x00b7
            r5 = r7
            X.1bQ r5 = (X.C31191bQ) r5
            java.lang.Runnable r1 = r5.A00
            if (r1 == 0) goto L_0x00a8
            X.0wU r0 = r5.A02
            r0.Bnx(r1)
        L_0x00a8:
            X.0wU r4 = r5.A02
            r2 = 500(0x1f4, double:2.47E-321)
            java.lang.Runnable r1 = r5.A05
            java.lang.String r0 = "AbPropsTamperManager/ap-props-hash-update"
            X.1jE r0 = r4.BpM(r1, r0, r2)
            r5.A00 = r0
            return
        L_0x00b7:
            r4 = r7
            X.1DK r4 = (X.AnonymousClass1DK) r4
            X.1DI r3 = r4.A01
            X.0yC r2 = r3.A02
            r1 = 736(0x2e0, float:1.031E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 != 0) goto L_0x0097
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x0097
            X.19n r3 = r3.A01
            java.lang.String r0 = "setting_unarchiveChats"
            java.lang.String r2 = "syncd_bootstrapped_mutations"
            monitor-enter(r2)
            java.util.Set r1 = r3.A02()     // Catch:{ all -> 0x00eb }
            r1.remove(r0)     // Catch:{ all -> 0x00eb }
            android.content.SharedPreferences r0 = X.C237119n.A00(r3)     // Catch:{ all -> 0x00eb }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x00eb }
            android.content.SharedPreferences$Editor r0 = r0.putStringSet(r2, r1)     // Catch:{ all -> 0x00eb }
            r0.apply()     // Catch:{ all -> 0x00eb }
            monitor-exit(r2)     // Catch:{ all -> 0x00eb }
            return
        L_0x00eb:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00eb }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1DJ.A01():void");
    }

    public void A02() {
        if (this instanceof C28551Tc) {
            C28551Tc r1 = (C28551Tc) this;
            r1.A02.getValue();
            r1.A06.getValue();
            r1.A07.getValue();
            r1.A05.getValue();
            r1.A04.getValue();
        } else if (this instanceof AnonymousClass1DK) {
            AnonymousClass1DK r3 = (AnonymousClass1DK) this;
            r3.A00 = C20800yB.A01(C21000yV.A02, r3.A01.A02, 736);
        }
    }
}
