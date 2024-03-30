package X;

import java.util.Comparator;

/* renamed from: X.75b  reason: invalid class name and case insensitive filesystem */
public final class C1503875b implements Comparator {
    public static final C1503875b A00 = new C1503875b();

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C94214hq r8 = (C94214hq) obj;
        C94214hq r9 = (C94214hq) obj2;
        if (r8 == null) {
            throw AnonymousClass001.A08("compare requires non-null focus targets");
        } else if (r9 != null) {
            boolean A03 = AnonymousClass6U1.A03(r8);
            int i = 0;
            boolean A032 = AnonymousClass6U1.A03(r9);
            if (A03) {
                if (!A032) {
                    return -1;
                }
                C137846gp A02 = AnonymousClass6VZ.A02(r8);
                C137846gp A022 = AnonymousClass6VZ.A02(r9);
                if (AnonymousClass00C.A0J(A02, A022)) {
                    return 0;
                }
                C1506776e A023 = C1506776e.A02(new C137846gp[16]);
                while (A02 != null) {
                    A023.A09(0, A02);
                    A02 = A02.A0A();
                }
                C1506776e A024 = C1506776e.A02(new C137846gp[16]);
                while (A022 != null) {
                    A024.A09(0, A022);
                    A022 = A022.A0A();
                }
                int min = Math.min(A023.A00 - 1, A024.A00 - 1);
                if (min >= 0) {
                    while (AnonymousClass00C.A0J(A023.A01[i], A024.A01[i])) {
                        if (i != min) {
                            i++;
                        }
                    }
                    return AnonymousClass00C.A00(((C137846gp) A023.A01[i]).A0P.A0G.A03, ((C137846gp) A024.A01[i]).A0P.A0G.A03);
                }
                throw AnonymousClass001.A09("Could not find a common ancestor between the two FocusModifiers.");
            } else if (!A032) {
                return 0;
            } else {
                return 1;
            }
        } else {
            throw AnonymousClass001.A08("compare requires non-null focus targets");
        }
    }
}
