package androidx.appcompat.widget;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass04F;
import X.AnonymousClass04u;
import X.AnonymousClass0Fd;
import X.AnonymousClass0V7;
import X.AnonymousClass1MJ;
import X.C010404j;
import X.C011504z;
import X.C09460cP;
import X.C09780cv;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import java.lang.reflect.Method;

public class ActionBarContextView extends ViewGroup {
    public int A00;
    public View A01;
    public C09460cP A02;
    public AnonymousClass0V7 A03;
    public CharSequence A04;
    public CharSequence A05;
    public boolean A06;
    public int A07;
    public int A08;
    public int A09;
    public View A0A;
    public View A0B;
    public LinearLayout A0C;
    public TextView A0D;
    public TextView A0E;
    public boolean A0F;
    public boolean A0G;
    public ActionMenuView A0H;
    public final Context A0I;
    public final C09780cv A0J;

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    private void A01() {
        if (this.A0C == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.f9nameremoved, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.A0C = linearLayout;
            this.A0E = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.A0D = (TextView) this.A0C.findViewById(R.id.action_bar_subtitle);
            int i = this.A09;
            if (i != 0) {
                this.A0E.setTextAppearance(getContext(), i);
            }
            int i2 = this.A08;
            if (i2 != 0) {
                this.A0D.setTextAppearance(getContext(), i2);
            }
        }
        this.A0E.setText(this.A05);
        this.A0D.setText(this.A04);
        boolean z = !TextUtils.isEmpty(this.A05);
        boolean z2 = !TextUtils.isEmpty(this.A04);
        TextView textView = this.A0D;
        int i3 = 0;
        int i4 = 8;
        if (z2) {
            i4 = 0;
        }
        textView.setVisibility(i4);
        LinearLayout linearLayout2 = this.A0C;
        if (!z && !z2) {
            i3 = 8;
        }
        linearLayout2.setVisibility(i3);
        if (this.A0C.getParent() == null) {
            addView(this.A0C);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.AnonymousClass0V9 r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.A01
            if (r0 != 0) goto L_0x0090
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            int r1 = r6.A07
            r0 = 0
            android.view.View r0 = r2.inflate(r1, r6, r0)
            r6.A01 = r0
        L_0x0015:
            r6.addView(r0)
        L_0x0018:
            android.view.View r1 = r6.A01
            r0 = 2131427510(0x7f0b00b6, float:1.8476638E38)
            android.view.View r1 = r1.findViewById(r0)
            r6.A0A = r1
            r5 = 0
            X.0sv r0 = new X.0sv
            r0.<init>(r7, r6, r5)
            r1.setOnClickListener(r0)
            X.07a r2 = r7.A02()
            X.0cP r0 = r6.A02
            if (r0 == 0) goto L_0x003e
            r0.A01()
            X.0Fd r0 = r0.A0B
            if (r0 == 0) goto L_0x003e
            r0.A01()
        L_0x003e:
            android.content.Context r0 = r6.getContext()
            X.0cP r1 = new X.0cP
            r1.<init>(r0)
            r6.A02 = r1
            r0 = 1
            r1.A0I = r0
            r1.A0J = r0
            r1 = -2
            r0 = -1
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            r4.<init>(r1, r0)
            X.0cP r1 = r6.A02
            android.content.Context r0 = r6.A0I
            r2.A08(r0, r1)
            X.0cP r3 = r6.A02
            X.07e r2 = r3.A0A
            if (r2 != 0) goto L_0x0078
            android.view.LayoutInflater r1 = r3.A07
            r0 = 2131623939(0x7f0e0003, float:1.8875044E38)
            android.view.View r1 = r1.inflate(r0, r6, r5)
            X.07e r1 = (X.C016707e) r1
            r3.A0A = r1
            X.07a r0 = r3.A08
            r1.BKe(r0)
            r0 = 1
            r3.Bwl(r0)
        L_0x0078:
            X.07e r1 = r3.A0A
            if (r2 == r1) goto L_0x0082
            r0 = r1
            androidx.appcompat.widget.ActionMenuView r0 = (androidx.appcompat.widget.ActionMenuView) r0
            r0.setPresenter(r3)
        L_0x0082:
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r6.A0H = r1
            r0 = 0
            X.C011504z.A04(r0, r1)
            androidx.appcompat.widget.ActionMenuView r0 = r6.A0H
            r6.addView(r0, r4)
            return
        L_0x0090:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0018
            android.view.View r0 = r6.A01
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.A05(X.0V9):void");
    }

    /* renamed from: getAnimatedVisibility$AbsActionBarView */
    public int getAnimatedVisibility() {
        if (this.A03 != null) {
            return this.A0J.A00;
        }
        return getVisibility();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int A042;
        int i5;
        int i6;
        Method method = AnonymousClass04u.A00;
        boolean A072 = AnonymousClass04F.A07(this);
        if (A072) {
            paddingLeft = AnonymousClass001.A04(this, i3, i);
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int A0D2 = AnonymousClass000.A0D(this, i4 - i2);
        View view = this.A01;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(this.A01);
            if (A072) {
                int i7 = A0a.rightMargin;
                i5 = A0a.leftMargin;
                i6 = paddingLeft - i7;
            } else {
                int i8 = A0a.leftMargin;
                i5 = A0a.rightMargin;
                i6 = paddingLeft + i8;
            }
            int A002 = i6 + A00(this.A01, i6, paddingTop, A0D2, A072);
            if (A072) {
                paddingLeft = A002 - i5;
            } else {
                paddingLeft = A002 + i5;
            }
        }
        LinearLayout linearLayout = this.A0C;
        if (!(linearLayout == null || this.A0B != null || linearLayout.getVisibility() == 8)) {
            paddingLeft += A00(this.A0C, paddingLeft, paddingTop, A0D2, A072);
        }
        View view2 = this.A0B;
        if (view2 != null) {
            A00(view2, paddingLeft, paddingTop, A0D2, A072);
        }
        if (A072) {
            A042 = getPaddingLeft();
        } else {
            A042 = AnonymousClass001.A04(this, i3, i);
        }
        ActionMenuView actionMenuView = this.A0H;
        if (actionMenuView != null) {
            A00(actionMenuView, A042, paddingTop, A0D2, !A072);
        }
    }

    public void setCustomView(View view) {
        View view2 = this.A0B;
        if (view2 != null) {
            removeView(view2);
        }
        this.A0B = view;
        if (view != null) {
            LinearLayout linearLayout = this.A0C;
            if (linearLayout != null) {
                removeView(linearLayout);
                this.A0C = null;
            }
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.A04 = charSequence;
        A01();
    }

    public void setTitle(CharSequence charSequence) {
        this.A05 = charSequence;
        A01();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.A06) {
            requestLayout();
        }
        this.A06 = z;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f4nameremoved);
    }

    public static int A00(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
            return -measuredWidth;
        }
        view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        return measuredWidth;
    }

    public void A04() {
        removeAllViews();
        this.A0B = null;
        this.A0H = null;
        this.A02 = null;
        View view = this.A0A;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        if (r3 >= 360) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        if (r2 > 640) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onConfigurationChanged(android.content.res.Configuration r6) {
        /*
            r5 = this;
            super.onConfigurationChanged(r6)
            android.content.Context r4 = r5.getContext()
            int[] r3 = X.AnonymousClass1MJ.A00
            r1 = 2130968593(0x7f040011, float:1.7545844E38)
            r0 = 0
            r2 = 0
            android.content.res.TypedArray r1 = r4.obtainStyledAttributes(r0, r3, r1, r2)
            r0 = 13
            int r0 = r1.getLayoutDimension(r0, r2)
            r5.A00 = r0
            r1.recycle()
            X.0cP r4 = r5.A02
            if (r4 == 0) goto L_0x004a
            android.content.Context r0 = r4.A03
            android.content.res.Configuration r0 = X.AnonymousClass000.A0U(r0)
            int r3 = r0.screenWidthDp
            int r2 = r0.screenHeightDp
            int r1 = r0.smallestScreenWidthDp
            r0 = 600(0x258, float:8.41E-43)
            if (r1 > r0) goto L_0x0052
            if (r3 > r0) goto L_0x0052
            r0 = 500(0x1f4, float:7.0E-43)
            if (r3 >= r0) goto L_0x003f
            r1 = 480(0x1e0, float:6.73E-43)
            r0 = 640(0x280, float:8.97E-43)
            if (r3 <= r1) goto L_0x004b
            if (r2 <= r0) goto L_0x0050
        L_0x003f:
            r1 = 4
        L_0x0040:
            r4.A02 = r1
            X.07a r1 = r4.A08
            if (r1 == 0) goto L_0x004a
            r0 = 1
            r1.A0E(r0)
        L_0x004a:
            return
        L_0x004b:
            r0 = 360(0x168, float:5.04E-43)
            r1 = 2
            if (r3 < r0) goto L_0x0040
        L_0x0050:
            r1 = 3
            goto L_0x0040
        L_0x0052:
            r1 = 5
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.onConfigurationChanged(android.content.res.Configuration):void");
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C09460cP r0 = this.A02;
        if (r0 != null) {
            r0.A01();
            AnonymousClass0Fd r02 = this.A02.A0B;
            if (r02 != null) {
                r02.A01();
            }
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.A0F = false;
        }
        if (!this.A0F) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.A0F = true;
                }
                return true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.A0F = false;
            return true;
        }
        return true;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(AnonymousClass000.A0k(this));
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.A05);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            StringBuilder A0u = AnonymousClass000.A0u();
            AnonymousClass000.A1C(this, A0u);
            throw AnonymousClass000.A0g(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)", A0u);
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i4 = this.A00;
            if (i4 <= 0) {
                i4 = View.MeasureSpec.getSize(i2);
            }
            int A0C2 = AnonymousClass000.A0C(this);
            int A042 = AnonymousClass001.A04(this, size, getPaddingLeft());
            int i5 = i4 - A0C2;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            View view = this.A01;
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(A042, Integer.MIN_VALUE), makeMeasureSpec);
                int A022 = AnonymousClass001.A02(A042, view.getMeasuredWidth(), 0);
                ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(this.A01);
                A042 = A022 - (A0a.leftMargin + A0a.rightMargin);
            }
            ActionMenuView actionMenuView = this.A0H;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                ActionMenuView actionMenuView2 = this.A0H;
                actionMenuView2.measure(View.MeasureSpec.makeMeasureSpec(A042, Integer.MIN_VALUE), makeMeasureSpec);
                A042 = AnonymousClass001.A02(A042, actionMenuView2.getMeasuredWidth(), 0);
            }
            LinearLayout linearLayout = this.A0C;
            if (linearLayout != null && this.A0B == null) {
                if (this.A06) {
                    this.A0C.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.A0C.getMeasuredWidth();
                    boolean z = false;
                    if (measuredWidth <= A042) {
                        z = true;
                        A042 -= measuredWidth;
                    }
                    LinearLayout linearLayout2 = this.A0C;
                    int i6 = 8;
                    if (z) {
                        i6 = 0;
                    }
                    linearLayout2.setVisibility(i6);
                } else {
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(A042, Integer.MIN_VALUE), makeMeasureSpec);
                    A042 = AnonymousClass001.A02(A042, linearLayout.getMeasuredWidth(), 0);
                }
            }
            View view2 = this.A0B;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i7 = layoutParams.width;
                int i8 = Integer.MIN_VALUE;
                if (i7 != -2) {
                    i8 = 1073741824;
                    if (i7 >= 0) {
                        A042 = Math.min(i7, A042);
                    }
                }
                int i9 = layoutParams.height;
                if (i9 == -2) {
                    i3 = Integer.MIN_VALUE;
                } else if (i9 >= 0) {
                    i5 = Math.min(i9, i5);
                }
                AnonymousClass000.A16(this.A0B, i5, i3, View.MeasureSpec.makeMeasureSpec(A042, i8));
            }
            if (this.A00 <= 0) {
                int childCount = getChildCount();
                int i10 = 0;
                for (int i11 = 0; i11 < childCount; i11++) {
                    int measuredHeight = getChildAt(i11).getMeasuredHeight() + A0C2;
                    if (measuredHeight > i10) {
                        i10 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i10);
                return;
            }
            setMeasuredDimension(size, i4);
        } else {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            AnonymousClass000.A1C(this, A0u2);
            throw AnonymousClass000.A0g(" can only be used with android:layout_height=\"wrap_content\"", A0u2);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A0G = false;
        }
        if (!this.A0G) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.A0G = true;
                }
                return true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.A0G = false;
            return true;
        }
        return true;
    }

    /* renamed from: setVisibility$AbsActionBarView */
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            AnonymousClass0V7 r0 = this.A03;
            if (r0 != null) {
                r0.A00();
            }
            super.setVisibility(i);
        }
    }

    public void setContentHeight(int i) {
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return this.A00;
    }

    public int getContentHeight$AbsActionBarView() {
        return this.A00;
    }

    public CharSequence getSubtitle() {
        return this.A04;
    }

    public CharSequence getTitle() {
        return this.A05;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        this.A0J = new C09780cv(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.f4nameremoved, typedValue, true) || (i2 = typedValue.resourceId) == 0) {
            this.A0I = context;
        } else {
            this.A0I = new ContextThemeWrapper(context, i2);
        }
        C010404j A002 = C010404j.A00(context, attributeSet, AnonymousClass1MJ.A03, i, 0);
        C011504z.A04(A002.A02(0), this);
        TypedArray typedArray = A002.A02;
        this.A09 = typedArray.getResourceId(5, 0);
        this.A08 = typedArray.getResourceId(4, 0);
        this.A00 = typedArray.getLayoutDimension(3, 0);
        this.A07 = typedArray.getResourceId(2, R.layout.f9nameremoved);
        typedArray.recycle();
    }

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }
}
