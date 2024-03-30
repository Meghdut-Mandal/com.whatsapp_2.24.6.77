package X;

import java.util.Enumeration;

/* renamed from: X.As9  reason: case insensitive filesystem */
public class C22643As9 extends AnonymousClass120 implements C219311y {
    public C22657AsN A00;
    public C22657AsN A01;
    public C22654AsK A02;
    public C22657AsN A03;
    public C22657AsN A04;
    public C22642As8 A05;

    public C22643As9(C22654AsK asK, C22657AsN asN, C22657AsN asN2, C22657AsN asN3, C22642As8 as8) {
        this.A02 = asK;
        this.A03 = asN;
        this.A05 = as8;
        this.A00 = asN2;
        this.A01 = null;
        this.A04 = asN3;
    }

    public AnonymousClass121 Bve() {
        C202169lB r3 = new C202169lB(6);
        r3.A06(this.A02);
        r3.A06(this.A03);
        r3.A06(this.A05);
        C22657AsN asN = this.A00;
        if (asN != null) {
            C202169lB.A03(asN, r3, false);
        }
        C22657AsN asN2 = this.A01;
        if (asN2 != null) {
            C202169lB.A02(asN2, r3, 1, false);
        }
        r3.A06(this.A04);
        return new C22673Asd(r3);
    }

    public C22643As9(C22656AsM asM) {
        C22642As8 as8;
        Enumeration A0I = asM.A0I();
        this.A02 = (C22654AsK) A0I.nextElement();
        this.A03 = (C22657AsN) A0I.nextElement();
        Object nextElement = A0I.nextElement();
        if (nextElement instanceof C22642As8) {
            as8 = (C22642As8) nextElement;
        } else if (nextElement != null) {
            as8 = new C22642As8(C22656AsM.A04(nextElement));
        } else {
            as8 = null;
        }
        this.A05 = as8;
        while (A0I.hasMoreElements()) {
            AnonymousClass121 r1 = (AnonymousClass121) A0I.nextElement();
            if (r1 instanceof C22658AsO) {
                C22658AsO asO = (C22658AsO) r1;
                int i = asO.A00;
                if (i == 0) {
                    this.A00 = C22657AsN.A02(asO);
                } else if (i == 1) {
                    this.A01 = C22657AsN.A02(asO);
                } else {
                    throw AnonymousClass000.A0d("unknown tag value ", AnonymousClass000.A0u(), i);
                }
            } else {
                this.A04 = (C22657AsN) r1;
            }
        }
    }
}
