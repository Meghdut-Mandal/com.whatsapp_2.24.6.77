package X;

/* renamed from: X.Arn  reason: case insensitive filesystem */
public class C22621Arn extends AnonymousClass120 {
    public C22656AsM A00;

    public C22621Arn(C22656AsM asM) {
        this.A00 = asM;
    }

    public static C22621Arn A00(Object obj) {
        if (obj instanceof C22621Arn) {
            return (C22621Arn) obj;
        }
        if (obj != null) {
            return new C22621Arn(C22656AsM.A04(obj));
        }
        return null;
    }

    public AnonymousClass121 Bve() {
        return this.A00;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.Arv[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C22629Arv[] A0A() {
        /*
            r5 = this;
            X.AsM r4 = r5.A00
            int r0 = r4.A0H()
            X.Arv[] r3 = new X.C22629Arv[r0]
            r1 = 0
        L_0x0009:
            int r0 = r4.A0H()
            if (r1 == r0) goto L_0x0035
            X.11z r2 = r4.A0J(r1)
            if (r2 == 0) goto L_0x0025
            boolean r0 = r2 instanceof X.C22629Arv
            if (r0 != 0) goto L_0x0025
            boolean r0 = r2 instanceof X.C22656AsM
            if (r0 == 0) goto L_0x002a
            X.AsM r2 = (X.C22656AsM) r2
            X.Arv r0 = new X.Arv
            r0.<init>((X.C22656AsM) r2)
            r2 = r0
        L_0x0025:
            r3[r1] = r2
            int r1 = r1 + 1
            goto L_0x0009
        L_0x002a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Invalid DistributionPoint: "
            java.lang.IllegalArgumentException r0 = X.C165567td.A0N(r2, r0, r1)
            throw r0
        L_0x0035:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22621Arn.A0A():X.Arv[]");
    }

    public String toString() {
        StringBuffer A0x = C165607th.A0x();
        String str = AnonymousClass11q.A00;
        A0x.append("CRLDistPoint:");
        A0x.append(str);
        C22629Arv[] A0A = A0A();
        for (int i = 0; i != A0A.length; i++) {
            A0x.append("    ");
            A0x.append(A0A[i]);
            A0x.append(str);
        }
        return A0x.toString();
    }
}
