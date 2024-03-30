package com.google.android.material.appbar;

import X.AnonymousClass000;
import X.AnonymousClass00E;
import X.AnonymousClass04F;
import X.AnonymousClass08I;
import X.AnonymousClass09G;
import X.AnonymousClass09H;
import X.AnonymousClass0Z1;
import X.C011504z;
import X.C012005e;
import X.C014406g;
import X.C03400El;
import X.C06540Tz;
import X.C10680ew;
import X.C17650rm;
import X.C17660rn;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import java.util.List;

public class CollapsingToolbarLayout extends FrameLayout {
    public int A00;
    public Drawable A01;
    public int A02;
    public int A03;
    public long A04;
    public ValueAnimator A05;
    public View A06;
    public View A07;
    public ViewGroup A08;
    public AnonymousClass09H A09;
    public boolean A0A;
    public boolean A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public Drawable A0K;
    public C17650rm A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public final C014406g A0Q;
    public final TimeInterpolator A0R;
    public final TimeInterpolator A0S;
    public final Rect A0T;
    public final AnonymousClass0Z1 A0U;

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        super.onLayout(z, i5, i6, i7, i8);
        AnonymousClass09H r0 = this.A09;
        if (r0 != null) {
            int A052 = r0.A05();
            int childCount = getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                if (!C011504z.A09(childAt) && childAt.getTop() < A052) {
                    C012005e.A0Q(childAt, A052);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i10 = 0; i10 < childCount2; i10++) {
            C06540Tz A002 = A00(getChildAt(i10));
            View view = A002.A03;
            A002.A01 = view.getTop();
            A002.A00 = view.getLeft();
        }
        A04(i5, i6, i7, i8, false);
        A03();
        A05();
        int childCount3 = getChildCount();
        for (int i11 = 0; i11 < childCount3; i11++) {
            A00(getChildAt(i11)).A00();
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int measuredHeight;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int measuredHeight2;
        A01();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        AnonymousClass09H r0 = this.A09;
        if (r0 != null) {
            i3 = r0.A05();
        } else {
            i3 = 0;
        }
        if ((mode == 0 || this.A0O) && i3 > 0) {
            this.A0J = i3;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + i3, 1073741824));
        }
        if (this.A0N) {
            AnonymousClass0Z1 r1 = this.A0U;
            if (r1.A0X > 1) {
                A03();
                A04(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
                int i4 = r1.A0U;
                if (i4 > 1) {
                    TextPaint textPaint = r1.A15;
                    textPaint.setTextSize(r1.A0M);
                    textPaint.setTypeface(r1.A0f);
                    textPaint.setLetterSpacing(r1.A0H);
                    this.A0G = Math.round((-textPaint.ascent()) + textPaint.descent()) * (i4 - 1);
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.A0G, 1073741824));
                }
            }
        }
        ViewGroup viewGroup = this.A08;
        if (viewGroup != null) {
            View view = this.A07;
            if (view == null || view == this) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    measuredHeight2 = viewGroup.getMeasuredHeight();
                } else {
                    measuredHeight = viewGroup.getMeasuredHeight();
                    setMinimumHeight(measuredHeight);
                }
            } else {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    measuredHeight2 = view.getMeasuredHeight();
                } else {
                    measuredHeight = view.getMeasuredHeight();
                    setMinimumHeight(measuredHeight);
                }
            }
            measuredHeight = AnonymousClass000.A0E(marginLayoutParams, measuredHeight2);
            setMinimumHeight(measuredHeight);
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01() {
        /*
            r6 = this;
            boolean r0 = r6.A0P
            if (r0 == 0) goto L_0x0053
            r5 = 0
            r6.A08 = r5
            r6.A07 = r5
            int r1 = r6.A0I
            r0 = -1
            if (r1 == r0) goto L_0x002e
            android.view.View r2 = r6.findViewById(r1)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r6.A08 = r2
            if (r2 == 0) goto L_0x002e
            android.view.ViewParent r1 = r2.getParent()
        L_0x001c:
            if (r1 == r6) goto L_0x002c
            if (r1 == 0) goto L_0x002c
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x0027
            r2 = r1
            android.view.View r2 = (android.view.View) r2
        L_0x0027:
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x001c
        L_0x002c:
            r6.A07 = r2
        L_0x002e:
            android.view.ViewGroup r0 = r6.A08
            r4 = 0
            if (r0 != 0) goto L_0x004e
            int r3 = r6.getChildCount()
            r2 = 0
        L_0x0038:
            if (r2 >= r3) goto L_0x004c
            android.view.View r1 = r6.getChildAt(r2)
            boolean r0 = r1 instanceof androidx.appcompat.widget.Toolbar
            if (r0 != 0) goto L_0x0049
            boolean r0 = r1 instanceof android.widget.Toolbar
            if (r0 != 0) goto L_0x0049
            int r2 = r2 + 1
            goto L_0x0038
        L_0x0049:
            r5 = r1
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
        L_0x004c:
            r6.A08 = r5
        L_0x004e:
            r6.A02()
            r6.A0P = r4
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.A01():void");
    }

    private void A02() {
        View view;
        if (!this.A0A && (view = this.A06) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.A06);
            }
        }
        if (this.A0A && this.A08 != null) {
            View view2 = this.A06;
            if (view2 == null) {
                view2 = new View(getContext());
                this.A06 = view2;
            }
            if (view2.getParent() == null) {
                this.A08.addView(this.A06, -1, -1);
            }
        }
    }

    private void A03() {
        CharSequence charSequence;
        if (this.A08 != null && this.A0A && TextUtils.isEmpty(this.A0U.A0j)) {
            ViewGroup viewGroup = this.A08;
            if (viewGroup instanceof Toolbar) {
                charSequence = ((Toolbar) viewGroup).A0E;
            } else if (viewGroup instanceof android.widget.Toolbar) {
                charSequence = ((android.widget.Toolbar) viewGroup).getTitle();
            } else {
                charSequence = null;
            }
            setTitle(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r15.A06.getVisibility() != 0) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A04(int r16, int r17, int r18, int r19, boolean r20) {
        /*
            r15 = this;
            boolean r0 = r15.A0A
            if (r0 == 0) goto L_0x00b1
            android.view.View r0 = r15.A06
            if (r0 == 0) goto L_0x00b1
            boolean r0 = X.C011304x.A02(r0)
            r14 = 0
            r7 = 1
            if (r0 == 0) goto L_0x0019
            android.view.View r0 = r15.A06
            int r1 = r0.getVisibility()
            r0 = 1
            if (r1 == 0) goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            r15.A0M = r0
            r2 = r20
            if (r0 != 0) goto L_0x0022
            if (r20 == 0) goto L_0x00b1
        L_0x0022:
            int r0 = X.AnonymousClass04F.A01(r15)
            if (r0 != r7) goto L_0x0029
            r14 = 1
        L_0x0029:
            android.view.View r5 = r15.A07
            if (r5 != 0) goto L_0x002f
            android.view.ViewGroup r5 = r15.A08
        L_0x002f:
            X.0Tz r0 = A00(r5)
            android.view.ViewGroup$MarginLayoutParams r1 = X.AnonymousClass000.A0a(r5)
            int r13 = r15.getHeight()
            int r0 = r0.A01
            int r13 = r13 - r0
            int r0 = r5.getHeight()
            int r13 = r13 - r0
            int r0 = r1.bottomMargin
            int r13 = r13 - r0
            android.view.View r0 = r15.A06
            android.graphics.Rect r8 = r15.A0T
            X.C07420Xp.A01(r8, r0, r15)
            android.view.ViewGroup r6 = r15.A08
            boolean r0 = r6 instanceof androidx.appcompat.widget.Toolbar
            r5 = 0
            if (r0 == 0) goto L_0x00c5
            androidx.appcompat.widget.Toolbar r6 = (androidx.appcompat.widget.Toolbar) r6
            int r5 = r6.A06
            int r12 = r6.A05
            int r9 = r6.A07
            int r1 = r6.A04
        L_0x005e:
            X.0Z1 r6 = r15.A0U
            int r11 = r8.left
            r0 = r5
            if (r14 == 0) goto L_0x0066
            r0 = r12
        L_0x0066:
            int r11 = r11 + r0
            int r10 = r8.top
            int r10 = r10 + r13
            int r10 = r10 + r9
            int r9 = r8.right
            if (r14 != 0) goto L_0x0070
            r5 = r12
        L_0x0070:
            int r9 = r9 - r5
            int r5 = r8.bottom
            int r5 = r5 + r13
            int r5 = r5 - r1
            android.graphics.Rect r1 = r6.A11
            int r0 = r1.left
            if (r0 != r11) goto L_0x00bf
            int r0 = r1.top
            if (r0 != r10) goto L_0x00bf
            int r0 = r1.right
            if (r0 != r9) goto L_0x00bf
            int r0 = r1.bottom
            if (r0 != r5) goto L_0x00bf
        L_0x0087:
            if (r14 == 0) goto L_0x00bc
            int r7 = r15.A0D
        L_0x008b:
            int r5 = r8.top
            int r0 = r15.A0F
            int r5 = r5 + r0
            int r4 = r18 - r16
            if (r14 == 0) goto L_0x00b9
            int r0 = r15.A0E
        L_0x0096:
            int r4 = r4 - r0
            int r3 = r19 - r17
            int r0 = r15.A0C
            int r3 = r3 - r0
            android.graphics.Rect r1 = r6.A12
            int r0 = r1.left
            if (r0 != r7) goto L_0x00b2
            int r0 = r1.top
            if (r0 != r5) goto L_0x00b2
            int r0 = r1.right
            if (r0 != r4) goto L_0x00b2
            int r0 = r1.bottom
            if (r0 != r3) goto L_0x00b2
        L_0x00ae:
            r6.A0F(r2)
        L_0x00b1:
            return
        L_0x00b2:
            r1.set(r7, r5, r4, r3)
            r0 = 1
            r6.A0m = r0
            goto L_0x00ae
        L_0x00b9:
            int r0 = r15.A0D
            goto L_0x0096
        L_0x00bc:
            int r7 = r15.A0E
            goto L_0x008b
        L_0x00bf:
            r1.set(r11, r10, r9, r5)
            r6.A0m = r7
            goto L_0x0087
        L_0x00c5:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x00e3
            boolean r0 = r6 instanceof android.widget.Toolbar
            if (r0 == 0) goto L_0x00e3
            android.widget.Toolbar r6 = (android.widget.Toolbar) r6
            int r5 = r6.getTitleMarginStart()
            int r12 = r6.getTitleMarginEnd()
            int r9 = r6.getTitleMarginTop()
            int r1 = r6.getTitleMarginBottom()
            goto L_0x005e
        L_0x00e3:
            r1 = 0
            r12 = 0
            r9 = 0
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.A04(int, int, int, int, boolean):void");
    }

    public final void A05() {
        if (this.A0K != null || this.A01 != null) {
            setScrimsShown(AnonymousClass000.A1T(getHeight() + this.A00, getScrimVisibleHeightTrigger()));
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        Drawable drawable = this.A0K;
        if (drawable != null && this.A02 > 0) {
            View view2 = this.A07;
            if (view2 == null || view2 == this) {
                view2 = this.A08;
            }
            if (view == view2) {
                int width = getWidth();
                int height = getHeight();
                if (this.A03 == 1 && view != null && this.A0A) {
                    height = view.getBottom();
                }
                drawable.setBounds(0, 0, width, height);
                this.A0K.mutate().setAlpha(this.A02);
                this.A0K.draw(canvas);
                z = true;
                if (super.drawChild(canvas, view, j) && !z) {
                    return false;
                }
            }
        }
        z = false;
        return super.drawChild(canvas, view, j) ? true : true;
    }

    public int getCollapsedTitleGravity() {
        return this.A0U.A0R;
    }

    public float getCollapsedTitleTextSize() {
        return this.A0U.A07;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.A0U.A0e;
        if (typeface == null) {
            return Typeface.DEFAULT;
        }
        return typeface;
    }

    public int getExpandedTitleGravity() {
        return this.A0U.A0V;
    }

    public float getExpandedTitleTextSize() {
        return this.A0U.A0M;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.A0U.A0f;
        if (typeface == null) {
            return Typeface.DEFAULT;
        }
        return typeface;
    }

    public int getHyphenationFrequency() {
        return this.A0U.A0W;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.A0U.A0g;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.A0U.A0g.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.A0U.A0g.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.A0U.A0X;
    }

    public int getScrimVisibleHeightTrigger() {
        int i;
        int i2 = this.A0H;
        if (i2 >= 0) {
            return i2 + this.A0J + this.A0G;
        }
        AnonymousClass09H r0 = this.A09;
        if (r0 != null) {
            i = r0.A05();
        } else {
            i = 0;
        }
        int A012 = C011504z.A01(this);
        if (A012 > 0) {
            return Math.min((A012 * 2) + i, getHeight());
        }
        return getHeight() / 3;
    }

    public CharSequence getTitle() {
        if (this.A0A) {
            return this.A0U.A0j;
        }
        return null;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.A0U.A0Y;
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.A0U.A0h;
    }

    public void setCollapsedTitleGravity(int i) {
        this.A0U.A0A(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.A0U.A09(i);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        AnonymousClass0Z1 r1 = this.A0U;
        if (r1.A0b != colorStateList) {
            r1.A0b = colorStateList;
            r1.A0F(false);
        }
    }

    public void setCollapsedTitleTextSize(float f) {
        AnonymousClass0Z1 r1 = this.A0U;
        if (r1.A07 != f) {
            r1.A07 = f;
            r1.A0F(false);
        }
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        AnonymousClass0Z1 r1 = this.A0U;
        if (AnonymousClass0Z1.A04(typeface, r1)) {
            r1.A0F(false);
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.A0K;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.A0K = drawable3;
            if (drawable3 != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.A08;
                if (this.A03 == 1 && viewGroup != null && this.A0A) {
                    height = viewGroup.getBottom();
                }
                drawable3.setBounds(0, 0, width, height);
                this.A0K.setCallback(this);
                this.A0K.setAlpha(this.A02);
            }
            C011504z.A05(this);
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setExpandedTitleGravity(int i) {
        this.A0U.A0C(i);
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.A0C = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.A0D = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.A0E = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.A0F = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.A0U.A0B(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        AnonymousClass0Z1 r1 = this.A0U;
        if (r1.A0d != colorStateList) {
            r1.A0d = colorStateList;
            r1.A0F(false);
        }
    }

    public void setExpandedTitleTextSize(float f) {
        AnonymousClass0Z1 r1 = this.A0U;
        if (r1.A0M != f) {
            r1.A0M = f;
            r1.A0F(false);
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        AnonymousClass0Z1 r1 = this.A0U;
        if (AnonymousClass0Z1.A05(typeface, r1)) {
            r1.A0F(false);
        }
    }

    public void setHyphenationFrequency(int i) {
        this.A0U.A0W = i;
    }

    public void setLineSpacingAdd(float f) {
        this.A0U.A0P = f;
    }

    public void setLineSpacingMultiplier(float f) {
        this.A0U.A0Q = f;
    }

    public void setMaxLines(int i) {
        AnonymousClass0Z1 r1 = this.A0U;
        if (i != r1.A0X) {
            r1.A0X = i;
            r1.A0F(false);
        }
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.A0U.A0p = z;
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.A02) {
            if (!(this.A0K == null || (viewGroup = this.A08) == null)) {
                C011504z.A05(viewGroup);
            }
            this.A02 = i;
            C011504z.A05(this);
        }
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.A0H != i) {
            this.A0H = i;
            A05();
        }
    }

    public void setStaticLayoutBuilderConfigurer(C17660rn r3) {
        AnonymousClass0Z1 r1 = this.A0U;
        if (null != r3) {
            r1.A0i = r3;
            r1.A0F(true);
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.A01;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.A01 = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    AnonymousClass000.A13(this.A01, this);
                }
                AnonymousClass08I.A05(AnonymousClass04F.A01(this), this.A01);
                this.A01.setVisible(AnonymousClass000.A1Q(getVisibility()), false);
                this.A01.setCallback(this);
                this.A01.setAlpha(this.A02);
            }
            C011504z.A05(this);
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setTitle(CharSequence charSequence) {
        AnonymousClass0Z1 r1 = this.A0U;
        if (charSequence == null || !TextUtils.equals(r1.A0j, charSequence)) {
            r1.A0j = charSequence;
            r1.A0k = null;
            r1.A0F(false);
        }
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i) {
        this.A03 = i;
        boolean A1O = AnonymousClass000.A1O(i);
        this.A0U.A0n = A1O;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.A03 == 1) {
                appBarLayout.A09 = false;
            }
        }
        if (A1O && this.A0K == null) {
            float dimension = getResources().getDimension(R.dimen.f7nameremoved);
            C014406g r1 = this.A0Q;
            setContentScrimColor(r1.A00(r1.A01, dimension));
        }
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        AnonymousClass0Z1 r1 = this.A0U;
        r1.A0h = truncateAt;
        r1.A0F(false);
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.A0A) {
            this.A0A = z;
            setContentDescription(getTitle());
            A02();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        AnonymousClass0Z1 r1 = this.A0U;
        r1.A0Y = timeInterpolator;
        r1.A0F(false);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f4nameremoved);
    }

    public static C06540Tz A00(View view) {
        C06540Tz r0 = (C06540Tz) view.getTag(R.id.view_offset_helper);
        if (r0 != null) {
            return r0;
        }
        C06540Tz r02 = new C06540Tz(view);
        view.setTag(R.id.view_offset_helper, r02);
        return r02;
    }

    public void draw(Canvas canvas) {
        AnonymousClass09H r0;
        int A052;
        Drawable drawable;
        super.draw(canvas);
        A01();
        if (this.A08 == null && (drawable = this.A0K) != null && this.A02 > 0) {
            drawable.mutate().setAlpha(this.A02);
            this.A0K.draw(canvas);
        }
        if (this.A0A && this.A0M) {
            if (this.A08 != null && this.A0K != null && this.A02 > 0 && this.A03 == 1) {
                AnonymousClass0Z1 r3 = this.A0U;
                if (r3.A0G < r3.A0O) {
                    int save = canvas.save();
                    canvas.clipRect(this.A0K.getBounds(), Region.Op.DIFFERENCE);
                    r3.A0E(canvas);
                    canvas.restoreToCount(save);
                }
            }
            this.A0U.A0E(canvas);
        }
        if (this.A01 != null && this.A02 > 0 && (r0 = this.A09) != null && (A052 = r0.A05()) > 0) {
            this.A01.setBounds(0, -this.A00, getWidth(), A052 - this.A00);
            this.A01.mutate().setAlpha(this.A02);
            this.A01.draw(canvas);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A01;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.A0K;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        AnonymousClass0Z1 r0 = this.A0U;
        if (r0 != null) {
            z |= r0.A0G(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C03400El(getContext(), attributeSet);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.A03 == 1) {
                appBarLayout.A09 = false;
            }
            setFitsSystemWindows(C011504z.A09(appBarLayout));
            C17650rm r0 = this.A0L;
            if (r0 == null) {
                r0 = new C10680ew(this);
                this.A0L = r0;
            }
            appBarLayout.A02(r0);
            AnonymousClass09G.A00(this);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A0U.A0D(configuration);
    }

    public void onDetachedFromWindow() {
        List list;
        ViewParent parent = getParent();
        C17650rm r1 = this.A0L;
        if (!(r1 == null || !(parent instanceof AppBarLayout) || (list = ((AppBarLayout) parent).A07) == null)) {
            list.remove(r1);
        }
        super.onDetachedFromWindow();
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.A0K;
        if (drawable != null) {
            ViewGroup viewGroup = this.A08;
            if (this.A03 == 1 && viewGroup != null && this.A0A) {
                i2 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public void setContentScrimResource(int i) {
        setContentScrim(AnonymousClass00E.A00(getContext(), i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (isInEditMode() != false) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setScrimsShown(boolean r6) {
        /*
            r5 = this;
            boolean r0 = X.C011304x.A03(r5)
            if (r0 == 0) goto L_0x000d
            boolean r0 = r5.isInEditMode()
            r1 = 1
            if (r0 == 0) goto L_0x000e
        L_0x000d:
            r1 = 0
        L_0x000e:
            boolean r0 = r5.A0B
            if (r0 == r6) goto L_0x0059
            r4 = 255(0xff, float:3.57E-43)
            if (r1 == 0) goto L_0x0069
            if (r6 != 0) goto L_0x0019
            r4 = 0
        L_0x0019:
            r5.A01()
            android.animation.ValueAnimator r0 = r5.A05
            if (r0 != 0) goto L_0x005d
            android.animation.ValueAnimator r1 = new android.animation.ValueAnimator
            r1.<init>()
            r5.A05 = r1
            int r0 = r5.A02
            if (r4 <= r0) goto L_0x005a
            android.animation.TimeInterpolator r0 = r5.A0R
        L_0x002d:
            r1.setInterpolator(r0)
            android.animation.ValueAnimator r2 = r5.A05
            r1 = 1
            X.0QY r0 = new X.0QY
            r0.<init>(r5, r1)
            r2.addUpdateListener(r0)
        L_0x003b:
            android.animation.ValueAnimator r2 = r5.A05
            long r0 = r5.A04
            r2.setDuration(r0)
            android.animation.ValueAnimator r3 = r5.A05
            r0 = 2
            int[] r2 = new int[r0]
            r1 = 0
            int r0 = r5.A02
            r2[r1] = r0
            r0 = 1
            r2[r0] = r4
            r3.setIntValues(r2)
            android.animation.ValueAnimator r0 = r5.A05
            r0.start()
        L_0x0057:
            r5.A0B = r6
        L_0x0059:
            return
        L_0x005a:
            android.animation.TimeInterpolator r0 = r5.A0S
            goto L_0x002d
        L_0x005d:
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x003b
            android.animation.ValueAnimator r0 = r5.A05
            r0.cancel()
            goto L_0x003b
        L_0x0069:
            if (r6 != 0) goto L_0x006c
            r4 = 0
        L_0x006c:
            r5.setScrimAlpha(r4)
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.setScrimsShown(boolean):void");
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(AnonymousClass00E.A00(getContext(), i));
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean A1Q = AnonymousClass000.A1Q(i);
        Drawable drawable = this.A01;
        if (!(drawable == null || drawable.isVisible() == A1Q)) {
            this.A01.setVisible(A1Q, false);
        }
        Drawable drawable2 = this.A0K;
        if (drawable2 != null && drawable2.isVisible() != A1Q) {
            this.A0K.setVisible(A1Q, false);
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.A0K || drawable == this.A01) {
            return true;
        }
        return false;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C03400El;
    }

    public void setExtraMultilineHeightEnabled(boolean z) {
        this.A0N = z;
    }

    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.A0O = z;
    }

    public void setScrimAnimationDuration(long j) {
        this.A04 = j;
    }

    public Drawable getContentScrim() {
        return this.A0K;
    }

    public int getExpandedTitleMarginBottom() {
        return this.A0C;
    }

    public int getExpandedTitleMarginEnd() {
        return this.A0D;
    }

    public int getExpandedTitleMarginStart() {
        return this.A0E;
    }

    public int getExpandedTitleMarginTop() {
        return this.A0F;
    }

    public int getScrimAlpha() {
        return this.A02;
    }

    public long getScrimAnimationDuration() {
        return this.A04;
    }

    public Drawable getStatusBarScrim() {
        return this.A01;
    }

    public int getTitleCollapseMode() {
        return this.A03;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CollapsingToolbarLayout(android.content.Context r14, android.util.AttributeSet r15, int r16) {
        /*
            r13 = this;
            r12 = 2132084396(0x7f1506ac, float:1.9808961E38)
            r8 = r15
            r11 = r16
            android.content.Context r0 = X.C27891Qg.A00(r14, r15, r11, r12)
            r13.<init>(r0, r15, r11)
            r1 = 1
            r13.A0P = r1
            android.graphics.Rect r0 = X.AnonymousClass001.A06()
            r13.A0T = r0
            r6 = -1
            r13.A0H = r6
            r2 = 0
            r13.A0J = r2
            r13.A0G = r2
            android.content.Context r7 = r13.getContext()
            X.0Z1 r4 = new X.0Z1
            r4.<init>(r13)
            r13.A0U = r4
            android.animation.TimeInterpolator r0 = X.AnonymousClass064.A00
            r4.A0Z = r0
            r4.A0F(r2)
            r4.A0p = r2
            X.06g r0 = new X.06g
            r0.<init>(r7)
            r13.A0Q = r0
            int[] r9 = X.C27931Qk.A09
            int[] r10 = new int[r2]
            android.content.res.TypedArray r5 = X.C013205s.A00(r7, r8, r9, r10, r11, r12)
            r3 = 4
            r0 = 8388691(0x800053, float:1.175506E-38)
            int r0 = r5.getInt(r3, r0)
            r4.A0C(r0)
            r0 = 8388627(0x800013, float:1.175497E-38)
            int r0 = r5.getInt(r2, r0)
            r4.A0A(r0)
            r0 = 5
            int r0 = r5.getDimensionPixelSize(r0, r2)
            r13.A0C = r0
            r13.A0D = r0
            r13.A0F = r0
            r13.A0E = r0
            r0 = 8
            r3 = 8
            boolean r0 = r5.hasValue(r0)
            if (r0 == 0) goto L_0x0073
            int r0 = r5.getDimensionPixelSize(r3, r2)
            r13.A0E = r0
        L_0x0073:
            r0 = 7
            r3 = 7
            boolean r0 = r5.hasValue(r0)
            if (r0 == 0) goto L_0x0081
            int r0 = r5.getDimensionPixelSize(r3, r2)
            r13.A0D = r0
        L_0x0081:
            r0 = 9
            r3 = 9
            boolean r0 = r5.hasValue(r0)
            if (r0 == 0) goto L_0x0091
            int r0 = r5.getDimensionPixelSize(r3, r2)
            r13.A0F = r0
        L_0x0091:
            r0 = 6
            r3 = 6
            boolean r0 = r5.hasValue(r0)
            if (r0 == 0) goto L_0x009f
            int r0 = r5.getDimensionPixelSize(r3, r2)
            r13.A0C = r0
        L_0x009f:
            r0 = 20
            boolean r0 = r5.getBoolean(r0, r1)
            r13.A0A = r0
            r0 = 18
            java.lang.CharSequence r0 = r5.getText(r0)
            r13.setTitle(r0)
            r0 = 2132083734(0x7f150416, float:1.9807619E38)
            r4.A0B(r0)
            r0 = 2132083705(0x7f1503f9, float:1.980756E38)
            r4.A09(r0)
            r0 = 10
            r3 = 10
            boolean r0 = r5.hasValue(r0)
            if (r0 == 0) goto L_0x00cd
            int r0 = r5.getResourceId(r3, r2)
            r4.A0B(r0)
        L_0x00cd:
            boolean r0 = r5.hasValue(r1)
            if (r0 == 0) goto L_0x00da
            int r0 = r5.getResourceId(r1, r2)
            r4.A09(r0)
        L_0x00da:
            r0 = 22
            r3 = 22
            boolean r0 = r5.hasValue(r0)
            if (r0 == 0) goto L_0x00f4
            int r3 = r5.getInt(r3, r6)
            if (r3 == 0) goto L_0x01bd
            if (r3 == r1) goto L_0x01b9
            r0 = 3
            if (r3 == r0) goto L_0x01b5
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
        L_0x00f1:
            r13.setTitleEllipsize(r0)
        L_0x00f4:
            r0 = 11
            r3 = 11
            boolean r0 = r5.hasValue(r0)
            if (r0 == 0) goto L_0x010b
            android.content.res.ColorStateList r3 = X.AnonymousClass061.A00(r7, r5, r3)
            android.content.res.ColorStateList r0 = r4.A0d
            if (r0 == r3) goto L_0x010b
            r4.A0d = r3
            r4.A0F(r2)
        L_0x010b:
            r0 = 2
            r3 = 2
            boolean r0 = r5.hasValue(r0)
            if (r0 == 0) goto L_0x0120
            android.content.res.ColorStateList r3 = X.AnonymousClass061.A00(r7, r5, r3)
            android.content.res.ColorStateList r0 = r4.A0b
            if (r0 == r3) goto L_0x0120
            r4.A0b = r3
            r4.A0F(r2)
        L_0x0120:
            r0 = 16
            int r0 = r5.getDimensionPixelSize(r0, r6)
            r13.A0H = r0
            r0 = 14
            r3 = 14
            boolean r0 = r5.hasValue(r0)
            if (r0 == 0) goto L_0x013f
            int r3 = r5.getInt(r3, r1)
            int r0 = r4.A0X
            if (r3 == r0) goto L_0x013f
            r4.A0X = r3
            r4.A0F(r2)
        L_0x013f:
            r0 = 21
            r3 = 21
            boolean r0 = r5.hasValue(r0)
            if (r0 == 0) goto L_0x0156
            int r0 = r5.getResourceId(r3, r2)
            android.view.animation.Interpolator r0 = android.view.animation.AnimationUtils.loadInterpolator(r7, r0)
            r4.A0Y = r0
            r4.A0F(r2)
        L_0x0156:
            r3 = 15
            r0 = 600(0x258, float:8.41E-43)
            int r0 = r5.getInt(r3, r0)
            long r3 = (long) r0
            r13.A04 = r3
            r3 = 2130970191(0x7f04064f, float:1.7549085E38)
            android.animation.TimeInterpolator r0 = X.AnonymousClass064.A01
            android.animation.TimeInterpolator r0 = X.C017807p.A01(r0, r7, r3)
            r13.A0R = r0
            android.animation.TimeInterpolator r0 = X.AnonymousClass064.A04
            android.animation.TimeInterpolator r0 = X.C017807p.A01(r0, r7, r3)
            r13.A0S = r0
            r0 = 3
            android.graphics.drawable.Drawable r0 = r5.getDrawable(r0)
            r13.setContentScrim(r0)
            r0 = 17
            android.graphics.drawable.Drawable r0 = r5.getDrawable(r0)
            r13.setStatusBarScrim(r0)
            r0 = 19
            int r0 = r5.getInt(r0, r2)
            r13.setTitleCollapseMode(r0)
            r0 = 23
            int r0 = r5.getResourceId(r0, r6)
            r13.A0I = r0
            r0 = 13
            boolean r0 = r5.getBoolean(r0, r2)
            r13.A0O = r0
            r0 = 12
            boolean r0 = r5.getBoolean(r0, r2)
            r13.A0N = r0
            r5.recycle()
            r13.setWillNotDraw(r2)
            X.0tK r0 = new X.0tK
            r0.<init>(r13, r1)
            X.C011004s.A07(r13, r0)
            return
        L_0x01b5:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.MARQUEE
            goto L_0x00f1
        L_0x01b9:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L_0x00f1
        L_0x01bd:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.START
            goto L_0x00f1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C03400El(layoutParams);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}
