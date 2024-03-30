package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* renamed from: X.75Q  reason: invalid class name */
public final class AnonymousClass75Q implements Collection<AnonymousClass68T>, AnonymousClass00W {
    public final int A00;
    public final List A01;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass75Q) && AnonymousClass00C.A0J(this.A01, ((AnonymousClass75Q) obj).A01));
    }

    public Object[] toArray() {
        return C07390Xl.A00(this);
    }

    public Object[] toArray(Object[] objArr) {
        return C07390Xl.A01(this, objArr);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof AnonymousClass68T)) {
            return false;
        }
        return this.A01.contains(obj);
    }

    public boolean containsAll(Collection collection) {
        return this.A01.containsAll(collection);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    public boolean isEmpty() {
        return this.A01.isEmpty();
    }

    public Iterator iterator() {
        return this.A01.iterator();
    }

    public AnonymousClass75Q(List list) {
        this.A01 = list;
        this.A00 = list.size();
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw AnonymousClass000.A0x();
    }

    public boolean addAll(Collection collection) {
        throw AnonymousClass000.A0x();
    }

    public void clear() {
        throw AnonymousClass000.A0x();
    }

    public boolean remove(Object obj) {
        throw AnonymousClass000.A0x();
    }

    public boolean removeAll(Collection collection) {
        throw AnonymousClass000.A0x();
    }

    public boolean removeIf(Predicate predicate) {
        throw AnonymousClass000.A0x();
    }

    public boolean retainAll(Collection collection) {
        throw AnonymousClass000.A0x();
    }

    public final /* bridge */ int size() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LocaleList(localeList=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
