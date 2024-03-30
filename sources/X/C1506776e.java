package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.76e  reason: invalid class name and case insensitive filesystem */
public final class C1506776e implements RandomAccess {
    public int A00 = 0;
    public Object[] A01;
    public List A02;

    public C1506776e(Object[] objArr) {
        this.A01 = objArr;
    }

    public static C137856gq A03(C1506776e r1, int i) {
        return (C137856gq) r1.A04(i - 1);
    }

    public static C1506776e A01() {
        return new C1506776e(new C137856gq[16]);
    }

    public static C1506776e A02(Object[] objArr) {
        return new C1506776e(objArr);
    }

    public final Object A04(int i) {
        Object[] objArr = this.A01;
        Object obj = objArr[i];
        int i2 = this.A00;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.A00 - 1;
        this.A00 = i4;
        objArr[i4] = null;
        return obj;
    }

    public final List A05() {
        List list = this.A02;
        if (list != null) {
            return list;
        }
        AnonymousClass76Y r0 = new AnonymousClass76Y(this);
        this.A02 = r0;
        return r0;
    }

    public final void A06() {
        Object[] objArr = this.A01;
        int i = this.A00;
        while (true) {
            i--;
            if (-1 < i) {
                objArr[i] = null;
            } else {
                this.A00 = 0;
                return;
            }
        }
    }

    public final void A07(int i) {
        Object[] objArr = this.A01;
        int length = objArr.length;
        if (length < i) {
            this.A01 = AnonymousClass00C.A0K(objArr, Math.max(i, length * 2));
        }
    }

    public final void A08(int i, int i2) {
        if (i2 > i) {
            int i3 = this.A00;
            if (i2 < i3) {
                Object[] objArr = this.A01;
                AnonymousClass02Q.A05(objArr, i, objArr, i2, i3);
            }
            int i4 = this.A00;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.A01[i7] = null;
                    if (i7 == i6) {
                        break;
                    }
                    i7++;
                }
            }
            this.A00 = i5;
        }
    }

    public final void A09(int i, Object obj) {
        A07(this.A00 + 1);
        Object[] objArr = this.A01;
        int i2 = this.A00;
        if (i != i2) {
            AnonymousClass02Q.A05(objArr, i + 1, objArr, i, i2);
        }
        objArr[i] = obj;
        this.A00++;
    }

    public final void A0A(C1506776e r5, int i) {
        int i2 = r5.A00;
        if (i2 != 0) {
            A07(this.A00 + i2);
            Object[] objArr = this.A01;
            int i3 = this.A00;
            if (i != i3) {
                AnonymousClass02Q.A05(objArr, r5.A00 + i, objArr, i, i3);
            }
            AnonymousClass02Q.A05(r5.A01, i, objArr, 0, r5.A00);
            this.A00 += r5.A00;
        }
    }

    public final void A0B(Comparator comparator) {
        Arrays.sort(this.A01, 0, this.A00, comparator);
    }

    public final boolean A0D(Object obj) {
        A07(this.A00 + 1);
        Object[] objArr = this.A01;
        int i = this.A00;
        objArr[i] = obj;
        this.A00 = i + 1;
        return true;
    }

    public final boolean A0E(Object obj) {
        int i = this.A00 - 1;
        if (i >= 0) {
            int i2 = 0;
            while (!AnonymousClass00C.A0J(this.A01[i2], obj)) {
                if (i2 != i) {
                    i2++;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean A0F(Object obj) {
        int i = this.A00;
        if (i <= 0) {
            return false;
        }
        int i2 = 0;
        Object[] objArr = this.A01;
        while (!AnonymousClass00C.A0J(obj, objArr[i2])) {
            i2++;
            if (i2 >= i) {
                return false;
            }
        }
        if (i2 < 0) {
            return false;
        }
        A04(i2);
        return true;
    }

    public static int A00(C1506776e r0) {
        return r0.A05().size();
    }

    public final boolean A0C(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        A07(this.A00 + collection.size());
        Object[] objArr = this.A01;
        if (i != this.A00) {
            AnonymousClass02Q.A05(objArr, collection.size() + i, objArr, i, this.A00);
        }
        for (Object next : collection) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                throw C36351kA.A0v();
            }
            objArr[i2 + i] = next;
            i2 = i3;
        }
        this.A00 += collection.size();
        return true;
    }
}
