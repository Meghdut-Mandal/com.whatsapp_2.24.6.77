package X;

import java.util.Enumeration;

/* renamed from: X.ArQ  reason: case insensitive filesystem */
public class C22598ArQ extends AnonymousClass120 {
    public C22632Ary A00;
    public C22667AsX A01;
    public C22654AsK A02;
    public C22659AsP A03;
    public C22657AsN A04;

    public AnonymousClass121 Bve() {
        C202169lB r3 = new C202169lB(5);
        r3.A06(this.A02);
        r3.A06(this.A00);
        r3.A06(this.A03);
        C22657AsN asN = this.A04;
        if (asN != null) {
            C202169lB.A03(asN, r3, false);
        }
        C22667AsX asX = this.A01;
        if (asX != null) {
            C202169lB.A02(asX, r3, 1, false);
        }
        return new C22675Asf(r3);
    }

    public C22598ArQ(C22656AsM asM) {
        Enumeration A0I = asM.A0I();
        C22654AsK A012 = C22654AsK.A01(A0I.nextElement());
        this.A02 = A012;
        int A0H = A012.A0H();
        if (A0H < 0 || A0H > 1) {
            throw AnonymousClass001.A08("invalid version for private key info");
        }
        this.A00 = C22632Ary.A00(A0I.nextElement());
        this.A03 = C22659AsP.A01(A0I.nextElement());
        int i = -1;
        while (A0I.hasMoreElements()) {
            C22658AsO asO = (C22658AsO) A0I.nextElement();
            int i2 = asO.A00;
            if (i2 > i) {
                if (i2 == 0) {
                    this.A04 = C22657AsN.A02(asO);
                } else if (i2 != 1) {
                    throw AnonymousClass001.A08("unknown optional field in private key info");
                } else if (A0H >= 1) {
                    this.A01 = C22586ArE.A02(asO);
                } else {
                    throw AnonymousClass001.A08("'publicKey' requires version v2(1) or later");
                }
                i = i2;
            } else {
                throw AnonymousClass001.A08("invalid optional field in private key info");
            }
        }
    }
}
