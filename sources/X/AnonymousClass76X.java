package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* renamed from: X.76X  reason: invalid class name */
public final class AnonymousClass76X implements List<C137856gq>, AnonymousClass00W {
    public int A00 = -1;
    public int A01;
    public long[] A02 = new long[16];
    public Object[] A03 = new Object[16];

    public final void clear() {
        this.A00 = -1;
        A01(this);
    }

    public Iterator iterator() {
        return new C1506476b(this, 0, 0, size());
    }

    public ListIterator listIterator(int i) {
        return new C1506476b(this, i, 0, size());
    }

    public Object[] toArray() {
        return C07390Xl.A00(this);
    }

    public Object[] toArray(Object[] objArr) {
        return C07390Xl.A01(this, objArr);
    }

    public static final long A00(AnonymousClass76X r7) {
        long floatToIntBits = 0 | (((long) Float.floatToIntBits(Float.POSITIVE_INFINITY)) << 32);
        int i = r7.A00 + 1;
        int size = r7.size() - 1;
        if (i <= size) {
            while (true) {
                long j = r7.A02[i];
                if (C109215Ws.A00(j, floatToIntBits) < 0) {
                    floatToIntBits = j;
                }
                if ((C90464aC.A01(floatToIntBits) < 0.0f && C90474aD.A03(floatToIntBits) != 0) || i == size) {
                    break;
                }
                i++;
            }
        }
        return floatToIntBits;
    }

    public static final void A01(AnonymousClass76X r5) {
        int i = r5.A00 + 1;
        int i2 = i;
        int size = r5.size() - 1;
        if (i <= size) {
            while (true) {
                r5.A03[i] = null;
                if (i == size) {
                    break;
                }
                i++;
            }
        }
        r5.A01 = i2;
    }

    public final void A02(C137856gq r8, AnonymousClass00S r9, float f, boolean z) {
        int i = this.A00;
        int i2 = i + 1;
        this.A00 = i2;
        Object[] objArr = this.A03;
        int length = objArr.length;
        if (i2 >= length) {
            int i3 = length + 16;
            this.A03 = AnonymousClass00C.A0K(objArr, i3);
            long[] copyOf = Arrays.copyOf(this.A02, i3);
            AnonymousClass00C.A08(copyOf);
            this.A02 = copyOf;
        }
        Object[] objArr2 = this.A03;
        int i4 = this.A00;
        objArr2[i4] = r8;
        this.A02[i4] = C90474aD.A0C((long) Float.floatToIntBits(f), C90474aD.A09(z ? 1 : 0));
        A01(this);
        r9.invoke();
        this.A00 = i;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C137856gq)) {
            return false;
        }
        return C36381kD.A1U(indexOf(obj), -1);
    }

    public /* bridge */ /* synthetic */ Object get(int i) {
        Object obj = this.A03[i];
        AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return obj;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C137856gq) {
            int size = size() - 1;
            int i = 0;
            if (size >= 0) {
                while (!AnonymousClass00C.A0J(this.A03[i], obj)) {
                    int i2 = i;
                    i++;
                    if (i2 == size) {
                    }
                }
                return i;
            }
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C137856gq) {
            for (int size = size() - 1; -1 < size; size--) {
                if (AnonymousClass00C.A0J(this.A03[size], obj)) {
                    return size;
                }
            }
        }
        return -1;
    }

    public List subList(int i, int i2) {
        return new AnonymousClass76W(this, i, i2);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw AnonymousClass000.A0x();
    }

    public boolean addAll(Collection collection) {
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

    public final /* bridge */ int size() {
        return this.A01;
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
        return new C1506476b(this, 0, 0, size());
    }

    public boolean remove(Object obj) {
        throw AnonymousClass000.A0x();
    }
}
