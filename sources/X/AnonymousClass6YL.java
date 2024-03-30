package X;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.6YL  reason: invalid class name */
public abstract class AnonymousClass6YL {
    public static final Handler A0M = new Handler(Looper.getMainLooper(), new AnonymousClass0ZX());
    public static final int[] A0N = {R.attr.f4nameremoved};
    public static final TimeInterpolator A0O = AnonymousClass064.A03;
    public static final TimeInterpolator A0P = AnonymousClass064.A04;
    public static final TimeInterpolator A0Q = AnonymousClass064.A02;
    public int A00;
    public int A01;
    public int A02;
    public C09180bx A03;
    public C16120ob A04 = new AnonymousClass0f5(this);
    public List A05;
    public int A06;
    public int A07;
    public int A08;
    public boolean A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final TimeInterpolator A0D;
    public final TimeInterpolator A0E;
    public final TimeInterpolator A0F;
    public final Context A0G;
    public final ViewGroup A0H;
    public final AccessibilityManager A0I;
    public final AnonymousClass0Eq A0J;
    public final C17130qm A0K;
    public final Runnable A0L = new C11360gB(this);

    public static /* synthetic */ void A0D(AnonymousClass6YL r7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setInterpolator(r7.A0D);
        ofFloat.addUpdateListener(new AnonymousClass0QY(r7, 3));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat2.setInterpolator(r7.A0E);
        ofFloat2.addUpdateListener(new AnonymousClass0QY(r7, 4));
        AnimatorSet A0C2 = C36441kJ.A0C();
        Animator[] animatorArr = new Animator[2];
        C36331k8.A1N(ofFloat, ofFloat2, animatorArr);
        A0C2.playTogether(animatorArr);
        A0C2.setDuration((long) r7.A0A);
        A0C2.addListener(new C18060sY(r7, 3));
        A0C2.start();
    }

    public abstract int A0J();

    public void A0N() {
        A0R(3);
    }

    public static /* synthetic */ int A03(AnonymousClass6YL r1) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) r1.A0G.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    private void A0B() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.A0I;
        if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
            this.A0J.post(new C11380gD(this));
            return;
        }
        AnonymousClass0Eq r1 = this.A0J;
        if (r1.getParent() != null) {
            r1.setVisibility(0);
        }
        A0O();
    }

    /* access modifiers changed from: private */
    public void A0C() {
        int i;
        AnonymousClass0Eq r2 = this.A0J;
        ViewGroup.LayoutParams layoutParams = r2.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || r2.A02 == null) {
            Log.w("BaseTransientBottomBar", "Unable to update margins because layout params are not MarginLayoutParams");
        } else if (r2.getParent() != null) {
            C09180bx r0 = this.A03;
            if (r0 == null || r0.A00.get() == null) {
                i = this.A06;
            } else {
                i = this.A01;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Rect rect = r2.A02;
            marginLayoutParams.bottomMargin = rect.bottom + i;
            marginLayoutParams.leftMargin = rect.left + this.A07;
            marginLayoutParams.rightMargin = rect.right + this.A08;
            marginLayoutParams.topMargin = rect.top;
            r2.requestLayout();
            if (Build.VERSION.SDK_INT >= 29 && this.A02 > 0) {
                ViewGroup.LayoutParams layoutParams2 = r2.getLayoutParams();
                if ((layoutParams2 instanceof C02460Ak) && (((C02460Ak) layoutParams2).A0B instanceof SwipeDismissBehavior)) {
                    Runnable runnable = this.A0L;
                    r2.removeCallbacks(runnable);
                    r2.post(runnable);
                }
            }
        }
    }

    public static /* synthetic */ void A0E(AnonymousClass6YL r5) {
        AnonymousClass0Eq r2 = r5.A0J;
        int height = r2.getHeight();
        ViewGroup.LayoutParams layoutParams = r2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        r2.setTranslationY((float) height);
        ValueAnimator valueAnimator = new ValueAnimator();
        int[] A1O = C36441kJ.A1O();
        A1O[0] = height;
        A1O[1] = 0;
        valueAnimator.setIntValues(A1O);
        valueAnimator.setInterpolator(r5.A0F);
        valueAnimator.setDuration((long) r5.A0C);
        valueAnimator.addListener(new C18060sY(r5, 2));
        valueAnimator.addUpdateListener(new AnonymousClass0QY(r5, 5));
        valueAnimator.start();
    }

    public void A0K() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = this.A0J.getRootWindowInsets()) != null) {
            this.A02 = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            A0C();
        }
    }

    public void A0M() {
        if (this.A09) {
            A0B();
            this.A09 = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0Q() {
        /*
            r6 = this;
            X.0Eq r4 = r6.A0J
            android.view.ViewParent r0 = r4.getParent()
            if (r0 != 0) goto L_0x0074
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            boolean r0 = r3 instanceof X.C02460Ak
            if (r0 == 0) goto L_0x0037
            X.0Ak r3 = (X.C02460Ak) r3
            com.google.android.material.snackbar.BaseTransientBottomBar$Behavior r2 = new com.google.android.material.snackbar.BaseTransientBottomBar$Behavior
            r2.<init>()
            X.0Tl r1 = r2.A00
            X.0ob r0 = r6.A04
            r1.A00 = r0
            X.0ex r0 = new X.0ex
            r0.<init>(r6)
            r2.A04 = r0
            r3.A00(r2)
            X.0bx r0 = r6.A03
            if (r0 == 0) goto L_0x0033
            java.lang.ref.WeakReference r0 = r0.A00
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L_0x0037
        L_0x0033:
            r0 = 80
            r3.A04 = r0
        L_0x0037:
            android.view.ViewGroup r5 = r6.A0H
            r0 = 1
            r4.A03 = r0
            r5.addView(r4)
            r0 = 0
            r4.A03 = r0
            X.0bx r0 = r6.A03
            if (r0 == 0) goto L_0x007e
            java.lang.ref.WeakReference r2 = r0.A00
            java.lang.Object r0 = r2.get()
            if (r0 == 0) goto L_0x007e
            r3 = 2
            int[] r1 = new int[r3]
            android.view.View r0 = X.AnonymousClass000.A0Y(r2)
            r0.getLocationOnScreen(r1)
            r2 = 1
            r1 = r1[r2]
            int[] r0 = new int[r3]
            r5.getLocationOnScreen(r0)
            r0 = r0[r2]
            int r0 = X.C36431kI.A04(r5, r0)
            int r0 = r0 - r1
        L_0x0067:
            int r1 = r6.A01
            if (r0 == r1) goto L_0x0070
            r6.A01 = r0
            r6.A0C()
        L_0x0070:
            r0 = 4
            r4.setVisibility(r0)
        L_0x0074:
            boolean r0 = X.C011304x.A03(r4)
            if (r0 == 0) goto L_0x0080
            r6.A0B()
            return
        L_0x007e:
            r0 = 0
            goto L_0x0067
        L_0x0080:
            r0 = 1
            r6.A09 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YL.A0Q():void");
    }

    public final void A0T(int i) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.A0I;
        if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
            AnonymousClass0Eq r1 = this.A0J;
            if (r1.getVisibility() == 0) {
                if (r1.A01 == 1) {
                    float[] A0v = C90524aI.A0v();
                    // fill-array-data instruction
                    A0v[0] = 1065353216;
                    A0v[1] = 0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(A0v);
                    ofFloat.setInterpolator(this.A0D);
                    ofFloat.addUpdateListener(new AnonymousClass0QY(this, 3));
                    ofFloat.setDuration((long) this.A0B);
                    ofFloat.addListener(new C18030sV(this, i, 0));
                    ofFloat.start();
                    return;
                }
                ValueAnimator valueAnimator = new ValueAnimator();
                int[] A1O = C36441kJ.A1O();
                A1O[0] = 0;
                int height = r1.getHeight();
                ViewGroup.LayoutParams layoutParams = r1.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                }
                A1O[1] = height;
                valueAnimator.setIntValues(A1O);
                valueAnimator.setInterpolator(this.A0F);
                valueAnimator.setDuration((long) this.A0C);
                valueAnimator.addListener(new C18030sV(this, i, 1));
                valueAnimator.addUpdateListener(new AnonymousClass0QY(this, 6));
                valueAnimator.start();
                return;
            }
        }
        A0S(i);
    }

    public void A0U(View view) {
        C09180bx r1;
        C09180bx r0 = this.A03;
        if (r0 != null) {
            r0.A00();
        }
        if (view == null) {
            r1 = null;
        } else {
            r1 = new C09180bx(view, this);
            if (C011304x.A02(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(r1);
            }
            view.addOnAttachStateChangeListener(r1);
        }
        this.A03 = r1;
    }

    public void A0V(C06320Td r2) {
        if (r2 != null) {
            List list = this.A05;
            if (list == null) {
                list = AnonymousClass001.A0I();
                this.A05 = list;
            }
            list.add(r2);
        }
    }

    public AnonymousClass6YL(Context context, View view, ViewGroup viewGroup, C17130qm r9) {
        if (view == null) {
            throw AnonymousClass001.A08("Transient bottom bar must have non-null content");
        } else if (r9 != null) {
            this.A0H = viewGroup;
            this.A0K = r9;
            this.A0G = context;
            C013205s.A04(context, "Theme.AppCompat", C013205s.A00);
            LayoutInflater from = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = this.A0G.obtainStyledAttributes(A0N);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            AnonymousClass0Eq r2 = (AnonymousClass0Eq) from.inflate(resourceId != -1 ? R.layout.f9nameremoved : R.layout.f9nameremoved, viewGroup, false);
            this.A0J = r2;
            r2.setBaseTransientBottomBar(this);
            if (view instanceof SnackbarContentLayout) {
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
                float f = r2.A07;
                if (f != 1.0f) {
                    snackbarContentLayout.A01.setTextColor(C014606i.A00(f, C014606i.A02(snackbarContentLayout, R.attr.f4nameremoved), snackbarContentLayout.A01.getCurrentTextColor()));
                }
                snackbarContentLayout.A00 = r2.A09;
            }
            r2.addView(view);
            C011304x.A01(r2, 1);
            C011504z.A06(r2, 1);
            r2.setFitsSystemWindows(true);
            C011004s.A07(r2, new C18540tK(this, 3));
            C012005e.A0V(r2, new C18120se(this, 10));
            this.A0I = (AccessibilityManager) context.getSystemService("accessibility");
            this.A0C = C014506h.A00(context, R.attr.f4nameremoved, 250);
            this.A0A = C014506h.A00(context, R.attr.f4nameremoved, 150);
            this.A0B = C014506h.A00(context, R.attr.f4nameremoved, 75);
            this.A0D = C017807p.A01(A0O, context, R.attr.f4nameremoved);
            this.A0E = C017807p.A01(A0P, context, R.attr.f4nameremoved);
            this.A0F = C017807p.A01(A0Q, context, R.attr.f4nameremoved);
        } else {
            throw AnonymousClass001.A08("Transient bottom bar must have non-null callback");
        }
    }

    public static /* synthetic */ int A04(AnonymousClass6YL r3) {
        int[] A1O = C36441kJ.A1O();
        AnonymousClass0Eq r1 = r3.A0J;
        r1.getLocationOnScreen(A1O);
        return C36431kI.A04(r1, A1O[1]);
    }

    public void A0L() {
        boolean z;
        C133126Ww A002 = C133126Ww.A00();
        C16120ob r2 = this.A04;
        synchronized (A002.A03) {
            if (!C133126Ww.A03(r2, A002)) {
                C121055sW r0 = A002.A01;
                if (r0 == null || r2 == null || r0.A02.get() != r2) {
                    z = false;
                }
            }
            z = true;
        }
        if (z) {
            A0M.post(new C11370gC(this));
        }
    }

    public void A0O() {
        C133126Ww A002 = C133126Ww.A00();
        C16120ob r0 = this.A04;
        synchronized (A002.A03) {
            if (C133126Ww.A03(r0, A002)) {
                C133126Ww.A01(A002.A00, A002);
            }
        }
        List list = this.A05;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    this.A05.get(size);
                } else {
                    return;
                }
            }
        }
    }

    public void A0P() {
        C133126Ww A002 = C133126Ww.A00();
        int A0J2 = A0J();
        C16120ob r3 = this.A04;
        synchronized (A002.A03) {
            if (C133126Ww.A03(r3, A002)) {
                C121055sW r1 = A002.A00;
                r1.A01 = A0J2;
                A002.A02.removeCallbacksAndMessages(r1);
                C133126Ww.A01(A002.A00, A002);
            } else {
                C121055sW r12 = A002.A01;
                if (r12 == null || r3 == null || r12.A02.get() != r3) {
                    A002.A01 = new C121055sW(r3, A0J2);
                } else {
                    r12.A01 = A0J2;
                }
                C121055sW r13 = A002.A00;
                if (r13 == null || !C133126Ww.A04(r13, A002, 4)) {
                    A002.A00 = null;
                    C133126Ww.A02(A002);
                }
            }
        }
    }

    public void A0R(int i) {
        C133126Ww A002 = C133126Ww.A00();
        C16120ob r3 = this.A04;
        synchronized (A002.A03) {
            if (C133126Ww.A03(r3, A002)) {
                C133126Ww.A04(A002.A00, A002, i);
            } else {
                C121055sW r1 = A002.A01;
                if (!(r1 == null || r3 == null || r1.A02.get() != r3)) {
                    C133126Ww.A04(r1, A002, i);
                }
            }
        }
    }

    public void A0S(int i) {
        C133126Ww A002 = C133126Ww.A00();
        C16120ob r0 = this.A04;
        synchronized (A002.A03) {
            if (C133126Ww.A03(r0, A002)) {
                A002.A00 = null;
                if (A002.A01 != null) {
                    C133126Ww.A02(A002);
                }
            }
        }
        List list = this.A05;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((C06320Td) this.A05.get(size)).A00(this, i);
            }
        }
        AnonymousClass0Eq r2 = this.A0J;
        ViewParent parent = r2.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(r2);
        }
    }

    public boolean A0W() {
        boolean A032;
        C133126Ww A002 = C133126Ww.A00();
        C16120ob r0 = this.A04;
        synchronized (A002.A03) {
            A032 = C133126Ww.A03(r0, A002);
        }
        return A032;
    }
}
