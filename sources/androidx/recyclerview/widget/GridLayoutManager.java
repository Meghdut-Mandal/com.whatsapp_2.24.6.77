package androidx.recyclerview.widget;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0C2;
import X.AnonymousClass0C4;
import X.AnonymousClass0CP;
import X.AnonymousClass0CW;
import X.AnonymousClass0D0;
import X.AnonymousClass0D2;
import X.AnonymousClass0I7;
import X.AnonymousClass0SL;
import X.AnonymousClass0UK;
import X.C011504z;
import X.C02760Bu;
import X.C03780Hr;
import X.C07650Ys;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;

public class GridLayoutManager extends LinearLayoutManager {
    public boolean A00 = false;
    public int A01 = -1;
    public AnonymousClass0UK A02 = new C03780Hr();
    public int[] A03;
    public View[] A04;
    public final Rect A05 = AnonymousClass001.A06();
    public final SparseIntArray A06 = new SparseIntArray();
    public final SparseIntArray A07 = new SparseIntArray();

    private int A0B(C02760Bu r9, AnonymousClass0C4 r10, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!r10.A08) {
            AnonymousClass0UK r2 = this.A02;
            i2 = this.A01;
            i3 = 0;
            i4 = 0;
            i5 = r2.A00(i);
            for (int i6 = 0; i6 < i; i6++) {
                int A002 = r2.A00(i6);
                i4 += A002;
                if (i4 == i2) {
                    i3++;
                    i4 = 0;
                } else if (i4 > i2) {
                    i3++;
                    i4 = A002;
                }
            }
        } else {
            int A012 = r9.A01(i);
            if (A012 == -1) {
                Log.w("GridLayoutManager", AnonymousClass000.A0r("Cannot find span size for pre layout position. ", AnonymousClass000.A0u(), i));
                return 0;
            }
            AnonymousClass0UK r22 = this.A02;
            i2 = this.A01;
            i3 = 0;
            int i7 = 0;
            i5 = r22.A00(A012);
            for (int i8 = 0; i8 < A012; i8++) {
                int A003 = r22.A00(i8);
                i7 = i4 + A003;
                if (i7 == i2) {
                    i3++;
                    i7 = 0;
                } else if (i7 > i2) {
                    i3++;
                    i7 = A003;
                }
            }
        }
        if (i4 + i5 > i2) {
            return i3 + 1;
        }
        return i3;
    }

    private int A0C(C02760Bu r4, AnonymousClass0C4 r5, int i) {
        if (!r5.A08) {
            return this.A02.A01(i, this.A01);
        }
        int i2 = this.A06.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int A012 = r4.A01(i);
        if (A012 != -1) {
            return this.A02.A01(A012, this.A01);
        }
        Log.w("GridLayoutManager", AnonymousClass000.A0r("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", AnonymousClass000.A0u(), i));
        return 0;
    }

    private int A0D(C02760Bu r3, AnonymousClass0C4 r4, int i) {
        if (!r4.A08) {
            return this.A02.A00(i);
        }
        int i2 = this.A07.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int A012 = r3.A01(i);
        if (A012 != -1) {
            return this.A02.A00(A012);
        }
        Log.w("GridLayoutManager", AnonymousClass000.A0r("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", AnonymousClass000.A0u(), i));
        return 1;
    }

    private void A0F() {
        View[] viewArr = this.A04;
        if (viewArr == null || viewArr.length != this.A01) {
            this.A04 = new View[this.A01];
        }
    }

    private void A0G() {
        int A0N;
        int A0Q;
        if (this.A00 == 1) {
            A0N = this.A03 - A0P();
            A0Q = A0O();
        } else {
            A0N = this.A00 - A0N();
            A0Q = A0Q();
        }
        A0H(A0N - A0Q);
    }

    private void A0H(int i) {
        int i2;
        int length;
        int[] iArr = this.A03;
        int i3 = this.A01;
        if (!(iArr != null && (length = iArr.length) == i3 + 1 && iArr[length - 1] == i)) {
            iArr = new int[(i3 + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.A03 = iArr;
    }

    public int A0p(C02760Bu r3, AnonymousClass0C4 r4) {
        if (this.A00 == 1) {
            return this.A01;
        }
        int A002 = r4.A00();
        if (A002 < 1) {
            return 0;
        }
        return A0B(r3, r4, A002 - 1) + 1;
    }

    public int A0q(C02760Bu r3, AnonymousClass0C4 r4) {
        if (this.A00 == 0) {
            return this.A01;
        }
        int A002 = r4.A00();
        if (A002 < 1) {
            return 0;
        }
        return A0B(r3, r4, A002 - 1) + 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        if (A1n() == false) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A10(android.view.View r25, X.C02760Bu r26, X.AnonymousClass0C4 r27, int r28) {
        /*
            r24 = this;
            r7 = r24
            androidx.recyclerview.widget.RecyclerView r0 = r7.A07
            r21 = 0
            r3 = r25
            if (r0 == 0) goto L_0x001a
            android.view.View r6 = r0.A0P(r3)
            if (r6 == 0) goto L_0x001a
            X.0CI r0 = r7.A05
            java.util.List r0 = r0.A02
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r6 = r21
        L_0x001c:
            r20 = 0
            if (r6 == 0) goto L_0x0089
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            X.0I7 r0 = (X.AnonymousClass0I7) r0
            int r5 = r0.A00
            int r0 = r0.A01
            int r4 = r5 + r0
            r23 = r26
            r22 = r27
            r2 = r28
            r1 = r23
            r0 = r22
            android.view.View r0 = super.A10(r3, r1, r0, r2)
            if (r0 == 0) goto L_0x0089
            int r0 = r7.A1W(r2)
            r2 = 1
            boolean r1 = X.AnonymousClass000.A1S(r0, r2)
            boolean r0 = r7.A09
            int r9 = r7.A0L()
            if (r1 == r0) goto L_0x0112
            int r9 = r9 - r2
            r19 = -1
            r18 = -1
        L_0x0052:
            int r0 = r7.A00
            if (r0 != r2) goto L_0x005d
            boolean r0 = r7.A1n()
            r8 = 1
            if (r0 != 0) goto L_0x005e
        L_0x005d:
            r8 = 0
        L_0x005e:
            r1 = r23
            r0 = r22
            int r17 = r7.A0B(r1, r0, r9)
            r10 = 0
            r16 = -1
            r3 = -1
            r2 = 0
        L_0x006b:
            r0 = r19
            if (r9 == r0) goto L_0x010f
            r1 = r23
            r0 = r22
            int r1 = r7.A0B(r1, r0, r9)
            android.view.View r13 = r7.A0R(r9)
            if (r13 == r6) goto L_0x010f
            boolean r0 = r13.hasFocusable()
            if (r0 == 0) goto L_0x008a
            r0 = r17
            if (r1 == r0) goto L_0x008a
            if (r20 == 0) goto L_0x00c6
        L_0x0089:
            return r20
        L_0x008a:
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            X.0I7 r14 = (X.AnonymousClass0I7) r14
            int r12 = r14.A00
            int r0 = r14.A01
            int r11 = r12 + r0
            boolean r0 = r13.hasFocusable()
            if (r0 == 0) goto L_0x00a1
            if (r12 != r5) goto L_0x00a1
            if (r11 != r4) goto L_0x00a1
            return r13
        L_0x00a1:
            boolean r0 = r13.hasFocusable()
            if (r0 == 0) goto L_0x00a9
            if (r20 == 0) goto L_0x00b1
        L_0x00a9:
            boolean r0 = r13.hasFocusable()
            if (r0 != 0) goto L_0x00d7
            if (r21 != 0) goto L_0x00d7
        L_0x00b1:
            boolean r0 = r13.hasFocusable()
            if (r0 == 0) goto L_0x00c9
            int r0 = r14.A00
            r16 = r0
            int r10 = java.lang.Math.min(r11, r4)
            int r0 = java.lang.Math.max(r12, r5)
            int r10 = r10 - r0
            r20 = r13
        L_0x00c6:
            int r9 = r9 + r18
            goto L_0x006b
        L_0x00c9:
            int r3 = r14.A00
            int r2 = java.lang.Math.min(r11, r4)
            int r0 = java.lang.Math.max(r12, r5)
            int r2 = r2 - r0
            r21 = r13
            goto L_0x00c6
        L_0x00d7:
            int r0 = java.lang.Math.max(r12, r5)
            int r15 = java.lang.Math.min(r11, r4)
            int r15 = r15 - r0
            boolean r0 = r13.hasFocusable()
            if (r0 == 0) goto L_0x00f3
            if (r15 > r10) goto L_0x00b1
            if (r15 != r10) goto L_0x00c6
            r1 = 0
            r0 = r16
            if (r12 <= r0) goto L_0x00f0
            r1 = 1
        L_0x00f0:
            if (r8 != r1) goto L_0x00c6
            goto L_0x00b1
        L_0x00f3:
            if (r20 != 0) goto L_0x00c6
            r1 = 1
            X.0CU r0 = r7.A08
            boolean r0 = r0.A01(r13)
            if (r0 == 0) goto L_0x0107
            X.0CU r0 = r7.A09
            boolean r0 = r0.A01(r13)
            if (r0 == 0) goto L_0x0107
            goto L_0x00c6
        L_0x0107:
            if (r15 > r2) goto L_0x00b1
            if (r15 != r2) goto L_0x00c6
            if (r12 > r3) goto L_0x00f0
            r1 = 0
            goto L_0x00f0
        L_0x010f:
            if (r20 != 0) goto L_0x0089
            return r21
        L_0x0112:
            r19 = r9
            r9 = 0
            r18 = 1
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.A10(android.view.View, X.0Bu, X.0C4, int):android.view.View");
    }

    public AnonymousClass0D2 A11() {
        AnonymousClass0I7 r0;
        if (this.A00 == 0) {
            return r0;
        }
        r0 = new AnonymousClass0I7(-1, -2);
        return r0;
    }

    public AnonymousClass0D2 A12(Context context, AttributeSet attributeSet) {
        return new AnonymousClass0I7(context, attributeSet);
    }

    public AnonymousClass0D2 A13(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new AnonymousClass0I7((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new AnonymousClass0I7(layoutParams);
    }

    public void A18(Rect rect, int i, int i2) {
        int A002;
        int A003;
        if (this.A03 == null) {
            super.A18(rect, i, i2);
        }
        int A0O = A0O() + A0P();
        int A0Q = A0Q() + A0N();
        if (this.A00 == 1) {
            A003 = AnonymousClass0CP.A00(i2, rect.height() + A0Q, C011504z.A01(this.A07));
            int[] iArr = this.A03;
            A002 = AnonymousClass0CP.A00(i, iArr[iArr.length - 1] + A0O, C011504z.A02(this.A07));
        } else {
            A002 = AnonymousClass0CP.A00(i, rect.width() + A0O, C011504z.A02(this.A07));
            int[] iArr2 = this.A03;
            A003 = AnonymousClass0CP.A00(i2, iArr2[iArr2.length - 1] + A0Q, C011504z.A01(this.A07));
        }
        this.A07.setMeasuredDimension(A002, A003);
    }

    public void A1D(C02760Bu r7, AnonymousClass0C4 r8) {
        if (r8.A08) {
            int A0L = A0L();
            for (int i = 0; i < A0L; i++) {
                AnonymousClass0I7 r3 = (AnonymousClass0I7) A0R(i).getLayoutParams();
                int A012 = r3.A01();
                this.A07.put(A012, r3.A01);
                this.A06.put(A012, r3.A00);
            }
        }
        super.A1D(r7, r8);
        this.A07.clear();
        this.A06.clear();
    }

    public boolean A1Q() {
        if (this.A04 != null || this.A00) {
            return false;
        }
        return true;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c4  */
    public void A1i(X.AnonymousClass0CX r20, X.AnonymousClass0D0 r21, X.C02760Bu r22, X.AnonymousClass0C4 r23) {
        /*
            r19 = this;
            r8 = r19
            X.0CY r0 = r8.A05
            X.0sk r0 = (X.C18180sk) r0
            int r1 = r0.A00
            X.0CP r0 = r0.A02
            if (r1 == 0) goto L_0x0071
            int r5 = r0.A04
        L_0x000e:
            r0 = 1073741824(0x40000000, float:2.0)
            r7 = 1
            r3 = 0
            r18 = 0
            if (r5 == r0) goto L_0x0018
            r18 = 1
        L_0x0018:
            int r0 = r8.A0L()
            if (r0 <= 0) goto L_0x006f
            int[] r1 = r8.A03
            int r0 = r8.A01
            r2 = r1[r0]
        L_0x0024:
            if (r18 == 0) goto L_0x0029
            r8.A0G()
        L_0x0029:
            r4 = r21
            int r0 = r4.A0A
            boolean r17 = X.AnonymousClass000.A1S(r0, r7)
            int r14 = r8.A01
            r12 = r22
            r11 = r23
            if (r17 != 0) goto L_0x0046
            int r0 = r4.A08
            int r14 = r8.A0C(r12, r11, r0)
            int r0 = r4.A08
            int r0 = r8.A0D(r12, r11, r0)
            int r14 = r14 + r0
        L_0x0046:
            r6 = 0
        L_0x0047:
            int r0 = r8.A01
            if (r6 >= r0) goto L_0x0097
            int r13 = r4.A08
            if (r13 < 0) goto L_0x0097
            int r0 = r11.A00()
            if (r13 >= r0) goto L_0x0097
            if (r14 <= 0) goto L_0x0097
            int r10 = r8.A0D(r12, r11, r13)
            int r9 = r8.A01
            if (r10 > r9) goto L_0x0074
            int r14 = r14 - r10
            if (r14 < 0) goto L_0x0097
            android.view.View r1 = r4.A00(r12)
            if (r1 == 0) goto L_0x0097
            android.view.View[] r0 = r8.A04
            r0[r6] = r1
            int r6 = r6 + 1
            goto L_0x0047
        L_0x006f:
            r2 = 0
            goto L_0x0024
        L_0x0071:
            int r5 = r0.A01
            goto L_0x000e
        L_0x0074:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Item at position "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = " requires "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = " spans but GridLayoutManager has only "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " spans."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0c(r0, r1)
            throw r0
        L_0x0097:
            r10 = r20
            if (r6 != 0) goto L_0x009e
            r10.A01 = r7
            return
        L_0x009e:
            r16 = 0
            r14 = 0
            r13 = -1
            int r9 = r6 + -1
            r15 = -1
            if (r17 == 0) goto L_0x00c2
            r13 = r6
            r9 = 0
            r15 = 1
        L_0x00aa:
            android.view.View[] r0 = r8.A04
            r0 = r0[r9]
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            X.0I7 r1 = (X.AnonymousClass0I7) r1
            int r0 = X.AnonymousClass0CP.A02(r0)
            int r0 = r8.A0D(r12, r11, r0)
            r1.A01 = r0
            r1.A00 = r14
            int r14 = r14 + r0
            int r9 = r9 + r15
        L_0x00c2:
            if (r9 != r13) goto L_0x00aa
            r11 = 0
            r9 = 0
        L_0x00c6:
            if (r11 >= r6) goto L_0x0114
            android.view.View[] r0 = r8.A04
            r1 = r0[r11]
            java.util.List r0 = r4.A0B
            if (r0 != 0) goto L_0x0109
            if (r17 == 0) goto L_0x0105
            r0 = -1
            X.AnonymousClass0CP.A05(r1, r8, r0, r3)
        L_0x00d6:
            android.graphics.Rect r0 = r8.A05
            r8.A0Z(r1, r0)
            r8.A0I(r1, r5, r3)
            X.0CY r0 = r8.A05
            int r0 = r0.A07(r1)
            if (r0 <= r9) goto L_0x00e7
            r9 = r0
        L_0x00e7:
            android.view.ViewGroup$LayoutParams r12 = r1.getLayoutParams()
            X.0I7 r12 = (X.AnonymousClass0I7) r12
            r3 = 1065353216(0x3f800000, float:1.0)
            X.0CY r0 = r8.A05
            int r0 = r0.A08(r1)
            float r1 = (float) r0
            float r1 = r1 * r3
            int r0 = r12.A01
            float r0 = (float) r0
            float r1 = r1 / r0
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x0101
            r16 = r1
        L_0x0101:
            int r11 = r11 + 1
            r3 = 0
            goto L_0x00c6
        L_0x0105:
            X.AnonymousClass0CP.A05(r1, r8, r3, r3)
            goto L_0x00d6
        L_0x0109:
            if (r17 == 0) goto L_0x0110
            r0 = -1
            X.AnonymousClass0CP.A05(r1, r8, r0, r7)
            goto L_0x00d6
        L_0x0110:
            X.AnonymousClass0CP.A05(r1, r8, r3, r7)
            goto L_0x00d6
        L_0x0114:
            if (r18 == 0) goto L_0x013f
            int r0 = r8.A01
            float r0 = (float) r0
            float r16 = r16 * r0
            int r0 = java.lang.Math.round(r16)
            int r0 = java.lang.Math.max(r0, r2)
            r8.A0H(r0)
            r2 = 0
            r9 = 0
        L_0x0128:
            if (r2 >= r6) goto L_0x013f
            android.view.View[] r0 = r8.A04
            r1 = r0[r2]
            r0 = 1073741824(0x40000000, float:2.0)
            r8.A0I(r1, r0, r7)
            X.0CY r0 = r8.A05
            int r0 = r0.A07(r1)
            if (r0 <= r9) goto L_0x013c
            r9 = r0
        L_0x013c:
            int r2 = r2 + 1
            goto L_0x0128
        L_0x013f:
            if (r3 >= r6) goto L_0x01ce
            android.view.View[] r0 = r8.A04
            r11 = r0[r3]
            X.0CY r0 = r8.A05
            int r0 = r0.A07(r11)
            if (r0 == r9) goto L_0x01b2
            android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
            X.0I7 r13 = (X.AnonymousClass0I7) r13
            android.graphics.Rect r2 = r13.A03
            int r1 = r2.top
            int r0 = r2.bottom
            int r1 = r1 + r0
            int r12 = X.AnonymousClass000.A0E(r13, r1)
            int r1 = r2.left
            int r0 = r2.right
            int r1 = r1 + r0
            int r14 = X.AnonymousClass000.A0F(r13, r1)
            int r2 = r13.A00
            int r1 = r13.A01
            int r0 = r8.A00
            if (r0 != r7) goto L_0x01c5
            boolean r0 = r8.A1n()
            if (r0 == 0) goto L_0x01c5
            int[] r15 = r8.A03
            int r0 = r8.A01
            int r0 = r0 - r2
            r5 = r15[r0]
            int r0 = r0 - r1
            r0 = r15[r0]
            int r5 = r5 - r0
        L_0x0180:
            int r0 = r8.A00
            if (r0 != r7) goto L_0x01b5
            int r2 = r13.width
            r1 = 1073741824(0x40000000, float:2.0)
            r0 = 0
            int r14 = X.AnonymousClass0CP.A01(r5, r1, r14, r2, r0)
            int r0 = r9 - r12
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
        L_0x0193:
            android.view.ViewGroup$LayoutParams r5 = r11.getLayoutParams()
            int r1 = r11.getMeasuredWidth()
            int r0 = r5.width
            boolean r0 = X.AnonymousClass0CP.A07(r1, r14, r0)
            if (r0 == 0) goto L_0x01af
            int r1 = r11.getMeasuredHeight()
            int r0 = r5.height
            boolean r0 = X.AnonymousClass0CP.A07(r1, r2, r0)
            if (r0 != 0) goto L_0x01b2
        L_0x01af:
            r11.measure(r14, r2)
        L_0x01b2:
            int r3 = r3 + 1
            goto L_0x013f
        L_0x01b5:
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = 0
            int r0 = r9 - r14
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r0 = r13.height
            int r2 = X.AnonymousClass0CP.A01(r5, r2, r12, r0, r1)
            goto L_0x0193
        L_0x01c5:
            int[] r0 = r8.A03
            int r1 = r1 + r2
            r5 = r0[r1]
            r0 = r0[r2]
            int r5 = r5 - r0
            goto L_0x0180
        L_0x01ce:
            r5 = 0
            r10.A00 = r9
            int r2 = r8.A00
            r1 = -1
            int r3 = r4.A01
            int r0 = r4.A03
            if (r2 != r7) goto L_0x024e
            int r2 = r0 - r9
            if (r3 == r1) goto L_0x01e1
            int r9 = r9 + r0
            r2 = r0
            r0 = r9
        L_0x01e1:
            r9 = 0
            r11 = 0
        L_0x01e3:
            android.view.View[] r1 = r8.A04
            if (r5 >= r6) goto L_0x025b
            r4 = r1[r5]
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            X.0I7 r3 = (X.AnonymousClass0I7) r3
            int r1 = r8.A00
            if (r1 != r7) goto L_0x023b
            boolean r1 = r8.A1n()
            int r9 = r8.A0O()
            int[] r12 = r8.A03
            if (r1 == 0) goto L_0x022c
            int r11 = r8.A01
            int r1 = r3.A00
            int r11 = r11 - r1
            r1 = r12[r11]
            int r9 = r9 + r1
            X.0CY r1 = r8.A05
            int r1 = r1.A08(r4)
            int r11 = r9 - r1
        L_0x020f:
            X.AnonymousClass0CP.A04(r4, r11, r2, r9, r0)
            X.0D3 r1 = r3.A00
            int r3 = r1.A00
            r1 = r3 & 8
            if (r1 != 0) goto L_0x021e
            r1 = r3 & 2
            if (r1 == 0) goto L_0x0220
        L_0x021e:
            r10.A03 = r7
        L_0x0220:
            boolean r3 = r10.A02
            boolean r1 = r4.hasFocusable()
            r3 = r3 | r1
            r10.A02 = r3
            int r5 = r5 + 1
            goto L_0x01e3
        L_0x022c:
            int r1 = r3.A00
            r1 = r12[r1]
            int r9 = r9 + r1
            X.0CY r1 = r8.A05
            int r1 = r1.A08(r4)
            int r1 = r1 + r9
            r11 = r9
            r9 = r1
            goto L_0x020f
        L_0x023b:
            int r2 = r8.A0Q()
            int[] r1 = r8.A03
            int r0 = r3.A00
            r0 = r1[r0]
            int r2 = r2 + r0
            X.0CY r0 = r8.A05
            int r0 = r0.A08(r4)
            int r0 = r0 + r2
            goto L_0x020f
        L_0x024e:
            if (r3 != r1) goto L_0x0256
            int r11 = r0 - r9
            r2 = 0
            r9 = r0
            r0 = 0
            goto L_0x01e3
        L_0x0256:
            int r9 = r9 + r0
            r11 = r0
            r0 = 0
            r2 = 0
            goto L_0x01e3
        L_0x025b:
            r0 = 0
            java.util.Arrays.fill(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.A1i(X.0CX, X.0D0, X.0Bu, X.0C4):void");
    }

    public void A1j(AnonymousClass0D0 r6, AnonymousClass0C2 r7, AnonymousClass0C4 r8) {
        int i;
        int i2 = this.A01;
        for (int i3 = 0; i3 < this.A01 && (i = r6.A08) >= 0 && i < r8.A00() && i2 > 0; i3++) {
            r7.B0g(i, Math.max(0, r6.A04));
            i2 -= this.A02.A00(i);
            r6.A08 += r6.A0A;
        }
    }

    public void A1m(boolean z) {
        if (!z) {
            super.A1m(false);
            return;
        }
        throw AnonymousClass001.A0E("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public void A1o(int i) {
        if (i != this.A01) {
            this.A00 = true;
            if (i >= 1) {
                this.A01 = i;
                this.A02.A01.clear();
                A0S();
                return;
            }
            throw AnonymousClass000.A0d("Span count should be at least 1. Provided ", AnonymousClass000.A0u(), i);
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A1o(AnonymousClass0CP.A03(context, attributeSet, i, i2).A01);
    }

    private void A0I(View view, int i, boolean z) {
        int i2;
        int A012;
        int A013;
        AnonymousClass0I7 r6 = (AnonymousClass0I7) view.getLayoutParams();
        Rect rect = r6.A03;
        int A0E = AnonymousClass000.A0E(r6, rect.top + rect.bottom);
        int A0F = AnonymousClass000.A0F(r6, rect.left + rect.right);
        int i3 = r6.A00;
        int i4 = r6.A01;
        if (this.A00 != 1 || !A1n()) {
            int[] iArr = this.A03;
            i2 = iArr[i4 + i3] - iArr[i3];
        } else {
            int[] iArr2 = this.A03;
            int i5 = this.A01 - i3;
            i2 = iArr2[i5] - iArr2[i5 - i4];
        }
        if (this.A00 == 1) {
            A013 = AnonymousClass0CP.A01(i2, i, A0F, r6.width, false);
            A012 = AnonymousClass0CP.A01(this.A05.A05(), this.A01, A0E, r6.height, true);
        } else {
            A012 = AnonymousClass0CP.A01(i2, i, A0E, r6.height, false);
            A013 = AnonymousClass0CP.A01(this.A05.A05(), this.A04, A0F, r6.width, true);
        }
        AnonymousClass0D2 r2 = (AnonymousClass0D2) view.getLayoutParams();
        if (z) {
            if (AnonymousClass0CP.A07(view.getMeasuredWidth(), A013, r2.width) && AnonymousClass0CP.A07(view.getMeasuredHeight(), A012, r2.height)) {
                return;
            }
        } else if (!A0j(view, r2, A013, A012)) {
            return;
        }
        view.measure(A013, A012);
    }

    public int A0r(C02760Bu r2, AnonymousClass0C4 r3, int i) {
        A0G();
        A0F();
        return super.A0r(r2, r3, i);
    }

    public int A0s(C02760Bu r2, AnonymousClass0C4 r3, int i) {
        A0G();
        A0F();
        return super.A0s(r2, r3, i);
    }

    public int A0u(AnonymousClass0C4 r2) {
        return LinearLayoutManager.A09(this, r2);
    }

    public int A0v(AnonymousClass0C4 r2) {
        return LinearLayoutManager.A0A(this, r2);
    }

    public int A0x(AnonymousClass0C4 r2) {
        return LinearLayoutManager.A09(this, r2);
    }

    public int A0y(AnonymousClass0C4 r2) {
        return LinearLayoutManager.A0A(this, r2);
    }

    public void A1A(View view, C07650Ys r10, C02760Bu r11, AnonymousClass0C4 r12) {
        AccessibilityNodeInfo.CollectionItemInfo obtain;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof AnonymousClass0I7)) {
            super.A0a(view, r10);
            return;
        }
        AnonymousClass0I7 r1 = (AnonymousClass0I7) layoutParams;
        int A0B = A0B(r11, r12, r1.A01());
        if (this.A00 == 0) {
            obtain = AccessibilityNodeInfo.CollectionItemInfo.obtain(r1.A00, r1.A01, A0B, 1, false, false);
        } else {
            obtain = AccessibilityNodeInfo.CollectionItemInfo.obtain(A0B, 1, r1.A00, r1.A01, false, false);
        }
        r10.A0K(new AnonymousClass0SL(obtain));
    }

    public void A1F(AnonymousClass0C4 r2) {
        super.A1F(r2);
        this.A00 = false;
    }

    public View A1b(C02760Bu r8, AnonymousClass0C4 r9, int i, int i2, int i3) {
        A1e();
        int A042 = this.A05.A04();
        int A022 = this.A05.A02();
        int i4 = -1;
        if (i2 > i) {
            i4 = 1;
        }
        View view = null;
        View view2 = null;
        while (i != i2) {
            View A0R = A0R(i);
            int A023 = AnonymousClass0CP.A02(A0R);
            if (A023 >= 0 && A023 < i3 && A0C(r8, r9, A023) == 0) {
                if ((((AnonymousClass0D2) A0R.getLayoutParams()).A00.A00 & 8) != 0) {
                    if (view2 == null) {
                        view2 = A0R;
                    }
                } else if (this.A05.A09(A0R) < A022 && this.A05.A06(A0R) >= A042) {
                    return A0R;
                } else {
                    if (view == null) {
                        view = A0R;
                    }
                }
            }
            i += i4;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    public void A1h(AnonymousClass0CW r6, C02760Bu r7, AnonymousClass0C4 r8, int i) {
        A0G();
        if (r8.A00() > 0 && !r8.A08) {
            boolean A1S = AnonymousClass000.A1S(i, 1);
            int A0C = A0C(r7, r8, r6.A02);
            if (A1S) {
                while (A0C > 0) {
                    int i2 = r6.A02;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    r6.A02 = i3;
                    A0C = A0C(r7, r8, i3);
                }
            } else {
                int A002 = r8.A00() - 1;
                int i4 = r6.A02;
                while (i4 < A002) {
                    int i5 = i4 + 1;
                    int A0C2 = A0C(r7, r8, i5);
                    if (A0C2 <= A0C) {
                        break;
                    }
                    i4 = i5;
                    A0C = A0C2;
                }
                r6.A02 = i4;
            }
        }
        A0F();
    }

    public void A1H(RecyclerView recyclerView) {
        AnonymousClass0CP.A06(this);
    }

    public boolean A1R(AnonymousClass0D2 r2) {
        return r2 instanceof AnonymousClass0I7;
    }

    public void A1I(RecyclerView recyclerView, int i, int i2) {
        AnonymousClass0CP.A06(this);
    }

    public void A1J(RecyclerView recyclerView, int i, int i2) {
        AnonymousClass0CP.A06(this);
    }

    public void A1K(RecyclerView recyclerView, int i, int i2, int i3) {
        AnonymousClass0CP.A06(this);
    }

    public void A1L(RecyclerView recyclerView, Object obj, int i, int i2) {
        AnonymousClass0CP.A06(this);
    }

    public GridLayoutManager(int i, int i2) {
        super(i2);
        A1o(i);
    }

    public GridLayoutManager(int i) {
        super(1);
        A1o(i);
    }
}
