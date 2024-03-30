package androidx.recyclerview.widget;

import X.AnonymousClass04F;
import X.AnonymousClass0C2;
import X.AnonymousClass0C4;
import X.AnonymousClass0CP;
import X.AnonymousClass0CQ;
import X.AnonymousClass0CR;
import X.AnonymousClass0CU;
import X.AnonymousClass0CW;
import X.AnonymousClass0CX;
import X.AnonymousClass0CY;
import X.AnonymousClass0D0;
import X.AnonymousClass0D2;
import X.AnonymousClass0DE;
import X.AnonymousClass0IE;
import X.AnonymousClass0TB;
import X.C02760Bu;
import X.C08850bQ;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class LinearLayoutManager extends AnonymousClass0CP implements AnonymousClass0CQ, AnonymousClass0CR {
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass0D0 A03;
    public C08850bQ A04;
    public AnonymousClass0CY A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public int A0B;
    public boolean A0C;
    public int[] A0D;
    public final AnonymousClass0CW A0E;
    public final AnonymousClass0CX A0F;

    public static int A08(LinearLayoutManager linearLayoutManager, AnonymousClass0C4 r7) {
        LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
        if (linearLayoutManager.A0L() == 0) {
            return 0;
        }
        linearLayoutManager.A1e();
        AnonymousClass0CY r3 = linearLayoutManager.A05;
        boolean z = linearLayoutManager.A0C;
        boolean z2 = !z;
        return AnonymousClass0DE.A00(linearLayoutManager2.A1d(z2), linearLayoutManager2.A1c(z2), r3, linearLayoutManager2, r7, z);
    }

    public static int A09(LinearLayoutManager linearLayoutManager, AnonymousClass0C4 r8) {
        LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
        if (linearLayoutManager.A0L() == 0) {
            return 0;
        }
        linearLayoutManager.A1e();
        AnonymousClass0CY r3 = linearLayoutManager.A05;
        boolean z = linearLayoutManager.A0C;
        boolean z2 = !z;
        return AnonymousClass0DE.A02(linearLayoutManager.A1d(z2), linearLayoutManager.A1c(z2), r3, linearLayoutManager2, r8, z, linearLayoutManager.A09);
    }

    public static int A0A(LinearLayoutManager linearLayoutManager, AnonymousClass0C4 r7) {
        LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
        if (linearLayoutManager.A0L() == 0) {
            return 0;
        }
        linearLayoutManager.A1e();
        AnonymousClass0CY r3 = linearLayoutManager.A05;
        boolean z = linearLayoutManager.A0C;
        boolean z2 = !z;
        return AnonymousClass0DE.A01(linearLayoutManager2.A1d(z2), linearLayoutManager2.A1c(z2), r3, linearLayoutManager2, r7, z);
    }

    public AnonymousClass0D2 A11() {
        return new AnonymousClass0D2(-2, -2);
    }

    public void A1F(AnonymousClass0C4 r2) {
        this.A04 = null;
        this.A01 = -1;
        this.A02 = Integer.MIN_VALUE;
        this.A0E.A00();
    }

    public boolean A1P() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0033 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0046 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A1W(int r5) {
        /*
            r4 = this;
            r3 = -1
            r2 = 1
            if (r5 == r2) goto L_0x0037
            r0 = 2
            if (r5 == r0) goto L_0x0024
            r0 = 17
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r0) goto L_0x001f
            r0 = 33
            if (r5 == r0) goto L_0x0042
            r0 = 66
            if (r5 == r0) goto L_0x001a
            r0 = 130(0x82, float:1.82E-43)
            if (r5 == r0) goto L_0x002f
            return r1
        L_0x001a:
            int r0 = r4.A00
            if (r0 != 0) goto L_0x0034
            return r2
        L_0x001f:
            int r0 = r4.A00
            if (r0 != 0) goto L_0x0047
            return r3
        L_0x0024:
            int r0 = r4.A00
            if (r0 == r2) goto L_0x0033
            boolean r0 = r4.A1n()
            if (r0 == 0) goto L_0x0033
            return r3
        L_0x002f:
            int r0 = r4.A00
            if (r0 != r2) goto L_0x0034
        L_0x0033:
            return r2
        L_0x0034:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            return r2
        L_0x0037:
            int r0 = r4.A00
            if (r0 == r2) goto L_0x0046
            boolean r0 = r4.A1n()
            if (r0 == 0) goto L_0x0046
            return r2
        L_0x0042:
            int r0 = r4.A00
            if (r0 != r2) goto L_0x0047
        L_0x0046:
            return r3
        L_0x0047:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A1W(int):int");
    }

    public View A1c(boolean z) {
        int A0L;
        int i;
        if (this.A09) {
            A0L = 0;
            i = A0L();
        } else {
            A0L = A0L() - 1;
            i = -1;
        }
        return A1a(A0L, i, z, true);
    }

    public View A1d(boolean z) {
        int i;
        int A0L;
        if (this.A09) {
            i = A0L() - 1;
            A0L = -1;
        } else {
            i = 0;
            A0L = A0L();
        }
        return A1a(i, A0L, z, true);
    }

    public void A1h(AnonymousClass0CW r1, C02760Bu r2, AnonymousClass0C4 r3, int i) {
    }

    public void A1l(boolean z) {
        A1M((String) null);
        if (z != this.A08) {
            this.A08 = z;
            A0S();
        }
    }

    public void A1m(boolean z) {
        A1M((String) null);
        if (this.A0A != z) {
            this.A0A = z;
            A0S();
        }
    }

    private void A0B(int i, int i2) {
        this.A03.A07 = this.A05.A02() - i2;
        AnonymousClass0D0 r3 = this.A03;
        int i3 = 1;
        if (this.A09) {
            i3 = -1;
        }
        r3.A0A = i3;
        r3.A08 = i;
        r3.A01 = 1;
        r3.A03 = i2;
        r3.A04 = Integer.MIN_VALUE;
    }

    private void A0C(int i, int i2) {
        this.A03.A07 = i2 - this.A05.A04();
        AnonymousClass0D0 r3 = this.A03;
        r3.A08 = i;
        int i3 = -1;
        if (this.A09) {
            i3 = 1;
        }
        r3.A0A = i3;
        r3.A01 = -1;
        r3.A03 = i2;
        r3.A04 = Integer.MIN_VALUE;
    }

    private void A0D(AnonymousClass0D0 r8, C02760Bu r9) {
        int i;
        int i2;
        if (r8.A06 && !r8.A05) {
            int i3 = r8.A04;
            int i4 = r8.A02;
            if (r8.A01 == -1) {
                int A0L = A0L();
                if (i3 >= 0) {
                    int A012 = (this.A05.A01() - i3) + i4;
                    int i5 = A0L - 1;
                    int i6 = i5;
                    if (this.A09) {
                        i5 = 0;
                        i2 = 0;
                        while (i2 < A0L) {
                            View A0R = A0R(i2);
                            if (this.A05.A09(A0R) >= A012 && this.A05.A0B(A0R) >= A012) {
                                i2++;
                            }
                        }
                        return;
                    }
                    while (i2 >= 0) {
                        View A0R2 = A0R(i2);
                        if (this.A05.A09(A0R2) >= A012 && this.A05.A0B(A0R2) >= A012) {
                            i6 = i2 - 1;
                        }
                    }
                    return;
                    if (i5 == i2) {
                        return;
                    }
                    if (i2 > i5) {
                        while (true) {
                            i2--;
                            if (i2 >= i5) {
                                A0f(r9, i2);
                            } else {
                                return;
                            }
                        }
                    } else {
                        while (i5 > i2) {
                            A0f(r9, i5);
                            i5--;
                        }
                    }
                }
            } else if (i3 >= 0) {
                int i7 = i3 - i4;
                int A0L2 = A0L();
                int i8 = 0;
                int i9 = 0;
                if (this.A09) {
                    i8 = A0L2 - 1;
                    i = i8;
                    while (i >= 0) {
                        View A0R3 = A0R(i);
                        if (this.A05.A06(A0R3) <= i7 && this.A05.A0A(A0R3) <= i7) {
                            i--;
                        }
                    }
                    return;
                }
                while (i < A0L2) {
                    View A0R4 = A0R(i);
                    if (this.A05.A06(A0R4) <= i7 && this.A05.A0A(A0R4) <= i7) {
                        i9 = i + 1;
                    }
                }
                return;
                if (i8 == i) {
                    return;
                }
                if (i > i8) {
                    while (true) {
                        i--;
                        if (i >= i8) {
                            A0f(r9, i);
                        } else {
                            return;
                        }
                    }
                } else {
                    while (i8 > i) {
                        A0f(r9, i8);
                        i8--;
                    }
                }
            }
        }
    }

    public static void A0E(LinearLayoutManager linearLayoutManager) {
        boolean z;
        if (linearLayoutManager.A00 == 1 || !linearLayoutManager.A1n()) {
            z = linearLayoutManager.A08;
        } else {
            z = !linearLayoutManager.A08;
        }
        linearLayoutManager.A09 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r1.A01() != 0) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0F(X.AnonymousClass0C4 r7, int r8, int r9, boolean r10) {
        /*
            r6 = this;
            X.0D0 r2 = r6.A03
            X.0CY r1 = r6.A05
            int r0 = r1.A03()
            if (r0 != 0) goto L_0x0011
            int r1 = r1.A01()
            r0 = 1
            if (r1 == 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            r2.A05 = r0
            r2.A01 = r8
            int[] r2 = r6.A0D
            r4 = 0
            r2[r4] = r4
            r5 = 1
            r2[r5] = r4
            r6.A1k(r7, r2)
            r0 = r2[r4]
            int r1 = java.lang.Math.max(r4, r0)
            r0 = r2[r5]
            int r0 = java.lang.Math.max(r4, r0)
            if (r8 != r5) goto L_0x0030
            r4 = 1
        L_0x0030:
            X.0D0 r3 = r6.A03
            r2 = r1
            if (r4 == 0) goto L_0x0036
            r2 = r0
        L_0x0036:
            r3.A09 = r2
            if (r4 != 0) goto L_0x003b
            r1 = r0
        L_0x003b:
            r3.A02 = r1
            if (r4 == 0) goto L_0x009a
            X.0CY r0 = r6.A05
            X.0sk r0 = (X.C18180sk) r0
            int r1 = r0.A00
            X.0CP r0 = r0.A02
            if (r1 == 0) goto L_0x0095
            int r0 = r0.A0N()
        L_0x004d:
            int r2 = r2 + r0
            r3.A09 = r2
            boolean r0 = r6.A09
            if (r0 == 0) goto L_0x008e
            r0 = 0
        L_0x0055:
            android.view.View r4 = r6.A0R(r0)
            X.0D0 r3 = r6.A03
            boolean r0 = r6.A09
            if (r0 == 0) goto L_0x0060
            r5 = -1
        L_0x0060:
            r3.A0A = r5
            int r2 = X.AnonymousClass0CP.A02(r4)
            X.0D0 r1 = r6.A03
            int r0 = r1.A0A
            int r2 = r2 + r0
            r3.A08 = r2
            X.0CY r0 = r6.A05
            int r0 = r0.A06(r4)
            r1.A03 = r0
            X.0CY r0 = r6.A05
            int r1 = r0.A06(r4)
            X.0CY r0 = r6.A05
            int r0 = r0.A02()
            int r1 = r1 - r0
        L_0x0082:
            X.0D0 r0 = r6.A03
            r0.A07 = r9
            if (r10 == 0) goto L_0x008b
            int r9 = r9 - r1
            r0.A07 = r9
        L_0x008b:
            r0.A04 = r1
            return
        L_0x008e:
            int r0 = r6.A0L()
            int r0 = r0 + -1
            goto L_0x0055
        L_0x0095:
            int r0 = r0.A0P()
            goto L_0x004d
        L_0x009a:
            boolean r0 = r6.A09
            if (r0 == 0) goto L_0x00e0
            int r0 = r6.A0L()
            int r0 = r0 + -1
        L_0x00a4:
            android.view.View r4 = r6.A0R(r0)
            X.0D0 r2 = r6.A03
            int r1 = r2.A09
            X.0CY r0 = r6.A05
            int r0 = r0.A04()
            int r1 = r1 + r0
            r2.A09 = r1
            X.0D0 r3 = r6.A03
            boolean r0 = r6.A09
            if (r0 != 0) goto L_0x00bc
            r5 = -1
        L_0x00bc:
            r3.A0A = r5
            int r2 = X.AnonymousClass0CP.A02(r4)
            X.0D0 r1 = r6.A03
            int r0 = r1.A0A
            int r2 = r2 + r0
            r3.A08 = r2
            X.0CY r0 = r6.A05
            int r0 = r0.A09(r4)
            r1.A03 = r0
            X.0CY r0 = r6.A05
            int r0 = r0.A09(r4)
            int r1 = -r0
            X.0CY r0 = r6.A05
            int r0 = r0.A04()
            int r1 = r1 + r0
            goto L_0x0082
        L_0x00e0:
            r0 = 0
            goto L_0x00a4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A0F(X.0C4, int, int, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0l(X.AnonymousClass0C2 r6, int r7) {
        /*
            r5 = this;
            X.0bQ r0 = r5.A04
            r4 = -1
            r3 = 0
            if (r0 == 0) goto L_0x001e
            int r2 = r0.A01
            if (r2 < 0) goto L_0x001e
            boolean r0 = r0.A02
        L_0x000c:
            if (r0 == 0) goto L_0x002d
        L_0x000e:
            r1 = 0
        L_0x000f:
            int r0 = r5.A0B
            if (r1 >= r0) goto L_0x002f
            if (r2 < 0) goto L_0x002f
            if (r2 >= r7) goto L_0x002f
            r6.B0g(r2, r3)
            int r2 = r2 + r4
            int r1 = r1 + 1
            goto L_0x000f
        L_0x001e:
            A0E(r5)
            boolean r0 = r5.A09
            int r2 = r5.A01
            if (r2 != r4) goto L_0x000c
            r2 = 0
            if (r0 == 0) goto L_0x002d
            int r2 = r7 + -1
            goto L_0x000e
        L_0x002d:
            r4 = 1
            goto L_0x000e
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A0l(X.0C2, int):void");
    }

    public boolean A0m() {
        if (this.A01 == 1073741824 || this.A04 == 1073741824) {
            return false;
        }
        int A0L = A0L();
        for (int i = 0; i < A0L; i++) {
            ViewGroup.LayoutParams layoutParams = A0R(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    public int A0r(C02760Bu r3, AnonymousClass0C4 r4, int i) {
        if (this.A00 == 1) {
            return 0;
        }
        return A1Y(r3, r4, i);
    }

    public int A0s(C02760Bu r2, AnonymousClass0C4 r3, int i) {
        if (this.A00 == 0) {
            return 0;
        }
        return A1Y(r2, r3, i);
    }

    public Parcelable A0z() {
        C08850bQ r2;
        int i;
        int i2;
        int A0L;
        C08850bQ r0 = this.A04;
        if (r0 != null) {
            return r2;
        }
        r2 = new C08850bQ();
        if (A0L() > 0) {
            A1e();
            boolean z = this.A06;
            boolean z2 = this.A09;
            boolean z3 = z ^ z2;
            r2.A02 = z3;
            if (z3) {
                if (z2) {
                    A0L = 0;
                } else {
                    A0L = A0L() - 1;
                }
                View A0R = A0R(A0L);
                r2.A00 = this.A05.A02() - this.A05.A06(A0R);
                i = AnonymousClass0CP.A02(A0R);
            } else {
                if (z2) {
                    i2 = A0L() - 1;
                } else {
                    i2 = 0;
                }
                View A0R2 = A0R(i2);
                r2.A01 = AnonymousClass0CP.A02(A0R2);
                r2.A00 = this.A05.A09(A0R2) - this.A05.A04();
                return r2;
            }
        } else {
            i = -1;
        }
        r2.A01 = i;
        return r2;
    }

    public void A17(int i) {
        this.A01 = i;
        this.A02 = Integer.MIN_VALUE;
        C08850bQ r1 = this.A04;
        if (r1 != null) {
            r1.A01 = -1;
        }
        A0S();
    }

    public void A19(Parcelable parcelable) {
        if (parcelable instanceof C08850bQ) {
            this.A04 = (C08850bQ) parcelable;
            A0S();
        }
    }

    public void A1C(AnonymousClass0C2 r4, AnonymousClass0C4 r5, int i, int i2) {
        if (this.A00 != 0) {
            i = i2;
        }
        if (A0L() != 0 && i != 0) {
            A1e();
            int i3 = -1;
            if (i > 0) {
                i3 = 1;
            }
            A0F(r5, i3, Math.abs(i), true);
            A1j(this.A03, r4, r5);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0202, code lost:
        if (r0 <= 0) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0204, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f4, code lost:
        if (r1.A01() != 0) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x017a, code lost:
        if (r1 > 0) goto L_0x017c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x03f2  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x03fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1D(X.C02760Bu r18, X.AnonymousClass0C4 r19) {
        /*
            r17 = this;
            r3 = r17
            X.0bQ r1 = r3.A04
            r6 = -1
            r5 = r18
            r4 = r19
            if (r1 != 0) goto L_0x000f
            int r0 = r3.A01
            if (r0 == r6) goto L_0x0021
        L_0x000f:
            int r0 = r4.A00()
            if (r0 != 0) goto L_0x0019
            r3.A0d(r5)
            return
        L_0x0019:
            if (r1 == 0) goto L_0x0021
            int r0 = r1.A01
            if (r0 < 0) goto L_0x0021
            r3.A01 = r0
        L_0x0021:
            r3.A1e()
            X.0D0 r0 = r3.A03
            r2 = 0
            r0.A06 = r2
            A0E(r3)
            androidx.recyclerview.widget.RecyclerView r0 = r3.A07
            r8 = 0
            if (r0 == 0) goto L_0x0042
            android.view.View r1 = r0.getFocusedChild()
            if (r1 == 0) goto L_0x0042
            X.0CI r0 = r3.A05
            java.util.List r0 = r0.A02
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0042
            r8 = r1
        L_0x0042:
            X.0CW r7 = r3.A0E
            boolean r0 = r7.A00
            r9 = 1
            if (r0 == 0) goto L_0x0267
            int r0 = r3.A01
            if (r0 != r6) goto L_0x0267
            X.0bQ r0 = r3.A04
            if (r0 != 0) goto L_0x0267
            if (r8 == 0) goto L_0x0076
            X.0CY r0 = r3.A05
            int r1 = r0.A09(r8)
            X.0CY r0 = r3.A05
            int r0 = r0.A02()
            if (r1 >= r0) goto L_0x006f
            X.0CY r0 = r3.A05
            int r1 = r0.A06(r8)
            X.0CY r0 = r3.A05
            int r0 = r0.A04()
            if (r1 > r0) goto L_0x0076
        L_0x006f:
            int r0 = X.AnonymousClass0CP.A02(r8)
            r7.A02(r8, r0)
        L_0x0076:
            X.0D0 r8 = r3.A03
            int r1 = r8.A00
            r0 = -1
            if (r1 < 0) goto L_0x007e
            r0 = 1
        L_0x007e:
            r8.A01 = r0
            int[] r1 = r3.A0D
            r1[r2] = r2
            r1[r9] = r2
            r3.A1k(r4, r1)
            r0 = r1[r2]
            int r10 = java.lang.Math.max(r2, r0)
            X.0CY r0 = r3.A05
            int r0 = r0.A04()
            int r10 = r10 + r0
            r0 = r1[r9]
            int r9 = java.lang.Math.max(r2, r0)
            X.0CY r0 = r3.A05
            X.0sk r0 = (X.C18180sk) r0
            int r1 = r0.A00
            X.0CP r0 = r0.A02
            if (r1 == 0) goto L_0x0261
            int r0 = r0.A0N()
        L_0x00aa:
            int r9 = r9 + r0
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x00d6
            int r8 = r3.A01
            if (r8 == r6) goto L_0x00d6
            int r1 = r3.A02
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r0) goto L_0x00d6
            android.view.View r11 = r3.A0k(r8)
            if (r11 == 0) goto L_0x00d6
            boolean r1 = r3.A09
            X.0CY r0 = r3.A05
            if (r1 == 0) goto L_0x0252
            int r8 = r0.A02()
            X.0CY r0 = r3.A05
            int r0 = r0.A06(r11)
            int r8 = r8 - r0
            int r1 = r3.A02
        L_0x00d2:
            int r8 = r8 - r1
            if (r8 <= 0) goto L_0x024f
            int r10 = r10 + r8
        L_0x00d6:
            boolean r1 = r7.A04
            boolean r0 = r3.A09
            if (r1 == 0) goto L_0x024b
            if (r0 == 0) goto L_0x00df
        L_0x00de:
            r6 = 1
        L_0x00df:
            r3.A1h(r7, r5, r4, r6)
            r3.A0c(r5)
            X.0D0 r6 = r3.A03
            X.0CY r1 = r3.A05
            int r0 = r1.A03()
            if (r0 != 0) goto L_0x00f6
            int r1 = r1.A01()
            r0 = 1
            if (r1 == 0) goto L_0x00f7
        L_0x00f6:
            r0 = 0
        L_0x00f7:
            r6.A05 = r0
            r6.A02 = r2
            boolean r6 = r7.A04
            int r1 = r7.A02
            int r0 = r7.A01
            if (r6 == 0) goto L_0x0209
            r3.A0C(r1, r0)
            X.0D0 r0 = r3.A03
            r0.A09 = r10
            r3.A1X(r0, r5, r4, r2)
            X.0D0 r0 = r3.A03
            int r6 = r0.A03
            int r10 = r0.A08
            int r0 = r0.A07
            if (r0 <= 0) goto L_0x0118
            int r9 = r9 + r0
        L_0x0118:
            int r1 = r7.A02
            int r0 = r7.A01
            r3.A0B(r1, r0)
            X.0D0 r8 = r3.A03
            r8.A09 = r9
            int r1 = r8.A08
            int r0 = r8.A0A
            int r1 = r1 + r0
            r8.A08 = r1
            r3.A1X(r8, r5, r4, r2)
            X.0D0 r0 = r3.A03
            int r8 = r0.A03
            int r1 = r0.A07
            if (r1 <= 0) goto L_0x0143
            r3.A0C(r10, r6)
            X.0D0 r0 = r3.A03
            r0.A09 = r1
            r3.A1X(r0, r5, r4, r2)
            X.0D0 r0 = r3.A03
            int r6 = r0.A03
        L_0x0143:
            int r0 = r3.A0L()
            if (r0 <= 0) goto L_0x0183
            boolean r1 = r3.A09
            boolean r0 = r3.A0A
            r1 = r1 ^ r0
            X.0CY r0 = r3.A05
            if (r1 == 0) goto L_0x01d9
            int r0 = r0.A02()
            int r0 = r0 - r8
            if (r0 <= 0) goto L_0x01d7
            int r0 = -r0
            int r0 = r3.A1Y(r5, r4, r0)
            int r10 = -r0
            int r9 = r8 + r10
            X.0CY r0 = r3.A05
            int r1 = r0.A02()
            int r1 = r1 - r9
            if (r1 <= 0) goto L_0x01d5
            X.0CY r0 = r3.A05
            r0.A0C(r1)
            int r1 = r1 + r10
        L_0x0170:
            int r6 = r6 + r1
            int r8 = r8 + r1
            X.0CY r0 = r3.A05
            int r0 = r0.A04()
            int r1 = r6 - r0
            if (r1 <= 0) goto L_0x0204
        L_0x017c:
            int r0 = r3.A1Y(r5, r4, r1)
            int r0 = -r0
        L_0x0181:
            int r6 = r6 + r0
            int r8 = r8 + r0
        L_0x0183:
            boolean r0 = r4.A0A
            if (r0 == 0) goto L_0x0470
            int r0 = r3.A0L()
            if (r0 == 0) goto L_0x0470
            boolean r0 = r4.A08
            if (r0 != 0) goto L_0x0470
            boolean r0 = r3.A1Q()
            if (r0 == 0) goto L_0x0470
            java.util.List r12 = r5.A07
            int r16 = r12.size()
            android.view.View r0 = r3.A0R(r2)
            int r13 = X.AnonymousClass0CP.A02(r0)
            r11 = 0
            r10 = 0
            r9 = 0
        L_0x01a8:
            r0 = r16
            if (r11 >= r0) goto L_0x0420
            java.lang.Object r0 = r12.get(r11)
            X.0D3 r0 = (X.AnonymousClass0D3) r0
            int r1 = r0.A00
            r1 = r1 & 8
            if (r1 != 0) goto L_0x01d0
            int r15 = r0.A05
            r1 = -1
            if (r15 != r1) goto L_0x01bf
            int r15 = r0.A04
        L_0x01bf:
            r14 = 0
            if (r15 >= r13) goto L_0x01c3
            r14 = 1
        L_0x01c3:
            boolean r1 = r3.A09
            X.0CY r15 = r3.A05
            android.view.View r0 = r0.A0H
            int r0 = r15.A07(r0)
            if (r14 == r1) goto L_0x01d3
            int r10 = r10 + r0
        L_0x01d0:
            int r11 = r11 + 1
            goto L_0x01a8
        L_0x01d3:
            int r9 = r9 + r0
            goto L_0x01d0
        L_0x01d5:
            r1 = r10
            goto L_0x0170
        L_0x01d7:
            r1 = 0
            goto L_0x0170
        L_0x01d9:
            int r0 = r0.A04()
            int r0 = r6 - r0
            if (r0 <= 0) goto L_0x0207
            int r0 = r3.A1Y(r5, r4, r0)
            int r10 = -r0
            int r9 = r6 + r10
            X.0CY r0 = r3.A05
            int r0 = r0.A04()
            int r9 = r9 - r0
            if (r9 <= 0) goto L_0x01f8
            X.0CY r1 = r3.A05
            int r0 = -r9
            r1.A0C(r0)
            int r10 = r10 - r9
        L_0x01f8:
            int r6 = r6 + r10
            int r8 = r8 + r10
            X.0CY r0 = r3.A05
            int r0 = r0.A02()
            int r0 = r0 - r8
            int r1 = -r0
            if (r0 > 0) goto L_0x017c
        L_0x0204:
            r0 = 0
            goto L_0x0181
        L_0x0207:
            r10 = 0
            goto L_0x01f8
        L_0x0209:
            r3.A0B(r1, r0)
            X.0D0 r0 = r3.A03
            r0.A09 = r9
            r3.A1X(r0, r5, r4, r2)
            X.0D0 r0 = r3.A03
            int r8 = r0.A03
            int r9 = r0.A08
            int r0 = r0.A07
            if (r0 <= 0) goto L_0x021e
            int r10 = r10 + r0
        L_0x021e:
            int r1 = r7.A02
            int r0 = r7.A01
            r3.A0C(r1, r0)
            X.0D0 r6 = r3.A03
            r6.A09 = r10
            int r1 = r6.A08
            int r0 = r6.A0A
            int r1 = r1 + r0
            r6.A08 = r1
            r3.A1X(r6, r5, r4, r2)
            X.0D0 r0 = r3.A03
            int r6 = r0.A03
            int r1 = r0.A07
            if (r1 <= 0) goto L_0x0143
            r3.A0B(r9, r8)
            X.0D0 r0 = r3.A03
            r0.A09 = r1
            r3.A1X(r0, r5, r4, r2)
            X.0D0 r0 = r3.A03
            int r8 = r0.A03
            goto L_0x0143
        L_0x024b:
            if (r0 == 0) goto L_0x00de
            goto L_0x00df
        L_0x024f:
            int r9 = r9 - r8
            goto L_0x00d6
        L_0x0252:
            int r1 = r0.A09(r11)
            X.0CY r0 = r3.A05
            int r0 = r0.A04()
            int r1 = r1 - r0
            int r8 = r3.A02
            goto L_0x00d2
        L_0x0261:
            int r0 = r0.A0P()
            goto L_0x00aa
        L_0x0267:
            r7.A00()
            boolean r12 = r3.A09
            boolean r0 = r3.A0A
            r0 = r0 ^ r12
            r7.A04 = r0
            boolean r0 = r4.A08
            r10 = 0
            if (r0 != 0) goto L_0x0334
            int r11 = r3.A01
            if (r11 == r6) goto L_0x0334
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 < 0) goto L_0x0330
            int r0 = r4.A00()
            if (r11 >= r0) goto L_0x0330
            r7.A02 = r11
            X.0bQ r1 = r3.A04
            if (r1 == 0) goto L_0x02ae
            int r0 = r1.A01
            if (r0 < 0) goto L_0x02ae
            boolean r1 = r1.A02
            r7.A04 = r1
            X.0CY r0 = r3.A05
            if (r1 == 0) goto L_0x02a5
            int r10 = r0.A02()
            X.0bQ r0 = r3.A04
            int r0 = r0.A00
        L_0x029e:
            int r10 = r10 - r0
        L_0x029f:
            r7.A01 = r10
        L_0x02a1:
            r7.A00 = r9
            goto L_0x0076
        L_0x02a5:
            int r10 = r0.A04()
            X.0bQ r0 = r3.A04
            int r1 = r0.A00
            goto L_0x031f
        L_0x02ae:
            int r0 = r3.A02
            if (r0 != r8) goto L_0x02f8
            android.view.View r8 = r3.A0k(r11)
            if (r8 == 0) goto L_0x03d1
            X.0CY r0 = r3.A05
            int r1 = r0.A07(r8)
            X.0CY r0 = r3.A05
            int r0 = r0.A05()
            if (r1 > r0) goto L_0x03ec
            X.0CY r0 = r3.A05
            int r1 = r0.A09(r8)
            X.0CY r0 = r3.A05
            int r0 = r0.A04()
            int r1 = r1 - r0
            X.0CY r0 = r3.A05
            if (r1 >= 0) goto L_0x02e0
            int r0 = r0.A04()
            r7.A01 = r0
            r7.A04 = r2
            goto L_0x02a1
        L_0x02e0:
            int r1 = r0.A02()
            X.0CY r0 = r3.A05
            int r0 = r0.A06(r8)
            int r1 = r1 - r0
            if (r1 >= 0) goto L_0x030c
            X.0CY r0 = r3.A05
            int r0 = r0.A02()
            r7.A01 = r0
            r7.A04 = r9
            goto L_0x02a1
        L_0x02f8:
            r7.A04 = r12
            X.0CY r0 = r3.A05
            if (r12 == 0) goto L_0x0305
            int r10 = r0.A02()
            int r0 = r3.A02
            goto L_0x029e
        L_0x0305:
            int r10 = r0.A04()
            int r1 = r3.A02
            goto L_0x031f
        L_0x030c:
            boolean r1 = r7.A04
            X.0CY r0 = r3.A05
            if (r1 == 0) goto L_0x032a
            int r10 = r0.A06(r8)
            X.0CY r8 = r3.A05
            int r1 = r8.A00
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r1) goto L_0x0322
            r1 = 0
        L_0x031f:
            int r10 = r10 + r1
            goto L_0x029f
        L_0x0322:
            int r1 = r8.A05()
            int r0 = r8.A00
            int r1 = r1 - r0
            goto L_0x031f
        L_0x032a:
            int r10 = r0.A09(r8)
            goto L_0x029f
        L_0x0330:
            r3.A01 = r6
            r3.A02 = r8
        L_0x0334:
            int r0 = r3.A0L()
            if (r0 == 0) goto L_0x03ff
            androidx.recyclerview.widget.RecyclerView r0 = r3.A07
            if (r0 == 0) goto L_0x0371
            android.view.View r8 = r0.getFocusedChild()
            if (r8 == 0) goto L_0x0371
            X.0CI r0 = r3.A05
            java.util.List r0 = r0.A02
            boolean r0 = r0.contains(r8)
            if (r0 != 0) goto L_0x0371
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            X.0D2 r1 = (X.AnonymousClass0D2) r1
            X.0D3 r0 = r1.A00
            int r0 = r0.A00
            r0 = r0 & 8
            if (r0 != 0) goto L_0x0371
            int r1 = r1.A01()
            if (r1 < 0) goto L_0x0371
            int r0 = r4.A00()
            if (r1 >= r0) goto L_0x0371
            int r0 = X.AnonymousClass0CP.A02(r8)
            r7.A02(r8, r0)
            goto L_0x02a1
        L_0x0371:
            boolean r1 = r3.A06
            boolean r0 = r3.A0A
            if (r1 != r0) goto L_0x03ff
            boolean r1 = r7.A04
            boolean r0 = r3.A09
            if (r1 == 0) goto L_0x03c3
            if (r0 == 0) goto L_0x03c5
        L_0x037f:
            int r14 = r3.A0L()
            int r15 = r4.A00()
            r13 = 0
        L_0x0388:
            r12 = r4
            r11 = r5
            r10 = r3
            android.view.View r8 = r10.A1b(r11, r12, r13, r14, r15)
            if (r8 == 0) goto L_0x03ff
            int r0 = X.AnonymousClass0CP.A02(r8)
            r7.A01(r8, r0)
            boolean r0 = r4.A08
            if (r0 != 0) goto L_0x02a1
            boolean r0 = r3.A1Q()
            if (r0 == 0) goto L_0x02a1
            X.0CY r0 = r3.A05
            int r1 = r0.A09(r8)
            X.0CY r0 = r3.A05
            int r0 = r0.A02()
            if (r1 >= r0) goto L_0x03be
            X.0CY r0 = r3.A05
            int r1 = r0.A06(r8)
            X.0CY r0 = r3.A05
            int r0 = r0.A04()
            if (r1 >= r0) goto L_0x02a1
        L_0x03be:
            boolean r1 = r7.A04
            X.0CY r0 = r3.A05
            goto L_0x03f0
        L_0x03c3:
            if (r0 == 0) goto L_0x037f
        L_0x03c5:
            int r0 = r3.A0L()
            int r13 = r0 + -1
            int r15 = r4.A00()
            r14 = -1
            goto L_0x0388
        L_0x03d1:
            int r0 = r3.A0L()
            if (r0 <= 0) goto L_0x03ec
            android.view.View r0 = r3.A0R(r2)
            int r8 = X.AnonymousClass0CP.A02(r0)
            int r0 = r3.A01
            r1 = 0
            if (r0 >= r8) goto L_0x03e5
            r1 = 1
        L_0x03e5:
            boolean r0 = r3.A09
            if (r1 != r0) goto L_0x03ea
            r10 = 1
        L_0x03ea:
            r7.A04 = r10
        L_0x03ec:
            boolean r1 = r7.A04
            X.0CY r0 = r7.A03
        L_0x03f0:
            if (r1 == 0) goto L_0x03fa
            int r0 = r0.A02()
        L_0x03f6:
            r7.A01 = r0
            goto L_0x02a1
        L_0x03fa:
            int r0 = r0.A04()
            goto L_0x03f6
        L_0x03ff:
            boolean r1 = r7.A04
            X.0CY r0 = r7.A03
            if (r1 == 0) goto L_0x041b
            int r0 = r0.A02()
        L_0x0409:
            r7.A01 = r0
            boolean r0 = r3.A0A
            if (r0 == 0) goto L_0x0419
            int r0 = r4.A00()
            int r0 = r0 + -1
        L_0x0415:
            r7.A02 = r0
            goto L_0x02a1
        L_0x0419:
            r0 = 0
            goto L_0x0415
        L_0x041b:
            int r0 = r0.A04()
            goto L_0x0409
        L_0x0420:
            X.0D0 r0 = r3.A03
            r0.A0B = r12
            if (r10 <= 0) goto L_0x044a
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x048c
            int r0 = r3.A0L()
            int r0 = r0 + -1
        L_0x0430:
            android.view.View r0 = r3.A0R(r0)
            int r0 = X.AnonymousClass0CP.A02(r0)
            r3.A0C(r0, r6)
            X.0D0 r1 = r3.A03
            r1.A09 = r10
            r1.A07 = r2
            r0 = 0
            r1.A01(r0)
            X.0D0 r0 = r3.A03
            r3.A1X(r0, r5, r4, r2)
        L_0x044a:
            if (r9 <= 0) goto L_0x046b
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x0485
            r0 = 0
        L_0x0451:
            android.view.View r0 = r3.A0R(r0)
            int r0 = X.AnonymousClass0CP.A02(r0)
            r3.A0B(r0, r8)
            X.0D0 r1 = r3.A03
            r1.A09 = r9
            r1.A07 = r2
            r0 = 0
            r1.A01(r0)
            X.0D0 r0 = r3.A03
            r3.A1X(r0, r5, r4, r2)
        L_0x046b:
            X.0D0 r1 = r3.A03
            r0 = 0
            r1.A0B = r0
        L_0x0470:
            boolean r0 = r4.A08
            if (r0 != 0) goto L_0x0481
            X.0CY r1 = r3.A05
            int r0 = r1.A05()
            r1.A00 = r0
        L_0x047c:
            boolean r0 = r3.A0A
            r3.A06 = r0
            return
        L_0x0481:
            r7.A00()
            goto L_0x047c
        L_0x0485:
            int r0 = r3.A0L()
            int r0 = r0 + -1
            goto L_0x0451
        L_0x048c:
            r0 = 0
            goto L_0x0430
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A1D(X.0Bu, X.0C4):void");
    }

    public void A1E(C02760Bu r2, RecyclerView recyclerView) {
        if (this.A07) {
            A0d(r2);
            r2.A05.clear();
            r2.A04();
        }
    }

    public void A1M(String str) {
        if (this.A04 == null) {
            super.A1M(str);
        }
    }

    public boolean A1N() {
        if (this.A00 == 0) {
            return true;
        }
        return false;
    }

    public boolean A1O() {
        if (this.A00 != 1) {
            return false;
        }
        return true;
    }

    public boolean A1Q() {
        if (this.A04 == null && this.A06 == this.A0A) {
            return true;
        }
        return false;
    }

    public int A1X(AnonymousClass0D0 r8, C02760Bu r9, AnonymousClass0C4 r10, boolean z) {
        int i;
        int i2 = r8.A07;
        int i3 = r8.A04;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                r8.A04 = i3 + i2;
            }
            A0D(r8, r9);
        }
        int i4 = r8.A07 + r8.A09;
        AnonymousClass0CX r2 = this.A0F;
        while (true) {
            if ((!r8.A05 && i4 <= 0) || (i = r8.A08) < 0 || i >= r10.A00()) {
                break;
            }
            r2.A00 = 0;
            r2.A01 = false;
            r2.A03 = false;
            r2.A02 = false;
            A1i(r2, r8, r9, r10);
            if (r2.A01) {
                break;
            }
            int i5 = r8.A03;
            int i6 = r2.A00;
            r8.A03 = i5 + (r8.A01 * i6);
            if (!r2.A03 || r8.A0B != null || !r10.A08) {
                r8.A07 -= i6;
                i4 -= i6;
            }
            int i7 = r8.A04;
            if (i7 != Integer.MIN_VALUE) {
                int i8 = i7 + i6;
                r8.A04 = i8;
                int i9 = r8.A07;
                if (i9 < 0) {
                    r8.A04 = i8 + i9;
                }
                A0D(r8, r9);
            }
            if (z && r2.A02) {
                break;
            }
        }
        return i2 - r8.A07;
    }

    public void A1e() {
        if (this.A03 == null) {
            this.A03 = new AnonymousClass0D0();
        }
    }

    public void A1f(int i) {
        if (i == 0 || i == 1) {
            A1M((String) null);
            if (i != this.A00 || this.A05 == null) {
                AnonymousClass0CY A002 = AnonymousClass0CY.A00(this, i);
                this.A05 = A002;
                this.A0E.A03 = A002;
                this.A00 = i;
                A0S();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("invalid orientation:");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public void A1g(int i, int i2) {
        this.A01 = i;
        this.A02 = i2;
        C08850bQ r1 = this.A04;
        if (r1 != null) {
            r1.A01 = -1;
        }
        A0S();
    }

    public void A1j(AnonymousClass0D0 r4, AnonymousClass0C2 r5, AnonymousClass0C4 r6) {
        int i = r4.A08;
        if (i >= 0 && i < r6.A00()) {
            r5.B0g(i, Math.max(0, r4.A04));
        }
    }

    public void A1k(AnonymousClass0C4 r6, int[] iArr) {
        int i;
        if (r6.A06 != -1) {
            i = this.A05.A05();
        } else {
            i = 0;
        }
        int i2 = 0;
        if (this.A03.A01 != -1) {
            i2 = i;
            i = 0;
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public boolean A1n() {
        if (AnonymousClass04F.A01(this.A07) != 1) {
            return false;
        }
        return true;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.A00 = 1;
        this.A08 = false;
        this.A09 = false;
        this.A0A = false;
        this.A0C = true;
        this.A01 = -1;
        this.A02 = Integer.MIN_VALUE;
        this.A04 = null;
        this.A0E = new AnonymousClass0CW();
        this.A0F = new AnonymousClass0CX();
        this.A0B = 2;
        this.A0D = new int[2];
        AnonymousClass0TB A032 = AnonymousClass0CP.A03(context, attributeSet, i, i2);
        A1f(A032.A00);
        A1l(A032.A02);
        A1m(A032.A03);
    }

    public View A0k(int i) {
        int A0L = A0L();
        if (A0L == 0) {
            return null;
        }
        int A022 = i - AnonymousClass0CP.A02(A0R(0));
        if (A022 >= 0 && A022 < A0L) {
            View A0R = A0R(A022);
            if (AnonymousClass0CP.A02(A0R) == i) {
                return A0R;
            }
        }
        return super.A0k(i);
    }

    public int A0t(AnonymousClass0C4 r2) {
        return A08(this, r2);
    }

    public int A0u(AnonymousClass0C4 r2) {
        return A09(this, r2);
    }

    public int A0v(AnonymousClass0C4 r2) {
        return A0A(this, r2);
    }

    public int A0w(AnonymousClass0C4 r2) {
        return A08(this, r2);
    }

    public int A0x(AnonymousClass0C4 r2) {
        return A09(this, r2);
    }

    public int A0y(AnonymousClass0C4 r2) {
        return A0A(this, r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0044, code lost:
        r0 = A0L() - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004a, code lost:
        r1 = A0R(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0052, code lost:
        if (r1.hasFocusable() == false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0054, code lost:
        if (r2 == null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        if (r6.A09 != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007f, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0042, code lost:
        if (r6.A09 != false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A10(android.view.View r7, X.C02760Bu r8, X.AnonymousClass0C4 r9, int r10) {
        /*
            r6 = this;
            A0E(r6)
            int r0 = r6.A0L()
            r5 = 0
            if (r0 == 0) goto L_0x0080
            int r4 = r6.A1W(r10)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r2) goto L_0x0080
            r6.A1e()
            r1 = 1051372203(0x3eaaaaab, float:0.33333334)
            X.0CY r0 = r6.A05
            int r0 = r0.A05()
            float r0 = (float) r0
            float r0 = r0 * r1
            int r1 = (int) r0
            r0 = 0
            r6.A0F(r9, r4, r1, r0)
            X.0D0 r1 = r6.A03
            r1.A04 = r2
            r1.A06 = r0
            r0 = 1
            r6.A1X(r1, r8, r9, r0)
            r3 = -1
            boolean r0 = r6.A09
            if (r4 != r3) goto L_0x0061
            if (r0 == 0) goto L_0x0057
            int r0 = r6.A0L()
            int r0 = r0 + -1
            android.view.View r2 = r6.A1Z(r0, r3)
        L_0x0040:
            boolean r0 = r6.A09
            if (r0 == 0) goto L_0x0072
        L_0x0044:
            int r0 = r6.A0L()
            int r0 = r0 + -1
        L_0x004a:
            android.view.View r1 = r6.A0R(r0)
            boolean r0 = r1.hasFocusable()
            if (r0 == 0) goto L_0x007f
            if (r2 == 0) goto L_0x0080
            return r1
        L_0x0057:
            int r1 = r6.A0L()
            r0 = 0
            android.view.View r2 = r6.A1Z(r0, r1)
            goto L_0x0040
        L_0x0061:
            if (r0 == 0) goto L_0x0074
            int r1 = r6.A0L()
            r0 = 0
            android.view.View r2 = r6.A1Z(r0, r1)
        L_0x006c:
            if (r4 == r3) goto L_0x0040
            boolean r0 = r6.A09
            if (r0 == 0) goto L_0x0044
        L_0x0072:
            r0 = 0
            goto L_0x004a
        L_0x0074:
            int r0 = r6.A0L()
            int r0 = r0 + -1
            android.view.View r2 = r6.A1Z(r0, r3)
            goto L_0x006c
        L_0x007f:
            return r2
        L_0x0080:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A10(android.view.View, X.0Bu, X.0C4, int):android.view.View");
    }

    public void A1B(AccessibilityEvent accessibilityEvent) {
        super.A1B(accessibilityEvent);
        if (A0L() > 0) {
            accessibilityEvent.setFromIndex(A1T());
            accessibilityEvent.setToIndex(A1V());
        }
    }

    public void A1G(AnonymousClass0C4 r3, RecyclerView recyclerView, int i) {
        AnonymousClass0IE r0 = new AnonymousClass0IE(recyclerView.getContext());
        r0.A00 = i;
        A0g(r0);
    }

    public int A1S() {
        View A1a = A1a(0, A0L(), true, false);
        if (A1a == null) {
            return -1;
        }
        return AnonymousClass0CP.A02(A1a);
    }

    public int A1T() {
        View A1a = A1a(0, A0L(), false, true);
        if (A1a == null) {
            return -1;
        }
        return AnonymousClass0CP.A02(A1a);
    }

    public int A1U() {
        View A1a = A1a(A0L() - 1, -1, true, false);
        if (A1a != null) {
            return AnonymousClass0CP.A02(A1a);
        }
        return -1;
    }

    public int A1V() {
        View A1a = A1a(A0L() - 1, -1, false, true);
        if (A1a != null) {
            return AnonymousClass0CP.A02(A1a);
        }
        return -1;
    }

    public int A1Y(C02760Bu r6, AnonymousClass0C4 r7, int i) {
        if (!(A0L() == 0 || i == 0)) {
            A1e();
            this.A03.A06 = true;
            int i2 = -1;
            if (i > 0) {
                i2 = 1;
            }
            int abs = Math.abs(i);
            A0F(r7, i2, abs, true);
            AnonymousClass0D0 r0 = this.A03;
            int A1X = r0.A04 + A1X(r0, r6, r7, false);
            if (A1X >= 0) {
                if (abs > A1X) {
                    i = i2 * A1X;
                }
                this.A05.A0C(-i);
                this.A03.A00 = i;
                return i;
            }
        }
        return 0;
    }

    public View A1Z(int i, int i2) {
        AnonymousClass0CU r0;
        A1e();
        if (i2 <= i && i2 >= i) {
            return A0R(i);
        }
        int i3 = 4161;
        int i4 = 4097;
        if (this.A05.A09(A0R(i)) < this.A05.A04()) {
            i3 = 16644;
            i4 = 16388;
        }
        if (this.A00 == 0) {
            r0 = this.A08;
        } else {
            r0 = this.A09;
        }
        return r0.A00(i, i2, i3, i4);
    }

    public View A1a(int i, int i2, boolean z, boolean z2) {
        AnonymousClass0CU r0;
        A1e();
        int i3 = 320;
        int i4 = 320;
        if (z) {
            i4 = 24579;
        }
        if (!z2) {
            i3 = 0;
        }
        if (this.A00 == 0) {
            r0 = this.A08;
        } else {
            r0 = this.A09;
        }
        return r0.A00(i, i2, i4, i3);
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
            if (A023 >= 0 && A023 < i3) {
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

    public void A1i(AnonymousClass0CX r12, AnonymousClass0D0 r13, C02760Bu r14, AnonymousClass0C4 r15) {
        int A0Q;
        int A082;
        int i;
        int i2;
        View A002 = r13.A00(r14);
        if (A002 == null) {
            r12.A01 = true;
            return;
        }
        AnonymousClass0D2 r8 = (AnonymousClass0D2) A002.getLayoutParams();
        List list = r13.A0B;
        boolean z = this.A09;
        int i3 = r13.A01;
        boolean z2 = false;
        if (list == null) {
            if (i3 == -1) {
                z2 = true;
            }
            if (z == z2) {
                AnonymousClass0CP.A05(A002, this, -1, false);
            } else {
                AnonymousClass0CP.A05(A002, this, 0, false);
            }
        } else {
            if (i3 == -1) {
                z2 = true;
            }
            if (z == z2) {
                AnonymousClass0CP.A05(A002, this, -1, true);
            } else {
                AnonymousClass0CP.A05(A002, this, 0, true);
            }
        }
        A0W(A002);
        r12.A00 = this.A05.A07(A002);
        if (this.A00 == 1) {
            if (A1n()) {
                i = this.A03 - A0P();
                i2 = i - this.A05.A08(A002);
            } else {
                i2 = A0O();
                i = this.A05.A08(A002) + i2;
            }
            int i4 = r13.A01;
            int i5 = r13.A03;
            int i6 = r12.A00;
            A082 = i5 + i6;
            A0Q = i5;
            if (i4 == -1) {
                A0Q = i5 - i6;
                A082 = i5;
            }
        } else {
            A0Q = A0Q();
            A082 = this.A05.A08(A002) + A0Q;
            int i7 = r13.A01;
            int i8 = r13.A03;
            int i9 = r12.A00;
            i = i8 + i9;
            i2 = i8;
            if (i7 == -1) {
                i2 = i8 - i9;
                i = i8;
            }
        }
        AnonymousClass0CP.A04(A002, i2, A0Q, i, A082);
        int i10 = r8.A00.A00;
        if (!((i10 & 8) == 0 && (i10 & 2) == 0)) {
            r12.A03 = true;
        }
        r12.A02 = A002.hasFocusable();
    }

    public PointF B3K(int i) {
        PointF pointF;
        if (A0L() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < AnonymousClass0CP.A02(A0R(0))) {
            z = true;
        }
        if (z != this.A09) {
            i2 = -1;
        }
        float f = (float) i2;
        if (this.A00 == 0) {
            return pointF;
        }
        pointF = new PointF(0.0f, f);
        return pointF;
    }

    public LinearLayoutManager(int i) {
        this.A00 = 1;
        this.A08 = false;
        this.A09 = false;
        this.A0A = false;
        this.A0C = true;
        this.A01 = -1;
        this.A02 = Integer.MIN_VALUE;
        this.A04 = null;
        this.A0E = new AnonymousClass0CW();
        this.A0F = new AnonymousClass0CX();
        this.A0B = 2;
        this.A0D = new int[2];
        A1f(i);
        A1l(false);
    }

    public LinearLayoutManager() {
        this(1);
    }
}
