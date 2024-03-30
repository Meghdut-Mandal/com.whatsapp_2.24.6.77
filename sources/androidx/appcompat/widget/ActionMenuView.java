package androidx.appcompat.widget;

import X.AnonymousClass000;
import X.AnonymousClass02T;
import X.AnonymousClass04F;
import X.AnonymousClass04u;
import X.AnonymousClass07X;
import X.AnonymousClass0Fd;
import X.C012605m;
import X.C016307a;
import X.C016707e;
import X.C018707z;
import X.C03440Ex;
import X.C03480Fl;
import X.C03530Fu;
import X.C09350cE;
import X.C09370cG;
import X.C09460cP;
import X.C16600pm;
import X.C16990qX;
import X.C17000qY;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Method;

public class ActionMenuView extends LinearLayoutCompat implements C16600pm, C016707e {
    public AnonymousClass02T A00;
    public int A01;
    public int A02;
    public C016307a A03;
    public C09460cP A04;
    public C012605m A05;
    public boolean A06;
    public int A07;
    public int A08;
    public Context A09;
    public C16990qX A0A;
    public boolean A0B;

    public boolean A0C(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C17000qY)) {
            z = false | ((C17000qY) childAt).BQ3();
        }
        if (i <= 0 || !(childAt2 instanceof C17000qY)) {
            return z;
        }
        return z | ((C17000qY) childAt2).BQ4();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public /* bridge */ /* synthetic */ C03440Ex A05() {
        C03530Fu r1 = new C03530Fu();
        r1.gravity = 16;
        return r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r1.gravity <= 0) goto L_0x0011;
     */
    /* renamed from: A0B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C03530Fu generateLayoutParams(android.view.ViewGroup.LayoutParams r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x001c
            boolean r0 = r3 instanceof X.C03530Fu
            if (r0 == 0) goto L_0x0016
            X.0Fu r3 = (X.C03530Fu) r3
            X.0Fu r1 = new X.0Fu
            r1.<init>((X.C03530Fu) r3)
        L_0x000d:
            int r0 = r1.gravity
            if (r0 > 0) goto L_0x0015
        L_0x0011:
            r0 = 16
            r1.gravity = r0
        L_0x0015:
            return r1
        L_0x0016:
            X.0Fu r1 = new X.0Fu
            r1.<init>((android.view.ViewGroup.LayoutParams) r3)
            goto L_0x000d
        L_0x001c:
            X.0Fu r1 = new X.0Fu
            r1.<init>()
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.generateLayoutParams(android.view.ViewGroup$LayoutParams):X.0Fu");
    }

    public boolean BL0(C018707z r4) {
        return this.A03.A0K(r4, (AnonymousClass07X) null, 0);
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C03530Fu r1 = new C03530Fu();
        r1.gravity = 16;
        return r1;
    }

    public Menu getMenu() {
        C016307a r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        Context context = getContext();
        C016307a r1 = new C016307a(context);
        this.A03 = r1;
        r1.A0C(new C09350cE(this));
        C09460cP r2 = new C09460cP(context);
        this.A04 = r2;
        r2.A0I = true;
        r2.A0J = true;
        C16990qX r02 = this.A0A;
        if (r02 == null) {
            r02 = new C09370cG();
        }
        r2.A09 = r02;
        this.A03.A08(this.A09, r2);
        C09460cP r03 = this.A04;
        r03.A0A = this;
        C016307a r04 = r03.A08;
        this.A03 = r04;
        return r04;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int A0B2;
        int i6;
        if (!this.A0B) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int i8 = this.A04;
        int i9 = i3 - i;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        Method method = AnonymousClass04u.A00;
        boolean A072 = AnonymousClass04F.A07(this);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C03530Fu r11 = (C03530Fu) childAt.getLayoutParams();
                if (r11.A04) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (A0C(i12)) {
                        measuredWidth += i8;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (A072) {
                        i6 = getPaddingLeft() + r11.leftMargin;
                        A0B2 = i6 + measuredWidth;
                    } else {
                        A0B2 = AnonymousClass000.A0B(this) - r11.rightMargin;
                        i6 = A0B2 - measuredWidth;
                    }
                    int i13 = i7 - (measuredHeight / 2);
                    childAt.layout(i6, i13, A0B2, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= AnonymousClass000.A0F(r11, childAt.getMeasuredWidth());
                    A0C(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth2 / 2);
            int i15 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        if (i16 > 0) {
            i5 = paddingRight / i16;
        } else {
            i5 = 0;
        }
        int max = Math.max(0, i5);
        if (A072) {
            int A0B3 = AnonymousClass000.A0B(this);
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                C03530Fu r4 = (C03530Fu) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !r4.A04) {
                    int i18 = A0B3 - r4.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    A0B3 = i18 - ((measuredWidth3 + r4.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            C03530Fu r42 = (C03530Fu) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !r42.A04) {
                int i21 = paddingLeft + r42.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = i21 + measuredWidth4 + r42.rightMargin + max;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01d7, code lost:
        if (r10 != 1) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00aa, code lost:
        if ((!android.text.TextUtils.isEmpty(((X.AnonymousClass07P) r13).getText())) == false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e0, code lost:
        if ((!android.text.TextUtils.isEmpty(r0.getText())) == false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0153, code lost:
        if (r10 != 2) goto L_0x0155;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r32, int r33) {
        /*
            r31 = this;
            r5 = r31
            boolean r1 = r5.A0B
            r3 = r32
            int r0 = android.view.View.MeasureSpec.getMode(r3)
            r7 = 1
            r9 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            boolean r0 = X.AnonymousClass000.A1S(r0, r4)
            r5.A0B = r0
            if (r1 == r0) goto L_0x0018
            r5.A07 = r9
        L_0x0018:
            int r2 = android.view.View.MeasureSpec.getSize(r3)
            boolean r0 = r5.A0B
            if (r0 == 0) goto L_0x002d
            X.07a r1 = r5.A03
            if (r1 == 0) goto L_0x002d
            int r0 = r5.A07
            if (r2 == r0) goto L_0x002d
            r5.A07 = r2
            r1.A0E(r7)
        L_0x002d:
            int r2 = r5.getChildCount()
            boolean r0 = r5.A0B
            r6 = r33
            if (r0 == 0) goto L_0x02b0
            if (r2 <= 0) goto L_0x02c2
            int r30 = android.view.View.MeasureSpec.getMode(r6)
            int r3 = android.view.View.MeasureSpec.getSize(r3)
            int r29 = android.view.View.MeasureSpec.getSize(r6)
            int r2 = X.AnonymousClass000.A09(r5)
            int r22 = X.AnonymousClass000.A0C(r5)
            r1 = -2
            r0 = r22
            int r28 = android.view.ViewGroup.getChildMeasureSpec(r6, r0, r1)
            int r3 = r3 - r2
            int r6 = r5.A02
            int r8 = r3 / r6
            int r0 = r3 % r6
            r27 = 0
            if (r8 == 0) goto L_0x02aa
            int r0 = r0 / r8
            int r6 = r6 + r0
            int r2 = r5.getChildCount()
            r11 = 0
            r26 = 0
            r10 = 0
            r25 = 0
            r19 = 0
            r20 = 0
        L_0x006f:
            if (r11 >= r2) goto L_0x014e
            android.view.View r13 = r5.getChildAt(r11)
            int r1 = r13.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x0141
            boolean r1 = r13 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            int r10 = r10 + 1
            if (r1 == 0) goto L_0x0088
            int r0 = r5.A01
            r13.setPadding(r0, r9, r0, r9)
        L_0x0088:
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            X.0Fu r12 = (X.C03530Fu) r12
            r12.A03 = r9
            r12.A01 = r9
            r12.A00 = r9
            r12.A02 = r9
            r12.leftMargin = r9
            r12.rightMargin = r9
            if (r1 == 0) goto L_0x00ac
            r0 = r13
            X.07P r0 = (X.AnonymousClass07P) r0
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = r0 ^ 1
            r0 = 1
            if (r1 != 0) goto L_0x00ad
        L_0x00ac:
            r0 = 0
        L_0x00ad:
            r12.A05 = r0
            boolean r0 = r12.A04
            r15 = r8
            if (r0 == 0) goto L_0x00b5
            r15 = 1
        L_0x00b5:
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            X.0Fu r14 = (X.C03530Fu) r14
            int r1 = android.view.View.MeasureSpec.getSize(r28)
            int r1 = r1 - r22
            int r0 = android.view.View.MeasureSpec.getMode(r28)
            int r18 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            boolean r0 = r13 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r0 == 0) goto L_0x014c
            r0 = r13
            X.07P r0 = (X.AnonymousClass07P) r0
        L_0x00d0:
            r17 = 1
            if (r0 == 0) goto L_0x00e2
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            r16 = 1
            if (r0 != 0) goto L_0x00e4
        L_0x00e2:
            r16 = 0
        L_0x00e4:
            r1 = 2
            if (r15 <= 0) goto L_0x014a
            if (r16 == 0) goto L_0x00eb
            if (r15 < r1) goto L_0x014a
        L_0x00eb:
            int r15 = r15 * r6
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r0)
            r0 = r18
            r13.measure(r15, r0)
            int r15 = r13.getMeasuredWidth()
            int r0 = r15 / r6
            int r15 = r15 % r6
            if (r15 == 0) goto L_0x0102
            int r0 = r0 + 1
        L_0x0102:
            if (r16 == 0) goto L_0x0148
            if (r0 >= r1) goto L_0x0148
        L_0x0106:
            boolean r0 = r14.A04
            if (r0 != 0) goto L_0x0145
            if (r16 == 0) goto L_0x0145
        L_0x010c:
            r0 = r17
            r14.A02 = r0
            r14.A00 = r1
            int r0 = r6 * r1
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            r0 = r18
            r13.measure(r14, r0)
            r0 = r25
            int r25 = java.lang.Math.max(r0, r1)
            boolean r0 = r12.A02
            if (r0 == 0) goto L_0x0129
            int r19 = r19 + 1
        L_0x0129:
            boolean r0 = r12.A04
            if (r0 == 0) goto L_0x012f
            r26 = 1
        L_0x012f:
            int r8 = r8 - r1
            int r12 = r13.getMeasuredHeight()
            r0 = r27
            int r27 = java.lang.Math.max(r0, r12)
            if (r1 != r7) goto L_0x0141
            int r0 = r7 << r11
            long r0 = (long) r0
            long r20 = r20 | r0
        L_0x0141:
            int r11 = r11 + 1
            goto L_0x006f
        L_0x0145:
            r17 = 0
            goto L_0x010c
        L_0x0148:
            r1 = r0
            goto L_0x0106
        L_0x014a:
            r1 = 0
            goto L_0x0106
        L_0x014c:
            r0 = 0
            goto L_0x00d0
        L_0x014e:
            r0 = 2
            if (r26 == 0) goto L_0x0155
            r24 = 1
            if (r10 == r0) goto L_0x0157
        L_0x0155:
            r24 = 0
        L_0x0157:
            r16 = 0
            if (r19 <= 0) goto L_0x01d4
        L_0x015b:
            if (r8 <= 0) goto L_0x01d4
            r12 = 0
            r11 = 0
            r1 = 2147483647(0x7fffffff, float:NaN)
            r22 = 0
        L_0x0164:
            if (r11 >= r2) goto L_0x018e
            android.view.View r0 = r5.getChildAt(r11)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.0Fu r0 = (X.C03530Fu) r0
            boolean r13 = r0.A02
            if (r13 == 0) goto L_0x017f
            int r13 = r0.A00
            if (r13 >= r1) goto L_0x0182
            int r1 = r0.A00
            r22 = 1
            long r22 = r22 << r11
            r12 = 1
        L_0x017f:
            int r11 = r11 + 1
            goto L_0x0164
        L_0x0182:
            r13 = 1
            int r0 = r0.A00
            if (r0 != r1) goto L_0x017f
            long r13 = r13 << r11
            long r22 = r22 | r13
            int r12 = r12 + 1
            goto L_0x017f
        L_0x018e:
            long r20 = r20 | r22
            if (r12 > r8) goto L_0x01d4
            int r13 = r1 + 1
            r12 = 0
        L_0x0195:
            if (r12 >= r2) goto L_0x01d1
            android.view.View r14 = r5.getChildAt(r12)
            android.view.ViewGroup$LayoutParams r11 = r14.getLayoutParams()
            X.0Fu r11 = (X.C03530Fu) r11
            int r0 = r7 << r12
            long r0 = (long) r0
            long r18 = r22 & r0
            r16 = 0
            int r15 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r15 != 0) goto L_0x01b5
            int r11 = r11.A00
            if (r11 != r13) goto L_0x01b2
            long r20 = r20 | r0
        L_0x01b2:
            int r12 = r12 + 1
            goto L_0x0195
        L_0x01b5:
            if (r24 == 0) goto L_0x01c6
            boolean r0 = r11.A05
            if (r0 == 0) goto L_0x01c6
            if (r8 != r7) goto L_0x01c6
            int r1 = r5.A01
            int r0 = r1 + r6
            r24 = 1
            r14.setPadding(r0, r9, r1, r9)
        L_0x01c6:
            int r0 = r11.A00
            int r0 = r0 + 1
            r11.A00 = r0
            r11.A03 = r7
            int r8 = r8 + -1
            goto L_0x01b2
        L_0x01d1:
            r16 = 1
            goto L_0x015b
        L_0x01d4:
            if (r26 != 0) goto L_0x01d9
            r1 = 1
            if (r10 == r7) goto L_0x01da
        L_0x01d9:
            r1 = 0
        L_0x01da:
            if (r8 <= 0) goto L_0x027f
            r13 = 0
            int r0 = (r20 > r13 ? 1 : (r20 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x027f
            int r10 = r10 - r7
            if (r8 < r10) goto L_0x01eb
            if (r1 != 0) goto L_0x01eb
            r0 = r25
            if (r0 <= r7) goto L_0x027f
        L_0x01eb:
            int r0 = java.lang.Long.bitCount(r20)
            float r10 = (float) r0
            if (r1 != 0) goto L_0x0227
            r0 = 1
            long r11 = r20 & r0
            r15 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x020b
            android.view.View r0 = r5.getChildAt(r9)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.0Fu r0 = (X.C03530Fu) r0
            boolean r0 = r0.A05
            if (r0 != 0) goto L_0x020b
            float r10 = r10 - r15
        L_0x020b:
            int r9 = r2 + -1
            int r0 = r7 << r9
            long r0 = (long) r0
            long r13 = r20 & r0
            r11 = 0
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0227
            android.view.View r0 = r5.getChildAt(r9)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.0Fu r0 = (X.C03530Fu) r0
            boolean r0 = r0.A05
            if (r0 != 0) goto L_0x0227
            float r10 = r10 - r15
        L_0x0227:
            r0 = 0
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x027d
            int r8 = r8 * r6
            float r0 = (float) r8
            float r0 = r0 / r10
            int r9 = (int) r0
        L_0x0230:
            r8 = 0
        L_0x0231:
            if (r8 >= r2) goto L_0x027f
            int r0 = r7 << r8
            long r0 = (long) r0
            long r12 = r20 & r0
            r10 = 0
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x025d
            android.view.View r0 = r5.getChildAt(r8)
            android.view.ViewGroup$LayoutParams r10 = r0.getLayoutParams()
            X.0Fu r10 = (X.C03530Fu) r10
            boolean r0 = r0 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r0 == 0) goto L_0x0260
            r10.A01 = r9
            r10.A03 = r7
            if (r8 != 0) goto L_0x025b
            boolean r0 = r10.A05
            if (r0 != 0) goto L_0x025b
            int r1 = -r9
            r0 = 2
            int r1 = r1 / r0
            r10.leftMargin = r1
        L_0x025b:
            r16 = 1
        L_0x025d:
            int r8 = r8 + 1
            goto L_0x0231
        L_0x0260:
            r1 = 2
            boolean r0 = r10.A04
            if (r0 == 0) goto L_0x026e
            r10.A01 = r9
            r10.A03 = r7
            int r0 = -r9
            int r0 = r0 / r1
            r10.rightMargin = r0
            goto L_0x025b
        L_0x026e:
            if (r8 == 0) goto L_0x0274
            int r0 = r9 / 2
            r10.leftMargin = r0
        L_0x0274:
            int r0 = r2 + -1
            if (r8 == r0) goto L_0x025d
            int r0 = r9 / 2
            r10.rightMargin = r0
            goto L_0x025d
        L_0x027d:
            r9 = 0
            goto L_0x0230
        L_0x027f:
            if (r16 == 0) goto L_0x02a4
            r9 = 0
        L_0x0282:
            if (r9 >= r2) goto L_0x02a4
            android.view.View r8 = r5.getChildAt(r9)
            android.view.ViewGroup$LayoutParams r7 = r8.getLayoutParams()
            X.0Fu r7 = (X.C03530Fu) r7
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x02a1
            int r1 = r7.A00
            int r1 = r1 * r6
            int r0 = r7.A01
            int r1 = r1 + r0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r4)
            r0 = r28
            r8.measure(r1, r0)
        L_0x02a1:
            int r9 = r9 + 1
            goto L_0x0282
        L_0x02a4:
            r0 = r30
            if (r0 != r4) goto L_0x02aa
            r27 = r29
        L_0x02aa:
            r0 = r27
            r5.setMeasuredDimension(r3, r0)
            return
        L_0x02b0:
            r1 = 0
        L_0x02b1:
            if (r1 >= r2) goto L_0x02c2
            android.view.View r0 = r5.getChildAt(r1)
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass000.A0a(r0)
            r0.rightMargin = r9
            r0.leftMargin = r9
            int r1 = r1 + 1
            goto L_0x02b1
        L_0x02c2:
            super.onMeasure(r3, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.onMeasure(int, int):void");
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.A04.A0G = z;
    }

    public void setMenuCallbacks(C16990qX r1, AnonymousClass02T r2) {
        this.A0A = r1;
        this.A00 = r2;
    }

    public void setPopupTheme(int i) {
        Context contextThemeWrapper;
        if (this.A08 != i) {
            this.A08 = i;
            if (i == 0) {
                contextThemeWrapper = getContext();
            } else {
                contextThemeWrapper = new ContextThemeWrapper(getContext(), i);
            }
            this.A09 = contextThemeWrapper;
        }
    }

    public void setPresenter(C09460cP r2) {
        this.A04 = r2;
        r2.A0A = this;
        this.A03 = r2.A08;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A08 = false;
        float f = AnonymousClass000.A0X(context).density;
        this.A02 = (int) (56.0f * f);
        this.A01 = (int) (f * 4.0f);
        this.A09 = context;
        this.A08 = 0;
    }

    public /* bridge */ /* synthetic */ C03440Ex A06(AttributeSet attributeSet) {
        return new C03530Fu(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C03530Fu(getContext(), attributeSet);
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C09460cP r1 = this.A04;
        C03480Fl r0 = r1.A0E;
        if (r0 != null) {
            return r0.getDrawable();
        }
        if (r1.A0H) {
            return r1.A05;
        }
        return null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C09460cP r1 = this.A04;
        if (r1 != null) {
            r1.Bwl(false);
            if (this.A04.A02()) {
                this.A04.A01();
                this.A04.A03();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C09460cP r0 = this.A04;
        if (r0 != null) {
            r0.A01();
            AnonymousClass0Fd r02 = r0.A0B;
            if (r02 != null) {
                r02.A01();
            }
        }
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C09460cP r1 = this.A04;
        C03480Fl r0 = r1.A0E;
        if (r0 != null) {
            r0.setImageDrawable(drawable);
            return;
        }
        r1.A0H = true;
        r1.A05 = drawable;
    }

    public void BKe(C016307a r1) {
        this.A03 = r1;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C03530Fu;
    }

    public void setOnMenuItemClickListener(C012605m r1) {
        this.A05 = r1;
    }

    public void setOverflowReserved(boolean z) {
        this.A06 = z;
    }

    public int getPopupTheme() {
        return this.A08;
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }
}
