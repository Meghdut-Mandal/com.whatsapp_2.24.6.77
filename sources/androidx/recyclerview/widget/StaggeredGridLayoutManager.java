package androidx.recyclerview.widget;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass04F;
import X.AnonymousClass0C2;
import X.AnonymousClass0C4;
import X.AnonymousClass0CP;
import X.AnonymousClass0CQ;
import X.AnonymousClass0CY;
import X.AnonymousClass0D2;
import X.AnonymousClass0DE;
import X.AnonymousClass0I8;
import X.AnonymousClass0IE;
import X.AnonymousClass0SL;
import X.AnonymousClass0TB;
import X.AnonymousClass0U8;
import X.AnonymousClass0UC;
import X.AnonymousClass0V1;
import X.AnonymousClass0V8;
import X.C011504z;
import X.C02760Bu;
import X.C07650Ys;
import X.C08810bM;
import X.C08860bR;
import X.C11260fz;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends AnonymousClass0CP implements AnonymousClass0CQ {
    public int A00;
    public int A01 = 2;
    public int A02;
    public int A03 = -1;
    public int A04 = Integer.MIN_VALUE;
    public int A05;
    public int A06 = -1;
    public AnonymousClass0CY A07;
    public AnonymousClass0CY A08;
    public AnonymousClass0V1 A09 = new AnonymousClass0V1();
    public C08860bR A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D = false;
    public boolean A0E = false;
    public boolean A0F = true;
    public AnonymousClass0V8[] A0G;
    public BitSet A0H;
    public boolean A0I = false;
    public int[] A0J;
    public final Rect A0K = AnonymousClass001.A06();
    public final AnonymousClass0UC A0L;
    public final AnonymousClass0U8 A0M = new AnonymousClass0U8(this);
    public final Runnable A0N = new C11260fz(this);

    private int A0B(AnonymousClass0C4 r9) {
        if (A0L() == 0) {
            return 0;
        }
        AnonymousClass0CY r3 = this.A07;
        boolean z = this.A0F;
        boolean z2 = !z;
        return AnonymousClass0DE.A02(A1X(z2), A1W(z2), r3, this, r9, z, this.A0E);
    }

    public int A0t(AnonymousClass0C4 r8) {
        if (A0L() == 0) {
            return 0;
        }
        AnonymousClass0CY r3 = this.A07;
        boolean z = this.A0F;
        boolean z2 = !z;
        return AnonymousClass0DE.A00(A1X(z2), A1W(z2), r3, this, r8, z);
    }

    public int A0v(AnonymousClass0C4 r8) {
        if (A0L() == 0) {
            return 0;
        }
        AnonymousClass0CY r3 = this.A07;
        boolean z = this.A0F;
        boolean z2 = !z;
        return AnonymousClass0DE.A01(A1X(z2), A1W(z2), r3, this, r8, z);
    }

    public int A0w(AnonymousClass0C4 r8) {
        if (A0L() == 0) {
            return 0;
        }
        AnonymousClass0CY r3 = this.A07;
        boolean z = this.A0F;
        boolean z2 = !z;
        return AnonymousClass0DE.A00(A1X(z2), A1W(z2), r3, this, r8, z);
    }

    public int A0y(AnonymousClass0C4 r8) {
        if (A0L() == 0) {
            return 0;
        }
        AnonymousClass0CY r3 = this.A07;
        boolean z = this.A0F;
        boolean z2 = !z;
        return AnonymousClass0DE.A01(A1X(z2), A1W(z2), r3, this, r8, z);
    }

    public void A1D(C02760Bu r2, AnonymousClass0C4 r3) {
        A0H(r2, r3, true);
    }

    public void A1F(AnonymousClass0C4 r2) {
        this.A03 = -1;
        this.A04 = Integer.MIN_VALUE;
        this.A0A = null;
        this.A0M.A00();
    }

    public void A1I(RecyclerView recyclerView, int i, int i2) {
        A0E(i, i2, 1);
    }

    public void A1J(RecyclerView recyclerView, int i, int i2) {
        A0E(i, i2, 2);
    }

    public void A1L(RecyclerView recyclerView, Object obj, int i, int i2) {
        A0E(i, i2, 4);
    }

    public void A1Y(int i) {
        A1M((String) null);
        if (i != this.A06) {
            AnonymousClass0V1 r2 = this.A09;
            int[] iArr = r2.A01;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            r2.A00 = null;
            A0S();
            this.A06 = i;
            this.A0H = new BitSet(i);
            AnonymousClass0V8[] r22 = new AnonymousClass0V8[i];
            this.A0G = r22;
            for (int i2 = 0; i2 < i; i2++) {
                r22[i2] = new AnonymousClass0V8(this, i2);
            }
            A0S();
        }
    }

    public void A1Z(AnonymousClass0C4 r5, int i) {
        int A1S;
        int i2;
        if (i > 0) {
            A1S = A1T();
            i2 = 1;
        } else {
            A1S = A1S();
            i2 = -1;
        }
        AnonymousClass0UC r1 = this.A0L;
        r1.A04 = true;
        A0I(r5, A1S);
        A0D(i2);
        r1.A06 = A1S + r1.A07;
        r1.A00 = Math.abs(i);
    }

    private int A08(int i) {
        int A022 = this.A0G[0].A02(i);
        for (int i2 = 1; i2 < this.A06; i2++) {
            int A023 = this.A0G[i2].A02(i);
            if (A023 > A022) {
                A022 = A023;
            }
        }
        return A022;
    }

    private int A09(int i) {
        int A032 = this.A0G[0].A03(i);
        for (int i2 = 1; i2 < this.A06; i2++) {
            int A033 = this.A0G[i2].A03(i);
            if (A033 < A032) {
                A032 = A033;
            }
        }
        return A032;
    }

    /* JADX WARNING: type inference failed for: r14v0 */
    /* JADX WARNING: type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r14v3 */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0354  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x01af A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0189  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int A0A(X.AnonymousClass0UC r24, X.C02760Bu r25, X.AnonymousClass0C4 r26) {
        /*
            r23 = this;
            r9 = r23
            java.util.BitSet r1 = r9.A0H
            int r0 = r9.A06
            r14 = 0
            r8 = 1
            r1.set(r14, r0, r8)
            X.0UC r7 = r9.A0L
            boolean r0 = r7.A03
            r10 = r24
            int r3 = r10.A08
            if (r0 == 0) goto L_0x0035
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r8) goto L_0x001c
            r6 = 2147483647(0x7fffffff, float:NaN)
        L_0x001c:
            r2 = 0
        L_0x001d:
            int r0 = r9.A06
            if (r2 >= r0) goto L_0x0043
            X.0V8[] r1 = r9.A0G
            r0 = r1[r2]
            java.util.ArrayList r0 = r0.A03
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0032
            r0 = r1[r2]
            r9.A0J(r0, r3, r6)
        L_0x0032:
            int r2 = r2 + 1
            goto L_0x001d
        L_0x0035:
            if (r3 != r8) goto L_0x003d
            int r6 = r10.A01
            int r0 = r10.A00
            int r6 = r6 + r0
            goto L_0x001c
        L_0x003d:
            int r6 = r10.A02
            int r0 = r10.A00
            int r6 = r6 - r0
            goto L_0x001c
        L_0x0043:
            boolean r1 = r9.A0E
            X.0CY r0 = r9.A07
            r21 = r0
            if (r1 == 0) goto L_0x034c
            int r20 = r21.A02()
        L_0x004f:
            r2 = 0
        L_0x0050:
            int r1 = r10.A06
            r22 = r25
            if (r1 < 0) goto L_0x0352
            int r0 = r26.A00()
            if (r1 >= r0) goto L_0x0352
            boolean r0 = r7.A03
            if (r0 != 0) goto L_0x0068
            java.util.BitSet r0 = r9.A0H
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0352
        L_0x0068:
            int r1 = r10.A06
            r12 = 0
            r0 = r22
            android.view.View r5 = r0.A02(r1)
            int r1 = r10.A06
            int r0 = r10.A07
            int r1 = r1 + r0
            r10.A06 = r1
            android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
            X.0I8 r4 = (X.AnonymousClass0I8) r4
            int r3 = r4.A01()
            X.0V1 r2 = r9.A09
            int[] r1 = r2.A01
            if (r1 == 0) goto L_0x02e6
            int r0 = r1.length
            if (r3 >= r0) goto L_0x02e6
            r1 = r1[r3]
            r0 = -1
            if (r1 == r0) goto L_0x02e6
            r19 = 0
            X.0V8[] r0 = r9.A0G
            r1 = r0[r1]
        L_0x0096:
            r4.A00 = r1
            int r0 = r10.A08
            if (r0 != r8) goto L_0x02e1
            r0 = -1
            X.AnonymousClass0CP.A05(r5, r9, r0, r14)
        L_0x00a0:
            boolean r11 = r4.A01
            int r0 = r9.A02
            r18 = r0
            if (r11 == 0) goto L_0x02b4
            if (r0 != r8) goto L_0x029a
            int r13 = r9.A00
        L_0x00ac:
            int r14 = r9.A00
            int r12 = r9.A01
            int r11 = r9.A0Q()
            int r0 = r9.A0N()
            int r11 = r11 + r0
            int r0 = r4.height
            int r0 = X.AnonymousClass0CP.A01(r14, r12, r11, r0, r8)
        L_0x00bf:
            r9.A0F(r5, r13, r0)
        L_0x00c2:
            int r11 = r10.A08
            boolean r0 = r4.A01
            if (r11 != r8) goto L_0x010a
            if (r0 == 0) goto L_0x0103
            r0 = r20
            int r12 = r9.A08(r0)
        L_0x00d0:
            r0 = r21
            int r11 = r0.A07(r5)
            int r11 = r11 + r12
            if (r19 == 0) goto L_0x017e
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x017e
            X.0bM r14 = new X.0bM
            r14.<init>()
            int r0 = r9.A06
            int[] r0 = new int[r0]
            r14.A03 = r0
            r13 = 0
        L_0x00e9:
            int r0 = r9.A06
            if (r13 >= r0) goto L_0x00ff
            int[] r0 = r14.A03
            r15 = r0
            X.0V8[] r0 = r9.A0G
            r0 = r0[r13]
            int r0 = r0.A02(r12)
            int r0 = r12 - r0
            r15[r13] = r0
            int r13 = r13 + 1
            goto L_0x00e9
        L_0x00ff:
            r0 = -1
            r14.A00 = r0
            goto L_0x014a
        L_0x0103:
            r0 = r20
            int r12 = r1.A02(r0)
            goto L_0x00d0
        L_0x010a:
            if (r0 == 0) goto L_0x0141
            r0 = r20
            int r11 = r9.A09(r0)
        L_0x0112:
            r0 = r21
            int r0 = r0.A07(r5)
            int r12 = r11 - r0
            if (r19 == 0) goto L_0x017e
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x017e
            X.0bM r14 = new X.0bM
            r14.<init>()
            int r0 = r9.A06
            int[] r0 = new int[r0]
            r14.A03 = r0
            r13 = 0
        L_0x012c:
            int r0 = r9.A06
            if (r13 >= r0) goto L_0x0148
            int[] r0 = r14.A03
            r15 = r0
            X.0V8[] r0 = r9.A0G
            r0 = r0[r13]
            int r0 = r0.A03(r11)
            int r0 = r0 - r11
            r15[r13] = r0
            int r13 = r13 + 1
            goto L_0x012c
        L_0x0141:
            r0 = r20
            int r11 = r1.A03(r0)
            goto L_0x0112
        L_0x0148:
            r14.A00 = r8
        L_0x014a:
            r14.A01 = r3
            java.util.List r0 = r2.A00
            if (r0 != 0) goto L_0x0156
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            r2.A00 = r0
        L_0x0156:
            int r17 = r0.size()
            r13 = 0
        L_0x015b:
            r0 = r17
            if (r13 >= r0) goto L_0x01af
            X.0bM r16 = X.AnonymousClass0V1.A00(r2, r13)
            r0 = r16
            int r0 = r0.A01
            r15 = r0
            int r0 = r14.A01
            if (r15 != r0) goto L_0x0171
            java.util.List r0 = r2.A00
            r0.remove(r13)
        L_0x0171:
            r0 = r16
            int r0 = r0.A01
            int r15 = r14.A01
            if (r0 < r15) goto L_0x01ac
            java.util.List r0 = r2.A00
            r0.add(r13, r14)
        L_0x017e:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x01d7
            int r13 = r10.A07
            r0 = -1
            if (r13 != r0) goto L_0x01d7
            if (r19 != 0) goto L_0x01d5
            int r13 = r10.A08
            X.0V8[] r14 = r9.A0G
            r0 = 0
            r0 = r14[r0]
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r13 != r8) goto L_0x01b5
            int r16 = r0.A02(r14)
            r15 = 1
        L_0x0199:
            int r0 = r9.A06
            if (r15 >= r0) goto L_0x01d7
            X.0V8[] r0 = r9.A0G
            r0 = r0[r15]
            int r13 = r0.A02(r14)
            r0 = r16
            if (r13 != r0) goto L_0x01cd
            int r15 = r15 + 1
            goto L_0x0199
        L_0x01ac:
            int r13 = r13 + 1
            goto L_0x015b
        L_0x01af:
            java.util.List r0 = r2.A00
            r0.add(r14)
            goto L_0x017e
        L_0x01b5:
            int r16 = r0.A03(r14)
            r15 = 1
        L_0x01ba:
            int r0 = r9.A06
            if (r15 >= r0) goto L_0x01d7
            X.0V8[] r0 = r9.A0G
            r0 = r0[r15]
            int r13 = r0.A03(r14)
            r0 = r16
            if (r13 != r0) goto L_0x01cd
            int r15 = r15 + 1
            goto L_0x01ba
        L_0x01cd:
            X.0bM r0 = r2.A01(r3)
            if (r0 == 0) goto L_0x01d5
            r0.A02 = r8
        L_0x01d5:
            r9.A0I = r8
        L_0x01d7:
            int r2 = r10.A08
            boolean r0 = r4.A01
            if (r2 != r8) goto L_0x01f3
            if (r0 == 0) goto L_0x01ed
            int r2 = r9.A06
        L_0x01e1:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0208
            X.0V8[] r0 = r9.A0G
            r0 = r0[r2]
            r0.A0B(r5)
            goto L_0x01e1
        L_0x01ed:
            X.0V8 r0 = r4.A00
            r0.A0B(r5)
            goto L_0x0208
        L_0x01f3:
            if (r0 == 0) goto L_0x0203
            int r2 = r9.A06
        L_0x01f7:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0208
            X.0V8[] r0 = r9.A0G
            r0 = r0[r2]
            r0.A0C(r5)
            goto L_0x01f7
        L_0x0203:
            X.0V8 r0 = r4.A00
            r0.A0C(r5)
        L_0x0208:
            androidx.recyclerview.widget.RecyclerView r0 = r9.A07
            boolean r0 = X.AnonymousClass04F.A07(r0)
            if (r0 == 0) goto L_0x0250
            r0 = r18
            if (r0 != r8) goto L_0x0250
            boolean r0 = r4.A01
            X.0CY r13 = r9.A08
            int r3 = r13.A02()
            if (r0 != 0) goto L_0x0228
            int r2 = r9.A06
            int r2 = r2 - r8
            int r0 = r1.A04
            int r2 = r2 - r0
            int r0 = r9.A05
            int r2 = r2 * r0
            int r3 = r3 - r2
        L_0x0228:
            int r0 = r13.A07(r5)
            int r2 = r3 - r0
        L_0x022e:
            X.AnonymousClass0CP.A04(r5, r2, r12, r3, r11)
        L_0x0231:
            boolean r0 = r4.A01
            int r11 = r7.A08
            if (r0 == 0) goto L_0x0274
            r3 = 0
        L_0x0238:
            int r0 = r9.A06
            if (r3 >= r0) goto L_0x0277
            X.0V8[] r2 = r9.A0G
            r0 = r2[r3]
            java.util.ArrayList r0 = r0.A03
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x024d
            r0 = r2[r3]
            r9.A0J(r0, r11, r6)
        L_0x024d:
            int r3 = r3 + 1
            goto L_0x0238
        L_0x0250:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0267
            X.0CY r3 = r9.A08
            int r2 = r3.A04()
        L_0x025a:
            int r3 = r3.A07(r5)
            int r3 = r3 + r2
            r0 = r18
            if (r0 == r8) goto L_0x022e
            X.AnonymousClass0CP.A04(r5, r12, r2, r11, r3)
            goto L_0x0231
        L_0x0267:
            int r2 = r1.A04
            int r0 = r9.A05
            int r2 = r2 * r0
            X.0CY r3 = r9.A08
            int r0 = r3.A04()
            int r2 = r2 + r0
            goto L_0x025a
        L_0x0274:
            r9.A0J(r1, r11, r6)
        L_0x0277:
            r0 = r22
            r9.A0G(r7, r0)
            boolean r0 = r7.A05
            if (r0 == 0) goto L_0x028f
            boolean r0 = r5.hasFocusable()
            if (r0 == 0) goto L_0x028f
            boolean r0 = r4.A01
            java.util.BitSet r2 = r9.A0H
            if (r0 == 0) goto L_0x0293
            r2.clear()
        L_0x028f:
            r2 = 1
            r14 = 0
            goto L_0x0050
        L_0x0293:
            int r1 = r1.A04
            r0 = 0
            r2.set(r1, r0)
            goto L_0x028f
        L_0x029a:
            int r13 = r9.A03
            int r12 = r9.A04
            int r11 = r9.A0O()
            int r0 = r9.A0P()
            int r11 = r11 + r0
            int r0 = r4.width
            int r11 = X.AnonymousClass0CP.A01(r13, r12, r11, r0, r8)
            int r0 = r9.A00
            r9.A0F(r5, r11, r0)
            goto L_0x00c2
        L_0x02b4:
            if (r0 != r8) goto L_0x02c2
            int r12 = r9.A05
            int r11 = r9.A04
            int r0 = r4.width
            int r13 = X.AnonymousClass0CP.A01(r12, r11, r14, r0, r14)
            goto L_0x00ac
        L_0x02c2:
            int r13 = r9.A03
            int r12 = r9.A04
            int r11 = r9.A0O()
            int r0 = r9.A0P()
            int r11 = r11 + r0
            int r0 = r4.width
            int r13 = X.AnonymousClass0CP.A01(r13, r12, r11, r0, r8)
            int r12 = r9.A05
            int r11 = r9.A01
            int r0 = r4.height
            int r0 = X.AnonymousClass0CP.A01(r12, r11, r14, r0, r14)
            goto L_0x00bf
        L_0x02e1:
            X.AnonymousClass0CP.A05(r5, r9, r14, r14)
            goto L_0x00a0
        L_0x02e6:
            r19 = 1
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x02fb
            X.0V8[] r0 = r9.A0G
            r1 = r0[r14]
        L_0x02f0:
            r2.A04(r3)
            int[] r11 = r2.A01
            int r0 = r1.A04
            r11[r3] = r0
            goto L_0x0096
        L_0x02fb:
            int r0 = r10.A08
            boolean r0 = r9.A0K(r0)
            r13 = -1
            if (r0 == 0) goto L_0x032b
            int r12 = r9.A06
            int r12 = r12 - r8
            r18 = -1
        L_0x0309:
            int r0 = r10.A08
            r1 = 0
            if (r0 != r8) goto L_0x0330
            r17 = 2147483647(0x7fffffff, float:NaN)
            int r16 = r21.A04()
        L_0x0315:
            if (r12 == r13) goto L_0x02f0
            X.0V8[] r0 = r9.A0G
            r15 = r0[r12]
            r0 = r16
            int r11 = r15.A02(r0)
            r0 = r17
            if (r11 >= r0) goto L_0x0328
            r1 = r15
            r17 = r11
        L_0x0328:
            int r12 = r12 + r18
            goto L_0x0315
        L_0x032b:
            int r13 = r9.A06
            r18 = 1
            goto L_0x0309
        L_0x0330:
            r17 = -2147483648(0xffffffff80000000, float:-0.0)
            int r16 = r21.A02()
        L_0x0336:
            if (r12 == r13) goto L_0x02f0
            X.0V8[] r0 = r9.A0G
            r15 = r0[r12]
            r0 = r16
            int r11 = r15.A03(r0)
            r0 = r17
            if (r11 <= r0) goto L_0x0349
            r1 = r15
            r17 = r11
        L_0x0349:
            int r12 = r12 + r18
            goto L_0x0336
        L_0x034c:
            int r20 = r21.A04()
            goto L_0x004f
        L_0x0352:
            if (r2 != 0) goto L_0x0359
            r0 = r22
            r9.A0G(r7, r0)
        L_0x0359:
            int r1 = r7.A08
            r0 = -1
            if (r1 != r0) goto L_0x0374
            int r0 = r21.A04()
            int r0 = r9.A09(r0)
            int r1 = r21.A04()
        L_0x036a:
            int r1 = r1 - r0
            if (r1 <= 0) goto L_0x0373
            int r0 = r10.A00
            int r14 = java.lang.Math.min(r0, r1)
        L_0x0373:
            return r14
        L_0x0374:
            int r0 = r21.A02()
            int r1 = r9.A08(r0)
            int r0 = r21.A02()
            goto L_0x036a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A0A(X.0UC, X.0Bu, X.0C4):int");
    }

    private void A0C() {
        boolean z;
        if (this.A02 == 1 || !AnonymousClass04F.A07(this.A07)) {
            z = this.A0D;
        } else {
            z = !this.A0D;
        }
        this.A0E = z;
    }

    private void A0D(int i) {
        AnonymousClass0UC r3 = this.A0L;
        r3.A08 = i;
        int i2 = 1;
        if (this.A0E != AnonymousClass000.A1S(i, -1)) {
            i2 = -1;
        }
        r3.A07 = i2;
    }

    private void A0E(int i, int i2, int i3) {
        int A1S;
        int i4;
        int i5;
        int A1T;
        if (this.A0E) {
            A1S = A1T();
        } else {
            A1S = A1S();
        }
        if (i3 == 8) {
            i4 = i2 + 1;
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
            }
            i5 = i;
        } else {
            i4 = i + i2;
            i5 = i;
        }
        AnonymousClass0V1 r2 = this.A09;
        r2.A03(i5);
        if (i3 == 1) {
            r2.A05(i, i2);
        } else if (i3 == 2) {
            r2.A06(i, i2);
        } else if (i3 == 8) {
            r2.A06(i, 1);
            r2.A05(i2, 1);
        }
        if (i4 > A1S) {
            if (this.A0E) {
                A1T = A1S();
            } else {
                A1T = A1T();
            }
            if (i5 <= A1T) {
                A0S();
            }
        }
    }

    private void A0F(View view, int i, int i2) {
        int mode;
        int mode2;
        Rect rect = this.A0K;
        A0Z(view, rect);
        AnonymousClass0D2 r3 = (AnonymousClass0D2) view.getLayoutParams();
        int i3 = r3.leftMargin + rect.left;
        int i4 = r3.rightMargin + rect.right;
        if (!(i3 == 0 && i4 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) {
            i = View.MeasureSpec.makeMeasureSpec(AnonymousClass001.A02(View.MeasureSpec.getSize(i) - i3, i4, 0), mode);
        }
        int i5 = r3.topMargin + rect.top;
        int i6 = r3.bottomMargin + rect.bottom;
        if (!(i5 == 0 && i6 == 0) && ((mode2 = View.MeasureSpec.getMode(i2)) == Integer.MIN_VALUE || mode2 == 1073741824)) {
            i2 = View.MeasureSpec.makeMeasureSpec(AnonymousClass001.A02(View.MeasureSpec.getSize(i2) - i5, i6, 0), mode2);
        }
        if (A0j(view, r3, i, i2)) {
            view.measure(i, i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        if (r0 == -1) goto L_0x0011;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0G(X.AnonymousClass0UC r8, X.C02760Bu r9) {
        /*
            r7 = this;
            boolean r0 = r8.A04
            if (r0 == 0) goto L_0x0129
            boolean r0 = r8.A03
            if (r0 != 0) goto L_0x0129
            int r2 = r8.A00
            r1 = -1
            int r0 = r8.A08
            if (r2 != 0) goto L_0x0072
            if (r0 != r1) goto L_0x0126
        L_0x0011:
            int r1 = r8.A01
        L_0x0013:
            int r4 = r7.A0L()
            r3 = 1
            int r4 = r4 - r3
        L_0x0019:
            if (r4 < 0) goto L_0x0129
            android.view.View r2 = r7.A0R(r4)
            X.0CY r5 = r7.A07
            int r0 = r5.A09(r2)
            if (r0 < r1) goto L_0x0129
            int r0 = r5.A0B(r2)
            if (r0 < r1) goto L_0x0129
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            X.0I8 r5 = (X.AnonymousClass0I8) r5
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x005a
            r6 = 0
            r5 = 0
        L_0x0039:
            int r0 = r7.A06
            if (r5 >= r0) goto L_0x004c
            X.0V8[] r0 = r7.A0G
            r0 = r0[r5]
            java.util.ArrayList r0 = r0.A03
            int r0 = r0.size()
            if (r0 == r3) goto L_0x0129
            int r5 = r5 + 1
            goto L_0x0039
        L_0x004c:
            int r0 = r7.A06
            if (r6 >= r0) goto L_0x0069
            X.0V8[] r0 = r7.A0G
            r0 = r0[r6]
            r0.A09()
            int r6 = r6 + 1
            goto L_0x004c
        L_0x005a:
            X.0V8 r0 = r5.A00
            java.util.ArrayList r0 = r0.A03
            int r0 = r0.size()
            if (r0 == r3) goto L_0x0129
            X.0V8 r0 = r5.A00
            r0.A09()
        L_0x0069:
            r7.A0X(r2)
            r9.A07(r2)
            int r4 = r4 + -1
            goto L_0x0019
        L_0x0072:
            if (r0 != r1) goto L_0x00a0
            int r3 = r8.A02
            X.0V8[] r1 = r7.A0G
            r0 = 0
            r0 = r1[r0]
            int r2 = r0.A03(r3)
            r1 = 1
        L_0x0080:
            int r0 = r7.A06
            if (r1 >= r0) goto L_0x0092
            X.0V8[] r0 = r7.A0G
            r0 = r0[r1]
            int r0 = r0.A03(r3)
            if (r0 <= r2) goto L_0x008f
            r2 = r0
        L_0x008f:
            int r1 = r1 + 1
            goto L_0x0080
        L_0x0092:
            int r3 = r3 - r2
            if (r3 < 0) goto L_0x0011
            int r1 = r8.A01
            int r0 = r8.A00
            int r0 = java.lang.Math.min(r3, r0)
            int r1 = r1 - r0
            goto L_0x0013
        L_0x00a0:
            int r3 = r8.A01
            X.0V8[] r1 = r7.A0G
            r0 = 0
            r0 = r1[r0]
            int r2 = r0.A02(r3)
            r1 = 1
        L_0x00ac:
            int r0 = r7.A06
            if (r1 >= r0) goto L_0x00be
            X.0V8[] r0 = r7.A0G
            r0 = r0[r1]
            int r0 = r0.A02(r3)
            if (r0 >= r2) goto L_0x00bb
            r2 = r0
        L_0x00bb:
            int r1 = r1 + 1
            goto L_0x00ac
        L_0x00be:
            int r0 = r8.A01
            int r2 = r2 - r0
            if (r2 < 0) goto L_0x0126
            int r1 = r8.A02
            int r0 = r8.A00
            int r0 = java.lang.Math.min(r2, r0)
            int r0 = r0 + r1
        L_0x00cc:
            int r1 = r7.A0L()
            if (r1 <= 0) goto L_0x0129
            r5 = 0
            android.view.View r3 = r7.A0R(r5)
            X.0CY r2 = r7.A07
            int r1 = r2.A06(r3)
            if (r1 > r0) goto L_0x0129
            int r1 = r2.A0A(r3)
            if (r1 > r0) goto L_0x0129
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            X.0I8 r2 = (X.AnonymousClass0I8) r2
            boolean r1 = r2.A01
            r4 = 1
            if (r1 == 0) goto L_0x0112
            r2 = 0
        L_0x00f1:
            int r1 = r7.A06
            if (r2 >= r1) goto L_0x0104
            X.0V8[] r1 = r7.A0G
            r1 = r1[r2]
            java.util.ArrayList r1 = r1.A03
            int r1 = r1.size()
            if (r1 == r4) goto L_0x0129
            int r2 = r2 + 1
            goto L_0x00f1
        L_0x0104:
            int r1 = r7.A06
            if (r5 >= r1) goto L_0x011f
            X.0V8[] r1 = r7.A0G
            r1 = r1[r5]
            r1.A0A()
            int r5 = r5 + 1
            goto L_0x0104
        L_0x0112:
            X.0V8 r2 = r2.A00
            java.util.ArrayList r1 = r2.A03
            int r1 = r1.size()
            if (r1 == r4) goto L_0x0129
            r2.A0A()
        L_0x011f:
            r7.A0X(r3)
            r9.A07(r3)
            goto L_0x00cc
        L_0x0126:
            int r0 = r8.A02
            goto L_0x00cc
        L_0x0129:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A0G(X.0UC, X.0Bu):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (r2 != null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x03b3, code lost:
        if (A1a() != false) goto L_0x03b5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x03ac  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0H(X.C02760Bu r12, X.AnonymousClass0C4 r13, boolean r14) {
        /*
            r11 = this;
            X.0U8 r8 = r11.A0M
            X.0bR r2 = r11.A0A
            r1 = -1
            if (r2 != 0) goto L_0x000b
            int r0 = r11.A03
            if (r0 == r1) goto L_0x0018
        L_0x000b:
            int r0 = r13.A00()
            if (r0 != 0) goto L_0x0018
            r11.A0d(r12)
            r8.A00()
        L_0x0017:
            return
        L_0x0018:
            boolean r0 = r8.A00
            r7 = 0
            r6 = 1
            if (r0 == 0) goto L_0x0025
            int r0 = r11.A03
            if (r0 != r1) goto L_0x0025
            r9 = 0
            if (r2 == 0) goto L_0x00dd
        L_0x0025:
            r9 = 1
            r8.A00()
            X.0bR r3 = r11.A0A
            if (r3 == 0) goto L_0x00b1
            int r2 = r3.A02
            if (r2 <= 0) goto L_0x0075
            int r0 = r11.A06
            if (r2 != r0) goto L_0x0066
            r4 = 0
        L_0x0036:
            int r0 = r11.A06
            if (r4 >= r0) goto L_0x0075
            X.0V8[] r0 = r11.A0G
            r0 = r0[r4]
            r0.A08()
            X.0bR r2 = r11.A0A
            int[] r0 = r2.A09
            r3 = r0[r4]
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r0) goto L_0x0056
            boolean r2 = r2.A05
            X.0CY r0 = r11.A07
            if (r2 == 0) goto L_0x0061
            int r0 = r0.A02()
        L_0x0055:
            int r3 = r3 + r0
        L_0x0056:
            X.0V8[] r0 = r11.A0G
            r0 = r0[r4]
            r0.A01 = r3
            r0.A00 = r3
            int r4 = r4 + 1
            goto L_0x0036
        L_0x0061:
            int r0 = r0.A04()
            goto L_0x0055
        L_0x0066:
            r0 = 0
            r3.A09 = r0
            r3.A02 = r7
            r3.A01 = r7
            r3.A08 = r0
            r3.A04 = r0
            int r0 = r3.A03
            r3.A00 = r0
        L_0x0075:
            X.0bR r2 = r11.A0A
            boolean r0 = r2.A06
            r11.A0C = r0
            boolean r3 = r2.A07
            r0 = 0
            r11.A1M(r0)
            X.0bR r2 = r11.A0A
            if (r2 == 0) goto L_0x008b
            boolean r0 = r2.A07
            if (r0 == r3) goto L_0x008b
            r2.A07 = r3
        L_0x008b:
            r11.A0D = r3
            r11.A0S()
            r11.A0C()
            X.0bR r3 = r11.A0A
            int r0 = r3.A00
            if (r0 == r1) goto L_0x00ae
            r11.A03 = r0
            boolean r0 = r3.A05
        L_0x009d:
            r8.A04 = r0
            int r0 = r3.A01
            if (r0 <= r6) goto L_0x00b8
            X.0V1 r2 = r11.A09
            int[] r0 = r3.A08
            r2.A01 = r0
            java.util.List r0 = r3.A04
            r2.A00 = r0
            goto L_0x00b8
        L_0x00ae:
            boolean r0 = r11.A0E
            goto L_0x009d
        L_0x00b1:
            r11.A0C()
            boolean r0 = r11.A0E
            r8.A04 = r0
        L_0x00b8:
            boolean r0 = r13.A08
            r3 = 0
            if (r0 != 0) goto L_0x0134
            int r4 = r11.A03
            if (r4 == r1) goto L_0x0134
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 < 0) goto L_0x0130
            int r0 = r13.A00()
            if (r4 >= r0) goto L_0x0130
            X.0bR r2 = r11.A0A
            if (r2 == 0) goto L_0x01a7
            int r0 = r2.A00
            if (r0 == r1) goto L_0x01a7
            int r0 = r2.A02
            if (r0 < r6) goto L_0x01a7
            r8.A01 = r5
            r8.A02 = r4
        L_0x00db:
            r8.A00 = r6
        L_0x00dd:
            X.0bR r0 = r11.A0A
            if (r0 != 0) goto L_0x0103
            int r0 = r11.A03
            if (r0 != r1) goto L_0x0103
            boolean r2 = r8.A04
            boolean r0 = r11.A0B
            if (r2 != r0) goto L_0x00f5
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            boolean r2 = X.AnonymousClass04F.A07(r0)
            boolean r0 = r11.A0C
            if (r2 == r0) goto L_0x0103
        L_0x00f5:
            X.0V1 r2 = r11.A09
            int[] r0 = r2.A01
            if (r0 == 0) goto L_0x00fe
            java.util.Arrays.fill(r0, r1)
        L_0x00fe:
            r0 = 0
            r2.A00 = r0
            r8.A03 = r6
        L_0x0103:
            int r0 = r11.A0L()
            if (r0 <= 0) goto L_0x02a7
            X.0bR r0 = r11.A0A
            if (r0 == 0) goto L_0x0111
            int r0 = r0.A02
            if (r0 >= r6) goto L_0x02a7
        L_0x0111:
            boolean r0 = r8.A03
            if (r0 == 0) goto L_0x022d
            r4 = 0
        L_0x0116:
            int r0 = r11.A06
            if (r4 >= r0) goto L_0x02a7
            X.0V8[] r3 = r11.A0G
            r0 = r3[r4]
            r0.A08()
            int r2 = r8.A01
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r0) goto L_0x012d
            r0 = r3[r4]
            r0.A01 = r2
            r0.A00 = r2
        L_0x012d:
            int r4 = r4 + 1
            goto L_0x0116
        L_0x0130:
            r11.A03 = r1
            r11.A04 = r5
        L_0x0134:
            boolean r0 = r11.A0B
            int r4 = r13.A00()
            if (r0 == 0) goto L_0x0155
            int r2 = r11.A0L()
        L_0x0140:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x016c
            android.view.View r0 = r11.A0R(r2)
            int r0 = X.AnonymousClass0CP.A02(r0)
            if (r0 < 0) goto L_0x0140
            if (r0 >= r4) goto L_0x0140
        L_0x0150:
            r8.A02 = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0182
        L_0x0155:
            int r3 = r11.A0L()
            r2 = 0
        L_0x015a:
            if (r2 >= r3) goto L_0x016c
            android.view.View r0 = r11.A0R(r2)
            int r0 = X.AnonymousClass0CP.A02(r0)
            if (r0 < 0) goto L_0x0169
            if (r0 >= r4) goto L_0x0169
            goto L_0x0150
        L_0x0169:
            int r2 = r2 + 1
            goto L_0x015a
        L_0x016c:
            r0 = 0
            goto L_0x0150
        L_0x016e:
            X.0CY r3 = r11.A07
            int r2 = r3.A07(r4)
            int r0 = r3.A05()
            if (r2 <= r0) goto L_0x018b
            boolean r0 = r8.A04
            if (r0 == 0) goto L_0x0186
            int r0 = r3.A02()
        L_0x0182:
            r8.A01 = r0
            goto L_0x00db
        L_0x0186:
            int r0 = r3.A04()
            goto L_0x0182
        L_0x018b:
            int r2 = r3.A09(r4)
            int r0 = r3.A04()
            int r2 = r2 - r0
            if (r2 >= 0) goto L_0x0198
            int r0 = -r2
            goto L_0x0182
        L_0x0198:
            int r2 = r3.A02()
            int r0 = r3.A06(r4)
            int r2 = r2 - r0
            if (r2 < 0) goto L_0x01cd
            r8.A01 = r5
            goto L_0x00db
        L_0x01a7:
            android.view.View r4 = r11.A0k(r4)
            if (r4 == 0) goto L_0x01e2
            boolean r0 = r11.A0E
            if (r0 == 0) goto L_0x01dd
            int r0 = r11.A1T()
        L_0x01b5:
            r8.A02 = r0
            int r0 = r11.A04
            if (r0 == r5) goto L_0x016e
            boolean r0 = r8.A04
            X.0CY r3 = r11.A07
            if (r0 == 0) goto L_0x01d1
            int r2 = r3.A02()
            int r0 = r11.A04
            int r2 = r2 - r0
            int r0 = r3.A06(r4)
        L_0x01cc:
            int r2 = r2 - r0
        L_0x01cd:
            r8.A01 = r2
            goto L_0x00db
        L_0x01d1:
            int r2 = r3.A04()
            int r0 = r11.A04
            int r2 = r2 + r0
            int r0 = r3.A09(r4)
            goto L_0x01cc
        L_0x01dd:
            int r0 = r11.A1S()
            goto L_0x01b5
        L_0x01e2:
            int r2 = r11.A03
            r8.A02 = r2
            int r4 = r11.A04
            if (r4 != r5) goto L_0x0219
            int r0 = r11.A0L()
            if (r0 != 0) goto L_0x020c
            boolean r0 = r11.A0E
            if (r0 == 0) goto L_0x01f5
        L_0x01f4:
            r3 = 1
        L_0x01f5:
            r8.A04 = r3
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r8.A06
            X.0CY r0 = r0.A07
            if (r3 == 0) goto L_0x0207
            int r0 = r0.A02()
        L_0x0201:
            r8.A01 = r0
            r8.A03 = r6
            goto L_0x00db
        L_0x0207:
            int r0 = r0.A04()
            goto L_0x0201
        L_0x020c:
            int r0 = r11.A1S()
            boolean r2 = X.AnonymousClass000.A1T(r2, r0)
            boolean r0 = r11.A0E
            if (r2 == r0) goto L_0x01f4
            goto L_0x01f5
        L_0x0219:
            boolean r2 = r8.A04
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r8.A06
            X.0CY r0 = r0.A07
            if (r2 == 0) goto L_0x0227
            int r0 = r0.A02()
            int r0 = r0 - r4
            goto L_0x0201
        L_0x0227:
            int r0 = r0.A04()
            int r0 = r0 + r4
            goto L_0x0201
        L_0x022d:
            if (r9 != 0) goto L_0x0248
            int[] r4 = r8.A05
            if (r4 == 0) goto L_0x0248
            r3 = 0
        L_0x0234:
            int r0 = r11.A06
            if (r3 >= r0) goto L_0x02a7
            X.0V8[] r0 = r11.A0G
            r2 = r0[r3]
            r2.A08()
            r0 = r4[r3]
            r2.A01 = r0
            r2.A00 = r0
            int r3 = r3 + 1
            goto L_0x0234
        L_0x0248:
            r5 = 0
        L_0x0249:
            int r0 = r11.A06
            X.0V8[] r9 = r11.A0G
            if (r5 >= r0) goto L_0x0284
            r9 = r9[r5]
            boolean r10 = r11.A0E
            int r4 = r8.A01
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == 0) goto L_0x027f
            int r2 = r9.A02(r3)
        L_0x025d:
            r9.A08()
            if (r2 == r3) goto L_0x0275
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r9.A05
            X.0CY r0 = r0.A07
            if (r10 == 0) goto L_0x0278
            int r0 = r0.A02()
            if (r2 < r0) goto L_0x0275
        L_0x026e:
            if (r4 == r3) goto L_0x0271
            int r2 = r2 + r4
        L_0x0271:
            r9.A00 = r2
            r9.A01 = r2
        L_0x0275:
            int r5 = r5 + 1
            goto L_0x0249
        L_0x0278:
            int r0 = r0.A04()
            if (r2 <= r0) goto L_0x026e
            goto L_0x0275
        L_0x027f:
            int r2 = r9.A03(r3)
            goto L_0x025d
        L_0x0284:
            int r5 = r9.length
            int[] r0 = r8.A05
            if (r0 == 0) goto L_0x028c
            int r0 = r0.length
            if (r0 >= r5) goto L_0x0295
        L_0x028c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r8.A06
            X.0V8[] r0 = r0.A0G
            int r0 = r0.length
            int[] r0 = new int[r0]
            r8.A05 = r0
        L_0x0295:
            r4 = 0
        L_0x0296:
            if (r4 >= r5) goto L_0x02a7
            int[] r3 = r8.A05
            r2 = r9[r4]
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2.A03(r0)
            r3[r4] = r0
            int r4 = r4 + 1
            goto L_0x0296
        L_0x02a7:
            r11.A0c(r12)
            X.0UC r3 = r11.A0L
            r3.A04 = r7
            r11.A0I = r7
            X.0CY r2 = r11.A08
            int r4 = r2.A05()
            int r0 = r11.A06
            int r0 = r4 / r0
            r11.A05 = r0
            int r0 = r2.A03()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r0)
            r11.A00 = r0
            int r0 = r8.A02
            r11.A0I(r13, r0)
            boolean r0 = r8.A04
            if (r0 == 0) goto L_0x0318
            r11.A0D(r1)
            r11.A0A(r3, r12, r13)
            r11.A0D(r6)
        L_0x02d8:
            int r1 = r8.A02
            int r0 = r3.A07
            int r1 = r1 + r0
            r3.A06 = r1
            r11.A0A(r3, r12, r13)
            int r1 = r2.A03()
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 == r0) goto L_0x0350
            r1 = 0
            int r5 = r11.A0L()
            r4 = 0
            r9 = 0
        L_0x02f1:
            if (r9 >= r5) goto L_0x0322
            android.view.View r10 = r11.A0R(r9)
            int r0 = r2.A07(r10)
            float r3 = (float) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0315
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            X.0I8 r0 = (X.AnonymousClass0I8) r0
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0311
            r0 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 * r0
            int r0 = r11.A06
            float r0 = (float) r0
            float r3 = r3 / r0
        L_0x0311:
            float r1 = java.lang.Math.max(r1, r3)
        L_0x0315:
            int r9 = r9 + 1
            goto L_0x02f1
        L_0x0318:
            r11.A0D(r6)
            r11.A0A(r3, r12, r13)
            r11.A0D(r1)
            goto L_0x02d8
        L_0x0322:
            int r3 = r11.A05
            int r0 = r11.A06
            float r0 = (float) r0
            float r1 = r1 * r0
            int r1 = java.lang.Math.round(r1)
            int r9 = r2.A03()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 != r0) goto L_0x033c
            int r0 = r2.A05()
            int r1 = java.lang.Math.min(r1, r0)
        L_0x033c:
            int r0 = r11.A06
            int r0 = r1 / r0
            r11.A05 = r0
            int r0 = r2.A03()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            r11.A00 = r0
            int r0 = r11.A05
            if (r0 != r3) goto L_0x0406
        L_0x0350:
            int r0 = r11.A0L()
            if (r0 <= 0) goto L_0x038c
            boolean r0 = r11.A0E
            if (r0 == 0) goto L_0x03d3
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r11.A08(r1)
            if (r0 == r1) goto L_0x0377
            X.0CY r2 = r11.A07
            int r1 = r2.A02()
            int r1 = r1 - r0
            if (r1 <= 0) goto L_0x0377
            int r0 = -r1
            int r0 = r11.A1U(r12, r13, r0)
            int r0 = -r0
            int r1 = r1 - r0
            if (r1 <= 0) goto L_0x0377
            r2.A0C(r1)
        L_0x0377:
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = r11.A09(r0)
            if (r1 == r0) goto L_0x038c
            X.0CY r0 = r11.A07
            int r0 = r0.A04()
            int r1 = r1 - r0
            if (r1 <= 0) goto L_0x038c
            r11.A1U(r12, r13, r1)
        L_0x038c:
            if (r14 == 0) goto L_0x03d1
            boolean r0 = r13.A08
            if (r0 != 0) goto L_0x03d1
            int r0 = r11.A01
            if (r0 == 0) goto L_0x03d1
            int r0 = r11.A0L()
            if (r0 <= 0) goto L_0x03d1
            boolean r0 = r11.A0I
            if (r0 != 0) goto L_0x03a6
            android.view.View r0 = r11.A1V()
            if (r0 == 0) goto L_0x03d1
        L_0x03a6:
            java.lang.Runnable r1 = r11.A0N
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            if (r0 == 0) goto L_0x03af
            r0.removeCallbacks(r1)
        L_0x03af:
            boolean r0 = r11.A1a()
            if (r0 == 0) goto L_0x03d1
        L_0x03b5:
            boolean r0 = r13.A08
            if (r0 == 0) goto L_0x03bc
            r8.A00()
        L_0x03bc:
            boolean r0 = r8.A04
            r11.A0B = r0
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            boolean r0 = X.AnonymousClass04F.A07(r0)
            r11.A0C = r0
            if (r6 == 0) goto L_0x0017
            r8.A00()
            r11.A0H(r12, r13, r7)
            return
        L_0x03d1:
            r6 = 0
            goto L_0x03b5
        L_0x03d3:
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r2 = r11.A09(r0)
            if (r2 == r0) goto L_0x03f0
            X.0CY r1 = r11.A07
            int r0 = r1.A04()
            int r2 = r2 - r0
            if (r2 <= 0) goto L_0x03f0
            int r0 = r11.A1U(r12, r13, r2)
            int r2 = r2 - r0
            if (r2 <= 0) goto L_0x03f0
            int r0 = -r2
            r1.A0C(r0)
        L_0x03f0:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r11.A08(r0)
            if (r1 == r0) goto L_0x038c
            X.0CY r0 = r11.A07
            int r0 = r0.A02()
            int r0 = r0 - r1
            if (r0 <= 0) goto L_0x038c
            int r0 = -r0
            r11.A1U(r12, r13, r0)
            goto L_0x038c
        L_0x0406:
            if (r4 >= r5) goto L_0x0350
            android.view.View r2 = r11.A0R(r4)
            android.view.ViewGroup$LayoutParams r9 = r2.getLayoutParams()
            X.0I8 r9 = (X.AnonymousClass0I8) r9
            boolean r0 = r9.A01
            if (r0 != 0) goto L_0x0434
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            boolean r0 = X.AnonymousClass04F.A07(r0)
            if (r0 == 0) goto L_0x0437
            int r0 = r11.A02
            if (r0 != r6) goto L_0x0437
            int r1 = r11.A06
            int r1 = r1 - r6
            X.0V8 r0 = r9.A00
            int r0 = r0.A04
            int r1 = r1 - r0
            int r9 = -r1
            int r0 = r11.A05
            int r1 = r9 * r0
            int r9 = r9 * r3
        L_0x0430:
            int r1 = r1 - r9
            r2.offsetLeftAndRight(r1)
        L_0x0434:
            int r4 = r4 + 1
            goto L_0x0406
        L_0x0437:
            X.0V8 r0 = r9.A00
            int r9 = r0.A04
            int r0 = r11.A05
            int r1 = r9 * r0
            int r9 = r9 * r3
            int r0 = r11.A02
            if (r0 == r6) goto L_0x0430
            int r1 = r1 - r9
            r2.offsetTopAndBottom(r1)
            goto L_0x0434
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A0H(X.0Bu, X.0C4, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r1 == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r1 == false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0I(X.AnonymousClass0C4 r8, int r9) {
        /*
            r7 = this;
            X.0UC r4 = r7.A0L
            r3 = 0
            r4.A00 = r3
            r4.A06 = r9
            X.0V2 r0 = r7.A06
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.A05
            r0 = 1
            if (r1 != 0) goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            r6 = 1
            if (r0 == 0) goto L_0x0064
            int r1 = r8.A06
            r0 = -1
            if (r1 == r0) goto L_0x0064
            boolean r2 = r7.A0E
            boolean r1 = X.AnonymousClass000.A1T(r1, r9)
            X.0CY r0 = r7.A07
            int r5 = r0.A05()
            if (r2 == r1) goto L_0x0065
            r2 = r5
            r5 = 0
        L_0x0029:
            androidx.recyclerview.widget.RecyclerView r0 = r7.A07
            if (r0 == 0) goto L_0x0032
            boolean r1 = r0.A0R
            r0 = 1
            if (r1 != 0) goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            X.0CY r1 = r7.A07
            if (r0 == 0) goto L_0x0059
            int r0 = r1.A04()
            int r0 = r0 - r2
            r4.A02 = r0
            int r0 = r1.A02()
            int r0 = r0 + r5
            r4.A01 = r0
        L_0x0045:
            r4.A05 = r3
            r4.A04 = r6
            int r0 = r1.A03()
            if (r0 != 0) goto L_0x0056
            int r0 = r1.A01()
            if (r0 != 0) goto L_0x0056
            r3 = 1
        L_0x0056:
            r4.A03 = r3
            return
        L_0x0059:
            int r0 = r1.A01()
            int r0 = r0 + r5
            r4.A01 = r0
            int r0 = -r2
            r4.A02 = r0
            goto L_0x0045
        L_0x0064:
            r5 = 0
        L_0x0065:
            r2 = 0
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A0I(X.0C4, int):void");
    }

    private void A0J(AnonymousClass0V8 r5, int i, int i2) {
        int i3 = r5.A02;
        if (i == -1) {
            int i4 = r5.A01;
            if (i4 == Integer.MIN_VALUE) {
                r5.A07();
                i4 = r5.A01;
            }
            if (i4 + i3 > i2) {
                return;
            }
        } else {
            int i5 = r5.A00;
            if (i5 == Integer.MIN_VALUE) {
                r5.A06();
                i5 = r5.A00;
            }
            if (i5 - i3 < i2) {
                return;
            }
        }
        this.A0H.set(r5.A04, false);
    }

    private boolean A0K(int i) {
        int i2 = this.A02;
        boolean A1S = AnonymousClass000.A1S(i, -1);
        boolean z = this.A0E;
        if (i2 == 0) {
            if (A1S != z) {
                return true;
            }
            return false;
        } else if (AnonymousClass000.A1S(A1S ? 1 : 0, z ? 1 : 0) == AnonymousClass04F.A07(this.A07)) {
            return true;
        } else {
            return false;
        }
    }

    public int A0p(C02760Bu r3, AnonymousClass0C4 r4) {
        if (this.A02 == 1) {
            return this.A06;
        }
        return super.A0p(r3, r4);
    }

    public int A0q(C02760Bu r2, AnonymousClass0C4 r3) {
        if (this.A02 == 0) {
            return this.A06;
        }
        return super.A0q(r2, r3);
    }

    public Parcelable A0z() {
        C08860bR r4;
        int A1S;
        View A1X;
        int A022;
        int A032;
        int A042;
        int[] iArr;
        C08860bR r0 = this.A0A;
        if (r0 == null) {
            r4 = new C08860bR();
            r4.A07 = this.A0D;
            r4.A05 = this.A0B;
            r4.A06 = this.A0C;
            AnonymousClass0V1 r1 = this.A09;
            if (r1 == null || (iArr = r1.A01) == null) {
                r4.A01 = 0;
            } else {
                r4.A08 = iArr;
                r4.A01 = iArr.length;
                r4.A04 = r1.A00;
            }
            if (A0L() > 0) {
                if (this.A0B) {
                    A1S = A1T();
                } else {
                    A1S = A1S();
                }
                r4.A00 = A1S;
                if (this.A0E) {
                    A1X = A1W(true);
                } else {
                    A1X = A1X(true);
                }
                if (A1X == null) {
                    A022 = -1;
                } else {
                    A022 = AnonymousClass0CP.A02(A1X);
                }
                r4.A03 = A022;
                int i = this.A06;
                r4.A02 = i;
                r4.A09 = new int[i];
                for (int i2 = 0; i2 < this.A06; i2++) {
                    boolean z = this.A0B;
                    AnonymousClass0V8 r02 = this.A0G[i2];
                    if (z) {
                        A032 = r02.A02(Integer.MIN_VALUE);
                        if (A032 != Integer.MIN_VALUE) {
                            A042 = this.A07.A02();
                        } else {
                            r4.A09[i2] = A032;
                        }
                    } else {
                        A032 = r02.A03(Integer.MIN_VALUE);
                        if (A032 != Integer.MIN_VALUE) {
                            A042 = this.A07.A04();
                        } else {
                            r4.A09[i2] = A032;
                        }
                    }
                    A032 -= A042;
                    r4.A09[i2] = A032;
                }
            } else {
                r4.A00 = -1;
                r4.A03 = -1;
                r4.A02 = 0;
                return r4;
            }
        }
        return r4;
    }

    public AnonymousClass0D2 A11() {
        AnonymousClass0I8 r0;
        if (this.A02 == 0) {
            return r0;
        }
        r0 = new AnonymousClass0I8(-1, -2);
        return r0;
    }

    public AnonymousClass0D2 A12(Context context, AttributeSet attributeSet) {
        return new AnonymousClass0I8(context, attributeSet);
    }

    public AnonymousClass0D2 A13(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new AnonymousClass0I8((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new AnonymousClass0I8(layoutParams);
    }

    public void A16(int i) {
        if (i == 0) {
            A1a();
        }
    }

    public void A17(int i) {
        C08860bR r1 = this.A0A;
        if (!(r1 == null || r1.A00 == i)) {
            r1.A09 = null;
            r1.A02 = 0;
            r1.A00 = -1;
            r1.A03 = -1;
        }
        this.A03 = i;
        this.A04 = Integer.MIN_VALUE;
        A0S();
    }

    public void A19(Parcelable parcelable) {
        if (parcelable instanceof C08860bR) {
            this.A0A = (C08860bR) parcelable;
            A0S();
        }
    }

    public void A1C(AnonymousClass0C2 r7, AnonymousClass0C4 r8, int i, int i2) {
        int A022;
        int i3;
        if (this.A02 != 0) {
            i = i2;
        }
        if (A0L() != 0 && i != 0) {
            A1Z(r8, i);
            int[] iArr = this.A0J;
            if (iArr == null || iArr.length < this.A06) {
                this.A0J = new int[this.A06];
            }
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < this.A06; i6++) {
                AnonymousClass0UC r5 = this.A0L;
                if (r5.A07 == -1) {
                    A022 = r5.A02;
                    i3 = this.A0G[i6].A03(A022);
                } else {
                    A022 = this.A0G[i6].A02(r5.A01);
                    i3 = r5.A01;
                }
                int i7 = A022 - i3;
                if (i7 >= 0) {
                    this.A0J[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.A0J, 0, i5);
            while (i4 < i5) {
                AnonymousClass0UC r2 = this.A0L;
                int i8 = r2.A06;
                if (i8 >= 0 && i8 < r8.A00()) {
                    r7.B0g(i8, this.A0J[i4]);
                    r2.A06 += r2.A07;
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    public void A1E(C02760Bu r3, RecyclerView recyclerView) {
        Runnable runnable = this.A0N;
        RecyclerView recyclerView2 = this.A07;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(runnable);
        }
        for (int i = 0; i < this.A06; i++) {
            this.A0G[i].A08();
        }
        recyclerView.requestLayout();
    }

    public void A1H(RecyclerView recyclerView) {
        AnonymousClass0V1 r2 = this.A09;
        int[] iArr = r2.A01;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        r2.A00 = null;
        A0S();
    }

    public void A1K(RecyclerView recyclerView, int i, int i2, int i3) {
        A0E(i, i2, 8);
    }

    public void A1M(String str) {
        if (this.A0A == null) {
            super.A1M(str);
        }
    }

    public boolean A1N() {
        return AnonymousClass000.A1Q(this.A02);
    }

    public boolean A1O() {
        return AnonymousClass000.A1O(this.A02);
    }

    public boolean A1P() {
        return AnonymousClass000.A1P(this.A01);
    }

    public boolean A1Q() {
        return AnonymousClass000.A1W(this.A0A);
    }

    public View A1W(boolean z) {
        AnonymousClass0CY r7 = this.A07;
        int A042 = r7.A04();
        int A022 = r7.A02();
        View view = null;
        for (int A0L2 = A0L() - 1; A0L2 >= 0; A0L2--) {
            View A0R = A0R(A0L2);
            int A092 = r7.A09(A0R);
            int A062 = r7.A06(A0R);
            if (A062 > A042 && A092 < A022) {
                if (A062 <= A022 || !z) {
                    return A0R;
                }
                if (view == null) {
                    view = A0R;
                }
            }
        }
        return view;
    }

    public View A1X(boolean z) {
        AnonymousClass0CY r8 = this.A07;
        int A042 = r8.A04();
        int A022 = r8.A02();
        int A0L2 = A0L();
        View view = null;
        for (int i = 0; i < A0L2; i++) {
            View A0R = A0R(i);
            int A092 = r8.A09(A0R);
            if (r8.A06(A0R) > A042 && A092 < A022) {
                if (A092 >= A042 || !z) {
                    return A0R;
                }
                if (view == null) {
                    view = A0R;
                }
            }
        }
        return view;
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        AnonymousClass0TB A032 = AnonymousClass0CP.A03(context, attributeSet, i, i2);
        int i3 = A032.A00;
        if (i3 == 0 || i3 == 1) {
            A1M((String) null);
            if (i3 != this.A02) {
                this.A02 = i3;
                AnonymousClass0CY r1 = this.A07;
                this.A07 = this.A08;
                this.A08 = r1;
                A0S();
            }
            A1Y(A032.A01);
            boolean z = A032.A02;
            A1M((String) null);
            C08860bR r12 = this.A0A;
            if (!(r12 == null || r12.A07 == z)) {
                r12.A07 = z;
            }
            this.A0D = z;
            A0S();
            this.A0L = new AnonymousClass0UC();
            this.A07 = AnonymousClass0CY.A00(this, this.A02);
            this.A08 = AnonymousClass0CY.A00(this, 1 - this.A02);
            return;
        }
        throw AnonymousClass001.A08("invalid orientation.");
    }

    public int A0r(C02760Bu r2, AnonymousClass0C4 r3, int i) {
        return A1U(r2, r3, i);
    }

    public int A0s(C02760Bu r2, AnonymousClass0C4 r3, int i) {
        return A1U(r2, r3, i);
    }

    public int A0u(AnonymousClass0C4 r2) {
        return A0B(r2);
    }

    public int A0x(AnonymousClass0C4 r2) {
        return A0B(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0088, code lost:
        if (r11.A02 == 1) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0095, code lost:
        if (X.AnonymousClass04F.A07(r11.A07) != false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a2, code lost:
        if (X.AnonymousClass04F.A07(r11.A07) != false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a7, code lost:
        if (r11.A02 == 0) goto L_0x00a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0127 A[LOOP:3: B:89:0x0127->B:98:0x013e, LOOP_START, PHI: r5 
      PHI: (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:75:0x0101, B:98:0x013e] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A10(android.view.View r12, X.C02760Bu r13, X.AnonymousClass0C4 r14, int r15) {
        /*
            r11 = this;
            int r0 = r11.A0L()
            r10 = 0
            if (r0 == 0) goto L_0x0146
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            if (r0 == 0) goto L_0x0146
            android.view.View r2 = r0.A0P(r12)
            if (r2 == 0) goto L_0x0146
            X.0CI r0 = r11.A05
            java.util.List r0 = r0.A02
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0146
            r11.A0C()
            r3 = -1
            r6 = 1
            if (r15 == r6) goto L_0x0098
            r0 = 2
            if (r15 == r0) goto L_0x008b
            r0 = 17
            if (r15 == r0) goto L_0x00a5
            r0 = 33
            if (r15 == r0) goto L_0x0086
            r0 = 66
            if (r15 == r0) goto L_0x0081
            r0 = 130(0x82, float:1.82E-43)
            if (r15 != r0) goto L_0x0146
            int r0 = r11.A02
            if (r0 != r6) goto L_0x0146
        L_0x0039:
            r7 = 1
        L_0x003a:
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            X.0I8 r0 = (X.AnonymousClass0I8) r0
            boolean r8 = r0.A01
            X.0V8 r4 = r0.A00
            if (r7 != r6) goto L_0x007c
            int r9 = r11.A1T()
        L_0x004a:
            r11.A0I(r14, r9)
            r11.A0D(r7)
            X.0UC r1 = r11.A0L
            int r0 = r1.A07
            int r0 = r0 + r9
            r1.A06 = r0
            r5 = 1051372203(0x3eaaaaab, float:0.33333334)
            X.0CY r0 = r11.A07
            int r0 = r0.A05()
            float r0 = (float) r0
            float r0 = r0 * r5
            int r0 = (int) r0
            r1.A00 = r0
            r1.A05 = r6
            r5 = 0
            r1.A04 = r5
            r11.A0A(r1, r13, r14)
            boolean r0 = r11.A0E
            r11.A0B = r0
            if (r8 != 0) goto L_0x00ab
            android.view.View r0 = r4.A05(r9, r7)
            if (r0 == 0) goto L_0x00ab
            if (r0 == r2) goto L_0x00ab
            return r0
        L_0x007c:
            int r9 = r11.A1S()
            goto L_0x004a
        L_0x0081:
            int r0 = r11.A02
            if (r0 != 0) goto L_0x0146
            goto L_0x0039
        L_0x0086:
            int r0 = r11.A02
            if (r0 != r6) goto L_0x0146
            goto L_0x00a9
        L_0x008b:
            int r0 = r11.A02
            if (r0 == r6) goto L_0x0039
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            boolean r0 = X.AnonymousClass04F.A07(r0)
            if (r0 == 0) goto L_0x0039
            goto L_0x00a9
        L_0x0098:
            int r0 = r11.A02
            if (r0 == r6) goto L_0x00a9
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            boolean r0 = X.AnonymousClass04F.A07(r0)
            if (r0 == 0) goto L_0x00a9
            goto L_0x0039
        L_0x00a5:
            int r0 = r11.A02
            if (r0 != 0) goto L_0x0146
        L_0x00a9:
            r7 = -1
            goto L_0x003a
        L_0x00ab:
            boolean r0 = r11.A0K(r7)
            if (r0 == 0) goto L_0x00c6
            int r1 = r11.A06
            int r1 = r1 - r6
        L_0x00b4:
            if (r1 < 0) goto L_0x00db
            X.0V8[] r0 = r11.A0G
            r0 = r0[r1]
            android.view.View r0 = r0.A05(r9, r7)
            if (r0 == 0) goto L_0x00c3
            if (r0 == r2) goto L_0x00c3
            return r0
        L_0x00c3:
            int r1 = r1 + -1
            goto L_0x00b4
        L_0x00c6:
            r1 = 0
        L_0x00c7:
            int r0 = r11.A06
            if (r1 >= r0) goto L_0x00db
            X.0V8[] r0 = r11.A0G
            r0 = r0[r1]
            android.view.View r0 = r0.A05(r9, r7)
            if (r0 == 0) goto L_0x00d8
            if (r0 == r2) goto L_0x00d8
            return r0
        L_0x00d8:
            int r1 = r1 + 1
            goto L_0x00c7
        L_0x00db:
            boolean r0 = r11.A0D
            r1 = r0 ^ 1
            boolean r0 = X.AnonymousClass000.A1S(r7, r3)
            boolean r3 = X.AnonymousClass000.A1S(r1, r0)
            if (r8 != 0) goto L_0x00fd
            if (r3 == 0) goto L_0x00f8
            int r0 = r4.A00()
        L_0x00ef:
            android.view.View r0 = r11.A0k(r0)
            if (r0 == 0) goto L_0x00fd
            if (r0 == r2) goto L_0x00fd
            return r0
        L_0x00f8:
            int r0 = r4.A01()
            goto L_0x00ef
        L_0x00fd:
            boolean r0 = r11.A0K(r7)
            if (r0 == 0) goto L_0x0127
            int r1 = r11.A06
            int r1 = r1 - r6
        L_0x0106:
            if (r1 < 0) goto L_0x0146
            int r0 = r4.A04
            if (r1 == r0) goto L_0x0124
            X.0V8[] r0 = r11.A0G
            r0 = r0[r1]
            if (r3 == 0) goto L_0x011f
            int r0 = r0.A00()
        L_0x0116:
            android.view.View r0 = r11.A0k(r0)
            if (r0 == 0) goto L_0x0124
            if (r0 == r2) goto L_0x0124
            return r0
        L_0x011f:
            int r0 = r0.A01()
            goto L_0x0116
        L_0x0124:
            int r1 = r1 + -1
            goto L_0x0106
        L_0x0127:
            int r0 = r11.A06
            if (r5 >= r0) goto L_0x0146
            X.0V8[] r0 = r11.A0G
            r0 = r0[r5]
            if (r3 == 0) goto L_0x0141
            int r0 = r0.A00()
        L_0x0135:
            android.view.View r0 = r11.A0k(r0)
            if (r0 == 0) goto L_0x013e
            if (r0 == r2) goto L_0x013e
            return r0
        L_0x013e:
            int r5 = r5 + 1
            goto L_0x0127
        L_0x0141:
            int r0 = r0.A01()
            goto L_0x0135
        L_0x0146:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A10(android.view.View, X.0Bu, X.0C4, int):android.view.View");
    }

    public void A14(int i) {
        super.A14(i);
        for (int i2 = 0; i2 < this.A06; i2++) {
            AnonymousClass0V8 r2 = this.A0G[i2];
            int i3 = r2.A01;
            if (i3 != Integer.MIN_VALUE) {
                r2.A01 = i3 + i;
            }
            int i4 = r2.A00;
            if (i4 != Integer.MIN_VALUE) {
                r2.A00 = i4 + i;
            }
        }
    }

    public void A15(int i) {
        super.A15(i);
        for (int i2 = 0; i2 < this.A06; i2++) {
            AnonymousClass0V8 r2 = this.A0G[i2];
            int i3 = r2.A01;
            if (i3 != Integer.MIN_VALUE) {
                r2.A01 = i3 + i;
            }
            int i4 = r2.A00;
            if (i4 != Integer.MIN_VALUE) {
                r2.A00 = i4 + i;
            }
        }
    }

    public void A18(Rect rect, int i, int i2) {
        int A002;
        int A003;
        int A0O = A0O() + A0P();
        int A0Q = A0Q() + A0N();
        if (this.A02 == 1) {
            A003 = AnonymousClass0CP.A00(i2, rect.height() + A0Q, C011504z.A01(this.A07));
            A002 = AnonymousClass0CP.A00(i, (this.A05 * this.A06) + A0O, C011504z.A02(this.A07));
        } else {
            A002 = AnonymousClass0CP.A00(i, rect.width() + A0O, C011504z.A02(this.A07));
            A003 = AnonymousClass0CP.A00(i2, (this.A05 * this.A06) + A0Q, C011504z.A01(this.A07));
        }
        this.A07.setMeasuredDimension(A002, A003);
    }

    public void A1A(View view, C07650Ys r10, C02760Bu r11, AnonymousClass0C4 r12) {
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof AnonymousClass0I8)) {
            super.A0a(view, r10);
            return;
        }
        AnonymousClass0I8 r1 = (AnonymousClass0I8) layoutParams;
        if (this.A02 == 0) {
            AnonymousClass0V8 r0 = r1.A00;
            if (r0 == null) {
                i = -1;
            } else {
                i = r0.A04;
            }
            if (r1.A01) {
                i4 = this.A06;
            } else {
                i4 = 1;
            }
            i2 = -1;
            i3 = -1;
        } else {
            i = -1;
            AnonymousClass0V8 r02 = r1.A00;
            if (r02 == null) {
                i2 = -1;
            } else {
                i2 = r02.A04;
            }
            if (r1.A01) {
                i3 = this.A06;
            } else {
                i3 = 1;
            }
            i4 = -1;
        }
        r10.A0K(new AnonymousClass0SL(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i4, i2, i3, false, false)));
    }

    public void A1B(AccessibilityEvent accessibilityEvent) {
        super.A1B(accessibilityEvent);
        if (A0L() > 0) {
            View A1X = A1X(false);
            View A1W = A1W(false);
            if (A1X != null && A1W != null) {
                int A022 = AnonymousClass0CP.A02(A1X);
                int A023 = AnonymousClass0CP.A02(A1W);
                if (A022 < A023) {
                    accessibilityEvent.setFromIndex(A022);
                    accessibilityEvent.setToIndex(A023);
                    return;
                }
                accessibilityEvent.setFromIndex(A023);
                accessibilityEvent.setToIndex(A022);
            }
        }
    }

    public void A1G(AnonymousClass0C4 r3, RecyclerView recyclerView, int i) {
        AnonymousClass0IE r0 = new AnonymousClass0IE(recyclerView.getContext());
        r0.A00 = i;
        A0g(r0);
    }

    public int A1S() {
        if (A0L() != 0) {
            return AnonymousClass0CP.A02(A0R(0));
        }
        return 0;
    }

    public int A1T() {
        int A0L2 = A0L();
        if (A0L2 == 0) {
            return 0;
        }
        return AnonymousClass0CP.A02(A0R(A0L2 - 1));
    }

    public int A1U(C02760Bu r5, AnonymousClass0C4 r6, int i) {
        if (A0L() == 0 || i == 0) {
            return 0;
        }
        A1Z(r6, i);
        AnonymousClass0UC r2 = this.A0L;
        int A0A2 = A0A(r2, r5, r6);
        if (r2.A00 >= A0A2) {
            int i2 = i;
            i = A0A2;
            if (i2 < 0) {
                i = -A0A2;
            }
        }
        this.A07.A0C(-i);
        this.A0B = this.A0E;
        r2.A00 = 0;
        A0G(r2, r5);
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (X.AnonymousClass04F.A07(r11.A07) == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A1V() {
        /*
            r11 = this;
            int r6 = r11.A0L()
            r2 = 1
            int r6 = r6 - r2
            int r1 = r11.A06
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>(r1)
            r0 = 0
            r5.set(r0, r1, r2)
            int r0 = r11.A02
            r10 = -1
            if (r0 != r2) goto L_0x001f
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            boolean r0 = X.AnonymousClass04F.A07(r0)
            r9 = 1
            if (r0 != 0) goto L_0x0020
        L_0x001f:
            r9 = -1
        L_0x0020:
            boolean r0 = r11.A0E
            r4 = -1
            if (r0 != 0) goto L_0x0028
            int r4 = r6 + 1
            r6 = 0
        L_0x0028:
            if (r6 >= r4) goto L_0x002b
            r10 = 1
        L_0x002b:
            if (r6 == r4) goto L_0x00d8
            android.view.View r3 = r11.A0R(r6)
            android.view.ViewGroup$LayoutParams r7 = r3.getLayoutParams()
            X.0I8 r7 = (X.AnonymousClass0I8) r7
            X.0V8 r0 = r7.A00
            int r0 = r0.A04
            boolean r0 = r5.get(r0)
            if (r0 == 0) goto L_0x0091
            X.0V8 r8 = r7.A00
            boolean r0 = r11.A0E
            r2 = 0
            if (r0 == 0) goto L_0x0074
            int r1 = r8.A00
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r0) goto L_0x0053
            r8.A06()
            int r1 = r8.A00
        L_0x0053:
            X.0CY r0 = r11.A07
            int r0 = r0.A02()
            if (r1 >= r0) goto L_0x008a
            java.util.ArrayList r1 = r8.A03
            int r0 = r1.size()
            int r2 = r0 + -1
        L_0x0063:
            android.view.View r0 = X.AnonymousClass000.A0Z(r1, r2)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.0I8 r0 = (X.AnonymousClass0I8) r0
            boolean r0 = r0.A01
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x008a
            return r3
        L_0x0074:
            int r1 = r8.A01
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r0) goto L_0x007f
            r8.A07()
            int r1 = r8.A01
        L_0x007f:
            X.0CY r0 = r11.A07
            int r0 = r0.A04()
            if (r1 <= r0) goto L_0x008a
            java.util.ArrayList r1 = r8.A03
            goto L_0x0063
        L_0x008a:
            X.0V8 r0 = r7.A00
            int r0 = r0.A04
            r5.clear(r0)
        L_0x0091:
            boolean r0 = r7.A01
            if (r0 != 0) goto L_0x00d5
            int r0 = r6 + r10
            if (r0 == r4) goto L_0x00d5
            android.view.View r2 = r11.A0R(r0)
            boolean r1 = r11.A0E
            X.0CY r0 = r11.A07
            if (r1 == 0) goto L_0x00ae
            int r1 = r0.A06(r3)
            int r0 = r0.A06(r2)
            if (r1 >= r0) goto L_0x00b9
            return r3
        L_0x00ae:
            int r1 = r0.A09(r3)
            int r0 = r0.A09(r2)
            if (r1 <= r0) goto L_0x00b9
            return r3
        L_0x00b9:
            if (r1 != r0) goto L_0x00d5
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            X.0I8 r1 = (X.AnonymousClass0I8) r1
            X.0V8 r0 = r7.A00
            int r2 = r0.A04
            X.0V8 r0 = r1.A00
            int r0 = r0.A04
            int r2 = r2 - r0
            r1 = 0
            if (r2 >= 0) goto L_0x00ce
            r1 = 1
        L_0x00ce:
            r0 = 0
            if (r9 >= 0) goto L_0x00d2
            r0 = 1
        L_0x00d2:
            if (r1 == r0) goto L_0x00d5
            return r3
        L_0x00d5:
            int r6 = r6 + r10
            goto L_0x002b
        L_0x00d8:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A1V():android.view.View");
    }

    public boolean A1a() {
        int A1S;
        int A1T;
        int i;
        int i2;
        if (!(A0L() == 0 || this.A01 == 0 || !this.A0A)) {
            if (this.A0E) {
                A1S = A1T();
                A1T = A1S();
            } else {
                A1S = A1S();
                A1T = A1T();
            }
            if (A1S == 0 && A1V() != null) {
                AnonymousClass0V1 r2 = this.A09;
                int[] iArr = r2.A01;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                r2.A00 = null;
            } else if (this.A0I) {
                int i3 = 1;
                if (this.A0E) {
                    i3 = -1;
                }
                AnonymousClass0V1 r8 = this.A09;
                int i4 = A1T + 1;
                List list = r8.A00;
                if (list != null) {
                    int size = list.size();
                    int i5 = 0;
                    while (i5 < size) {
                        C08810bM A002 = AnonymousClass0V1.A00(r8, i5);
                        int i6 = A002.A01;
                        if (i6 >= i4) {
                            break;
                        } else if (i6 < A1S || (A002.A00 != i3 && !A002.A02)) {
                            i5++;
                        } else {
                            int i7 = -i3;
                            List list2 = r8.A00;
                            if (list2 != null) {
                                int size2 = list2.size();
                                int i8 = 0;
                                while (true) {
                                    if (i8 < size2) {
                                        C08810bM A003 = AnonymousClass0V1.A00(r8, i8);
                                        i2 = A003.A01;
                                        if (i2 >= i6) {
                                            break;
                                        } else if (i2 < A1S || !(i7 == 0 || A003.A00 == i7 || A003.A02)) {
                                            i8++;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                i = i2 + 1;
                                r8.A02(i);
                            }
                            i = A002.A01;
                            r8.A02(i);
                        }
                    }
                }
                this.A0I = false;
                r8.A02(i4);
            }
            this.A0C = true;
            A0S();
            return true;
        }
        return false;
    }

    public PointF B3K(int i) {
        int i2 = -1;
        if (A0L() != 0 ? AnonymousClass000.A1T(i, A1S()) == this.A0E : this.A0E) {
            i2 = 1;
        }
        PointF pointF = new PointF();
        if (this.A02 == 0) {
            pointF.x = (float) i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = (float) i2;
        return pointF;
    }

    public boolean A1R(AnonymousClass0D2 r2) {
        return r2 instanceof AnonymousClass0I8;
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.A02 = i2;
        A1Y(i);
        this.A0L = new AnonymousClass0UC();
        this.A07 = AnonymousClass0CY.A00(this, this.A02);
        this.A08 = AnonymousClass0CY.A00(this, 1 - this.A02);
    }
}
