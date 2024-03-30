package X;

import java.util.List;
import java.util.ListIterator;

/* renamed from: X.76a  reason: invalid class name and case insensitive filesystem */
public final class C1506376a implements ListIterator, AnonymousClass00W {
    public int A00;
    public final List A01;

    public void add(Object obj) {
        this.A01.add(this.A00, obj);
        this.A00++;
    }

    public boolean hasNext() {
        return AnonymousClass000.A1T(this.A00, this.A01.size());
    }

    public boolean hasPrevious() {
        return AnonymousClass000.A1R(this.A00);
    }

    public Object next() {
        List list = this.A01;
        int i = this.A00;
        this.A00 = i + 1;
        return list.get(i);
    }

    public Object previous() {
        int i = this.A00 - 1;
        this.A00 = i;
        return this.A01.get(i);
    }

    public int previousIndex() {
        return this.A00 - 1;
    }

    public void remove() {
        int i = this.A00 - 1;
        this.A00 = i;
        this.A01.remove(i);
    }

    public void set(Object obj) {
        this.A01.set(this.A00, obj);
    }

    public C1506376a(List list, int i) {
        this.A01 = list;
        this.A00 = i;
    }

    public int nextIndex() {
        return this.A00;
    }
}
