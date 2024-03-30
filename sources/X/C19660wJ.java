package X;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.0wJ  reason: invalid class name and case insensitive filesystem */
public class C19660wJ implements Iterable {
    public final ConcurrentLinkedQueue A00 = new ConcurrentLinkedQueue();
    public final AnonymousClass005 A01;

    public Iterator iterator() {
        return C225414v.unmodifiableIterator(C225414v.concat(((Set) this.A01.get()).iterator(), this.A00.iterator()));
    }

    public C19660wJ(AnonymousClass005 r2) {
        this.A01 = r2;
    }
}
