package X;

/* renamed from: X.63h  reason: invalid class name and case insensitive filesystem */
public final class C1262863h {
    public final /* synthetic */ AnonymousClass67W A00;
    public final /* synthetic */ C134906bn A01;
    public final /* synthetic */ C143356qP A02;
    public final /* synthetic */ String A03;

    public C1262863h(AnonymousClass67W r1, C134906bn r2, C143356qP r3, String str) {
        this.A02 = r3;
        this.A03 = str;
        this.A00 = r1;
        this.A01 = r2;
    }

    public void A00() {
        C143356qP r3 = this.A02;
        String str = this.A03;
        C131576Pp A002 = r3.A00(str);
        if (A002 == null) {
            this.A00.A00(AnonymousClass001.A09("Bloks metadata should be provided"));
            return;
        }
        r3.A01.Bp3(new C1502774q(A002, r3, this.A00, this.A01, str, 10));
    }
}
