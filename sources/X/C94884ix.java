package X;

import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4ix  reason: invalid class name and case insensitive filesystem */
public final class C94884ix extends C137626gS {
    public static final C94884ix A00 = new C94884ix();

    public C160287kl BPh(C161717nM r8, List list, long j) {
        int A06;
        int A05;
        C006302t r0;
        if (list.isEmpty()) {
            A06 = Constraints.A03(j);
            A05 = Constraints.A02(j);
            r0 = AnonymousClass7WT.A00;
        } else {
            if (list.size() == 1) {
                AnonymousClass6Q4 BPj = ((C161687nJ) list.get(0)).BPj(j);
                A06 = Constraints.A06(j, BPj.A01);
                A05 = Constraints.A05(j, BPj.A00);
                r0 = new AnonymousClass7RR(BPj);
            } else {
                ArrayList A0r = C36361kB.A0r(list);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    A0r.add(((C161687nJ) list.get(i)).BPj(j));
                }
                int size2 = A0r.size();
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < size2; i4++) {
                    AnonymousClass6Q4 r1 = (AnonymousClass6Q4) A0r.get(i4);
                    i2 = Math.max(r1.A01, i2);
                    i3 = Math.max(r1.A00, i3);
                }
                return C90474aD.A0M(r8, new AnonymousClass7RS(A0r), Constraints.A06(j, i2), Constraints.A05(j, i3));
            }
        }
        return C90474aD.A0M(r8, r0, A06, A05);
    }
}
