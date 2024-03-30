package X;

import java.util.Collection;
import java.util.Comparator;

/* renamed from: X.8Hg  reason: invalid class name */
public final class AnonymousClass8Hg extends AnonymousClass9TU {
    public AnonymousClass8Hi build() {
        return AnonymousClass8Hi.fromMapEntries(this.builderMap.entrySet(), (Comparator) null);
    }

    public Collection newMutableValueCollection() {
        return C201739kJ.preservesInsertionOrderOnAddsSet();
    }

    public AnonymousClass8Hg put(Object obj, Object obj2) {
        super.put(obj, obj2);
        return this;
    }
}
