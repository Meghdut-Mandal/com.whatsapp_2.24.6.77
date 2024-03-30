package X;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

/* renamed from: X.8Dv  reason: invalid class name and case insensitive filesystem */
public final class C170538Dv extends C21884AcA<Integer> implements C23121B6b<Integer>, C16030oR, RandomAccess {
    public static final C170538Dv A02;
    public int A00;
    public int[] A01;

    static {
        C170538Dv r0 = new C170538Dv(new int[0], 0);
        A02 = r0;
        r0.A00 = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C170538Dv)) {
                return super.equals(obj);
            }
            C170538Dv r8 = (C170538Dv) obj;
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

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.A00; i2++) {
            i = (i * 31) + this.A01[i2];
        }
        return i;
    }

    public static final void A00(C170538Dv r1, int i) {
        if (i < 0 || i >= r1.A00) {
            throw C165617ti.A0W(C165567td.A0Z(C90524aI.A0h(35), i, r1.A00));
        }
    }

    public final /* synthetic */ C23121B6b ByB(int i) {
        if (i >= this.A00) {
            return new C170538Dv(Arrays.copyOf(this.A01, i), this.A00);
        }
        throw C165617ti.A0U();
    }

    public final int indexOf(Object obj) {
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

    public C170538Dv(int[] iArr, int i) {
        this.A01 = iArr;
        this.A00 = i;
    }

    public final void A02(int i) {
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

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int A0I = AnonymousClass000.A0I(obj);
        A01();
        if (i < 0 || i > (i2 = this.A00)) {
            throw C165617ti.A0W(C165567td.A0Z(C90524aI.A0h(35), i, this.A00));
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

    public final boolean addAll(Collection collection) {
        A01();
        Charset charset = C197089b7.A00;
        Objects.requireNonNull(collection);
        if (!(collection instanceof C170538Dv)) {
            return super.addAll(collection);
        }
        C170538Dv r7 = (C170538Dv) collection;
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

    public final boolean contains(Object obj) {
        return C36381kD.A1U(indexOf(obj), -1);
    }

    public final /* synthetic */ Object get(int i) {
        A00(this, i);
        return Integer.valueOf(this.A01[i]);
    }

    public final /* synthetic */ Object remove(int i) {
        A01();
        A00(this, i);
        int[] iArr = this.A01;
        int i2 = iArr[i];
        C165567td.A1J(iArr, this.A00, i);
        this.A00--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final void removeRange(int i, int i2) {
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

    public final /* synthetic */ Object set(int i, Object obj) {
        int A0I = AnonymousClass000.A0I(obj);
        A01();
        A00(this, i);
        int[] iArr = this.A01;
        int i2 = iArr[i];
        iArr[i] = A0I;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.A00;
    }

    public C170538Dv() {
        this(new int[10], 0);
    }

    public final /* synthetic */ boolean add(Object obj) {
        A02(AnonymousClass000.A0I(obj));
        return true;
    }
}
