package com.google.android.material.bottomsheet;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass061;
import X.AnonymousClass06J;
import X.AnonymousClass06X;
import X.AnonymousClass0HR;
import X.AnonymousClass0QY;
import X.AnonymousClass0U0;
import X.AnonymousClass0V6;
import X.AnonymousClass0XL;
import X.AnonymousClass0Yd;
import X.AnonymousClass0Z5;
import X.C011004s;
import X.C012005e;
import X.C012505l;
import X.C02460Ak;
import X.C06570Uc;
import X.C15110mi;
import X.C18160si;
import X.C27931Qk;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior extends AnonymousClass0XL {
    public float A00 = -1.0f;
    public int A01;
    public float A02 = 0.5f;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D = -1;
    public int A0E = -1;
    public int A0F;
    public int A0G;
    public int A0H = 0;
    public int A0I;
    public int A0J = 4;
    public ValueAnimator A0K;
    public ColorStateList A0L;
    public VelocityTracker A0M;
    public AnonymousClass0Z5 A0N;
    public C012505l A0O;
    public AnonymousClass06J A0P;
    public WeakReference A0Q;
    public WeakReference A0R;
    public WeakReference A0S;
    public Map A0T;
    public boolean A0U = true;
    public boolean A0V = true;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public float A0j = 0.1f;
    public int A0k;
    public int A0l;
    public int A0m;
    public int A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public final SparseIntArray A0r = new SparseIntArray();
    public final ArrayList A0s = AnonymousClass001.A0I();
    public final AnonymousClass0V6 A0t = new C18160si(this, 0);
    public final AnonymousClass0U0 A0u = new AnonymousClass0U0(this);

    private void A04(int i, boolean z) {
        boolean z2;
        C012505l r5;
        ValueAnimator valueAnimator;
        if (i != 2) {
            if (this.A0J != 3 || (!this.A0g && A0R() != 0)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (this.A0o != z2 && (r5 = this.A0O) != null) {
                this.A0o = z2;
                float f = 0.0f;
                if (!z || (valueAnimator = this.A0K) == null) {
                    ValueAnimator valueAnimator2 = this.A0K;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        valueAnimator2.cancel();
                    }
                    if (!this.A0o) {
                        f = 1.0f;
                    }
                    AnonymousClass06X r1 = r5.A01;
                    if (r1.A01 != f) {
                        r1.A01 = f;
                        r5.A03 = true;
                        r5.invalidateSelf();
                    }
                } else if (valueAnimator.isRunning()) {
                    valueAnimator.reverse();
                } else {
                    if (!z2) {
                        f = 1.0f;
                    }
                    valueAnimator.setFloatValues(new float[]{1.0f - f, f});
                    valueAnimator.start();
                }
            }
        }
    }

    public static void A07(View view, BottomSheetBehavior bottomSheetBehavior, int i, boolean z) {
        int A0R2;
        boolean A0H2;
        if (i == 3) {
            A0R2 = bottomSheetBehavior.A0R();
        } else if (i == 4) {
            A0R2 = bottomSheetBehavior.A05;
        } else if (i == 5) {
            A0R2 = bottomSheetBehavior.A0F;
        } else if (i == 6) {
            A0R2 = bottomSheetBehavior.A09;
        } else {
            throw AnonymousClass000.A0d("Invalid state to get top offset: ", AnonymousClass000.A0u(), i);
        }
        AnonymousClass0Z5 r2 = bottomSheetBehavior.A0N;
        if (r2 != null) {
            int left = view.getLeft();
            if (z) {
                A0H2 = r2.A0E(left, A0R2);
            } else {
                A0H2 = r2.A0H(view, left, A0R2);
            }
            if (A0H2) {
                bottomSheetBehavior.A0X(2);
                bottomSheetBehavior.A04(i, true);
                bottomSheetBehavior.A0u.A00(i);
                return;
            }
        }
        bottomSheetBehavior.A0X(i);
    }

    public void A0F() {
        this.A0S = null;
        this.A0N = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0I(android.view.View r6, android.view.View r7, androidx.coordinatorlayout.widget.CoordinatorLayout r8, int[] r9, int r10, int r11, int r12) {
        /*
            r5 = this;
            r2 = 1
            if (r12 == r2) goto L_0x0031
            java.lang.ref.WeakReference r0 = r5.A0R
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r0.get()
        L_0x000b:
            if (r7 != r0) goto L_0x0031
            int r4 = r6.getTop()
            int r3 = r4 - r11
            if (r11 <= 0) goto L_0x0032
            int r0 = r5.A0R()
            if (r3 >= r0) goto L_0x004c
            int r4 = r4 - r0
            r9[r2] = r4
            int r0 = -r4
            X.C012005e.A0Q(r6, r0)
            r0 = 3
        L_0x0023:
            r5.A0X(r0)
        L_0x0026:
            int r0 = r6.getTop()
            r5.A0U(r0)
            r5.A0C = r11
            r5.A0b = r2
        L_0x0031:
            return
        L_0x0032:
            if (r11 >= 0) goto L_0x0026
            r0 = -1
            boolean r0 = r7.canScrollVertically(r0)
            if (r0 != 0) goto L_0x0026
            int r1 = r5.A05
            if (r3 <= r1) goto L_0x004c
            boolean r0 = r5.A0X
            if (r0 != 0) goto L_0x004c
            int r4 = r4 - r1
            r9[r2] = r4
            int r0 = -r4
            X.C012005e.A0Q(r6, r0)
            r0 = 4
            goto L_0x0023
        L_0x004c:
            boolean r0 = r5.A0U
            if (r0 == 0) goto L_0x0031
            r9[r2] = r11
            int r0 = -r11
            X.C012005e.A0Q(r6, r0)
            r5.A0X(r2)
            goto L_0x0026
        L_0x005a:
            r0 = 0
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.A0I(android.view.View, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout, int[], int, int, int):void");
    }

    public void A0J(View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr, int i, int i2, int i3, int i4, int i5) {
    }

    public void A0K(C02460Ak r2) {
        this.A0S = null;
        this.A0N = null;
    }

    public boolean A0N(View view, View view2, View view3, CoordinatorLayout coordinatorLayout, int i, int i2) {
        this.A0C = 0;
        this.A0b = false;
        return (i & 2) != 0;
    }

    public boolean A0O(View view, View view2, CoordinatorLayout coordinatorLayout, float f, float f2) {
        WeakReference weakReference = this.A0R;
        return (weakReference == null || view2 != weakReference.get() || this.A0J == 3) ? false : true;
    }

    public void A0V(int i) {
        A0Y(i, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r4.A09 > r4.A07) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0W(int r5) {
        /*
            r4 = this;
            r2 = 1
            if (r5 == r2) goto L_0x005d
            r0 = 2
            if (r5 == r0) goto L_0x005d
            boolean r0 = r4.A0X
            if (r0 != 0) goto L_0x001d
            r0 = 5
            if (r5 != r0) goto L_0x001d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Cannot set state: "
            java.lang.String r1 = X.AnonymousClass000.A0r(r0, r1, r5)
            java.lang.String r0 = "BottomSheetBehavior"
            android.util.Log.w(r0, r1)
            return
        L_0x001d:
            r0 = 6
            if (r5 != r0) goto L_0x002b
            boolean r0 = r4.A0V
            if (r0 == 0) goto L_0x002b
            int r1 = r4.A09
            int r0 = r4.A07
            r3 = 3
            if (r1 <= r0) goto L_0x002c
        L_0x002b:
            r3 = r5
        L_0x002c:
            java.lang.ref.WeakReference r1 = r4.A0S
            if (r1 == 0) goto L_0x0059
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L_0x0059
            android.view.View r2 = X.AnonymousClass000.A0Y(r1)
            X.0h7 r1 = new X.0h7
            r1.<init>(r2, r4, r3)
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == 0) goto L_0x0055
            boolean r0 = r0.isLayoutRequested()
            if (r0 == 0) goto L_0x0055
            boolean r0 = X.C011304x.A02(r2)
            if (r0 == 0) goto L_0x0055
            r2.post(r1)
            return
        L_0x0055:
            r1.run()
            return
        L_0x0059:
            r4.A0X(r5)
            return
        L_0x005d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "STATE_"
            r1.append(r0)
            if (r5 != r2) goto L_0x0074
            java.lang.String r0 = "DRAGGING"
        L_0x006a:
            r1.append(r0)
            java.lang.String r0 = " should not be set externally."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0c(r0, r1)
            throw r0
        L_0x0074:
            java.lang.String r0 = "SETTLING"
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.A0W(int):void");
    }

    public final void A0Y(int i, boolean z) {
        View A0Y2;
        boolean z2 = this.A0f;
        if (i == -1) {
            if (!z2) {
                this.A0f = true;
            } else {
                return;
            }
        } else if (z2 || this.A0G != i) {
            this.A0f = false;
            this.A0G = Math.max(0, i);
        } else {
            return;
        }
        WeakReference weakReference = this.A0S;
        if (weakReference != null) {
            A08(this);
            if (this.A0J == 4 && (A0Y2 = AnonymousClass000.A0Y(weakReference)) != null) {
                if (z) {
                    A0W(4);
                } else {
                    A0Y2.requestLayout();
                }
            }
        }
    }

    private int A00() {
        int i;
        int i2;
        if (this.A0f) {
            i = Math.min(AnonymousClass001.A02(this.A0F, (this.A01 * 9) / 16, this.A0n), this.A0k);
        } else if (!this.A0W && !this.A0c && (i2 = this.A08) > 0) {
            return Math.max(this.A0G, i2 + this.A0m);
        } else {
            i = this.A0G;
        }
        return i + this.A0A;
    }

    private void A03() {
        WeakReference weakReference = this.A0S;
        if (weakReference != null) {
            A06(AnonymousClass000.A0Y(weakReference), this, 0);
        }
        WeakReference weakReference2 = this.A0Q;
        if (weakReference2 != null) {
            A06(AnonymousClass000.A0Y(weakReference2), this, 1);
        }
    }

    public static void A05(View view, BottomSheetBehavior bottomSheetBehavior, int i) {
        if (view != null) {
            C012005e.A0N(view, 524288);
            C012005e.A0N(view, 262144);
            C012005e.A0N(view, 1048576);
            SparseIntArray sparseIntArray = bottomSheetBehavior.A0r;
            int i2 = sparseIntArray.get(i, -1);
            if (i2 != -1) {
                C012005e.A0N(view, i2);
                sparseIntArray.delete(i);
            }
        }
    }

    public static void A06(View view, BottomSheetBehavior bottomSheetBehavior, int i) {
        AnonymousClass0Yd r2;
        int i2;
        View view2 = view;
        if (view != null) {
            BottomSheetBehavior bottomSheetBehavior2 = bottomSheetBehavior;
            int i3 = i;
            A05(view2, bottomSheetBehavior2, i3);
            int i4 = 6;
            if (!bottomSheetBehavior2.A0V && bottomSheetBehavior2.A0J != 6) {
                SparseIntArray sparseIntArray = bottomSheetBehavior2.A0r;
                String string = view2.getResources().getString(R.string.f12nameremoved);
                C15110mi r9 = new C15110mi(bottomSheetBehavior2, 6, 0);
                ArrayList A0C2 = C012005e.A0C(view2);
                int i5 = 0;
                while (true) {
                    if (i5 >= A0C2.size()) {
                        int i6 = 0;
                        i2 = -1;
                        while (true) {
                            int[] iArr = C012005e.A09;
                            if (i6 >= 32 || i2 != -1) {
                                break;
                            }
                            int i7 = iArr[i6];
                            boolean z = true;
                            for (int i8 = 0; i8 < A0C2.size(); i8++) {
                                boolean z2 = false;
                                if (((AccessibilityNodeInfo.AccessibilityAction) ((AnonymousClass0Yd) A0C2.get(i8)).A03).getId() != i7) {
                                    z2 = true;
                                }
                                z &= z2;
                            }
                            if (z) {
                                i2 = i7;
                            }
                            i6++;
                        }
                    } else if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((AnonymousClass0Yd) A0C2.get(i5)).A03).getLabel())) {
                        i2 = ((AccessibilityNodeInfo.AccessibilityAction) ((AnonymousClass0Yd) A0C2.get(i5)).A03).getId();
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i2 != -1) {
                    C15110mi r15 = r9;
                    AnonymousClass0Yd r14 = new AnonymousClass0Yd(r15, string, (Class) null, (Object) null, i2);
                    C012005e.A0L(view2);
                    C012005e.A0R(view2, ((AccessibilityNodeInfo.AccessibilityAction) r14.A03).getId());
                    C012005e.A0C(view2).add(r14);
                    C012005e.A0O(view2, 0);
                }
                sparseIntArray.put(i3, i2);
            }
            if (bottomSheetBehavior2.A0X && bottomSheetBehavior2.A0J != 5) {
                C012005e.A0Y(view2, AnonymousClass0Yd.A0D, new C15110mi(bottomSheetBehavior2, 5, 0), (CharSequence) null);
            }
            int i9 = bottomSheetBehavior2.A0J;
            if (i9 == 3) {
                if (bottomSheetBehavior2.A0V) {
                    i4 = 4;
                }
                r2 = AnonymousClass0Yd.A09;
            } else if (i9 == 4) {
                if (bottomSheetBehavior2.A0V) {
                    i4 = 3;
                }
                r2 = AnonymousClass0Yd.A0H;
            } else if (i9 == 6) {
                C012005e.A0Y(view2, AnonymousClass0Yd.A09, new C15110mi(bottomSheetBehavior2, 4, 0), (CharSequence) null);
                C012005e.A0Y(view2, AnonymousClass0Yd.A0H, new C15110mi(bottomSheetBehavior2, 3, 0), (CharSequence) null);
                return;
            } else {
                return;
            }
            C012005e.A0Y(view2, r2, new C15110mi(bottomSheetBehavior2, i4, 0), (CharSequence) null);
        }
    }

    public Parcelable A0E(View view, CoordinatorLayout coordinatorLayout) {
        return new AnonymousClass0HR((Parcelable) AbsSavedState.EMPTY_STATE, this);
    }

    public void A0G(Parcelable parcelable, View view, CoordinatorLayout coordinatorLayout) {
        AnonymousClass0HR r5 = (AnonymousClass0HR) parcelable;
        int i = this.A0H;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.A0G = r5.A00;
            }
            if (i == -1 || (i & 2) == 2) {
                this.A0V = r5.A01;
            }
            if (i == -1 || (i & 4) == 4) {
                this.A0X = r5.A02;
            }
            if (i == -1 || (i & 8) == 8) {
                this.A0h = r5.A03;
            }
        }
        int i2 = r5.A04;
        if (i2 == 1 || i2 == 2) {
            this.A0J = 4;
        } else {
            this.A0J = i2;
        }
    }

    public int A0R() {
        int i;
        if (this.A0V) {
            return this.A07;
        }
        int i2 = this.A06;
        if (this.A0q) {
            i = 0;
        } else {
            i = this.A0B;
        }
        return Math.max(i2, i);
    }

    public int A0S() {
        if (this.A0f) {
            return -1;
        }
        return this.A0G;
    }

    public void A0U(int i) {
        float f;
        float f2;
        int A0R2;
        View A0Y2 = AnonymousClass000.A0Y(this.A0S);
        if (A0Y2 != null) {
            ArrayList arrayList = this.A0s;
            if (!arrayList.isEmpty()) {
                int i2 = this.A05;
                if (i > i2 || i2 == (A0R2 = A0R())) {
                    f = (float) (i2 - i);
                    f2 = (float) (this.A0F - i2);
                } else {
                    f = (float) (i2 - i);
                    f2 = (float) (i2 - A0R2);
                }
                float f3 = f / f2;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    ((C06570Uc) arrayList.get(i3)).A02(A0Y2, f3);
                }
            }
        }
    }

    public void A0X(int i) {
        View A0Y2;
        WeakReference weakReference;
        if (this.A0J != i) {
            this.A0J = i;
            WeakReference weakReference2 = this.A0S;
            if (weakReference2 != null && (A0Y2 = AnonymousClass000.A0Y(weakReference2)) != null) {
                int i2 = 0;
                if (i == 3) {
                    WeakReference weakReference3 = this.A0S;
                    if (weakReference3 != null) {
                        ViewParent parent = AnonymousClass000.A0Y(weakReference3).getParent();
                        if (parent instanceof CoordinatorLayout) {
                            ViewGroup viewGroup = (ViewGroup) parent;
                            int childCount = viewGroup.getChildCount();
                            if (this.A0T == null) {
                                this.A0T = new HashMap(childCount);
                                for (int i3 = 0; i3 < childCount; i3++) {
                                    View childAt = viewGroup.getChildAt(i3);
                                    if (childAt != this.A0S.get()) {
                                        this.A0T.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                                    }
                                }
                            }
                        }
                    }
                } else if ((i == 6 || i == 5 || i == 4) && (weakReference = this.A0S) != null) {
                    ViewParent parent2 = AnonymousClass000.A0Y(weakReference).getParent();
                    if (parent2 instanceof CoordinatorLayout) {
                        ViewGroup viewGroup2 = (ViewGroup) parent2;
                        int childCount2 = viewGroup2.getChildCount();
                        for (int i4 = 0; i4 < childCount2; i4++) {
                            viewGroup2.getChildAt(i4);
                            this.A0S.get();
                        }
                        this.A0T = null;
                    }
                }
                A04(i, true);
                while (true) {
                    ArrayList arrayList = this.A0s;
                    if (i2 < arrayList.size()) {
                        ((C06570Uc) arrayList.get(i2)).A03(A0Y2, i);
                        i2++;
                    } else {
                        A03();
                        return;
                    }
                }
            }
        }
    }

    public void A0Z(C06570Uc r3) {
        ArrayList arrayList = this.A0s;
        if (!arrayList.contains(r3)) {
            arrayList.add(r3);
        }
    }

    @Deprecated
    public void A0a(C06570Uc r3) {
        Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        ArrayList arrayList = this.A0s;
        arrayList.clear();
        if (r3 != null) {
            arrayList.add(r3);
        }
    }

    public void A0c(boolean z) {
        int i;
        if (this.A0V != z) {
            this.A0V = z;
            if (this.A0S != null) {
                A08(this);
            }
            if (!z || this.A0J != 6) {
                i = this.A0J;
            } else {
                i = 3;
            }
            A0X(i);
            A04(this.A0J, true);
            A03();
        }
    }

    public void A0d(boolean z) {
        if (this.A0X != z) {
            this.A0X = z;
            if (!z && this.A0J == 5) {
                A0W(4);
            }
            A03();
        }
    }

    public boolean A0e(View view, float f) {
        if (this.A0h) {
            return true;
        }
        if (view.getTop() < this.A05) {
            return false;
        }
        if (Math.abs((((float) view.getTop()) + (f * this.A0j)) - ((float) this.A05)) / ((float) A00()) <= 0.5f) {
            return false;
        }
        return true;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int dimensionPixelOffset;
        this.A0m = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C27931Qk.A04);
        if (obtainStyledAttributes.hasValue(3)) {
            this.A0L = AnonymousClass061.A00(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.A0P = new AnonymousClass06J(AnonymousClass06J.A01(context, attributeSet, R.attr.f4nameremoved, R.style.f13nameremoved));
        }
        AnonymousClass06J r1 = this.A0P;
        if (r1 != null) {
            C012505l r0 = new C012505l(r1);
            this.A0O = r0;
            r0.A0B(context);
            ColorStateList colorStateList = this.A0L;
            if (colorStateList != null) {
                this.A0O.A0C(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.A0O.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.A0K = ofFloat;
        ofFloat.setDuration(500);
        this.A0K.addUpdateListener(new AnonymousClass0QY(this, 2));
        this.A00 = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.A0E = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.A0D = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue == null || peekValue.data != -1) {
            A0Y(obtainStyledAttributes.getDimensionPixelSize(9, -1), false);
        } else {
            A0Y(-1, false);
        }
        A0d(obtainStyledAttributes.getBoolean(8, false));
        this.A0W = obtainStyledAttributes.getBoolean(13, false);
        A0c(obtainStyledAttributes.getBoolean(6, true));
        this.A0h = obtainStyledAttributes.getBoolean(12, false);
        A0b(obtainStyledAttributes.getBoolean(4, true));
        this.A0H = obtainStyledAttributes.getInt(10, 0);
        float f = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            throw AnonymousClass001.A08("ratio must be a float value between 0 and 1");
        }
        this.A02 = f;
        if (this.A0S != null) {
            this.A09 = (int) (((float) this.A0F) * (1.0f - f));
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
        if (peekValue2 == null || peekValue2.type != 16) {
            dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
        } else {
            dimensionPixelOffset = peekValue2.data;
        }
        if (dimensionPixelOffset >= 0) {
            this.A06 = dimensionPixelOffset;
            A04(this.A0J, true);
            this.A0I = obtainStyledAttributes.getInt(11, 500);
            this.A0c = obtainStyledAttributes.getBoolean(17, false);
            this.A0d = obtainStyledAttributes.getBoolean(18, false);
            this.A0e = obtainStyledAttributes.getBoolean(19, false);
            this.A0q = obtainStyledAttributes.getBoolean(20, true);
            this.A0Y = obtainStyledAttributes.getBoolean(14, false);
            this.A0Z = obtainStyledAttributes.getBoolean(15, false);
            this.A0a = obtainStyledAttributes.getBoolean(16, false);
            this.A0g = obtainStyledAttributes.getBoolean(23, true);
            obtainStyledAttributes.recycle();
            this.A03 = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw AnonymousClass001.A08("offset must be greater than or equal to 0");
    }

    public static int A01(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public static BottomSheetBehavior A02(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C02460Ak) {
            AnonymousClass0XL r1 = ((C02460Ak) layoutParams).A0B;
            if (r1 instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) r1;
            }
            throw AnonymousClass001.A08("The view is not associated with BottomSheetBehavior");
        }
        throw AnonymousClass001.A08("The view is not a child of CoordinatorLayout");
    }

    public static void A08(BottomSheetBehavior bottomSheetBehavior) {
        int A002 = bottomSheetBehavior.A00();
        boolean z = bottomSheetBehavior.A0V;
        int i = bottomSheetBehavior.A0F - A002;
        if (z) {
            bottomSheetBehavior.A05 = Math.max(i, bottomSheetBehavior.A07);
        } else {
            bottomSheetBehavior.A05 = i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        if (r5.getTop() > r4.A09) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006e, code lost:
        if (X.AnonymousClass000.A05(r2, r4.A07) < X.AnonymousClass000.A05(r2, r4.A05)) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007b, code lost:
        if (r2 < X.AnonymousClass000.A05(r2, r4.A05)) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0092, code lost:
        if (X.AnonymousClass000.A05(r2, r0) < X.AnonymousClass000.A05(r2, r4.A05)) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H(android.view.View r5, android.view.View r6, androidx.coordinatorlayout.widget.CoordinatorLayout r7, int r8) {
        /*
            r4 = this;
            int r1 = r5.getTop()
            int r0 = r4.A0R()
            r3 = 3
            if (r1 != r0) goto L_0x000f
            r4.A0X(r3)
        L_0x000e:
            return
        L_0x000f:
            java.lang.ref.WeakReference r0 = r4.A0R
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = r0.get()
            if (r6 != r0) goto L_0x000e
            boolean r0 = r4.A0b
            if (r0 == 0) goto L_0x000e
            int r0 = r4.A0C
            if (r0 <= 0) goto L_0x0035
            boolean r0 = r4.A0V
            if (r0 != 0) goto L_0x002e
            int r1 = r5.getTop()
            int r0 = r4.A09
            if (r1 <= r0) goto L_0x002e
        L_0x002d:
            r3 = 6
        L_0x002e:
            r0 = 0
            A07(r5, r4, r3, r0)
            r4.A0b = r0
            return
        L_0x0035:
            boolean r0 = r4.A0X
            if (r0 == 0) goto L_0x0056
            android.view.VelocityTracker r2 = r4.A0M
            if (r2 != 0) goto L_0x0046
            r0 = 0
        L_0x003e:
            boolean r0 = r4.A0e(r5, r0)
            if (r0 == 0) goto L_0x0056
            r3 = 5
            goto L_0x002e
        L_0x0046:
            r1 = 1000(0x3e8, float:1.401E-42)
            float r0 = r4.A03
            r2.computeCurrentVelocity(r1, r0)
            android.view.VelocityTracker r1 = r4.A0M
            int r0 = r4.A04
            float r0 = r1.getYVelocity(r0)
            goto L_0x003e
        L_0x0056:
            int r0 = r4.A0C
            if (r0 != 0) goto L_0x007e
            int r2 = r5.getTop()
            boolean r0 = r4.A0V
            if (r0 == 0) goto L_0x0071
            int r0 = r4.A07
            int r1 = X.AnonymousClass000.A05(r2, r0)
            int r0 = r4.A05
            int r0 = X.AnonymousClass000.A05(r2, r0)
            if (r1 >= r0) goto L_0x0095
            goto L_0x002e
        L_0x0071:
            int r0 = r4.A09
            if (r2 >= r0) goto L_0x0088
            int r0 = r4.A05
            int r0 = X.AnonymousClass000.A05(r2, r0)
            if (r2 >= r0) goto L_0x002d
            goto L_0x002e
        L_0x007e:
            boolean r0 = r4.A0V
            if (r0 != 0) goto L_0x0095
            int r2 = r5.getTop()
            int r0 = r4.A09
        L_0x0088:
            int r1 = X.AnonymousClass000.A05(r2, r0)
            int r0 = r4.A05
            int r0 = X.AnonymousClass000.A05(r2, r0)
            if (r1 >= r0) goto L_0x0095
            goto L_0x002d
        L_0x0095:
            r3 = 4
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.A0H(android.view.View, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0087, code lost:
        if (r12.A0H(r11, r1, r9.A0l) != false) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0L(android.view.MotionEvent r10, android.view.View r11, androidx.coordinatorlayout.widget.CoordinatorLayout r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r2 = 0
            r4 = 1
            if (r0 == 0) goto L_0x00cc
            boolean r0 = r9.A0U
            if (r0 == 0) goto L_0x00cc
            int r6 = r10.getActionMasked()
            if (r6 != 0) goto L_0x001f
            r0 = -1
            r9.A04 = r0
            android.view.VelocityTracker r0 = r9.A0M
            if (r0 == 0) goto L_0x001f
            r0.recycle()
            r0 = 0
            r9.A0M = r0
        L_0x001f:
            android.view.VelocityTracker r0 = r9.A0M
            if (r0 != 0) goto L_0x0029
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r9.A0M = r0
        L_0x0029:
            r0.addMovement(r10)
            r3 = 0
            r7 = -1
            r5 = 2
            if (r6 == 0) goto L_0x0050
            if (r6 == r4) goto L_0x0045
            r0 = 3
            if (r6 == r0) goto L_0x0045
        L_0x0036:
            boolean r0 = r9.A0p
            if (r0 != 0) goto L_0x008d
            X.0Z5 r0 = r9.A0N
            if (r0 == 0) goto L_0x008d
            boolean r0 = r0.A0F(r10)
            if (r0 == 0) goto L_0x008d
            return r4
        L_0x0045:
            r9.A0i = r2
            r9.A04 = r7
            boolean r0 = r9.A0p
            if (r0 == 0) goto L_0x0036
            r9.A0p = r2
            return r2
        L_0x0050:
            float r0 = r10.getX()
            int r1 = (int) r0
            float r0 = r10.getY()
            int r8 = (int) r0
            r9.A0l = r8
            int r0 = r9.A0J
            if (r0 == r5) goto L_0x007c
            java.lang.ref.WeakReference r0 = r9.A0R
            if (r0 == 0) goto L_0x007c
            android.view.View r0 = X.AnonymousClass000.A0Y(r0)
            if (r0 == 0) goto L_0x007c
            boolean r0 = r12.A0H(r0, r1, r8)
            if (r0 == 0) goto L_0x007c
            int r0 = r10.getActionIndex()
            int r0 = r10.getPointerId(r0)
            r9.A04 = r0
            r9.A0i = r4
        L_0x007c:
            int r0 = r9.A04
            if (r0 != r7) goto L_0x0089
            int r0 = r9.A0l
            boolean r1 = r12.A0H(r11, r1, r0)
            r0 = 1
            if (r1 == 0) goto L_0x008a
        L_0x0089:
            r0 = 0
        L_0x008a:
            r9.A0p = r0
            goto L_0x0036
        L_0x008d:
            java.lang.ref.WeakReference r0 = r9.A0R
            if (r0 == 0) goto L_0x0095
            android.view.View r3 = X.AnonymousClass000.A0Y(r0)
        L_0x0095:
            if (r6 != r5) goto L_0x00ce
            if (r3 == 0) goto L_0x00ce
            boolean r0 = r9.A0p
            if (r0 != 0) goto L_0x00ce
            int r0 = r9.A0J
            if (r0 == r4) goto L_0x00ce
            float r0 = r10.getX()
            int r1 = (int) r0
            float r0 = r10.getY()
            int r0 = (int) r0
            boolean r0 = r12.A0H(r3, r1, r0)
            if (r0 != 0) goto L_0x00ce
            X.0Z5 r0 = r9.A0N
            if (r0 == 0) goto L_0x00ce
            int r0 = r9.A0l
            float r1 = (float) r0
            float r0 = r10.getY()
            float r1 = r1 - r0
            float r1 = java.lang.Math.abs(r1)
            X.0Z5 r0 = r9.A0N
            int r0 = r0.A05
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ce
            r2 = 1
            return r2
        L_0x00cc:
            r9.A0p = r4
        L_0x00ce:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.A0L(android.view.MotionEvent, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout):boolean");
    }

    public boolean A0M(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.A0J;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        AnonymousClass0Z5 r1 = this.A0N;
        if (r1 != null && (this.A0U || i == 1)) {
            r1.A0C(motionEvent);
        }
        if (actionMasked == 0) {
            this.A04 = -1;
            VelocityTracker velocityTracker = this.A0M;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.A0M = null;
            }
        }
        VelocityTracker velocityTracker2 = this.A0M;
        if (velocityTracker2 == null) {
            velocityTracker2 = VelocityTracker.obtain();
            this.A0M = velocityTracker2;
        }
        velocityTracker2.addMovement(motionEvent);
        if (this.A0N != null && ((this.A0U || this.A0J == 1) && actionMasked == 2 && !this.A0p)) {
            float abs = Math.abs(((float) this.A0l) - motionEvent.getY());
            AnonymousClass0Z5 r12 = this.A0N;
            if (abs > ((float) r12.A05)) {
                r12.A0D(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.A0p;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r7.A0f != false) goto L_0x0030;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e0 A[LOOP:0: B:49:0x00d8->B:51:0x00e0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0125 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0P(android.view.View r8, androidx.coordinatorlayout.widget.CoordinatorLayout r9, int r10) {
        /*
            r7 = this;
            boolean r0 = X.C011504z.A09(r9)
            r2 = 1
            if (r0 == 0) goto L_0x0010
            boolean r0 = X.C011504z.A09(r8)
            if (r0 != 0) goto L_0x0010
            r8.setFitsSystemWindows(r2)
        L_0x0010:
            java.lang.ref.WeakReference r0 = r7.A0S
            if (r0 != 0) goto L_0x0073
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131166222(0x7f07040e, float:1.7946683E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r7.A0n = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0030
            boolean r0 = r7.A0W
            if (r0 != 0) goto L_0x0030
            boolean r0 = r7.A0f
            r1 = 1
            if (r0 == 0) goto L_0x0031
        L_0x0030:
            r1 = 0
        L_0x0031:
            boolean r0 = r7.A0c
            if (r0 != 0) goto L_0x011b
            boolean r0 = r7.A0d
            if (r0 != 0) goto L_0x011b
            boolean r0 = r7.A0e
            if (r0 != 0) goto L_0x011b
            boolean r0 = r7.A0Y
            if (r0 != 0) goto L_0x011b
            boolean r0 = r7.A0Z
            if (r0 != 0) goto L_0x011b
            boolean r0 = r7.A0a
            if (r0 != 0) goto L_0x011b
            if (r1 != 0) goto L_0x011b
        L_0x004b:
            java.lang.ref.WeakReference r0 = X.AnonymousClass001.A0F(r8)
            r7.A0S = r0
            X.05l r3 = r7.A0O
            if (r3 == 0) goto L_0x0112
            X.C011504z.A04(r3, r8)
            float r1 = r7.A00
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0064
            float r1 = X.C011004s.A00(r8)
        L_0x0064:
            r3.A09(r1)
        L_0x0067:
            r7.A03()
            int r0 = X.C011504z.A00(r8)
            if (r0 != 0) goto L_0x0073
            X.C011504z.A06(r8, r2)
        L_0x0073:
            X.0Z5 r0 = r7.A0N
            if (r0 != 0) goto L_0x007f
            X.0V6 r0 = r7.A0t
            X.0Z5 r0 = X.AnonymousClass0Z5.A01(r9, r0)
            r7.A0N = r0
        L_0x007f:
            int r5 = r8.getTop()
            r9.A0F(r8, r10)
            int r0 = r9.getWidth()
            r7.A01 = r0
            int r0 = r9.getHeight()
            r7.A0F = r0
            int r3 = r8.getHeight()
            r7.A0k = r3
            int r6 = r7.A0F
            int r0 = r6 - r3
            int r1 = r7.A0B
            if (r0 >= r1) goto L_0x00a7
            boolean r0 = r7.A0q
            if (r0 == 0) goto L_0x010d
            r7.A0k = r6
            r3 = r6
        L_0x00a7:
            int r0 = r6 - r3
            r3 = 0
            int r0 = java.lang.Math.max(r3, r0)
            r7.A07 = r0
            float r4 = (float) r6
            float r1 = r7.A02
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r1
            float r4 = r4 * r0
            int r4 = (int) r4
            r7.A09 = r4
            A08(r7)
            int r1 = r7.A0J
            r0 = 3
            if (r1 != r0) goto L_0x00ec
            int r6 = r7.A0R()
        L_0x00c6:
            X.C012005e.A0Q(r8, r6)
        L_0x00c9:
            int r0 = r7.A0J
            r7.A04(r0, r3)
            android.view.View r0 = r7.A0T(r8)
            java.lang.ref.WeakReference r0 = X.AnonymousClass001.A0F(r0)
            r7.A0R = r0
        L_0x00d8:
            java.util.ArrayList r1 = r7.A0s
            int r0 = r1.size()
            if (r3 >= r0) goto L_0x0125
            java.lang.Object r0 = r1.get(r3)
            X.0Uc r0 = (X.C06570Uc) r0
            r0.A01(r8)
            int r3 = r3 + 1
            goto L_0x00d8
        L_0x00ec:
            r0 = 6
            if (r1 != r0) goto L_0x00f1
            r6 = r4
            goto L_0x00c6
        L_0x00f1:
            boolean r0 = r7.A0X
            if (r0 == 0) goto L_0x00f9
            r0 = 5
            if (r1 != r0) goto L_0x00f9
            goto L_0x00c6
        L_0x00f9:
            r0 = 4
            if (r1 != r0) goto L_0x00ff
            int r6 = r7.A05
            goto L_0x00c6
        L_0x00ff:
            if (r1 == r2) goto L_0x0104
            r0 = 2
            if (r1 != r0) goto L_0x00c9
        L_0x0104:
            int r0 = r8.getTop()
            int r5 = r5 - r0
            X.C012005e.A0Q(r8, r5)
            goto L_0x00c9
        L_0x010d:
            int r3 = r6 - r1
            r7.A0k = r3
            goto L_0x00a7
        L_0x0112:
            android.content.res.ColorStateList r0 = r7.A0L
            if (r0 == 0) goto L_0x0067
            X.C012005e.A0F(r0, r8)
            goto L_0x0067
        L_0x011b:
            X.0f4 r0 = new X.0f4
            r0.<init>(r7, r1)
            X.AnonymousClass062.A02(r8, r0)
            goto L_0x004b
        L_0x0125:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.A0P(android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout, int):boolean");
    }

    public boolean A0Q(View view, CoordinatorLayout coordinatorLayout, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams A0a2 = AnonymousClass000.A0a(view);
        view.measure(A01(i, AnonymousClass000.A0F(A0a2, AnonymousClass000.A09(coordinatorLayout)) + i2, this.A0E, A0a2.width), A01(i3, AnonymousClass000.A0E(A0a2, AnonymousClass000.A0C(coordinatorLayout)), this.A0D, A0a2.height));
        return true;
    }

    public View A0T(View view) {
        if (view.getVisibility() == 0) {
            if (C011004s.A0A(view)) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View A0T2 = A0T(viewGroup.getChildAt(i));
                    if (A0T2 != null) {
                        return A0T2;
                    }
                }
            }
        }
        return null;
    }

    public void A0b(boolean z) {
        this.A0U = z;
    }

    public BottomSheetBehavior() {
    }
}
