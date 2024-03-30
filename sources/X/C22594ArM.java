package X;

/* renamed from: X.ArM  reason: case insensitive filesystem */
public class C22594ArM extends AnonymousClass120 {
    public C22592ArK A00;
    public C22607ArZ A01;

    public C22594ArM(C22656AsM asM) {
        C22592ArK arK;
        C22607ArZ arZ;
        C219411z A02 = C22656AsM.A02(asM);
        if (A02 instanceof C22592ArK) {
            arK = (C22592ArK) A02;
        } else if (A02 != null) {
            arK = new C22592ArK(C22652AsI.A01(A02));
        } else {
            arK = null;
        }
        this.A00 = arK;
        if (asM.A0H() == 2) {
            C22656AsM A05 = C22656AsM.A05((C22658AsO) asM.A0J(1), true);
            if (A05 != null) {
                arZ = new C22607ArZ(C22656AsM.A04(A05));
            } else {
                arZ = null;
            }
            this.A01 = arZ;
        }
    }

    public AnonymousClass121 Bve() {
        C202169lB A002 = C202169lB.A00();
        A002.A06(this.A00);
        C22607ArZ arZ = this.A01;
        if (arZ != null) {
            C202169lB.A02(arZ, A002, 0, true);
        }
        return new C22675Asf(A002);
    }
}
