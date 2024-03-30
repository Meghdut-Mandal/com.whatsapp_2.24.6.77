package androidx.appcompat.widget;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass04F;
import X.AnonymousClass04u;
import X.AnonymousClass1MJ;
import X.C010404j;
import X.C012005e;
import X.C03440Ex;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.reflect.Method;

public class LinearLayoutCompat extends ViewGroup {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public Drawable A07;
    public boolean A08;
    public boolean A09;
    public int[] A0A;
    public int[] A0B;
    public int A0C;
    public int A0D;
    public int A0E;

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean A0A(int i) {
        int i2;
        if (i == 0) {
            i2 = this.A0E & 1;
        } else {
            int childCount = getChildCount();
            int i3 = this.A0E;
            if (i == childCount) {
                i2 = i3 & 4;
            } else if ((i3 & 2) == 0) {
                return false;
            } else {
                int i4 = i - 1;
                while (i4 >= 0) {
                    if (AnonymousClass001.A05(this, i4) == 8) {
                        i4--;
                    }
                }
                return false;
            }
        }
        return i2 != 0;
    }

    public void setWeightSum(float f) {
        this.A00 = Math.max(0.0f, f);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: A05 */
    public C03440Ex generateDefaultLayoutParams() {
        int i = this.A0D;
        int i2 = -2;
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            i2 = -1;
        }
        return new C03440Ex(i2);
    }

    /* renamed from: A07 */
    public C03440Ex generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C03440Ex(layoutParams);
    }

    public void A08(Canvas canvas, int i) {
        this.A07.setBounds(getPaddingLeft() + this.A0C, i, AnonymousClass000.A0B(this) - this.A0C, this.A03 + i);
        this.A07.draw(canvas);
    }

    public void A09(Canvas canvas, int i) {
        this.A07.setBounds(i, getPaddingTop() + this.A0C, this.A04 + i, AnonymousClass000.A0A(this) - this.A0C);
        this.A07.draw(canvas);
    }

    public int getBaseline() {
        int i;
        if (this.A01 < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.A01;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i3 = this.A02;
                if (this.A0D == 1 && (i = this.A05 & 112) != 48) {
                    if (i == 16) {
                        i3 += (AnonymousClass000.A0D(this, getBottom() - getTop()) - this.A06) / 2;
                    } else if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.A06;
                    }
                }
                return i3 + AnonymousClass000.A0a(childAt).topMargin + baseline;
            } else if (this.A01 == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int left;
        int bottom;
        if (this.A07 == null) {
            return;
        }
        if (this.A0D == 1) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (!(childAt == null || childAt.getVisibility() == 8 || !A0A(i4))) {
                    A08(canvas, (childAt.getTop() - AnonymousClass000.A0a(childAt).topMargin) - this.A03);
                }
            }
            if (A0A(childCount)) {
                View childAt2 = getChildAt(childCount - 1);
                if (childAt2 == null) {
                    bottom = AnonymousClass000.A0A(this) - this.A03;
                } else {
                    bottom = childAt2.getBottom() + AnonymousClass000.A0a(childAt2).bottomMargin;
                }
                A08(canvas, bottom);
                return;
            }
            return;
        }
        int childCount2 = getChildCount();
        Method method = AnonymousClass04u.A00;
        boolean z = true;
        if (AnonymousClass04F.A01(this) != 1) {
            z = false;
        }
        for (int i5 = 0; i5 < childCount2; i5++) {
            View childAt3 = getChildAt(i5);
            if (!(childAt3 == null || childAt3.getVisibility() == 8 || !A0A(i5))) {
                ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(childAt3);
                if (z) {
                    left = childAt3.getRight() + A0a.rightMargin;
                } else {
                    left = (childAt3.getLeft() - A0a.leftMargin) - this.A04;
                }
                A09(canvas, left);
            }
        }
        if (A0A(childCount2)) {
            View childAt4 = getChildAt(childCount2 - 1);
            if (childAt4 != null) {
                ViewGroup.MarginLayoutParams A0a2 = AnonymousClass000.A0a(childAt4);
                if (z) {
                    i = childAt4.getLeft();
                    i2 = A0a2.leftMargin;
                    i3 = (i - i2) - this.A04;
                } else {
                    i3 = childAt4.getRight() + A0a2.rightMargin;
                }
            } else if (z) {
                i3 = getPaddingLeft();
            } else {
                i = getWidth();
                i2 = getPaddingRight();
                i3 = (i - i2) - this.A04;
            }
            A09(canvas, i3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x0152  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            r22 = this;
            r8 = r22
            int r0 = r8.A0D
            r7 = 1
            if (r0 != r7) goto L_0x00a2
            int r4 = r8.getPaddingLeft()
            int r3 = r26 - r24
            int r0 = r8.getPaddingRight()
            int r14 = r3 - r0
            int r13 = X.AnonymousClass001.A04(r8, r3, r4)
            int r5 = r8.getChildCount()
            int r3 = r8.A05
            r1 = r3 & 112(0x70, float:1.57E-43)
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r3 = r3 & r0
            r0 = 16
            if (r1 == r0) goto L_0x0094
            r0 = 80
            int r2 = r8.getPaddingTop()
            if (r1 != r0) goto L_0x0036
            int r2 = r2 + r27
            int r2 = r2 - r25
            int r0 = r8.A06
            int r2 = r2 - r0
        L_0x0036:
            r10 = 0
        L_0x0037:
            if (r10 >= r5) goto L_0x0191
            android.view.View r11 = r8.getChildAt(r10)
            if (r11 == 0) goto L_0x0082
            int r1 = r11.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x0082
            int r9 = r11.getMeasuredWidth()
            int r12 = r11.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r6 = r11.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r6 = (android.widget.LinearLayout.LayoutParams) r6
            int r1 = r6.gravity
            if (r1 >= 0) goto L_0x005a
            r1 = r3
        L_0x005a:
            int r0 = X.AnonymousClass04F.A01(r8)
            int r0 = android.view.Gravity.getAbsoluteGravity(r1, r0)
            r1 = r0 & 7
            if (r1 == r7) goto L_0x0085
            r0 = 5
            if (r1 == r0) goto L_0x008e
            int r1 = r6.leftMargin
            int r1 = r1 + r4
        L_0x006c:
            boolean r0 = r8.A0A(r10)
            if (r0 == 0) goto L_0x0075
            int r0 = r8.A03
            int r2 = r2 + r0
        L_0x0075:
            int r0 = r6.topMargin
            int r2 = r2 + r0
            int r9 = r9 + r1
            int r0 = r12 + r2
            r11.layout(r1, r2, r9, r0)
            int r0 = r6.bottomMargin
            int r12 = r12 + r0
            int r2 = r2 + r12
        L_0x0082:
            int r10 = r10 + 1
            goto L_0x0037
        L_0x0085:
            int r0 = r13 - r9
            int r1 = r0 / 2
            int r1 = r1 + r4
            int r0 = r6.leftMargin
            int r1 = r1 + r0
            goto L_0x0090
        L_0x008e:
            int r1 = r14 - r9
        L_0x0090:
            int r0 = r6.rightMargin
            int r1 = r1 - r0
            goto L_0x006c
        L_0x0094:
            int r2 = r8.getPaddingTop()
            int r27 = r27 - r25
            int r0 = r8.A06
            int r27 = r27 - r0
            int r0 = r27 / 2
            int r2 = r2 + r0
            goto L_0x0036
        L_0x00a2:
            java.lang.reflect.Method r0 = X.AnonymousClass04u.A00
            int r0 = X.AnonymousClass04F.A01(r8)
            r10 = 1
            if (r0 == r7) goto L_0x00ac
            r10 = 0
        L_0x00ac:
            int r21 = r8.getPaddingTop()
            int r27 = r27 - r25
            int r0 = r8.getPaddingBottom()
            int r20 = r27 - r0
            int r27 = r27 - r21
            int r0 = r8.getPaddingBottom()
            int r27 = r27 - r0
            int r9 = r8.getChildCount()
            int r0 = r8.A05
            r1 = 8388615(0x800007, float:1.1754953E-38)
            r1 = r1 & r0
            r19 = r0 & 112(0x70, float:1.57E-43)
            boolean r6 = r8.A08
            int[] r5 = r8.A0A
            int[] r4 = r8.A0B
            int r0 = X.AnonymousClass04F.A01(r8)
            int r2 = android.view.Gravity.getAbsoluteGravity(r1, r0)
            r1 = 2
            if (r2 == r7) goto L_0x0183
            r0 = 5
            int r18 = r8.getPaddingLeft()
            if (r2 != r0) goto L_0x00ec
            int r18 = r18 + r26
            int r18 = r18 - r24
            int r0 = r8.A06
            int r18 = r18 - r0
        L_0x00ec:
            r17 = 0
            r16 = 1
            if (r10 == 0) goto L_0x00f6
            int r17 = r9 + -1
            r16 = -1
        L_0x00f6:
            r12 = 0
        L_0x00f7:
            if (r12 >= r9) goto L_0x0191
            int r0 = r16 * r12
            int r11 = r17 + r0
            android.view.View r10 = r8.getChildAt(r11)
            if (r10 == 0) goto L_0x0166
            int r1 = r10.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x0166
            int r15 = r10.getMeasuredWidth()
            int r3 = r10.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r10.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            if (r6 == 0) goto L_0x0181
            int r1 = r2.height
            r0 = -1
            if (r1 == r0) goto L_0x0181
            int r13 = r10.getBaseline()
        L_0x0124:
            int r0 = r2.gravity
            if (r0 >= 0) goto L_0x012a
            r0 = r19
        L_0x012a:
            r14 = r0 & 112(0x70, float:1.57E-43)
            r0 = 16
            if (r14 == r0) goto L_0x0175
            r0 = 48
            if (r14 == r0) goto L_0x0169
            r0 = 80
            r1 = r21
            if (r14 != r0) goto L_0x014c
            int r1 = r20 - r3
            int r0 = r2.bottomMargin
            int r1 = r1 - r0
            r0 = -1
            if (r13 == r0) goto L_0x014c
            int r14 = r10.getMeasuredHeight()
            int r14 = r14 - r13
            r0 = 2
            r0 = r4[r0]
            int r0 = r0 - r14
        L_0x014b:
            int r1 = r1 - r0
        L_0x014c:
            boolean r0 = r8.A0A(r11)
            if (r0 == 0) goto L_0x0156
            int r0 = r8.A04
            int r18 = r18 + r0
        L_0x0156:
            int r11 = r2.leftMargin
            int r11 = r11 + r18
            int r0 = r15 + r11
            int r3 = r3 + r1
            r10.layout(r11, r1, r0, r3)
            int r0 = r2.rightMargin
            int r15 = r15 + r0
            int r11 = r11 + r15
            r18 = r11
        L_0x0166:
            int r12 = r12 + 1
            goto L_0x00f7
        L_0x0169:
            r0 = -1
            int r1 = r2.topMargin
            int r1 = r1 + r21
            if (r13 == r0) goto L_0x014c
            r0 = r5[r7]
            int r0 = r0 - r13
            int r1 = r1 + r0
            goto L_0x014c
        L_0x0175:
            int r1 = r27 - r3
            r0 = 2
            int r1 = r1 / r0
            int r1 = r1 + r21
            int r0 = r2.topMargin
            int r1 = r1 + r0
            int r0 = r2.bottomMargin
            goto L_0x014b
        L_0x0181:
            r13 = -1
            goto L_0x0124
        L_0x0183:
            int r18 = r8.getPaddingLeft()
            int r3 = r26 - r24
            int r0 = r8.A06
            int r3 = r3 - r0
            int r3 = r3 / r1
            int r18 = r18 + r3
            goto L_0x00ec
        L_0x0191:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("base aligned child index out of range (0, ");
            A0u.append(getChildCount());
            throw AnonymousClass000.A0c(")", A0u);
        }
        this.A01 = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.A07) {
            this.A07 = drawable;
            boolean z = false;
            if (drawable != null) {
                this.A04 = drawable.getIntrinsicWidth();
                this.A03 = drawable.getIntrinsicHeight();
            } else {
                this.A04 = 0;
                this.A03 = 0;
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setGravity(int i) {
        if (this.A05 != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.A05 = i;
            requestLayout();
        }
    }

    public void setOrientation(int i) {
        if (this.A0D != i) {
            this.A0D = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.A0E) {
            requestLayout();
        }
        this.A0E = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.A05;
        if ((i3 & 112) != i2) {
            this.A05 = i2 | (i3 & -113);
            requestLayout();
        }
    }

    /* renamed from: A06 */
    public C03440Ex generateLayoutParams(AttributeSet attributeSet) {
        return new C03440Ex(getContext(), attributeSet);
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.A05;
        if ((8388615 & i3) != i2) {
            this.A05 = i2 | (-8388616 & i3);
            requestLayout();
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C03440Ex;
    }

    public void setBaselineAligned(boolean z) {
        this.A08 = z;
    }

    public void setDividerPadding(int i) {
        this.A0C = i;
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.A09 = z;
    }

    public int getBaselineAlignedChildIndex() {
        return this.A01;
    }

    public Drawable getDividerDrawable() {
        return this.A07;
    }

    public int getDividerPadding() {
        return this.A0C;
    }

    public int getDividerWidth() {
        return this.A04;
    }

    public int getGravity() {
        return this.A05;
    }

    public int getOrientation() {
        return this.A0D;
    }

    public int getShowDividers() {
        return this.A0E;
    }

    public float getWeightSum() {
        return this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01fa, code lost:
        if (r11.width == -1) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0206, code lost:
        if (r11.width != r6) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03bb, code lost:
        if (r12.height != -1) goto L_0x03bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0580, code lost:
        if (r10.height != -1) goto L_0x0582;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x059f, code lost:
        if (r10.height != -1) goto L_0x05a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0104, code lost:
        if (r2.width != -1) goto L_0x0106;
     */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0374  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x03b6  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03c5  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x03d3  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03db  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x03de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r37, int r38) {
        /*
            r36 = this;
            r1 = r36
            int r0 = r1.A0D
            r9 = 1
            r32 = r37
            r34 = r38
            if (r0 != r9) goto L_0x02c2
            r0 = 0
            r1.A06 = r0
            int r3 = r1.getChildCount()
            int r22 = android.view.View.MeasureSpec.getMode(r32)
            int r9 = android.view.View.MeasureSpec.getMode(r34)
            int r12 = r1.A01
            boolean r11 = r1.A09
            r21 = 0
            r20 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r6 = 0
            r5 = 0
            r4 = 0
            r19 = 0
            r18 = 1
            r17 = 0
        L_0x002e:
            r13 = 8
            if (r4 >= r3) goto L_0x0125
            android.view.View r15 = r1.getChildAt(r4)
            if (r15 != 0) goto L_0x003f
            int r0 = r1.A06
            r1.A06 = r0
        L_0x003c:
            int r4 = r4 + 1
            goto L_0x002e
        L_0x003f:
            int r0 = r15.getVisibility()
            if (r0 == r13) goto L_0x003c
            boolean r0 = r1.A0A(r4)
            if (r0 == 0) goto L_0x0052
            int r2 = r1.A06
            int r0 = r1.A03
            int r2 = r2 + r0
            r1.A06 = r2
        L_0x0052:
            android.view.ViewGroup$LayoutParams r2 = r15.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            float r0 = r2.weight
            float r20 = r20 + r0
            r0 = 1073741824(0x40000000, float:2.0)
            if (r9 != r0) goto L_0x0094
            int r0 = r2.height
            if (r0 != 0) goto L_0x0094
            float r0 = r2.weight
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x0094
            int r13 = r1.A06
            int r9 = r2.topMargin
            int r9 = r9 + r13
            int r0 = r2.bottomMargin
            int r9 = r9 + r0
            int r13 = java.lang.Math.max(r13, r9)
            r1.A06 = r13
            r19 = 1
            r9 = 1073741824(0x40000000, float:2.0)
        L_0x007c:
            if (r12 < 0) goto L_0x0084
            int r0 = r4 + 1
            if (r12 != r0) goto L_0x0084
            r1.A02 = r13
        L_0x0084:
            if (r4 >= r12) goto L_0x00db
            float r0 = r2.weight
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x00db
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0094:
            int r0 = r2.height
            if (r0 != 0) goto L_0x00d8
            float r0 = r2.weight
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d8
            r0 = -2
            r2.height = r0
            r13 = 0
        L_0x00a2:
            int r0 = (r20 > r21 ? 1 : (r20 == r21 ? 0 : -1))
            if (r0 != 0) goto L_0x00d6
            int r0 = r1.A06
        L_0x00a8:
            r26 = 0
            r23 = r1
            r24 = r15
            r25 = r32
            r27 = r34
            r28 = r0
            r23.measureChildWithMargins(r24, r25, r26, r27, r28)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r13 == r0) goto L_0x00bd
            r2.height = r13
        L_0x00bd:
            int r14 = r15.getMeasuredHeight()
            int r13 = r1.A06
            int r0 = r13 + r14
            int r0 = X.AnonymousClass000.A0E(r2, r0)
            int r13 = java.lang.Math.max(r13, r0)
            r1.A06 = r13
            if (r11 == 0) goto L_0x007c
            int r10 = java.lang.Math.max(r14, r10)
            goto L_0x007c
        L_0x00d6:
            r0 = 0
            goto L_0x00a8
        L_0x00d8:
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x00a2
        L_0x00db:
            r13 = 1073741824(0x40000000, float:2.0)
            r0 = r22
            if (r0 == r13) goto L_0x0122
            int r13 = r2.width
            r0 = -1
            if (r13 != r0) goto L_0x0122
            r16 = 1
            r17 = 1
        L_0x00ea:
            int r14 = r2.leftMargin
            int r0 = r2.rightMargin
            int r14 = r14 + r0
            int r13 = r15.getMeasuredWidth()
            int r13 = r13 + r14
            int r8 = java.lang.Math.max(r8, r13)
            int r7 = X.AnonymousClass001.A03(r15, r7)
            if (r18 == 0) goto L_0x0106
            int r0 = r2.width
            r15 = r0
            r18 = 1
            r0 = -1
            if (r15 == r0) goto L_0x0108
        L_0x0106:
            r18 = 0
        L_0x0108:
            float r0 = r2.weight
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x011a
            if (r16 != 0) goto L_0x0111
            r14 = r13
        L_0x0111:
            int r6 = java.lang.Math.max(r6, r14)
        L_0x0115:
            r0 = 0
            int r0 = r0 + r4
            r4 = r0
            goto L_0x003c
        L_0x011a:
            if (r16 != 0) goto L_0x011d
            r14 = r13
        L_0x011d:
            int r5 = java.lang.Math.max(r5, r14)
            goto L_0x0115
        L_0x0122:
            r16 = 0
            goto L_0x00ea
        L_0x0125:
            int r0 = r1.A06
            if (r0 <= 0) goto L_0x0136
            boolean r0 = r1.A0A(r3)
            if (r0 == 0) goto L_0x0136
            int r2 = r1.A06
            int r0 = r1.A03
            int r2 = r2 + r0
            r1.A06 = r2
        L_0x0136:
            if (r11 == 0) goto L_0x0167
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 == r0) goto L_0x013e
            if (r9 != 0) goto L_0x0167
        L_0x013e:
            r12 = 0
            r1.A06 = r12
        L_0x0141:
            if (r12 >= r3) goto L_0x0167
            android.view.View r2 = r1.getChildAt(r12)
            if (r2 != 0) goto L_0x0150
            int r0 = r1.A06
        L_0x014b:
            r1.A06 = r0
        L_0x014d:
            int r12 = r12 + 1
            goto L_0x0141
        L_0x0150:
            int r0 = r2.getVisibility()
            if (r0 == r13) goto L_0x014d
            android.view.ViewGroup$MarginLayoutParams r4 = X.AnonymousClass000.A0a(r2)
            int r2 = r1.A06
            int r0 = r2 + r10
            int r0 = X.AnonymousClass000.A0E(r4, r0)
            int r0 = java.lang.Math.max(r2, r0)
            goto L_0x014b
        L_0x0167:
            int r2 = r1.A06
            int r0 = X.AnonymousClass000.A0C(r1)
            int r2 = r2 + r0
            r1.A06 = r2
            int r0 = r1.getSuggestedMinimumHeight()
            int r4 = java.lang.Math.max(r2, r0)
            r2 = 0
            r0 = r34
            int r4 = android.view.View.resolveSizeAndState(r4, r0, r2)
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r4
            int r0 = r1.A06
            int r2 = r2 - r0
            if (r19 != 0) goto L_0x018e
            if (r2 == 0) goto L_0x022b
            int r0 = (r20 > r21 ? 1 : (r20 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x022b
        L_0x018e:
            float r6 = r1.A00
            int r0 = (r6 > r21 ? 1 : (r6 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x0196
            r20 = r6
        L_0x0196:
            r0 = 0
            r1.A06 = r0
            r10 = 0
        L_0x019a:
            if (r10 >= r3) goto L_0x0260
            android.view.View r12 = r1.getChildAt(r10)
            int r6 = r12.getVisibility()
            r0 = 8
            if (r6 == r0) goto L_0x021b
            android.view.ViewGroup$LayoutParams r11 = r12.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r11 = (android.widget.LinearLayout.LayoutParams) r11
            float r6 = r11.weight
            int r0 = (r6 > r21 ? 1 : (r6 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x01e3
            float r0 = (float) r2
            float r0 = r0 * r6
            float r0 = r0 / r20
            int r13 = (int) r0
            float r20 = r20 - r6
            int r2 = r2 - r13
            int r0 = X.AnonymousClass000.A09(r1)
            int r14 = X.AnonymousClass000.A0F(r11, r0)
            int r6 = r11.width
            r0 = r32
            int r14 = android.view.ViewGroup.getChildMeasureSpec(r0, r14, r6)
            int r0 = r11.height
            r6 = 1073741824(0x40000000, float:2.0)
            if (r0 != 0) goto L_0x0222
            if (r9 != r6) goto L_0x0222
            if (r13 <= 0) goto L_0x0229
        L_0x01d6:
            X.AnonymousClass000.A16(r12, r13, r6, r14)
            int r0 = r12.getMeasuredState()
            r0 = r0 & -256(0xffffffffffffff00, float:NaN)
            int r7 = android.view.View.combineMeasuredStates(r7, r0)
        L_0x01e3:
            int r14 = r11.leftMargin
            int r0 = r11.rightMargin
            int r14 = r14 + r0
            int r13 = r12.getMeasuredWidth()
            int r13 = r13 + r14
            int r8 = java.lang.Math.max(r8, r13)
            r6 = 1073741824(0x40000000, float:2.0)
            r0 = r22
            if (r0 == r6) goto L_0x021f
            int r0 = r11.width
            r6 = -1
            if (r0 != r6) goto L_0x0220
        L_0x01fc:
            int r5 = java.lang.Math.max(r5, r14)
            if (r18 == 0) goto L_0x0208
            int r0 = r11.width
            r18 = 1
            if (r0 == r6) goto L_0x020a
        L_0x0208:
            r18 = 0
        L_0x020a:
            int r6 = r1.A06
            int r0 = r12.getMeasuredHeight()
            int r0 = r0 + r6
            int r0 = X.AnonymousClass000.A0E(r11, r0)
            int r0 = java.lang.Math.max(r6, r0)
            r1.A06 = r0
        L_0x021b:
            int r10 = r10 + 1
            goto L_0x019a
        L_0x021f:
            r6 = -1
        L_0x0220:
            r14 = r13
            goto L_0x01fc
        L_0x0222:
            int r0 = r12.getMeasuredHeight()
            int r13 = r13 + r0
            if (r13 >= 0) goto L_0x01d6
        L_0x0229:
            r13 = 0
            goto L_0x01d6
        L_0x022b:
            int r5 = java.lang.Math.max(r5, r6)
            if (r11 == 0) goto L_0x0269
            r0 = 1073741824(0x40000000, float:2.0)
            if (r9 == r0) goto L_0x0269
            r9 = 0
        L_0x0236:
            if (r9 >= r3) goto L_0x0269
            android.view.View r6 = r1.getChildAt(r9)
            if (r6 == 0) goto L_0x025d
            int r0 = r6.getVisibility()
            if (r0 == r13) goto L_0x025d
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            float r0 = r0.weight
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x025d
            int r0 = r6.getMeasuredWidth()
            r2 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            X.AnonymousClass000.A16(r6, r10, r2, r0)
        L_0x025d:
            int r9 = r9 + 1
            goto L_0x0236
        L_0x0260:
            int r2 = r1.A06
            int r0 = X.AnonymousClass000.A0C(r1)
            int r2 = r2 + r0
            r1.A06 = r2
        L_0x0269:
            if (r18 != 0) goto L_0x02c0
            r2 = 1073741824(0x40000000, float:2.0)
            r0 = r22
            if (r0 == r2) goto L_0x02c0
        L_0x0271:
            int r0 = X.AnonymousClass000.A09(r1)
            int r5 = r5 + r0
            int r0 = r1.getSuggestedMinimumWidth()
            int r2 = java.lang.Math.max(r5, r0)
            r0 = r32
            int r0 = android.view.View.resolveSizeAndState(r2, r0, r7)
            r1.setMeasuredDimension(r0, r4)
            if (r17 == 0) goto L_0x06ca
            int r2 = r1.getMeasuredWidth()
            r0 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r5 = 0
        L_0x0294:
            if (r5 >= r3) goto L_0x06ca
            android.view.View r7 = r1.getChildAt(r5)
            int r2 = r7.getVisibility()
            r0 = 8
            if (r2 == r0) goto L_0x02bd
            android.view.ViewGroup$LayoutParams r4 = r7.getLayoutParams()
            int r2 = r4.width
            r0 = -1
            if (r2 != r0) goto L_0x02bd
            int r2 = r4.height
            int r0 = r7.getMeasuredHeight()
            r4.height = r0
            r9 = 0
            r11 = 0
            r6 = r1
            r10 = r34
            r6.measureChildWithMargins(r7, r8, r9, r10, r11)
            r4.height = r2
        L_0x02bd:
            int r5 = r5 + 1
            goto L_0x0294
        L_0x02c0:
            r5 = r8
            goto L_0x0271
        L_0x02c2:
            r10 = 0
            r1.A06 = r10
            int r2 = r1.getChildCount()
            int r8 = android.view.View.MeasureSpec.getMode(r32)
            int r29 = android.view.View.MeasureSpec.getMode(r34)
            int[] r7 = r1.A0A
            r0 = 4
            if (r7 == 0) goto L_0x02da
            int[] r6 = r1.A0B
            if (r6 != 0) goto L_0x02e2
        L_0x02da:
            int[] r7 = new int[r0]
            r1.A0A = r7
            int[] r6 = new int[r0]
            r1.A0B = r6
        L_0x02e2:
            r28 = 3
            r0 = -1
            r7[r28] = r0
            r27 = 2
            r7[r27] = r0
            r7[r9] = r0
            r7[r10] = r0
            r6[r28] = r0
            r6[r27] = r0
            r6[r9] = r0
            r6[r10] = r0
            boolean r0 = r1.A08
            r26 = r0
            boolean r0 = r1.A09
            r25 = r0
            r13 = 1073741824(0x40000000, float:2.0)
            boolean r24 = X.AnonymousClass000.A1S(r8, r13)
            r23 = 0
            r22 = 0
            r11 = 0
            r5 = 0
            r4 = 0
            r21 = 0
            r20 = 0
            r3 = 0
            r19 = 1
            r18 = 0
        L_0x0315:
            r12 = 8
            if (r11 >= r2) goto L_0x0442
            android.view.View r16 = r1.getChildAt(r11)
            if (r16 != 0) goto L_0x0328
            int r0 = r1.A06
            r1.A06 = r0
        L_0x0323:
            int r11 = r11 + 1
            r13 = 1073741824(0x40000000, float:2.0)
            goto L_0x0315
        L_0x0328:
            int r0 = r16.getVisibility()
            if (r0 == r12) goto L_0x0323
            boolean r0 = r1.A0A(r11)
            if (r0 == 0) goto L_0x033b
            int r12 = r1.A06
            int r0 = r1.A04
            int r12 = r12 + r0
            r1.A06 = r12
        L_0x033b:
            android.view.ViewGroup$LayoutParams r12 = r16.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r12 = (android.widget.LinearLayout.LayoutParams) r12
            float r0 = r12.weight
            float r22 = r22 + r0
            if (r8 != r13) goto L_0x03f2
            int r0 = r12.width
            if (r0 != 0) goto L_0x03f2
            float r0 = r12.weight
            int r0 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x03f2
            int r14 = r1.A06
            int r13 = r12.leftMargin
            if (r24 == 0) goto L_0x03e8
            int r0 = r12.rightMargin
            int r13 = r13 + r0
            int r14 = r14 + r13
        L_0x035b:
            r1.A06 = r14
            if (r26 == 0) goto L_0x03e1
            r0 = 0
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r0 = r16
            r0.measure(r13, r13)
        L_0x0369:
            r13 = 1073741824(0x40000000, float:2.0)
        L_0x036b:
            r0 = r29
            if (r0 == r13) goto L_0x03de
            int r13 = r12.height
            r0 = -1
            if (r13 != r0) goto L_0x03de
            r17 = 1
            r18 = 1
        L_0x0378:
            int r13 = r12.topMargin
            int r0 = r12.bottomMargin
            int r13 = r13 + r0
            int r14 = r16.getMeasuredHeight()
            int r14 = r14 + r13
            r0 = r16
            int r3 = X.AnonymousClass001.A03(r0, r3)
            if (r26 == 0) goto L_0x03b0
            int r15 = r16.getBaseline()
            r0 = -1
            if (r15 == r0) goto L_0x03b0
            int r0 = r12.gravity
            if (r0 >= 0) goto L_0x03db
            int r0 = r1.A05
        L_0x0397:
            r16 = r0 & 112(0x70, float:1.57E-43)
            r0 = 4
            int r16 = r16 >> r0
            r0 = r16 & -2
            int r16 = r0 >> 1
            r0 = r7[r16]
            int r0 = java.lang.Math.max(r0, r15)
            r7[r16] = r0
            r0 = r6[r16]
            int r0 = X.AnonymousClass001.A02(r14, r15, r0)
            r6[r16] = r0
        L_0x03b0:
            int r5 = java.lang.Math.max(r5, r14)
            if (r19 == 0) goto L_0x03bd
            int r15 = r12.height
            r0 = -1
            r19 = 1
            if (r15 == r0) goto L_0x03bf
        L_0x03bd:
            r19 = 0
        L_0x03bf:
            float r0 = r12.weight
            int r0 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x03d3
            if (r17 != 0) goto L_0x03c8
            r13 = r14
        L_0x03c8:
            r0 = r21
            int r21 = java.lang.Math.max(r0, r13)
        L_0x03ce:
            r0 = 0
            int r0 = r0 + r11
            r11 = r0
            goto L_0x0323
        L_0x03d3:
            if (r17 != 0) goto L_0x03d6
            r13 = r14
        L_0x03d6:
            int r4 = java.lang.Math.max(r4, r13)
            goto L_0x03ce
        L_0x03db:
            int r0 = r12.gravity
            goto L_0x0397
        L_0x03de:
            r17 = 0
            goto L_0x0378
        L_0x03e1:
            r26 = 0
            r13 = 1073741824(0x40000000, float:2.0)
            r20 = 1
            goto L_0x036b
        L_0x03e8:
            int r13 = r13 + r14
            int r0 = r12.rightMargin
            int r13 = r13 + r0
            int r14 = java.lang.Math.max(r14, r13)
            goto L_0x035b
        L_0x03f2:
            int r0 = r12.width
            if (r0 != 0) goto L_0x043f
            float r0 = r12.weight
            int r0 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x043f
            r0 = -2
            r12.width = r0
            r14 = 0
        L_0x0400:
            int r0 = (r22 > r23 ? 1 : (r22 == r23 ? 0 : -1))
            if (r0 != 0) goto L_0x043d
            int r13 = r1.A06
        L_0x0406:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r35 = 0
            r30 = r1
            r31 = r16
            r33 = r13
            r30.measureChildWithMargins(r31, r32, r33, r34, r35)
            if (r14 == r0) goto L_0x0417
            r12.width = r14
        L_0x0417:
            int r13 = r16.getMeasuredWidth()
            if (r24 == 0) goto L_0x0430
            int r15 = r1.A06
            int r14 = r12.leftMargin
            int r14 = r14 + r13
            int r0 = r12.rightMargin
            int r14 = r14 + r0
            int r15 = r15 + r14
        L_0x0426:
            r1.A06 = r15
            if (r25 == 0) goto L_0x0369
            int r10 = java.lang.Math.max(r13, r10)
            goto L_0x0369
        L_0x0430:
            int r14 = r1.A06
            int r0 = r14 + r13
            int r0 = X.AnonymousClass000.A0F(r12, r0)
            int r15 = java.lang.Math.max(r14, r0)
            goto L_0x0426
        L_0x043d:
            r13 = 0
            goto L_0x0406
        L_0x043f:
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0400
        L_0x0442:
            int r0 = r1.A06
            if (r0 <= 0) goto L_0x0453
            boolean r0 = r1.A0A(r2)
            if (r0 == 0) goto L_0x0453
            int r11 = r1.A06
            int r0 = r1.A04
            int r11 = r11 + r0
            r1.A06 = r11
        L_0x0453:
            r13 = r7[r9]
            r11 = -1
            if (r13 != r11) goto L_0x0465
            r0 = 0
            r0 = r7[r0]
            if (r0 != r11) goto L_0x0465
            r0 = r7[r27]
            if (r0 != r11) goto L_0x0465
            r0 = r7[r28]
            if (r0 == r11) goto L_0x0492
        L_0x0465:
            r12 = r7[r28]
            r0 = 0
            r11 = r7[r0]
            r0 = r7[r27]
            int r0 = java.lang.Math.max(r13, r0)
            int r0 = java.lang.Math.max(r11, r0)
            int r12 = java.lang.Math.max(r12, r0)
            r13 = r6[r28]
            r0 = 0
            r14 = r6[r0]
            r11 = r6[r9]
            r0 = r6[r27]
            int r0 = java.lang.Math.max(r11, r0)
            int r0 = java.lang.Math.max(r14, r0)
            int r0 = java.lang.Math.max(r13, r0)
            int r12 = r12 + r0
            int r5 = java.lang.Math.max(r5, r12)
        L_0x0492:
            if (r25 == 0) goto L_0x04d1
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 == r0) goto L_0x049a
            if (r8 != 0) goto L_0x04d1
        L_0x049a:
            r13 = 0
            r1.A06 = r13
        L_0x049d:
            if (r13 >= r2) goto L_0x04d1
            android.view.View r12 = r1.getChildAt(r13)
            if (r12 != 0) goto L_0x04ac
            int r0 = r1.A06
        L_0x04a7:
            r1.A06 = r0
        L_0x04a9:
            int r13 = r13 + 1
            goto L_0x049d
        L_0x04ac:
            int r11 = r12.getVisibility()
            r0 = 8
            if (r11 == r0) goto L_0x04a9
            android.view.ViewGroup$MarginLayoutParams r14 = X.AnonymousClass000.A0a(r12)
            int r12 = r1.A06
            if (r24 == 0) goto L_0x04c6
            int r11 = r14.leftMargin
            int r11 = r11 + r10
            int r0 = r14.rightMargin
            int r11 = r11 + r0
            int r12 = r12 + r11
            r1.A06 = r12
            goto L_0x04a9
        L_0x04c6:
            int r0 = r12 + r10
            int r0 = X.AnonymousClass000.A0F(r14, r0)
            int r0 = java.lang.Math.max(r12, r0)
            goto L_0x04a7
        L_0x04d1:
            int r11 = r1.A06
            int r0 = X.AnonymousClass000.A09(r1)
            int r11 = r11 + r0
            r1.A06 = r11
            int r0 = r1.getSuggestedMinimumWidth()
            int r11 = java.lang.Math.max(r11, r0)
            r12 = 0
            r0 = r32
            int r17 = android.view.View.resolveSizeAndState(r11, r0, r12)
            r11 = 16777215(0xffffff, float:2.3509886E-38)
            r11 = r11 & r17
            int r0 = r1.A06
            int r11 = r11 - r0
            if (r20 != 0) goto L_0x04f9
            if (r11 == 0) goto L_0x05e8
            int r0 = (r22 > r23 ? 1 : (r22 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x05e8
        L_0x04f9:
            float r5 = r1.A00
            int r0 = (r5 > r23 ? 1 : (r5 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x0501
            r22 = r5
        L_0x0501:
            r0 = -1
            r7[r28] = r0
            r7[r27] = r0
            r7[r9] = r0
            r7[r12] = r0
            r6[r28] = r0
            r6[r27] = r0
            r6[r9] = r0
            r6[r12] = r0
            r1.A06 = r12
            r5 = -1
        L_0x0515:
            if (r12 >= r2) goto L_0x0621
            android.view.View r16 = r1.getChildAt(r12)
            if (r16 == 0) goto L_0x05c9
            int r10 = r16.getVisibility()
            r0 = 8
            if (r10 == r0) goto L_0x05c9
            android.view.ViewGroup$LayoutParams r10 = r16.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r10 = (android.widget.LinearLayout.LayoutParams) r10
            float r14 = r10.weight
            int r0 = (r14 > r23 ? 1 : (r14 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x0567
            float r0 = (float) r11
            float r0 = r0 * r14
            float r0 = r0 / r22
            int r13 = (int) r0
            float r22 = r22 - r14
            int r11 = r11 - r13
            int r0 = X.AnonymousClass000.A0C(r1)
            int r14 = X.AnonymousClass000.A0E(r10, r0)
            int r0 = r10.height
            r15 = r34
            int r15 = android.view.ViewGroup.getChildMeasureSpec(r15, r14, r0)
            int r0 = r10.width
            r14 = 1073741824(0x40000000, float:2.0)
            if (r0 != 0) goto L_0x05de
            if (r8 != r14) goto L_0x05de
            if (r13 <= 0) goto L_0x05e5
        L_0x0553:
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r14)
            r0 = r16
            r0.measure(r14, r15)
            int r13 = r16.getMeasuredState()
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r13 = r13 & r0
            int r3 = android.view.View.combineMeasuredStates(r3, r13)
        L_0x0567:
            int r13 = r1.A06
            int r0 = r16.getMeasuredWidth()
            if (r24 == 0) goto L_0x05d2
            int r0 = X.AnonymousClass000.A0F(r10, r0)
            int r13 = r13 + r0
            r1.A06 = r13
        L_0x0576:
            r13 = 1073741824(0x40000000, float:2.0)
            r0 = r29
            if (r0 == r13) goto L_0x0582
            int r13 = r10.height
            r0 = -1
            r15 = 1
            if (r13 == r0) goto L_0x0583
        L_0x0582:
            r15 = 0
        L_0x0583:
            int r14 = r10.topMargin
            int r0 = r10.bottomMargin
            int r14 = r14 + r0
            int r13 = r16.getMeasuredHeight()
            int r13 = r13 + r14
            int r5 = java.lang.Math.max(r5, r13)
            if (r15 != 0) goto L_0x0594
            r14 = r13
        L_0x0594:
            int r4 = java.lang.Math.max(r4, r14)
            if (r19 == 0) goto L_0x05d0
            int r0 = r10.height
            r15 = -1
            r19 = 1
            if (r0 == r15) goto L_0x05a3
        L_0x05a1:
            r19 = 0
        L_0x05a3:
            if (r26 == 0) goto L_0x05c9
            int r14 = r16.getBaseline()
            if (r14 == r15) goto L_0x05c9
            int r0 = r10.gravity
            if (r0 >= 0) goto L_0x05cd
            int r0 = r1.A05
        L_0x05b1:
            r10 = r0 & 112(0x70, float:1.57E-43)
            r0 = 4
            int r10 = r10 >> r0
            r0 = r10 & -2
            int r10 = r0 >> 1
            r0 = r7[r10]
            int r0 = java.lang.Math.max(r0, r14)
            r7[r10] = r0
            r0 = r6[r10]
            int r0 = X.AnonymousClass001.A02(r13, r14, r0)
            r6[r10] = r0
        L_0x05c9:
            int r12 = r12 + 1
            goto L_0x0515
        L_0x05cd:
            int r0 = r10.gravity
            goto L_0x05b1
        L_0x05d0:
            r15 = -1
            goto L_0x05a1
        L_0x05d2:
            int r0 = r0 + r13
            int r0 = X.AnonymousClass000.A0F(r10, r0)
            int r0 = java.lang.Math.max(r13, r0)
            r1.A06 = r0
            goto L_0x0576
        L_0x05de:
            int r0 = r16.getMeasuredWidth()
            int r13 = r13 + r0
            if (r13 >= 0) goto L_0x0553
        L_0x05e5:
            r13 = 0
            goto L_0x0553
        L_0x05e8:
            r0 = r21
            int r4 = java.lang.Math.max(r4, r0)
            if (r25 == 0) goto L_0x0668
            r0 = 1073741824(0x40000000, float:2.0)
            if (r8 == r0) goto L_0x0668
            r9 = 0
        L_0x05f5:
            if (r9 >= r2) goto L_0x0668
            android.view.View r8 = r1.getChildAt(r9)
            if (r8 == 0) goto L_0x061e
            int r6 = r8.getVisibility()
            r0 = 8
            if (r6 == r0) goto L_0x061e
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            float r0 = r0.weight
            int r0 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x061e
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r7)
            int r0 = r8.getMeasuredHeight()
            X.AnonymousClass000.A16(r8, r0, r7, r6)
        L_0x061e:
            int r9 = r9 + 1
            goto L_0x05f5
        L_0x0621:
            int r8 = r1.A06
            int r0 = X.AnonymousClass000.A09(r1)
            int r8 = r8 + r0
            r1.A06 = r8
            r11 = r7[r9]
            r8 = -1
            if (r11 != r8) goto L_0x063c
            r0 = 0
            r0 = r7[r0]
            if (r0 != r8) goto L_0x063c
            r0 = r7[r27]
            if (r0 != r8) goto L_0x063c
            r0 = r7[r28]
            if (r0 == r8) goto L_0x0668
        L_0x063c:
            r10 = r7[r28]
            r12 = 0
            r8 = r7[r12]
            r0 = r7[r27]
            int r0 = java.lang.Math.max(r11, r0)
            int r0 = java.lang.Math.max(r8, r0)
            int r11 = java.lang.Math.max(r10, r0)
            r10 = r6[r28]
            r8 = r6[r12]
            r7 = r6[r9]
            r0 = r6[r27]
            int r0 = java.lang.Math.max(r7, r0)
            int r0 = java.lang.Math.max(r8, r0)
            int r0 = java.lang.Math.max(r10, r0)
            int r11 = r11 + r0
            int r5 = java.lang.Math.max(r5, r11)
        L_0x0668:
            if (r19 != 0) goto L_0x06c8
            r6 = 1073741824(0x40000000, float:2.0)
            r0 = r29
            if (r0 == r6) goto L_0x06c8
        L_0x0670:
            int r0 = X.AnonymousClass000.A0C(r1)
            int r4 = r4 + r0
            int r0 = r1.getSuggestedMinimumHeight()
            int r4 = java.lang.Math.max(r4, r0)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r3
            r17 = r17 | r0
            int r3 = r3 << 16
            r0 = r34
            int r3 = android.view.View.resolveSizeAndState(r4, r0, r3)
            r0 = r17
            r1.setMeasuredDimension(r0, r3)
            if (r18 == 0) goto L_0x06ca
            int r3 = r1.getMeasuredHeight()
            r0 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            r5 = 0
        L_0x069c:
            if (r5 >= r2) goto L_0x06ca
            android.view.View r7 = r1.getChildAt(r5)
            int r3 = r7.getVisibility()
            r0 = 8
            if (r3 == r0) goto L_0x06c5
            android.view.ViewGroup$LayoutParams r4 = r7.getLayoutParams()
            int r3 = r4.height
            r0 = -1
            if (r3 != r0) goto L_0x06c5
            int r3 = r4.width
            int r0 = r7.getMeasuredWidth()
            r4.width = r0
            r9 = 0
            r11 = 0
            r6 = r1
            r8 = r32
            r6.measureChildWithMargins(r7, r8, r9, r10, r11)
            r4.width = r3
        L_0x06c5:
            int r5 = r5 + 1
            goto L_0x069c
        L_0x06c8:
            r4 = r5
            goto L_0x0670
        L_0x06ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A08 = true;
        this.A01 = -1;
        this.A02 = 0;
        this.A05 = 8388659;
        int[] iArr = AnonymousClass1MJ.A0C;
        C010404j A002 = C010404j.A00(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = A002.A02;
        C012005e.A0E(context, typedArray, attributeSet, this, iArr, i);
        int i2 = typedArray.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArray.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        if (!typedArray.getBoolean(2, true)) {
            this.A08 = false;
        }
        this.A00 = typedArray.getFloat(4, -1.0f);
        this.A01 = typedArray.getInt(3, -1);
        this.A09 = typedArray.getBoolean(7, false);
        setDividerDrawable(A002.A02(5));
        this.A0E = typedArray.getInt(8, 0);
        this.A0C = typedArray.getDimensionPixelSize(6, 0);
        typedArray.recycle();
    }

    public LinearLayoutCompat(Context context) {
        this(context, (AttributeSet) null);
    }
}
