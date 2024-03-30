package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.1DQ  reason: invalid class name */
public class AnonymousClass1DQ {
    public final Handler A00;
    public final Handler A01;
    public final Handler A02;
    public final AnonymousClass1DP A03;
    public final AnonymousClass16J A04;
    public final AnonymousClass1DR A05;

    public AnonymousClass1DQ(AnonymousClass1DP r13, C220412q r14, C24381Cf r15, AnonymousClass16J r16, AnonymousClass16E r17, AnonymousClass1DR r18) {
        this.A03 = r13;
        AnonymousClass16J r5 = r16;
        this.A04 = r5;
        this.A05 = r18;
        AnonymousClass16J r10 = r5;
        this.A00 = new C35941jV(Looper.getMainLooper(), r13, this, r10, 0);
        this.A02 = new C35941jV(Looper.getMainLooper(), r15, this, r10, 1);
        Looper mainLooper = Looper.getMainLooper();
        this.A01 = new AnonymousClass1DS(mainLooper, r13, r14, this, r5, r17);
    }

    public static void A00(AnonymousClass1DQ r3, AnonymousClass3T1 r4, int i) {
        r3.A04.A05(r4, i);
        AnonymousClass1DP r2 = r3.A03;
        AnonymousClass11F r1 = r4.A1J.A00;
        C18740tg.A06(r1);
        r2.A02(r1, false);
        C202319lY r12 = r4.A0M;
        if (r12 != null) {
            r3.A05.A00(r12);
        }
    }

    public void A01(AnonymousClass3T1 r4, int i) {
        this.A02.post(new C35261iP((Object) this, i, 22, (Object) r4));
    }
}
