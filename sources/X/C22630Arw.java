package X;

/* renamed from: X.Arw  reason: case insensitive filesystem */
public class C22630Arw extends AnonymousClass120 {
    public C22638As4 A00;
    public C22683Asn A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public C22656AsM A06;

    public static C22630Arw A00(Object obj) {
        if (obj instanceof C22630Arw) {
            return (C22630Arw) obj;
        }
        if (obj != null) {
            return new C22630Arw(C22656AsM.A04(obj));
        }
        return null;
    }

    public AnonymousClass121 Bve() {
        return this.A06;
    }

    public String toString() {
        String str = AnonymousClass11q.A00;
        StringBuffer A0x = C165607th.A0x();
        A0x.append("IssuingDistributionPoint: [");
        A0x.append(str);
        C22638As4 as4 = this.A00;
        if (as4 != null) {
            C165577te.A1N("distributionPoint", str, as4.toString(), A0x);
        }
        if (this.A05) {
            C165577te.A1N("onlyContainsUserCerts", str, "true", A0x);
        }
        if (this.A04) {
            C165577te.A1N("onlyContainsCACerts", str, "true", A0x);
        }
        C22683Asn asn = this.A01;
        if (asn != null) {
            C165577te.A1N("onlySomeReasons", str, asn.toString(), A0x);
        }
        if (this.A03) {
            C165577te.A1N("onlyContainsAttributeCerts", str, "true", A0x);
        }
        if (this.A02) {
            C165577te.A1N("indirectCRL", str, "true", A0x);
        }
        return C165577te.A0l("]", str, A0x);
    }

    public C22630Arw(C22656AsM asM) {
        C22638As4 as4;
        this.A06 = asM;
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
                this.A05 = AnonymousClass000.A1P(C22653AsJ.A02(A022).A00);
            } else if (i2 == 2) {
                this.A04 = AnonymousClass000.A1P(C22653AsJ.A02(A022).A00);
            } else if (i2 == 3) {
                this.A01 = new C22683Asn(C22586ArE.A02(A022));
            } else if (i2 == 4) {
                this.A02 = AnonymousClass000.A1P(C22653AsJ.A02(A022).A00);
            } else if (i2 == 5) {
                this.A03 = AnonymousClass000.A1P(C22653AsJ.A02(A022).A00);
            } else {
                throw AnonymousClass001.A08("unknown tag in IssuingDistributionPoint");
            }
        }
    }
}
