package X;

/* renamed from: X.Ari  reason: case insensitive filesystem */
public class C22616Ari extends AnonymousClass120 {
    public C22656AsM A00;
    public C22586ArE A01;
    public C22632Ary A02;
    public C22617Arj A03;

    public static C22616Ari A00(Object obj) {
        if (obj instanceof C22616Ari) {
            return (C22616Ari) obj;
        }
        if (obj != null) {
            return new C22616Ari(C22656AsM.A04(obj));
        }
        return null;
    }

    public AnonymousClass121 Bve() {
        return this.A00;
    }

    public C22616Ari(C22656AsM asM) {
        this.A00 = asM;
        if (asM.A0H() == 3) {
            this.A03 = C22617Arj.A00(C22656AsM.A02(asM));
            this.A02 = C22632Ary.A00(C22656AsM.A03(asM));
            this.A01 = C22586ArE.A01(asM.A0J(2));
            return;
        }
        throw AnonymousClass001.A08("sequence wrong size for a certificate");
    }
}
