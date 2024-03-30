package X;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.Acr  reason: case insensitive filesystem */
public final class C21921Acr<E> extends AnonymousClass02f<E> implements PersistentList.Builder<E>, Collection, AnonymousClass00Y, C004902e {
    public int A00;
    public int A01;
    public AnonymousClass5WG A02 = new AnonymousClass5WG();
    public Object[] A03;
    public Object[] A04;
    public B6U A05;
    public Object[] A06;
    public Object[] A07;

    private final int A01(AnonymousClass9BT r6, List list, List list2, C006302t r9, Object[] objArr, int i, int i2) {
        if (objArr.length == 33 && objArr[32] == this.A02) {
            list.add(objArr);
        }
        Object obj = r6.A00;
        AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!C90464aC.A1Y(obj2, r9)) {
                if (i2 == 32) {
                    if (C36401kF.A1a(list)) {
                        objArr3 = (Object[]) list.remove(C36431kI.A07(list));
                    } else {
                        objArr3 = A09();
                    }
                    i2 = 0;
                }
                objArr3[i2] = obj2;
                i2++;
            }
        }
        r6.A00 = objArr3;
        if (objArr2 != objArr3) {
            list2.add(objArr2);
        }
        return i2;
    }

    private final void A07(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.A03 = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.A04 = objArr;
            this.A01 = i;
        } else {
            AnonymousClass9BT r0 = new AnonymousClass9BT((Object) null);
            AnonymousClass00C.A0B(objArr);
            Object[] A0C = A0C(r0, objArr, i2, i);
            AnonymousClass00C.A0B(A0C);
            Object obj = r0.A00;
            AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            this.A04 = (Object[]) obj;
            this.A01 = i;
            if (A0C[1] == null) {
                this.A03 = (Object[]) A0C[0];
                i2 -= 5;
            } else {
                this.A03 = A0C;
            }
        }
        this.A00 = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r4[32] != r3.A02) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object[] A0G(java.lang.Object[] r4, int r5) {
        /*
            r3 = this;
            int r1 = r4.length
            r0 = 33
            if (r1 != r0) goto L_0x000e
            r0 = 32
            r2 = r4[r0]
            X.5WG r1 = r3.A02
            r0 = 1
            if (r2 == r1) goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            r2 = 0
            if (r0 == 0) goto L_0x0018
            int r0 = 32 - r5
            X.AnonymousClass02Q.A05(r4, r5, r4, r2, r0)
            return r4
        L_0x0018:
            java.lang.Object[] r1 = r3.A09()
            int r0 = 32 - r5
            X.AnonymousClass02Q.A05(r4, r5, r1, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21921Acr.A0G(java.lang.Object[], int):java.lang.Object[]");
    }

    private final Object[] A0H(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            throw AnonymousClass001.A08("shift should be positive");
        } else if (i2 == 0) {
            return objArr;
        } else {
            int i3 = (i >> i2) & 31;
            Object A0H = A0H(C165607th.A1Z(objArr, i3), i, i2 - 5);
            if (i3 < 31) {
                int i4 = i3 + 1;
                if (objArr[i4] != null) {
                    if (objArr.length == 33 && objArr[32] == this.A02) {
                        Arrays.fill(objArr, i4, 32, (Object) null);
                    }
                    Object[] A09 = A09();
                    AnonymousClass02Q.A05(objArr, 0, A09, 0, i4);
                    objArr = A09;
                }
            }
            if (A0H == objArr[i3]) {
                return objArr;
            }
            Object[] A0F = A0F(objArr);
            A0F[i3] = A0H;
            return A0F;
        }
    }

    public void add(int i, Object obj) {
        int i2 = i;
        AnonymousClass9Yn.A01(i, size());
        Object obj2 = obj;
        if (i == size()) {
            add(obj);
            return;
        }
        this.modCount++;
        int A002 = A00();
        if (i >= A002) {
            A05(obj, this.A03, i - A002);
            return;
        }
        AnonymousClass9BT r4 = new AnonymousClass9BT((Object) null);
        Object[] objArr = this.A03;
        AnonymousClass00C.A0B(objArr);
        A05(r4.A00, A0A(r4, obj2, objArr, this.A00, i2), 0);
    }

    public Object set(int i, Object obj) {
        int i2 = i;
        AnonymousClass9Yn.A00(i, size());
        Object obj2 = obj;
        if (A00() <= i) {
            Object[] A0F = A0F(this.A04);
            if (A0F != this.A04) {
                this.modCount++;
            }
            int i3 = i & 31;
            Object obj3 = A0F[i3];
            A0F[i3] = obj;
            this.A04 = A0F;
            return obj3;
        }
        AnonymousClass9BT r4 = new AnonymousClass9BT((Object) null);
        Object[] objArr = this.A03;
        AnonymousClass00C.A0B(objArr);
        this.A03 = A0B(r4, obj2, objArr, this.A00, i2);
        return r4.A00;
    }

    private final int A02(AnonymousClass9BT r8, C006302t r9, int i) {
        Object[] objArr = this.A04;
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (C90464aC.A1Y(obj, r9)) {
                if (!z) {
                    objArr2 = A0F(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        r8.A00 = objArr2;
        if (i2 == i) {
            return i;
        }
        AnonymousClass00C.A0E(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        AnonymousClass02Q.A04(objArr2, i2, i);
        this.A04 = objArr2;
        this.A01 = size() - (i - i2);
        return i2;
    }

    private final AYM A03(int i) {
        Object[] objArr = this.A03;
        if (objArr != null) {
            int A002 = A00() >> 5;
            AnonymousClass9Yn.A01(i, A002);
            int i2 = this.A00;
            if (i2 == 0) {
                return new C166507wM(objArr, i);
            }
            return new C166527wO(objArr, i, A002, i2 / 5);
        }
        throw AnonymousClass001.A09("Invalid root");
    }

    public static final void A06(Iterator it, Object[] objArr, int i) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    private final Object[] A09() {
        Object[] objArr = new Object[33];
        objArr[32] = this.A02;
        return objArr;
    }

    private final Object[] A0A(AnonymousClass9BT r5, Object obj, Object[] objArr, int i, int i2) {
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            r5.A00 = objArr[31];
            Object[] A0F = A0F(objArr);
            AnonymousClass02Q.A05(objArr, i3 + 1, A0F, i3, 31);
            A0F[i3] = obj;
            return A0F;
        }
        Object[] A0F2 = A0F(objArr);
        int i4 = i - 5;
        Object obj2 = A0F2[i3];
        AnonymousClass00C.A0E(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj2;
        while (true) {
            A0F2[i3] = A0A(r5, obj, objArr2, i4, i2);
            i3++;
            if (i3 >= 32 || A0F2[i3] == null) {
                return A0F2;
            }
            Object obj3 = A0F2[i3];
            AnonymousClass00C.A0E(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (Object[]) obj3;
            i2 = 0;
            obj = r5.A00;
        }
    }

    private final Object[] A0B(AnonymousClass9BT r4, Object obj, Object[] objArr, int i, int i2) {
        int i3 = (i2 >> i) & 31;
        Object[] A0F = A0F(objArr);
        if (i == 0) {
            if (A0F != objArr) {
                this.modCount++;
            }
            r4.A00 = A0F[i3];
            A0F[i3] = obj;
            return A0F;
        }
        A0F[i3] = A0B(r4, obj, C165607th.A1Z(A0F, i3), i - 5, i2);
        return A0F;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (r1 == null) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object[] A0C(X.AnonymousClass9BT r5, java.lang.Object[] r6, int r7, int r8) {
        /*
            r4 = this;
            int r0 = r8 + -1
            int r0 = r0 >> r7
            r3 = r0 & 31
            r2 = 0
            r1 = 5
            if (r7 != r1) goto L_0x0011
            r0 = r6[r3]
            r5.A00 = r0
            r1 = r2
        L_0x000e:
            if (r3 != 0) goto L_0x001d
            return r2
        L_0x0011:
            java.lang.Object[] r0 = X.C165607th.A1Z(r6, r3)
            int r7 = r7 - r1
            java.lang.Object[] r1 = r4.A0C(r5, r0, r7, r8)
            if (r1 != 0) goto L_0x001d
            goto L_0x000e
        L_0x001d:
            java.lang.Object[] r0 = r4.A0F(r6)
            r0[r3] = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21921Acr.A0C(X.9BT, java.lang.Object[], int, int):java.lang.Object[]");
    }

    private final Object[] A0D(AnonymousClass9BT r9, Object[] objArr, int i, int i2) {
        int i3 = (i2 >> i) & 31;
        int i4 = 31;
        if (i == 0) {
            Object obj = objArr[i3];
            Object[] A0F = A0F(objArr);
            AnonymousClass02Q.A05(objArr, i3, A0F, i3 + 1, 32);
            A0F[31] = r9.A00;
            r9.A00 = obj;
            return A0F;
        }
        if (objArr[31] == null) {
            i4 = ((A00() - 1) >> i) & 31;
        }
        Object[] A0F2 = A0F(objArr);
        int i5 = i - 5;
        int i6 = i3 + 1;
        if (i6 <= i4) {
            while (true) {
                Object obj2 = A0F2[i4];
                AnonymousClass00C.A0E(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                A0F2[i4] = A0D(r9, (Object[]) obj2, i5, 0);
                if (i4 == i6) {
                    break;
                }
                i4--;
            }
        }
        Object obj3 = A0F2[i3];
        AnonymousClass00C.A0E(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        A0F2[i3] = A0D(r9, (Object[]) obj3, i5, i2);
        return A0F2;
    }

    private final Object[] A0F(Object[] objArr) {
        if (objArr == null) {
            return A09();
        }
        int length = objArr.length;
        if (length == 33 && objArr[32] == this.A02) {
            return objArr;
        }
        Object[] A09 = A09();
        if (length > 32) {
            length = 32;
        }
        AnonymousClass02Q.A05(objArr, 0, A09, 0, length);
        return A09;
    }

    private final Object[] A0J(Object[] objArr, Object[][] objArr2, int i) {
        Object[] objArr3;
        C12310hq r5 = new C12310hq(objArr2);
        int i2 = i >> 5;
        int i3 = this.A00;
        if (i2 < (1 << i3)) {
            objArr3 = A0E(r5, objArr, i, i3);
        } else {
            objArr3 = A0F(objArr);
        }
        while (r5.hasNext()) {
            int i4 = this.A00 + 5;
            this.A00 = i4;
            objArr3 = C36431kI.A1Z(objArr3, 33);
            objArr3[32] = this.A02;
            A0E(r5, objArr3, 1 << i4, i4);
        }
        return objArr3;
    }

    public B6U A0N() {
        B6U b6u;
        B6U b6u2;
        Object[] objArr = this.A03;
        if (objArr == this.A06 && this.A04 == this.A07) {
            b6u2 = this.A05;
        } else {
            this.A02 = new AnonymousClass5WG();
            this.A06 = objArr;
            Object[] objArr2 = this.A04;
            this.A07 = objArr2;
            if (objArr != null) {
                b6u = new C166557wR(objArr, objArr2, size(), this.A00);
            } else if (objArr2.length == 0) {
                b6u2 = C166547wQ.A01;
            } else {
                b6u = new C166547wQ(AnonymousClass00C.A0K(objArr2, size()));
            }
            b6u2 = b6u;
        }
        this.A05 = b6u2;
        return b6u2;
    }

    public final boolean A0O(C006302t r20) {
        int A022;
        int i;
        Object[] A0H;
        int size = size();
        if (size > 32) {
            size -= (size - 1) & -32;
        }
        AnonymousClass9BT r12 = new AnonymousClass9BT((Object) null);
        C006302t r15 = r20;
        if (this.A03 == null) {
            A022 = A02(r12, r15, size);
        } else {
            AYM A032 = A03(0);
            while (true) {
                if (!A032.hasNext()) {
                    break;
                }
                Object[] objArr = (Object[]) A032.next();
                int i2 = 0;
                Object[] objArr2 = objArr;
                int i3 = 32;
                boolean z = false;
                do {
                    Object obj = objArr[i2];
                    if (C90464aC.A1Y(obj, r15)) {
                        if (!z) {
                            objArr2 = A0F(objArr);
                            z = true;
                            i3 = i2;
                        }
                    } else if (z) {
                        objArr2[i3] = obj;
                        i3++;
                    }
                    i2++;
                } while (i2 < 32);
                r12.A00 = objArr2;
                if (i3 != 32) {
                    if (i3 != 32) {
                        int previousIndex = A032.previousIndex() << 5;
                        ArrayList A0I = AnonymousClass001.A0I();
                        ArrayList A0I2 = AnonymousClass001.A0I();
                        while (A032.hasNext()) {
                            i3 = A01(r12, A0I2, A0I, r15, (Object[]) A032.next(), 32, i3);
                        }
                        int A012 = A01(r12, A0I2, A0I, r15, this.A04, size, i3);
                        Object obj2 = r12.A00;
                        AnonymousClass00C.A0E(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        Object[] objArr3 = (Object[]) obj2;
                        AnonymousClass02Q.A04(objArr3, A012, 32);
                        boolean isEmpty = A0I.isEmpty();
                        Object[] objArr4 = this.A03;
                        if (isEmpty) {
                            AnonymousClass00C.A0B(objArr4);
                        } else {
                            objArr4 = A0E(A0I.iterator(), objArr4, previousIndex, this.A00);
                        }
                        int size2 = previousIndex + (A0I.size() << 5);
                        if ((size2 & 31) == 0) {
                            if (size2 == 0) {
                                this.A00 = 0;
                                A0H = null;
                            } else {
                                int i4 = size2 - 1;
                                while (true) {
                                    i = this.A00;
                                    if ((i4 >> i) != 0) {
                                        break;
                                    }
                                    this.A00 = i - 5;
                                    Object[] objArr5 = objArr4[0];
                                    AnonymousClass00C.A0E(objArr5, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                                    objArr4 = objArr5;
                                }
                                A0H = A0H(objArr4, i4, i);
                            }
                            this.A03 = A0H;
                            this.A04 = objArr3;
                            this.A01 = size2 + A012;
                        } else {
                            throw AnonymousClass001.A08("invalid size");
                        }
                    }
                }
            }
            A022 = A02(r12, r15, size);
            if (A022 == 0) {
                A07(this.A03, size(), this.A00);
            }
        }
        if (A022 == size) {
            return false;
        }
        this.modCount++;
        return true;
    }

    public boolean addAll(int i, Collection collection) {
        Object[] A09;
        int i2;
        Object[] A0G;
        Object[] objArr;
        Object[] A092;
        int i3 = i;
        AnonymousClass9Yn.A01(i3, size());
        Collection collection2 = collection;
        if (i3 == size()) {
            return addAll(collection2);
        }
        if (collection2.isEmpty()) {
            return false;
        }
        this.modCount++;
        int i4 = i >> 5;
        int i5 = i4 << 5;
        int size = (((size() - i5) + collection2.size()) - 1) / 32;
        if (size == 0) {
            A00();
            int i6 = i & 31;
            Object[] objArr2 = this.A04;
            Object[] A0F = A0F(objArr2);
            int size2 = (((i + collection2.size()) - 1) & 31) + 1;
            int size3 = size();
            if (size3 > 32) {
                size3 -= (size3 - 1) & -32;
            }
            AnonymousClass02Q.A05(objArr2, size2, A0F, i6, size3);
            A06(collection2.iterator(), A0F, i6);
            this.A04 = A0F;
        } else {
            Object[][] objArr3 = new Object[size][];
            int size4 = size();
            if (size4 > 32) {
                size4 -= (size4 - 1) & -32;
            }
            int size5 = size() + collection2.size();
            if (size5 > 32) {
                size5 -= (size5 - 1) & -32;
            }
            if (i3 >= A00()) {
                A09 = A09();
                objArr = this.A04;
                A0G = A09;
            } else {
                if (size5 > size4) {
                    i2 = size5 - size4;
                    A09 = A0G(this.A04, i2);
                    A0G = A09;
                } else {
                    Object[] objArr4 = this.A04;
                    A09 = A09();
                    int i7 = size4 - size5;
                    AnonymousClass02Q.A05(objArr4, 0, A09, i7, size4);
                    i2 = 32 - i7;
                    A0G = A0G(this.A04, i2);
                    size--;
                    objArr3[size] = A0G;
                }
                if (this.A03 != null) {
                    int i8 = size;
                    Object[] objArr5 = A0G;
                    AYM A032 = A03(A00() >> 5);
                    while (A032.previousIndex() != i4) {
                        Object[] objArr6 = (Object[]) A032.previous();
                        AnonymousClass02Q.A05(objArr6, 0, objArr5, 32 - i2, 32);
                        objArr5 = A0G(objArr6, i2);
                        i8--;
                        objArr3[i8] = objArr5;
                    }
                    objArr = (Object[]) A032.previous();
                    int A002 = size - (((A00() >> 5) - 1) - i4);
                    if (A002 < size) {
                        A0G = objArr3[A002];
                        AnonymousClass00C.A0B(A0G);
                    }
                    size4 = 32;
                    size = A002;
                } else {
                    throw AnonymousClass001.A09("root is null");
                }
            }
            if (size >= 1) {
                Object[] A0F2 = A0F(objArr);
                objArr3[0] = A0F2;
                int i9 = i & 31;
                int size6 = ((i + collection2.size()) - 1) & 31;
                int i10 = (size4 - i9) + size6;
                if (i10 < 32) {
                    AnonymousClass02Q.A05(A0F2, size6 + 1, A0G, i9, size4);
                } else {
                    int i11 = (i10 - 32) + 1;
                    if (size == 1) {
                        A092 = A0F2;
                    } else {
                        A092 = A09();
                        size--;
                        objArr3[size] = A092;
                    }
                    int i12 = size4 - i11;
                    AnonymousClass02Q.A05(A0F2, 0, A0G, i12, size4);
                    AnonymousClass02Q.A05(A0F2, size6 + 1, A092, i9, i12);
                    A0G = A092;
                }
                Iterator it = collection2.iterator();
                A06(it, A0F2, i9);
                for (int i13 = 1; i13 < size; i13++) {
                    Object[] A093 = A09();
                    A06(it, A093, 0);
                    objArr3[i13] = A093;
                }
                A06(it, A0G, 0);
                this.A03 = A0J(this.A03, objArr3, i5);
                this.A04 = A09;
            } else {
                throw AnonymousClass001.A08("requires at least one nullBuffer");
            }
        }
        this.A01 = size() + collection2.size();
        return true;
    }

    public boolean removeAll(Collection collection) {
        return A0O(new C22298AkM(collection));
    }

    public C21921Acr(B6U b6u, Object[] objArr, Object[] objArr2, int i) {
        this.A05 = b6u;
        this.A06 = objArr;
        this.A07 = objArr2;
        this.A00 = i;
        this.A03 = objArr;
        this.A04 = objArr2;
        this.A01 = b6u.size();
    }

    private final int A00() {
        if (size() <= 32) {
            return 0;
        }
        return (size() - 1) & -32;
    }

    private final Object A04(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        if (size == 1) {
            Object obj = this.A04[0];
            A07(objArr, i, i2);
            return obj;
        }
        Object[] objArr2 = this.A04;
        Object obj2 = objArr2[i3];
        Object[] A0F = A0F(objArr2);
        AnonymousClass02Q.A05(objArr2, i3, A0F, i3 + 1, size);
        A0F[size - 1] = null;
        this.A03 = objArr;
        this.A04 = A0F;
        this.A01 = (i + size) - 1;
        this.A00 = i2;
        return obj2;
    }

    private final void A05(Object obj, Object[] objArr, int i) {
        int size = size();
        if (size > 32) {
            size -= (size - 1) & -32;
        }
        Object[] A0F = A0F(this.A04);
        if (size < 32) {
            AnonymousClass02Q.A05(this.A04, i + 1, A0F, i, size);
            A0F[i] = obj;
            this.A03 = objArr;
            this.A04 = A0F;
            this.A01 = size() + 1;
            return;
        }
        Object[] objArr2 = this.A04;
        Object obj2 = objArr2[31];
        AnonymousClass02Q.A05(objArr2, i + 1, A0F, i, 31);
        A0F[i] = obj;
        Object[] A1Z = C36431kI.A1Z(obj2, 33);
        A1Z[32] = this.A02;
        A08(objArr, A0F, A1Z);
    }

    private final void A08(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.A00;
        if (size > (1 << i)) {
            Object[] A1Z = C36431kI.A1Z(objArr, 33);
            A1Z[32] = this.A02;
            this.A03 = A0I(A1Z, objArr2, i + 5);
            this.A04 = objArr3;
            this.A00 += 5;
        } else {
            if (objArr == null) {
                this.A03 = objArr2;
            } else {
                this.A03 = A0I(objArr, objArr2, i);
            }
            this.A04 = objArr3;
        }
        this.A01 = size() + 1;
    }

    private final Object[] A0E(Iterator it, Object[] objArr, int i, int i2) {
        if (!it.hasNext()) {
            throw AnonymousClass001.A08("invalid buffersIterator");
        } else if (i2 < 0) {
            throw AnonymousClass001.A08("negative shift");
        } else if (i2 == 0) {
            return (Object[]) it.next();
        } else {
            Object[] A0F = A0F(objArr);
            int i3 = (i >> i2) & 31;
            int i4 = i2 - 5;
            Object[] A0E = A0E(it, (Object[]) A0F[i3], i, i4);
            while (true) {
                A0F[i3] = A0E;
                i3++;
                if (i3 >= 32 || !it.hasNext()) {
                    return A0F;
                }
                A0E = A0E(it, (Object[]) A0F[i3], 0, i4);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object[] A0I(java.lang.Object[] r5, java.lang.Object[] r6, int r7) {
        /*
            r4 = this;
            int r0 = r4.size()
            int r0 = r0 + -1
            int r0 = r0 >> r7
            r3 = r0 & 31
            java.lang.Object[] r2 = r4.A0F(r5)
            r1 = 5
            if (r7 == r1) goto L_0x0019
            r0 = r2[r3]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r7 = r7 - r1
            java.lang.Object[] r6 = r4.A0I(r0, r6, r7)
        L_0x0019:
            r2[r3] = r6
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21921Acr.A0I(java.lang.Object[], java.lang.Object[], int):java.lang.Object[]");
    }

    public int A0K() {
        return this.A01;
    }

    public Object A0L(int i) {
        AnonymousClass9Yn.A00(i, size());
        this.modCount++;
        int A002 = A00();
        if (i >= A002) {
            return A04(this.A03, A002, this.A00, i - A002);
        }
        AnonymousClass9BT r2 = new AnonymousClass9BT(this.A04[0]);
        Object[] objArr = this.A03;
        AnonymousClass00C.A0B(objArr);
        A04(A0D(r2, objArr, this.A00, i), A002, this.A00, 0);
        return r2.A00;
    }

    public final int A0M() {
        return this.modCount;
    }

    public Object get(int i) {
        Object[] objArr;
        AnonymousClass9Yn.A00(i, size());
        if (A00() <= i) {
            objArr = this.A04;
        } else {
            objArr = this.A03;
            AnonymousClass00C.A0B(objArr);
            for (int i2 = this.A00; i2 > 0; i2 -= 5) {
                objArr = C165607th.A1Z(objArr, (i >> i2) & 31);
            }
        }
        return objArr[i & 31];
    }

    public Iterator iterator() {
        return listIterator();
    }

    public ListIterator listIterator(int i) {
        AnonymousClass9Yn.A01(i, size());
        return new C166537wP(this, i);
    }

    public boolean add(Object obj) {
        this.modCount++;
        int size = size();
        if (size > 32) {
            size -= (size - 1) & -32;
        }
        if (size < 32) {
            Object[] A0F = A0F(this.A04);
            A0F[size] = obj;
            this.A04 = A0F;
            this.A01 = size() + 1;
            return true;
        }
        Object[] A1Z = C36431kI.A1Z(obj, 33);
        A1Z[32] = this.A02;
        A08(this.A03, this.A04, A1Z);
        return true;
    }

    public boolean addAll(Collection collection) {
        Object[] A09;
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int size = size();
        if (size > 32) {
            size -= (size - 1) & -32;
        }
        Iterator it = collection.iterator();
        if (32 - size >= collection.size()) {
            A09 = A0F(this.A04);
            A06(it, A09, size);
        } else {
            int size2 = ((collection.size() + size) - 1) / 32;
            Object[][] objArr = new Object[size2][];
            Object[] A0F = A0F(this.A04);
            A06(it, A0F, size);
            objArr[0] = A0F;
            for (int i = 1; i < size2; i++) {
                Object[] A092 = A09();
                A06(it, A092, 0);
                objArr[i] = A092;
            }
            this.A03 = A0J(this.A03, objArr, A00());
            A09 = A09();
            A06(it, A09, 0);
        }
        this.A04 = A09;
        this.A01 = size() + collection.size();
        return true;
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }
}
