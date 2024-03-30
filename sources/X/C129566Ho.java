package X;

import java.util.List;

/* renamed from: X.6Ho  reason: invalid class name and case insensitive filesystem */
public abstract class C129566Ho {
    public static final C161547n5 A00 = C93994hT.A00(C137076fY.A00, C36381kD.A0j(), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");

    public static final void A00(AnonymousClass6E5 r10, C128316Bt r11) {
        long j;
        boolean A1U = C90474aD.A1U(A00);
        boolean z = r10.A0C;
        if (A1U) {
            boolean z2 = r10.A0B;
            if (!z) {
                if (z2) {
                    r11.A01();
                }
            } else if (!z2) {
                j = r10.A0A;
                if (j - r11.A01 > 40) {
                    r11.A01();
                }
                r11.A01 = j;
                return;
            }
            List list = r10.A02;
            if (list == null) {
                list = C023409w.A00;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass62N r0 = (AnonymousClass62N) list.get(i);
                r11.A02(r0.A02, r0.A00);
            }
            j = r10.A0A;
            r11.A02(j, r10.A00);
            r11.A01 = j;
            return;
        }
        if (!z && r10.A0B) {
            r11.A00 = r10.A06;
            r11.A01();
        }
        long j2 = r10.A07;
        List list2 = r10.A02;
        if (list2 == null) {
            list2 = C023409w.A00;
        }
        int i2 = 0;
        int size2 = list2.size();
        while (i2 < size2) {
            AnonymousClass62N r9 = (AnonymousClass62N) list2.get(i2);
            long j3 = r9.A01;
            long A03 = C133206Xf.A03(r11.A00, C133206Xf.A02(j3, j2));
            r11.A00 = A03;
            r11.A02(r9.A02, A03);
            i2++;
            j2 = j3;
        }
        long A032 = C133206Xf.A03(r11.A00, C133206Xf.A02(r10.A06, j2));
        r11.A00 = A032;
        r11.A02(r10.A0A, A032);
    }
}
