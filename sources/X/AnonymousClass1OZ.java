package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1OZ  reason: invalid class name */
public class AnonymousClass1OZ {
    public final AnonymousClass1O7 A00;
    public final AnonymousClass1OC A01;
    public final AnonymousClass1O9 A02;
    public final AnonymousClass1AQ A03;

    public static void A00(AnonymousClass1OZ r3, C194169Oj r4) {
        AnonymousClass1AT r0;
        UserJid userJid = r4.A0D;
        if (userJid != null) {
            boolean equals = "image".equals(r4.A0G);
            AnonymousClass1AQ r02 = r3.A03;
            C18740tg.A06(userJid);
            if (equals) {
                r0 = r02.A01;
            } else {
                r0 = r02.A02;
            }
            r0.A01(userJid);
        }
    }

    public AnonymousClass1OZ(AnonymousClass1O7 r1, AnonymousClass1OC r2, AnonymousClass1O9 r3, AnonymousClass1AQ r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
