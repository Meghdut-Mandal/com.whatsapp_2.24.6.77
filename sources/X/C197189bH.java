package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9bH  reason: invalid class name and case insensitive filesystem */
public final class C197189bH {
    public final AnonymousClass9Y1 A00;

    public C197189bH(AnonymousClass9Y1 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public static final void A00(C197189bH r8, UserJid userJid, Integer num, Integer num2, String str, int i) {
        Long l;
        AnonymousClass9Y1 r2 = r8.A00;
        Integer valueOf = Integer.valueOf(i);
        if (num2 != null) {
            l = C36441kJ.A0y(num2.intValue() + 1);
        } else {
            l = null;
        }
        r2.A0A.Boy(new AVr(r2, userJid, valueOf, num, l, str, 1));
    }
}
