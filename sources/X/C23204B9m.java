package X;

/* renamed from: X.B9m  reason: case insensitive filesystem */
public class C23204B9m implements AnonymousClass4TM {
    public Object A00;
    public final int A01;

    public C23204B9m(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void Bbg(C28981Uw r5) {
        C178248fc r3;
        AnonymousClass17Y r2;
        int i;
        Runnable r1;
        switch (this.A01) {
            case 0:
                C36321k7.A1K(r5, "NewsletterCreationActivity Channel created: ", C36341k9.A0i(r5));
                C178248fc r32 = (C178248fc) this.A00;
                r32.A3l().A07(13, true);
                r2 = r32.A05;
                r1 = new C1502074j(r32, r5, 38);
                break;
            case 1:
                r3 = (C178248fc) this.A00;
                r3.A3l().A07(13, false);
                r2 = r3.A05;
                i = 17;
                break;
            default:
                r3 = (C178248fc) this.A00;
                r3.A3l().A07(13, false);
                r2 = r3.A05;
                i = 19;
                break;
        }
        r1 = new C81123wV((Object) r3, i);
        r2.A0H(r1);
    }

    public void onError(Throwable th) {
        C178248fc r3;
        AnonymousClass17Y r2;
        int i;
        switch (this.A01) {
            case 0:
                AnonymousClass00C.A0D(th, 0);
                r3 = (C178248fc) this.A00;
                r3.A3l().A07(14, true);
                r2 = r3.A05;
                i = 15;
                break;
            case 1:
                AnonymousClass00C.A0D(th, 0);
                r3 = (C178248fc) this.A00;
                r3.A3l().A07(14, false);
                r2 = r3.A05;
                i = 16;
                break;
            default:
                AnonymousClass00C.A0D(th, 0);
                r3 = (C178248fc) this.A00;
                r3.A3l().A07(14, false);
                r2 = r3.A05;
                i = 18;
                break;
        }
        r2.A0H(new C81123wV((Object) r3, i));
    }
}
