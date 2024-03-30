package X;

/* renamed from: X.6Si  reason: invalid class name and case insensitive filesystem */
public final class C132146Si {
    public int A00;
    public Object[] A01;
    public Object[] A02;

    public C132146Si(int i) {
        this.A01 = new Object[16];
        this.A02 = new Object[16];
    }

    public final void A01(Object obj, Object obj2) {
        boolean z;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3 = this.A01;
        Object[] objArr4 = this.A02;
        int i = this.A00;
        int A002 = A00(this, obj);
        if (A002 >= 0) {
            objArr4[A002] = obj2;
            return;
        }
        int i2 = -(A002 + 1);
        if (i == objArr3.length) {
            z = true;
            objArr = new Object[(i * 2)];
        } else {
            z = false;
            objArr = objArr3;
        }
        int i3 = i2 + 1;
        System.arraycopy(objArr3, i2, objArr, i3, i - i2);
        if (z) {
            System.arraycopy(objArr3, 0, objArr, 0, i2);
        }
        objArr[i2] = obj;
        this.A01 = objArr;
        if (z) {
            objArr2 = new Object[(i * 2)];
        } else {
            objArr2 = objArr4;
        }
        AnonymousClass02Q.A05(objArr4, i3, objArr2, i2, i);
        if (z) {
            AnonymousClass02Q.A05(objArr4, 0, objArr2, 0, i2);
        }
        objArr2[i2] = obj2;
        this.A02 = objArr2;
        this.A00++;
    }

    public static final int A00(C132146Si r8, Object obj) {
        int i;
        int identityHashCode = System.identityHashCode(obj);
        int i2 = r8.A00;
        int i3 = i2 - 1;
        Object[] objArr = r8.A01;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            Object obj2 = objArr[i5];
            int identityHashCode2 = System.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i4 = i5 + 1;
            } else if (identityHashCode2 > identityHashCode) {
                i3 = i5 - 1;
            } else if (obj == obj2) {
                return i5;
            } else {
                int i6 = i5 - 1;
                while (-1 < i6) {
                    Object obj3 = objArr[i6];
                    if (obj3 != obj) {
                        if (System.identityHashCode(obj3) != identityHashCode) {
                            break;
                        }
                        i6--;
                    } else {
                        return i6;
                    }
                }
                while (true) {
                    i5++;
                    if (i5 >= i2) {
                        i = i2 + 1;
                        break;
                    }
                    Object obj4 = objArr[i5];
                    if (obj4 != obj) {
                        if (System.identityHashCode(obj4) != identityHashCode) {
                            i = i5 + 1;
                            break;
                        }
                    } else {
                        return i5;
                    }
                }
                return -i;
            }
        }
        return -(i4 + 1);
    }

    public C132146Si() {
        this(16);
    }
}
