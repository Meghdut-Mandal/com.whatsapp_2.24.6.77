package X;

import java.util.Arrays;

/* renamed from: X.00i  reason: invalid class name and case insensitive filesystem */
public class C000700i implements Cloneable {
    public /* synthetic */ int A00;
    public /* synthetic */ boolean A01;
    public /* synthetic */ long[] A02;
    public /* synthetic */ Object[] A03;

    public long A02(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.A00)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected index to be within 0..size()-1, but was ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (this.A01) {
            long[] jArr = this.A02;
            Object[] objArr = this.A03;
            int i3 = 0;
            int i4 = 0;
            do {
                Object obj = objArr[i3];
                if (obj != AnonymousClass045.A00) {
                    if (i3 != i4) {
                        jArr[i4] = jArr[i3];
                        objArr[i4] = obj;
                        objArr[i3] = null;
                    }
                    i4++;
                }
                i3++;
            } while (i3 < i2);
            this.A01 = false;
            this.A00 = i4;
        }
        return this.A02[i];
    }

    public Object A04(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.A00)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected index to be within 0..size()-1, but was ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (this.A01) {
            long[] jArr = this.A02;
            Object[] objArr = this.A03;
            int i3 = 0;
            int i4 = 0;
            do {
                Object obj = objArr[i3];
                if (obj != AnonymousClass045.A00) {
                    if (i3 != i4) {
                        jArr[i4] = jArr[i3];
                        objArr[i4] = obj;
                        objArr[i3] = null;
                    }
                    i4++;
                }
                i3++;
            } while (i3 < i2);
            this.A01 = false;
            this.A00 = i4;
        }
        return this.A03[i];
    }

    public int A00() {
        if (this.A01) {
            int i = this.A00;
            long[] jArr = this.A02;
            Object[] objArr = this.A03;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != AnonymousClass045.A00) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.A01 = false;
            this.A00 = i2;
        }
        return this.A00;
    }

    public int A01(long j) {
        if (this.A01) {
            int i = this.A00;
            long[] jArr = this.A02;
            Object[] objArr = this.A03;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != AnonymousClass045.A00) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.A01 = false;
            this.A00 = i2;
        }
        return AnonymousClass009.A01(this.A02, this.A00, j);
    }

    public Object A05(long j) {
        Object obj;
        int A012 = AnonymousClass009.A01(this.A02, this.A00, j);
        if (A012 < 0 || (obj = this.A03[A012]) == AnonymousClass045.A00) {
            return null;
        }
        return obj;
    }

    public Object A06(Object obj, long j) {
        Object obj2;
        int A012 = AnonymousClass009.A01(this.A02, this.A00, j);
        if (A012 < 0 || (obj2 = this.A03[A012]) == AnonymousClass045.A00) {
            return obj;
        }
        return obj2;
    }

    public void A07() {
        int i = this.A00;
        Object[] objArr = this.A03;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.A00 = 0;
        this.A01 = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r2 = r4.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(long r5) {
        /*
            r4 = this;
            long[] r1 = r4.A02
            int r0 = r4.A00
            int r3 = X.AnonymousClass009.A01(r1, r0, r5)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r2 = r4.A03
            r1 = r2[r3]
            java.lang.Object r0 = X.AnonymousClass045.A00
            if (r1 == r0) goto L_0x0017
            r2[r3] = r0
            r0 = 1
            r4.A01 = r0
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C000700i.A08(long):void");
    }

    public void A09(long j, Object obj) {
        int i = this.A00;
        if (i == 0 || j > this.A02[i - 1]) {
            if (this.A01) {
                long[] jArr = this.A02;
                if (i >= jArr.length) {
                    Object[] objArr = this.A03;
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        Object obj2 = objArr[i3];
                        if (obj2 != AnonymousClass045.A00) {
                            if (i3 != i2) {
                                jArr[i2] = jArr[i3];
                                objArr[i2] = obj2;
                                objArr[i3] = null;
                            }
                            i2++;
                        }
                    }
                    this.A01 = false;
                    this.A00 = i2;
                    i = i2;
                }
            }
            long[] jArr2 = this.A02;
            if (i >= jArr2.length) {
                int i4 = (i + 1) * 8;
                int i5 = 4;
                while (true) {
                    int i6 = (1 << i5) - 12;
                    if (i4 > i6) {
                        i5++;
                        if (i5 >= 32) {
                            break;
                        }
                    } else {
                        i4 = i6;
                        break;
                    }
                }
                int i7 = i4 / 8;
                long[] copyOf = Arrays.copyOf(jArr2, i7);
                AnonymousClass00C.A08(copyOf);
                this.A02 = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.A03, i7);
                AnonymousClass00C.A08(copyOf2);
                this.A03 = copyOf2;
            }
            this.A02[i] = j;
            this.A03[i] = obj;
            this.A00 = i + 1;
            return;
        }
        A0A(j, obj);
    }

    public void A0A(long j, Object obj) {
        int A012 = AnonymousClass009.A01(this.A02, this.A00, j);
        if (A012 < 0) {
            A012 = ~A012;
            int i = this.A00;
            if (A012 >= i || this.A03[A012] != AnonymousClass045.A00) {
                if (this.A01) {
                    long[] jArr = this.A02;
                    if (i >= jArr.length) {
                        Object[] objArr = this.A03;
                        int i2 = 0;
                        for (int i3 = 0; i3 < i; i3++) {
                            Object obj2 = objArr[i3];
                            if (obj2 != AnonymousClass045.A00) {
                                if (i3 != i2) {
                                    jArr[i2] = jArr[i3];
                                    objArr[i2] = obj2;
                                    objArr[i3] = null;
                                }
                                i2++;
                            }
                        }
                        this.A01 = false;
                        this.A00 = i2;
                        A012 = ~AnonymousClass009.A01(jArr, i2, j);
                    }
                }
                int i4 = this.A00;
                long[] jArr2 = this.A02;
                if (i4 >= jArr2.length) {
                    int i5 = (i4 + 1) * 8;
                    int i6 = 4;
                    while (true) {
                        int i7 = (1 << i6) - 12;
                        if (i5 > i7) {
                            i6++;
                            if (i6 >= 32) {
                                break;
                            }
                        } else {
                            i5 = i7;
                            break;
                        }
                    }
                    int i8 = i5 / 8;
                    long[] copyOf = Arrays.copyOf(jArr2, i8);
                    AnonymousClass00C.A08(copyOf);
                    this.A02 = copyOf;
                    Object[] copyOf2 = Arrays.copyOf(this.A03, i8);
                    AnonymousClass00C.A08(copyOf2);
                    this.A03 = copyOf2;
                }
                int i9 = this.A00;
                if (i9 - A012 != 0) {
                    long[] jArr3 = this.A02;
                    int i10 = A012 + 1;
                    AnonymousClass00C.A0D(jArr3, 0);
                    System.arraycopy(jArr3, A012, jArr3, i10, i9 - A012);
                    Object[] objArr2 = this.A03;
                    AnonymousClass02Q.A05(objArr2, i10, objArr2, A012, this.A00);
                }
                this.A02[A012] = j;
                this.A03[A012] = obj;
                this.A00++;
                return;
            }
            this.A02[A012] = j;
        }
        this.A03[A012] = obj;
    }

    public C000700i(int i) {
        Object[] objArr;
        if (i == 0) {
            this.A02 = AnonymousClass009.A01;
            objArr = AnonymousClass009.A02;
        } else {
            int i2 = i * 8;
            int i3 = 4;
            while (true) {
                int i4 = (1 << i3) - 12;
                if (i2 > i4) {
                    i3++;
                    if (i3 >= 32) {
                        break;
                    }
                } else {
                    i2 = i4;
                    break;
                }
            }
            int i5 = i2 / 8;
            this.A02 = new long[i5];
            objArr = new Object[i5];
        }
        this.A03 = objArr;
    }

    /* renamed from: A03 */
    public C000700i clone() {
        Object clone = super.clone();
        AnonymousClass00C.A0E(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C000700i r1 = (C000700i) clone;
        r1.A02 = (long[]) this.A02.clone();
        r1.A03 = (Object[]) this.A03.clone();
        return r1;
    }

    public String toString() {
        if (A00() <= 0) {
            return "{}";
        }
        int i = this.A00;
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(A02(i2));
            sb.append('=');
            Object A04 = A04(i2);
            if (A04 != sb) {
                sb.append(A04);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String obj = sb.toString();
        AnonymousClass00C.A08(obj);
        return obj;
    }

    public C000700i() {
        this(10);
    }
}
