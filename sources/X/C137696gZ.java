package X;

import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6gZ  reason: invalid class name and case insensitive filesystem */
public final class C137696gZ implements C157697dx {
    public static final C137696gZ A00 = new C137696gZ();

    public final C160287kl BPh(C161717nM r5, List list, long j) {
        ArrayList A0r = C36361kB.A0r(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            A0r.add(((C161687nJ) list.get(i)).BPj(j));
        }
        return C90474aD.A0M(r5, new C154097Qw(A0r), Constraints.A01(j), Constraints.A00(j));
    }
}
