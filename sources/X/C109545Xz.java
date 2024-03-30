package X;

/* renamed from: X.5Xz  reason: invalid class name and case insensitive filesystem */
public abstract class C109545Xz {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        throw new X.AnonymousClass5R5(X.AnonymousClass000.A0p("Can't parse unknown typeface: ", r7, X.AnonymousClass000.A0u()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006d, code lost:
        if (r7.equals("normal") != false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007a, code lost:
        r4 = java.lang.Math.min(r4 + r3, 1000);
        r0 = X.AnonymousClass089.A01;
        X.AnonymousClass0YM.A01(r4, 1, "weight", 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008b, code lost:
        if (r6 != null) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008d, code lost:
        r6 = android.graphics.Typeface.DEFAULT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008f, code lost:
        r0 = X.AnonymousClass089.A01.A04(r5, r6, r4, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009c, code lost:
        if (r7.equals("italic") != false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009e, code lost:
        r3 = java.lang.Math.min(r4 + r3, 1000);
        r0 = X.AnonymousClass089.A01;
        X.AnonymousClass0YM.A01(r3, 1, "weight", 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00af, code lost:
        if (r6 != null) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b1, code lost:
        r6 = android.graphics.Typeface.DEFAULT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b3, code lost:
        r0 = X.AnonymousClass089.A01.A04(r5, r6, r3, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b9, code lost:
        X.AnonymousClass00C.A0B(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bc, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.Typeface A00(android.content.Context r5, android.graphics.Typeface r6, java.lang.String r7, java.lang.String r8) {
        /*
            r2 = 0
            X.AnonymousClass00C.A0D(r5, r2)
            r1 = 400(0x190, float:5.6E-43)
            if (r6 == 0) goto L_0x0012
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r3 < r0) goto L_0x00bd
            int r1 = r6.getWeight()
        L_0x0012:
            r4 = 400(0x190, float:5.6E-43)
            int r3 = r1 - r4
            if (r1 > r4) goto L_0x0019
            r3 = 0
        L_0x0019:
            int r0 = r7.hashCode()
            switch(r0) {
                case -1178781136: goto L_0x0096;
                case -1078030475: goto L_0x0070;
                case -1039745817: goto L_0x0067;
                case 3029637: goto L_0x005c;
                case 99152071: goto L_0x0051;
                case 102970646: goto L_0x0046;
                case 1223860979: goto L_0x003b;
                case 1734741290: goto L_0x0030;
                default: goto L_0x0020;
            }
        L_0x0020:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Can't parse unknown typeface: "
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r7, r1)
            X.5R5 r0 = new X.5R5
            r0.<init>(r1)
            throw r0
        L_0x0030:
            java.lang.String r0 = "bold_italic"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0020
            r4 = 700(0x2bc, float:9.81E-43)
            goto L_0x009e
        L_0x003b:
            java.lang.String r0 = "semibold"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0020
            r4 = 600(0x258, float:8.41E-43)
            goto L_0x007a
        L_0x0046:
            java.lang.String r0 = "light"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0020
            r4 = 300(0x12c, float:4.2E-43)
            goto L_0x007a
        L_0x0051:
            java.lang.String r0 = "heavy"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0020
            r4 = 800(0x320, float:1.121E-42)
            goto L_0x007a
        L_0x005c:
            java.lang.String r0 = "bold"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0020
            r4 = 700(0x2bc, float:9.81E-43)
            goto L_0x007a
        L_0x0067:
            java.lang.String r0 = "normal"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0020
            goto L_0x007a
        L_0x0070:
            java.lang.String r0 = "medium"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0020
            r4 = 500(0x1f4, float:7.0E-43)
        L_0x007a:
            int r4 = r4 + r3
            r0 = 1000(0x3e8, float:1.401E-42)
            int r4 = java.lang.Math.min(r4, r0)
            X.08A r0 = X.AnonymousClass089.A01
            r3 = 1
            r1 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r0 = "weight"
            X.AnonymousClass0YM.A01(r4, r3, r0, r1)
            if (r6 != 0) goto L_0x008f
            android.graphics.Typeface r6 = android.graphics.Typeface.DEFAULT
        L_0x008f:
            X.08A r0 = X.AnonymousClass089.A01
            android.graphics.Typeface r0 = r0.A04(r5, r6, r4, r2)
            goto L_0x00b9
        L_0x0096:
            java.lang.String r0 = "italic"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0020
        L_0x009e:
            int r4 = r4 + r3
            r0 = 1000(0x3e8, float:1.401E-42)
            int r3 = java.lang.Math.min(r4, r0)
            r2 = 1
            X.08A r0 = X.AnonymousClass089.A01
            r1 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r0 = "weight"
            X.AnonymousClass0YM.A01(r3, r2, r0, r1)
            if (r6 != 0) goto L_0x00b3
            android.graphics.Typeface r6 = android.graphics.Typeface.DEFAULT
        L_0x00b3:
            X.08A r0 = X.AnonymousClass089.A01
            android.graphics.Typeface r0 = r0.A04(r5, r6, r3, r2)
        L_0x00b9:
            X.AnonymousClass00C.A0B(r0)
            return r0
        L_0x00bd:
            if (r8 == 0) goto L_0x0012
            java.lang.String r0 = "sans-serif"
            boolean r0 = X.AnonymousClass099.A0O(r8, r0, r2)
            if (r0 == 0) goto L_0x0012
            int r0 = r8.hashCode()
            switch(r0) {
                case -264127297: goto L_0x00d0;
                case 951357813: goto L_0x00dc;
                case 960509580: goto L_0x00e8;
                default: goto L_0x00ce;
            }
        L_0x00ce:
            goto L_0x0012
        L_0x00d0:
            java.lang.String r0 = "sans-serif-medium"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0012
            r1 = 500(0x1f4, float:7.0E-43)
            goto L_0x0012
        L_0x00dc:
            java.lang.String r0 = "sans-serif-black"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0012
            r1 = 900(0x384, float:1.261E-42)
            goto L_0x0012
        L_0x00e8:
            java.lang.String r0 = "sans-serif-light"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0012
            r1 = 300(0x12c, float:4.2E-43)
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109545Xz.A00(android.content.Context, android.graphics.Typeface, java.lang.String, java.lang.String):android.graphics.Typeface");
    }
}
