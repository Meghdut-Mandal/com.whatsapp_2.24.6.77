package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3qV  reason: invalid class name and case insensitive filesystem */
public final class C77443qV implements C88544Tc {
    public final AnonymousClass16D A00;
    public final AnonymousClass185 A01;
    public final C235618y A02;
    public final C20810yC A03;
    public final C20500xf A04;
    public final AnonymousClass1E9 A05;

    public /* synthetic */ boolean BMn(AnonymousClass3T1 r2) {
        AnonymousClass00C.A0D(r2, 1);
        return BN1(r2);
    }

    public boolean BN1(AnonymousClass3T1 r7) {
        AnonymousClass141 A07;
        AnonymousClass00C.A0D(r7, 0);
        C20810yC r2 = this.A03;
        C20500xf r5 = this.A04;
        AnonymousClass16D r1 = this.A00;
        C235618y r4 = this.A02;
        AnonymousClass1E9 r0 = this.A05;
        AnonymousClass185 r3 = this.A01;
        boolean A012 = AnonymousClass3RK.A01(r2, r0);
        boolean z = false;
        if (A012 && (A07 = r1.A07(C64933Qa.A01(r7))) != null) {
            UserJid A0l = C36351kA.A0l(A07);
            if (!AnonymousClass3RB.A01(r5, A0l) && new AnonymousClass3U1(r3, r4, A0l).A04()) {
                z = true;
            }
        }
        return !z;
    }

    public C77443qV(AnonymousClass16D r2, AnonymousClass185 r3, C235618y r4, C20810yC r5, C20500xf r6, AnonymousClass1E9 r7) {
        C36321k7.A1B(r5, r6, r2, r4, r7);
        AnonymousClass00C.A0D(r3, 6);
        this.A03 = r5;
        this.A04 = r6;
        this.A00 = r2;
        this.A02 = r4;
        this.A05 = r7;
        this.A01 = r3;
    }
}
