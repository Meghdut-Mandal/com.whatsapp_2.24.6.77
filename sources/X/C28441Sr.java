package X;

/* renamed from: X.1Sr  reason: invalid class name and case insensitive filesystem */
public final class C28441Sr {
    public C45682Sh A00;
    public boolean A01;
    public final C20810yC A02;
    public final C21010yW A03;
    public final C21430zE A04;
    public final AnonymousClass005 A05;
    public final AnonymousClass00T A06 = new AnonymousClass00U(new C28451Ss(this));

    public C28441Sr(C20810yC r3, C21010yW r4, C21430zE r5, AnonymousClass005 r6) {
        AnonymousClass00C.A0D(r5, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r3, 3);
        AnonymousClass00C.A0D(r6, 4);
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
        this.A05 = r6;
    }

    public final void A00() {
        this.A04.markerStart(703934026);
        C45682Sh r3 = new C45682Sh();
        this.A00 = r3;
        boolean z = false;
        if (this.A03.B3I(r3, (C18950u5) null, false) != null) {
            z = true;
        }
        this.A01 = z;
        if (z && ((Boolean) this.A06.getValue()).booleanValue()) {
            AnonymousClass11g.A00((AnonymousClass11g) this.A05.get(), "chat_open", false);
        }
    }
}
