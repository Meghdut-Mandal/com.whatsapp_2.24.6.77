package X;

import java.util.Random;

/* renamed from: X.2tT  reason: invalid class name */
public abstract class AnonymousClass2tT {
    public static final int A00(C220412q r6, C20810yC r7, AnonymousClass3T1 r8) {
        C44072La r1;
        C36321k7.A0x(r6, r7);
        C65073Qp A09 = r6.A09(r8.A1J.A00, false);
        if ((A09 instanceof C44072La) && (r1 = (C44072La) A09) != null) {
            long j = r1.A07;
            if (j > 1) {
                return new Random().nextInt((int) (Math.log10((double) j) * ((double) r7.A07(4369))));
            }
        }
        return 0;
    }
}
