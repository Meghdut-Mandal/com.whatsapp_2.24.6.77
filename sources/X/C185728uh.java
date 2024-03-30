package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.8uh  reason: invalid class name and case insensitive filesystem */
public class C185728uh extends C50492l0 implements C16390pA {
    public C185728uh(List list) {
        AnonymousClass6QB A0q = C36441kJ.A0q("sub_group_suggestion");
        if (C203539oF.A0Y(list, 1, 1000)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C592133b.A01(A0q, it);
            }
        }
        C592133b.A00(A0q, this);
    }

    public C185728uh(C185718ug r10, C185648uZ r11, C185648uZ r12, C185648uZ r13, C185648uZ r14, String str) {
        AnonymousClass6QB A0q = C36441kJ.A0q("sub_group_suggestion");
        C165587tf.A1C(A0q, r11);
        C165587tf.A1C(A0q, r12);
        C165587tf.A1C(A0q, r13);
        C165587tf.A1C(A0q, r14);
        AnonymousClass6QB A0q2 = C36441kJ.A0q("subject");
        if (C203539oF.A0P(str, 1, 65536, false)) {
            A0q2.A07(str);
        }
        C36361kB.A1H(A0q2, A0q);
        C165577te.A1G(A0q, r10);
        C592133b.A00(A0q, this);
    }
}
