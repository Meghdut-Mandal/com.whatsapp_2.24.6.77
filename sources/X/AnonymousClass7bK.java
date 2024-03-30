package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.7bK  reason: invalid class name */
public class AnonymousClass7bK implements C88224Rw {
    public Object A00;
    public final int A01;

    public AnonymousClass7bK(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Bhe(List list) {
        List list2;
        List list3;
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            C106665Kt r3 = (C106665Kt) obj;
            if (r3.A08 && (list3 = r3.A02) != null && !list3.isEmpty()) {
                Iterator it = r3.A02.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if ("loading-hash".equals(C90504aG.A0U(it).A0E)) {
                        List list4 = r3.A02;
                        if (list4 != null) {
                            r3.A06(list4);
                            return;
                        }
                    }
                }
            }
            r3.A06(list);
            return;
        }
        C106685Kv r32 = (C106685Kv) obj;
        if (r32.A0D && (list2 = r32.A06) != null && !list2.isEmpty()) {
            Iterator it2 = r32.A06.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if ("loading-hash".equals(C90504aG.A0U(it2).A0E)) {
                    List list5 = r32.A06;
                    if (list5 != null) {
                        r32.A06(list5);
                        return;
                    }
                }
            }
        }
        r32.A06(list);
    }
}
