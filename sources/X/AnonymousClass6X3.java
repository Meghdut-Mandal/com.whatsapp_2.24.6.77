package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;

/* renamed from: X.6X3  reason: invalid class name */
public class AnonymousClass6X3 {
    public int A00;
    public int A01 = 0;
    public ValueAnimator A02;
    public ValueAnimator A03;
    public boolean A04 = true;
    public boolean A05;
    public boolean A06 = true;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public float A0C;
    public final View A0D;
    public final View A0E;
    public final C06570Uc A0F = new C162607or(this, 0);
    public final BottomSheetBehavior A0G;
    public final VoipCallControlBottomSheetV2 A0H;
    public final boolean A0I;
    public final View A0J;
    public final TextView A0K;
    public final AnonymousClass13J A0L;
    public final AnonymousClass1RJ A0M;
    public final boolean A0N;

    public static void A01(AnonymousClass6X3 r7, int i) {
        C81283wl r6 = new C81283wl((Object) r7, i, 16);
        View view = r7.A0D;
        ViewParent parent = view.getParent();
        Handler handler = view.getHandler();
        if (handler != null && handler.hasMessages(1)) {
            C36321k7.A1T("CallControlBottomSheetBehaviorController setBottomSheetState cancelling previous state change request, superseded by ", AnonymousClass000.A0u(), i);
            handler.removeMessages(1);
        }
        if (parent == null || !parent.isLayoutRequested() || !C011304x.A02(view) || handler == null) {
            r6.run();
            return;
        }
        Message obtain = Message.obtain(handler, r6);
        obtain.what = 1;
        handler.sendMessage(obtain);
    }

    public static void A02(AnonymousClass6X3 r3, long j) {
        if (r3.A0G.A0S() > 0) {
            C017607n r2 = new C017607n();
            r2.A06(j);
            r2.A0A(new C162557om(r3, 0));
            C018607y.A02((ViewGroup) r3.A0D, r2);
        }
    }

    public static void A03(AnonymousClass6X3 r4, boolean z) {
        ValueAnimator valueAnimator = r4.A02;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f = 0.0f;
        if (z) {
            f = 1.0f;
        }
        float[] A0v = C90524aI.A0v();
        A0v[0] = r4.A0D.getAlpha();
        A0v[1] = f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(A0v);
        r4.A02 = ofFloat;
        ofFloat.setDuration(200);
        C111565cU.A00(r4.A02, r4, 16);
        r4.A02.addListener(new C162307oN(r4, f, 1));
        r4.A02.start();
    }

    public void A04() {
        long j;
        AnonymousClass1RJ r0;
        if (this.A06) {
            Activity A062 = C36361kB.A06(this.A0D);
            if (Build.VERSION.SDK_INT <= 24 || !A062.isInPictureInPictureMode()) {
                int A002 = AnonymousClass3UE.A00(A062);
                float f = 0.75f;
                if (this.A0N) {
                    f = 0.6f;
                }
                this.A0C = (float) ((int) (f * ((float) A002)));
                int dimensionPixelSize = A062.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                if (this.A0B) {
                    dimensionPixelSize += this.A0J.getMeasuredHeight();
                }
                if (this.A07 && (r0 = this.A0M) != null) {
                    dimensionPixelSize += r0.A01().getMeasuredHeight();
                    TextView textView = this.A0K;
                    if (textView != null && textView.getVisibility() == 0) {
                        dimensionPixelSize += textView.getMeasuredHeight();
                    }
                }
                if (this.A08) {
                    dimensionPixelSize = C36441kJ.A06(A062.getResources(), R.dimen.f7nameremoved, dimensionPixelSize);
                }
                BottomSheetBehavior bottomSheetBehavior = this.A0G;
                if (dimensionPixelSize != bottomSheetBehavior.A0S()) {
                    if (this.A0M != null) {
                        j = 100;
                    } else {
                        j = 500;
                    }
                    A02(this, j);
                    bottomSheetBehavior.A0Y(dimensionPixelSize, false);
                }
            }
        }
    }

    public void A05() {
        if (this.A06) {
            View view = this.A0D;
            view.measure(C90504aG.A08(view.getWidth()), View.MeasureSpec.makeMeasureSpec(0, 0));
            if ((((float) view.getMeasuredHeight()) <= this.A0C && view.getHeight() != view.getMeasuredHeight()) || (((float) view.getMeasuredHeight()) > this.A0C && C36441kJ.A02(view) != this.A0C)) {
                C02460Ak r2 = (C02460Ak) view.getLayoutParams();
                boolean z = this.A07;
                int measuredHeight = view.getMeasuredHeight();
                if (!z) {
                    measuredHeight = Math.min(measuredHeight, (int) this.A0C);
                }
                r2.height = measuredHeight;
                r2.A03 = 0;
                view.setLayoutParams(r2);
            }
            this.A04 = !this.A0B;
        }
    }

    public void A06(TimeInterpolator timeInterpolator, int i, int i2, int i3, int i4) {
        if (this.A06) {
            if (this.A0G.A0J != 4) {
                i = 0;
                i2 = 0;
            }
            float[] A0v = C90524aI.A0v();
            A0v[0] = (float) i3;
            A0v[1] = (float) i4;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(A0v);
            this.A03 = ofFloat;
            ofFloat.setInterpolator(timeInterpolator);
            this.A03.setDuration((long) i);
            this.A03.setStartDelay((long) i2);
            C111565cU.A00(this.A03, this, 15);
            this.A03.start();
        }
    }

    public boolean A07() {
        if (!this.A06 || this.A0G.A0J != 3) {
            return false;
        }
        return true;
    }

    public boolean A08() {
        int i;
        if (this.A06 || (i = this.A01) == 0) {
            i = this.A0G.A0J;
        }
        return AnonymousClass000.A1S(i, 5);
    }

    public AnonymousClass6X3(View view, View view2, TextView textView, C20810yC r6, AnonymousClass13J r7, AnonymousClass1RJ r8, VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        this.A0N = C34681hT.A0M(r6);
        this.A0D = view;
        this.A0J = view2;
        this.A0M = r8;
        this.A0K = textView;
        this.A0G = BottomSheetBehavior.A02(view);
        this.A0H = voipCallControlBottomSheetV2;
        this.A0E = C012005e.A02(view, R.id.bottom_sheet);
        this.A0L = r7;
        this.A0I = r6.A0E(6206);
        this.A0G.A0a(this.A0F);
    }

    public static void A00(AnonymousClass0XL r4, AnonymousClass6X3 r5) {
        int i;
        boolean A1V = AnonymousClass000.A1V(r4);
        r5.A06 = A1V;
        C36321k7.A1X("CallControlBottomSheetBehaviorController setBehavior ", AnonymousClass000.A0u(), A1V);
        View view = r5.A0D;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C02460Ak) {
            C02460Ak r1 = (C02460Ak) layoutParams;
            if (r1.A0B != r4) {
                r1.A00(r4);
                view.setLayoutParams(layoutParams);
                C06570Uc r12 = r5.A0F;
                if (r5.A06 || (i = r5.A01) == 0) {
                    i = r5.A0G.A0J;
                }
                r12.A03(view, i);
                return;
            }
            return;
        }
        throw AnonymousClass001.A08("The view is not a child of CoordinatorLayout");
    }
}
