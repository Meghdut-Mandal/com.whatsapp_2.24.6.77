package X;

/* renamed from: X.3EP  reason: invalid class name */
public final class AnonymousClass3EP {
    public long A00 = -1;
    public long A01 = -1;
    public final AnonymousClass1JN A02;
    public final C19970wo A03;
    public final C19770wU A04;

    public final void A00(AnonymousClass3T1 r13, int i) {
        if (i == 0) {
            if (this.A01 == -1 && this.A00 == -1) {
                this.A01 = System.currentTimeMillis();
            }
        } else if (i == 8) {
            long j = this.A01;
            if (j != -1 && this.A00 == -1) {
                long currentTimeMillis = System.currentTimeMillis();
                this.A00 = currentTimeMillis;
                this.A04.Boy(new AnonymousClass735(this, r13, 3, currentTimeMillis - j));
                this.A01 = -1;
                this.A00 = -1;
            }
        }
    }

    public AnonymousClass3EP(C19970wo r3, AnonymousClass1JN r4, C19770wU r5) {
        C36321k7.A11(r3, r5, r4);
        this.A03 = r3;
        this.A04 = r5;
        this.A02 = r4;
    }
}
