package X;

/* renamed from: X.ArS  reason: case insensitive filesystem */
public class C22600ArS extends AnonymousClass120 {
    public C22620Arm[] A00;

    public AnonymousClass121 Bve() {
        return new C22675Asf((C219411z[]) this.A00);
    }

    public C22600ArS(C22656AsM asM) {
        if (asM.A0H() >= 1) {
            this.A00 = new C22620Arm[asM.A0H()];
            for (int i = 0; i != asM.A0H(); i++) {
                Object[] objArr = this.A00;
                Object A0J = asM.A0J(i);
                AnonymousClass122 r0 = C22620Arm.A02;
                if (!(A0J instanceof C22620Arm)) {
                    if (A0J != null) {
                        A0J = new C22620Arm(C22656AsM.A04(A0J));
                    } else {
                        A0J = null;
                    }
                }
                objArr[i] = A0J;
            }
            return;
        }
        throw AnonymousClass001.A08("sequence may not be empty");
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AuthorityInformationAccess: Oid(");
        A0u.append(this.A00[0].A00.A01);
        return C90474aD.A0f(A0u);
    }
}
