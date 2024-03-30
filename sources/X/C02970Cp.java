package X;

/* renamed from: X.0Cp  reason: invalid class name and case insensitive filesystem */
public class C02970Cp extends C02950Cn {
    public final Object A00;
    public final Object A01;

    public static AnonymousClass0YI A00(C02970Cp r2, Object obj) {
        if (obj == null) {
            return null;
        }
        AnonymousClass0YI r1 = C06990Vx.A00;
        if (r1.A0H(obj) || ((r1 = C06990Vx.A01) != null && r1.A0H(obj))) {
            return r1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Transition ");
        sb.append(obj);
        sb.append(" for fragment ");
        sb.append(r2.A01.A04);
        sb.append(" is not a valid framework Transition or AndroidX Transition");
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r2 != X.AnonymousClass02E.A0p) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C02970Cp(X.C02680Bk r5, X.AnonymousClass0Bl r6, boolean r7, boolean r8) {
        /*
            r4 = this;
            r4.<init>(r5, r6)
            java.lang.Integer r1 = r6.A00
            java.lang.Integer r0 = X.C023109s.A01
            X.02E r3 = r6.A04
            if (r1 != r0) goto L_0x003b
            X.09r r0 = r3.A0H
            if (r7 == 0) goto L_0x0036
            if (r0 == 0) goto L_0x0017
            java.lang.Object r2 = r0.A08
            java.lang.Object r0 = X.AnonymousClass02E.A0p
            if (r2 != r0) goto L_0x0018
        L_0x0017:
            r2 = 0
        L_0x0018:
            r4.A01 = r2
            if (r8 == 0) goto L_0x0034
            if (r7 == 0) goto L_0x002d
            X.09r r2 = r3.A0H
            if (r2 == 0) goto L_0x0034
            java.lang.Object r1 = r2.A0B
            java.lang.Object r0 = X.AnonymousClass02E.A0p
            if (r1 != r0) goto L_0x002a
            java.lang.Object r1 = r2.A0A
        L_0x002a:
            r4.A00 = r1
            return
        L_0x002d:
            X.09r r0 = r3.A0H
            if (r0 == 0) goto L_0x0034
            java.lang.Object r1 = r0.A0A
            goto L_0x002a
        L_0x0034:
            r1 = 0
            goto L_0x002a
        L_0x0036:
            if (r0 == 0) goto L_0x0017
            java.lang.Object r2 = r0.A07
            goto L_0x0018
        L_0x003b:
            if (r7 == 0) goto L_0x0017
            X.09r r1 = r3.A0H
            if (r1 == 0) goto L_0x0017
            java.lang.Object r2 = r1.A09
            java.lang.Object r0 = X.AnonymousClass02E.A0p
            if (r2 != r0) goto L_0x0018
            java.lang.Object r2 = r1.A07
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02970Cp.<init>(X.0Bk, X.0Bl, boolean, boolean):void");
    }
}
