package X;

/* renamed from: X.1iN  reason: invalid class name and case insensitive filesystem */
public class C35241iN implements Runnable {
    public int A00;
    public Object A01;
    public boolean A02;
    public final int A03;

    public C35241iN(Object obj, int i, int i2, boolean z) {
        this.A03 = i2;
        this.A01 = obj;
        this.A02 = z;
        this.A00 = i;
    }

    public final void run() {
        AnonymousClass5SK r0;
        if (this.A03 != 0) {
            C220012m r02 = (C220012m) this.A01;
            boolean z = this.A02;
            int i = this.A00;
            C21400zB r3 = r02.A02;
            r3.A00();
            for (AnonymousClass12M r1 : r02.getObservers()) {
                if (i != 15) {
                    if (i == 60) {
                        r0 = AnonymousClass5SK.HIGH;
                    } else if (i != 80) {
                        r0 = AnonymousClass5SK.MODERATE;
                    }
                    r1.Bjh(r0, z);
                }
                r0 = AnonymousClass5SK.CRITICAL;
                r1.Bjh(r0, z);
            }
            r3.A00();
            return;
        }
        C21020yX r12 = (C21020yX) this.A01;
        boolean z2 = this.A02;
        int i2 = this.A00;
        if (C21020yX.A0C(r12)) {
            ((C159447jN) r12.A09.get()).Bpi(r12.A03, i2, z2, false);
        }
    }
}
