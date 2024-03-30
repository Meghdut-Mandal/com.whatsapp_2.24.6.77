package X;

/* renamed from: X.0n1  reason: invalid class name and case insensitive filesystem */
public final class C15300n1 extends C008503q {
    public final AnonymousClass0AR A00;

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A05((Throwable) obj);
        return AnonymousClass0AJ.A00;
    }

    public C15300n1(AnonymousClass0AR r1) {
        this.A00 = r1;
    }

    public void A05(Throwable th) {
        Object A01;
        Object A0X = A06().A0X();
        boolean z = A0X instanceof AnonymousClass0AT;
        AnonymousClass0AR r1 = this.A00;
        if (z) {
            A01 = AnonymousClass00C.A02(((AnonymousClass0AT) A0X).A00);
        } else {
            A01 = C007803i.A01(A0X);
        }
        r1.resumeWith(A01);
    }
}
