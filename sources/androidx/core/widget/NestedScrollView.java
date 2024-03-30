package androidx.core.widget;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0CM;
import X.AnonymousClass0EJ;
import X.AnonymousClass0Q8;
import X.C011004s;
import X.C011504z;
import X.C012005e;
import X.C02410Ae;
import X.C02440Ai;
import X.C02730Bq;
import X.C03620Gs;
import X.C07300Xc;
import X.C132986Wc;
import X.C16720pz;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.whatsapp.R;

public class NestedScrollView extends FrameLayout implements C02410Ae, C02730Bq {
    public static final float A0R = ((float) (Math.log(0.78d) / Math.log(0.9d)));
    public static final C03620Gs A0S = new C03620Gs();
    public static final int[] A0T = {16843130};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public VelocityTracker A06;
    public EdgeEffect A07;
    public EdgeEffect A08;
    public OverScroller A09;
    public C16720pz A0A;
    public boolean A0B;
    public boolean A0C;
    public float A0D;
    public int A0E;
    public long A0F;
    public View A0G;
    public AnonymousClass0EJ A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final float A0L;
    public final Rect A0M;
    public final AnonymousClass0CM A0N;
    public final C02440Ai A0O;
    public final int[] A0P;
    public final int[] A0Q;

    public static boolean A09(View view, View view2) {
        if (view != view2) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup) || !A09((View) parent, view2)) {
                return false;
            }
        }
        return true;
    }

    private boolean A0B(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float A002 = A00(edgeEffect) * ((float) getHeight());
        float f = this.A0L * 0.015f;
        double log = Math.log((double) ((((float) Math.abs(-i)) * 0.35f) / f));
        double d = (double) A0R;
        return ((float) (((double) f) * Math.exp((d / (d - 1.0d)) * log))) < A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (r0 < 0) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E(int r7) {
        /*
            r6 = this;
            r5 = 1
            r1 = 0
            r0 = 130(0x82, float:1.82E-43)
            boolean r4 = X.AnonymousClass000.A1S(r7, r0)
            int r3 = r6.getHeight()
            android.graphics.Rect r2 = r6.A0M
            int r0 = r6.getScrollY()
            if (r4 == 0) goto L_0x0039
            int r0 = r0 + r3
            r2.top = r0
            int r0 = r6.getChildCount()
            if (r0 <= 0) goto L_0x002f
            int r0 = r0 - r5
            int r1 = X.AnonymousClass000.A0G(r6, r0)
            int r0 = r6.getPaddingBottom()
            int r1 = r1 + r0
            int r0 = r2.top
            int r0 = r0 + r3
            if (r0 <= r1) goto L_0x002f
            int r1 = r1 - r3
        L_0x002d:
            r2.top = r1
        L_0x002f:
            int r1 = r2.top
            int r0 = r1 + r3
            r2.bottom = r0
            r6.A06(r7, r1, r0)
            return
        L_0x0039:
            int r0 = r0 - r3
            r2.top = r0
            if (r0 >= 0) goto L_0x002f
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.A0E(int):void");
    }

    public final void A0F(int i) {
        A05(this, -getScrollX(), i - getScrollY(), false);
    }

    public void BbP(View view, int[] iArr, int i, int i2, int i3) {
        this.A0N.A0C(iArr, (int[]) null, i, i2, i3);
    }

    public void BbQ(View view, int i, int i2, int i3, int i4, int i5) {
        A03(i4, (int[]) null, i5);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.A0N.A0C(iArr, iArr2, i, i2, 0);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        BbP(view, iArr, i, i2, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        A03(i4, (int[]) null, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        BbS(view, view2, i, 0);
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findNextFocusFromRect;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder instance = FocusFinder.getInstance();
        if (rect == null) {
            findNextFocusFromRect = instance.findNextFocus(this, (View) null, i);
        } else {
            findNextFocusFromRect = instance.findNextFocusFromRect(this, rect, i);
        }
        if (findNextFocusFromRect == null || (!A08(findNextFocusFromRect, 0, getHeight()))) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i, rect);
    }

    public void onStopNestedScroll(View view) {
        Bhs(view, 0);
    }

    public void requestLayout() {
        this.A0K = true;
        super.requestLayout();
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i) {
        return this.A0N.A0B(i, 0);
    }

    public void stopNestedScroll() {
        this.A0N.A08(0);
    }

    public static float A00(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C07300Xc.A00(edgeEffect);
        }
        return 0.0f;
    }

    public static float A01(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C07300Xc.A01(edgeEffect, f, f2);
        }
        AnonymousClass0Q8.A00(edgeEffect, f, f2);
        return f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0046, code lost:
        if (r32 != false) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ff A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int A02(int r29, int r30, int r31, boolean r32) {
        /*
            r28 = this;
            r5 = r29
            r4 = 1
            r3 = r28
            r6 = r31
            if (r6 != r4) goto L_0x000f
            r1 = 2
            X.0CM r0 = r3.A0N
            r0.A0B(r1, r4)
        L_0x000f:
            r25 = 0
            int[] r2 = r3.A0P
            int[] r12 = r3.A0Q
            X.0CM r1 = r3.A0N
            r22 = r1
            r23 = r2
            r24 = r12
            r26 = r5
            r27 = r6
            boolean r0 = r22.A0C(r23, r24, r25, r26, r27)
            r7 = 0
            if (r0 == 0) goto L_0x002e
            r0 = r2[r4]
            int r5 = r29 - r0
            r25 = r12[r4]
        L_0x002e:
            int r0 = r3.getScrollY()
            int r11 = r3.getScrollRange()
            int r8 = r3.getOverScrollMode()
            if (r8 == 0) goto L_0x0044
            if (r8 != r4) goto L_0x0048
            int r8 = r3.getScrollRange()
            if (r8 <= 0) goto L_0x0048
        L_0x0044:
            r16 = 1
            if (r32 == 0) goto L_0x004a
        L_0x0048:
            r16 = 0
        L_0x004a:
            r15 = 0
            r13 = 0
            r3.getOverScrollMode()
            r3.computeHorizontalScrollRange()
            r3.computeHorizontalScrollExtent()
            r3.computeVerticalScrollRange()
            r3.computeVerticalScrollExtent()
            r10 = 0
            int r9 = r0 + r5
            int r8 = -r7
            if (r7 >= r8) goto L_0x0063
            r13 = r8
            r10 = 1
        L_0x0063:
            if (r9 <= r11) goto L_0x0120
            r9 = r11
        L_0x0066:
            r8 = 1
            android.view.ViewParent r14 = r1.A00
            if (r14 != 0) goto L_0x0080
            android.widget.OverScroller r14 = r3.A09
            int r23 = r3.getScrollRange()
            r20 = 0
            r21 = 0
            r22 = 0
            r18 = r13
            r19 = r9
            r17 = r14
            r17.springBack(r18, r19, r20, r21, r22, r23)
        L_0x0080:
            r3.onOverScrolled(r13, r9, r10, r8)
            if (r10 != 0) goto L_0x0087
            if (r8 == 0) goto L_0x008e
        L_0x0087:
            if (r31 == 0) goto L_0x011c
            android.view.ViewParent r8 = r1.A00
        L_0x008b:
            if (r8 != 0) goto L_0x008e
            r15 = 1
        L_0x008e:
            int r21 = r3.getScrollY()
            int r21 = r21 - r0
            int r23 = r5 - r21
            r2[r4] = r7
            r22 = 0
            r20 = 0
            r24 = r6
            r19 = r2
            r18 = r12
            r17 = r1
            X.AnonymousClass0CM.A07(r17, r18, r19, r20, r21, r22, r23, r24)
            r7 = r12[r4]
            int r25 = r25 + r7
            r2 = r2[r4]
            int r5 = r5 - r2
            int r0 = r0 + r5
            r2 = r30
            if (r0 >= 0) goto L_0x00ff
            if (r16 == 0) goto L_0x00d4
            android.widget.EdgeEffect r7 = r3.A08
            int r0 = -r5
            float r5 = (float) r0
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r2 = (float) r2
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r2 = r2 / r0
            A01(r7, r5, r2)
            android.widget.EdgeEffect r2 = r3.A07
        L_0x00cb:
            boolean r0 = r2.isFinished()
            if (r0 != 0) goto L_0x00d4
            r2.onRelease()
        L_0x00d4:
            android.widget.EdgeEffect r2 = r3.A08
            boolean r0 = r2.isFinished()
            if (r0 == 0) goto L_0x00ee
            android.widget.EdgeEffect r0 = r3.A07
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x00ee
            if (r15 == 0) goto L_0x00f1
            if (r31 != 0) goto L_0x00f1
            android.view.VelocityTracker r0 = r3.A06
            r0.clear()
        L_0x00ed:
            return r25
        L_0x00ee:
            X.C011504z.A05(r3)
        L_0x00f1:
            if (r6 != r4) goto L_0x00ed
            r1.A08(r4)
            r2.onRelease()
            android.widget.EdgeEffect r0 = r3.A07
            r0.onRelease()
            return r25
        L_0x00ff:
            if (r0 <= r11) goto L_0x00d4
            if (r16 == 0) goto L_0x00d4
            android.widget.EdgeEffect r8 = r3.A07
            float r7 = (float) r5
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r7 = r7 / r0
            r5 = 1065353216(0x3f800000, float:1.0)
            float r2 = (float) r2
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r2 = r2 / r0
            float r5 = r5 - r2
            A01(r8, r7, r5)
            android.widget.EdgeEffect r2 = r3.A08
            goto L_0x00cb
        L_0x011c:
            android.view.ViewParent r8 = r1.A01
            goto L_0x008b
        L_0x0120:
            if (r9 >= r8) goto L_0x0125
            r9 = r8
            goto L_0x0066
        L_0x0125:
            r8 = 0
            goto L_0x0080
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.A02(int, int, int, boolean):int");
    }

    public static void A05(NestedScrollView nestedScrollView, int i, int i2, boolean z) {
        if (nestedScrollView.getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - nestedScrollView.A0F > 250) {
                View childAt = nestedScrollView.getChildAt(0);
                int A0E2 = AnonymousClass000.A0E(AnonymousClass000.A0a(childAt), childAt.getHeight());
                int A0D2 = AnonymousClass000.A0D(nestedScrollView, nestedScrollView.getHeight());
                int scrollY = nestedScrollView.getScrollY();
                OverScroller overScroller = nestedScrollView.A09;
                int scrollX = nestedScrollView.getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, AnonymousClass001.A02(A0E2, A0D2, 0))) - scrollY, 250);
                if (z) {
                    nestedScrollView.A0N.A0B(2, 1);
                } else {
                    nestedScrollView.A0N.A08(1);
                }
                nestedScrollView.A02 = nestedScrollView.getScrollY();
                C011504z.A05(nestedScrollView);
            } else {
                OverScroller overScroller2 = nestedScrollView.A09;
                if (!overScroller2.isFinished()) {
                    overScroller2.abortAnimation();
                    nestedScrollView.A0N.A08(1);
                }
                nestedScrollView.scrollBy(i, i2);
            }
            nestedScrollView.A0F = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003b, code lost:
        if (r2 >= r0) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A06(int r19, int r20, int r21) {
        /*
            r18 = this;
            r13 = r20
            r11 = r18
            int r10 = r11.getHeight()
            int r9 = r11.getScrollY()
            int r10 = r10 + r9
            r8 = 0
            r7 = 1
            r0 = 33
            r12 = r19
            boolean r17 = X.AnonymousClass000.A1S(r12, r0)
            r0 = 2
            java.util.ArrayList r6 = r11.getFocusables(r0)
            int r5 = r6.size()
            r4 = 0
            r3 = 0
            r16 = 0
        L_0x0024:
            r0 = r21
            if (r3 >= r5) goto L_0x0065
            android.view.View r15 = X.AnonymousClass000.A0Z(r6, r3)
            int r14 = r15.getTop()
            int r2 = r15.getBottom()
            if (r13 >= r2) goto L_0x0043
            if (r14 >= r0) goto L_0x0043
            if (r13 >= r14) goto L_0x003d
            r1 = 1
            if (r2 < r0) goto L_0x003e
        L_0x003d:
            r1 = 0
        L_0x003e:
            if (r4 != 0) goto L_0x0046
            r4 = r15
            r16 = r1
        L_0x0043:
            int r3 = r3 + 1
            goto L_0x0024
        L_0x0046:
            if (r17 == 0) goto L_0x005d
            int r0 = r4.getTop()
            if (r14 < r0) goto L_0x0063
        L_0x004e:
            r0 = 0
        L_0x004f:
            if (r16 == 0) goto L_0x0057
            if (r1 == 0) goto L_0x0043
        L_0x0053:
            if (r0 == 0) goto L_0x0043
            r4 = r15
            goto L_0x0043
        L_0x0057:
            if (r1 == 0) goto L_0x0053
            r4 = r15
            r16 = 1
            goto L_0x0043
        L_0x005d:
            int r0 = r4.getBottom()
            if (r2 <= r0) goto L_0x004e
        L_0x0063:
            r0 = 1
            goto L_0x004f
        L_0x0065:
            if (r4 != 0) goto L_0x0068
            r4 = r11
        L_0x0068:
            if (r13 < r9) goto L_0x0076
            if (r0 > r10) goto L_0x0076
        L_0x006c:
            android.view.View r0 = r11.findFocus()
            if (r4 == r0) goto L_0x0075
            r4.requestFocus(r12)
        L_0x0075:
            return r8
        L_0x0076:
            int r13 = r20 - r9
            if (r17 != 0) goto L_0x007c
            int r13 = r21 - r10
        L_0x007c:
            r11.A02(r13, r8, r7, r7)
            r8 = 1
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.A06(int, int, int):boolean");
    }

    private boolean A07(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.A08;
        if (A00(edgeEffect) != 0.0f) {
            A01(edgeEffect, 0.0f, motionEvent.getX() / ((float) getWidth()));
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.A07;
        if (A00(edgeEffect2) == 0.0f) {
            return z;
        }
        A01(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    private boolean A08(View view, int i, int i2) {
        Rect rect = this.A0M;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        if (rect.bottom + i < getScrollY() || rect.top - i > getScrollY() + i2) {
            return false;
        }
        return true;
    }

    private float getVerticalScrollFactorCompat() {
        float f = this.A0D;
        if (f != 0.0f) {
            return f;
        }
        TypedValue typedValue = new TypedValue();
        Context context = getContext();
        if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
            float dimension = typedValue.getDimension(AnonymousClass000.A0X(context));
            this.A0D = dimension;
            return dimension;
        }
        throw AnonymousClass001.A09("Expected theme to define listPreferredItemHeight.");
    }

    public boolean A0H(KeyEvent keyEvent) {
        Rect rect = this.A0M;
        rect.setEmpty();
        boolean z = false;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (AnonymousClass000.A0E(AnonymousClass000.A0a(childAt), childAt.getHeight()) > AnonymousClass000.A0D(this, getHeight())) {
                z = true;
            }
        }
        int i = 130;
        if (!z) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
                return false;
            }
            return true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 19) {
                if (keyCode != 20) {
                    if (keyCode != 62) {
                        if (keyCode != 92) {
                            if (keyCode != 93) {
                                if (keyCode == 122) {
                                    A0E(33);
                                    return false;
                                } else if (keyCode != 123) {
                                    return false;
                                }
                            }
                        }
                    } else if (keyEvent.isShiftPressed()) {
                        i = 33;
                    }
                    A0E(i);
                    return false;
                } else if (!keyEvent.isAltPressed()) {
                    return A0G(130);
                }
                int height = getHeight();
                rect.top = 0;
                rect.bottom = height;
                int childCount = getChildCount();
                if (childCount > 0) {
                    int A0G2 = AnonymousClass000.A0G(this, childCount - 1) + getPaddingBottom();
                    rect.bottom = A0G2;
                    rect.top = A0G2 - height;
                }
                return A06(130, rect.top, rect.bottom);
            } else if (!keyEvent.isAltPressed()) {
                return A0G(33);
            }
            int height2 = getHeight();
            rect.top = 0;
            rect.bottom = height2;
            return A06(33, 0, height2);
        }
    }

    public void BbS(View view, View view2, int i, int i2) {
        C02440Ai r1 = this.A0O;
        if (i2 == 1) {
            r1.A00 = i;
        } else {
            r1.A01 = i;
        }
        this.A0N.A0B(2, i2);
    }

    public boolean BhH(View view, View view2, int i, int i2) {
        return AnonymousClass000.A1P(i & 2);
    }

    public void Bhs(View view, int i) {
        C02440Ai r2 = this.A0O;
        if (i == 1) {
            r2.A00 = 0;
        } else {
            r2.A01 = 0;
        }
        this.A0N.A08(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void computeScroll() {
        /*
            r22 = this;
            r1 = r22
            android.widget.OverScroller r3 = r1.A09
            boolean r0 = r3.isFinished()
            if (r0 != 0) goto L_0x00df
            r3.computeScrollOffset()
            int r7 = r3.getCurrY()
            int r0 = r1.A02
            int r0 = r7 - r0
            int r4 = r1.getHeight()
            r8 = 1056964608(0x3f000000, float:0.5)
            r5 = 0
            r9 = 1082130432(0x40800000, float:4.0)
            if (r0 <= 0) goto L_0x00ed
            android.widget.EdgeEffect r6 = r1.A08
            float r2 = A00(r6)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0041
            int r2 = -r0
            float r5 = (float) r2
            float r5 = r5 * r9
            float r2 = (float) r4
            float r5 = r5 / r2
            int r2 = -r4
            float r4 = (float) r2
            float r4 = r4 / r9
            float r2 = A01(r6, r5, r8)
        L_0x0036:
            float r4 = r4 * r2
            int r2 = java.lang.Math.round(r4)
            if (r2 == r0) goto L_0x0040
            r6.finish()
        L_0x0040:
            int r0 = r0 - r2
        L_0x0041:
            r1.A02 = r7
            int[] r13 = r1.A0P
            r2 = 1
            r14 = 0
            r13[r2] = r14
            r17 = 0
            X.0CM r11 = r1.A0N
            r5 = 0
            r18 = 0
            r20 = 1
            r15 = r11
            r16 = r13
            r19 = r0
            r15.A0C(r16, r17, r18, r19, r20)
            r4 = r13[r2]
            int r0 = r0 - r4
            int r4 = r1.getScrollRange()
            if (r0 == 0) goto L_0x00d6
            int r10 = r1.getScrollY()
            int r8 = r1.getScrollX()
            r1.getOverScrollMode()
            r1.computeHorizontalScrollRange()
            r1.computeHorizontalScrollExtent()
            r1.computeVerticalScrollRange()
            r1.computeVerticalScrollExtent()
            int r7 = r10 + r0
            int r6 = -r14
            if (r8 <= r14) goto L_0x00e9
            r8 = 0
        L_0x0080:
            r5 = 1
        L_0x0081:
            if (r7 <= r4) goto L_0x00e3
            r7 = r4
        L_0x0084:
            r6 = 1
            android.view.ViewParent r9 = r11.A00
            if (r9 != 0) goto L_0x0099
            int r21 = r1.getScrollRange()
            r19 = 0
            r20 = 0
            r16 = r8
            r17 = r7
            r15 = r3
            r15.springBack(r16, r17, r18, r19, r20, r21)
        L_0x0099:
            r1.onOverScrolled(r8, r7, r5, r6)
            int r15 = r1.getScrollY()
            int r15 = r15 - r10
            int r0 = r0 - r15
            r13[r2] = r14
            int[] r12 = r1.A0Q
            r16 = 0
            r18 = 1
            r17 = r0
            X.AnonymousClass0CM.A07(r11, r12, r13, r14, r15, r16, r17, r18)
            r5 = r13[r2]
            int r0 = r0 - r5
            if (r0 == 0) goto L_0x00d6
            int r5 = r1.getOverScrollMode()
            if (r5 == 0) goto L_0x00be
            if (r5 != r2) goto L_0x00d0
            if (r4 <= 0) goto L_0x00d0
        L_0x00be:
            if (r0 >= 0) goto L_0x00e0
            android.widget.EdgeEffect r4 = r1.A08
        L_0x00c2:
            boolean r0 = r4.isFinished()
            if (r0 == 0) goto L_0x00d0
            float r0 = r3.getCurrVelocity()
            int r0 = (int) r0
            r4.onAbsorb(r0)
        L_0x00d0:
            r3.abortAnimation()
            r11.A08(r2)
        L_0x00d6:
            boolean r0 = r3.isFinished()
            if (r0 != 0) goto L_0x0104
            X.C011504z.A05(r1)
        L_0x00df:
            return
        L_0x00e0:
            android.widget.EdgeEffect r4 = r1.A07
            goto L_0x00c2
        L_0x00e3:
            if (r7 >= r6) goto L_0x00e7
            r7 = r6
            goto L_0x0084
        L_0x00e7:
            r6 = 0
            goto L_0x0099
        L_0x00e9:
            if (r8 >= r6) goto L_0x0081
            r8 = r6
            goto L_0x0080
        L_0x00ed:
            if (r0 >= 0) goto L_0x0041
            android.widget.EdgeEffect r6 = r1.A07
            float r2 = A00(r6)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0041
            float r2 = (float) r0
            float r2 = r2 * r9
            float r4 = (float) r4
            float r2 = r2 / r4
            float r4 = r4 / r9
            float r2 = A01(r6, r2, r8)
            goto L_0x0036
        L_0x0104:
            r11.A08(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.A0N.A0A(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.A0N.A09(f, f2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return AnonymousClass0CM.A07(this.A0N, iArr, (int[]) null, i, i2, i3, i4, 0);
    }

    public int getNestedScrollAxes() {
        C02440Ai r0 = this.A0O;
        return r0.A01 | r0.A00;
    }

    public boolean hasNestedScrollingParent() {
        return AnonymousClass000.A1V(this.A0N.A01);
    }

    public boolean isNestedScrollingEnabled() {
        return this.A0N.A02;
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        A0D((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return this.A0N.A09(f, f2);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof AnonymousClass0EJ)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        AnonymousClass0EJ r2 = (AnonymousClass0EJ) parcelable;
        super.onRestoreInstanceState(r2.getSuperState());
        this.A0H = r2;
        requestLayout();
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return AnonymousClass000.A1P(i & 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0162, code lost:
        if (A0B(r1, r4) != false) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x017d, code lost:
        if (getChildCount() > 0) goto L_0x017f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            android.view.VelocityTracker r0 = r12.A06
            if (r0 != 0) goto L_0x000a
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.A06 = r0
        L_0x000a:
            int r1 = r13.getActionMasked()
            r4 = 0
            if (r1 != 0) goto L_0x0013
            r12.A0E = r4
        L_0x0013:
            android.view.MotionEvent r3 = android.view.MotionEvent.obtain(r13)
            int r0 = r12.A0E
            float r0 = (float) r0
            r5 = 0
            r3.offsetLocation(r5, r0)
            r2 = 1
            if (r1 == 0) goto L_0x019a
            if (r1 == r2) goto L_0x0105
            r0 = 2
            if (r1 == r0) goto L_0x005c
            r0 = 3
            if (r1 == r0) goto L_0x0175
            r0 = 5
            if (r1 == r0) goto L_0x004a
            r0 = 6
            if (r1 != r0) goto L_0x003f
            r12.A04(r13)
            int r0 = r12.A00
            int r0 = r13.findPointerIndex(r0)
            float r0 = r13.getY(r0)
            int r0 = (int) r0
            r12.A01 = r0
        L_0x003f:
            android.view.VelocityTracker r0 = r12.A06
            if (r0 == 0) goto L_0x0046
            r0.addMovement(r3)
        L_0x0046:
            r3.recycle()
            return r2
        L_0x004a:
            int r1 = r13.getActionIndex()
            float r0 = r13.getY(r1)
            int r0 = (int) r0
            r12.A01 = r0
            int r0 = r13.getPointerId(r1)
            r12.A00 = r0
            goto L_0x003f
        L_0x005c:
            int r0 = r12.A00
            int r8 = r13.findPointerIndex(r0)
            r0 = -1
            if (r8 != r0) goto L_0x007f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Invalid pointerId="
            r1.append(r0)
            int r0 = r12.A00
            r1.append(r0)
            java.lang.String r0 = " in onTouchEvent"
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            java.lang.String r0 = "NestedScrollView"
            android.util.Log.e(r0, r1)
            goto L_0x003f
        L_0x007f:
            float r0 = r13.getY(r8)
            int r6 = (int) r0
            int r7 = r12.A01
            int r7 = r7 - r6
            float r10 = r13.getX(r8)
            int r0 = r12.getWidth()
            float r0 = (float) r0
            float r10 = r10 / r0
            float r11 = (float) r7
            int r0 = r12.getHeight()
            float r0 = (float) r0
            float r11 = r11 / r0
            android.widget.EdgeEffect r9 = r12.A08
            float r0 = A00(r9)
            r1 = 0
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00f3
            float r0 = -r11
            float r0 = A01(r9, r0, r10)
            float r1 = -r0
        L_0x00a9:
            float r0 = A00(r9)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x00b4
            r9.onRelease()
        L_0x00b4:
            int r0 = r12.getHeight()
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = java.lang.Math.round(r1)
            if (r0 == 0) goto L_0x00c3
            r12.invalidate()
        L_0x00c3:
            int r7 = r7 - r0
            boolean r0 = r12.A0B
            if (r0 != 0) goto L_0x00de
            int r0 = java.lang.Math.abs(r7)
            int r1 = r12.A05
            if (r0 <= r1) goto L_0x003f
            android.view.ViewParent r0 = r12.getParent()
            if (r0 == 0) goto L_0x00d9
            r0.requestDisallowInterceptTouchEvent(r2)
        L_0x00d9:
            r12.A0B = r2
            if (r7 <= 0) goto L_0x00f1
            int r7 = r7 - r1
        L_0x00de:
            float r0 = r13.getX(r8)
            int r0 = (int) r0
            int r1 = r12.A02(r7, r0, r4, r4)
            int r6 = r6 - r1
            r12.A01 = r6
            int r0 = r12.A0E
            int r0 = r0 + r1
            r12.A0E = r0
            goto L_0x003f
        L_0x00f1:
            int r7 = r7 + r1
            goto L_0x00de
        L_0x00f3:
            android.widget.EdgeEffect r9 = r12.A07
            float r0 = A00(r9)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00b4
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r10
            float r1 = A01(r9, r11, r0)
            goto L_0x00a9
        L_0x0105:
            android.view.VelocityTracker r4 = r12.A06
            r1 = 1000(0x3e8, float:1.401E-42)
            int r0 = r12.A03
            float r0 = (float) r0
            r4.computeCurrentVelocity(r1, r0)
            int r0 = r12.A00
            float r0 = r4.getYVelocity(r0)
            int r4 = (int) r0
            int r1 = java.lang.Math.abs(r4)
            int r0 = r12.A04
            if (r1 < r0) goto L_0x017f
            android.widget.EdgeEffect r1 = r12.A08
            float r0 = A00(r1)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0153
            boolean r0 = r12.A0B(r1, r4)
            if (r0 != 0) goto L_0x0164
            int r4 = -r4
        L_0x012f:
            r12.A0D(r4)
        L_0x0132:
            r0 = -1
            r12.A00 = r0
            r1 = 0
            r12.A0B = r1
            android.view.VelocityTracker r0 = r12.A06
            if (r0 == 0) goto L_0x0142
            r0.recycle()
            r0 = 0
            r12.A06 = r0
        L_0x0142:
            X.0CM r0 = r12.A0N
            r0.A08(r1)
            android.widget.EdgeEffect r0 = r12.A08
            r0.onRelease()
            android.widget.EdgeEffect r0 = r12.A07
            r0.onRelease()
            goto L_0x003f
        L_0x0153:
            android.widget.EdgeEffect r1 = r12.A07
            float r0 = A00(r1)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            int r4 = -r4
            if (r0 == 0) goto L_0x0168
            boolean r0 = r12.A0B(r1, r4)
            if (r0 == 0) goto L_0x012f
        L_0x0164:
            r1.onAbsorb(r4)
            goto L_0x0132
        L_0x0168:
            float r1 = (float) r4
            X.0CM r0 = r12.A0N
            boolean r0 = r0.A09(r5, r1)
            if (r0 != 0) goto L_0x0132
            r12.dispatchNestedFling(r5, r1, r2)
            goto L_0x012f
        L_0x0175:
            boolean r0 = r12.A0B
            if (r0 == 0) goto L_0x0132
            int r0 = r12.getChildCount()
            if (r0 <= 0) goto L_0x0132
        L_0x017f:
            android.widget.OverScroller r4 = r12.A09
            int r5 = r12.getScrollX()
            int r6 = r12.getScrollY()
            r7 = 0
            int r10 = r12.getScrollRange()
            r8 = 0
            r9 = 0
            boolean r0 = r4.springBack(r5, r6, r7, r8, r9, r10)
            if (r0 == 0) goto L_0x0132
            X.C011504z.A05(r12)
            goto L_0x0132
        L_0x019a:
            int r0 = r12.getChildCount()
            if (r0 != 0) goto L_0x01a1
            return r4
        L_0x01a1:
            boolean r0 = r12.A0B
            if (r0 == 0) goto L_0x01ae
            android.view.ViewParent r0 = r12.getParent()
            if (r0 == 0) goto L_0x01ae
            r0.requestDisallowInterceptTouchEvent(r2)
        L_0x01ae:
            android.widget.OverScroller r1 = r12.A09
            boolean r0 = r1.isFinished()
            if (r0 != 0) goto L_0x01be
            r1.abortAnimation()
            X.0CM r0 = r12.A0N
            r0.A08(r2)
        L_0x01be:
            float r0 = r13.getY()
            int r1 = (int) r0
            int r0 = r13.getPointerId(r4)
            r12.A01 = r1
            r12.A00 = r0
            r1 = 2
            X.0CM r0 = r12.A0N
            r0.A0B(r1, r4)
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.A0K) {
            Rect rect = this.A0M;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int A0C2 = A0C(rect);
            if (A0C2 != 0) {
                scrollBy(0, A0C2);
            }
        } else {
            this.A0G = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.A06) != null) {
            velocityTracker.recycle();
            this.A06 = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setFillViewport(boolean z) {
        if (z != this.A0I) {
            this.A0I = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        AnonymousClass0CM r1 = this.A0N;
        if (r1.A02) {
            C011004s.A04(r1.A04);
        }
        r1.A02 = z;
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f4nameremoved);
    }

    private void A03(int i, int[] iArr, int i2) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr2 = iArr;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        AnonymousClass0CM.A07(this.A0N, (int[]) null, iArr2, 0, scrollY2, 0, i - scrollY2, i2);
    }

    private void A04(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A00) {
            boolean A1Q = AnonymousClass000.A1Q(actionIndex);
            this.A01 = (int) motionEvent.getY(A1Q ? 1 : 0);
            this.A00 = motionEvent.getPointerId(A1Q);
            VelocityTracker velocityTracker = this.A06;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public static boolean A0A(ViewGroup viewGroup) {
        return viewGroup.getClipToPadding();
    }

    public int A0C(Rect rect) {
        int i;
        int i2;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(childAt);
        int i4 = i3 - verticalFadingEdgeLength;
        if (rect.bottom >= AnonymousClass000.A0E(A0a, childAt.getHeight())) {
            i4 = i3;
        }
        int i5 = rect.bottom;
        if (i5 > i4 && rect.top > scrollY) {
            if (rect.height() > height) {
                i2 = rect.top - scrollY;
            } else {
                i2 = rect.bottom - i4;
            }
            return Math.min(i2, (childAt.getBottom() + A0a.bottomMargin) - i3);
        } else if (rect.top >= scrollY || i5 >= i4) {
            return 0;
        } else {
            if (rect.height() > height) {
                i = 0 - (i4 - rect.bottom);
            } else {
                i = 0 - (scrollY - rect.top);
            }
            return Math.max(i, -getScrollY());
        }
    }

    public void A0D(int i) {
        if (getChildCount() > 0) {
            this.A09.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.A0N.A0B(2, 1);
            this.A02 = getScrollY();
            C011504z.A05(this);
        }
    }

    public boolean A0G(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !A08(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33) {
                if (getScrollY() < maxScrollAmount) {
                    maxScrollAmount = getScrollY();
                }
            } else if (i == 130 && getChildCount() > 0) {
                maxScrollAmount = Math.min(AnonymousClass000.A0G(this, 0) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            A02(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.A0M;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            A02(A0C(rect), 0, 1, true);
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && (!A08(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(C132986Wc.A0F);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw AnonymousClass001.A09("ScrollView can host only one direct child");
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int A0A2 = AnonymousClass000.A0A(this) - getPaddingTop();
        if (childCount == 0) {
            return A0A2;
        }
        int A0G2 = AnonymousClass000.A0G(this, 0);
        int scrollY = getScrollY();
        int A022 = AnonymousClass001.A02(A0G2, A0A2, 0);
        if (scrollY < 0) {
            return A0G2 - scrollY;
        }
        if (scrollY > A022) {
            return A0G2 + (scrollY - A022);
        }
        return A0G2;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent) || A0H(keyEvent)) {
            return true;
        }
        return false;
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.A08;
        int i2 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (A0A(this)) {
                width -= AnonymousClass000.A09(this);
                i = getPaddingLeft();
            } else {
                i = 0;
            }
            if (A0A(this)) {
                height -= AnonymousClass000.A0C(this);
                min += getPaddingTop();
            }
            canvas.translate((float) i, (float) min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                C011504z.A05(this);
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.A07;
        if (!edgeEffect2.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (A0A(this)) {
                width2 -= AnonymousClass000.A09(this);
                i2 = 0 + getPaddingLeft();
            }
            if (A0A(this)) {
                height2 -= AnonymousClass000.A0C(this);
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i2 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            edgeEffect2.setSize(width2, height2);
            if (edgeEffect2.draw(canvas)) {
                C011504z.A05(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(childAt);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + A0a.bottomMargin) - getScrollY()) - AnonymousClass000.A0A(this);
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        return AnonymousClass001.A02(AnonymousClass000.A0E(AnonymousClass000.A0a(childAt), childAt.getHeight()), AnonymousClass000.A0D(this, getHeight()), 0);
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public void measureChild(View view, int i, int i2) {
        view.measure(ViewGroup.getChildMeasureSpec(i, AnonymousClass000.A09(this), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(view);
        AnonymousClass000.A16(view, A0a.topMargin + A0a.bottomMargin, 0, ViewGroup.getChildMeasureSpec(i, AnonymousClass000.A0F(A0a, AnonymousClass000.A09(this)) + i2, A0a.width));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0J = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        int width;
        if (motionEvent.getAction() != 8 || this.A0B) {
            return false;
        }
        if (AnonymousClass000.A1S(motionEvent.getSource() & 2, 2)) {
            axisValue = motionEvent.getAxisValue(9);
            width = (int) motionEvent.getX();
        } else if ((motionEvent.getSource() & 4194304) != 4194304) {
            return false;
        } else {
            axisValue = motionEvent.getAxisValue(26);
            width = getWidth() / 2;
        }
        if (axisValue == 0.0f) {
            return false;
        }
        int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
        A02(-verticalScrollFactorCompat, width, 1, AnonymousClass000.A1S(motionEvent.getSource() & 8194, 8194));
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.A0B) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.A00;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            StringBuilder A0u = AnonymousClass000.A0u();
                            A0u.append("Invalid pointerId=");
                            A0u.append(i2);
                            Log.e("NestedScrollView", AnonymousClass000.A0q(" in onInterceptTouchEvent", A0u));
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (AnonymousClass000.A05(y, this.A01) > this.A05 && (2 & getNestedScrollAxes()) == 0) {
                                this.A0B = true;
                                this.A01 = y;
                                VelocityTracker velocityTracker = this.A06;
                                if (velocityTracker == null) {
                                    velocityTracker = VelocityTracker.obtain();
                                    this.A06 = velocityTracker;
                                }
                                velocityTracker.addMovement(motionEvent);
                                this.A0E = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        A04(motionEvent);
                    }
                }
            }
            this.A0B = false;
            this.A00 = -1;
            VelocityTracker velocityTracker2 = this.A06;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.A06 = null;
            }
            if (this.A09.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                C011504z.A05(this);
            }
            this.A0N.A08(0);
        } else {
            int y2 = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 >= childAt.getTop() - scrollY && y2 < childAt.getBottom() - scrollY && x >= childAt.getLeft() && x < childAt.getRight()) {
                    this.A01 = y2;
                    this.A00 = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.A06;
                    if (velocityTracker3 == null) {
                        this.A06 = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.A06.addMovement(motionEvent);
                    OverScroller overScroller = this.A09;
                    overScroller.computeScrollOffset();
                    if (!A07(motionEvent) && overScroller.isFinished()) {
                        z = false;
                    }
                    this.A0B = z;
                    this.A0N.A0B(2, 0);
                }
            }
            if (!A07(motionEvent) && this.A09.isFinished()) {
                z = false;
            }
            this.A0B = z;
            VelocityTracker velocityTracker4 = this.A06;
            if (velocityTracker4 != null) {
                velocityTracker4.recycle();
                this.A06 = null;
            }
        }
        return this.A0B;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.A0K = false;
        View view = this.A0G;
        if (view != null && A09(view, this)) {
            View view2 = this.A0G;
            Rect rect = this.A0M;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int A0C2 = A0C(rect);
            if (A0C2 != 0) {
                scrollBy(0, A0C2);
            }
        }
        this.A0G = null;
        if (!this.A0J) {
            if (this.A0H != null) {
                scrollTo(getScrollX(), this.A0H.A00);
                this.A0H = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                i5 = AnonymousClass000.A0E(AnonymousClass000.A0a(childAt), childAt.getMeasuredHeight());
            }
            int A0D2 = AnonymousClass000.A0D(this, i4 - i2);
            int scrollY = getScrollY();
            int i6 = scrollY;
            if (A0D2 >= i5 || scrollY < 0) {
                i6 = 0;
            } else if (A0D2 + scrollY > i5) {
                i6 = i5 - A0D2;
            }
            if (i6 != scrollY) {
                scrollTo(getScrollX(), i6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.A0J = true;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A0I && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(childAt);
            int measuredHeight = childAt.getMeasuredHeight();
            int A0D2 = (AnonymousClass000.A0D(this, getMeasuredHeight()) - A0a.topMargin) - A0a.bottomMargin;
            if (measuredHeight < A0D2) {
                AnonymousClass000.A16(childAt, A0D2, 1073741824, ViewGroup.getChildMeasureSpec(i, AnonymousClass000.A0F(A0a, AnonymousClass000.A09(this)), A0a.width));
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        AnonymousClass0EJ r1 = new AnonymousClass0EJ(super.onSaveInstanceState());
        r1.A00 = getScrollY();
        return r1;
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C16720pz r0 = this.A0A;
        if (r0 != null) {
            r0.Bfu(this, i, i2, i3, i4);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && A08(findFocus, 0, i4)) {
            Rect rect = this.A0M;
            findFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findFocus, rect);
            int A0C2 = A0C(rect);
            if (A0C2 == 0) {
                return;
            }
            if (this.A0C) {
                A05(this, 0, A0C2, false);
            } else {
                scrollBy(0, A0C2);
            }
        }
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int A0C2 = A0C(rect);
        boolean z2 = false;
        if (A0C2 != 0) {
            z2 = true;
            if (z) {
                scrollBy(0, A0C2);
            } else {
                A05(this, 0, A0C2, false);
                return true;
            }
        }
        return z2;
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(childAt);
            int A042 = AnonymousClass001.A04(this, getWidth(), getPaddingLeft());
            int A0F2 = AnonymousClass000.A0F(A0a, childAt.getWidth());
            int A0D2 = AnonymousClass000.A0D(this, getHeight());
            int A0E2 = AnonymousClass000.A0E(A0a, childAt.getHeight());
            if (A042 >= A0F2 || i < 0) {
                i = 0;
            } else if (A042 + i > A0F2) {
                i = A0F2 - A042;
            }
            if (A0D2 >= A0E2 || i2 < 0) {
                i2 = 0;
            } else if (A0D2 + i2 > A0E2) {
                i2 = A0E2 - A0D2;
            }
            if (i != getScrollX() || i2 != getScrollY()) {
                super.scrollTo(i, i2);
            }
        }
    }

    public void setOnScrollChangeListener(C16720pz r1) {
        this.A0A = r1;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.A0C = z;
    }

    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    public void BbR(View view, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        A03(i4, iArr, i5);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        this.A0M = AnonymousClass001.A06();
        this.A0K = true;
        this.A0J = false;
        this.A0G = null;
        this.A0B = false;
        this.A0C = true;
        this.A00 = -1;
        this.A0Q = new int[2];
        this.A0P = new int[2];
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            edgeEffect = C07300Xc.A02(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.A08 = edgeEffect;
        if (i2 >= 31) {
            edgeEffect2 = C07300Xc.A02(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.A07 = edgeEffect2;
        this.A0L = AnonymousClass000.A0X(context).density * 160.0f * 386.0878f * 0.84f;
        this.A09 = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.A05 = viewConfiguration.getScaledTouchSlop();
        this.A04 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.A03 = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A0T, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.A0O = new C02440Ai();
        this.A0N = new AnonymousClass0CM(this);
        setNestedScrollingEnabled(true);
        C012005e.A0V(this, A0S);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw AnonymousClass001.A09("ScrollView can host only one direct child");
    }

    public NestedScrollView(Context context) {
        this(context, (AttributeSet) null);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw AnonymousClass001.A09("ScrollView can host only one direct child");
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw AnonymousClass001.A09("ScrollView can host only one direct child");
    }
}
