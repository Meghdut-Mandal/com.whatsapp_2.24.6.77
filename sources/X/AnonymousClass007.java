package X;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: X.007  reason: invalid class name */
public class AnonymousClass007 {
    public int A00;
    public int[] A01;
    public Object[] A02;

    public Object A04(int i) {
        if (i >= 0 && i < this.A00) {
            return this.A02[i << 1];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected index to be within 0..size()-1, but was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public Object A05(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.A00)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected index to be within 0..size()-1, but was ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        Object[] objArr = this.A02;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.A01;
        int length = iArr.length;
        int i5 = 8;
        if (length <= 8 || i2 >= length / 3) {
            if (i < i4) {
                int i6 = i + 1;
                int i7 = i4 + 1;
                System.arraycopy(iArr, i6, iArr, i, i7 - i6);
                Object[] objArr2 = this.A02;
                AnonymousClass02Q.A05(objArr2, i3, objArr2, i6 << 1, i7 << 1);
            }
            Object[] objArr3 = this.A02;
            int i8 = i4 << 1;
            objArr3[i8] = null;
            objArr3[i8 + 1] = null;
        } else {
            if (i2 > 8) {
                i5 = i2 + (i2 >> 1);
            }
            int[] copyOf = Arrays.copyOf(iArr, i5);
            AnonymousClass00C.A08(copyOf);
            this.A01 = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.A02, i5 << 1);
            AnonymousClass00C.A08(copyOf2);
            this.A02 = copyOf2;
            if (i2 == this.A00) {
                if (i > 0) {
                    AnonymousClass02Q.A03(0, 0, i, iArr, this.A01);
                    AnonymousClass02Q.A05(objArr, 0, this.A02, 0, i3);
                }
                if (i < i4) {
                    int i9 = i + 1;
                    int i10 = i4 + 1;
                    AnonymousClass02Q.A03(i, i9, i10, iArr, this.A01);
                    AnonymousClass02Q.A05(objArr, i3, this.A02, i9 << 1, i10 << 1);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i2 == this.A00) {
            this.A00 = i4;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    public Object A06(int i) {
        if (i >= 0 && i < this.A00) {
            return this.A02[(i << 1) + 1];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected index to be within 0..size()-1, but was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public Object A07(int i, Object obj) {
        if (i < 0 || i >= this.A00) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected index to be within 0..size()-1, but was ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.A02;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public void A09(AnonymousClass007 r6) {
        int i = r6.A00;
        A08(this.A00 + i);
        if (this.A00 != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(r6.A04(i2), r6.A06(i2));
            }
        } else if (i > 0) {
            AnonymousClass02Q.A03(0, 0, i, r6.A01, this.A01);
            AnonymousClass02Q.A05(r6.A02, 0, this.A02, 0, i << 1);
            this.A00 = i;
        }
    }

    public boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            try {
                if (obj instanceof AnonymousClass007) {
                    AnonymousClass007 r8 = (AnonymousClass007) obj;
                    if (size() == r8.size()) {
                        int i = this.A00;
                        int i2 = 0;
                        while (i2 < i) {
                            Object A04 = A04(i2);
                            Object A06 = A06(i2);
                            Object obj2 = r8.get(A04);
                            if (A06 != null) {
                                equals = A06.equals(obj2);
                            } else if (obj2 == null) {
                                equals = r8.containsKey(A04);
                            }
                            if (equals) {
                                i2++;
                            }
                        }
                    }
                } else {
                    if (obj instanceof Map) {
                        Map map = (Map) obj;
                        if (size() == map.size()) {
                            int i3 = this.A00;
                            for (int i4 = 0; i4 < i3; i4++) {
                                Object A042 = A04(i4);
                                Object A062 = A06(i4);
                                Object obj3 = map.get(A042);
                                if (A062 == null) {
                                    if (obj3 == null) {
                                        if (!map.containsKey(A042)) {
                                            return false;
                                        }
                                    }
                                } else if (!A062.equals(obj3)) {
                                    return false;
                                }
                            }
                        }
                    }
                    return false;
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return true;
    }

    private final int A00() {
        int i = this.A00;
        if (i == 0) {
            return -1;
        }
        int A002 = AnonymousClass009.A00(this.A01, i, 0);
        if (A002 >= 0) {
            Object[] objArr = this.A02;
            if (objArr[A002 << 1] != null) {
                int i2 = A002 + 1;
                while (i2 < i && this.A01[i2] == 0) {
                    if (objArr[i2 << 1] == null) {
                        return i2;
                    }
                    i2++;
                }
                do {
                    A002--;
                    if (A002 < 0 || this.A01[A002] != 0) {
                        return ~i2;
                    }
                } while (objArr[A002 << 1] != null);
                return A002;
            }
        }
        return A002;
    }

    public static final int A01(AnonymousClass007 r5, Object obj, int i) {
        int i2 = r5.A00;
        if (i2 == 0) {
            return -1;
        }
        int A002 = AnonymousClass009.A00(r5.A01, i2, i);
        if (A002 < 0 || obj.equals(r5.A02[A002 << 1])) {
            return A002;
        }
        int i3 = A002 + 1;
        while (i3 < i2 && r5.A01[i3] == i) {
            if (obj.equals(r5.A02[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        do {
            A002--;
            if (A002 < 0 || r5.A01[A002] != i) {
                return ~i3;
            }
        } while (!obj.equals(r5.A02[A002 << 1]));
        return A002;
    }

    public int A02(Object obj) {
        if (obj == null) {
            return A00();
        }
        return A01(this, obj, obj.hashCode());
    }

    public final int A03(Object obj) {
        int i = this.A00 * 2;
        Object[] objArr = this.A02;
        int i2 = 1;
        if (obj == null) {
            while (i2 < i) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
                i2 += 2;
            }
            return -1;
        }
        while (i2 < i) {
            if (obj.equals(objArr[i2])) {
                return i2 >> 1;
            }
            i2 += 2;
        }
        return -1;
    }

    public void A08(int i) {
        int i2 = this.A00;
        int[] iArr = this.A01;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, i);
            AnonymousClass00C.A08(copyOf);
            this.A01 = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.A02, i * 2);
            AnonymousClass00C.A08(copyOf2);
            this.A02 = copyOf2;
        }
        if (this.A00 != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        if (this.A00 > 0) {
            this.A01 = AnonymousClass009.A00;
            this.A02 = AnonymousClass009.A02;
            this.A00 = 0;
        }
    }

    public int hashCode() {
        int i;
        int[] iArr = this.A01;
        Object[] objArr = this.A02;
        int i2 = this.A00;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            int i6 = iArr[i4];
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i5 += i ^ i6;
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public boolean isEmpty() {
        if (this.A00 <= 0) {
            return true;
        }
        return false;
    }

    public Object put(Object obj, Object obj2) {
        int i;
        int A002;
        int i2 = this.A00;
        if (obj != null) {
            i = obj.hashCode();
            A002 = A01(this, obj, i);
        } else {
            i = 0;
            A002 = A00();
        }
        if (A002 >= 0) {
            int i3 = (A002 << 1) + 1;
            Object[] objArr = this.A02;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = ~A002;
        int[] iArr = this.A01;
        if (i2 >= iArr.length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            int[] copyOf = Arrays.copyOf(iArr, i5);
            AnonymousClass00C.A08(copyOf);
            this.A01 = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.A02, i5 << 1);
            AnonymousClass00C.A08(copyOf2);
            this.A02 = copyOf2;
            if (i2 != this.A00) {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i2) {
            int[] iArr2 = this.A01;
            int i6 = i4 + 1;
            AnonymousClass02Q.A03(i6, i4, i2, iArr2, iArr2);
            Object[] objArr2 = this.A02;
            AnonymousClass02Q.A05(objArr2, i6 << 1, objArr2, i4 << 1, this.A00 << 1);
        }
        int i7 = this.A00;
        if (i2 == i7) {
            int[] iArr3 = this.A01;
            if (i4 < iArr3.length) {
                iArr3[i4] = i;
                Object[] objArr3 = this.A02;
                int i8 = i4 << 1;
                objArr3[i8] = obj;
                objArr3[i8 + 1] = obj2;
                this.A00 = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public AnonymousClass007(int i) {
        int[] iArr;
        Object[] objArr;
        if (i == 0) {
            iArr = AnonymousClass009.A00;
        } else {
            iArr = new int[i];
        }
        this.A01 = iArr;
        if (i == 0) {
            objArr = AnonymousClass009.A02;
        } else {
            objArr = new Object[(i << 1)];
        }
        this.A02 = objArr;
    }

    public boolean containsKey(Object obj) {
        if (A02(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (A03(obj) >= 0) {
            return true;
        }
        return false;
    }

    public Object get(Object obj) {
        int A022 = A02(obj);
        if (A022 >= 0) {
            return this.A02[(A022 << 1) + 1];
        }
        return null;
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int A022 = A02(obj);
        if (A022 >= 0) {
            return this.A02[(A022 << 1) + 1];
        }
        return obj2;
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 == null) {
            return put(obj, obj2);
        }
        return obj3;
    }

    public boolean remove(Object obj, Object obj2) {
        int A022 = A02(obj);
        if (A022 < 0 || !AnonymousClass00C.A0J(obj2, A06(A022))) {
            return false;
        }
        A05(A022);
        return true;
    }

    public Object replace(Object obj, Object obj2) {
        int A022 = A02(obj);
        if (A022 >= 0) {
            return A07(A022, obj2);
        }
        return null;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        int i = this.A00;
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object A04 = A04(i2);
            if (A04 != sb) {
                sb.append(A04);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object A06 = A06(i2);
            if (A06 != sb) {
                sb.append(A06);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String obj = sb.toString();
        AnonymousClass00C.A08(obj);
        return obj;
    }

    public int size() {
        return this.A00;
    }

    public AnonymousClass007() {
        this(0);
    }

    public Object remove(Object obj) {
        int A022 = A02(obj);
        if (A022 >= 0) {
            return A05(A022);
        }
        return null;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int A022 = A02(obj);
        if (A022 < 0 || !AnonymousClass00C.A0J(obj2, A06(A022))) {
            return false;
        }
        A07(A022, obj3);
        return true;
    }
}
