package X;

import java.io.InputStream;

/* renamed from: X.54q  reason: invalid class name and case insensitive filesystem */
public final class C1032754q extends AnonymousClass5RE {
    public final AnonymousClass1W5 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1032754q(C20050ww r3, AnonymousClass1W5 r4, InputStream inputStream, Integer num) {
        super(r3, inputStream, num, 1);
        C36321k7.A0v(inputStream, 1, r3);
        AnonymousClass00C.A0D(r4, 5);
        this.A00 = r4;
    }

    public void A01(int i) {
        super.A01(i);
        this.A00.A02 += (long) i;
    }

    public void A02(long j) {
        super.A02(j);
        this.A00.A02 += j;
    }
}
