package X;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* renamed from: X.76W  reason: invalid class name */
public final class AnonymousClass76W implements List<C137856gq>, AnonymousClass00W {
    public final int A00;
    public final int A01;
    public final /* synthetic */ AnonymousClass76X A02;

    public Object[] toArray() {
        return C07390Xl.A00(this);
    }

    public Object[] toArray(Object[] objArr) {
        return C07390Xl.A01(this, objArr);
    }

    public AnonymousClass76W(AnonymousClass76X r1, int i, int i2) {
        this.A02 = r1;
        this.A01 = i;
        this.A00 = i2;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C137856gq)) {
            return false;
        }
        return C36381kD.A1U(indexOf(obj), -1);
    }

    public /* bridge */ /* synthetic */ Object get(int i) {
        Object obj = this.A02.A03[i + this.A01];
        AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return obj;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof C137856gq)) {
            return -1;
        }
        int i = this.A01;
        int i2 = i;
        int i3 = this.A00;
        if (i > i3) {
            return -1;
        }
        while (!AnonymousClass00C.A0J(this.A02.A03[i], obj)) {
            int i4 = i;
            i++;
            if (i4 == i3) {
                return -1;
            }
        }
        return i - i2;
    }

    public Iterator iterator() {
        AnonymousClass76X r3 = this.A02;
        int i = this.A01;
        return new C1506476b(r3, i, i, this.A00);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        int i;
        int i2;
        if (!(obj instanceof C137856gq) || (i2 = this.A01) > (i = this.A00)) {
            return -1;
        }
        while (!AnonymousClass00C.A0J(this.A02.A03[i], obj)) {
            int i3 = i;
            i--;
            if (i3 == i2) {
                return -1;
            }
        }
        return i - i2;
    }

    public ListIterator listIterator(int i) {
        AnonymousClass76X r3 = this.A02;
        int i2 = this.A01;
        return new C1506476b(r3, i + i2, i2, this.A00);
    }

    public final /* bridge */ int size() {
        return this.A00 - this.A01;
    }

    public List subList(int i, int i2) {
        AnonymousClass76X r2 = this.A02;
        int i3 = this.A01;
        return new AnonymousClass76W(r2, i + i3, i3 + i2);
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

    public boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1Q(size());
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

    public ListIterator listIterator() {
        AnonymousClass76X r3 = this.A02;
        int i = this.A01;
        return new C1506476b(r3, i, i, this.A00);
    }

    public boolean remove(Object obj) {
        throw AnonymousClass000.A0x();
    }
}
