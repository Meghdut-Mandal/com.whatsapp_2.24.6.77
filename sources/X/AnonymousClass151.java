package X;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* renamed from: X.151  reason: invalid class name */
public class AnonymousClass151 implements Iterator {
    public Iterator iterator = C225414v.emptyIterator();
    public Deque metaIterators;
    public Iterator toRemove;
    public Iterator topMetaIterator;

    private Iterator getTopMetaIterator() {
        while (true) {
            Iterator it = this.topMetaIterator;
            if (it != null && it.hasNext()) {
                return this.topMetaIterator;
            }
            Deque deque = this.metaIterators;
            if (deque == null || deque.isEmpty()) {
                return null;
            }
            this.topMetaIterator = (Iterator) this.metaIterators.removeFirst();
        }
    }

    public boolean hasNext() {
        while (true) {
            Iterator it = this.iterator;
            Objects.requireNonNull(it);
            if (it.hasNext()) {
                return true;
            }
            Iterator topMetaIterator2 = getTopMetaIterator();
            this.topMetaIterator = topMetaIterator2;
            if (topMetaIterator2 == null) {
                return false;
            }
            Iterator it2 = (Iterator) topMetaIterator2.next();
            this.iterator = it2;
            if (it2 instanceof AnonymousClass151) {
                AnonymousClass151 r2 = (AnonymousClass151) it2;
                this.iterator = r2.iterator;
                Deque deque = this.metaIterators;
                if (deque == null) {
                    deque = new ArrayDeque();
                    this.metaIterators = deque;
                }
                deque.addFirst(this.topMetaIterator);
                if (r2.metaIterators != null) {
                    while (!r2.metaIterators.isEmpty()) {
                        this.metaIterators.addFirst(r2.metaIterators.removeLast());
                    }
                }
                this.topMetaIterator = r2.topMetaIterator;
            }
        }
    }

    public void remove() {
        Iterator it = this.toRemove;
        if (it != null) {
            it.remove();
            this.toRemove = null;
            return;
        }
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }

    public AnonymousClass151(Iterator it) {
        Objects.requireNonNull(it);
        this.topMetaIterator = it;
    }

    public Object next() {
        if (hasNext()) {
            Iterator it = this.iterator;
            this.toRemove = it;
            return it.next();
        }
        throw new NoSuchElementException();
    }
}
