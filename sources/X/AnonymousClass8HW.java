package X;

import com.google.common.collect.ForwardingQueue;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Objects;
import java.util.Queue;

/* renamed from: X.8HW  reason: invalid class name */
public final class AnonymousClass8HW<E> extends ForwardingQueue<E> implements Serializable, Serializable {
    public static final long serialVersionUID = 0;
    public final Queue delegate;
    public final int maxSize;

    public AnonymousClass8HW(int i) {
        this();
        this.delegate = new ArrayDeque(10);
        this.maxSize = 10;
    }

    public static AnonymousClass8HW create(int i) {
        return new AnonymousClass8HW(10);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.8HW, X.8HX] */
    public boolean add(Object obj) {
        Objects.requireNonNull(obj);
        if (this.maxSize != 0) {
            if (size() == this.maxSize) {
                this.delegate.remove();
            }
            this.delegate.add(obj);
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Collection, X.8HW, X.8HX] */
    public boolean addAll(Collection collection) {
        int size = collection.size();
        if (size < this.maxSize) {
            return standardAddAll(collection);
        }
        clear();
        return C200359hH.addAll(this, C200359hH.skip(collection, size - this.maxSize));
    }

    public Object element() {
        return delegate().element();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.8HW, X.8HX] */
    public boolean offer(Object obj) {
        return add(obj);
    }

    public Object peek() {
        return delegate().peek();
    }

    public Object poll() {
        return delegate().poll();
    }

    public Object remove() {
        return delegate().remove();
    }

    public AnonymousClass8HW() {
    }

    public Queue delegate() {
        return this.delegate;
    }
}
