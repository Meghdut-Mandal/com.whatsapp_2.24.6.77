package X;

import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.8nt  reason: invalid class name and case insensitive filesystem */
public abstract class C181698nt extends C181748ny {
    public C181698nt(C64933Qa r7, int i, long j) {
        super(r7, (C207209uj) null, i, j);
    }

    public final List A1g(int i) {
        List list = this.A00;
        ArrayList A13 = C36411kG.A13(list);
        for (Object next : list) {
            if (((C195869Wj) next).A00 == 2) {
                A13.add(next);
            }
        }
        List<C195869Wj> A0a = C007103b.A0a(C007103b.A0c(A13, new C23178B8m(5)), i);
        ArrayList A0J = C36321k7.A0J(A0a);
        for (C195869Wj r0 : A0a) {
            GroupJid groupJid = r0.A02;
            String str = r0.A03;
            if (str == null) {
                str = "";
            }
            C165587tf.A1A(groupJid, str, A0J);
        }
        return A0J;
    }

    public final void A1h(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AnonymousClass3QK r0 = (AnonymousClass3QK) it.next();
            List list = this.A00;
            GroupJid groupJid = r0.A02;
            AnonymousClass00C.A08(groupJid);
            list.add(new C195869Wj(groupJid, r0.A04, 2, 0));
        }
    }
}
