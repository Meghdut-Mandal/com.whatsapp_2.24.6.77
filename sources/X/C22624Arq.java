package X;

/* renamed from: X.Arq  reason: case insensitive filesystem */
public class C22624Arq extends AnonymousClass120 {
    public C219411z A00;
    public AnonymousClass122 A01;

    public C22624Arq(C219411z r1, AnonymousClass122 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public static C22624Arq A00(Object obj) {
        if (obj instanceof C22624Arq) {
            return (C22624Arq) obj;
        }
        if (obj != null) {
            return new C22624Arq(C22656AsM.A04(obj));
        }
        throw AnonymousClass001.A08("null value in getInstance()");
    }

    public C22624Arq(C22656AsM asM) {
        this.A01 = (AnonymousClass122) C22656AsM.A02(asM);
        this.A00 = C22656AsM.A03(asM);
    }

    public AnonymousClass121 Bve() {
        C202169lB A002 = C202169lB.A00();
        A002.A06(this.A01);
        return C202169lB.A01(this.A00, A002);
    }
}
