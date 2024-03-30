package com.google.android.material.sidesheet;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass061;
import X.AnonymousClass06J;
import X.AnonymousClass0HO;
import X.AnonymousClass0U1;
import X.AnonymousClass0V6;
import X.AnonymousClass0WL;
import X.AnonymousClass0XL;
import X.AnonymousClass0Yd;
import X.AnonymousClass0Z5;
import X.C011304x;
import X.C012005e;
import X.C012505l;
import X.C02460Ak;
import X.C15110mi;
import X.C18160si;
import X.C27931Qk;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SideSheetBehavior extends AnonymousClass0XL {
    public float A00 = 0.1f;
    public int A01;
    public int A02 = -1;
    public int A03;
    public int A04;
    public int A05 = 5;
    public ColorStateList A06;
    public VelocityTracker A07;
    public AnonymousClass0Z5 A08;
    public C012505l A09;
    public AnonymousClass06J A0A;
    public AnonymousClass0WL A0B;
    public WeakReference A0C;
    public WeakReference A0D;
    public boolean A0E = true;
    public float A0F;
    public boolean A0G;
    public final Set A0H = new LinkedHashSet();
    public final AnonymousClass0V6 A0I = new C18160si(this, 1);
    public final AnonymousClass0U1 A0J = new AnonymousClass0U1(this);

    public void A0F() {
        this.A0D = null;
        this.A08 = null;
    }

    public void A0K(C02460Ak r2) {
        this.A0D = null;
        this.A08 = null;
    }

    private void A00() {
        View A0Y;
        WeakReference weakReference = this.A0D;
        if (weakReference != null && (A0Y = AnonymousClass000.A0Y(weakReference)) != null) {
            C012005e.A0N(A0Y, 262144);
            C012005e.A0N(A0Y, 1048576);
            if (this.A05 != 5) {
                C012005e.A0Y(A0Y, AnonymousClass0Yd.A0D, new C15110mi(this, 5, 1), (CharSequence) null);
            }
            if (this.A05 != 3) {
                C012005e.A0Y(A0Y, AnonymousClass0Yd.A0H, new C15110mi(this, 3, 1), (CharSequence) null);
            }
        }
    }

    public static void A01(View view, SideSheetBehavior sideSheetBehavior, int i, boolean z) {
        int max;
        boolean A0H2;
        SideSheetBehavior sideSheetBehavior2 = sideSheetBehavior.A0B.A00;
        if (i == 3) {
            SideSheetBehavior sideSheetBehavior3 = sideSheetBehavior2.A0B.A00;
            max = Math.max(0, sideSheetBehavior3.A04 - sideSheetBehavior3.A01);
        } else if (i == 5) {
            max = sideSheetBehavior2.A0B.A00.A04;
        } else {
            throw AnonymousClass000.A0d("Invalid state to get outward edge offset: ", AnonymousClass000.A0u(), i);
        }
        AnonymousClass0Z5 r1 = sideSheetBehavior2.A08;
        if (r1 != null) {
            int top = view.getTop();
            if (z) {
                A0H2 = r1.A0E(max, top);
            } else {
                A0H2 = r1.A0H(view, max, top);
            }
            if (A0H2) {
                sideSheetBehavior.A0R(2);
                sideSheetBehavior.A0J.A00(i);
                return;
            }
        }
        sideSheetBehavior.A0R(i);
    }

    public Parcelable A0E(View view, CoordinatorLayout coordinatorLayout) {
        return new AnonymousClass0HO((Parcelable) AbsSavedState.EMPTY_STATE, this);
    }

    public void A0G(Parcelable parcelable, View view, CoordinatorLayout coordinatorLayout) {
        int i = ((AnonymousClass0HO) parcelable).A00;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.A05 = i;
    }

    public void A0R(int i) {
        View A0Y;
        if (this.A05 != i) {
            this.A05 = i;
            WeakReference weakReference = this.A0D;
            if (weakReference != null && (A0Y = AnonymousClass000.A0Y(weakReference)) != null) {
                int i2 = 0;
                if (i == 5) {
                    i2 = 4;
                }
                if (A0Y.getVisibility() != i2) {
                    A0Y.setVisibility(i2);
                }
                Iterator it = this.A0H.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw AnonymousClass001.A0A("onStateChanged");
                } else {
                    A00();
                }
            }
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C27931Qk.A0a);
        if (obtainStyledAttributes.hasValue(3)) {
            this.A06 = AnonymousClass061.A00(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.A0A = new AnonymousClass06J(AnonymousClass06J.A01(context, attributeSet, 0, R.style.f13nameremoved));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.A02 = resourceId;
            WeakReference weakReference = this.A0C;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.A0C = null;
            WeakReference weakReference2 = this.A0D;
            if (weakReference2 != null) {
                View A0Y = AnonymousClass000.A0Y(weakReference2);
                if (resourceId != -1 && C011304x.A03(A0Y)) {
                    A0Y.requestLayout();
                }
            }
        }
        AnonymousClass06J r1 = this.A0A;
        if (r1 != null) {
            C012505l r0 = new C012505l(r1);
            this.A09 = r0;
            r0.A0B(context);
            ColorStateList colorStateList = this.A06;
            if (colorStateList != null) {
                this.A09.A0C(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.A09.setTint(typedValue.data);
            }
        }
        this.A0F = obtainStyledAttributes.getDimension(2, -1.0f);
        this.A0E = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        if (this.A0B == null) {
            this.A0B = new AnonymousClass0WL(this);
        }
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r4.A0E == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0L(android.view.MotionEvent r5, android.view.View r6, androidx.coordinatorlayout.widget.CoordinatorLayout r7) {
        /*
            r4 = this;
            boolean r0 = r6.isShown()
            if (r0 != 0) goto L_0x0012
            r1 = 1
            X.0sf r0 = new X.0sf
            r0.<init>(r1)
            java.lang.Object r0 = r0.A00(r6)
            if (r0 == 0) goto L_0x0017
        L_0x0012:
            boolean r1 = r4.A0E
            r0 = 1
            if (r1 != 0) goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            r3 = 1
            r2 = 0
            if (r0 != 0) goto L_0x001f
            r4.A0G = r3
            return r2
        L_0x001f:
            int r1 = r5.getActionMasked()
            if (r1 != 0) goto L_0x002f
            android.view.VelocityTracker r0 = r4.A07
            if (r0 == 0) goto L_0x002f
            r0.recycle()
            r0 = 0
            r4.A07 = r0
        L_0x002f:
            android.view.VelocityTracker r0 = r4.A07
            if (r0 != 0) goto L_0x0039
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r4.A07 = r0
        L_0x0039:
            r0.addMovement(r5)
            if (r1 == 0) goto L_0x0059
            if (r1 == r3) goto L_0x0052
            r0 = 3
            if (r1 == r0) goto L_0x0052
        L_0x0043:
            boolean r0 = r4.A0G
            if (r0 != 0) goto L_0x0061
            X.0Z5 r0 = r4.A08
            if (r0 == 0) goto L_0x0061
            boolean r0 = r0.A0F(r5)
            if (r0 == 0) goto L_0x0061
            return r3
        L_0x0052:
            boolean r0 = r4.A0G
            if (r0 == 0) goto L_0x0043
            r4.A0G = r2
            return r2
        L_0x0059:
            float r0 = r5.getX()
            int r0 = (int) r0
            r4.A03 = r0
            goto L_0x0043
        L_0x0061:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.A0L(android.view.MotionEvent, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout):boolean");
    }

    public boolean A0M(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        boolean z;
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.A05;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        AnonymousClass0Z5 r1 = this.A08;
        if (r1 != null && (this.A0E || i == 1)) {
            r1.A0C(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.A07) != null) {
            velocityTracker.recycle();
            this.A07 = null;
        }
        VelocityTracker velocityTracker2 = this.A07;
        if (velocityTracker2 == null) {
            velocityTracker2 = VelocityTracker.obtain();
            this.A07 = velocityTracker2;
        }
        velocityTracker2.addMovement(motionEvent);
        if (this.A08 != null && (((z = this.A0E) || this.A05 == 1) && actionMasked == 2 && !this.A0G && (z || this.A05 == 1))) {
            float abs = Math.abs(((float) this.A03) - motionEvent.getX());
            AnonymousClass0Z5 r12 = this.A08;
            if (abs > ((float) r12.A05)) {
                r12.A0D(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.A0G;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007b, code lost:
        if (r6.getWindowVisibility() != 0) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0P(android.view.View r6, androidx.coordinatorlayout.widget.CoordinatorLayout r7, int r8) {
        /*
            r5 = this;
            boolean r0 = X.C011504z.A09(r7)
            r2 = 1
            if (r0 == 0) goto L_0x0010
            boolean r0 = X.C011504z.A09(r6)
            if (r0 != 0) goto L_0x0010
            r6.setFitsSystemWindows(r2)
        L_0x0010:
            java.lang.ref.WeakReference r0 = r5.A0D
            if (r0 != 0) goto L_0x0095
            java.lang.ref.WeakReference r0 = X.AnonymousClass001.A0F(r6)
            r5.A0D = r0
            X.05l r3 = r5.A09
            if (r3 == 0) goto L_0x0107
            X.C011504z.A04(r3, r6)
            float r1 = r5.A0F
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x002d
            float r1 = X.C011004s.A00(r6)
        L_0x002d:
            r3.A09(r1)
        L_0x0030:
            int r3 = r5.A05
            r0 = 5
            r1 = 0
            if (r3 != r0) goto L_0x0037
            r1 = 4
        L_0x0037:
            int r0 = r6.getVisibility()
            if (r0 == r1) goto L_0x0040
            r6.setVisibility(r1)
        L_0x0040:
            r5.A00()
            int r0 = X.C011504z.A00(r6)
            if (r0 != 0) goto L_0x004c
            X.C011504z.A06(r6, r2)
        L_0x004c:
            X.0sf r0 = new X.0sf
            r0.<init>(r2)
            java.lang.Object r0 = r0.A00(r6)
            if (r0 != 0) goto L_0x0095
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131897010(0x7f122ab2, float:1.9428897E38)
            java.lang.String r1 = r1.getString(r0)
            X.0sf r0 = new X.0sf
            r0.<init>(r2)
            r0.A02(r6, r1)
            X.05h r4 = X.C012005e.A08
            if (r1 == 0) goto L_0x00f7
            java.util.WeakHashMap r3 = r4.A00
            boolean r0 = r6.isShown()
            if (r0 == 0) goto L_0x007d
            int r1 = r6.getWindowVisibility()
            r0 = 1
            if (r1 == 0) goto L_0x007e
        L_0x007d:
            r0 = 0
        L_0x007e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.put(r6, r0)
            r6.addOnAttachStateChangeListener(r4)
            boolean r0 = X.C011304x.A02(r6)
            if (r0 == 0) goto L_0x0095
            android.view.ViewTreeObserver r0 = r6.getViewTreeObserver()
            r0.addOnGlobalLayoutListener(r4)
        L_0x0095:
            X.0Z5 r0 = r5.A08
            if (r0 != 0) goto L_0x00a1
            X.0V6 r0 = r5.A0I
            X.0Z5 r0 = X.AnonymousClass0Z5.A01(r7, r0)
            r5.A08 = r0
        L_0x00a1:
            int r1 = r6.getLeft()
            r7.A0F(r6, r8)
            int r0 = r7.getWidth()
            r5.A04 = r0
            int r0 = r6.getWidth()
            r5.A01 = r0
            int r3 = r5.A05
            if (r3 == r2) goto L_0x00f1
            r0 = 2
            if (r3 == r0) goto L_0x00f1
            r0 = 3
            if (r3 == r0) goto L_0x00ef
            r0 = 5
            if (r3 != r0) goto L_0x0111
            X.0WL r0 = r5.A0B
            com.google.android.material.sidesheet.SideSheetBehavior r0 = r0.A00
            int r1 = r0.A04
        L_0x00c7:
            X.C012005e.A0P(r6, r1)
            java.lang.ref.WeakReference r0 = r5.A0C
            if (r0 != 0) goto L_0x00df
            int r1 = r5.A02
            r0 = -1
            if (r1 == r0) goto L_0x00df
            android.view.View r0 = r7.findViewById(r1)
            if (r0 == 0) goto L_0x00df
            java.lang.ref.WeakReference r0 = X.AnonymousClass001.A0F(r0)
            r5.A0C = r0
        L_0x00df:
            java.util.Set r0 = r5.A0H
            java.util.Iterator r1 = r0.iterator()
        L_0x00e5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0110
            r1.next()
            goto L_0x00e5
        L_0x00ef:
            r1 = 0
            goto L_0x00c7
        L_0x00f1:
            int r0 = r6.getLeft()
            int r1 = r1 - r0
            goto L_0x00c7
        L_0x00f7:
            java.util.WeakHashMap r0 = r4.A00
            r0.remove(r6)
            r6.removeOnAttachStateChangeListener(r4)
            android.view.ViewTreeObserver r0 = r6.getViewTreeObserver()
            A02(r4, r0)
            goto L_0x0095
        L_0x0107:
            android.content.res.ColorStateList r0 = r5.A06
            if (r0 == 0) goto L_0x0030
            X.C012005e.A0F(r0, r6)
            goto L_0x0030
        L_0x0110:
            return r2
        L_0x0111:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unexpected value: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r3)
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.A0P(android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout, int):boolean");
    }

    public boolean A0Q(View view, CoordinatorLayout coordinatorLayout, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(view);
        view.measure(ViewGroup.getChildMeasureSpec(i, AnonymousClass000.A0F(A0a, AnonymousClass000.A09(coordinatorLayout)) + i2, A0a.width), ViewGroup.getChildMeasureSpec(i3, AnonymousClass000.A0E(A0a, AnonymousClass000.A0C(coordinatorLayout)), A0a.height));
        return true;
    }

    public static void A02(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public SideSheetBehavior() {
    }
}
