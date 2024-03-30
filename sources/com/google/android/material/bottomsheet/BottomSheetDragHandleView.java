package com.google.android.material.bottomsheet;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0XL;
import X.C012005e;
import X.C02460Ak;
import X.C06570Uc;
import X.C18120se;
import X.C18250sr;
import X.C27891Qg;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.AppCompatImageView;
import com.whatsapp.R;
import java.lang.ref.WeakReference;

public class BottomSheetDragHandleView extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {
    public BottomSheetBehavior A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final AccessibilityManager A04;
    public final C06570Uc A05;
    public final String A06;
    public final String A07;
    public final String A08;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0010  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(com.google.android.material.bottomsheet.BottomSheetDragHandleView r4, int r5) {
        /*
            r1 = 4
            r0 = 1
            if (r5 == r1) goto L_0x0008
            r0 = 3
            if (r5 != r0) goto L_0x000a
            r0 = 0
        L_0x0008:
            r4.A02 = r0
        L_0x000a:
            X.0Yd r3 = X.AnonymousClass0Yd.A08
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x001c
            java.lang.String r2 = r4.A08
        L_0x0012:
            r1 = 3
            X.0R4 r0 = new X.0R4
            r0.<init>(r4, r1)
            X.C012005e.A0Y(r4, r3, r0, r2)
            return
        L_0x001c:
            java.lang.String r2 = r4.A07
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetDragHandleView.A01(com.google.android.material.bottomsheet.BottomSheetDragHandleView, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r3.A00 == null) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00() {
        /*
            r3 = this;
            boolean r0 = r3.A01
            r2 = 1
            if (r0 == 0) goto L_0x000a
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r3.A00
            r0 = 1
            if (r1 != 0) goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            r3.A03 = r0
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r3.A00
            if (r0 != 0) goto L_0x0012
            r2 = 2
        L_0x0012:
            X.C011504z.A06(r3, r2)
            boolean r0 = r3.A03
            r3.setClickable(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetDragHandleView.A00():void");
    }

    public static boolean A02(BottomSheetDragHandleView bottomSheetDragHandleView) {
        boolean z = false;
        if (!bottomSheetDragHandleView.A03) {
            return false;
        }
        String str = bottomSheetDragHandleView.A06;
        AccessibilityManager accessibilityManager = bottomSheetDragHandleView.A04;
        if (accessibilityManager != null) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
            obtain.getText().add(str);
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
        BottomSheetBehavior bottomSheetBehavior = bottomSheetDragHandleView.A00;
        if (!bottomSheetBehavior.A0V) {
            z = true;
        }
        int i = bottomSheetBehavior.A0J;
        int i2 = 6;
        int i3 = 3;
        if (i == 4) {
            if (!z) {
                i2 = 3;
            }
        } else if (i != 3) {
            if (!bottomSheetDragHandleView.A02) {
                i3 = 4;
            }
            i2 = i3;
        } else if (!z) {
            i2 = 4;
        }
        bottomSheetBehavior.A0W(i2);
        return true;
    }

    private void setBottomSheetBehavior(BottomSheetBehavior bottomSheetBehavior) {
        BottomSheetBehavior bottomSheetBehavior2 = this.A00;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.A0s.remove(this.A05);
            BottomSheetBehavior bottomSheetBehavior3 = this.A00;
            WeakReference weakReference = bottomSheetBehavior3.A0Q;
            if (weakReference != null) {
                BottomSheetBehavior.A05(AnonymousClass000.A0Y(weakReference), bottomSheetBehavior3, 1);
                bottomSheetBehavior3.A0Q = null;
            } else {
                bottomSheetBehavior3.A0Q = AnonymousClass001.A0F((Object) null);
            }
        }
        this.A00 = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.A0Q = AnonymousClass001.A0F(this);
            BottomSheetBehavior.A06(this, bottomSheetBehavior, 1);
            A01(this, this.A00.A0J);
            this.A00.A0Z(this.A05);
        }
        A00();
    }

    public void onAccessibilityStateChanged(boolean z) {
        this.A01 = z;
        A00();
    }

    public void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager = this.A04;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this);
        }
        setBottomSheetBehavior((BottomSheetBehavior) null);
        super.onDetachedFromWindow();
    }

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f4nameremoved);
    }

    public void onAttachedToWindow() {
        BottomSheetBehavior bottomSheetBehavior;
        super.onAttachedToWindow();
        View view = this;
        while (true) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof View) || (view = (View) parent) == null) {
                bottomSheetBehavior = null;
            } else {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof C02460Ak) {
                    AnonymousClass0XL r1 = ((C02460Ak) layoutParams).A0B;
                    if (r1 instanceof BottomSheetBehavior) {
                        bottomSheetBehavior = (BottomSheetBehavior) r1;
                        break;
                    }
                }
            }
        }
        setBottomSheetBehavior(bottomSheetBehavior);
        AccessibilityManager accessibilityManager = this.A04;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this);
            onAccessibilityStateChanged(accessibilityManager.isEnabled());
        }
    }

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet, int i) {
        super(C27891Qg.A00(context, attributeSet, i, R.style.f13nameremoved), attributeSet, i);
        this.A08 = getResources().getString(R.string.f12nameremoved);
        this.A07 = getResources().getString(R.string.f12nameremoved);
        this.A06 = getResources().getString(R.string.f12nameremoved);
        this.A05 = new C18250sr(this, 1);
        this.A04 = (AccessibilityManager) getContext().getSystemService("accessibility");
        A00();
        C012005e.A0V(this, new C18120se(this, 2));
    }

    public BottomSheetDragHandleView(Context context) {
        this(context, (AttributeSet) null);
    }
}
