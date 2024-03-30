package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.whatsapp.R;
import java.util.Deque;

/* renamed from: X.4aa  reason: invalid class name and case insensitive filesystem */
public final class C90704aa extends Dialog {
    public static final AnonymousClass7eE A0I = AnonymousClass6j6.A00;
    public static final AnonymousClass7eE A0J = new C138996j2();
    public static final AnonymousClass7eE A0K = C139026j7.A00;
    public float A00 = 1.0f;
    public float A01 = 1.0f;
    public int A02 = -16777216;
    public Context A03;
    public FrameLayout A04;
    public AnonymousClass5o0 A05;
    public AnonymousClass7eE A06 = AnonymousClass6j5.A00;
    public AnonymousClass7eE A07 = A0J;
    public C92414du A08;
    public boolean A09 = true;
    public boolean A0A = true;
    public boolean A0B = true;
    public boolean A0C = false;
    public boolean A0D = false;
    public boolean A0E = true;
    public View A0F;
    public final Handler A0G = C36341k9.A0H();
    public final C1267565j A0H = new C1267565j(this);

    public static AnonymousClass7eE[] A02(AnonymousClass7eE r5, AnonymousClass7eE r6) {
        if (r5 == null && r6 == null) {
            return new AnonymousClass7eE[]{A0I};
        } else if (r5 == null) {
            return new AnonymousClass7eE[]{A0I, r6};
        } else if (r6 == null) {
            return new AnonymousClass7eE[]{A0I, r5};
        } else {
            return new AnonymousClass7eE[]{A0I, r5, r6};
        }
    }

    public void show() {
        AnonymousClass7eE r1;
        AccessibilityManager accessibilityManager;
        this.A0C = false;
        C92414du r3 = this.A08;
        r3.A05.A08();
        r3.A0A = true;
        super.show();
        Context context = this.A03;
        if ((!Boolean.getBoolean("is_accessibility_enabled") && (context == null || (accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility")) == null || !accessibilityManager.isTouchExplorationEnabled())) || (r1 = this.A06) == null) {
            r1 = this.A07;
        }
        r3.A03(r1, -1, this.A0D);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C90704aa r5, float r6) {
        /*
            float r4 = r5.A01
            float r4 = r4 * r6
            android.view.Window r0 = r5.getWindow()
            if (r0 == 0) goto L_0x0038
            android.view.View r3 = r0.getDecorView()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r0 = X.C36411kG.A0L(r3)
            if (r0 == 0) goto L_0x0016
            r3 = r0
        L_0x0016:
            int r2 = r5.A02
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            float r0 = java.lang.Math.max(r0, r4)
            float r1 = java.lang.Math.min(r1, r0)
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            int r2 = X.C018107s.A06(r2, r0)
            android.graphics.drawable.Drawable r1 = r3.getBackground()
            boolean r0 = r1 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L_0x0039
            android.graphics.drawable.ColorDrawable r1 = (android.graphics.drawable.ColorDrawable) r1
        L_0x0035:
            r1.setColor(r2)
        L_0x0038:
            return
        L_0x0039:
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            r1.<init>()
            X.C011504z.A04(r1, r3)
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90704aa.A01(X.4aa, float):void");
    }

    public void A04(Integer num) {
        AnonymousClass7fM r0;
        int i;
        AnonymousClass5o0 r02 = this.A05;
        if (r02 != null) {
            C139036j8 r6 = r02.A01;
            Context context = r02.A00;
            if (num != C023109s.A01) {
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue == 2) {
                        i = 4;
                    } else if (intValue == 3) {
                        i = 5;
                    }
                    r6.A00 = i;
                } else {
                    r6.A00 = 3;
                }
            } else {
                C92734eW r03 = r6.A01;
                if (!(r03 == null || r03.getVisibility() == 0)) {
                    r6.A01.setVisibility(0);
                }
                Deque deque = r6.A0A;
                C122045uD r04 = (C122045uD) deque.peek();
                if (r04 != null && (r0 = r04.A01) != null) {
                    C164627s7 r05 = (C164627s7) r0;
                    C100674vP r3 = (C100674vP) r05.A01;
                    C1273868b A002 = C1273868b.A00();
                    A002.A09(r3.A00, 0);
                    C1273868b.A07(r3, A002, (C160377ku) r05.A00);
                } else if (deque.size() > 1) {
                    C139036j8.A01(context, r6);
                } else {
                    C90704aa r06 = r6.A05;
                    if (r06 != null) {
                        r06.dismiss();
                    }
                }
                r6.A00 = 2;
                return;
            }
        }
        super.cancel();
    }

    public void cancel() {
        A04(C023109s.A0R);
    }

    public void onBackPressed() {
        if (this.A0A) {
            A04(C023109s.A01);
        }
    }

    public C90704aa(Context context) {
        super(context, R.style.f13nameremoved);
        Context context2 = getContext();
        this.A03 = context2;
        C92414du r0 = new C92414du(context2);
        this.A08 = r0;
        r0.A0G.add(this.A0H);
        C92414du r4 = this.A08;
        r4.A00 = -1;
        r4.A04(new AnonymousClass7eE[]{A0I, this.A07, this.A06}, true);
        C92414du r1 = this.A08;
        r1.A03 = new C114515hN(this);
        r1.setFitsSystemWindows(true);
        this.A08.A05.A08();
        FrameLayout frameLayout = new FrameLayout(this.A03);
        this.A04 = frameLayout;
        frameLayout.addView(this.A08);
        super.setContentView(this.A04);
        C012005e.A0V(this.A08, new C162457oc(this, 1));
    }

    public static void A00(C90704aa r4) {
        InputMethodManager inputMethodManager;
        Window window = r4.getWindow();
        C92414du r2 = r4.A08;
        if (!r2.hasWindowFocus()) {
            r4.A03();
        }
        if (window != null) {
            window.setFlags(8, 8);
        }
        r4.A0C = true;
        if (!r4.A09 && r4.A01 != 0.0f) {
            r4.A01 = 0.0f;
            A01(r4, r4.A00);
        }
        r2.A05.A08();
        r2.A03(A0I, -1, false);
        r2.setInteractable(false);
        View currentFocus = r4.getCurrentFocus();
        if (currentFocus != null && (inputMethodManager = (InputMethodManager) currentFocus.getContext().getSystemService("input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    public void A03() {
        InputMethodManager inputMethodManager;
        View currentFocus = getCurrentFocus();
        if (!(currentFocus == null || (inputMethodManager = (InputMethodManager) currentFocus.getContext().getSystemService("input_method")) == null)) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
        super.dismiss();
    }

    public void dismiss() {
        Looper myLooper = Looper.myLooper();
        Handler handler = this.A0G;
        if (myLooper == handler.getLooper()) {
            A00(this);
        } else {
            AnonymousClass759.A00(handler, this, 28);
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            return true;
        }
        return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        this.A0A = z;
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        this.A0B = z;
    }

    public void setContentView(int i) {
        setContentView(C36361kB.A0E(LayoutInflater.from(getContext()), this.A08, i), (ViewGroup.LayoutParams) null);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        View view2 = this.A0F;
        if (view2 != null) {
            this.A08.removeView(view2);
        }
        this.A0F = view;
        C92414du r0 = this.A08;
        if (layoutParams == null) {
            r0.addView(view);
        } else {
            r0.addView(view, layoutParams);
        }
    }

    public void setContentView(View view) {
        setContentView(view, (ViewGroup.LayoutParams) null);
    }
}
