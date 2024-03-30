package X;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;

/* renamed from: X.0FL  reason: invalid class name */
public class AnonymousClass0FL extends AnonymousClass0DT {
    public FrameLayout A00;
    public BottomSheetBehavior A01;
    public AnonymousClass0NE A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public FrameLayout A07;
    public CoordinatorLayout A08;
    public C06570Uc A09;

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView((View) A00(view, layoutParams, 0));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0FL(android.content.Context r5, int r6) {
        /*
            r4 = this;
            if (r6 != 0) goto L_0x0017
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r2 = r5.getTheme()
            r1 = 2130968776(0x7f0400c8, float:1.7546215E38)
            r0 = 1
            boolean r0 = r2.resolveAttribute(r1, r3, r0)
            if (r0 == 0) goto L_0x0048
            int r6 = r3.resourceId
        L_0x0017:
            r4.<init>(r5, r6)
            r1 = 1
            r4.A03 = r1
            r4.A04 = r1
            r3 = 0
            X.0sr r0 = new X.0sr
            r0.<init>(r4, r3)
            r4.A09 = r0
            X.00y r0 = r4.A02()
            r0.A0T(r1)
            android.content.Context r0 = r4.getContext()
            android.content.res.Resources$Theme r2 = r0.getTheme()
            int[] r1 = new int[r1]
            r0 = 2130969261(0x7f0402ad, float:1.7547199E38)
            r1[r3] = r0
            android.content.res.TypedArray r0 = r2.obtainStyledAttributes(r1)
            boolean r0 = r0.getBoolean(r3, r3)
            r4.A06 = r0
            return
        L_0x0048:
            r6 = 2132083948(0x7f1504ec, float:1.9808053E38)
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0FL.<init>(android.content.Context, int):void");
    }

    public static void A01(AnonymousClass0FL r3) {
        if (r3.A07 == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(r3.getContext(), R.layout.f9nameremoved, (ViewGroup) null);
            r3.A07 = frameLayout;
            r3.A08 = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) r3.A07.findViewById(R.id.design_bottom_sheet);
            r3.A00 = frameLayout2;
            BottomSheetBehavior A022 = BottomSheetBehavior.A02(frameLayout2);
            r3.A01 = A022;
            A022.A0Z(r3.A09);
            r3.A01.A0d(r3.A03);
        }
    }

    public void cancel() {
        if (this.A01 == null) {
            A01(this);
        }
        super.cancel();
    }

    public void onDetachedFromWindow() {
        AnonymousClass0NE r1 = this.A02;
        if (r1 != null) {
            r1.A04((Window) null);
        }
    }

    private FrameLayout A00(View view, ViewGroup.LayoutParams layoutParams, int i) {
        A01(this);
        ViewGroup viewGroup = (ViewGroup) this.A07.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, viewGroup, false);
        }
        if (this.A06) {
            C011004s.A07(this.A00, new C18540tK(this, 2));
        }
        this.A00.removeAllViews();
        FrameLayout frameLayout = this.A00;
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        viewGroup.findViewById(R.id.touch_outside).setOnClickListener(new C18340t0(this, 2));
        C012005e.A0V(this.A00, new C18120se(this, 1));
        this.A00.setOnTouchListener(new C09120br(this));
        return this.A07;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (android.graphics.Color.alpha(r3.getNavigationBarColor()) >= 255) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
            r4 = this;
            super.onAttachedToWindow()
            android.view.Window r3 = r4.getWindow()
            if (r3 == 0) goto L_0x0039
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x001a
            int r0 = r3.getNavigationBarColor()
            int r1 = android.graphics.Color.alpha(r0)
            r0 = 255(0xff, float:3.57E-43)
            r2 = 1
            if (r1 < r0) goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            android.widget.FrameLayout r1 = r4.A07
            if (r1 == 0) goto L_0x0024
            r0 = r2 ^ 1
            r1.setFitsSystemWindows(r0)
        L_0x0024:
            androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r4.A08
            if (r1 == 0) goto L_0x002d
            r0 = r2 ^ 1
            r1.setFitsSystemWindows(r0)
        L_0x002d:
            r0 = r2 ^ 1
            X.AnonymousClass0Q4.A00(r3, r0)
            X.0NE r0 = r4.A02
            if (r0 == 0) goto L_0x0039
            r0.A04(r3)
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0FL.onAttachedToWindow():void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            if (Build.VERSION.SDK_INT < 23) {
                window.addFlags(67108864);
            }
            window.setLayout(-1, -1);
        }
    }

    public void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.A01;
        if (bottomSheetBehavior != null && bottomSheetBehavior.A0J == 5) {
            bottomSheetBehavior.A0W(4);
        }
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.A03 != z) {
            this.A03 = z;
            BottomSheetBehavior bottomSheetBehavior = this.A01;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.A0d(z);
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.A03) {
            this.A03 = true;
        }
        this.A04 = z;
        this.A05 = true;
    }

    public void setContentView(View view) {
        super.setContentView((View) A00(view, (ViewGroup.LayoutParams) null, 0));
    }

    public void setContentView(int i) {
        super.setContentView((View) A00((View) null, (ViewGroup.LayoutParams) null, i));
    }
}
