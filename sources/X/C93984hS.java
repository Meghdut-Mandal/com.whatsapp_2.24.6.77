package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.4hS  reason: invalid class name and case insensitive filesystem */
public final class C93984hS extends C128396Cc implements Iterator, AnonymousClass00W {
    public Object next() {
        Map.Entry entry = this.A02;
        if (entry != null) {
            A00();
            return entry.getValue();
        }
        throw new IllegalStateException();
    }

    public C93984hS(C1506676d r1, Iterator it) {
        super(r1, it);
    }
}
