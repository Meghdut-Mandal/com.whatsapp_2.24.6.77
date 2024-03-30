package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9Qz  reason: invalid class name and case insensitive filesystem */
public final class C194729Qz {
    public final C20810yC A00;
    public final C21010yW A01;

    public final void A00(AnonymousClass3T1 r7, Integer num, int i) {
        C207219uk BA8;
        C207089uX r0;
        Long l;
        String str;
        if (this.A00.A0E(4657) && (BA8 = ((C23043B1o) r7).BA8()) != null && (r0 = BA8.A04) != null) {
            long size = (long) r0.A03.size();
            C176448c8 r4 = new C176448c8();
            UserJid A0L = r7.A0L();
            Long l2 = null;
            if (A0L == null || (str = A0L.user) == null) {
                l = null;
            } else {
                l = C36431kI.A15(str);
            }
            r4.A02 = l;
            r4.A05 = (String) r7.A1L.A00;
            r4.A03 = Long.valueOf(size);
            r4.A00 = 0;
            if (num != null) {
                l2 = C90484aE.A0h(num);
            }
            r4.A04 = l2;
            r4.A01 = Integer.valueOf(i);
            this.A01.Bly(r4);
        }
    }

    public C194729Qz(C20810yC r1, C21010yW r2) {
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
