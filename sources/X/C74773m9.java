package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3m9  reason: invalid class name and case insensitive filesystem */
public final class C74773m9 implements C88864Ui {
    public final AnonymousClass16D A00;
    public final AnonymousClass185 A01;
    public final C235618y A02;
    public final C20810yC A03;
    public final C20500xf A04;
    public final AnonymousClass1E9 A05;

    public Boolean BMs(AnonymousClass3T1 r10) {
        AnonymousClass141 A07;
        AnonymousClass00C.A0D(r10, 0);
        C20810yC r6 = this.A03;
        C20500xf r5 = this.A04;
        AnonymousClass16D r4 = this.A00;
        C235618y r8 = this.A02;
        AnonymousClass1E9 r0 = this.A05;
        AnonymousClass185 r3 = this.A01;
        boolean z = false;
        if (AnonymousClass3RK.A01(r6, r0) && (A07 = r4.A07(C64933Qa.A01(r10))) != null) {
            UserJid A0l = C36351kA.A0l(A07);
            if (!AnonymousClass3RB.A01(r5, A0l) && new AnonymousClass3U1(r3, r8, A0l).A04()) {
                z = true;
            }
        }
        if (z || C63823Lo.A00(r4, r3, r6, r5, r10)) {
            return false;
        }
        return null;
    }

    public C74773m9(AnonymousClass16D r2, AnonymousClass185 r3, C235618y r4, C20810yC r5, C20500xf r6, AnonymousClass1E9 r7) {
        C36321k7.A1B(r5, r6, r2, r4, r7);
        AnonymousClass00C.A0D(r3, 6);
        this.A03 = r5;
        this.A04 = r6;
        this.A00 = r2;
        this.A02 = r4;
        this.A05 = r7;
        this.A01 = r3;
    }

    public /* synthetic */ Boolean BLU(AnonymousClass3T1 r2) {
        return null;
    }

    public /* synthetic */ Boolean BMD(AnonymousClass3T1 r2) {
        return null;
    }

    public /* synthetic */ Boolean BMp(AnonymousClass3T1 r2) {
        return null;
    }

    public /* synthetic */ Boolean BN2(AnonymousClass3T1 r2) {
        return null;
    }

    public /* synthetic */ Boolean BNF(AnonymousClass3T1 r2) {
        return null;
    }

    public /* synthetic */ Boolean BNI(AnonymousClass3T1 r2) {
        return null;
    }
}
