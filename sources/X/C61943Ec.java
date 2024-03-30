package X;

import android.content.Context;

/* renamed from: X.3Ec  reason: invalid class name and case insensitive filesystem */
public final class C61943Ec {
    public final int A00;
    public final long A01;
    public final AnonymousClass0L0 A02;
    public final C21010yW A03;
    public final boolean A04;

    public C61943Ec(C21010yW r6, AnonymousClass3L9 r7, int i) {
        AnonymousClass00C.A0D(r6, 1);
        this.A03 = r6;
        this.A00 = i;
        Context context = r7.A00;
        long A002 = AnonymousClass1L0.A00(context, "com.google.android.gms");
        C36321k7.A1V("PasskeyGooglePlayChecks / determineDeviceGMSVersionCode:  ", AnonymousClass000.A0u(), A002);
        this.A01 = A002;
        AnonymousClass0L0 r2 = new AnonymousClass0L0(C34201gc.A00(context));
        C36321k7.A1K(r2, "PasskeyGooglePlayChecks / googlePlayServicesStatus : ", AnonymousClass000.A0u());
        this.A02 = r2;
        this.A04 = r7.A01();
    }

    public final void A00(int i, Throwable th) {
        C45442Rj r2 = new C45442Rj();
        r2.A02 = Integer.valueOf(this.A00);
        r2.A01 = Integer.valueOf(i);
        C62983Ih A002 = AnonymousClass97Y.A00(th);
        r2.A05 = A002.A00;
        r2.A06 = A002.A01;
        r2.A03 = Long.valueOf(this.A01);
        r2.A04 = this.A02.toString();
        r2.A00 = Boolean.valueOf(this.A04);
        this.A03.Bly(r2);
    }
}
