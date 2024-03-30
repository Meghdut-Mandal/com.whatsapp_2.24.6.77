package X;

import java.util.List;

/* renamed from: X.5WH  reason: invalid class name */
public abstract class AnonymousClass5WH {
    public static final C1509977p A00(C161337ma r7, Object obj, int i) {
        C1509977p r6;
        r7.Bum(Integer.rotateLeft(i, 1));
        Object BnZ = r7.BnZ();
        if (BnZ == C129736Ig.A00) {
            r6 = new C1509977p(i, obj, true);
            r7.Bwv(r6);
        } else {
            AnonymousClass00C.A0E(BnZ, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            r6 = (C1509977p) BnZ;
            if (!AnonymousClass00C.A0J(r6.A01, obj)) {
                r6.A01 = obj;
                if (r6.A04) {
                    AnonymousClass7bI r2 = r6.A00;
                    if (r2 != null) {
                        C136976fO r22 = (C136976fO) r2;
                        C158797iF r1 = r22.A05;
                        if (r1 != null) {
                            r1.BKq(r22, (Object) null);
                        }
                        r6.A00 = null;
                    }
                    List list = r6.A02;
                    if (list != null) {
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            C136976fO r23 = (C136976fO) ((AnonymousClass7bI) list.get(i2));
                            C158797iF r12 = r23.A05;
                            if (r12 != null) {
                                r12.BKq(r23, (Object) null);
                            }
                        }
                        list.clear();
                    }
                }
            }
        }
        C136916fF.A0N(r7);
        return r6;
    }
}
