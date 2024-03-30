package X;

import android.content.SharedPreferences;

/* renamed from: X.3Rs  reason: invalid class name and case insensitive filesystem */
public final class C65353Rs {
    public final C19730wQ A00;
    public final C19420v0 A01;
    public final AnonymousClass1GQ A02;
    public final C65423Rz A03;
    public final C21010yW A04;
    public final C32311dK A05;

    public C65353Rs(C19730wQ r2, C19420v0 r3, C21010yW r4, AnonymousClass1GQ r5, C65423Rz r6, C32311dK r7) {
        AnonymousClass00C.A0D(r2, 1);
        C36321k7.A1A(r3, r5, r4, r6, 2);
        this.A00 = r2;
        this.A01 = r3;
        this.A05 = r7;
        this.A02 = r5;
        this.A04 = r4;
        this.A03 = r6;
    }

    public static final void A00(AnonymousClass3HM r2, C65353Rs r3) {
        SharedPreferences.Editor putBoolean;
        if (r2 instanceof C48552hV) {
            C19420v0 r0 = r3.A01;
            r0.A11();
            putBoolean = C19420v0.A00(r0).putBoolean("nux_status_banner_ackd_in_updates", true);
        } else if (r2 instanceof C48562hW) {
            C36331k8.A0w(C19420v0.A00(r3.A01), "nux_updates_banner_ack", true);
            C65423Rz r1 = r3.A03;
            putBoolean = C19420v0.A00(r1.A00).putBoolean(C65423Rz.A00(C51642o9.UPDATES), true);
        } else if (r2 instanceof C48542hU) {
            throw AnonymousClass001.A09("Archive status banner is not active - it is not allowed to be changed");
        } else {
            return;
        }
        putBoolean.apply();
    }

    public static final void A01(C65353Rs r2, int i) {
        C21010yW r22 = r2.A04;
        AnonymousClass2PD r1 = new AnonymousClass2PD();
        r1.A01 = 46;
        r1.A00 = Integer.valueOf(i);
        r22.Bly(r1);
    }
}
