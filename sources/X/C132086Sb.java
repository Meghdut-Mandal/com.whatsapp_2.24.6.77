package X;

/* renamed from: X.6Sb  reason: invalid class name and case insensitive filesystem */
public final class C132086Sb {
    public static final C132086Sb A00 = new C132086Sb();

    public static final boolean A00(String str, String str2) {
        if (!AnonymousClass099.A0O(str2, "*", false)) {
            return false;
        }
        if (str2.equals("*")) {
            return true;
        }
        int A0C = AnonymousClass099.A0C(str2, "*", 0, false);
        int length = str2.length();
        if (A0C == AnonymousClass099.A0B(str2, "*", length - 1) && str2.endsWith("*")) {
            return str.startsWith(C36431kI.A16(0, length - 1, str2));
        }
        throw AnonymousClass001.A08("Name pattern with a wildcard must only contain a single wildcard in the end");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
        if (A00(r1, r0) != false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006b, code lost:
        if (r0 != false) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(android.content.ComponentName r5, android.content.ComponentName r6) {
        /*
            r4 = this;
            java.lang.String r1 = "*"
            r3 = 1
            if (r5 != 0) goto L_0x001a
            java.lang.String r0 = r6.getPackageName()
            boolean r0 = X.AnonymousClass00C.A0J(r0, r1)
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = r6.getClassName()
            boolean r1 = X.AnonymousClass00C.A0J(r0, r1)
        L_0x0017:
            if (r1 == 0) goto L_0x0071
            return r3
        L_0x001a:
            java.lang.String r0 = X.C36381kD.A0y(r5)
            boolean r0 = X.C90494aF.A1Z(r0, r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0073
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = r6.getPackageName()
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 != 0) goto L_0x0049
            java.lang.String r1 = r5.getPackageName()
            X.AnonymousClass00C.A08(r1)
            java.lang.String r0 = r6.getPackageName()
            X.AnonymousClass00C.A08(r0)
            boolean r0 = A00(r1, r0)
            r2 = 0
            if (r0 == 0) goto L_0x004a
        L_0x0049:
            r2 = 1
        L_0x004a:
            java.lang.String r1 = r5.getClassName()
            java.lang.String r0 = r6.getClassName()
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 != 0) goto L_0x006d
            java.lang.String r1 = r5.getClassName()
            X.AnonymousClass00C.A08(r1)
            java.lang.String r0 = r6.getClassName()
            X.AnonymousClass00C.A08(r0)
            boolean r0 = A00(r1, r0)
            r1 = 0
            if (r0 == 0) goto L_0x006e
        L_0x006d:
            r1 = 1
        L_0x006e:
            if (r2 == 0) goto L_0x0071
            goto L_0x0017
        L_0x0071:
            r3 = 0
            return r3
        L_0x0073:
            java.lang.String r0 = "Wildcard can only be part of the rule."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132086Sb.A01(android.content.ComponentName, android.content.ComponentName):boolean");
    }
}
