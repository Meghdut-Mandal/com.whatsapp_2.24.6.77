package X;

import java.util.Arrays;
import java.util.Set;

/* renamed from: X.0Mh  reason: invalid class name and case insensitive filesystem */
public abstract class C04860Mh extends C13310jf implements Set {
    public transient AnonymousClass0MZ A00;

    public static int A02(int i) {
        int i2;
        int max = Math.max(i, 2);
        if (max < 751619276) {
            i2 = Integer.highestOneBit(max - 1);
            do {
                i2 += i2;
            } while (((double) i2) * 0.7d < ((double) max));
        } else {
            i2 = 1073741824;
            if (max >= 1073741824) {
                throw AnonymousClass001.A08("collection too large");
            }
        }
        return i2;
    }

    public static C04860Mh A03(Object[] objArr, int i) {
        int i2 = i;
        Object[] objArr2 = objArr;
        if (i == 0) {
            return C04850Mg.A05;
        }
        if (i != 1) {
            int A02 = A02(i);
            Object[] objArr3 = new Object[A02];
            int i3 = A02 - 1;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (i4 < i2) {
                Object obj = objArr2[i4];
                if (obj != null) {
                    int hashCode = obj.hashCode();
                    int rotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) hashCode) * -862048943), 15)) * 461845907);
                    while (true) {
                        int i7 = rotateLeft & i3;
                        Object obj2 = objArr3[i7];
                        if (obj2 != null) {
                            if (obj2.equals(obj)) {
                                break;
                            }
                            rotateLeft++;
                        } else {
                            objArr2[i6] = obj;
                            objArr3[i7] = obj;
                            i5 += hashCode;
                            i6++;
                            break;
                        }
                    }
                    i4++;
                } else {
                    throw AnonymousClass001.A0A(AnonymousClass000.A0r("at index ", AnonymousClass000.A0u(), i4));
                }
            }
            Arrays.fill(objArr2, i6, i2, (Object) null);
            if (i6 != 1) {
                if (A02(i6) < A02 / 2) {
                    return A03(objArr2, i6);
                }
                if (i6 <= 0) {
                    objArr2 = Arrays.copyOf(objArr2, i6);
                }
                return new C04850Mg(objArr2, i5, objArr3, i3, i6);
            }
        }
        Object obj3 = objArr2[0];
        obj3.getClass();
        return new C04830Me(obj3);
    }

    public boolean A0B() {
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C04860Mh) && A0B() && ((C04860Mh) obj).A0B() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    public AnonymousClass0MZ A0A() {
        AnonymousClass0MZ r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass0MZ A09 = A09();
        this.A00 = A09;
        return A09;
    }

    public AnonymousClass0MZ A09() {
        Object[] array = toArray();
        int length = array.length;
        C04930Mo r0 = AnonymousClass0MZ.A00;
        if (length == 0) {
            return AnonymousClass0MY.A02;
        }
        return new AnonymousClass0MY(array, length);
    }

    public int hashCode() {
        int i = 0;
        for (Object A0J : this) {
            i += AnonymousClass000.A0J(A0J);
        }
        return i;
    }
}
