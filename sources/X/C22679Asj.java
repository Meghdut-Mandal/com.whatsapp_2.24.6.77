package X;

import java.io.OutputStream;
import java.util.Enumeration;

/* renamed from: X.Asj  reason: case insensitive filesystem */
public class C22679Asj extends C22658AsO {
    public C22679Asj(C219411z r1, int i, boolean z) {
        super(r1, i, z);
    }

    public void A0D(C200179gm r6, boolean z) {
        Enumeration enumeration;
        r6.A02(160, this.A00, z);
        OutputStream outputStream = r6.A00;
        outputStream.write(128);
        boolean z2 = this.A02;
        C219411z r4 = this.A01;
        if (!z2) {
            if (r4 instanceof C22659AsP) {
                if (r4 instanceof C22645AsB) {
                    enumeration = ((C22645AsB) r4).A0H();
                } else {
                    enumeration = new C22645AsB(((C22659AsP) r4).A00).A0H();
                }
            } else if (r4 instanceof C22656AsM) {
                enumeration = ((C22656AsM) r4).A0I();
            } else if (r4 instanceof C22657AsN) {
                enumeration = new B97((C22657AsN) r4);
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                C165567td.A1N(r4, "not implemented: ", A0u);
                throw new C187348xh(A0u.toString());
            }
            while (enumeration.hasMoreElements()) {
                r6.A03(((C219411z) enumeration.nextElement()).Bve(), true);
            }
        } else {
            r6.A03(r4.Bve(), true);
        }
        outputStream.write(0);
        outputStream.write(0);
    }

    public boolean A0E() {
        if (this.A02 || C22658AsO.A01(this).A0E()) {
            return true;
        }
        return false;
    }

    public int A0A() {
        int A00;
        int A0A = C22658AsO.A01(this).A0A();
        if (this.A02) {
            A00 = C201849kY.A00(this.A00) + C201849kY.A01(A0A);
        } else {
            A0A--;
            A00 = C201849kY.A00(this.A00);
        }
        return A00 + A0A;
    }
}
