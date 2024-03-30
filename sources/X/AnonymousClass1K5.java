package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1K5  reason: invalid class name */
public final class AnonymousClass1K5 {
    public final AnonymousClass1HX A00;
    public final AnonymousClass1K6 A01;
    public final C25621Ha A02;
    public final C19630wG A03;
    public final C20810yC A04;
    public final AnonymousClass005 A05;
    public final AnonymousClass005 A06;
    public final C19730wQ A07;
    public final AnonymousClass16D A08;
    public final C220412q A09;

    public AnonymousClass1K5(C19730wQ r2, AnonymousClass1HX r3, AnonymousClass1K6 r4, C25621Ha r5, AnonymousClass16D r6, C19630wG r7, C220412q r8, C20810yC r9, AnonymousClass005 r10, AnonymousClass005 r11) {
        AnonymousClass00C.A0D(r9, 1);
        AnonymousClass00C.A0D(r7, 2);
        AnonymousClass00C.A0D(r2, 3);
        AnonymousClass00C.A0D(r3, 4);
        AnonymousClass00C.A0D(r8, 5);
        AnonymousClass00C.A0D(r6, 6);
        AnonymousClass00C.A0D(r5, 7);
        AnonymousClass00C.A0D(r10, 8);
        AnonymousClass00C.A0D(r11, 9);
        AnonymousClass00C.A0D(r4, 10);
        this.A04 = r9;
        this.A03 = r7;
        this.A07 = r2;
        this.A00 = r3;
        this.A09 = r8;
        this.A08 = r6;
        this.A02 = r5;
        this.A05 = r10;
        this.A06 = r11;
        this.A01 = r4;
    }

    public boolean A02(AnonymousClass11F r3) {
        if (r3 != null && A00() && !C197029b1.A00(r3) && !this.A07.A0M(r3)) {
            if (r3 instanceof UserJid) {
                AnonymousClass141 A082 = this.A08.A08(r3);
                if (A082 == null || A082.A00 == 0) {
                    return true;
                }
            } else if (r3 instanceof AnonymousClass147) {
                return true;
            }
        }
        return false;
    }

    public boolean A00() {
        C25681Hg r1 = this.A00.A00;
        if (!r1.A00() || !r1.A01()) {
            return false;
        }
        return true;
    }

    public boolean A01(AnonymousClass11F r4) {
        if (A02(r4)) {
            C220412q r1 = this.A09;
            if (r1.A0O(r4) || (r4 != null && AnonymousClass3TD.A00(this.A08, r1, r4) > 0)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
