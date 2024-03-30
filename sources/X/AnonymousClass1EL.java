package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.1EL  reason: invalid class name */
public final class AnonymousClass1EL {
    public final AnonymousClass16D A00;
    public final C220412q A01;
    public final C20810yC A02;

    public AnonymousClass1EL(AnonymousClass16D r2, C220412q r3, C20810yC r4) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r2, 3);
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
    }

    public final boolean A00(AnonymousClass141 r5) {
        if (r5 == null) {
            return false;
        }
        return r5.A0G() && C56602wa.A00.contains(Integer.valueOf(this.A01.A05((GroupJid) r5.A06(AnonymousClass147.class)))) && r5.A0r;
    }

    public final boolean A01(AnonymousClass141 r4) {
        if (r4 == null) {
            return false;
        }
        int A05 = this.A01.A05((GroupJid) r4.A06(AnonymousClass147.class));
        if (!r4.A0G() || A05 == 3 || A05 == 1) {
            return false;
        }
        return r4.A0r;
    }

    public final boolean A02(AnonymousClass11F r5) {
        if (r5 == null || !AnonymousClass143.A0G(r5) || !A01(this.A00.A0D(r5))) {
            return false;
        }
        return C20800yB.A01(C21000yV.A02, this.A02, 3180);
    }
}
