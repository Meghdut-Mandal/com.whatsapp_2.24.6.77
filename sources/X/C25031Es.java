package X;

/* renamed from: X.1Es  reason: invalid class name and case insensitive filesystem */
public final class C25031Es {
    public final AnonymousClass16D A00;
    public final C20810yC A01;
    public final C24971Em A02;
    public final C19970wo A03;

    public C25031Es(AnonymousClass16D r2, C19970wo r3, C20810yC r4, C24971Em r5) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r2, 3);
        AnonymousClass00C.A0D(r5, 4);
        this.A03 = r3;
        this.A01 = r4;
        this.A00 = r2;
        this.A02 = r5;
    }

    public final boolean A02(int i) {
        if (i == 1) {
            C20810yC r2 = this.A01;
            C21000yV r1 = C21000yV.A02;
            if (!C20800yB.A01(r1, r2, 4873) || !C20800yB.A01(r1, r2, 5747) || AnonymousClass00C.A0J(A01(), "yes")) {
                return false;
            }
            return true;
        } else if (i != 2 || AnonymousClass00C.A0J(A01(), "yes")) {
            return false;
        } else {
            if (C20800yB.A01(C21000yV.A02, this.A01, 5587)) {
                return true;
            }
            return false;
        }
    }

    public final String A01() {
        return (String) ((C63473Ke) this.A02.A04.getValue()).A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r2 = r10.A01();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(X.AnonymousClass141 r9, X.C25031Es r10) {
        /*
            boolean r0 = r9.A0C()
            r8 = 0
            if (r0 == 0) goto L_0x0061
            int r0 = r9.A00
            boolean r0 = r10.A02(r0)
            if (r0 == 0) goto L_0x0061
            java.lang.String r2 = r10.A01()
            int r1 = r2.hashCode()
            r0 = 3507(0xdb3, float:4.914E-42)
            if (r1 == r0) goto L_0x0061
            r0 = 3521(0xdc1, float:4.934E-42)
            if (r1 == r0) goto L_0x0062
            r0 = 119527(0x1d2e7, float:1.67493E-40)
            if (r1 == r0) goto L_0x0061
            r0 = 111442729(0x6a47b29, float:6.187091E-35)
            if (r1 != r0) goto L_0x0061
            java.lang.String r0 = "unset"
        L_0x002b:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0061
            long r6 = java.lang.System.currentTimeMillis()
            X.1Em r0 = r10.A02
            X.1Eq r0 = r0.A03
            android.content.SharedPreferences r3 = X.C25011Eq.A00(r0)
            java.lang.String r2 = "consent_last_dismissed_timestamp"
            r0 = -1
            long r4 = r3.getLong(r2, r0)
            X.0yC r2 = r10.A01
            r1 = 5746(0x1672, float:8.052E-42)
            X.0yV r0 = X.C21000yV.A02
            int r3 = X.C20800yB.A00(r0, r2, r1)
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0060
            if (r3 < 0) goto L_0x0061
            long r6 = r6 - r4
            long r2 = (long) r3
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0061
        L_0x0060:
            r8 = 1
        L_0x0061:
            return r8
        L_0x0062:
            java.lang.String r0 = "no"
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25031Es.A00(X.141, X.1Es):boolean");
    }
}
