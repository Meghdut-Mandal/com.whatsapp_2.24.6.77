package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.5Z9  reason: invalid class name */
public abstract class AnonymousClass5Z9 {
    public static C140456lc A00(C157187by r16, C159157iu r17, C140456lc r18) {
        int i;
        int i2;
        C159157iu r3 = r17;
        C140456lc r15 = r18;
        C140456lc B1D = r3.B1D(r16, r15);
        boolean A01 = AnonymousClass6Qn.A01(B1D);
        boolean A02 = AnonymousClass6Qn.A02(B1D);
        HashSet A16 = C36441kJ.A16();
        if (AnonymousClass6Qn.A02(B1D)) {
            AnonymousClass000.A1F(A16, B1D.A03);
        }
        int[] A012 = AnonymousClass6NR.A01().A01(B1D.A04);
        for (int i3 = 0; i3 < A012.length; i3++) {
            C140456lc A0W = B1D.A0W(A012[i3]);
            if (A0W != null) {
                C140456lc A00 = A00(B1D.A01, r3, A0W);
                if (A00 != A0W) {
                    if (B1D == r15) {
                        int i4 = r15.A03;
                        B1D = new C140456lc(r15.A01, r15, (C140456lc) null, r15.A08, i4);
                    }
                    B1D.A05.put(A012[i3], A00);
                }
                int i5 = A00.A00;
                boolean z = true;
                if ((i5 & 1) == 0) {
                    z = false;
                }
                A01 |= z;
                A02 |= AnonymousClass000.A1P(i5 & 2);
                Set set = A00.A02;
                if (set == null) {
                    set = Collections.emptySet();
                }
                if (!set.isEmpty()) {
                    A16.addAll(set);
                }
            }
        }
        int[] A002 = AnonymousClass6NR.A01().A00(B1D.A04);
        for (int i6 = 0; i6 < A002.length; i6++) {
            List A0c = B1D.A0c(A002[i6]);
            List list = A0c;
            for (int i7 = 0; i7 < A0c.size(); i7++) {
                C140456lc A0K = C90504aG.A0K(A0c, i7);
                if (A0K != null) {
                    C140456lc A003 = A00(B1D.A01, r3, A0K);
                    if (A003 != A0K) {
                        if (list == A0c) {
                            list = C36441kJ.A15(A0c);
                        }
                        list.set(i7, A003);
                    }
                    int i8 = A003.A00;
                    boolean z2 = true;
                    if ((i8 & 1) == 0) {
                        z2 = false;
                    }
                    A01 |= z2;
                    A02 |= AnonymousClass000.A1P(i8 & 2);
                    Set set2 = A003.A02;
                    if (set2 == null) {
                        set2 = Collections.emptySet();
                    }
                    if (!set2.isEmpty()) {
                        A16.addAll(set2);
                    }
                }
            }
            if (list != A0c) {
                if (B1D == r15) {
                    int i9 = r15.A03;
                    B1D = new C140456lc(r15.A01, r15, (C140456lc) null, r15.A08, i9);
                }
                B1D.A05.put(A002[i6], list);
            }
        }
        if (B1D != r15) {
            int i10 = B1D.A00;
            if (A01) {
                i = i10 | 1;
            } else {
                i = i10 & -2;
            }
            B1D.A00 = i;
            if (A02) {
                i2 = i | 2;
            } else {
                i2 = i & -3;
            }
            B1D.A00 = i2;
            if (A16.isEmpty()) {
                A16 = null;
            }
            B1D.A02 = A16;
        }
        r3.Bjy(B1D);
        return B1D;
    }
}
