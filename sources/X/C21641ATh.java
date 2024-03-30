package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ATh  reason: case insensitive filesystem */
public final class C21641ATh implements B0B {
    public final C19730wQ A00;
    public final AnonymousClass1KK A01;
    public final C20810yC A02;

    public static final boolean A00(C207109uZ r4) {
        C206699tp r0 = r4.A01;
        if (r0 == null) {
            return false;
        }
        List list = r0.A02;
        ArrayList A0I = AnonymousClass001.A0I();
        for (Object next : list) {
            if (((C206539tZ) next).A00.equals("critical")) {
                A0I.add(next);
            }
        }
        return C36401kF.A1a(A0I);
    }

    public boolean B1C(C193229Kn r8, C16540pP r9, C87374On r10) {
        C188078z0 r2;
        C188078z0 r0;
        AnonymousClass1KK r1 = this.A01;
        C19730wQ r6 = this.A00;
        C207109uZ A07 = r1.A07(C36441kJ.A0n(r6));
        if (A07 != null) {
            C206699tp r22 = A07.A01;
            String str = null;
            if (r22 != null) {
                str = r22.A01;
            }
            if (str != null && str.equals("non_eligibile")) {
                r2 = C188078z0.NON_ELIGIBLE;
            } else if (A00(A07)) {
                r2 = C188078z0.NON_SEARCHABLE;
            } else {
                if (!A00(A07) && r22 != null) {
                    List list = r22.A02;
                    ArrayList A0I = AnonymousClass001.A0I();
                    for (Object next : list) {
                        if (((C206539tZ) next).A00.equals("warning")) {
                            A0I.add(next);
                        }
                    }
                    if (C36401kF.A1a(A0I) && !C53342rA.A00(r6, A07)) {
                        r2 = C188078z0.SEARCHABLE;
                    }
                }
                r2 = C188078z0.COMPLETE;
            }
            if (this.A02.A0E(7046)) {
                r0 = C188078z0.SEARCHABLE;
            } else {
                r0 = C188078z0.NON_SEARCHABLE;
            }
            if (r2.compareTo(r0) < 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C21641ATh(C19730wQ r1, AnonymousClass1KK r2, C20810yC r3) {
        C36321k7.A11(r2, r1, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
