package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1Ur  reason: invalid class name and case insensitive filesystem */
public final class C28931Ur implements C28911Up {
    public final AnonymousClass1KK A00;
    public final AnonymousClass185 A01;
    public final C25851Hx A02;
    public final C28941Us A03;
    public final C20810yC A04;

    public C28931Ur(AnonymousClass1KK r2, AnonymousClass185 r3, C25851Hx r4, C28941Us r5, C20810yC r6) {
        AnonymousClass00C.A0D(r6, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r3, 3);
        AnonymousClass00C.A0D(r5, 4);
        AnonymousClass00C.A0D(r4, 5);
        this.A04 = r6;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r5;
        this.A02 = r4;
    }

    public void B0W(C28891Um r5, AnonymousClass11F r6) {
        C207109uZ A07;
        C222813r r0 = UserJid.Companion;
        UserJid A002 = C222813r.A00(r6);
        if (A002 != null && (A07 = this.A00.A07(A002)) != null) {
            r5.A00 = Boolean.valueOf(A07.A0Y);
            AnonymousClass3L0 A012 = this.A01.A01(A002);
            if (A012 != null) {
                r5.A03 = Boolean.valueOf(A012.A02());
                int i = A012.A01;
                boolean z = false;
                if (i == 2) {
                    z = true;
                }
                r5.A01 = Boolean.valueOf(z);
                boolean z2 = true;
                if (i != 1) {
                    z2 = false;
                }
                r5.A02 = Boolean.valueOf(z2);
            }
            r5.A04 = this.A03.A00(A002);
            AnonymousClass9Xu A013 = this.A02.A01.A01(A002);
            if (A013 != null) {
                r5.A0E = A013.A06;
                r5.A0D = A013.A05;
            }
        }
    }

    public boolean BtG(AnonymousClass11F r4) {
        return C20800yB.A01(C21000yV.A02, this.A04, 6715);
    }
}
