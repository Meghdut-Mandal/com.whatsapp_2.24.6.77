package X;

import java.util.Arrays;

/* renamed from: X.0fO  reason: invalid class name and case insensitive filesystem */
public class C10890fO implements Cloneable {
    public /* synthetic */ int A00;
    public /* synthetic */ int[] A01;
    public /* synthetic */ Object[] A02;

    public void A01(int i, Object obj) {
        int i2 = this.A00;
        if (i2 == 0 || i > this.A01[i2 - 1]) {
            int[] iArr = this.A01;
            if (i2 >= iArr.length) {
                int i3 = (i2 + 1) * 4;
                int i4 = 4;
                while (true) {
                    int i5 = (1 << i4) - 12;
                    if (i3 > i5) {
                        i4++;
                        if (i4 >= 32) {
                            break;
                        }
                    } else {
                        i3 = i5;
                        break;
                    }
                }
                int i6 = i3 / 4;
                int[] copyOf = Arrays.copyOf(iArr, i6);
                AnonymousClass00C.A08(copyOf);
                this.A01 = copyOf;
                this.A02 = AnonymousClass00C.A0K(this.A02, i6);
            }
            this.A01[i2] = i;
            this.A02[i2] = obj;
            this.A00 = i2 + 1;
            return;
        }
        A02(i, obj);
    }

    public void A02(int i, Object obj) {
        int A002 = AnonymousClass009.A00(this.A01, this.A00, i);
        if (A002 < 0) {
            A002 = ~A002;
            int i2 = this.A00;
            if (A002 >= i2 || this.A02[A002] != C06840Vh.A00) {
                int[] iArr = this.A01;
                if (i2 >= iArr.length) {
                    int i3 = (i2 + 1) * 4;
                    int i4 = 4;
                    while (true) {
                        int i5 = (1 << i4) - 12;
                        if (i3 > i5) {
                            i4++;
                            if (i4 >= 32) {
                                break;
                            }
                        } else {
                            i3 = i5;
                            break;
                        }
                    }
                    int i6 = i3 / 4;
                    int[] copyOf = Arrays.copyOf(iArr, i6);
                    AnonymousClass00C.A08(copyOf);
                    this.A01 = copyOf;
                    this.A02 = AnonymousClass00C.A0K(this.A02, i6);
                }
                int i7 = this.A00;
                if (i7 - A002 != 0) {
                    int[] iArr2 = this.A01;
                    int i8 = A002 + 1;
                    AnonymousClass02Q.A03(i8, A002, i7, iArr2, iArr2);
                    Object[] objArr = this.A02;
                    AnonymousClass02Q.A05(objArr, i8, objArr, A002, this.A00);
                }
                this.A01[A002] = i;
                this.A02[A002] = obj;
                this.A00++;
                return;
            }
            this.A01[A002] = i;
        }
        this.A02[A002] = obj;
    }

    public String toString() {
        int i = this.A00;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = 0;
        while (true) {
            sb.append(this.A01[i2]);
            sb.append('=');
            Object obj = this.A02[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
            i2++;
            if (i2 >= i) {
                String A0s = AnonymousClass000.A0s(sb);
                AnonymousClass00C.A08(A0s);
                return A0s;
            } else if (i2 > 0) {
                sb.append(", ");
            }
        }
    }

    public C10890fO(int i) {
        int i2 = 40;
        int i3 = 4;
        while (true) {
            int i4 = (1 << i3) - 12;
            if (40 > i4) {
                i3++;
                if (i3 >= 32) {
                    break;
                }
            } else {
                i2 = i4;
                break;
            }
        }
        int i5 = i2 / 4;
        this.A01 = new int[i5];
        this.A02 = new Object[i5];
    }

    /* renamed from: A00 */
    public C10890fO clone() {
        Object clone = super.clone();
        AnonymousClass00C.A0E(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        C10890fO r1 = (C10890fO) clone;
        r1.A01 = (int[]) this.A01.clone();
        r1.A02 = (Object[]) this.A02.clone();
        return r1;
    }

    public C10890fO() {
        this(10);
    }
}
