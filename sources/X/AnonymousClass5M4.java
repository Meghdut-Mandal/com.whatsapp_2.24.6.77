package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.5M4  reason: invalid class name */
public final class AnonymousClass5M4 extends C132446Tt {
    public final AnonymousClass7fY A00;
    public final UserJid A01;
    public final /* synthetic */ AnonymousClass1KK A02;

    public AnonymousClass5M4(AnonymousClass7fY r1, AnonymousClass1KK r2, UserJid userJid) {
        this.A02 = r2;
        this.A01 = userJid;
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C207109uZ r15 = (C207109uZ) obj;
        AnonymousClass7fY r0 = this.A00;
        if (r0 != null) {
            r0.BSQ(r15);
        }
        UserJid userJid = this.A01;
        if (userJid != null && r15 != null) {
            AnonymousClass1KK r1 = this.A02;
            if ((r1.A03.A00() & 512) > 0 && r15.A0Z) {
                AnonymousClass1KR r5 = r1.A05;
                C20810yC r12 = r5.A05;
                if ((!r12.A0E(5333) || !r12.A0E(1319)) && !r12.A0E(7352)) {
                    C26451Kf r4 = r5.A04;
                    int A0B = r4.A0B(userJid, "prefetch_conversation");
                    C26461Kg r6 = r5.A02;
                    Integer valueOf = Integer.valueOf(A0B);
                    C121585tN A05 = r6.A05(userJid, valueOf, (String) null);
                    if (AnonymousClass1KR.A00(A05)) {
                        r4.A0D(valueOf, 2);
                        r5.A02(userJid);
                    } else if (A05 == null) {
                        r6.A07(new C145386to(r5, userJid, A0B), userJid, valueOf, (String) null, (String) null, (String) null, true);
                    } else {
                        r4.A0D(valueOf, 2);
                    }
                }
            }
        }
    }
}
