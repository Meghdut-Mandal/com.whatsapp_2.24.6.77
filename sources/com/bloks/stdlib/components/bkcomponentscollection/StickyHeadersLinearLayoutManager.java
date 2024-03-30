package com.bloks.stdlib.components.bkcomponentscollection;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass0C4;
import X.AnonymousClass0CZ;
import X.AnonymousClass0D3;
import X.C02760Bu;
import X.C134896bm;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36431kI;
import X.C90514aH;
import X.C95984mb;
import X.C96214my;
import android.graphics.PointF;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public final class StickyHeadersLinearLayoutManager extends LinearLayoutManager {
    public int A00;
    public int A01 = -1;
    public int A02 = -1;
    public View A03;
    public C95984mb A04;
    public final List A05 = AnonymousClass001.A0I();
    public final C96214my A06 = new C96214my(this);

    private final void A0G(View view) {
        A0W(view);
        if (this.A00 == 1) {
            view.layout(A0O(), 0, this.A03 - A0P(), view.getMeasuredHeight());
        } else {
            view.layout(0, A0Q(), view.getMeasuredWidth(), this.A00 - A0N());
        }
    }

    public int A0t(AnonymousClass0C4 r2) {
        AnonymousClass00C.A0D(r2, 0);
        A0F();
        int A08 = LinearLayoutManager.A08(this, r2);
        A0D();
        return A08;
    }

    public int A0u(AnonymousClass0C4 r2) {
        AnonymousClass00C.A0D(r2, 0);
        A0F();
        int A09 = LinearLayoutManager.A09(this, r2);
        A0D();
        return A09;
    }

    public int A0v(AnonymousClass0C4 r2) {
        AnonymousClass00C.A0D(r2, 0);
        A0F();
        int A0A = LinearLayoutManager.A0A(this, r2);
        A0D();
        return A0A;
    }

    public int A0w(AnonymousClass0C4 r2) {
        AnonymousClass00C.A0D(r2, 0);
        A0F();
        int A08 = LinearLayoutManager.A08(this, r2);
        A0D();
        return A08;
    }

    public int A0x(AnonymousClass0C4 r2) {
        AnonymousClass00C.A0D(r2, 0);
        A0F();
        int A09 = LinearLayoutManager.A09(this, r2);
        A0D();
        return A09;
    }

    public int A0y(AnonymousClass0C4 r2) {
        AnonymousClass00C.A0D(r2, 0);
        A0F();
        int A0A = LinearLayoutManager.A0A(this, r2);
        A0D();
        return A0A;
    }

    public View A10(View view, C02760Bu r3, AnonymousClass0C4 r4, int i) {
        C36321k7.A16(view, r3, r4, 0);
        A0F();
        View A10 = super.A10(view, r3, r4, i);
        A0D();
        return A10;
    }

    public void A1g(int i, int i2) {
        int width;
        this.A01 = -1;
        this.A00 = Integer.MIN_VALUE;
        int A0B = A0B(i);
        if (A0B != -1) {
            List list = this.A05;
            if (C90514aH.A0I(list, i) < 0) {
                int i3 = i - 1;
                if (C90514aH.A0I(list, i3) < 0) {
                    View view = this.A03;
                    if (view != null) {
                        int A0I = C90514aH.A0I(list, this.A02);
                        if (A0I < 0) {
                            A0I = -1;
                        }
                        if (A0B == A0I) {
                            if (i2 == Integer.MIN_VALUE) {
                                i2 = 0;
                            }
                            if (this.A00 == 1) {
                                width = view.getHeight();
                            } else {
                                width = view.getWidth();
                            }
                            i2 += width;
                        }
                    }
                    this.A01 = i;
                    this.A00 = i2;
                } else {
                    super.A1g(i3, i2);
                    return;
                }
            }
        }
        super.A1g(i, i2);
    }

    private final int A0B(int i) {
        List list = this.A05;
        int A07 = C36431kI.A07(list);
        int i2 = 0;
        while (i2 <= A07) {
            int i3 = (i2 + A07) / 2;
            if (C36351kA.A06(list, i3) > i) {
                A07 = i3 - 1;
            } else {
                if (i3 < C36431kI.A07(list)) {
                    i2 = i3 + 1;
                    if (C36351kA.A06(list, i2) <= i) {
                    }
                }
                return i3;
            }
        }
        return -1;
    }

    public static final int A0C(StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager, int i) {
        List list = stickyHeadersLinearLayoutManager.A05;
        int A07 = C36431kI.A07(list);
        int i2 = 0;
        while (i2 <= A07) {
            int i3 = (i2 + A07) / 2;
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (C36351kA.A06(list, i4) >= i) {
                    A07 = i4;
                }
            }
            if (C36351kA.A06(list, i3) >= i) {
                return i3;
            }
            i2 = i3 + 1;
        }
        return -1;
    }

    private final void A0D() {
        View view = this.A03;
        if (view != null) {
            A0Y(view, -1);
        }
    }

    private final void A0F() {
        int A052;
        View view = this.A03;
        if (view != null && (A052 = this.A05.A05(view)) >= 0) {
            this.A05.A08(A052);
        }
    }

    private final void A0H(AnonymousClass0CZ r3) {
        C95984mb r0 = this.A04;
        if (r0 != null) {
            r0.A01.unregisterObserver(this.A06);
        }
        if (r3 instanceof C95984mb) {
            this.A04 = (C95984mb) r3;
            C96214my r02 = this.A06;
            r3.BnA(r02);
            r02.A01();
            return;
        }
        this.A04 = null;
        this.A05.clear();
    }

    public static final void A0I(C02760Bu r4, StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager) {
        View view = stickyHeadersLinearLayoutManager.A03;
        if (view != null) {
            stickyHeadersLinearLayoutManager.A03 = null;
            stickyHeadersLinearLayoutManager.A02 = -1;
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            AnonymousClass0D3 A042 = RecyclerView.A04(view);
            A042.A00 &= -129;
            A042.A06();
            A042.A00 = 4 | A042.A00;
            stickyHeadersLinearLayoutManager.A0X(view);
            if (r4 != null) {
                r4.A07(view);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0208, code lost:
        if ((r6 + r0) >= 0.0f) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0089, code lost:
        if (r6 > ((float) r0)) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0052 A[EDGE_INSN: B:149:0x0052->B:24:0x0052 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0250 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A0J(X.C02760Bu r20, boolean r21) {
        /*
            r19 = this;
            r2 = r19
            java.util.List r8 = r2.A05
            int r7 = r8.size()
            int r6 = r2.A0L()
            r13 = r20
            if (r7 <= 0) goto L_0x025a
            if (r6 <= 0) goto L_0x025a
            r4 = 0
        L_0x0013:
            r12 = 0
            r3 = -1
            if (r4 >= r6) goto L_0x025a
            android.view.View r11 = r2.A0R(r4)
            if (r11 == 0) goto L_0x0257
            android.view.ViewGroup$LayoutParams r5 = r11.getLayoutParams()
        L_0x0021:
            boolean r0 = r5 instanceof X.AnonymousClass0D2
            if (r0 == 0) goto L_0x0254
            X.0D2 r5 = (X.AnonymousClass0D2) r5
        L_0x0027:
            if (r11 == 0) goto L_0x0250
            if (r5 == 0) goto L_0x0250
            X.0D3 r0 = r5.A00
            int r1 = r0.A00
            r0 = r1 & 8
            if (r0 != 0) goto L_0x0250
            r0 = r1 & 4
            if (r0 != 0) goto L_0x0250
            int r10 = r2.A00
            r9 = 0
            r1 = 1
            boolean r0 = r2.A08
            if (r10 != r1) goto L_0x0220
            if (r0 == 0) goto L_0x0232
            int r0 = r11.getTop()
            float r1 = (float) r0
            float r0 = r11.getTranslationY()
            float r1 = r1 + r0
            int r0 = r2.A00
        L_0x004d:
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0250
        L_0x0052:
            X.0D3 r0 = r5.A00
            int r1 = r0.A04()
            if (r1 == r3) goto L_0x025a
            int r0 = r2.A0B(r1)
            if (r0 == r3) goto L_0x021d
            int r5 = X.C36351kA.A06(r8, r0)
        L_0x0064:
            int r0 = r0 + 1
            if (r7 <= r0) goto L_0x021a
            int r7 = X.C36351kA.A06(r8, r0)
        L_0x006c:
            if (r5 == r3) goto L_0x025a
            if (r5 != r1) goto L_0x008b
            int r9 = r2.A00
            r8 = 0
            r6 = 1
            boolean r0 = r2.A08
            if (r9 != r6) goto L_0x01ea
            if (r0 == 0) goto L_0x01fc
            int r0 = r11.getBottom()
            float r6 = (float) r0
            float r0 = r11.getTranslationY()
            float r6 = r6 - r0
            int r0 = r2.A00
        L_0x0086:
            float r0 = (float) r0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x025a
        L_0x008b:
            int r0 = r5 + 1
            if (r7 == r0) goto L_0x025a
            android.view.View r0 = r2.A03
            if (r0 == 0) goto L_0x01e7
            X.0D3 r0 = androidx.recyclerview.widget.RecyclerView.A04(r0)
            int r0 = r0.A01
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
        L_0x009d:
            X.4mb r0 = r2.A04
            if (r0 == 0) goto L_0x01e4
            int r0 = r0.getItemViewType(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x00a9:
            boolean r0 = X.AnonymousClass00C.A0J(r6, r0)
            if (r0 != 0) goto L_0x00b2
            A0I(r13, r2)
        L_0x00b2:
            android.view.View r9 = r2.A03
            if (r9 != 0) goto L_0x00e8
            r0 = 0
            android.view.View r9 = r13.A02(r5)
            X.AnonymousClass00C.A08(r9)
            X.AnonymousClass0CP.A05(r9, r2, r3, r0)
            r2.A0G(r9)
            android.view.ViewParent r6 = r9.getParent()
            androidx.recyclerview.widget.RecyclerView r0 = r2.A07
            if (r6 != r0) goto L_0x02a6
            int r0 = r0.indexOfChild(r9)
            if (r0 == r3) goto L_0x02a6
            X.0D3 r8 = androidx.recyclerview.widget.RecyclerView.A04(r9)
            r6 = 128(0x80, float:1.794E-43)
            int r0 = r8.A00
            r6 = r6 | r0
            r8.A00 = r6
            androidx.recyclerview.widget.RecyclerView r0 = r2.A07
            X.0Bv r0 = r0.A11
            r0.A05(r8)
            r2.A03 = r9
            r2.A02 = r5
        L_0x00e8:
            if (r21 != 0) goto L_0x0178
            int r0 = X.AnonymousClass0CP.A02(r9)
            if (r0 != r5) goto L_0x0178
        L_0x00f0:
            if (r7 == r3) goto L_0x0103
            int r7 = r7 - r1
            int r4 = r4 + r7
            android.view.View r1 = r2.A0R(r4)
            android.view.View r0 = r2.A03
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0103
            r12 = r1
        L_0x0103:
            android.view.View r4 = r2.A03
            if (r4 == 0) goto L_0x0160
            int r1 = r2.A00
            r3 = 0
            r0 = 1
            if (r1 == r0) goto L_0x0138
            boolean r0 = r2.A08
            if (r0 != 0) goto L_0x0117
            boolean r0 = r2.A1n()
            if (r0 == 0) goto L_0x011f
        L_0x0117:
            int r1 = r2.A03
            int r0 = r4.getWidth()
            int r1 = r1 - r0
            int r3 = r3 + r1
        L_0x011f:
            if (r12 == 0) goto L_0x0138
            boolean r0 = r2.A08
            if (r0 != 0) goto L_0x016f
            boolean r0 = r2.A1n()
            if (r0 != 0) goto L_0x016f
            int r1 = r12.getLeft()
            int r0 = r4.getWidth()
            int r1 = r1 - r0
            int r3 = java.lang.Math.min(r1, r3)
        L_0x0138:
            float r0 = (float) r3
            r4.setTranslationX(r0)
            int r1 = r2.A00
            r3 = 0
            r0 = 1
            if (r1 != r0) goto L_0x015c
            boolean r0 = r2.A08
            if (r0 == 0) goto L_0x014e
            int r1 = r2.A00
            int r0 = r4.getHeight()
            int r1 = r1 - r0
            int r3 = r3 + r1
        L_0x014e:
            if (r12 == 0) goto L_0x015c
            boolean r0 = r2.A08
            if (r0 == 0) goto L_0x0161
            int r0 = r12.getBottom()
            int r3 = java.lang.Math.max(r0, r3)
        L_0x015c:
            float r0 = (float) r3
            r4.setTranslationY(r0)
        L_0x0160:
            return
        L_0x0161:
            int r1 = r12.getTop()
            int r0 = r4.getHeight()
            int r1 = r1 - r0
            int r3 = java.lang.Math.min(r1, r3)
            goto L_0x015c
        L_0x016f:
            int r0 = r12.getRight()
            int r3 = java.lang.Math.max(r0, r3)
            goto L_0x0138
        L_0x0178:
            android.view.View r8 = r2.A03
            if (r8 == 0) goto L_0x00f0
            X.0D3 r14 = androidx.recyclerview.widget.RecyclerView.A04(r8)
            if (r14 == 0) goto L_0x0292
            androidx.recyclerview.widget.RecyclerView r6 = r13.A08
            X.0CE r9 = r6.A0D
            r0 = 0
            int r15 = r9.A04(r5, r0)
            if (r15 < 0) goto L_0x0262
            X.0CZ r0 = r6.A0G
            int r0 = r0.A0J()
            if (r15 >= r0) goto L_0x0262
            r17 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r16 = r5
            X.C02760Bu.A00(r13, r14, r15, r16, r17)
            android.view.View r10 = r14.A0H
            android.view.ViewGroup$LayoutParams r9 = r10.getLayoutParams()
            if (r9 != 0) goto L_0x01d6
            android.view.ViewGroup$LayoutParams r9 = r6.generateDefaultLayoutParams()
        L_0x01ab:
            X.0D2 r9 = (X.AnonymousClass0D2) r9
            r10.setLayoutParams(r9)
        L_0x01b0:
            r6 = 1
            r9.A01 = r6
            r9.A00 = r14
            android.view.ViewParent r0 = r10.getParent()
            if (r0 == 0) goto L_0x01bc
            r6 = 0
        L_0x01bc:
            r9.A02 = r6
            r2.A02 = r5
            r2.A0G(r8)
            int r0 = r2.A01
            if (r0 == r3) goto L_0x00f0
            android.view.ViewTreeObserver r6 = r8.getViewTreeObserver()
            r5 = 0
            X.7sO r0 = new X.7sO
            r0.<init>(r2, r6, r5)
            r6.addOnGlobalLayoutListener(r0)
            goto L_0x00f0
        L_0x01d6:
            boolean r0 = r6.checkLayoutParams(r9)
            if (r0 != 0) goto L_0x01e1
            android.view.ViewGroup$LayoutParams r9 = r6.generateLayoutParams((android.view.ViewGroup.LayoutParams) r9)
            goto L_0x01ab
        L_0x01e1:
            X.0D2 r9 = (X.AnonymousClass0D2) r9
            goto L_0x01b0
        L_0x01e4:
            r0 = r12
            goto L_0x00a9
        L_0x01e7:
            r6 = r12
            goto L_0x009d
        L_0x01ea:
            if (r0 != 0) goto L_0x020c
            boolean r0 = r2.A1n()
            if (r0 != 0) goto L_0x020c
            int r0 = r11.getLeft()
            float r6 = (float) r0
            float r0 = r11.getTranslationX()
            goto L_0x0205
        L_0x01fc:
            int r0 = r11.getTop()
            float r6 = (float) r0
            float r0 = r11.getTranslationY()
        L_0x0205:
            float r6 = r6 + r0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x025a
            goto L_0x008b
        L_0x020c:
            int r0 = r11.getRight()
            float r6 = (float) r0
            float r0 = r11.getTranslationX()
            float r6 = r6 - r0
            int r0 = r2.A03
            goto L_0x0086
        L_0x021a:
            r7 = -1
            goto L_0x006c
        L_0x021d:
            r5 = -1
            goto L_0x0064
        L_0x0220:
            if (r0 != 0) goto L_0x0242
            boolean r0 = r2.A1n()
            if (r0 != 0) goto L_0x0242
            int r0 = r11.getRight()
            float r1 = (float) r0
            float r0 = r11.getTranslationX()
            goto L_0x023b
        L_0x0232:
            int r0 = r11.getBottom()
            float r1 = (float) r0
            float r0 = r11.getTranslationY()
        L_0x023b:
            float r1 = r1 - r0
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0250
            goto L_0x0052
        L_0x0242:
            int r0 = r11.getLeft()
            float r1 = (float) r0
            float r0 = r11.getTranslationX()
            float r1 = r1 + r0
            int r0 = r2.A03
            goto L_0x004d
        L_0x0250:
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0254:
            r5 = r12
            goto L_0x0027
        L_0x0257:
            r5 = r12
            goto L_0x0021
        L_0x025a:
            android.view.View r0 = r2.A03
            if (r0 == 0) goto L_0x0160
            A0I(r13, r2)
            return
        L_0x0262:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Inconsistency detected. Invalid item position "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "(offset:"
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = ").state:"
            r1.append(r0)
            X.0C4 r0 = r6.A0y
            int r0 = r0.A00()
            r1.append(r0)
            java.lang.String r0 = r6.A0T()
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L_0x0292:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter"
            r1.append(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r13.A08
            java.lang.String r0 = r0.A0T()
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0c(r0, r1)
            throw r0
        L_0x02a6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "View should be fully attached to be ignored"
            r1.append(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r2.A07
            java.lang.String r0 = r0.A0T()
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0c(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager.A0J(X.0Bu, boolean):void");
    }

    public void A0o(RecyclerView recyclerView) {
        A0H(recyclerView.A0G);
    }

    public void A17(int i) {
        A1g(i, Integer.MIN_VALUE);
    }

    public void A19(Parcelable parcelable) {
        if (parcelable instanceof C134896bm) {
            C134896bm r2 = (C134896bm) parcelable;
            this.A01 = r2.A01;
            this.A00 = r2.A00;
            parcelable = r2.A02;
        }
        super.A19(parcelable);
    }

    public StickyHeadersLinearLayoutManager(int i) {
        super(i);
    }

    public int A0r(C02760Bu r3, AnonymousClass0C4 r4, int i) {
        C36321k7.A0x(r3, r4);
        A0F();
        int A0r = super.A0r(r3, r4, i);
        A0D();
        if (A0r != 0) {
            A0J(r3, false);
        }
        return A0r;
    }

    public int A0s(C02760Bu r3, AnonymousClass0C4 r4, int i) {
        C36321k7.A0x(r3, r4);
        A0F();
        int A0s = super.A0s(r3, r4, i);
        A0D();
        if (A0s != 0) {
            A0J(r3, false);
        }
        return A0s;
    }

    public Parcelable A0z() {
        return new C134896bm(super.A0z(), this.A01, this.A00);
    }

    public void A1D(C02760Bu r3, AnonymousClass0C4 r4) {
        boolean A1a = C36331k8.A1a(r3, r4);
        A0F();
        super.A1D(r3, r4);
        A0D();
        if (!r4.A08) {
            A0J(r3, A1a);
        }
    }

    public PointF B3K(int i) {
        A0F();
        PointF B3K = super.B3K(i);
        A0D();
        return B3K;
    }

    public void A0n(AnonymousClass0CZ r1, AnonymousClass0CZ r2) {
        A0H(r2);
    }
}
