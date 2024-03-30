package X;

import java.util.Enumeration;

/* renamed from: X.Arb  reason: case insensitive filesystem */
public class C22609Arb extends AnonymousClass120 {
    public C22613Arf[] A00;
    public C22613Arf[] A01;

    public C22609Arb(C22656AsM asM) {
        Enumeration A0I = asM.A0I();
        while (A0I.hasMoreElements()) {
            C22658AsO A02 = C22658AsO.A02(A0I.nextElement());
            int i = A02.A00;
            if (i == 0) {
                this.A01 = A00(C22656AsM.A05(A02, false));
            } else if (i == 1) {
                this.A00 = A00(C22656AsM.A05(A02, false));
            } else {
                throw AnonymousClass000.A0d("Unknown tag encountered: ", AnonymousClass000.A0u(), i);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.Arf[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C22613Arf[] A00(X.C22656AsM r5) {
        /*
            int r4 = r5.A0H()
            X.Arf[] r3 = new X.C22613Arf[r4]
            r2 = 0
        L_0x0007:
            if (r2 == r4) goto L_0x0025
            X.11z r1 = r5.A0J(r2)
            java.math.BigInteger r0 = X.C22613Arf.A03
            if (r1 != 0) goto L_0x0017
            r1 = 0
        L_0x0012:
            r3[r2] = r1
            int r2 = r2 + 1
            goto L_0x0007
        L_0x0017:
            boolean r0 = r1 instanceof X.C22613Arf
            if (r0 != 0) goto L_0x0012
            X.AsM r0 = X.C22656AsM.A04(r1)
            X.Arf r1 = new X.Arf
            r1.<init>(r0)
            goto L_0x0012
        L_0x0025:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22609Arb.A00(X.AsM):X.Arf[]");
    }

    public AnonymousClass121 Bve() {
        C202169lB A002 = C202169lB.A00();
        C22613Arf[] arfArr = this.A01;
        if (arfArr != null) {
            C202169lB.A03(new C22675Asf((C219411z[]) arfArr), A002, false);
        }
        C22613Arf[] arfArr2 = this.A00;
        if (arfArr2 != null) {
            C202169lB.A02(new C22675Asf((C219411z[]) arfArr2), A002, 1, false);
        }
        return new C22675Asf(A002);
    }
}
