package X;

import java.util.Locale;

/* renamed from: X.6Cy  reason: invalid class name and case insensitive filesystem */
public abstract class C128616Cy {
    public final int A00;
    public final C21700zf A01;
    public final C21430zE A02;
    public final C19970wo A03;
    public final C19420v0 A04;

    public final void A00(int i, String str) {
        AnonymousClass00C.A0D(str, 1);
        C21700zf r3 = this.A01;
        r3.A09(str, i, true);
        A01(i, "timestamp_ms", System.currentTimeMillis());
        C21430zE r4 = r3.A06;
        int i2 = r3.A04.A06;
        r4.markerAnnotate(i2, i, "is_debug_build", false);
        String string = C36341k9.A0E(this.A04).getString("pref_graphql_domain", "whatsapp.com");
        AnonymousClass00C.A08(string);
        r4.markerAnnotate(i2, i, "is_graphql_prod", C36431kI.A1D(Locale.ROOT, string).equals("whatsapp.com"));
    }

    public final void A02(int i, String str, String str2) {
        AnonymousClass00C.A0D(str2, 2);
        C21700zf r0 = this.A01;
        r0.A06.markerAnnotate(r0.A04.A06, i, str, str2);
    }

    public final void A01(int i, String str, long j) {
        C21700zf r0 = this.A01;
        r0.A06.markerAnnotate(r0.A04.A06, i, str, j);
    }

    public C128616Cy(C19970wo r13, C19630wG r14, C19420v0 r15, C21010yW r16, C21670zc r17, C21690ze r18, C21430zE r19, C19770wU r20, String str, int i) {
        int i2 = i;
        this.A00 = i2;
        this.A03 = r13;
        this.A04 = r15;
        C21430zE r8 = r19;
        this.A02 = r8;
        C21700zf r2 = new C21700zf(r13, r14, r16, r17, r18, r8, r20, str, i2);
        r2.A04.A04 = true;
        this.A01 = r2;
    }
}
