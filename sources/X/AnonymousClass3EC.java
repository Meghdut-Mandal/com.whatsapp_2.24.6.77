package X;

/* renamed from: X.3EC  reason: invalid class name */
public final class AnonymousClass3EC {
    public long A00;
    public C44592Oc A01;
    public final C19970wo A02;
    public final C21010yW A03;

    public final void A00(int i) {
        C44592Oc r4 = this.A01;
        if (r4 != null) {
            r4.A00 = Integer.valueOf(i);
            if (this.A00 > 0 && (i == 0 || i == 1 || i == 2)) {
                r4.A01 = Long.valueOf(C19970wo.A00(this.A02) - this.A00);
            }
            this.A03.Bly(r4);
            this.A01 = null;
        }
    }

    public AnonymousClass3EC(C19970wo r1, C21010yW r2) {
        C36321k7.A0x(r1, r2);
        this.A02 = r1;
        this.A03 = r2;
    }
}
