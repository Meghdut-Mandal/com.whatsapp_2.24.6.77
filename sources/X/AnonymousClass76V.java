package X;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* renamed from: X.76V  reason: invalid class name */
public final class AnonymousClass76V implements List<AnonymousClass7bE>, AnonymousClass00W {
    public final List A00 = new AYG();

    public boolean containsAll(Collection collection) {
        return this.A00.containsAll(collection);
    }

    public boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public Iterator iterator() {
        return this.A00.iterator();
    }

    public ListIterator listIterator() {
        return this.A00.listIterator();
    }

    public ListIterator listIterator(int i) {
        return this.A00.listIterator(i);
    }

    public List subList(int i, int i2) {
        return this.A00.subList(i, i2);
    }

    public Object[] toArray() {
        return C07390Xl.A00(this);
    }

    public Object[] toArray(Object[] objArr) {
        return C07390Xl.A01(this, objArr);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof AnonymousClass7bE)) {
            return false;
        }
        return this.A00.contains(obj);
    }

    public /* bridge */ /* synthetic */ Object get(int i) {
        return this.A00.get(i);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof AnonymousClass7bE)) {
            return -1;
        }
        return this.A00.indexOf(obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof AnonymousClass7bE)) {
            return -1;
        }
        return this.A00.lastIndexOf(obj);
    }

    public final /* bridge */ int size() {
        return this.A00.size();
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

    public /* bridge */ /* synthetic */ Object remove(int i) {
        throw AnonymousClass000.A0x();
    }

    public boolean removeAll(Collection collection) {
        throw AnonymousClass000.A0x();
    }

    public void replaceAll(UnaryOperator unaryOperator) {
        throw AnonymousClass000.A0x();
    }

    public boolean retainAll(Collection collection) {
        throw AnonymousClass000.A0x();
    }

    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw AnonymousClass000.A0x();
    }

    public void sort(Comparator comparator) {
        throw AnonymousClass000.A0x();
    }

    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw AnonymousClass000.A0x();
    }

    public boolean addAll(int i, Collection collection) {
        throw AnonymousClass000.A0x();
    }

    public boolean remove(Object obj) {
        throw AnonymousClass000.A0x();
    }
}
