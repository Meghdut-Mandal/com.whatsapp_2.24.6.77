package X;

/* renamed from: X.3F8  reason: invalid class name */
public final class AnonymousClass3F8 {
    public final C220412q A00;
    public final C26141Ja A01;
    public final C20810yC A02;
    public final AnonymousClass19A A03;
    public final AnonymousClass1GQ A04;
    public final C30131Zi A05;
    public final C19770wU A06;
    public volatile C28981Uw A07;
    public volatile Runnable A08;

    public final synchronized void A00() {
        this.A07 = null;
        Runnable runnable = this.A08;
        if (runnable != null) {
            this.A06.Bnx(runnable);
        }
        this.A08 = null;
    }

    public AnonymousClass3F8(C220412q r1, C26141Ja r2, C20810yC r3, AnonymousClass19A r4, AnonymousClass1GQ r5, C30131Zi r6, C19770wU r7) {
        C36321k7.A1B(r3, r7, r1, r4, r2);
        C36321k7.A10(r5, r6);
        this.A02 = r3;
        this.A06 = r7;
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
        this.A05 = r6;
    }
}
