package X;

import com.whatsapp.jid.UserJid;
import java.util.Collection;
import java.util.List;

/* renamed from: X.9RO  reason: invalid class name */
public final class AnonymousClass9RO {
    public final C20810yC A00;
    public final AnonymousClass00T A01 = C36431kI.A1I(new C22152Ahb(this));
    public final AnonymousClass185 A02;

    public final boolean A00(AnonymousClass141 r9) {
        UserJid userJid;
        C10910fQ A002;
        AnonymousClass00C.A0D(r9, 0);
        AnonymousClass11F r1 = r9.A0H;
        if (r1 instanceof UserJid) {
            userJid = (UserJid) r1;
        } else {
            userJid = null;
        }
        if (r9.A0C() && userJid != null && this.A02.A04(userJid) && (A002 = C05690Qr.A00(userJid.user)) != null) {
            List<C11010fa> A0q = C90524aI.A0q(this.A01);
            if (!(A0q instanceof Collection) || !A0q.isEmpty()) {
                for (C11010fa r4 : A0q) {
                    long j = A002.A00;
                    if (Long.compare(r4.A00 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE) <= 0 && Long.compare(j ^ Long.MIN_VALUE, r4.A01 ^ Long.MIN_VALUE) <= 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public AnonymousClass9RO(AnonymousClass185 r2, C20810yC r3) {
        C36321k7.A0x(r3, r2);
        this.A00 = r3;
        this.A02 = r2;
    }
}
