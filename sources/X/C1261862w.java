package X;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: X.62w  reason: invalid class name and case insensitive filesystem */
public final class C1261862w {
    public final C19970wo A00;
    public final AnonymousClass1VC A01;
    public final AnonymousClass1VE A02;

    public final long A00() {
        long A0B = C36441kJ.A0B(this.A01.A01, 3302);
        if (A0B <= -1) {
            return 0;
        }
        return new Date().getTime() - TimeUnit.MILLISECONDS.convert(A0B, TimeUnit.DAYS);
    }

    public C1261862w(C19970wo r1, AnonymousClass1VC r2, AnonymousClass1VE r3) {
        C36321k7.A11(r2, r3, r1);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
