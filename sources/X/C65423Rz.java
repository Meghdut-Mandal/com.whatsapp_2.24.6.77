package X;

import java.util.ArrayList;
import java.util.Locale;

/* renamed from: X.3Rz  reason: invalid class name and case insensitive filesystem */
public final class C65423Rz {
    public final C19420v0 A00;
    public final C20810yC A01;
    public final C32311dK A02;

    public C65423Rz(C19420v0 r7, C20810yC r8, C32311dK r9) {
        C36321k7.A0v(r7, 1, r8);
        this.A00 = r7;
        this.A01 = r8;
        this.A02 = r9;
        AnonymousClass005 r5 = r7.A00;
        if (C36391kE.A0H(r5).getBoolean("nux_status_banner_ackd_in_updates", false) || C36391kE.A0H(r5).getBoolean("nux_updates_banner_ack", false)) {
            C19420v0 r3 = this.A00;
            C51642o9 r2 = C51642o9.UPDATES;
            C36321k7.A0q(r3, A01(r2), 3);
            C36331k8.A18(r3, A00(r2), true);
        }
        if (C36371kC.A1U(C36391kE.A0H(r5), "pref_advertise_banner_status_main_shown")) {
            C19420v0 r32 = this.A00;
            C51642o9 r22 = C51642o9.ADVERTISE;
            C36321k7.A0q(r32, A01(r22), 3);
            C36331k8.A18(r32, A00(r22), true);
        }
    }

    public final boolean A03(C51642o9 r8) {
        if (!this.A01.A0E(6285)) {
            return true;
        }
        ArrayList A0I = AnonymousClass001.A0I();
        A0I.add(C51642o9.UPDATES);
        A0I.add(C51642o9.ADVERTISE);
        for (C51642o9 r3 : C007103b.A0Y(A0I)) {
            AnonymousClass00C.A0D(r3, 0);
            String A002 = A00(r3);
            AnonymousClass005 r2 = this.A00.A00;
            if (!C36391kE.A0H(r2).getBoolean(A002, false)) {
                if (C36391kE.A0H(r2).getInt(A01(r3), 0) < 3) {
                    if (r3 != r8) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static final String A00(C51642o9 r3) {
        StringBuilder A0u = AnonymousClass000.A0u();
        String name = r3.name();
        Locale locale = Locale.getDefault();
        AnonymousClass00C.A08(locale);
        A0u.append(C36431kI.A1D(locale, name));
        return AnonymousClass000.A0q("_status_banner_ackd", A0u);
    }

    public static final String A01(C51642o9 r3) {
        StringBuilder A0u = AnonymousClass000.A0u();
        String name = r3.name();
        Locale locale = Locale.getDefault();
        AnonymousClass00C.A08(locale);
        A0u.append(C36431kI.A1D(locale, name));
        return AnonymousClass000.A0q("_status_banner_seen_count", A0u);
    }

    public final void A02(C51642o9 r4) {
        String A012 = A01(r4);
        C19420v0 r1 = this.A00;
        C36321k7.A0q(r1, A012, C36371kC.A01(C36341k9.A0E(r1), A012) + 1);
    }
}
