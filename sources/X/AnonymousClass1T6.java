package X;

import java.util.Arrays;

/* renamed from: X.1T6  reason: invalid class name */
public final class AnonymousClass1T6 {
    public final C20810yC A00;
    public final C19630wG A01;

    public AnonymousClass1T6(C19630wG r2, C20810yC r3) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        this.A00 = r3;
        this.A01 = r2;
    }

    public final String A00(int i, int i2, Object... objArr) {
        String A02;
        boolean A012 = C20800yB.A01(C21000yV.A02, this.A00, 5846);
        C19630wG r1 = this.A01;
        Object[] copyOf = Arrays.copyOf(objArr, 1);
        if (A012) {
            A02 = r1.A02(i2, copyOf);
        } else {
            A02 = r1.A02(i, copyOf);
        }
        AnonymousClass00C.A0B(A02);
        return A02;
    }
}
