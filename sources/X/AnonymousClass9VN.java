package X;

/* renamed from: X.9VN  reason: invalid class name */
public class AnonymousClass9VN {
    public boolean A00;
    public final C200199gr A01;

    public final void A01(String str) {
        if (!this.A01.A09()) {
            StringBuilder A0v = AnonymousClass000.A0v(str);
            A0v.append(" Current thread: ");
            throw C90464aC.A0U(Thread.currentThread().getName(), A0v);
        }
    }

    public AnonymousClass9VN(C200199gr r1) {
        this.A01 = r1;
    }

    public final void A00(String str) {
        A01(AnonymousClass000.A0p("Can only check if prepared on the Optic thread. ", str, AnonymousClass000.A0u()));
        if (!this.A00) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Not prepared: ");
            A0u.append(str);
            A0u.append(" Current thread: ");
            throw AnonymousClass000.A0g(Thread.currentThread().getName(), A0u);
        }
    }

    public final void A02(boolean z, String str) {
        A01(AnonymousClass000.A0p("Can only set the prepared state on the Optic thread. ", str, AnonymousClass000.A0u()));
        this.A00 = z;
    }
}
