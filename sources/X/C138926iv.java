package X;

/* renamed from: X.6iv  reason: invalid class name and case insensitive filesystem */
public final class C138926iv implements AnonymousClass7eA {
    public final C97124oV A00;
    public final AnonymousClass6Q8 A01;
    public final AnonymousClass6P9 A02;
    public final AnonymousClass6P9 A03;

    public void B5B(String str) {
        AnonymousClass6Q8 r3 = this.A01;
        r3.A05();
        AnonymousClass6P9 r2 = this.A03;
        C161957nk A002 = AnonymousClass6P9.A00(r3, r2, str);
        try {
            C97274ok.A00(r3, A002);
        } finally {
            AnonymousClass6Q8.A01(r3);
            r2.A03(A002);
        }
    }

    public C138926iv(AnonymousClass6Q8 r3) {
        this.A01 = r3;
        this.A00 = new C162537ok(r3, this, 4);
        this.A03 = new C162547ol(r3, this, 2);
        this.A02 = new C162547ol(r3, this, 3);
    }
}
