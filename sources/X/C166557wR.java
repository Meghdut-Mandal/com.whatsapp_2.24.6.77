package X;

import java.util.ListIterator;

/* renamed from: X.7wR  reason: invalid class name and case insensitive filesystem */
public final class C166557wR<E> extends C21920Acq<E> implements B6U<E> {
    public final int A00;
    public final Object[] A01;
    public final Object[] A02;
    public final int A03;

    public B6U B0E(Object obj, int i) {
        int i2 = i;
        AnonymousClass9Yn.A01(i, size());
        Object obj2 = obj;
        if (i == size()) {
            return B0B(obj);
        }
        int size = (size() - 1) & -32;
        if (i >= size) {
            return A01(obj, this.A01, i - size);
        }
        AnonymousClass9BT r4 = new AnonymousClass9BT((Object) null);
        return A01(r4.A00, A03(r4, obj2, this.A01, this.A00, i2), 0);
    }

    private final Object[] A03(AnonymousClass9BT r13, Object obj, Object[] objArr, int i, int i2) {
        Object[] A0K;
        int i3 = i2;
        int i4 = (i2 >> i) & 31;
        AnonymousClass9BT r7 = r13;
        Object obj2 = obj;
        if (i == 0) {
            if (i4 == 0) {
                A0K = new Object[32];
            } else {
                A0K = AnonymousClass00C.A0K(objArr, 32);
            }
            AnonymousClass02Q.A05(objArr, i4 + 1, A0K, i4, 31);
            r13.A00 = objArr[31];
            A0K[i4] = obj;
            return A0K;
        }
        Object[] A0K2 = AnonymousClass00C.A0K(objArr, 32);
        int i5 = i - 5;
        Object[] objArr2 = objArr[i4];
        AnonymousClass00C.A0E(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        A0K2[i4] = A03(r7, obj2, objArr2, i5, i3);
        int i6 = i4 + 1;
        while (i6 < 32 && A0K2[i6] != null) {
            Object[] objArr3 = objArr[i6];
            AnonymousClass00C.A0E(objArr3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            A0K2[i6] = A03(r7, r13.A00, objArr3, i5, 0);
            i6++;
        }
        return A0K2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (r1 == null) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object[] A04(X.AnonymousClass9BT r5, java.lang.Object[] r6, int r7, int r8) {
        /*
            r4 = this;
            int r0 = r8 >> r7
            r3 = r0 & 31
            r2 = 0
            r1 = 5
            if (r7 != r1) goto L_0x0010
            r0 = r6[r3]
            r5.A00 = r0
            r1 = r2
        L_0x000d:
            if (r3 != 0) goto L_0x001c
            return r2
        L_0x0010:
            java.lang.Object[] r0 = X.C165607th.A1Z(r6, r3)
            int r7 = r7 - r1
            java.lang.Object[] r1 = r4.A04(r5, r0, r7, r8)
            if (r1 != 0) goto L_0x001c
            goto L_0x000d
        L_0x001c:
            r0 = 32
            java.lang.Object[] r0 = X.AnonymousClass00C.A0K(r6, r0)
            r0[r3] = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C166557wR.A04(X.9BT, java.lang.Object[], int, int):java.lang.Object[]");
    }

    private final Object[] A05(AnonymousClass9BT r9, Object[] objArr, int i, int i2) {
        Object[] A0K;
        int i3 = (i2 >> i) & 31;
        int i4 = 31;
        if (i == 0) {
            if (i3 == 0) {
                A0K = new Object[32];
            } else {
                A0K = AnonymousClass00C.A0K(objArr, 32);
            }
            AnonymousClass02Q.A05(objArr, i3, A0K, i3 + 1, 32);
            A0K[31] = r9.A00;
            r9.A00 = objArr[i3];
            return A0K;
        }
        if (objArr[31] == null) {
            i4 = ((((size() - 1) & -32) - 1) >> i) & 31;
        }
        Object[] A0K2 = AnonymousClass00C.A0K(objArr, 32);
        int i5 = i - 5;
        int i6 = i3 + 1;
        if (i6 <= i4) {
            while (true) {
                Object obj = A0K2[i4];
                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                A0K2[i4] = A05(r9, (Object[]) obj, i5, 0);
                if (i4 == i6) {
                    break;
                }
                i4--;
            }
        }
        Object obj2 = A0K2[i3];
        AnonymousClass00C.A0E(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        A0K2[i3] = A05(r9, (Object[]) obj2, i5, i2);
        return A0K2;
    }

    private final Object[] A06(Object obj, Object[] objArr, int i, int i2) {
        int i3 = (i2 >> i) & 31;
        Object[] A0K = AnonymousClass00C.A0K(objArr, 32);
        if (i == 0) {
            A0K[i3] = obj;
            return A0K;
        }
        A0K[i3] = A06(obj, C165607th.A1Z(A0K, i3), i - 5, i2);
        return A0K;
    }

    public /* bridge */ /* synthetic */ C21921Acr B27() {
        return new C21921Acr(this, this.A01, this.A02, this.A00);
    }

    public B6U Bnf(C006302t r5) {
        C21921Acr acr = new C21921Acr(this, this.A01, this.A02, this.A00);
        acr.A0O(r5);
        return acr.A0N();
    }

    public C166557wR(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.A01 = objArr;
        this.A02 = objArr2;
        this.A03 = i;
        this.A00 = i2;
        if (size() > 32) {
            size();
            size();
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Trie-based persistent vector should have at least 33 elements, got ");
        throw C165567td.A0O(A0u, size());
    }

    private final B6U A00(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        if (size != 1) {
            Object[] objArr2 = this.A02;
            Object[] A0K = AnonymousClass00C.A0K(objArr2, 32);
            int i4 = size - 1;
            if (i3 < i4) {
                AnonymousClass02Q.A05(objArr2, i3, A0K, i3 + 1, size);
            }
            A0K[i4] = null;
            return new C166557wR(objArr, A0K, (i + size) - 1, i2);
        } else if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = AnonymousClass00C.A0K(objArr, 32);
            }
            return new C166547wQ(objArr);
        } else {
            AnonymousClass9BT r1 = new AnonymousClass9BT((Object) null);
            Object[] A04 = A04(r1, objArr, i2, i - 1);
            AnonymousClass00C.A0B(A04);
            Object obj = r1.A00;
            AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object[] objArr3 = (Object[]) obj;
            if (A04[1] == null) {
                Object obj2 = A04[0];
                AnonymousClass00C.A0E(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                A04 = (Object[]) obj2;
                i2 -= 5;
            }
            return new C166557wR(A04, objArr3, i, i2);
        }
    }

    private final C166557wR A01(Object obj, Object[] objArr, int i) {
        int size = size() - ((size() - 1) & -32);
        Object[] objArr2 = this.A02;
        Object[] A0K = AnonymousClass00C.A0K(objArr2, 32);
        if (size < 32) {
            AnonymousClass02Q.A05(objArr2, i + 1, A0K, i, size);
            A0K[i] = obj;
            return new C166557wR(objArr, A0K, size() + 1, this.A00);
        }
        Object obj2 = objArr2[31];
        System.arraycopy(objArr2, i, A0K, i + 1, (size - 1) - i);
        A0K[i] = obj;
        return A02(objArr, A0K, C36431kI.A1Z(obj2, 32));
    }

    private final C166557wR A02(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        Object[] A07;
        int size = size() >> 5;
        int i = this.A00;
        if (size > (1 << i)) {
            i += 5;
            A07 = A07(C36431kI.A1Z(objArr, 32), objArr2, i);
        } else {
            A07 = A07(objArr, objArr2, i);
        }
        return new C166557wR(A07, objArr3, size() + 1, i);
    }

    private final Object[] A07(Object[] objArr, Object[] objArr2, int i) {
        Object[] objArr3;
        int size = ((size() - 1) >> i) & 31;
        if (objArr != null) {
            objArr3 = AnonymousClass00C.A0K(objArr, 32);
        } else {
            objArr3 = new Object[32];
        }
        if (i == 5) {
            objArr3[size] = objArr2;
            return objArr3;
        }
        objArr3[size] = A07((Object[]) objArr3[size], objArr2, i - 5);
        return objArr3;
    }

    public int A08() {
        return this.A03;
    }

    public B6U B0B(Object obj) {
        int size = size() - ((size() - 1) & -32);
        if (size < 32) {
            Object[] A0K = AnonymousClass00C.A0K(this.A02, 32);
            A0K[size] = obj;
            return new C166557wR(this.A01, A0K, size() + 1, this.A00);
        }
        return A02(this.A01, this.A02, C36431kI.A1Z(obj, 32));
    }

    public B6U Bni(int i) {
        AnonymousClass9Yn.A00(i, size());
        int size = (size() - 1) & -32;
        Object[] objArr = this.A01;
        int i2 = this.A00;
        if (i >= size) {
            return A00(objArr, size, i2, i - size);
        }
        return A00(A05(new AnonymousClass9BT(this.A02[0]), objArr, i2, i), size, i2, 0);
    }

    public B6U Bq2(Object obj, int i) {
        AnonymousClass9Yn.A00(i, size());
        if (((size() - 1) & -32) <= i) {
            Object[] A0K = AnonymousClass00C.A0K(this.A02, 32);
            A0K[i & 31] = obj;
            return new C166557wR(this.A01, A0K, size(), this.A00);
        }
        Object[] objArr = this.A01;
        int i2 = this.A00;
        return new C166557wR(A06(obj, objArr, i2, i), this.A02, size(), i2);
    }

    public Object get(int i) {
        Object[] objArr;
        AnonymousClass9Yn.A00(i, size());
        if (((size() - 1) & -32) <= i) {
            objArr = this.A02;
        } else {
            objArr = this.A01;
            for (int i2 = this.A00; i2 > 0; i2 -= 5) {
                objArr = C165607th.A1Z(objArr, (i >> i2) & 31);
            }
        }
        return objArr[i & 31];
    }

    public ListIterator listIterator(int i) {
        AnonymousClass9Yn.A01(i, size());
        return new C166517wN(this.A01, i, this.A02, size(), (this.A00 / 5) + 1);
    }
}
