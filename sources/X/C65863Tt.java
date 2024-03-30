package X;

import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.3Tt  reason: invalid class name and case insensitive filesystem */
public class C65863Tt implements AnonymousClass004 {
    public Object A00;
    public Object A01;
    public final int A02;

    public C65863Tt(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final Object get() {
        if (this.A02 != 0) {
            List list = (List) ((AnonymousClass38I) this.A00).A03.get();
            Set set = (Set) ((AnonymousClass004) this.A01).get();
            ArrayList A0r = C36361kB.A0r(list);
            for (Object next : list) {
                if (!set.contains(next)) {
                    A0r.add(next);
                }
            }
            return A0r;
        }
        Collator A0p = C36361kB.A0p((C18820ts) this.A01);
        A0p.setDecomposition(1);
        return A0p;
    }
}
