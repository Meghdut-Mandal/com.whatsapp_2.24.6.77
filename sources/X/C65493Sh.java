package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3Sh  reason: invalid class name and case insensitive filesystem */
public final class C65493Sh {
    public final C21010yW A00;
    public final AnonymousClass17X A01;

    public static final void A00(C45462Rl r2, AnonymousClass11F r3, C65493Sh r4) {
        boolean z = r3 instanceof AnonymousClass147;
        r2.A00 = Boolean.valueOf(z);
        if (z) {
            AnonymousClass17X r1 = r4.A01;
            r2.A01 = Boolean.valueOf(r1.A0D((GroupJid) r3));
            r2.A03 = Integer.valueOf(AnonymousClass3UK.A03(r1.A07.A0A((AnonymousClass144) r3)));
        }
    }

    public static final void A01(C45462Rl r3, AnonymousClass11F r4, AnonymousClass2bS r5) {
        int i;
        int i2;
        C64933Qa r0;
        if (r4 == null) {
            if (r5 == null || (r0 = r5.A1J) == null) {
                r4 = null;
            } else {
                r4 = r0.A00;
            }
        }
        boolean A1X = C36371kC.A1X(r3.A00, true);
        if (r4 instanceof C28981Uw) {
            i = 5;
        } else if (r4 instanceof UserJid) {
            i2 = 1;
            r3.A02 = i2;
        } else if (r4 instanceof C177528dw) {
            i = 3;
        } else if (r4 instanceof C177618e5) {
            i = 4;
        } else {
            i = 0;
            if (A1X) {
                i = 2;
            }
        }
        i2 = Integer.valueOf(i);
        r3.A02 = i2;
    }

    public static final void A02(C45462Rl r4, AnonymousClass2bS r5) {
        long j = r5.A0I;
        r4.A05 = Long.valueOf(C36391kE.A0B(j - (j % 86400000)));
        r4.A06 = C36441kJ.A0y(r5.A05.size());
    }

    public C65493Sh(AnonymousClass17X r1, C21010yW r2) {
        C36321k7.A0x(r2, r1);
        this.A00 = r2;
        this.A01 = r1;
    }
}
