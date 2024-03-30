package X;

/* renamed from: X.0UQ  reason: invalid class name */
public final class AnonymousClass0UQ {
    public C10720f6 A00;
    public AnonymousClass0GE A01 = new AnonymousClass0GE();
    public Object A02;
    public boolean A03;

    public void A00(Object obj) {
        this.A03 = true;
        C10720f6 r0 = this.A00;
        if (r0 != null && r0.A01.A06(obj)) {
            this.A02 = null;
            this.A00 = null;
            this.A01 = null;
        }
    }

    public void finalize() {
        AnonymousClass0GE r1;
        C10720f6 r2 = this.A00;
        if (r2 != null && !r2.isDone()) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
            r2.A01.A05(new C13290jd(AnonymousClass000.A0o(this.A02, A0u)));
        }
        if (!this.A03 && (r1 = this.A01) != null) {
            r1.A06((Object) null);
        }
    }
}
