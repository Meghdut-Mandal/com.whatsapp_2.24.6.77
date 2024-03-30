package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2sa  reason: invalid class name and case insensitive filesystem */
public abstract class C54212sa {
    public static final Integer A00(AnonymousClass11F r1) {
        int i;
        if (AnonymousClass143.A0G(r1)) {
            i = 2;
        } else if (r1 instanceof C177528dw) {
            i = 4;
        } else if (r1 instanceof C177538dx) {
            i = 3;
        } else if (r1 instanceof C28981Uw) {
            i = 5;
        } else if (AnonymousClass143.A0H(r1)) {
            i = 6;
        } else if (!(r1 instanceof UserJid)) {
            return null;
        } else {
            i = 1;
        }
        return Integer.valueOf(i);
    }
}
