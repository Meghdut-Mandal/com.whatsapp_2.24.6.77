package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1E4  reason: invalid class name */
public class AnonymousClass1E4 {
    public final C24541Cv A00;
    public final C21010yW A01;
    public final C19930wk A02;
    public final AnonymousClass185 A03;
    public final C235618y A04;
    public final C20810yC A05;
    public final C20500xf A06;
    public final AnonymousClass1E9 A07;

    public static Integer A00(AnonymousClass11F r5, AnonymousClass1E4 r6) {
        int i;
        C20810yC r3 = r6.A05;
        AnonymousClass185 r1 = r6.A03;
        C222813r r0 = UserJid.Companion;
        UserJid A002 = C222813r.A00(r5);
        C20500xf r4 = r6.A06;
        if (C63823Lo.A01(r1, r3, r4, A002)) {
            i = 2;
        } else if (!AnonymousClass3RK.A00(r1, r6.A04, r3, r4, A002, r6.A07)) {
            return null;
        } else {
            i = 1;
        }
        return Integer.valueOf(i);
    }

    public void A01(int i) {
        AnonymousClass2NR r1 = new AnonymousClass2NR();
        r1.A00 = Integer.valueOf(i);
        this.A01.Bly(r1);
    }

    public AnonymousClass1E4(AnonymousClass185 r3, C235618y r4, C24541Cv r5, C20810yC r6, C20500xf r7, C21010yW r8, AnonymousClass1E9 r9, C19770wU r10) {
        this.A05 = r6;
        this.A01 = r8;
        this.A06 = r7;
        this.A00 = r5;
        this.A04 = r4;
        this.A07 = r9;
        this.A03 = r3;
        this.A02 = new C19930wk(r10, false);
    }
}
