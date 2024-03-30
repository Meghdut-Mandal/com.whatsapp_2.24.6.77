package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;

/* renamed from: X.75R  reason: invalid class name */
public final class AnonymousClass75R implements Collection<Object>, AnonymousClass00W {
    public final Set A00 = C36441kJ.A17();

    public boolean contains(Object obj) {
        return this.A00.contains(obj);
    }

    public boolean containsAll(Collection collection) {
        return this.A00.containsAll(collection);
    }

    public boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public Object[] toArray() {
        return C07390Xl.A00(this);
    }

    public Object[] toArray(Object[] objArr) {
        return C07390Xl.A01(this, objArr);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return this.A00.add(obj);
    }

    public final void clear() {
        this.A00.clear();
    }

    public Iterator iterator() {
        return this.A00.iterator();
    }

    public final boolean remove(Object obj) {
        return this.A00.remove(obj);
    }

    public final boolean removeAll(Collection collection) {
        return this.A00.remove(collection);
    }

    public final boolean retainAll(Collection collection) {
        return this.A00.retainAll(collection);
    }

    public final /* bridge */ int size() {
        return this.A00.size();
    }

    public /* synthetic */ AnonymousClass75R(Set set, C05250Oz r3, int i) {
    }

    public boolean addAll(Collection collection) {
        throw AnonymousClass000.A0x();
    }

    public boolean removeIf(Predicate predicate) {
        throw AnonymousClass000.A0x();
    }

    public AnonymousClass75R() {
    }
}
