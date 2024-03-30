package X;

import java.util.Objects;

/* renamed from: X.7r6  reason: invalid class name and case insensitive filesystem */
public class C163997r6 implements C160107kT {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public final void BW7(C133136Wx r9, C129166Fp r10) {
        C19770wU r5;
        Runnable r4;
        if (this.A03 == 0) {
            C199099eh r3 = (C199099eh) this.A00;
            Object obj = this.A01;
            Object obj2 = this.A02;
            C36321k7.A0y(obj, r9);
            if (r9.A03()) {
                r5 = r3.A0E;
                r4 = new C1502474n(obj, r3, obj2, 11);
            } else {
                return;
            }
        } else if (!r9.A03()) {
            Object obj3 = this.A01;
            r5 = ((AnonymousClass6WD) this.A00).A0P;
            Objects.requireNonNull(obj3);
            r4 = new C80213v2(obj3, 14);
        } else {
            ((AnonymousClass6WD) this.A00).A0P.Boy(new C1503474x(this.A02, (Object) this, (Object) r10, this.A01, 26));
            return;
        }
        r5.Boy(r4);
    }

    public C163997r6(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj3;
        this.A02 = obj2;
    }

    public /* synthetic */ void BW4(long j) {
    }

    public /* synthetic */ void BW6(boolean z) {
    }
}
