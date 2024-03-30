package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import java.util.ArrayList;

/* renamed from: X.07D  reason: invalid class name */
public class AnonymousClass07D extends AnonymousClass07B implements AnonymousClass07C {
    public static final Interpolator A0R = new AccelerateInterpolator();
    public static final Interpolator A0S = new DecelerateInterpolator();
    public Context A00;
    public AnonymousClass0FU A01;
    public ActionBarContextView A02;
    public boolean A03;
    public int A04 = 0;
    public View A05;
    public C021809f A06;
    public AnonymousClass0V9 A07;
    public AnonymousClass0UU A08;
    public ActionBarContainer A09;
    public ActionBarOverlayLayout A0A;
    public AnonymousClass07I A0B;
    public boolean A0C = true;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public Activity A0H;
    public Context A0I;
    public ArrayList A0J = new ArrayList();
    public ArrayList A0K = new ArrayList();
    public boolean A0L;
    public boolean A0M;
    public boolean A0N = true;
    public final C17190qs A0O = new C18140sg(this, 1);
    public final C17190qs A0P = new C18140sg(this, 2);
    public final C15750nv A0Q = new C09790cw(this);

    public void A0M(Drawable drawable) {
        AnonymousClass07J r0 = (AnonymousClass07J) this.A0B;
        r0.A04 = null;
        AnonymousClass07J.A00(r0);
    }

    public void A0U(boolean z) {
        int i = 0;
        if (z) {
            i = 4;
        }
        A0b(i, 4);
    }

    public void A0W(boolean z) {
        int i = 0;
        if (z) {
            i = 2;
        }
        A0b(i, 2);
    }

    public static void A02(AnonymousClass07D r8, boolean z) {
        boolean z2;
        View view;
        View view2;
        View view3;
        boolean z3 = r8.A03;
        boolean z4 = r8.A0D;
        if (r8.A0G || (!z3 && !z4)) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = r8.A0N;
        if (z2) {
            if (!z5) {
                r8.A0N = true;
                AnonymousClass0UU r0 = r8.A08;
                if (r0 != null) {
                    r0.A00();
                }
                r8.A09.setVisibility(0);
                if (r8.A04 != 0 || (!r8.A0F && !z)) {
                    r8.A09.setAlpha(1.0f);
                    r8.A09.setTranslationY(0.0f);
                    if (r8.A0C && (view2 = r8.A05) != null) {
                        view2.setTranslationY(0.0f);
                    }
                    r8.A0P.BR7((View) null);
                } else {
                    r8.A09.setTranslationY(0.0f);
                    float f = (float) (-r8.A09.getHeight());
                    if (z) {
                        int[] iArr = {0, 0};
                        r8.A09.getLocationInWindow(iArr);
                        f -= (float) iArr[1];
                    }
                    r8.A09.setTranslationY(f);
                    AnonymousClass0UU r3 = new AnonymousClass0UU();
                    AnonymousClass0V7 A072 = C012005e.A07(r8.A09);
                    A072.A06(0.0f);
                    C15750nv r5 = r8.A0Q;
                    View view4 = (View) A072.A00.get();
                    if (view4 != null) {
                        AnonymousClass0HY r1 = null;
                        if (r5 != null) {
                            r1 = new AnonymousClass0HY(view4, r5, 0);
                        }
                        A00(r1, view4.animate());
                    }
                    if (!r3.A03) {
                        r3.A04.add(A072);
                    }
                    if (r8.A0C && (view3 = r8.A05) != null) {
                        view3.setTranslationY(f);
                        AnonymousClass0V7 A073 = C012005e.A07(view3);
                        A073.A06(0.0f);
                        if (!r3.A03) {
                            r3.A04.add(A073);
                        }
                    }
                    Interpolator interpolator = A0S;
                    boolean z6 = r3.A03;
                    if (!z6) {
                        r3.A01 = interpolator;
                        r3.A00 = 250;
                    }
                    C17190qs r02 = r8.A0P;
                    if (!z6) {
                        r3.A02 = r02;
                    }
                    r8.A08 = r3;
                    r3.A01();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = r8.A0A;
                if (actionBarOverlayLayout != null) {
                    AnonymousClass09G.A00(actionBarOverlayLayout);
                }
            }
        } else if (z5) {
            r8.A0N = false;
            AnonymousClass0UU r03 = r8.A08;
            if (r03 != null) {
                r03.A00();
            }
            if (r8.A04 != 0 || (!r8.A0F && !z)) {
                r8.A0O.BR7((View) null);
                return;
            }
            r8.A09.setAlpha(1.0f);
            r8.A09.setTransitioning(true);
            AnonymousClass0UU r32 = new AnonymousClass0UU();
            float f2 = (float) (-r8.A09.getHeight());
            if (z) {
                int[] iArr2 = {0, 0};
                r8.A09.getLocationInWindow(iArr2);
                f2 -= (float) iArr2[1];
            }
            AnonymousClass0V7 A074 = C012005e.A07(r8.A09);
            A074.A06(f2);
            C15750nv r4 = r8.A0Q;
            View view5 = (View) A074.A00.get();
            if (view5 != null) {
                AnonymousClass0HY r12 = null;
                if (r4 != null) {
                    r12 = new AnonymousClass0HY(view5, r4, 0);
                }
                A00(r12, view5.animate());
            }
            if (!r32.A03) {
                r32.A04.add(A074);
            }
            if (r8.A0C && (view = r8.A05) != null) {
                AnonymousClass0V7 A075 = C012005e.A07(view);
                A075.A06(f2);
                if (!r32.A03) {
                    r32.A04.add(A075);
                }
            }
            Interpolator interpolator2 = A0R;
            boolean z7 = r32.A03;
            if (!z7) {
                r32.A01 = interpolator2;
                r32.A00 = 250;
            }
            C17190qs r04 = r8.A0O;
            if (!z7) {
                r32.A02 = r04;
            }
            r8.A08 = r32;
            r32.A01();
        }
    }

    public float A08() {
        return C011004s.A00(this.A09);
    }

    public int A09() {
        return ((AnonymousClass07J) this.A0B).A01;
    }

    public Context A0A() {
        Context context = this.A0I;
        if (context == null) {
            TypedValue typedValue = new TypedValue();
            this.A00.getTheme().resolveAttribute(R.attr.f4nameremoved, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                context = new ContextThemeWrapper(this.A00, i);
            } else {
                context = this.A00;
            }
            this.A0I = context;
        }
        return context;
    }

    public View A0B() {
        return ((AnonymousClass07J) this.A0B).A06;
    }

    public AnonymousClass0V9 A0C(C021809f r4) {
        AnonymousClass0FU r0 = this.A01;
        if (r0 != null) {
            r0.A05();
        }
        this.A0A.setHideOnContentScrollEnabled(false);
        this.A02.A04();
        AnonymousClass0FU r2 = new AnonymousClass0FU(this.A02.getContext(), this, r4);
        C016307a r1 = r2.A02;
        r1.A07();
        try {
            if (!r2.A00.BUq(r1, r2)) {
                return null;
            }
            this.A01 = r2;
            r2.A06();
            this.A02.A05(r2);
            A0c(true);
            this.A02.sendAccessibilityEvent(32);
            return r2;
        } finally {
            r1.A06();
        }
    }

    public void A0D() {
        if (!this.A03) {
            this.A03 = true;
            A02(this, false);
        }
    }

    public void A0E() {
        if (this.A03) {
            this.A03 = false;
            A02(this, false);
        }
    }

    public void A0F(float f) {
        C011004s.A05(this.A09, f);
    }

    public void A0G(int i) {
        AnonymousClass07J r3 = (AnonymousClass07J) this.A0B;
        r3.BrJ(AnonymousClass02X.A03().A08(r3.A09.getContext(), R.drawable.ic_pip_close));
    }

    public void A0H(int i) {
        A0P(this.A00.getString(i));
    }

    public void A0I(int i) {
        A0Q(this.A00.getString(i));
    }

    public void A0J(Configuration configuration) {
        new AnonymousClass0SG(this.A00).A00.getResources().getBoolean(R.bool.f5nameremoved);
        this.A09.setTabContainer((C03430Ew) null);
        ((AnonymousClass07J) this.A0B).A09.setCollapsible(false);
        this.A0A.A05 = false;
    }

    public void A0K(Drawable drawable) {
        this.A09.setPrimaryBackground(drawable);
    }

    public void A0L(Drawable drawable) {
        this.A0B.BrJ(drawable);
    }

    public void A0N(View view) {
        this.A0B.Bqi(view);
    }

    public void A0P(CharSequence charSequence) {
        this.A0B.BsP(charSequence);
    }

    public void A0Q(CharSequence charSequence) {
        this.A0B.BsU(charSequence);
    }

    public void A0R(CharSequence charSequence) {
        this.A0B.setWindowTitle(charSequence);
    }

    public void A0S(boolean z) {
        if (z != this.A0M) {
            this.A0M = z;
            ArrayList arrayList = this.A0J;
            if (0 < arrayList.size()) {
                arrayList.get(0);
                throw new NullPointerException("onMenuVisibilityChanged");
            }
        }
    }

    public void A0T(boolean z) {
        if (!this.A0L) {
            A0U(z);
        }
    }

    public void A0V(boolean z) {
        A0b(16, 16);
    }

    public void A0X(boolean z) {
        int i = 0;
        if (z) {
            i = 8;
        }
        A0b(i, 8);
    }

    public void A0Y(boolean z) {
        AnonymousClass0UU r0;
        this.A0F = z;
        if (!z && (r0 = this.A08) != null) {
            r0.A00();
        }
    }

    public boolean A0Z() {
        C09430cM r0;
        C018707z r02;
        AnonymousClass07I r03 = this.A0B;
        if (r03 == null || (r0 = ((AnonymousClass07J) r03).A09.A0B) == null || (r02 = r0.A01) == null) {
            return false;
        }
        r02.collapseActionView();
        return true;
    }

    public boolean A0a(int i, KeyEvent keyEvent) {
        AnonymousClass0FU r0 = this.A01;
        if (r0 == null) {
            return false;
        }
        C016307a r2 = r0.A02;
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() == 1) {
            z = false;
        }
        r2.setQwertyMode(z);
        return r2.performShortcut(i, keyEvent, 0);
    }

    public void A0b(int i, int i2) {
        AnonymousClass07I r2 = this.A0B;
        int i3 = ((AnonymousClass07J) r2).A01;
        if ((i2 & 4) != 0) {
            this.A0L = true;
        }
        r2.Bqm((i & i2) | ((~i2) & i3));
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0c(boolean r9) {
        /*
            r8 = this;
            boolean r0 = r8.A0G
            if (r9 == 0) goto L_0x00d4
            if (r0 != 0) goto L_0x000d
            r0 = 1
            r8.A0G = r0
            r0 = 0
        L_0x000a:
            A02(r8, r0)
        L_0x000d:
            androidx.appcompat.widget.ActionBarContainer r0 = r8.A09
            boolean r0 = X.C011304x.A03(r0)
            r4 = 8
            r3 = 0
            if (r0 == 0) goto L_0x00db
            X.07I r7 = r8.A0B
            if (r9 == 0) goto L_0x0098
            r4 = 4
            r0 = 100
            X.07J r7 = (X.AnonymousClass07J) r7
            androidx.appcompat.widget.Toolbar r2 = r7.A09
            X.0V7 r6 = X.C012005e.A07(r2)
            r5 = 0
            r6.A02(r5)
            r6.A07(r0)
            X.0Gx r0 = new X.0Gx
            r0.<init>(r7, r4)
            r6.A09(r0)
            androidx.appcompat.widget.ActionBarContextView r4 = r8.A02
            r0 = 200(0xc8, double:9.9E-322)
            X.0V7 r2 = r4.A03
            if (r2 == 0) goto L_0x0041
            r2.A00()
        L_0x0041:
            int r2 = r4.getVisibility()
            if (r2 == 0) goto L_0x004a
            r4.setAlpha(r5)
        L_0x004a:
            X.0V7 r5 = X.C012005e.A07(r4)
            r2 = 1065353216(0x3f800000, float:1.0)
            r5.A02(r2)
            r5.A07(r0)
            X.0cv r1 = r4.A0J
            androidx.appcompat.widget.ActionBarContextView r0 = r1.A02
            r0.A03 = r5
            r1.A00 = r3
            r5.A09(r1)
        L_0x0061:
            X.0UU r4 = new X.0UU
            r4.<init>()
            java.util.ArrayList r3 = r4.A04
            r3.add(r6)
            java.lang.ref.WeakReference r0 = r6.A00
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x0095
            android.view.ViewPropertyAnimator r0 = r0.animate()
            long r1 = r0.getDuration()
        L_0x007d:
            java.lang.ref.WeakReference r0 = r5.A00
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x008e
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.setStartDelay(r1)
        L_0x008e:
            r3.add(r5)
            r4.A01()
            return
        L_0x0095:
            r1 = 0
            goto L_0x007d
        L_0x0098:
            r1 = 200(0xc8, double:9.9E-322)
            X.07J r7 = (X.AnonymousClass07J) r7
            androidx.appcompat.widget.Toolbar r0 = r7.A09
            X.0V7 r5 = X.C012005e.A07(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.A02(r0)
            r5.A07(r1)
            X.0Gx r0 = new X.0Gx
            r0.<init>(r7, r3)
            r5.A09(r0)
            androidx.appcompat.widget.ActionBarContextView r3 = r8.A02
            r1 = 100
            X.0V7 r0 = r3.A03
            if (r0 == 0) goto L_0x00bd
            r0.A00()
        L_0x00bd:
            r0 = 0
            X.0V7 r6 = X.C012005e.A07(r3)
            r6.A02(r0)
            r6.A07(r1)
            X.0cv r1 = r3.A0J
            androidx.appcompat.widget.ActionBarContextView r0 = r1.A02
            r0.A03 = r6
            r1.A00 = r4
            r6.A09(r1)
            goto L_0x0061
        L_0x00d4:
            if (r0 == 0) goto L_0x000d
            r0 = 0
            r8.A0G = r0
            goto L_0x000a
        L_0x00db:
            X.07I r0 = r8.A0B
            if (r9 == 0) goto L_0x00ed
            r1 = 4
            X.07J r0 = (X.AnonymousClass07J) r0
            androidx.appcompat.widget.Toolbar r0 = r0.A09
            r0.setVisibility(r1)
            androidx.appcompat.widget.ActionBarContextView r0 = r8.A02
            r0.setVisibility(r3)
            return
        L_0x00ed:
            X.07J r0 = (X.AnonymousClass07J) r0
            androidx.appcompat.widget.Toolbar r0 = r0.A09
            r0.setVisibility(r3)
            androidx.appcompat.widget.ActionBarContextView r0 = r8.A02
            r0.setVisibility(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass07D.A0c(boolean):void");
    }

    public AnonymousClass07D(Activity activity, boolean z) {
        this.A0H = activity;
        View decorView = activity.getWindow().getDecorView();
        A01(decorView);
        if (!z) {
            this.A05 = decorView.findViewById(16908290);
        }
    }

    private void A01(View view) {
        String str;
        AnonymousClass07I wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.A0A = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof AnonymousClass07I) {
            wrapper = (AnonymousClass07I) findViewById;
        } else if (findViewById instanceof Toolbar) {
            wrapper = ((Toolbar) findViewById).getWrapper();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't make a decor toolbar out of ");
            if (findViewById != null) {
                str = findViewById.getClass().getSimpleName();
            } else {
                str = "null";
            }
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
        this.A0B = wrapper;
        this.A02 = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.A09 = actionBarContainer;
        AnonymousClass07I r1 = this.A0B;
        if (r1 == null || this.A02 == null || actionBarContainer == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass().getSimpleName());
            sb2.append(" can only be used with a compatible window decor layout");
            throw new IllegalStateException(sb2.toString());
        }
        Context context = ((AnonymousClass07J) r1).A09.getContext();
        this.A00 = context;
        if ((((AnonymousClass07J) this.A0B).A01 & 4) != 0) {
            this.A0L = true;
        }
        Context context2 = new AnonymousClass0SG(context).A00;
        context2.getApplicationInfo();
        context2.getResources().getBoolean(R.bool.f5nameremoved);
        this.A09.setTabContainer((C03430Ew) null);
        ((AnonymousClass07J) this.A0B).A09.setCollapsible(false);
        this.A0A.A05 = false;
        TypedArray obtainStyledAttributes = this.A00.obtainStyledAttributes((AttributeSet) null, AnonymousClass1MJ.A00, R.attr.f4nameremoved, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.A0A;
            if (actionBarOverlayLayout2.A06) {
                this.A0E = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            A0F((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public void A0O(View view, C013405v r3) {
        view.setLayoutParams(r3);
        this.A0B.Bqi(view);
    }

    public static void A00(ValueAnimator.AnimatorUpdateListener animatorUpdateListener, ViewPropertyAnimator viewPropertyAnimator) {
        viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
    }

    public AnonymousClass07D(Dialog dialog) {
        A01(dialog.getWindow().getDecorView());
    }
}
