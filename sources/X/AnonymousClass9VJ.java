package X;

import android.content.ComponentName;

/* renamed from: X.9VJ  reason: invalid class name */
public final class AnonymousClass9VJ {
    public final ComponentName A00;
    public final ComponentName A01;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004d, code lost:
        if (X.AnonymousClass099.A0C(r1, "*", 0, false) == (r2 - 1)) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
        if (X.AnonymousClass099.A0C(r10, "*", 0, false) == (r9 - 1)) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9VJ(android.content.ComponentName r12, android.content.ComponentName r13) {
        /*
            r11 = this;
            r3 = 1
            X.C36321k7.A0v(r12, r3, r13)
            r11.<init>()
            r11.A00 = r12
            r11.A01 = r13
            java.lang.String r1 = r12.getPackageName()
            X.AnonymousClass00C.A08(r1)
            java.lang.String r10 = r12.getClassName()
            X.AnonymousClass00C.A08(r10)
            java.lang.String r8 = r13.getPackageName()
            X.AnonymousClass00C.A08(r8)
            java.lang.String r6 = r13.getClassName()
            X.AnonymousClass00C.A08(r6)
            int r2 = r1.length()
            if (r2 == 0) goto L_0x009f
            int r7 = r8.length()
            if (r7 == 0) goto L_0x009f
            int r9 = r10.length()
            if (r9 == 0) goto L_0x0098
            int r5 = r6.length()
            if (r5 == 0) goto L_0x0098
            java.lang.String r4 = "*"
            boolean r0 = X.C90494aF.A1Z(r1, r4)
            if (r0 == 0) goto L_0x004f
            r0 = 0
            int r1 = X.AnonymousClass099.A0C(r1, r4, r0, r0)
            int r2 = r2 - r3
            if (r1 != r2) goto L_0x0050
        L_0x004f:
            r0 = 1
        L_0x0050:
            java.lang.String r2 = "Wildcard in package name is only allowed at the end."
            if (r0 == 0) goto L_0x0093
            boolean r0 = X.C90494aF.A1Z(r10, r4)
            if (r0 == 0) goto L_0x0062
            r0 = 0
            int r1 = X.AnonymousClass099.A0C(r10, r4, r0, r0)
            int r9 = r9 - r3
            if (r1 != r9) goto L_0x0063
        L_0x0062:
            r0 = 1
        L_0x0063:
            java.lang.String r1 = "Wildcard in class name is only allowed at the end."
            if (r0 == 0) goto L_0x008e
            boolean r0 = X.C90494aF.A1Z(r8, r4)
            if (r0 == 0) goto L_0x007a
            r0 = 0
            int r0 = X.AnonymousClass099.A0C(r8, r4, r0, r0)
            int r7 = r7 - r3
            if (r0 == r7) goto L_0x007a
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r2)
            throw r0
        L_0x007a:
            boolean r0 = X.C90494aF.A1Z(r6, r4)
            if (r0 == 0) goto L_0x008d
            r0 = 0
            int r0 = X.AnonymousClass099.A0C(r6, r4, r0, r0)
            int r5 = r5 - r3
            if (r0 == r5) goto L_0x008d
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r1)
            throw r0
        L_0x008d:
            return
        L_0x008e:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r1)
            throw r0
        L_0x0093:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r2)
            throw r0
        L_0x0098:
            java.lang.String r0 = "Activity class name must not be empty."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x009f:
            java.lang.String r0 = "Package name must not be empty"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9VJ.<init>(android.content.ComponentName, android.content.ComponentName):void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9VJ) {
                AnonymousClass9VJ r5 = (AnonymousClass9VJ) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A01, C36391kE.A0A(this.A00));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SplitPairFilter{primaryActivityName=");
        A0u.append(this.A00);
        A0u.append(", secondaryActivityName=");
        A0u.append(this.A01);
        A0u.append(", secondaryActivityAction=");
        A0u.append((String) null);
        return AnonymousClass000.A0s(A0u);
    }
}
