package com.google.android.material.appbar;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass02X;
import X.AnonymousClass064;
import X.AnonymousClass06R;
import X.AnonymousClass09H;
import X.AnonymousClass0Ey;
import X.AnonymousClass0HQ;
import X.AnonymousClass0NA;
import X.AnonymousClass0NB;
import X.AnonymousClass0XL;
import X.AnonymousClass0Yd;
import X.AnonymousClass0ZL;
import X.C011304x;
import X.C011504z;
import X.C011705b;
import X.C012005e;
import X.C012505l;
import X.C013605y;
import X.C02460Ak;
import X.C02730Bq;
import X.C06540Tz;
import X.C06950Vt;
import X.C08840bP;
import X.C09800cx;
import X.C09810cy;
import X.C16920qQ;
import X.C17650rm;
import X.C18120se;
import X.C27931Qk;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.R;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;

public class AppBarLayout extends LinearLayout implements C013605y {
    public int A00;
    public int A01;
    public ValueAnimator.AnimatorUpdateListener A02;
    public ValueAnimator A03;
    public Drawable A04;
    public AnonymousClass09H A05;
    public WeakReference A06;
    public List A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public Behavior A0G;
    public boolean A0H;
    public int[] A0I;
    public final float A0J;
    public final long A0K;
    public final TimeInterpolator A0L;
    public final ColorStateList A0M;
    public final List A0N;

    public class BaseBehavior extends AnonymousClass0NB {
        public int A00;
        public int A01;
        public ValueAnimator A02;
        public AnonymousClass0HQ A03;
        public WeakReference A04;
        public boolean A05;

        private void A04(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int height;
            int A052 = AnonymousClass000.A05(A0S(), i);
            float abs = Math.abs(0.0f);
            if (abs > 0.0f) {
                height = Math.round((((float) A052) / abs) * 1000.0f) * 3;
            } else {
                height = (int) (((((float) A052) / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f);
            }
            int A0S = A0S();
            ValueAnimator valueAnimator = this.A02;
            if (A0S != i) {
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.A02 = valueAnimator2;
                    valueAnimator2.setInterpolator(AnonymousClass064.A00);
                    this.A02.addUpdateListener(new AnonymousClass0ZL(coordinatorLayout, this, appBarLayout));
                } else {
                    valueAnimator.cancel();
                }
                this.A02.setDuration((long) Math.min(height, 600));
                this.A02.setIntValues(new int[]{A0S, i});
                this.A02.start();
            } else if (valueAnimator != null && valueAnimator.isRunning()) {
                this.A02.cancel();
            }
        }

        public /* bridge */ /* synthetic */ void A0I(View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr, int i, int i2, int i3) {
            A0W(view2, coordinatorLayout, (AppBarLayout) view, iArr, i2);
        }

        public /* bridge */ /* synthetic */ void A0J(View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr, int i, int i2, int i3, int i4, int i5) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            if (i4 < 0) {
                iArr[1] = A0T(appBarLayout, coordinatorLayout2, A0S() - i4, -appBarLayout.getDownNestedScrollRange(), 0);
            } else if (i4 == 0) {
                A03(coordinatorLayout, appBarLayout);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x006d  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0076  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* bridge */ /* synthetic */ boolean A0P(android.view.View r11, androidx.coordinatorlayout.widget.CoordinatorLayout r12, int r13) {
            /*
                r10 = this;
                r6 = r11
                com.google.android.material.appbar.AppBarLayout r6 = (com.google.android.material.appbar.AppBarLayout) r6
                r4 = r10
                r5 = r12
                boolean r3 = super.A0P(r6, r12, r13)
                int r2 = r6.A01
                X.0HQ r1 = r10.A03
                r8 = 0
                if (r1 == 0) goto L_0x00aa
                r0 = r2 & 8
                if (r0 != 0) goto L_0x00aa
                boolean r0 = r1.A04
                if (r0 == 0) goto L_0x0078
                int r0 = r6.getTotalScrollRange()
                int r0 = -r0
            L_0x001d:
                r10.A0U(r6, r12, r0)
            L_0x0020:
                r6.A01 = r8
                r0 = 0
                r10.A03 = r0
                X.0Tz r0 = r10.A01
                if (r0 == 0) goto L_0x0076
                int r2 = r0.A02
            L_0x002b:
                int r0 = r6.getTotalScrollRange()
                int r0 = -r0
                if (r2 >= r0) goto L_0x0072
                r2 = r0
            L_0x0033:
                X.0Tz r1 = r10.A01
                if (r1 == 0) goto L_0x006f
                int r0 = r1.A02
                if (r0 == r2) goto L_0x0040
                r1.A02 = r2
                r1.A00()
            L_0x0040:
                X.0Tz r0 = r10.A01
                if (r0 == 0) goto L_0x006d
                int r7 = r0.A02
            L_0x0046:
                r9 = 1
                r4.A05(r5, r6, r7, r8, r9)
                X.0Tz r0 = r10.A01
                if (r0 == 0) goto L_0x006b
                int r0 = r0.A02
            L_0x0050:
                r6.A01(r0)
                r10.A03(r12, r6)
                android.view.View r2 = A00(r12)
                if (r2 == 0) goto L_0x006a
                int r1 = android.os.Build.VERSION.SDK_INT
                r0 = 28
                if (r1 < r0) goto L_0x00d2
                X.0bv r0 = new X.0bv
                r0.<init>(r2, r10, r6)
                r2.addOnUnhandledKeyEventListener(r0)
            L_0x006a:
                return r3
            L_0x006b:
                r0 = 0
                goto L_0x0050
            L_0x006d:
                r7 = 0
                goto L_0x0046
            L_0x006f:
                r10.A00 = r2
                goto L_0x0040
            L_0x0072:
                if (r2 <= r8) goto L_0x0033
                r2 = 0
                goto L_0x0033
            L_0x0076:
                r2 = 0
                goto L_0x002b
            L_0x0078:
                boolean r0 = r1.A03
                if (r0 != 0) goto L_0x00cd
                int r0 = r1.A01
                android.view.View r1 = r6.getChildAt(r0)
                int r0 = r1.getBottom()
                int r2 = -r0
                X.0HQ r0 = r10.A03
                boolean r0 = r0.A02
                if (r0 == 0) goto L_0x009b
                int r1 = X.C011504z.A01(r1)
                int r0 = r6.getTopInset()
                int r1 = r1 + r0
            L_0x0096:
                int r2 = r2 + r1
                r10.A0U(r6, r12, r2)
                goto L_0x0020
            L_0x009b:
                int r0 = r1.getHeight()
                float r1 = (float) r0
                X.0HQ r0 = r10.A03
                float r0 = r0.A00
                float r1 = r1 * r0
                int r1 = java.lang.Math.round(r1)
                goto L_0x0096
            L_0x00aa:
                if (r2 == 0) goto L_0x0020
                r0 = r2 & 4
                boolean r1 = X.AnonymousClass000.A1P(r0)
                r0 = r2 & 2
                if (r0 == 0) goto L_0x00c2
                int r0 = r6.getTotalScrollRange()
                int r0 = -r0
                if (r1 == 0) goto L_0x001d
                r10.A04(r12, r6, r0)
                goto L_0x0020
            L_0x00c2:
                r0 = r2 & 1
                if (r0 == 0) goto L_0x0020
                if (r1 == 0) goto L_0x00cd
                r10.A04(r12, r6, r8)
                goto L_0x0020
            L_0x00cd:
                r10.A0U(r6, r12, r8)
                goto L_0x0020
            L_0x00d2:
                X.0bm r0 = new X.0bm
                r0.<init>(r2, r10, r6)
                r2.setOnKeyListener(r0)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.A0P(android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout, int):boolean");
        }

        public /* bridge */ /* synthetic */ boolean A0Q(View view, CoordinatorLayout coordinatorLayout, int i, int i2, int i3, int i4) {
            if (view.getLayoutParams().height != -2) {
                return false;
            }
            coordinatorLayout.A0G(view, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        public void A0W(View view, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int[] iArr, int i) {
            int i2;
            AppBarLayout appBarLayout2 = appBarLayout;
            if (i != 0) {
                int i3 = -appBarLayout.getTotalScrollRange();
                if (i < 0) {
                    i2 = appBarLayout.getDownNestedPreScrollRange() + i3;
                } else {
                    i2 = 0;
                }
                if (i3 != i2) {
                    iArr[1] = A0T(appBarLayout2, coordinatorLayout, A0S() - i, i3, i2);
                }
            }
            if (appBarLayout.A09) {
                appBarLayout.A04(appBarLayout.A03(view));
            }
        }

        private void A03(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            AnonymousClass0Yd r5 = AnonymousClass0Yd.A0Z;
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            C012005e.A0N(coordinatorLayout, ((AccessibilityNodeInfo.AccessibilityAction) r5.A03).getId());
            AnonymousClass0Yd r2 = AnonymousClass0Yd.A0X;
            C012005e.A0R(coordinatorLayout, ((AccessibilityNodeInfo.AccessibilityAction) r2.A03).getId());
            C012005e.A0O(coordinatorLayout, 0);
            AppBarLayout appBarLayout2 = appBarLayout;
            if (appBarLayout.getTotalScrollRange() != 0) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (((C02460Ak) childAt.getLayoutParams()).A0B instanceof ScrollingViewBehavior) {
                        int childCount2 = appBarLayout.getChildCount();
                        for (int i2 = 0; i2 < childCount2; i2++) {
                            if (((AnonymousClass0Ey) appBarLayout.getChildAt(i2).getLayoutParams()).A00 != 0) {
                                if (C012005e.A01(coordinatorLayout) == null) {
                                    C012005e.A0V(coordinatorLayout, new C18120se(this, 0));
                                }
                                boolean z = false;
                                boolean z2 = true;
                                if (A0S() != (-appBarLayout.getTotalScrollRange())) {
                                    C012005e.A0Y(coordinatorLayout, r5, new C09800cx(this, appBarLayout, false), (CharSequence) null);
                                    z = true;
                                }
                                if (A0S() != 0) {
                                    if (childAt.canScrollVertically(-1)) {
                                        int i3 = -appBarLayout.getDownNestedPreScrollRange();
                                        if (i3 != 0) {
                                            C012005e.A0Y(coordinatorLayout, r2, new C09810cy(childAt, coordinatorLayout2, this, appBarLayout2, i3), (CharSequence) null);
                                        }
                                    } else {
                                        C012005e.A0Y(coordinatorLayout, r2, new C09800cx(this, appBarLayout, true), (CharSequence) null);
                                    }
                                    this.A05 = z2;
                                    return;
                                }
                                z2 = z;
                                this.A05 = z2;
                                return;
                            }
                        }
                        return;
                    }
                }
            }
        }

        public /* bridge */ /* synthetic */ Parcelable A0E(View view, CoordinatorLayout coordinatorLayout) {
            AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
            AnonymousClass0HQ A0V = A0V(absSavedState, (AppBarLayout) view);
            if (A0V != null) {
                return A0V;
            }
            return absSavedState;
        }

        public /* bridge */ /* synthetic */ void A0G(Parcelable parcelable, View view, CoordinatorLayout coordinatorLayout) {
            if (parcelable instanceof AnonymousClass0HQ) {
                this.A03 = (AnonymousClass0HQ) parcelable;
            } else {
                this.A03 = null;
            }
        }

        public /* bridge */ /* synthetic */ void A0H(View view, View view2, CoordinatorLayout coordinatorLayout, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.A00 == 0 || i == 1) {
                A02(coordinatorLayout, this, appBarLayout);
                if (appBarLayout.A09) {
                    appBarLayout.A04(appBarLayout.A03(view2));
                }
            }
            this.A04 = AnonymousClass001.A0F(view2);
        }

        public /* bridge */ /* synthetic */ boolean A0N(View view, View view2, View view3, CoordinatorLayout coordinatorLayout, int i, int i2) {
            boolean z;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if ((i & 2) == 0 || (!appBarLayout.A09 && (appBarLayout.getTotalScrollRange() == 0 || coordinatorLayout.getHeight() - view2.getHeight() > appBarLayout.getHeight()))) {
                z = false;
            } else {
                z = true;
                ValueAnimator valueAnimator = this.A02;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
            this.A04 = null;
            this.A00 = i2;
            return z;
        }

        public int A0S() {
            int i;
            C06540Tz r0 = this.A01;
            if (r0 != null) {
                i = r0.A02;
            } else {
                i = 0;
            }
            return i + this.A01;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0013: MOVE  (r0v0 int) = (r22v0 int)
            	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
            	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
            	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
            	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
            	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
            	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
            */
        public /* bridge */ /* synthetic */ int A0T(android.view.View r18, androidx.coordinatorlayout.widget.CoordinatorLayout r19, int r20, int r21, int r22) {
            /*
                r17 = this;
                r14 = r21
                r13 = r18
                com.google.android.material.appbar.AppBarLayout r13 = (com.google.android.material.appbar.AppBarLayout) r13
                r11 = r17
                int r3 = r11.A0S()
                r5 = 0
                r12 = r19
                if (r21 == 0) goto L_0x0154
                if (r3 < r14) goto L_0x0154
                r0 = r22
                if (r3 > r0) goto L_0x0154
                r1 = r20
                if (r1 < r14) goto L_0x001f
                r14 = r1
                if (r1 <= r0) goto L_0x001f
                r14 = r0
            L_0x001f:
                if (r3 == r14) goto L_0x00bb
                boolean r0 = r13.A08
                r2 = r14
                if (r0 == 0) goto L_0x008b
                int r6 = java.lang.Math.abs(r14)
                int r10 = r13.getChildCount()
                r1 = 0
                r7 = 0
            L_0x0030:
                if (r7 >= r10) goto L_0x008b
                android.view.View r9 = r13.getChildAt(r7)
                android.view.ViewGroup$LayoutParams r8 = r9.getLayoutParams()
                X.0Ey r8 = (X.AnonymousClass0Ey) r8
                android.view.animation.Interpolator r4 = r8.A01
                int r0 = r9.getTop()
                if (r6 < r0) goto L_0x0150
                int r0 = r9.getBottom()
                if (r6 > r0) goto L_0x0150
                if (r4 == 0) goto L_0x008b
                int r7 = r8.A00
                r0 = r7 & 1
                if (r0 == 0) goto L_0x0063
                int r0 = r9.getHeight()
                int r1 = X.AnonymousClass000.A0E(r8, r0)
                r0 = r7 & 2
                if (r0 == 0) goto L_0x0063
                int r0 = X.C011504z.A01(r9)
                int r1 = r1 - r0
            L_0x0063:
                boolean r0 = X.C011504z.A09(r9)
                if (r0 == 0) goto L_0x006e
                int r0 = r13.getTopInset()
                int r1 = r1 - r0
            L_0x006e:
                if (r1 <= 0) goto L_0x008b
                int r0 = r9.getTop()
                int r6 = r6 - r0
                float r1 = (float) r1
                float r0 = (float) r6
                float r0 = r0 / r1
                float r0 = r4.getInterpolation(r0)
                float r1 = r1 * r0
                int r1 = java.lang.Math.round(r1)
                int r2 = java.lang.Integer.signum(r14)
                int r0 = r9.getTop()
                int r0 = r0 + r1
                int r2 = r2 * r0
            L_0x008b:
                X.0Tz r1 = r11.A01
                if (r1 == 0) goto L_0x014b
                int r0 = r1.A02
                if (r0 == r2) goto L_0x014d
                r1.A02 = r2
                r1.A00()
                r1 = 1
            L_0x0099:
                int r10 = r3 - r14
                int r0 = r14 - r2
                r11.A01 = r0
                if (r1 != 0) goto L_0x00c1
                boolean r0 = r13.A08
                if (r0 == 0) goto L_0x00a8
                r12.A0E(r13)
            L_0x00a8:
                X.0Tz r0 = r11.A01
                if (r0 == 0) goto L_0x00bf
                int r0 = r0.A02
            L_0x00ae:
                r13.A01(r0)
                r15 = 1
                if (r14 >= r3) goto L_0x00b5
                r15 = -1
            L_0x00b5:
                r16 = 0
                r11.A05(r12, r13, r14, r15, r16)
                r5 = r10
            L_0x00bb:
                r11.A03(r12, r13)
                return r5
            L_0x00bf:
                r0 = 0
                goto L_0x00ae
            L_0x00c1:
                int r0 = r13.getChildCount()
                if (r5 >= r0) goto L_0x00a8
                android.view.View r0 = r13.getChildAt(r5)
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                X.0Ey r0 = (X.AnonymousClass0Ey) r0
                X.0Si r7 = r0.A02
                if (r7 == 0) goto L_0x0137
                int r0 = r0.A00
                r0 = r0 & 1
                if (r0 == 0) goto L_0x0137
                android.view.View r4 = r13.getChildAt(r5)
                X.0Tz r0 = r11.A01
                if (r0 == 0) goto L_0x0149
                int r0 = r0.A02
            L_0x00e5:
                float r2 = (float) r0
                android.graphics.Rect r8 = r7.A01
                r4.getDrawingRect(r8)
                r13.offsetDescendantRectToMyCoords(r4, r8)
                int r0 = r13.getTopInset()
                int r1 = -r0
                r0 = 0
                r8.offset(r0, r1)
                int r0 = r8.top
                float r6 = (float) r0
                float r0 = java.lang.Math.abs(r2)
                float r6 = r6 - r0
                r9 = 0
                int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
                if (r0 > 0) goto L_0x0141
                int r0 = r8.height()
                float r0 = (float) r0
                float r0 = r6 / r0
                float r1 = java.lang.Math.abs(r0)
                r2 = 1065353216(0x3f800000, float:1.0)
                int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
                if (r0 >= 0) goto L_0x013a
                r1 = 0
            L_0x0116:
                float r6 = -r6
                float r0 = r2 - r1
                float r0 = r0 * r0
                float r2 = r2 - r0
                int r0 = r8.height()
                float r1 = (float) r0
                r0 = 1050253722(0x3e99999a, float:0.3)
                float r1 = r1 * r0
                float r1 = r1 * r2
                float r6 = r6 - r1
                r4.setTranslationY(r6)
                android.graphics.Rect r2 = r7.A00
                r4.getDrawingRect(r2)
                r1 = 0
                float r0 = -r6
                int r0 = (int) r0
                r2.offset(r1, r0)
                X.AnonymousClass0VN.A01(r4, r2)
            L_0x0137:
                int r5 = r5 + 1
                goto L_0x00c1
            L_0x013a:
                int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r0 <= 0) goto L_0x0116
                r1 = 1065353216(0x3f800000, float:1.0)
                goto L_0x0116
            L_0x0141:
                r0 = 0
                X.AnonymousClass0VN.A01(r4, r0)
                r4.setTranslationY(r9)
                goto L_0x0137
            L_0x0149:
                r0 = 0
                goto L_0x00e5
            L_0x014b:
                r11.A00 = r2
            L_0x014d:
                r1 = 0
                goto L_0x0099
            L_0x0150:
                int r7 = r7 + 1
                goto L_0x0030
            L_0x0154:
                r11.A01 = r5
                goto L_0x00bb
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.A0T(android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout, int, int, int):int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
            if ((-r2) < r10.getTotalScrollRange()) goto L_0x003b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public X.AnonymousClass0HQ A0V(android.os.Parcelable r9, com.google.android.material.appbar.AppBarLayout r10) {
            /*
                r8 = this;
                X.0Tz r0 = r8.A01
                if (r0 == 0) goto L_0x005b
                int r2 = r0.A02
            L_0x0006:
                int r1 = r10.getChildCount()
                r7 = 0
                r6 = 0
            L_0x000c:
                if (r6 >= r1) goto L_0x005d
                android.view.View r5 = r10.getChildAt(r6)
                int r4 = r5.getBottom()
                int r4 = r4 + r2
                int r0 = r5.getTop()
                int r0 = r0 + r2
                if (r0 > 0) goto L_0x0058
                if (r4 < 0) goto L_0x0058
                android.os.Parcelable$Creator r0 = X.AnonymousClass0HQ.CREATOR
                if (r9 != 0) goto L_0x0026
                X.0bP r9 = X.C08840bP.A01
            L_0x0026:
                X.0HQ r3 = new X.0HQ
                r3.<init>(r9)
                boolean r0 = X.AnonymousClass000.A1Q(r2)
                r3.A03 = r0
                if (r0 != 0) goto L_0x003b
                int r2 = -r2
                int r1 = r10.getTotalScrollRange()
                r0 = 1
                if (r2 >= r1) goto L_0x003c
            L_0x003b:
                r0 = 0
            L_0x003c:
                r3.A04 = r0
                r3.A01 = r6
                int r1 = X.C011504z.A01(r5)
                int r0 = r10.getTopInset()
                int r1 = r1 + r0
                if (r4 != r1) goto L_0x004c
                r7 = 1
            L_0x004c:
                r3.A02 = r7
                float r1 = (float) r4
                int r0 = r5.getHeight()
                float r0 = (float) r0
                float r1 = r1 / r0
                r3.A00 = r1
                return r3
            L_0x0058:
                int r6 = r6 + 1
                goto L_0x000c
            L_0x005b:
                r2 = 0
                goto L_0x0006
            L_0x005d:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.A0V(android.os.Parcelable, com.google.android.material.appbar.AppBarLayout):X.0HQ");
        }

        public static View A00(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof C02730Bq) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public static void A01(KeyEvent keyEvent, View view, AppBarLayout appBarLayout) {
            if (keyEvent.getAction() == 0 || keyEvent.getAction() == 1) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19 || keyCode == 280 || keyCode == 92) {
                    if (((double) view.getScrollY()) < ((double) view.getMeasuredHeight()) * 0.1d) {
                        appBarLayout.setExpanded(true);
                    }
                } else if ((keyCode == 20 || keyCode == 281 || keyCode == 93) && view.getScrollY() > 0) {
                    appBarLayout.setExpanded(false);
                }
            }
        }

        public static void A02(CoordinatorLayout coordinatorLayout, BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
            int topInset = appBarLayout.getTopInset() + appBarLayout.getPaddingTop();
            int A0S = baseBehavior.A0S() - topInset;
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (i < childCount) {
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                AnonymousClass0Ey r1 = (AnonymousClass0Ey) childAt.getLayoutParams();
                if ((r1.A00 & 32) == 32) {
                    top -= r1.topMargin;
                    bottom += r1.bottomMargin;
                }
                int i2 = -A0S;
                if (top > i2 || bottom < i2) {
                    i++;
                } else if (i >= 0) {
                    View childAt2 = appBarLayout.getChildAt(i);
                    AnonymousClass0Ey r5 = (AnonymousClass0Ey) childAt2.getLayoutParams();
                    int i3 = r5.A00;
                    if ((i3 & 17) == 17) {
                        int i4 = -childAt2.getTop();
                        int i5 = -childAt2.getBottom();
                        if (i == 0 && C011504z.A09(appBarLayout) && C011504z.A09(childAt2)) {
                            i4 -= appBarLayout.getTopInset();
                        }
                        if ((i3 & 2) == 2) {
                            i5 += C011504z.A01(childAt2);
                        } else if ((i3 & 5) == 5) {
                            int A012 = C011504z.A01(childAt2) + i5;
                            if (A0S < A012) {
                                i4 = A012;
                            } else {
                                i5 = A012;
                            }
                        }
                        if ((i3 & 32) == 32) {
                            i4 += r5.topMargin;
                            i5 -= r5.bottomMargin;
                        }
                        if (A0S >= (i5 + i4) / 2) {
                            i5 = i4;
                        }
                        int i6 = i5 + topInset;
                        int i7 = -appBarLayout.getTotalScrollRange();
                        if (i6 >= i7) {
                            i7 = i6;
                            if (i6 > 0) {
                                i7 = 0;
                            }
                        }
                        baseBehavior.A04(coordinatorLayout, appBarLayout, i7);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        }

        private void A05(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View view;
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    view = null;
                    break;
                }
                view = appBarLayout.getChildAt(i3);
                if (abs >= view.getTop() && abs <= view.getBottom()) {
                    break;
                }
                i3++;
            }
            boolean z2 = false;
            if (view != null) {
                int i4 = ((AnonymousClass0Ey) view.getLayoutParams()).A00;
                if ((i4 & 1) != 0) {
                    int A012 = C011504z.A01(view);
                    if (((i2 > 0 && (i4 & 12) != 0) || (i4 & 2) != 0) && (-i) >= (view.getBottom() - A012) - appBarLayout.getTopInset()) {
                        z2 = true;
                    }
                }
            }
            if (appBarLayout.A09) {
                z2 = appBarLayout.A03(A00(coordinatorLayout));
            }
            boolean A042 = appBarLayout.A04(z2);
            if (!z) {
                if (A042) {
                    Collection collection = (Collection) coordinatorLayout.A0C.A00.get(appBarLayout);
                    List list = coordinatorLayout.A0D;
                    list.clear();
                    if (collection != null) {
                        list.addAll(collection);
                    }
                    int size = list.size();
                    int i5 = 0;
                    while (i5 < size) {
                        AnonymousClass0XL r1 = ((C02460Ak) ((View) list.get(i5)).getLayoutParams()).A0B;
                        if (!(r1 instanceof ScrollingViewBehavior)) {
                            i5++;
                        } else if (((AnonymousClass0NA) r1).A00 == 0) {
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            appBarLayout.jumpDrawablesToCurrentState();
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public BaseBehavior() {
        }
    }

    public class ScrollingViewBehavior extends AnonymousClass0NA {
        public void A09(View view, View view2, CoordinatorLayout coordinatorLayout) {
            if (view2 instanceof AppBarLayout) {
                C012005e.A0N(coordinatorLayout, ((AccessibilityNodeInfo.AccessibilityAction) AnonymousClass0Yd.A0Z.A03).getId());
                C012005e.A0N(coordinatorLayout, ((AccessibilityNodeInfo.AccessibilityAction) AnonymousClass0Yd.A0X.A03).getId());
                C012005e.A0V(coordinatorLayout, (C011705b) null);
            }
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C27931Qk.A0X);
            this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        public boolean A0A(Rect rect, View view, CoordinatorLayout coordinatorLayout, boolean z) {
            AppBarLayout appBarLayout;
            List A0C = coordinatorLayout.A0C(view);
            int size = A0C.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    appBarLayout = null;
                    break;
                }
                View view2 = (View) A0C.get(i);
                if (view2 instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) view2;
                    break;
                }
                i++;
            }
            boolean z2 = false;
            if (appBarLayout != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.A02;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    z2 = true;
                    int i2 = 0;
                    if (!z) {
                        i2 = 4;
                    }
                    appBarLayout.A01 = 2 | i2 | 8;
                    appBarLayout.requestLayout();
                }
            }
            return z2;
        }

        public boolean A0C(View view, View view2, CoordinatorLayout coordinatorLayout) {
            AnonymousClass0XL r2 = ((C02460Ak) view2.getLayoutParams()).A0B;
            if (r2 instanceof BaseBehavior) {
                C012005e.A0Q(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) r2).A01) + this.A01) - A0S(view2));
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.A09) {
                return false;
            }
            appBarLayout.A04(appBarLayout.A03(view));
            return false;
        }

        public boolean A0D(View view, View view2, CoordinatorLayout coordinatorLayout) {
            return view2 instanceof AppBarLayout;
        }

        public ScrollingViewBehavior() {
        }
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public void setLiftOnScrollTargetView(View view) {
        WeakReference A0F2;
        this.A00 = -1;
        if (view == null) {
            WeakReference weakReference = this.A06;
            if (weakReference != null) {
                weakReference.clear();
            }
            A0F2 = null;
        } else {
            A0F2 = AnonymousClass001.A0F(view);
        }
        this.A06 = A0F2;
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw AnonymousClass001.A08("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    private void A00() {
        AnonymousClass0HQ r2;
        Behavior behavior = this.A0G;
        if (behavior == null || this.A0F == -1 || this.A01 != 0) {
            r2 = null;
        } else {
            r2 = behavior.A0V(C08840bP.A01, this);
        }
        this.A0F = -1;
        this.A0D = -1;
        this.A0E = -1;
        if (r2 != null) {
            Behavior behavior2 = this.A0G;
            if (behavior2.A03 == null) {
                behavior2.A03 = r2;
            }
        }
    }

    public void A01(int i) {
        this.A0C = i;
        if (!willNotDraw()) {
            C011504z.A05(this);
        }
        List list = this.A07;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C16920qQ r0 = (C16920qQ) this.A07.get(i2);
                if (r0 != null) {
                    r0.Bbs(this, i);
                }
            }
        }
    }

    public void A02(C17650rm r2) {
        List list = this.A07;
        if (list == null) {
            list = AnonymousClass001.A0I();
            this.A07 = list;
        }
        if (!list.contains(r2)) {
            this.A07.add(r2);
        }
    }

    public boolean A03(View view) {
        View A0Y;
        int i;
        View view2;
        if (this.A06 == null && (i = this.A00) != -1 && (!(view == null || (view2 = view.findViewById(i)) == null) || ((getParent() instanceof ViewGroup) && (view2 = ((View) getParent()).findViewById(this.A00)) != null))) {
            this.A06 = AnonymousClass001.A0F(view2);
        }
        WeakReference weakReference = this.A06;
        if (weakReference != null && (A0Y = AnonymousClass000.A0Y(weakReference)) != null) {
            view = A0Y;
        } else if (view == null) {
            return false;
        }
        if (view.canScrollVertically(-1) || view.getScrollY() > 0) {
            return true;
        }
        return false;
    }

    public boolean A04(boolean z) {
        float f;
        if (!(!this.A0H) || this.A0B == z) {
            return false;
        }
        this.A0B = z;
        refreshDrawableState();
        if (!this.A09 || !(getBackground() instanceof C012505l)) {
            return true;
        }
        float f2 = 0.0f;
        if (this.A0M != null) {
            f = 255.0f;
            if (z) {
                f = 0.0f;
                f2 = 255.0f;
            }
        } else if (z) {
            f = 0.0f;
            f2 = this.A0J;
        } else {
            f = this.A0J;
        }
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        this.A03 = ofFloat;
        ofFloat.setDuration(this.A0K);
        this.A03.setInterpolator(this.A0L);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.A02;
        if (animatorUpdateListener != null) {
            this.A03.addUpdateListener(animatorUpdateListener);
        }
        this.A03.start();
        return true;
    }

    public AnonymousClass0XL getBehavior() {
        Behavior behavior = new Behavior();
        this.A0G = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int i;
        int A012;
        int i2 = this.A0D;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                AnonymousClass0Ey r7 = (AnonymousClass0Ey) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = r7.A00;
                if ((i4 & 5) == 5) {
                    int i5 = r7.topMargin + r7.bottomMargin;
                    if ((i4 & 8) != 0) {
                        A012 = C011504z.A01(childAt);
                    } else if ((i4 & 2) != 0) {
                        A012 = measuredHeight - C011504z.A01(childAt);
                    } else {
                        i = i5 + measuredHeight;
                        if (childCount == 0 && C011504z.A09(childAt)) {
                            i = Math.min(i, measuredHeight - getTopInset());
                        }
                        i3 += i;
                    }
                    i = i5 + A012;
                    i = Math.min(i, measuredHeight - getTopInset());
                    i3 += i;
                } else if (i3 > 0) {
                    break;
                }
            }
        }
        int max = Math.max(0, i3);
        this.A0D = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i = this.A0E;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                AnonymousClass0Ey r3 = (AnonymousClass0Ey) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + r3.topMargin + r3.bottomMargin;
                int i4 = r3.A00;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight;
                if ((i4 & 2) != 0) {
                    i3 -= C011504z.A01(childAt);
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.A0E = max;
        return max;
    }

    public final int getTopInset() {
        AnonymousClass09H r0 = this.A05;
        if (r0 != null) {
            return r0.A05();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.A0F;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                AnonymousClass0Ey r3 = (AnonymousClass0Ey) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = r3.A00;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += AnonymousClass000.A0E(r3, measuredHeight);
                if (i2 == 0 && C011504z.A09(childAt)) {
                    i3 -= getTopInset();
                }
                if ((i4 & 2) != 0) {
                    i3 -= C011504z.A01(childAt);
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.A0F = max;
        return max;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        if (r1 == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (r1 == false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int[] onCreateDrawableState(int r7) {
        /*
            r6 = this;
            int[] r4 = r6.A0I
            if (r4 != 0) goto L_0x0009
            r0 = 4
            int[] r4 = new int[r0]
            r6.A0I = r4
        L_0x0009:
            int r0 = r4.length
            int r7 = r7 + r0
            int[] r5 = super.onCreateDrawableState(r7)
            r1 = 0
            boolean r3 = r6.A0A
            r0 = 2130970770(0x7f040892, float:1.755026E38)
            if (r3 != 0) goto L_0x0018
            int r0 = -r0
        L_0x0018:
            r4[r1] = r0
            r2 = 1
            if (r3 == 0) goto L_0x0024
            boolean r1 = r6.A0B
            r0 = 2130970771(0x7f040893, float:1.7550262E38)
            if (r1 != 0) goto L_0x0028
        L_0x0024:
            r0 = 2130970771(0x7f040893, float:1.7550262E38)
            int r0 = -r0
        L_0x0028:
            r4[r2] = r0
            r1 = 2
            r0 = 2130970766(0x7f04088e, float:1.7550251E38)
            if (r3 != 0) goto L_0x0031
            int r0 = -r0
        L_0x0031:
            r4[r1] = r0
            r2 = 3
            if (r3 == 0) goto L_0x003d
            boolean r1 = r6.A0B
            r0 = 2130970765(0x7f04088d, float:1.755025E38)
            if (r1 != 0) goto L_0x0041
        L_0x003d:
            r0 = 2130970765(0x7f04088d, float:1.755025E38)
            int r0 = -r0
        L_0x0041:
            r4[r2] = r0
            int[] r0 = android.view.View.mergeDrawableStates(r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.onCreateDrawableState(int):int[]");
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.A00 = i;
        WeakReference weakReference = this.A06;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.A06 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        if (getTopInset() <= 0) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setStatusBarForeground(android.graphics.drawable.Drawable r4) {
        /*
            r3 = this;
            android.graphics.drawable.Drawable r1 = r3.A04
            if (r1 == r4) goto L_0x004f
            r0 = 0
            if (r1 == 0) goto L_0x000a
            r1.setCallback(r0)
        L_0x000a:
            if (r4 == 0) goto L_0x0010
            android.graphics.drawable.Drawable r0 = r4.mutate()
        L_0x0010:
            r3.A04 = r0
            if (r0 == 0) goto L_0x003b
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x001f
            android.graphics.drawable.Drawable r0 = r3.A04
            X.AnonymousClass000.A13(r0, r3)
        L_0x001f:
            android.graphics.drawable.Drawable r1 = r3.A04
            int r0 = X.AnonymousClass04F.A01(r3)
            X.AnonymousClass08I.A05(r0, r1)
            android.graphics.drawable.Drawable r2 = r3.A04
            int r0 = r3.getVisibility()
            r1 = 0
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            r2.setVisible(r0, r1)
            android.graphics.drawable.Drawable r0 = r3.A04
            r0.setCallback(r3)
        L_0x003b:
            android.graphics.drawable.Drawable r0 = r3.A04
            if (r0 == 0) goto L_0x0046
            int r1 = r3.getTopInset()
            r0 = 1
            if (r1 > 0) goto L_0x0047
        L_0x0046:
            r0 = 0
        L_0x0047:
            r0 = r0 ^ 1
            r3.setWillNotDraw(r0)
            X.C011504z.A05(r3)
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.setStatusBarForeground(android.graphics.drawable.Drawable):void");
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f4nameremoved);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.A04 != null && getTopInset() > 0) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.A0C));
            this.A04.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A04;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int childCount;
        int topInset = getTopInset();
        int A012 = C011504z.A01(this);
        if (A012 != 0 || ((childCount = getChildCount()) >= 1 && (A012 = C011504z.A01(getChildAt(childCount - 1))) != 0)) {
            return (A012 * 2) + topInset;
        }
        return getHeight() / 3;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnonymousClass06R.A01(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.A06;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.A06 = null;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (C011504z.A09(this) && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !C011504z.A09(childAt)) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    C012005e.A0Q(getChildAt(childCount), topInset);
                }
            }
        }
        A00();
        this.A08 = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((AnonymousClass0Ey) getChildAt(i5).getLayoutParams()).A01 != null) {
                this.A08 = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.A04;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.A0H) {
            if (!this.A09) {
                int childCount3 = getChildCount();
                int i6 = 0;
                while (true) {
                    if (i6 >= childCount3) {
                        z2 = false;
                        break;
                    }
                    int i7 = ((AnonymousClass0Ey) getChildAt(i6).getLayoutParams()).A00;
                    if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                        break;
                    }
                    i6++;
                }
            }
            if (this.A0A != z2) {
                this.A0A = z2;
                refreshDrawableState();
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && C011504z.A09(this) && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !C011504z.A09(childAt)) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    int measuredHeight2 = getMeasuredHeight() + getTopInset();
                    measuredHeight = View.MeasureSpec.getSize(i2);
                    if (measuredHeight2 < 0) {
                        measuredHeight = 0;
                    } else if (measuredHeight2 <= measuredHeight) {
                        measuredHeight = measuredHeight2;
                    }
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        A00();
    }

    public void setElevation(float f) {
        super.setElevation(f);
        AnonymousClass06R.A02(this, f);
    }

    public void setExpanded(boolean z) {
        boolean A032 = C011304x.A03(this);
        int i = 2;
        if (z) {
            i = 1;
        }
        int i2 = 0;
        if (A032) {
            i2 = 4;
        }
        this.A01 = i | i2 | 8;
        requestLayout();
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(AnonymousClass02X.A02(this, i));
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean A1Q = AnonymousClass000.A1Q(i);
        Drawable drawable = this.A04;
        if (drawable != null) {
            drawable.setVisible(A1Q, false);
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.A04) {
            return true;
        }
        return false;
    }

    public class Behavior extends BaseBehavior {
        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public Behavior() {
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof AnonymousClass0Ey;
    }

    public void setLiftOnScroll(boolean z) {
        this.A09 = z;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.A0H = z;
    }

    @Deprecated
    public void setTargetElevation(float f) {
        C06950Vt.A00(this, f);
    }

    public int getLiftOnScrollTargetViewId() {
        return this.A00;
    }

    public int getPendingAction() {
        return this.A01;
    }

    public Drawable getStatusBarForeground() {
        return this.A04;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppBarLayout(android.content.Context r18, android.util.AttributeSet r19, int r20) {
        /*
            r17 = this;
            r10 = 2132084393(0x7f1506a9, float:1.9808955E38)
            r0 = r18
            r6 = r19
            r9 = r20
            android.content.Context r0 = X.C27891Qg.A00(r0, r6, r9, r10)
            r2 = r17
            r2.<init>(r0, r6, r9)
            r3 = -1
            r2.A0F = r3
            r2.A0D = r3
            r2.A0E = r3
            r1 = 0
            r2.A01 = r1
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            r2.A0N = r0
            android.content.Context r11 = r2.getContext()
            r0 = 1
            r2.setOrientation(r0)
            android.view.ViewOutlineProvider r4 = r2.getOutlineProvider()
            android.view.ViewOutlineProvider r0 = android.view.ViewOutlineProvider.BACKGROUND
            if (r4 != r0) goto L_0x0037
            android.view.ViewOutlineProvider r0 = android.view.ViewOutlineProvider.BOUNDS
            r2.setOutlineProvider(r0)
        L_0x0037:
            android.content.Context r5 = r2.getContext()
            int[] r7 = X.C06950Vt.A00
            int[] r8 = new int[r1]
            android.content.res.TypedArray r4 = X.C013205s.A00(r5, r6, r7, r8, r9, r10)
            boolean r0 = r4.hasValue(r1)     // Catch:{ all -> 0x014f }
            if (r0 == 0) goto L_0x0054
            int r0 = r4.getResourceId(r1, r1)     // Catch:{ all -> 0x014f }
            android.animation.StateListAnimator r0 = android.animation.AnimatorInflater.loadStateListAnimator(r5, r0)     // Catch:{ all -> 0x014f }
            r2.setStateListAnimator(r0)     // Catch:{ all -> 0x014f }
        L_0x0054:
            r4.recycle()
            int[] r13 = X.C27931Qk.A00
            int[] r14 = new int[r1]
            r16 = 2132084393(0x7f1506a9, float:1.9808955E38)
            r12 = r6
            r15 = r9
            android.content.res.TypedArray r5 = X.C013205s.A00(r11, r12, r13, r14, r15, r16)
            android.graphics.drawable.Drawable r0 = r5.getDrawable(r1)
            X.C011504z.A04(r0, r2)
            r0 = 6
            android.content.res.ColorStateList r4 = X.AnonymousClass061.A00(r11, r5, r0)
            r2.A0M = r4
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L_0x00ab
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            android.graphics.drawable.ColorDrawable r0 = (android.graphics.drawable.ColorDrawable) r0
            X.05l r6 = new X.05l
            r6.<init>()
            int r0 = r0.getColor()
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r6.A0C(r0)
            if (r4 == 0) goto L_0x0144
            boolean r4 = r2.A0B
            r0 = 0
            if (r4 == 0) goto L_0x0099
            r0 = 255(0xff, float:3.57E-43)
        L_0x0099:
            r6.setAlpha(r0)
            android.content.res.ColorStateList r0 = r2.A0M
            r6.A0C(r0)
            X.0mj r4 = new X.0mj
            r4.<init>(r2, r6, r1)
        L_0x00a6:
            r2.A02 = r4
            X.C011504z.A04(r6, r2)
        L_0x00ab:
            android.content.res.Resources r4 = r2.getResources()
            r0 = 2131492867(0x7f0c0003, float:1.8609198E38)
            int r4 = r4.getInteger(r0)
            r0 = 2130970173(0x7f04063d, float:1.7549049E38)
            int r0 = X.C014506h.A00(r11, r0, r4)
            long r6 = (long) r0
            r2.A0K = r6
            r4 = 2130970191(0x7f04064f, float:1.7549085E38)
            android.animation.TimeInterpolator r0 = X.AnonymousClass064.A03
            android.animation.TimeInterpolator r0 = X.C017807p.A01(r0, r11, r4)
            r2.A0L = r0
            r0 = 4
            r4 = 4
            boolean r0 = r5.hasValue(r0)
            if (r0 == 0) goto L_0x00e0
            boolean r4 = r5.getBoolean(r4, r1)
            r0 = 2
            if (r4 == 0) goto L_0x00db
            r0 = 1
        L_0x00db:
            r2.A01 = r0
            r2.requestLayout()
        L_0x00e0:
            r0 = 3
            r4 = 3
            boolean r0 = r5.hasValue(r0)
            if (r0 == 0) goto L_0x00f0
            int r0 = r5.getDimensionPixelSize(r4, r1)
            float r0 = (float) r0
            X.C06950Vt.A00(r2, r0)
        L_0x00f0:
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r4 < r0) goto L_0x0114
            r0 = 2
            r4 = 2
            boolean r0 = r5.hasValue(r0)
            if (r0 == 0) goto L_0x0105
            boolean r0 = r5.getBoolean(r4, r1)
            r2.setKeyboardNavigationCluster(r0)
        L_0x0105:
            r0 = 1
            r4 = 1
            boolean r0 = r5.hasValue(r0)
            if (r0 == 0) goto L_0x0114
            boolean r0 = r5.getBoolean(r4, r1)
            r2.setTouchscreenBlocksFocus(r0)
        L_0x0114:
            android.content.res.Resources r4 = r2.getResources()
            r0 = 2131166207(0x7f0703ff, float:1.7946653E38)
            float r0 = r4.getDimension(r0)
            r2.A0J = r0
            r0 = 5
            boolean r0 = r5.getBoolean(r0, r1)
            r2.A09 = r0
            r0 = 7
            int r0 = r5.getResourceId(r0, r3)
            r2.A00 = r0
            r0 = 8
            android.graphics.drawable.Drawable r0 = r5.getDrawable(r0)
            r2.setStatusBarForeground(r0)
            r5.recycle()
            X.0tK r0 = new X.0tK
            r0.<init>(r2, r1)
            X.C011004s.A07(r2, r0)
            return
        L_0x0144:
            r6.A0B(r11)
            r0 = 1
            X.0mj r4 = new X.0mj
            r4.<init>(r2, r6, r0)
            goto L_0x00a6
        L_0x014f:
            r0 = move-exception
            r4.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public AppBarLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}
