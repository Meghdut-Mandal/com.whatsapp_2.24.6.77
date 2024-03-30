package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0ub  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C19230ub implements C19130uQ {
    public final Set A00;

    public C19230ub(Set set) {
        this.A00 = set;
    }

    public Object get() {
        Set<C19220ua> set = this.A00;
        HashSet hashSet = new HashSet();
        for (C19220ua r0 : set) {
            hashSet.add(r0.get());
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
