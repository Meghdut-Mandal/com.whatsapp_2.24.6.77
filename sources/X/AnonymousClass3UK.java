package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;

/* renamed from: X.3UK  reason: invalid class name */
public abstract class AnonymousClass3UK {
    public static final int A00(int i) {
        if (i < 32) {
            return 1;
        }
        if (i < 64) {
            return 2;
        }
        if (i < 128) {
            return 3;
        }
        if (i < 256) {
            return 4;
        }
        if (i < 512) {
            return 5;
        }
        if (i < 1024) {
            return 16;
        }
        if (i < 1500) {
            return 7;
        }
        if (i < 2000) {
            return 8;
        }
        if (i < 2500) {
            return 9;
        }
        if (i < 3000) {
            return 10;
        }
        if (i < 3500) {
            return 11;
        }
        if (i < 4000) {
            return 12;
        }
        if (i >= 4500) {
            return i < 5000 ? 14 : 15;
        }
        return 13;
    }

    public static final int A01(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 2) {
            return i != 3 ? 0 : 3;
        }
        return 2;
    }

    public static final int A02(int i) {
        if (i < 4) {
            return 1;
        }
        if (i < 8) {
            return 2;
        }
        if (i < 16) {
            return 3;
        }
        if (i < 32) {
            return 4;
        }
        if (i < 64) {
            return 5;
        }
        if (i < 128) {
            return 6;
        }
        if (i < 256) {
            return 7;
        }
        if (i < 512) {
            return 8;
        }
        if (i < 999) {
            return 9;
        }
        if (i < 1500) {
            return 10;
        }
        if (i < 2000) {
            return 11;
        }
        if (i < 2500) {
            return 12;
        }
        if (i < 3000) {
            return 13;
        }
        if (i < 3500) {
            return 14;
        }
        if (i < 4000) {
            return 15;
        }
        return i >= 4500 ? 17 : 16;
    }

    public static final int A03(int i) {
        if (i <= 33) {
            return 1;
        }
        if (i <= 65) {
            return 2;
        }
        if (i <= 129) {
            return 3;
        }
        if (i <= 257) {
            return 4;
        }
        if (i <= 513) {
            return 5;
        }
        if (i <= 1025) {
            return 16;
        }
        if (i <= 1501) {
            return 7;
        }
        if (i <= 2001) {
            return 8;
        }
        if (i <= 2501) {
            return 9;
        }
        if (i <= 3001) {
            return 10;
        }
        if (i <= 3501) {
            return 11;
        }
        if (i <= 4001) {
            return 12;
        }
        if (i > 4501) {
            return i <= 5001 ? 14 : 15;
        }
        return 13;
    }

    public static final int A05(AnonymousClass3T1 r1) {
        AnonymousClass00C.A0D(r1, 0);
        if (r1.A0J() instanceof C177618e5) {
            return 3;
        }
        return A04(r1.A1J.A00);
    }

    public static final Integer A06(C220412q r1, AnonymousClass11F r2) {
        AnonymousClass00C.A0D(r1, 1);
        if (!AnonymousClass143.A0G(r2)) {
            return null;
        }
        GroupJid groupJid = (GroupJid) r2;
        if (!AnonymousClass143.A0G(groupJid)) {
            return null;
        }
        int A06 = r1.A06(groupJid);
        if (A06 != 2) {
            int i = 3;
            if (A06 != 3) {
                if (A06 != 6) {
                    i = 1;
                }
            }
            return Integer.valueOf(i);
        }
        return 2;
    }

    public static final String A07(AnonymousClass3T1 r5) {
        String str;
        C64933Qa r4 = r5.A1J;
        AnonymousClass11F r1 = r4.A00;
        AnonymousClass11F r3 = null;
        if (r1 == null) {
            return null;
        }
        if (AnonymousClass143.A0G(r1) || (r1 instanceof C177618e5)) {
            r3 = r5.A0J();
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(r1.getRawString());
        A0u.append('_');
        A0u.append(r4.A01);
        A0u.append('_');
        A0u.append(r4.A02 ? 1 : 0);
        A0u.append('_');
        if (r3 == null || (str = r3.getRawString()) == null) {
            str = "0";
        }
        return AnonymousClass000.A0q(str, A0u);
    }

    public static final int A04(Jid jid) {
        if (AnonymousClass143.A0G(jid)) {
            return 2;
        }
        if (jid instanceof C177528dw) {
            return 4;
        }
        if (jid instanceof C177538dx) {
            return 3;
        }
        if (jid instanceof C28981Uw) {
            return 5;
        }
        if (AnonymousClass143.A0H(jid)) {
            return 6;
        }
        return 1;
    }
}
