package X;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

/* renamed from: X.8I0  reason: invalid class name */
public final class AnonymousClass8I0 extends C21886AcE<Integer> implements B62, RandomAccess, C16130of {
    public static final AnonymousClass8I0 A02;
    public int A00;
    public int[] A01;

    static {
        AnonymousClass8I0 r0 = new AnonymousClass8I0(new int[0], 0);
        A02 = r0;
        r0.A00 = false;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnonymousClass8I0)) {
                return super.equals(obj);
            }
            AnonymousClass8I0 r8 = (AnonymousClass8I0) obj;
            int i = this.A00;
            if (i == r8.A00) {
                int[] iArr = r8.A01;
                int i2 = 0;
                while (i2 < i) {
                    if (this.A01[i2] == iArr[i2]) {
                        i2++;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.A00; i2++) {
            i = (i * 31) + this.A01[i2];
        }
        return i;
    }

    public static void A00(AnonymousClass8I0 r2, int i) {
        if (i < 0 || i >= r2.A00) {
            throw C165617ti.A0W(C36381kD.A10(C165587tf.A0i(i), r2.A00));
        }
    }

    public /* bridge */ /* synthetic */ C23122B6c BQ1(int i) {
        if (i >= this.A00) {
            return new AnonymousClass8I0(Arrays.copyOf(this.A01, i), this.A00);
        }
        throw C165617ti.A0U();
    }

    public int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int A0I = AnonymousClass000.A0I(obj);
            int size = size();
            for (int i = 0; i < size; i++) {
                if (this.A01[i] == A0I) {
                    return i;
                }
            }
        }
        return -1;
    }

    public AnonymousClass8I0(int[] iArr, int i) {
        this.A01 = iArr;
        this.A00 = i;
    }

    public void B0O(int i) {
        A01();
        int i2 = this.A00;
        int[] iArr = this.A01;
        if (i2 == iArr.length) {
            iArr = C165597tg.A1X(iArr, i2 * 3, i2);
            this.A01 = iArr;
        }
        int i3 = this.A00;
        this.A00 = i3 + 1;
        iArr[i3] = i;
    }

    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        int A0I = AnonymousClass000.A0I(obj);
        A01();
        if (i < 0 || i > (i2 = this.A00)) {
            throw C165617ti.A0W(C36381kD.A10(C165587tf.A0i(i), this.A00));
        }
        int[] iArr = this.A01;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] A1X = C165597tg.A1X(iArr, i2 * 3, i);
            System.arraycopy(this.A01, i, A1X, i + 1, this.A00 - i);
            this.A01 = A1X;
        }
        this.A01[i] = A0I;
        this.A00++;
        this.modCount++;
    }

    public boolean addAll(Collection collection) {
        A01();
        Charset charset = AnonymousClass9BD.A04;
        Objects.requireNonNull(collection);
        if (!(collection instanceof AnonymousClass8I0)) {
            return super.addAll(collection);
        }
        AnonymousClass8I0 r7 = (AnonymousClass8I0) collection;
        int i = r7.A00;
        if (i == 0) {
            return false;
        }
        int i2 = this.A00;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.A01;
            if (i3 > iArr.length) {
                iArr = Arrays.copyOf(iArr, i3);
                this.A01 = iArr;
            }
            System.arraycopy(r7.A01, 0, iArr, this.A00, r7.A00);
            this.A00 = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean contains(Object obj) {
        return C36381kD.A1U(indexOf(obj), -1);
    }

    public /* bridge */ /* synthetic */ Object get(int i) {
        A00(this, i);
        return Integer.valueOf(this.A01[i]);
    }

    public /* bridge */ /* synthetic */ Object remove(int i) {
        A01();
        A00(this, i);
        int[] iArr = this.A01;
        int i2 = iArr[i];
        C165567td.A1J(iArr, this.A00, i);
        this.A00--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public void removeRange(int i, int i2) {
        A01();
        if (i2 >= i) {
            int[] iArr = this.A01;
            System.arraycopy(iArr, i2, iArr, i, this.A00 - i2);
            this.A00 -= i2 - i;
            this.modCount++;
            return;
        }
        throw C165617ti.A0W("toIndex < fromIndex");
    }

    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int A0I = AnonymousClass000.A0I(obj);
        A01();
        A00(this, i);
        int[] iArr = this.A01;
        int i2 = iArr[i];
        iArr[i] = A0I;
        return Integer.valueOf(i2);
    }

    public int size() {
        return this.A00;
    }

    public AnonymousClass8I0() {
        this(new int[10], 0);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        B0O(AnonymousClass000.A0I(obj));
        return true;
    }
}
