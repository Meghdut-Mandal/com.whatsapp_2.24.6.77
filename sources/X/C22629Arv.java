package X;

/* renamed from: X.Arv  reason: case insensitive filesystem */
public class C22629Arv extends AnonymousClass120 {
    public C22638As4 A00;
    public C22631Arx A01;
    public C22683Asn A02;

    public C22629Arv(C22638As4 as4) {
        this.A00 = as4;
        this.A02 = null;
        this.A01 = null;
    }

    public AnonymousClass121 Bve() {
        C202169lB r3 = new C202169lB(3);
        C22638As4 as4 = this.A00;
        if (as4 != null) {
            r3.A06(new C22681Asl(as4));
        }
        C22683Asn asn = this.A02;
        if (asn != null) {
            C202169lB.A02(asn, r3, 1, false);
        }
        C22631Arx arx = this.A01;
        if (arx != null) {
            C202169lB.A02(arx, r3, 2, false);
        }
        return new C22675Asf(r3);
    }

    public String toString() {
        String str = AnonymousClass11q.A00;
        StringBuffer A0x = C165607th.A0x();
        A0x.append("DistributionPoint: [");
        A0x.append(str);
        C22638As4 as4 = this.A00;
        if (as4 != null) {
            C165577te.A1N("distributionPoint", str, as4.toString(), A0x);
        }
        C22683Asn asn = this.A02;
        if (asn != null) {
            C165577te.A1N("reasons", str, asn.toString(), A0x);
        }
        C22631Arx arx = this.A01;
        if (arx != null) {
            C165577te.A1N("cRLIssuer", str, arx.toString(), A0x);
        }
        return C165577te.A0l("]", str, A0x);
    }

    public C22629Arv(C22656AsM asM) {
        C22638As4 as4;
        for (int i = 0; i != asM.A0H(); i++) {
            C22658AsO A022 = C22658AsO.A02(asM.A0J(i));
            int i2 = A022.A00;
            if (i2 == 0) {
                C22658AsO A023 = C22658AsO.A02(C22658AsO.A01(A022));
                if (A023 != null) {
                    as4 = new C22638As4(A023);
                } else {
                    as4 = null;
                }
                this.A00 = as4;
            } else if (i2 == 1) {
                this.A02 = new C22683Asn(C22586ArE.A02(A022));
            } else if (i2 == 2) {
                this.A01 = new C22631Arx(C22656AsM.A05(A022, false));
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Unknown tag encountered in structure: ");
                throw C165567td.A0O(A0u, A022.A00);
            }
        }
    }
}
