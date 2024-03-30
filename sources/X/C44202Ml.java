package X;

import android.content.Context;

/* renamed from: X.2Ml  reason: invalid class name and case insensitive filesystem */
public final class C44202Ml extends AnonymousClass1DJ {
    public boolean A00;
    public final C20430xY A01;
    public final AnonymousClass1YZ A02;
    public final C19630wG A03;
    public final C19420v0 A04;
    public final C20810yC A05;
    public final C19770wU A06;

    public void A01() {
        if (!this.A00 && this.A05.A0E(4921)) {
            String A0t = C36371kC.A0t(C36341k9.A0E(this.A04), "my_current_status");
            Context context = this.A03.A00;
            AnonymousClass00C.A08(context);
            if (!AnonymousClass3SX.A03(context, A0t)) {
                A0t = null;
            }
            C36421kH.A1H(this.A06, this, A0t, 32);
        }
    }

    public void A02() {
        this.A00 = this.A05.A0E(4921);
    }

    public C44202Ml(C20430xY r2, C19630wG r3, C19420v0 r4, AnonymousClass1YZ r5, C20810yC r6, C19770wU r7) {
        C36321k7.A1B(r6, r3, r7, r5, r2);
        AnonymousClass00C.A0D(r4, 6);
        this.A05 = r6;
        this.A03 = r3;
        this.A06 = r7;
        this.A02 = r5;
        this.A01 = r2;
        this.A04 = r4;
    }
}
