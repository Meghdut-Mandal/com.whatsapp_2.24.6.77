package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1Jx  reason: invalid class name and case insensitive filesystem */
public class C26371Jx {
    public static final long[] A08 = {0, 180000, 900000};
    public final C220412q A00;
    public final AnonymousClass17X A01;
    public final AnonymousClass1EL A02;
    public final C19460v5 A03;
    public final AnonymousClass185 A04;
    public final C235618y A05;
    public final AnonymousClass1LL A06;
    public final C20500xf A07;

    public boolean A00(AnonymousClass141 r3, AnonymousClass147 r4) {
        AnonymousClass17X r0 = this.A01;
        boolean A0C = r0.A0C(r4);
        boolean A0D = r0.A0D(r4);
        if (!A0C || ((!A0D && r3.A13) || this.A00.A05(r4) == 3 || this.A02.A00(r3))) {
            return false;
        }
        return true;
    }

    public boolean A01(UserJid userJid) {
        if (this.A04.A04(userJid)) {
            return false;
        }
        C19460v5 r1 = this.A03;
        if ((r1.A05() && ((AnonymousClass1K3) r1.A02()).BLB(userJid)) || AnonymousClass3M3.A01(this.A07, userJid) || this.A06.A01(userJid) != null) {
            return false;
        }
        C235618y r0 = this.A05;
        if (userJid == null || !r0.A00(userJid)) {
            return true;
        }
        return false;
    }

    public C26371Jx(C19460v5 r1, AnonymousClass185 r2, C235618y r3, AnonymousClass1LL r4, C220412q r5, AnonymousClass17X r6, C20500xf r7, AnonymousClass1EL r8) {
        this.A00 = r5;
        this.A07 = r7;
        this.A05 = r3;
        this.A02 = r8;
        this.A04 = r2;
        this.A03 = r1;
        this.A01 = r6;
        this.A06 = r4;
    }
}
