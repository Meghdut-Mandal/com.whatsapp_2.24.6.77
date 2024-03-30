package androidx.appcompat.widget;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass02X;
import X.AnonymousClass07C;
import X.AnonymousClass07D;
import X.AnonymousClass07I;
import X.AnonymousClass07J;
import X.AnonymousClass09G;
import X.AnonymousClass09H;
import X.AnonymousClass09O;
import X.AnonymousClass09P;
import X.AnonymousClass09T;
import X.AnonymousClass0EM;
import X.C011504z;
import X.C012005e;
import X.C016307a;
import X.C02400Ad;
import X.C02410Ae;
import X.C02440Ai;
import X.C09460cP;
import X.C11060ff;
import X.C11070fg;
import X.C16990qX;
import X.C17260qz;
import X.C18060sY;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.whatsapp.R;

public class ActionBarOverlayLayout extends ViewGroup implements C17260qz, C02400Ad, C02410Ae {
    public static final int[] A0V = {R.attr.f4nameremoved, 16842841};
    public ViewPropertyAnimator A00;
    public OverScroller A01;
    public ActionBarContainer A02;
    public AnonymousClass07I A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public Drawable A0B;
    public AnonymousClass07C A0C;
    public ContentFrameLayout A0D;
    public AnonymousClass09H A0E;
    public AnonymousClass09H A0F;
    public AnonymousClass09H A0G;
    public AnonymousClass09H A0H;
    public boolean A0I;
    public boolean A0J;
    public final AnimatorListenerAdapter A0K;
    public final Runnable A0L;
    public final Runnable A0M;
    public final Rect A0N;
    public final Rect A0O;
    public final Rect A0P;
    public final Rect A0Q;
    public final Rect A0R;
    public final Rect A0S;
    public final Rect A0T;
    public final C02440Ai A0U;

    public void BbR(View view, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        BbQ(view, i, i2, i3, i4, i5);
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        int measuredHeight;
        AnonymousClass09H A002;
        A03();
        int i3 = i;
        int i4 = i2;
        measureChildWithMargins(this.A02, i3, 0, i4, 0);
        ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(this.A02);
        int max = Math.max(0, AnonymousClass000.A0F(A0a, this.A02.getMeasuredWidth()));
        int max2 = Math.max(0, AnonymousClass000.A0E(A0a, this.A02.getMeasuredHeight()));
        int A032 = AnonymousClass001.A03(this.A02, 0);
        if ((C011504z.A03(this) & 256) != 0) {
            z = true;
            measuredHeight = this.A07;
            if (this.A05 && this.A02.A05 != null) {
                measuredHeight += measuredHeight;
            }
        } else {
            z = false;
            measuredHeight = this.A02.getVisibility() != 8 ? this.A02.getMeasuredHeight() : 0;
        }
        Rect rect = this.A0P;
        rect.set(this.A0N);
        AnonymousClass09H r5 = this.A0E;
        this.A0F = r5;
        if (this.A06 || z) {
            AnonymousClass09T A003 = AnonymousClass09T.A00(r5.A03(), this.A0F.A05() + measuredHeight, this.A0F.A04(), this.A0F.A02());
            AnonymousClass09P r0 = new AnonymousClass09O(this.A0F).A00;
            r0.A06(A003);
            A002 = r0.A00();
        } else {
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            A002 = r5.A00.A0E(0, measuredHeight, 0, 0);
        }
        this.A0F = A002;
        ViewGroup.MarginLayoutParams A0a2 = AnonymousClass000.A0a(this.A0D);
        int i5 = A0a2.leftMargin;
        int i6 = rect.left;
        if (i5 != i6) {
            A0a2.leftMargin = i6;
        }
        int i7 = A0a2.topMargin;
        int i8 = rect.top;
        if (i7 != i8) {
            A0a2.topMargin = i8;
        }
        int i9 = A0a2.rightMargin;
        int i10 = rect.right;
        if (i9 != i10) {
            A0a2.rightMargin = i10;
        }
        int i11 = A0a2.bottomMargin;
        int i12 = rect.bottom;
        if (i11 != i12) {
            A0a2.bottomMargin = i12;
        }
        if (!this.A0H.equals(this.A0F)) {
            AnonymousClass09H r1 = this.A0F;
            this.A0H = r1;
            C012005e.A0A(this.A0D, r1);
        }
        measureChildWithMargins(this.A0D, i3, 0, i4, 0);
        ViewGroup.MarginLayoutParams A0a3 = AnonymousClass000.A0a(this.A0D);
        int max3 = Math.max(max, AnonymousClass000.A0F(A0a3, this.A0D.getMeasuredWidth()));
        int max4 = Math.max(max2, AnonymousClass000.A0E(A0a3, this.A0D.getMeasuredHeight()));
        int A033 = AnonymousClass001.A03(this.A0D, A032);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + AnonymousClass000.A09(this), getSuggestedMinimumWidth()), i, A033), View.resolveSizeAndState(Math.max(max4 + AnonymousClass000.A0C(this), getSuggestedMinimumHeight()), i4, A033 << 16));
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void A02() {
        removeCallbacks(this.A0M);
        removeCallbacks(this.A0L);
        ViewPropertyAnimator viewPropertyAnimator = this.A00;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public void A03() {
        AnonymousClass07I wrapper;
        if (this.A0D == null) {
            this.A0D = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.A02 = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof AnonymousClass07I) {
                wrapper = (AnonymousClass07I) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Can't make a decor toolbar out of ");
                throw AnonymousClass000.A0g(findViewById.getClass().getSimpleName(), A0u);
            }
            this.A03 = wrapper;
        }
    }

    public void BbQ(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    public void BbS(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    public boolean BhH(View view, View view2, int i, int i2) {
        if (i2 != 0 || !onStartNestedScroll(view, view2, i)) {
            return false;
        }
        return true;
    }

    public void Bhs(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new AnonymousClass0EM();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.A02;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        C02440Ai r0 = this.A0U;
        return r0.A01 | r0.A00;
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        Runnable runnable;
        if (!this.A0I || !z) {
            return false;
        }
        this.A01.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.A01.getFinalY() > this.A02.getHeight()) {
            A02();
            runnable = this.A0L;
        } else {
            A02();
            runnable = this.A0M;
        }
        runnable.run();
        this.A04 = true;
        return true;
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.A08 + i2;
        this.A08 = i5;
        setActionBarHideOffset(i5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = (X.AnonymousClass07D) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNestedScrollAccepted(android.view.View r3, android.view.View r4, int r5) {
        /*
            r2 = this;
            X.0Ai r0 = r2.A0U
            r0.A01 = r5
            int r0 = r2.getActionBarHideOffset()
            r2.A08 = r0
            r2.A02()
            X.07C r1 = r2.A0C
            if (r1 == 0) goto L_0x001d
            X.07D r1 = (X.AnonymousClass07D) r1
            X.0UU r0 = r1.A08
            if (r0 == 0) goto L_0x001d
            r0.A00()
            r0 = 0
            r1.A08 = r0
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onNestedScrollAccepted(android.view.View, android.view.View, int):void");
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.A02.getVisibility() != 0) {
            return false;
        }
        return this.A0I;
    }

    public void onStopNestedScroll(View view) {
        Runnable runnable;
        if (this.A0I && !this.A04) {
            if (this.A08 <= this.A02.getHeight()) {
                A02();
                runnable = this.A0M;
            } else {
                A02();
                runnable = this.A0L;
            }
            postDelayed(runnable, 600);
        }
    }

    public void setActionBarVisibilityCallback(AnonymousClass07C r3) {
        this.A0C = r3;
        if (getWindowToken() != null) {
            ((AnonymousClass07D) this.A0C).A04 = this.A0A;
            int i = this.A09;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                AnonymousClass09G.A00(this);
            }
        }
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.A0I) {
            this.A0I = z;
            if (!z) {
                A02();
                setActionBarHideOffset(0);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (getContext().getApplicationInfo().targetSdkVersion >= 19) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setOverlayMode(boolean r4) {
        /*
            r3 = this;
            r3.A06 = r4
            if (r4 == 0) goto L_0x0013
            android.content.Context r0 = r3.getContext()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r2 = r0.targetSdkVersion
            r1 = 19
            r0 = 1
            if (r2 < r1) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            r3.A0J = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.setOverlayMode(boolean):void");
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0A = 0;
        this.A0N = AnonymousClass001.A06();
        this.A0R = AnonymousClass001.A06();
        this.A0P = AnonymousClass001.A06();
        this.A0O = AnonymousClass001.A06();
        this.A0S = AnonymousClass001.A06();
        this.A0Q = AnonymousClass001.A06();
        this.A0T = AnonymousClass001.A06();
        AnonymousClass09H r0 = AnonymousClass09H.A01;
        this.A0E = r0;
        this.A0G = r0;
        this.A0F = r0;
        this.A0H = r0;
        this.A0K = new C18060sY(this, 0);
        this.A0M = new C11060ff(this);
        this.A0L = new C11070fg(this);
        A00(context);
        this.A0U = new C02440Ai();
    }

    private void A00(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(A0V);
        boolean z = false;
        this.A07 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.A0B = drawable;
        setWillNotDraw(AnonymousClass000.A1W(drawable));
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.A0J = z;
        this.A01 = new OverScroller(context);
    }

    public static void A01(Rect rect, View view, AnonymousClass09H r3) {
        WindowInsets A062 = r3.A06();
        if (A062 != null) {
            AnonymousClass09H.A01(view, view.computeSystemWindowInsets(A062, rect));
        } else {
            rect.setEmpty();
        }
    }

    public boolean BMZ() {
        C09460cP r0;
        A03();
        ActionMenuView actionMenuView = ((AnonymousClass07J) this.A03).A09.A09;
        if (actionMenuView == null || (r0 = actionMenuView.A04) == null || !r0.A02()) {
            return false;
        }
        return true;
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.A0B != null && !this.A0J) {
            if (this.A02.getVisibility() == 0) {
                i = (int) (((float) this.A02.getBottom()) + this.A02.getTranslationY() + 0.5f);
            } else {
                i = 0;
            }
            this.A0B.setBounds(0, i, getWidth(), this.A0B.getIntrinsicHeight() + i);
            this.A0B.draw(canvas);
        }
    }

    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new AnonymousClass0EM(getContext(), attributeSet);
    }

    public CharSequence getTitle() {
        A03();
        return ((AnonymousClass07J) this.A03).A09.A0E;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0082, code lost:
        if (r6 != false) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r9) {
        /*
            r8 = this;
            r8.A03()
            X.09H r7 = X.AnonymousClass09H.A01(r8, r9)
            int r4 = r7.A03()
            int r2 = r7.A05()
            int r1 = r7.A04()
            int r0 = r7.A02()
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r4, r2, r1, r0)
            androidx.appcompat.widget.ActionBarContainer r0 = r8.A02
            android.view.ViewGroup$MarginLayoutParams r2 = X.AnonymousClass000.A0a(r0)
            int r1 = r2.leftMargin
            int r0 = r3.left
            if (r1 == r0) goto L_0x0085
            r2.leftMargin = r0
            r6 = 1
        L_0x002b:
            int r1 = r2.topMargin
            int r0 = r3.top
            if (r1 == r0) goto L_0x0034
            r2.topMargin = r0
            r6 = 1
        L_0x0034:
            int r1 = r2.rightMargin
            int r0 = r3.right
            if (r1 == r0) goto L_0x003d
            r2.rightMargin = r0
            r6 = 1
        L_0x003d:
            android.graphics.Rect r5 = r8.A0N
            A01(r5, r8, r7)
            int r4 = r5.left
            int r3 = r5.top
            int r1 = r5.right
            int r0 = r5.bottom
            X.09I r2 = r7.A00
            X.09H r1 = r2.A0E(r4, r3, r1, r0)
            r8.A0E = r1
            X.09H r0 = r8.A0G
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x005f
            X.09H r0 = r8.A0E
            r8.A0G = r0
            r6 = 1
        L_0x005f:
            android.graphics.Rect r1 = r8.A0R
            boolean r0 = r1.equals(r5)
            if (r0 != 0) goto L_0x0082
            r1.set(r5)
        L_0x006a:
            r8.requestLayout()
        L_0x006d:
            X.09H r0 = r2.A06()
            X.09I r0 = r0.A00
            X.09H r0 = r0.A08()
            X.09I r0 = r0.A00
            X.09H r0 = r0.A07()
            android.view.WindowInsets r0 = r0.A06()
            return r0
        L_0x0082:
            if (r6 == 0) goto L_0x006d
            goto L_0x006a
        L_0x0085:
            r6 = 0
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A00(getContext());
        AnonymousClass09G.A00(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A02();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(childAt);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = A0a.leftMargin + paddingLeft;
                int i7 = A0a.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        super.onWindowSystemUiVisibilityChanged(i);
        A03();
        int i2 = this.A09 ^ i;
        this.A09 = i;
        boolean z2 = false;
        boolean A1Q = AnonymousClass000.A1Q(i & 4);
        if ((i & 256) != 0) {
            z2 = true;
        }
        AnonymousClass07C r1 = this.A0C;
        if (r1 != null) {
            AnonymousClass07D r12 = (AnonymousClass07D) r1;
            r12.A0C = !z2;
            if (A1Q || !z2) {
                if (r12.A0D) {
                    r12.A0D = false;
                    z = true;
                }
            } else if (!r12.A0D) {
                z = true;
                r12.A0D = true;
            }
            AnonymousClass07D.A02(r12, z);
        }
        if ((i2 & 256) != 0 && this.A0C != null) {
            AnonymousClass09G.A00(this);
        }
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.A0A = i;
        AnonymousClass07C r0 = this.A0C;
        if (r0 != null) {
            ((AnonymousClass07D) r0).A04 = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        A02();
        this.A02.setTranslationY((float) (-Math.max(0, Math.min(i, this.A02.getHeight()))));
    }

    public void setIcon(int i) {
        Drawable drawable;
        A03();
        AnonymousClass07J r1 = (AnonymousClass07J) this.A03;
        if (i != 0) {
            drawable = AnonymousClass02X.A02(r1.A09, i);
        } else {
            drawable = null;
        }
        r1.A03 = drawable;
        AnonymousClass07J.A00(r1);
    }

    public void setLogo(int i) {
        Drawable drawable;
        A03();
        AnonymousClass07J r1 = (AnonymousClass07J) this.A03;
        if (i != 0) {
            drawable = AnonymousClass02X.A02(r1.A09, i);
        } else {
            drawable = null;
        }
        r1.A04 = drawable;
        AnonymousClass07J.A00(r1);
    }

    public void setMenu(Menu menu, C16990qX r5) {
        A03();
        AnonymousClass07J r2 = (AnonymousClass07J) this.A03;
        C09460cP r1 = r2.A08;
        if (r1 == null) {
            r1 = new C09460cP(r2.A09.getContext());
            r2.A08 = r1;
            r1.A01 = R.id.action_menu_presenter;
        }
        r1.A09 = r5;
        r2.A09.setMenu((C016307a) menu, r1);
    }

    public void setWindowCallback(Window.Callback callback) {
        A03();
        ((AnonymousClass07J) this.A03).A07 = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        A03();
        this.A03.setWindowTitle(charSequence);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof AnonymousClass0EM;
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.A05 = z;
    }

    public void BbP(View view, int[] iArr, int i, int i2, int i3) {
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new AnonymousClass0EM(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        A03();
        AnonymousClass07J r0 = (AnonymousClass07J) this.A03;
        r0.A03 = drawable;
        AnonymousClass07J.A00(r0);
    }
}
