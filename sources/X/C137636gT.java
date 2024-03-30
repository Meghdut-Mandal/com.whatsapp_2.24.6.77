package X;

import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6gT  reason: invalid class name and case insensitive filesystem */
public final class C137636gT implements C157697dx {
    public final AnonymousClass00S A00;

    public C160287kl BPh(C161717nM r12, List list, long j) {
        List list2 = (List) this.A00.invoke();
        ArrayList arrayList = null;
        if (list2 != null) {
            arrayList = C36361kB.A0r(list2);
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass6QC r8 = (AnonymousClass6QC) list2.get(i);
                if (r8 != null) {
                    float f = r8.A02;
                    float f2 = r8.A01;
                    float f3 = r8.A00;
                    float f4 = r8.A03;
                    C90494aF.A1F(((C161687nJ) list.get(i)).BPj(C132746Vb.A00(0, (int) ((float) Math.floor((double) (f - f2))), 0, (int) ((float) Math.floor((double) (f3 - f4))))), new AnonymousClass6TU(C90484aE.A0J(C14960mT.A01(f2), C14960mT.A01(f4))), arrayList);
                }
            }
        }
        return C90474aD.A0M(r12, new C154117Qy(arrayList), Constraints.A01(j), Constraints.A00(j));
    }

    public C137636gT(AnonymousClass00S r1) {
        this.A00 = r1;
    }
}
