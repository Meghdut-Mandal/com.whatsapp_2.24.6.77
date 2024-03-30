package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: X.0y7  reason: invalid class name and case insensitive filesystem */
public abstract class C20760y7<E> extends C20750y6<E> implements Set<E> {
    public transient C23931Ak asList;

    public static int chooseTableSize(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) max)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        if (z) {
            return 1073741824;
        }
        throw new IllegalArgumentException(String.valueOf("collection too large"));
    }

    public static C20760y7 construct(int i, Object... objArr) {
        Object[] objArr2 = objArr;
        if (i == 0) {
            return of();
        }
        if (i != 1) {
            int chooseTableSize = chooseTableSize(i);
            Object[] objArr3 = new Object[chooseTableSize];
            int i2 = chooseTableSize - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj = objArr[i5];
                C23921Aj.checkElementNotNull(obj, i5);
                int hashCode = obj.hashCode();
                int smear = C20770y8.smear(hashCode);
                while (true) {
                    int i6 = smear & i2;
                    Object obj2 = objArr3[i6];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        smear++;
                    } else {
                        objArr[i4] = obj;
                        objArr3[i6] = obj;
                        i3 += hashCode;
                        i4++;
                        break;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                return new C25891Ib(obj3);
            } else if (chooseTableSize(i4) < chooseTableSize / 2) {
                return construct(i4, objArr);
            } else {
                if (shouldTrim(i4, objArr.length)) {
                    objArr2 = Arrays.copyOf(objArr, i4);
                }
                return new AnonymousClass18W(objArr2, i3, objArr3, i2, i4);
            }
        } else {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return of(obj4);
        }
    }

    public static C20760y7 copyOf(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return of();
        }
        if (length != 1) {
            return construct(length, (Object[]) objArr.clone());
        }
        return of(objArr[0]);
    }

    public static C20760y7 of(Object obj, Object obj2, Object obj3) {
        return construct(3, obj, obj2, obj3);
    }

    public static boolean shouldTrim(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public boolean isHashCodeFast() {
        return false;
    }

    public static C227315o builder() {
        return new C227315o();
    }

    public static C227315o builderWithExpectedSize(int i) {
        C20080wz.checkNonnegative(i, "expectedSize");
        return new C227315o(i);
    }

    public C23931Ak asList() {
        C23931Ak r0 = this.asList;
        if (r0 != null) {
            return r0;
        }
        C23931Ak createAsList = createAsList();
        this.asList = createAsList;
        return createAsList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C20760y7) || !isHashCodeFast() || !((C20760y7) obj).isHashCodeFast() || hashCode() == obj.hashCode()) {
            return AnonymousClass6X9.equalsImpl(this, obj);
        }
        return false;
    }

    public C23931Ak createAsList() {
        return C23931Ak.asImmutableList(toArray());
    }

    public int hashCode() {
        return AnonymousClass6X9.hashCodeImpl(this);
    }

    public Object writeReplace() {
        return new AnonymousClass72H(toArray());
    }

    public static C20760y7 copyOf(Collection collection) {
        if ((collection instanceof C20760y7) && !(collection instanceof SortedSet)) {
            C20760y7 r1 = (C20760y7) collection;
            if (!r1.isPartialView()) {
                return r1;
            }
        }
        Object[] array = collection.toArray();
        return construct(array.length, array);
    }

    public static C20760y7 of(Object obj, Object obj2) {
        return construct(2, obj, obj2);
    }

    public static C20760y7 of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        int length = objArr.length;
        int i = length + 6;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return construct(i, objArr2);
    }

    public static C20760y7 of(Object obj, Object obj2, Object obj3, Object obj4) {
        return construct(4, obj, obj2, obj3, obj4);
    }

    public static C20760y7 of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return construct(5, obj, obj2, obj3, obj4, obj5);
    }

    public static C20760y7 of(Object obj) {
        return new C25891Ib(obj);
    }

    public static C20760y7 of() {
        return AnonymousClass18W.EMPTY;
    }
}
