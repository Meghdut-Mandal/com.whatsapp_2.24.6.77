package X;

import android.content.SharedPreferences;

/* renamed from: X.6Cx  reason: invalid class name and case insensitive filesystem */
public abstract class C128606Cx {
    public final C19700wN A00;
    public final AnonymousClass132 A01;
    public final AnonymousClass133 A02;
    public final C194599Qj A03;
    public final C19970wo A04;

    public void A00() {
        C36341k9.A0u(C90474aD.A0H(this.A03), "current_search_location");
    }

    public void A01(AnonymousClass6QG r5) {
        SharedPreferences.Editor A0H = C90474aD.A0H(this.A03);
        String A032 = r5.A03();
        C36341k9.A0x(A0H, "current_search_location", AnonymousClass6RZ.A01(this.A00, this.A02, A032));
    }

    public C128606Cx(C19700wN r1, C19970wo r2, AnonymousClass132 r3, AnonymousClass133 r4, C194599Qj r5) {
        this.A04 = r2;
        this.A00 = r1;
        this.A01 = r3;
        this.A03 = r5;
        this.A02 = r4;
    }
}
