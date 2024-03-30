package X;

/* renamed from: X.Arc  reason: case insensitive filesystem */
public class C22610Arc extends AnonymousClass120 {
    public final C219411z A00;
    public final AnonymousClass122 A01;

    public static C22610Arc A00(Object obj) {
        if (obj instanceof C22610Arc) {
            return (C22610Arc) obj;
        }
        if (obj != null) {
            return new C22610Arc(C22656AsM.A04(obj));
        }
        return null;
    }

    public C22610Arc(C22656AsM asM) {
        this.A01 = AnonymousClass122.A01(C22656AsM.A02(asM));
        this.A00 = C22658AsO.A01(C22658AsO.A02(C22656AsM.A03(asM)));
    }

    public AnonymousClass121 Bve() {
        C202169lB A002 = C202169lB.A00();
        A002.A06(this.A01);
        C202169lB.A02(this.A00, A002, 0, true);
        return new C22675Asf(A002);
    }
}
