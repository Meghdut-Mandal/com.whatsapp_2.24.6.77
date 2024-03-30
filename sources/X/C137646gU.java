package X;

import androidx.compose.ui.Alignment;

/* renamed from: X.6gU  reason: invalid class name and case insensitive filesystem */
public final class C137646gU implements C157697dx {
    public final Alignment A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C137646gU) {
                C137646gU r5 = (C137646gU) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r10v4, types: [X.7VU] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C160287kl BPh(X.C161717nM r24, java.util.List r25, long r26) {
        /*
            r23 = this;
            r4 = r25
            boolean r0 = r4.isEmpty()
            r13 = r24
            if (r0 == 0) goto L_0x0019
            int r2 = androidx.compose.ui.unit.Constraints.A03(r26)
            int r1 = androidx.compose.ui.unit.Constraints.A02(r26)
            X.7W7 r0 = X.AnonymousClass7W7.A00
            X.7kl r0 = X.C90474aD.A0M(r13, r0, r2, r1)
            return r0
        L_0x0019:
            r11 = r23
            boolean r0 = r11.A01
            if (r0 == 0) goto L_0x00b9
            r1 = r26
        L_0x0021:
            int r5 = r4.size()
            r3 = 1
            r0 = 0
            if (r5 != r3) goto L_0x0058
            java.lang.Object r12 = r4.get(r0)
            X.7nJ r12 = (X.C161687nJ) r12
            r12.BF4()
            X.6Q4 r14 = r12.BPj(r1)
            int r1 = androidx.compose.ui.unit.Constraints.A03(r26)
            int r0 = r14.A01
            int r15 = java.lang.Math.max(r1, r0)
            int r1 = androidx.compose.ui.unit.Constraints.A02(r26)
            int r0 = r14.A00
            int r0 = java.lang.Math.max(r1, r0)
            X.7VU r10 = new X.7VU
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)
        L_0x0051:
            X.02t r10 = (X.C006302t) r10
            X.7kl r0 = X.C90474aD.A0M(r13, r10, r15, r0)
            return r0
        L_0x0058:
            int r0 = r4.size()
            X.6Q4[] r7 = new X.AnonymousClass6Q4[r0]
            X.0fE r6 = new X.0fE
            r6.<init>()
            int r0 = androidx.compose.ui.unit.Constraints.A03(r26)
            r6.element = r0
            X.0fE r5 = new X.0fE
            r5.<init>()
            int r0 = androidx.compose.ui.unit.Constraints.A02(r26)
            r5.element = r0
            int r9 = r4.size()
            r8 = 0
        L_0x0079:
            if (r8 >= r9) goto L_0x00a1
            java.lang.Object r0 = r4.get(r8)
            X.7nJ r0 = (X.C161687nJ) r0
            r0.BF4()
            X.6Q4 r10 = r0.BPj(r1)
            r7[r8] = r10
            int r3 = r6.element
            int r0 = r10.A01
            int r0 = java.lang.Math.max(r3, r0)
            r6.element = r0
            int r3 = r5.element
            int r0 = r10.A00
            int r0 = java.lang.Math.max(r3, r0)
            r5.element = r0
            int r8 = r8 + 1
            goto L_0x0079
        L_0x00a1:
            int r15 = r6.element
            int r0 = r5.element
            X.7VV r10 = new X.7VV
            r16 = r10
            r17 = r11
            r18 = r13
            r19 = r4
            r20 = r6
            r21 = r5
            r22 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22)
            goto L_0x0051
        L_0x00b9:
            r2 = 0
            int r1 = androidx.compose.ui.unit.Constraints.A01(r26)
            int r0 = androidx.compose.ui.unit.Constraints.A00(r26)
            long r1 = androidx.compose.ui.unit.Constraints.A07(r2, r1, r2, r0)
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137646gU.BPh(X.7nM, java.util.List, long):X.7kl");
    }

    public int hashCode() {
        return C36391kE.A0A(this.A00) + C36341k9.A01(this.A01 ? 1 : 0);
    }

    public C137646gU(Alignment alignment, boolean z) {
        this.A00 = alignment;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BoxMeasurePolicy(alignment=");
        A0u.append(this.A00);
        A0u.append(", propagateMinConstraints=");
        return C36321k7.A0H(A0u, this.A01);
    }
}
