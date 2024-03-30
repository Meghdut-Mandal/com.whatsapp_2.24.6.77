package X;

/* renamed from: X.ArV  reason: case insensitive filesystem */
public class C22603ArV extends AnonymousClass120 {
    public AnonymousClass122 A00;
    public C22656AsM A01;

    public C22603ArV(C22656AsM asM) {
        if (asM.A0H() < 1 || asM.A0H() > 2) {
            throw C22656AsM.A01(asM);
        }
        this.A00 = AnonymousClass122.A01(C22656AsM.A02(asM));
        if (asM.A0H() > 1) {
            this.A01 = C22656AsM.A04(asM.A0J(1));
        }
    }

    public AnonymousClass121 Bve() {
        C202169lB A002 = C202169lB.A00();
        A002.A06(this.A00);
        C22656AsM asM = this.A01;
        if (asM != null) {
            A002.A06(asM);
        }
        return new C22675Asf(A002);
    }

    public String toString() {
        StringBuffer A0x = C165607th.A0x();
        A0x.append("Policy information: ");
        A0x.append(this.A00);
        C22656AsM asM = this.A01;
        if (asM != null) {
            StringBuffer A0x2 = C165607th.A0x();
            for (int i = 0; i < asM.A0H(); i++) {
                if (A0x2.length() != 0) {
                    A0x2.append(", ");
                }
                Object A0J = asM.A0J(i);
                if (!(A0J instanceof C22596ArO)) {
                    if (A0J != null) {
                        A0J = new C22596ArO(C22656AsM.A04(A0J));
                    } else {
                        A0J = null;
                    }
                }
                A0x2.append(A0J);
            }
            A0x.append("[");
            A0x.append(A0x2);
            A0x.append("]");
        }
        return A0x.toString();
    }
}
