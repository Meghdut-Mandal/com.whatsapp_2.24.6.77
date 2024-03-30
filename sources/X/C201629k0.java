package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.9k0  reason: invalid class name and case insensitive filesystem */
public class C201629k0 {
    public static final C201629k0 A02 = new C201629k0("COMPOSITION");
    public B0U A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C201629k0 r5 = (C201629k0) obj;
            if (this.A01.equals(r5.A01)) {
                B0U b0u = this.A00;
                B0U b0u2 = r5.A00;
                if (b0u != null) {
                    return b0u.equals(b0u2);
                }
                return b0u2 == null;
            }
        }
        return false;
    }

    public int A00(String str, int i) {
        if (!"__container".equals(str)) {
            List list = this.A01;
            if (!C36401kF.A0s(list, i).equals("**")) {
                return 1;
            }
            if (i == C36421kH.A06(list, 1) || !C36401kF.A0s(list, i + 1).equals(str)) {
                return 0;
            }
            return 2;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        if (r0 != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01(java.lang.String r8, int r9) {
        /*
            r7 = this;
            java.util.List r3 = r7.A01
            int r0 = r3.size()
            r6 = 0
            if (r9 >= r0) goto L_0x0048
            int r0 = r3.size()
            r5 = 1
            int r0 = r0 - r5
            boolean r4 = X.AnonymousClass000.A1S(r9, r0)
            java.lang.String r1 = X.C36401kF.A0s(r3, r9)
            java.lang.String r2 = "**"
            boolean r0 = r1.equals(r2)
            if (r0 != 0) goto L_0x0049
            boolean r0 = r1.equals(r8)
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = "*"
            boolean r0 = r1.equals(r0)
            r1 = 0
            if (r0 == 0) goto L_0x002f
        L_0x002e:
            r1 = 1
        L_0x002f:
            if (r4 != 0) goto L_0x0045
            int r0 = r3.size()
            int r0 = r0 + -2
            if (r9 != r0) goto L_0x0048
            java.lang.Object r0 = X.C36401kF.A0n(r3)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0048
        L_0x0045:
            if (r1 == 0) goto L_0x0048
        L_0x0047:
            r6 = 1
        L_0x0048:
            return r6
        L_0x0049:
            if (r4 != 0) goto L_0x0081
            int r1 = r9 + 1
            java.lang.String r0 = X.C36401kF.A0s(r3, r1)
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0072
            int r0 = r3.size()
            int r0 = r0 + -2
            if (r9 == r0) goto L_0x0047
            int r0 = r3.size()
            int r0 = r0 + -3
            if (r9 != r0) goto L_0x0048
            java.lang.Object r0 = X.C36401kF.A0n(r3)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = r0.equals(r2)
            goto L_0x0045
        L_0x0072:
            int r0 = X.C36421kH.A06(r3, r5)
            if (r1 < r0) goto L_0x0048
            java.lang.String r0 = X.C36401kF.A0s(r3, r1)
            boolean r0 = r0.equals(r8)
            return r0
        L_0x0081:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201629k0.A01(java.lang.String, int):boolean");
    }

    public boolean A02(String str, int i) {
        if (!"__container".equals(str)) {
            List list = this.A01;
            if (i >= list.size() || (!C36401kF.A0s(list, i).equals(str) && !C36401kF.A0s(list, i).equals("**") && !C36401kF.A0s(list, i).equals("*"))) {
                return false;
            }
        }
        return true;
    }

    public boolean A03(String str, int i) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.A01;
        if (i < C36421kH.A06(list, 1) || C36401kF.A0s(list, i).equals("**")) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.A01.hashCode() * 31) + AnonymousClass000.A0J(this.A00);
    }

    public C201629k0(C201629k0 r2) {
        this.A01 = C36441kJ.A15(r2.A01);
        this.A00 = r2.A00;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("KeyPath{keys=");
        A0u.append(this.A01);
        A0u.append(",resolved=");
        A0u.append(AnonymousClass000.A1V(this.A00));
        return AnonymousClass000.A0s(A0u);
    }

    public C201629k0(String... strArr) {
        this.A01 = Arrays.asList(strArr);
    }
}
