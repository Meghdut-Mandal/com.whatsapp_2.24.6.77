package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.18x  reason: invalid class name and case insensitive filesystem */
public class C235518x {
    public final C001700s A00 = new C001700s();
    public final C19730wQ A01;
    public final AnonymousClass16D A02;
    public final C238119y A03;
    public final AnonymousClass185 A04;
    public final C235618y A05;
    public final C19970wo A06;
    public final C238019x A07;

    public int A00(UserJid userJid) {
        AnonymousClass141 A08;
        if (this.A01.A0M(userJid)) {
            return A04().intValue();
        }
        if (this.A04.A04(userJid) || (A08 = this.A02.A08(userJid)) == null) {
            return 0;
        }
        return A08.A01;
    }

    public long A01(UserJid userJid) {
        if (this.A01.A0M(userJid)) {
            return C238119y.A00(this.A03).getLong("disappearing_mode_timestamp", 0);
        }
        AnonymousClass141 A08 = this.A02.A08(userJid);
        if (A08 == null) {
            return 0;
        }
        return A08.A09;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        if (r1 <= r0) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.whatsapp.jid.UserJid A02(X.AnonymousClass11F r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.whatsapp.jid.UserJid
            r4 = 0
            if (r0 == 0) goto L_0x0066
            boolean r0 = X.C197029b1.A00(r6)
            if (r0 != 0) goto L_0x0066
            X.185 r0 = r5.A04
            r3 = r6
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            boolean r0 = r0.A04(r3)
            if (r0 != 0) goto L_0x0066
            X.18y r0 = r5.A05
            boolean r0 = r0.A00(r3)
            if (r0 != 0) goto L_0x0066
            boolean r0 = X.AnonymousClass143.A0H(r6)
            if (r0 != 0) goto L_0x0066
            boolean r0 = r5.A06()
            if (r0 == 0) goto L_0x0052
            X.16D r2 = r5.A02
            X.141 r0 = r2.A08(r3)
            if (r0 == 0) goto L_0x0047
            int r0 = r0.A01
            if (r0 == 0) goto L_0x0047
            java.lang.Integer r0 = r5.A04()
            int r1 = r0.intValue()
            X.141 r0 = r2.A08(r3)
            if (r0 != 0) goto L_0x004f
            r0 = 0
        L_0x0045:
            if (r1 > r0) goto L_0x0052
        L_0x0047:
            X.0wQ r0 = r5.A01
            r0.A0G()
            com.whatsapp.jid.PhoneUserJid r0 = r0.A03
            return r0
        L_0x004f:
            int r0 = r0.A01
            goto L_0x0045
        L_0x0052:
            X.0wQ r0 = r5.A01
            boolean r0 = r0.A0M(r3)
            if (r0 == 0) goto L_0x0061
            boolean r0 = r5.A06()
        L_0x005e:
            if (r0 == 0) goto L_0x0066
            return r3
        L_0x0061:
            int r0 = r5.A00(r3)
            goto L_0x005e
        L_0x0066:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C235518x.A02(X.11F):com.whatsapp.jid.UserJid");
    }

    public Integer A04() {
        Integer num = (Integer) this.A00.A04();
        if (num == null) {
            return Integer.valueOf(C238119y.A00(this.A03).getInt("disappearing_mode_duration_int", 0));
        }
        return num;
    }

    public void A05(int i, long j) {
        C238119y r2 = this.A03;
        C238119y.A00(r2).edit().putInt("disappearing_mode_duration_int", i).apply();
        C238119y.A00(r2).edit().putLong("disappearing_mode_timestamp", j).apply();
        this.A00.A0C(Integer.valueOf(i));
    }

    public boolean A06() {
        if (C238119y.A00(this.A03).getInt("disappearing_mode_duration_int", 0) != 0) {
            return true;
        }
        return false;
    }

    public C235518x(C19730wQ r2, AnonymousClass16D r3, AnonymousClass185 r4, C235618y r5, C19970wo r6, C238119y r7, C238019x r8) {
        this.A06 = r6;
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = r5;
        this.A04 = r4;
        this.A07 = r8;
        this.A03 = r7;
    }

    public C181158n1 A03(AnonymousClass11F r11) {
        UserJid A022 = A02(r11);
        if (A022 == null) {
            return null;
        }
        boolean A0M = this.A01.A0M(A022);
        int i = 2;
        if (A0M) {
            i = 1;
        }
        C238019x r1 = this.A07;
        C222813r r0 = UserJid.Companion;
        UserJid A002 = C222813r.A00(r11);
        C18740tg.A06(A002);
        long A003 = C19970wo.A00(this.A06);
        int A004 = A00(A022);
        long A012 = A01(A022);
        Boolean valueOf = Boolean.valueOf(A0M);
        C181158n1 r12 = new C181158n1(r1.A01.A02(A002, true), A003);
        r12.A00 = A004;
        r12.A15(Long.valueOf(A012));
        r12.A00 = i;
        r12.A04 = 2;
        if (valueOf == null) {
            return r12;
        }
        r12.A0d = valueOf;
        return r12;
    }
}
