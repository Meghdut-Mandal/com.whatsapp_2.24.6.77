package X;

/* renamed from: X.5bg  reason: invalid class name and case insensitive filesystem */
public abstract class C111065bg {
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005f, code lost:
        if (r1 == 43) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009b, code lost:
        if (r12.A0E(3349) == false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r28 == false) goto L_0x0007;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C1042358u A00(X.C19420v0 r11, X.C20810yC r12, X.AnonymousClass6BX r13, java.lang.Integer r14, java.lang.Long r15, java.lang.Long r16, java.lang.Long r17, int r18, int r19, int r20, long r21, long r23, long r25, boolean r27, boolean r28, boolean r29, boolean r30) {
        /*
            r6 = 1
            r5 = 0
            if (r27 == 0) goto L_0x0007
            r1 = 0
            if (r28 != 0) goto L_0x0008
        L_0x0007:
            r1 = 1
        L_0x0008:
            java.lang.String r0 = "Status can't be view once."
            X.C18740tg.A0E(r1, r0)
            X.58u r4 = new X.58u
            r4.<init>()
            r9 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            r4.A0H = r1
            r4.A0I = r1
            r4.A0E = r1
            r4.A0C = r1
            r4.A0D = r1
            r4.A0F = r1
            r4.A0J = r1
            r4.A0L = r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r4.A04 = r0
            r4.A0G = r1
            long r0 = X.C90474aD.A09(r27)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            r4.A0Q = r2
            r0 = r19
            long r0 = (long) r0
            java.lang.Long r0 = X.C90484aE.A0i(r2, r0)
            r4.A0A = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r28)
            r4.A03 = r0
            r1 = r18
            if (r1 == r6) goto L_0x012d
            r0 = 3
            if (r1 == r0) goto L_0x0061
            r0 = 13
            if (r1 == r0) goto L_0x0129
            r0 = 20
            if (r1 == r0) goto L_0x0125
            r0 = 42
            if (r1 == r0) goto L_0x012d
            r0 = 43
            r8 = 1
            if (r1 != r0) goto L_0x0062
        L_0x0061:
            r8 = 3
        L_0x0062:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r4.A07 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            r4.A06 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r29)
            r4.A00 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r30)
            r4.A01 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r25)
            r4.A0O = r0
            r0 = r21
            int r2 = (r21 > r9 ? 1 : (r21 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x0092
            r2 = r23
            int r7 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r7 >= 0) goto L_0x0092
            java.lang.Long r0 = X.C90504aG.A0h(r2, r0)
            r4.A0K = r0
        L_0x0092:
            r0 = 2
            if (r8 != r0) goto L_0x00d0
            r0 = 3349(0xd15, float:4.693E-42)
            boolean r0 = r12.A0E(r0)
            if (r0 != 0) goto L_0x00dc
        L_0x009d:
            if (r13 == 0) goto L_0x00b8
            java.lang.Integer r0 = r13.A01
            if (r0 != 0) goto L_0x00bb
            r0 = 0
        L_0x00a4:
            r4.A05 = r0
            java.lang.Long r0 = r13.A02
            if (r0 == 0) goto L_0x00ae
            long r9 = r0.longValue()
        L_0x00ae:
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            r4.A0B = r0
            java.lang.Boolean r0 = r13.A00
            r4.A02 = r0
        L_0x00b8:
            r4.A0P = r15
            return r4
        L_0x00bb:
            int r2 = r0.intValue()
            r1 = 2
            r0 = 1
            if (r2 == r0) goto L_0x00cb
            r0 = 2
            r1 = 1
            if (r2 == r0) goto L_0x00cb
            r1 = 3
            if (r2 == r1) goto L_0x00cb
            r1 = 0
        L_0x00cb:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x00a4
        L_0x00d0:
            r0 = 3
            if (r8 != r0) goto L_0x009d
            r0 = 4468(0x1174, float:6.261E-42)
            boolean r0 = r12.A0E(r0)
            if (r0 == 0) goto L_0x009d
            r6 = 0
        L_0x00dc:
            r0 = 2653(0xa5d, float:3.718E-42)
            boolean r0 = r12.A0E(r0)
            if (r0 == 0) goto L_0x010f
            if (r14 == 0) goto L_0x00ea
            int r5 = r14.intValue()
        L_0x00ea:
            r0 = 5954(0x1742, float:8.343E-42)
            boolean r0 = r12.A0E(r0)
            if (r0 == 0) goto L_0x00fa
            r0 = r16
            r4.A0N = r0
            r0 = r17
            r4.A0M = r0
        L_0x00fa:
            r1 = 2
            r0 = 1
            if (r5 == r0) goto L_0x0106
            r0 = 2
            r1 = 1
            if (r5 == r0) goto L_0x0106
            r1 = 3
            if (r5 == r1) goto L_0x0106
            r1 = 0
        L_0x0106:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r6 == 0) goto L_0x0121
            r4.A08 = r0
            goto L_0x009d
        L_0x010f:
            if (r6 == 0) goto L_0x0116
            int r5 = r11.A0J()
            goto L_0x00ea
        L_0x0116:
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r11)
            java.lang.String r0 = "video_quality"
            int r5 = r1.getInt(r0, r5)
            goto L_0x00ea
        L_0x0121:
            r4.A09 = r0
            goto L_0x009d
        L_0x0125:
            r8 = 16
            goto L_0x0062
        L_0x0129:
            r8 = 11
            goto L_0x0062
        L_0x012d:
            r8 = 2
            goto L_0x0062
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111065bg.A00(X.0v0, X.0yC, X.6BX, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.Long, int, int, int, long, long, long, boolean, boolean, boolean, boolean):X.58u");
    }
}
