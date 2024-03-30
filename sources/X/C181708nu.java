package X;

import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.8nu  reason: invalid class name and case insensitive filesystem */
public abstract class C181708nu extends C181748ny {
    public C181708nu(C64933Qa r7, int i, long j) {
        super(r7, (C207209uj) null, i, j);
    }

    public final HashSet A1g() {
        ArrayList A1e = A1e(2);
        ArrayList A0J = C36321k7.A0J(A1e);
        Iterator it = A1e.iterator();
        while (it.hasNext()) {
            C195869Wj r0 = (C195869Wj) it.next();
            GroupJid groupJid = r0.A02;
            String str = r0.A03;
            if (str == null) {
                str = "";
            }
            C165587tf.A1A(groupJid, str, A0J);
        }
        return C007103b.A0U(A0J);
    }

    public final void A1h(Set set) {
        ArrayList A0J = C36321k7.A0J(set);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AnonymousClass3QK r0 = (AnonymousClass3QK) it.next();
            GroupJid groupJid = r0.A02;
            AnonymousClass00C.A08(groupJid);
            A0J.add(new C195869Wj(groupJid, r0.A04, r0.A00, 0));
        }
        A1f(A0J);
    }
}
