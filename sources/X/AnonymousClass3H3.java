package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.3H3  reason: invalid class name */
public final class AnonymousClass3H3 {
    public final AnonymousClass17Y A00;
    public final AnonymousClass1LV A01;
    public final AnonymousClass171 A02;
    public final C19630wG A03;
    public final AnonymousClass17X A04;
    public final C20810yC A05;
    public final AnonymousClass147 A06;
    public final C19770wU A07;
    public final AnonymousClass00T A08 = C36431kI.A1I(new C834949p(this));
    public final AnonymousClass16D A09;

    public final boolean A00() {
        AnonymousClass141 r3;
        AnonymousClass00T r2 = this.A08;
        AnonymousClass11F A0O = C36421kH.A0O(r2);
        if (A0O != null) {
            r3 = this.A09.A07(A0O);
        } else {
            r3 = null;
        }
        GroupJid groupJid = (GroupJid) r2.getValue();
        if (groupJid != null) {
            AnonymousClass17X r1 = this.A04;
            if (!r1.A0C(groupJid) || r1.A0D(this.A06) || r3 == null || r3.A04 == 1) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass3H3(AnonymousClass17Y r2, AnonymousClass1LV r3, AnonymousClass16D r4, AnonymousClass171 r5, C19630wG r6, AnonymousClass17X r7, C20810yC r8, AnonymousClass147 r9, C19770wU r10) {
        C36321k7.A1B(r8, r2, r6, r10, r4);
        C36321k7.A13(r5, r3, r7);
        AnonymousClass00C.A0D(r9, 9);
        this.A05 = r8;
        this.A00 = r2;
        this.A03 = r6;
        this.A07 = r10;
        this.A09 = r4;
        this.A02 = r5;
        this.A01 = r3;
        this.A04 = r7;
        this.A06 = r9;
    }
}
