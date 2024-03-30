package X;

import java.util.List;

/* renamed from: X.3Kn  reason: invalid class name and case insensitive filesystem */
public final class C63563Kn {
    public final C19730wQ A00;
    public final C19420v0 A01;
    public final C18820ts A02;
    public final AnonymousClass1A5 A03;
    public final C20810yC A04;
    public final AnonymousClass3H7 A05;

    public final boolean A00() {
        C20810yC r3 = this.A04;
        String A19 = C36431kI.A19(r3, 4631);
        if (!AnonymousClass098.A06(A19)) {
            List A0L = AnonymousClass099.A0L(A19, new String[]{","}, 0);
            C18820ts r0 = this.A02;
            r0.A06();
            if (!A0L.contains(r0.A06()) || !r3.A0E(4445)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A02() {
        if (C36371kC.A1U(C36341k9.A0E(this.A01), "fun_stickers_notice_started_clicked") || !A00() || !this.A04.A0E(4837)) {
            return false;
        }
        return true;
    }

    public C63563Kn(C19730wQ r1, C19420v0 r2, C18820ts r3, AnonymousClass1A5 r4, C20810yC r5, AnonymousClass3H7 r6) {
        C36321k7.A11(r5, r1, r3);
        C36341k9.A1F(r2, r4);
        this.A04 = r5;
        this.A00 = r1;
        this.A02 = r3;
        this.A05 = r6;
        this.A01 = r2;
        this.A03 = r4;
    }

    public final boolean A01() {
        if (A00()) {
            AnonymousClass005 r3 = this.A01.A00;
            if (C36391kE.A0H(r3).getBoolean("fun_stickers_upsell_dismissed", false) || C36391kE.A0H(r3).getInt("fun_stickers_upsell_seen_count", 0) > 2 || !this.A04.A0E(4543)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
