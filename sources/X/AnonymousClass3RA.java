package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3RA  reason: invalid class name */
public abstract class AnonymousClass3RA {
    public static final boolean A01(AnonymousClass17X r4, AnonymousClass141 r5, AnonymousClass1EL r6) {
        AnonymousClass00C.A0D(r4, 0);
        C36321k7.A0x(r6, r5);
        if (!r6.A01(r5) && !r6.A00(r5)) {
            C65533Sl r0 = AnonymousClass147.A01;
            AnonymousClass147 A03 = C65533Sl.A03(r5.A0H);
            if (A03 != null) {
                if (r4.A0D(A03) || (r5.A04 == 1 && r4.A0C(A03))) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public static final boolean A00(C220412q r3, AnonymousClass17X r4, AnonymousClass2bI r5) {
        AnonymousClass11F r1;
        C36321k7.A0x(r3, r4);
        C65533Sl r0 = AnonymousClass147.A01;
        AnonymousClass147 A03 = C65533Sl.A03(r5.A1J.A00);
        if (r5.A1Y()) {
            r1 = r5.A0J();
        } else {
            r1 = null;
        }
        if (A03 == null || !(r1 instanceof UserJid) || !r4.A0D(A03) || r3.A0O(A03) || r4.A0J(A03, (UserJid) r1)) {
            return false;
        }
        return true;
    }
}
