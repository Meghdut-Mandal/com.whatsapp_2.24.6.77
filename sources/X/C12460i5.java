package X;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: X.0i5  reason: invalid class name and case insensitive filesystem */
public final class C12460i5<K, V> implements Map<K, V>, Serializable, C17930sJ {
    public static final C12460i5 A00;
    public C13550k3 entriesView;
    public int[] hashArray;
    public int hashShift;
    public boolean isReadOnly;
    public Object[] keysArray;
    public C13570k5 keysView;
    public int length;
    public int maxProbeDistance;
    public int modCount;
    public int[] presenceArray;
    public int size;
    public Object[] valuesArray;
    public C13520k0 valuesView;

    static {
        C12460i5 r1 = new C12460i5(0);
        r1.isReadOnly = true;
        A00 = r1;
    }

    public final boolean A06(Map.Entry entry) {
        AnonymousClass00C.A0D(entry, 0);
        int A002 = A00(entry.getKey(), this);
        if (A002 < 0) {
            return false;
        }
        Object[] objArr = this.valuesArray;
        AnonymousClass00C.A0B(objArr);
        return AnonymousClass00C.A0J(objArr[A002], entry.getValue());
    }

    public void putAll(Map map) {
        AnonymousClass00C.A0D(map, 0);
        A05();
        Set entrySet = map.entrySet();
        if (!entrySet.isEmpty()) {
            A01(entrySet.size());
            Iterator it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(it);
                int A04 = A04(A11.getKey());
                Object[] objArr = this.valuesArray;
                if (objArr == null) {
                    objArr = new Object[this.keysArray.length];
                    this.valuesArray = objArr;
                }
                if (A04 < 0) {
                    A04 = (-A04) - 1;
                    if (AnonymousClass00C.A0J(A11.getValue(), objArr[A04])) {
                    }
                }
                objArr[A04] = A11.getValue();
            }
        }
    }

    public C12460i5(int i) {
        if (i >= 0) {
            Object[] objArr = new Object[i];
            int[] iArr = new int[i];
            int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
            this.keysArray = objArr;
            this.valuesArray = null;
            this.presenceArray = iArr;
            this.hashArray = new int[highestOneBit];
            this.maxProbeDistance = 2;
            this.length = 0;
            this.hashShift = Integer.numberOfLeadingZeros(highestOneBit) + 1;
            return;
        }
        throw AnonymousClass001.A08("capacity must be non-negative.");
    }

    private final void A01(int i) {
        Object[] objArr;
        Object[] objArr2 = this.keysArray;
        int length2 = objArr2.length;
        int i2 = this.length;
        int i3 = length2 - i2;
        int size2 = i2 - size();
        if (i3 >= i || i3 + size2 < i || size2 < length2 / 4) {
            int i4 = i2 + i;
            if (i4 < 0) {
                throw new OutOfMemoryError();
            } else if (i4 > length2) {
                int A002 = AnonymousClass0YP.A00(length2, i4);
                this.keysArray = AnonymousClass00C.A0K(objArr2, A002);
                Object[] objArr3 = this.valuesArray;
                if (objArr3 != null) {
                    objArr = AnonymousClass00C.A0K(objArr3, A002);
                } else {
                    objArr = null;
                }
                this.valuesArray = objArr;
                int[] copyOf = Arrays.copyOf(this.presenceArray, A002);
                AnonymousClass00C.A08(copyOf);
                this.presenceArray = copyOf;
                if (A002 < 1) {
                    A002 = 1;
                }
                int highestOneBit = Integer.highestOneBit(A002 * 3);
                if (highestOneBit > this.hashArray.length) {
                    A02(highestOneBit);
                }
            }
        } else {
            A02(this.hashArray.length);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0069, code lost:
        r2[r4] = r6 + 1;
        r7.presenceArray[r6] = r4;
        r6 = r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A02(int r8) {
        /*
            r7 = this;
            int r0 = r7.modCount
            int r0 = r0 + 1
            r7.modCount = r0
            int r5 = r7.length
            int r0 = r7.size()
            if (r5 <= r0) goto L_0x0039
            java.lang.Object[] r4 = r7.valuesArray
            r3 = 0
            r2 = 0
        L_0x0012:
            if (r3 >= r5) goto L_0x002b
            int[] r0 = r7.presenceArray
            r0 = r0[r3]
            if (r0 < 0) goto L_0x0028
            java.lang.Object[] r1 = r7.keysArray
            r0 = r1[r3]
            r1[r2] = r0
            if (r4 == 0) goto L_0x0026
            r0 = r4[r3]
            r4[r2] = r0
        L_0x0026:
            int r2 = r2 + 1
        L_0x0028:
            int r3 = r3 + 1
            goto L_0x0012
        L_0x002b:
            java.lang.Object[] r0 = r7.keysArray
            X.C05580Qg.A00(r0, r2, r5)
            if (r4 == 0) goto L_0x0037
            int r0 = r7.length
            X.C05580Qg.A00(r4, r2, r0)
        L_0x0037:
            r7.length = r2
        L_0x0039:
            int[] r1 = r7.hashArray
            int r0 = r1.length
            r6 = 0
            if (r8 == r0) goto L_0x0087
            int[] r0 = new int[r8]
            r7.hashArray = r0
            int r0 = java.lang.Integer.numberOfLeadingZeros(r8)
            int r0 = r0 + 1
            r7.hashShift = r0
        L_0x004b:
            int r0 = r7.length
            if (r6 >= r0) goto L_0x008b
            int r5 = r6 + 1
            java.lang.Object[] r0 = r7.keysArray
            r0 = r0[r6]
            int r4 = X.AnonymousClass000.A0J(r0)
            r0 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r4 = r4 * r0
            int r0 = r7.hashShift
            int r4 = r4 >>> r0
            int r3 = r7.maxProbeDistance
        L_0x0062:
            int[] r2 = r7.hashArray
            r0 = r2[r4]
            r1 = 1
            if (r0 != 0) goto L_0x0073
            int r0 = r6 + 1
            r2[r4] = r0
            int[] r0 = r7.presenceArray
            r0[r6] = r4
            r6 = r5
            goto L_0x004b
        L_0x0073:
            int r3 = r3 + -1
            if (r3 >= 0) goto L_0x007e
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x007e:
            int r0 = r4 + -1
            if (r4 != 0) goto L_0x0085
            int r4 = r2.length
            int r4 = r4 - r1
            goto L_0x0062
        L_0x0085:
            r4 = r0
            goto L_0x0062
        L_0x0087:
            java.util.Arrays.fill(r1, r6, r0, r6)
            goto L_0x004b
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12460i5.A02(int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0039 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C12460i5 r12, int r13) {
        /*
            java.lang.Object[] r1 = r12.keysArray
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r0 = 0
            r1[r13] = r0
            int[] r0 = r12.presenceArray
            r11 = r0[r13]
            int r0 = r12.maxProbeDistance
            int r5 = r0 * 2
            int[] r9 = r12.hashArray
            int r8 = r9.length
            int r0 = r8 / 2
            if (r5 <= r0) goto L_0x0019
            r5 = r0
        L_0x0019:
            r10 = 0
            r6 = 0
            r7 = r11
        L_0x001c:
            int r1 = r11 + -1
            r0 = r11
            r11 = r1
            if (r0 != 0) goto L_0x0024
            int r11 = r8 + -1
        L_0x0024:
            int r6 = r6 + 1
            int r0 = r12.maxProbeDistance
            if (r6 > r0) goto L_0x0070
            r4 = r9[r11]
            if (r4 == 0) goto L_0x0070
            r3 = -1
            if (r4 >= 0) goto L_0x004f
            r9[r7] = r3
        L_0x0033:
            r7 = r11
            r6 = 0
        L_0x0035:
            int r5 = r5 + -1
            if (r5 >= 0) goto L_0x001c
            r9[r7] = r3
        L_0x003b:
            int[] r1 = r12.presenceArray
            r0 = -1
            r1[r13] = r0
            int r0 = r12.size()
            int r0 = r0 + -1
            r12.size = r0
            int r0 = r12.modCount
            int r0 = r0 + 1
            r12.modCount = r0
            return
        L_0x004f:
            java.lang.Object[] r0 = r12.keysArray
            int r2 = r4 + -1
            r0 = r0[r2]
            int r1 = X.AnonymousClass000.A0J(r0)
            r0 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r1 = r1 * r0
            int r0 = r12.hashShift
            int r1 = r1 >>> r0
            int r1 = r1 - r11
            int[] r9 = r12.hashArray
            int r8 = r9.length
            int r0 = r8 + -1
            r1 = r1 & r0
            if (r1 < r6) goto L_0x0035
            r9[r7] = r4
            int[] r0 = r12.presenceArray
            r0[r2] = r7
            goto L_0x0033
        L_0x0070:
            r9[r7] = r10
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12460i5.A03(X.0i5, int):void");
    }

    private final Object writeReplace() {
        if (this.isReadOnly) {
            return new C10750fA(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final void A05() {
        if (this.isReadOnly) {
            throw AnonymousClass001.A0D();
        }
    }

    public boolean containsValue(Object obj) {
        int i = this.length;
        while (true) {
            i--;
            if (i < 0) {
                return false;
            }
            if (this.presenceArray[i] >= 0) {
                Object[] objArr = this.valuesArray;
                AnonymousClass00C.A0B(objArr);
                if (AnonymousClass00C.A0J(objArr[i], obj)) {
                    return true;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Set, X.0k3] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.Set, X.0k3] */
    public final /* bridge */ Set entrySet() {
        ? r0 = this.entriesView;
        if (r0 != 0) {
            return r0;
        }
        ? r02 = new C13550k3(this);
        this.entriesView = r02;
        return r02;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Set entrySet = map.entrySet();
        AnonymousClass00C.A0D(entrySet, 0);
        for (Object next : entrySet) {
            if (next == null) {
                return false;
            }
            try {
                if (!A06((Map.Entry) next)) {
                    return false;
                }
            } catch (ClassCastException unused) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        C13650kD r5 = new C13650kD(this);
        int i = 0;
        while (r5.hasNext()) {
            int i2 = r5.A00;
            C12460i5 r1 = r5.A03;
            if (i2 < r1.length) {
                r5.A00 = i2 + 1;
                r5.A01 = i2;
                int i3 = 0;
                int A0J = AnonymousClass000.A0J(r1.keysArray[i2]);
                Object[] objArr = r1.valuesArray;
                AnonymousClass00C.A0B(objArr);
                Object obj = objArr[r5.A01];
                if (obj != null) {
                    i3 = obj.hashCode();
                }
                r5.A01();
                i += A0J ^ i3;
            } else {
                throw new NoSuchElementException();
            }
        }
        return i;
    }

    public final /* bridge */ Set keySet() {
        C13570k5 r0 = this.keysView;
        if (r0 != null) {
            return r0;
        }
        C13570k5 r02 = new C13570k5(this);
        this.keysView = r02;
        return r02;
    }

    public final /* bridge */ Collection values() {
        C13520k0 r0 = this.valuesView;
        if (r0 != null) {
            return r0;
        }
        C13520k0 r02 = new C13520k0(this);
        this.valuesView = r02;
        return r02;
    }

    public static final int A00(Object obj, C12460i5 r6) {
        int A0J = (AnonymousClass000.A0J(obj) * -1640531527) >>> r6.hashShift;
        int i = r6.maxProbeDistance;
        while (true) {
            int i2 = r6.hashArray[A0J];
            if (i2 != 0) {
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    if (AnonymousClass00C.A0J(r6.keysArray[i3], obj)) {
                        return i3;
                    }
                }
                i--;
                if (i < 0) {
                    break;
                }
                int i4 = A0J - 1;
                if (A0J == 0) {
                    A0J = r6.hashArray.length - 1;
                } else {
                    A0J = i4;
                }
            } else {
                break;
            }
        }
        return -1;
    }

    public final int A04(Object obj) {
        A05();
        while (true) {
            int A0J = (AnonymousClass000.A0J(obj) * -1640531527) >>> this.hashShift;
            int i = this.maxProbeDistance * 2;
            int length2 = this.hashArray.length / 2;
            if (i > length2) {
                i = length2;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.hashArray;
                int i3 = iArr[A0J];
                if (i3 <= 0) {
                    int i4 = this.length;
                    Object[] objArr = this.keysArray;
                    if (i4 >= objArr.length) {
                        A01(1);
                    } else {
                        int i5 = i4 + 1;
                        this.length = i5;
                        objArr[i4] = obj;
                        this.presenceArray[i4] = A0J;
                        iArr[A0J] = i5;
                        this.size = size() + 1;
                        this.modCount++;
                        if (i2 > this.maxProbeDistance) {
                            this.maxProbeDistance = i2;
                        }
                        return i4;
                    }
                } else if (AnonymousClass00C.A0J(this.keysArray[i3 - 1], obj)) {
                    return -i3;
                } else {
                    i2++;
                    if (i2 > i) {
                        A02(this.hashArray.length * 2);
                        break;
                    }
                    int i6 = A0J - 1;
                    if (A0J == 0) {
                        A0J = this.hashArray.length - 1;
                    } else {
                        A0J = i6;
                    }
                }
            }
        }
    }

    public void clear() {
        A05();
        C13590k7 A002 = new C15020mZ(0, this.length - 1).iterator();
        while (A002.hasNext()) {
            int A003 = A002.A00();
            int[] iArr = this.presenceArray;
            int i = iArr[A003];
            if (i >= 0) {
                this.hashArray[i] = 0;
                iArr[A003] = -1;
            }
        }
        C05580Qg.A00(this.keysArray, 0, this.length);
        Object[] objArr = this.valuesArray;
        if (objArr != null) {
            C05580Qg.A00(objArr, 0, this.length);
        }
        this.size = 0;
        this.length = 0;
        this.modCount++;
    }

    public boolean containsKey(Object obj) {
        if (A00(obj, this) >= 0) {
            return true;
        }
        return false;
    }

    public Object get(Object obj) {
        int A002 = A00(obj, this);
        if (A002 < 0) {
            return null;
        }
        Object[] objArr = this.valuesArray;
        AnonymousClass00C.A0B(objArr);
        return objArr[A002];
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1Q(size());
    }

    public Object put(Object obj, Object obj2) {
        A05();
        int A04 = A04(obj);
        Object[] objArr = this.valuesArray;
        if (objArr == null) {
            objArr = new Object[this.keysArray.length];
            this.valuesArray = objArr;
        }
        if (A04 < 0) {
            int i = (-A04) - 1;
            Object obj3 = objArr[i];
            objArr[i] = obj2;
            return obj3;
        }
        objArr[A04] = obj2;
        return null;
    }

    public Object remove(Object obj) {
        A05();
        int A002 = A00(obj, this);
        if (A002 < 0) {
            return null;
        }
        A03(this, A002);
        Object[] objArr = this.valuesArray;
        AnonymousClass00C.A0B(objArr);
        Object obj2 = objArr[A002];
        objArr[A002] = null;
        return obj2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        C13650kD r5 = new C13650kD(this);
        int i = 0;
        while (r5.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = r5.A00;
            C12460i5 r3 = r5.A03;
            if (i2 < r3.length) {
                r5.A00 = i2 + 1;
                r5.A01 = i2;
                Object obj = r3.keysArray[i2];
                if (obj == r3) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                Object[] objArr = r3.valuesArray;
                AnonymousClass00C.A0B(objArr);
                Object obj2 = objArr[r5.A01];
                if (obj2 == r3) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                r5.A01();
                i++;
            } else {
                throw new NoSuchElementException();
            }
        }
        String A0q = AnonymousClass000.A0q("}", sb);
        AnonymousClass00C.A08(A0q);
        return A0q;
    }

    public final /* bridge */ int size() {
        return this.size;
    }

    public C12460i5() {
        this(8);
    }
}
