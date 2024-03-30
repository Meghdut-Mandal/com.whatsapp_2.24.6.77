package X;

/* renamed from: X.1er  reason: invalid class name and case insensitive filesystem */
public class C33181er {
    public final C24881Ed A00;
    public final C24601Db A01;
    public final AnonymousClass1EV A02;
    public final C19770wU A03;

    public boolean A00() {
        if (C20800yB.A01(C21000yV.A02, this.A02.A02, 2055)) {
            C24601Db r2 = this.A01;
            if (r2.A03().contains("payments_has_unseen_requests")) {
                boolean z = r2.A03().getBoolean("payments_has_unseen_requests", false);
                if (Boolean.valueOf(z) != null) {
                    return z;
                }
            }
            this.A03.Boy(new C35731jA((Object) this, 1));
        }
        return false;
    }

    public C33181er(C24881Ed r1, C24601Db r2, AnonymousClass1EV r3, C19770wU r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
