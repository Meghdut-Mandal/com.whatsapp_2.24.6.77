package X;

import java.math.BigInteger;

/* renamed from: X.Arf  reason: case insensitive filesystem */
public class C22613Arf extends AnonymousClass120 {
    public static final BigInteger A03 = BigInteger.valueOf(0);
    public C22640As6 A00;
    public C22654AsK A01;
    public C22654AsK A02;

    public AnonymousClass121 Bve() {
        C202169lB r3 = new C202169lB(3);
        r3.A06(this.A00);
        C22654AsK asK = this.A02;
        if (asK != null && !asK.A0I(A03)) {
            C202169lB.A03(asK, r3, false);
        }
        C22654AsK asK2 = this.A01;
        if (asK2 != null) {
            C202169lB.A02(asK2, r3, 1, false);
        }
        return new C22675Asf(r3);
    }

    public C22613Arf(C22656AsM asM) {
        C22658AsO asO;
        this.A00 = C22640As6.A01(asM.A0J(0));
        int A0H = asM.A0H();
        if (A0H != 1) {
            if (A0H == 2) {
                asO = C22658AsO.A02(asM.A0J(1));
                int i = asO.A00;
                if (i == 0) {
                    this.A02 = C22654AsK.A02(asO);
                    return;
                } else if (i != 1) {
                    throw AnonymousClass000.A0d("Bad tag number: ", AnonymousClass000.A0u(), i);
                }
            } else if (A0H == 3) {
                C22658AsO A022 = C22658AsO.A02(asM.A0J(1));
                int i2 = A022.A00;
                if (i2 == 0) {
                    this.A02 = C22654AsK.A02(A022);
                    asO = C22658AsO.A02(asM.A0J(2));
                    int i3 = asO.A00;
                    if (i3 != 1) {
                        throw AnonymousClass000.A0d("Bad tag number for 'maximum': ", AnonymousClass000.A0u(), i3);
                    }
                } else {
                    throw AnonymousClass000.A0d("Bad tag number for 'minimum': ", AnonymousClass000.A0u(), i2);
                }
            } else {
                throw C22656AsM.A01(asM);
            }
            this.A01 = C22654AsK.A02(asO);
        }
    }
}
