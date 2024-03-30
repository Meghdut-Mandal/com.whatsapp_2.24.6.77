package X;

import java.util.Random;

/* renamed from: X.3cx  reason: invalid class name and case insensitive filesystem */
public class C69083cx implements C19710wO {
    public final AnonymousClass1Z7 A00;
    public final C29341Wg A01;
    public final AnonymousClass3TS A02;

    public String BIB() {
        return "UserNoticeAsyncInit";
    }

    public /* synthetic */ void BRM() {
    }

    public void BRL() {
        C29341Wg r3 = this.A01;
        boolean A0E = r3.A01.A0E(366);
        if (A0E && !C36371kC.A1U(C29361Wi.A00(r3.A03), "is_cleared")) {
            r3.A09();
            C29341Wg.A03(r3);
        }
        C36331k8.A0w(C29361Wi.A00(r3.A03).edit(), "is_cleared", A0E);
        AnonymousClass3TS r4 = this.A02;
        if (r4.A00 == null) {
            C19930wk r32 = new C19930wk(r4.A06, false);
            r4.A00 = r32;
            r32.A03(new C1497372o(r4, 30), 800);
        }
        C20810yC r2 = r4.A03;
        AnonymousClass00C.A0D(r2, 0);
        if (C20800yB.A01(C21000yV.A01, r2, 1799)) {
            AnonymousClass1Z8 r42 = r4.A05;
            C35731jA r1 = new C35731jA((Object) r42, 12);
            r42.A00.A03(r1, ((long) new Random().nextInt(400)) + 800);
        }
    }

    public C69083cx(AnonymousClass1Z7 r1, C29341Wg r2, AnonymousClass3TS r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
