package X;

/* renamed from: X.As4  reason: case insensitive filesystem */
public class C22638As4 extends AnonymousClass120 implements C16580pk {
    public int A00;
    public C219411z A01;

    public C22638As4(C219411z r2) {
        this.A00 = 0;
        this.A01 = r2;
    }

    public AnonymousClass121 Bve() {
        return new C22681Asl(this.A01, this.A00, false);
    }

    public String toString() {
        String str;
        String str2 = AnonymousClass11q.A00;
        StringBuffer A0x = C165607th.A0x();
        A0x.append("DistributionPointName: [");
        A0x.append(str2);
        int i = this.A00;
        String obj = this.A01.toString();
        if (i == 0) {
            str = "fullName";
        } else {
            str = "nameRelativeToCRLIssuer";
        }
        C165577te.A1N(str, str2, obj, A0x);
        return C165577te.A0l("]", str2, A0x);
    }

    public C22638As4(C22658AsO asO) {
        C219411z A02;
        int i = asO.A00;
        this.A00 = i;
        if (i == 0) {
            A02 = new C22631Arx(C22656AsM.A05(asO, false));
        } else {
            A02 = C22657AsN.A02(asO);
        }
        this.A01 = A02;
    }
}
