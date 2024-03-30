package X;

import java.util.Enumeration;

/* renamed from: X.ArX  reason: case insensitive filesystem */
public class C22605ArX extends AnonymousClass120 {
    public C22654AsK A00;
    public C22631Arx A01;
    public C22659AsP A02;

    public AnonymousClass121 Bve() {
        C202169lB r3 = new C202169lB(3);
        C22659AsP asP = this.A02;
        if (asP != null) {
            C202169lB.A03(asP, r3, false);
        }
        C22631Arx arx = this.A01;
        if (arx != null) {
            C202169lB.A02(arx, r3, 1, false);
        }
        C22654AsK asK = this.A00;
        if (asK != null) {
            C202169lB.A02(asK, r3, 2, false);
        }
        return new C22675Asf(r3);
    }

    public String toString() {
        String str;
        C22659AsP asP = this.A02;
        if (asP != null) {
            byte[] bArr = asP.A00;
            str = C202439lp.A00(bArr, bArr.length);
        } else {
            str = "null";
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AuthorityKeyIdentifier: KeyID(");
        A0u.append(str);
        return C90474aD.A0f(A0u);
    }

    public C22605ArX(C22656AsM asM) {
        Enumeration A0I = asM.A0I();
        while (A0I.hasMoreElements()) {
            C22658AsO A022 = C22658AsO.A02(A0I.nextElement());
            int i = A022.A00;
            if (i == 0) {
                this.A02 = C22659AsP.A02(A022, false);
            } else if (i == 1) {
                this.A01 = new C22631Arx(C22656AsM.A05(A022, false));
            } else if (i == 2) {
                this.A00 = C22654AsK.A02(A022);
            } else {
                throw AnonymousClass001.A08("illegal tag");
            }
        }
    }
}
