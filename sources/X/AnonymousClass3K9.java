package X;

/* renamed from: X.3K9  reason: invalid class name */
public final class AnonymousClass3K9 {
    public final C29841Ye A00;
    public final AnonymousClass1ST A01;
    public final C29641Xk A02;
    public final C19770wU A03;
    public final AnonymousClass00T A04 = C36431kI.A1I(new AnonymousClass4CI(this));
    public final AnonymousClass1GQ A05;

    public final void A00() {
        if (this.A05.A00.A0E(6508)) {
            ((C19930wk) this.A04.getValue()).A02();
        }
    }

    public final void A01(C596934x r5) {
        AnonymousClass4GY r3 = new AnonymousClass4GY(this, r5);
        if (this.A05.A00.A0E(6508)) {
            C19930wk r2 = (C19930wk) this.A04.getValue();
            r2.A02();
            r2.execute(new C1503074t((Object) r3, 22));
            return;
        }
        r3.invoke();
    }

    public final void A02(AnonymousClass3T1 r3) {
        if (r3 instanceof AnonymousClass2bU) {
            AnonymousClass2bU r1 = (AnonymousClass2bU) r3;
            if (C54732tQ.A00(r1)) {
                this.A00.A02(r1);
                return;
            }
        }
        AnonymousClass3L1 r0 = r3.A0a;
        if (r0 != null && !r0.A09) {
            this.A02.A01(r3, 1);
        }
    }

    public AnonymousClass3K9(C29841Ye r2, AnonymousClass1ST r3, C29641Xk r4, AnonymousClass1GQ r5, C19770wU r6) {
        C36321k7.A1B(r5, r6, r2, r3, r4);
        this.A05 = r5;
        this.A03 = r6;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }
}
