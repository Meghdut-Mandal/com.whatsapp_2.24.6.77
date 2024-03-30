package X;

/* renamed from: X.Arm  reason: case insensitive filesystem */
public class C22620Arm extends AnonymousClass120 {
    public static final AnonymousClass122 A02 = C165617ti.A0f("1.3.6.1.5.5.7.48.2");
    public static final AnonymousClass122 A03 = C165617ti.A0f("1.3.6.1.5.5.7.48.1");
    public AnonymousClass122 A00;
    public C22640As6 A01;

    public C22620Arm(C22656AsM asM) {
        if (asM.A0H() == 2) {
            this.A00 = AnonymousClass122.A01(C22656AsM.A02(asM));
            this.A01 = C22640As6.A01(C22656AsM.A03(asM));
            return;
        }
        throw AnonymousClass001.A08("wrong number of elements in sequence");
    }

    public AnonymousClass121 Bve() {
        C202169lB A002 = C202169lB.A00();
        A002.A06(this.A00);
        return C202169lB.A01(this.A01, A002);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AccessDescription: Oid(");
        A0u.append(this.A00.A01);
        return C90474aD.A0f(A0u);
    }
}
