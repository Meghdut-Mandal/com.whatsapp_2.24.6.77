package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.1Sl  reason: invalid class name and case insensitive filesystem */
public final class C28381Sl {
    public final AnonymousClass005 A00;

    public C28381Sl(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public static final Integer A01(int i) {
        int i2;
        switch (i) {
            case 0:
                i2 = 1;
                break;
            case 1:
                i2 = 8;
                break;
            case 2:
            case 6:
                i2 = 6;
                break;
            case 3:
                i2 = 7;
                break;
            case 4:
                i2 = 5;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i2);
    }

    public static final int A00(AnonymousClass11F r1) {
        if (AnonymousClass143.A0G(r1)) {
            return 1;
        }
        if (r1 instanceof C177528dw) {
            return 4;
        }
        if (r1 instanceof C177618e5) {
            return 2;
        }
        if (r1 instanceof C28981Uw) {
            return 5;
        }
        return 3;
    }

    public final int A02(AnonymousClass11F r3) {
        int A002 = A00(r3);
        if (A002 != 1) {
            return A002;
        }
        AnonymousClass00C.A0E(r3, "null cannot be cast to non-null type com.whatsapp.jid.GroupJid");
        Integer A01 = A01(((C220412q) this.A00.get()).A05((GroupJid) r3));
        if (A01 != null) {
            return A01.intValue();
        }
        return A002;
    }
}
