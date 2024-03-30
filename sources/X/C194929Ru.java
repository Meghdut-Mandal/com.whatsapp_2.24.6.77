package X;

/* renamed from: X.9Ru  reason: invalid class name and case insensitive filesystem */
public class C194929Ru {
    public final AnonymousClass1EV A00;
    public final AnonymousClass6PS A01;
    public final C23075B3f A02;
    public final C24611Dc A03 = C165607th.A0c("ErrorMapGatingManager", "payment");

    public C194929Ru(AnonymousClass1EV r3, AnonymousClass6PS r4, C23075B3f b3f) {
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = b3f;
    }

    public String A00(int i) {
        String str;
        String valueOf = String.valueOf(i);
        if (this.A00.A02.A0E(698)) {
            str = this.A01.A03(valueOf);
        } else {
            str = null;
        }
        C23075B3f b3f = this.A02;
        if (b3f != null) {
            C176658cT B4W = b3f.B4W();
            B4W.A08 = C36371kC.A0o();
            B4W.A0b = "error";
            B4W.A0S = valueOf;
            if (str != null) {
                B4W.A0T = str;
            }
            C165567td.A16(this.A03, b3f, "PaymentUserActionEvent errorMapLoggingEvent: ", AnonymousClass000.A0u());
            b3f.BOl(B4W);
        }
        return str;
    }
}
