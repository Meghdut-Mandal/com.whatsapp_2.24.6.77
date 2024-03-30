package X;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import com.whatsapp.calling.views.CallResponseLayout;

/* renamed from: X.4kJ  reason: invalid class name and case insensitive filesystem */
public class C95254kJ extends AnonymousClass0V6 {
    public int A00;
    public int A01;
    public final /* synthetic */ CallResponseLayout A02;

    public C95254kJ(CallResponseLayout callResponseLayout) {
        this.A02 = callResponseLayout;
    }

    public int A04(View view, int i, int i2) {
        CallResponseLayout callResponseLayout = this.A02;
        int paddingTop = callResponseLayout.getPaddingTop();
        return Math.min(Math.max(i, paddingTop), callResponseLayout.getHeight() - view.getHeight());
    }

    public void A06(View view, float f, float f2) {
        AnonymousClass7gJ r0;
        CallResponseLayout callResponseLayout = this.A02;
        AccessibilityManager A0M = callResponseLayout.A03.A0M();
        if (A0M == null || !A0M.isTouchExplorationEnabled()) {
            if (this.A01 - view.getTop() > callResponseLayout.getHeight() / 3 && (r0 = callResponseLayout.A02) != null) {
                r0.BSk();
                if (!callResponseLayout.A07) {
                    return;
                }
            }
            callResponseLayout.A09.A0E(this.A00, this.A01);
            if (callResponseLayout.A06) {
                callResponseLayout.A01.startAnimation(AnonymousClass3UE.A03(callResponseLayout.A01));
                callResponseLayout.A00.setVisibility(0);
            }
            callResponseLayout.invalidate();
            return;
        }
        callResponseLayout.A02.BSk();
    }

    public void A08(View view, int i, int i2, int i3, int i4) {
        CallResponseLayout callResponseLayout = this.A02;
        if (!callResponseLayout.A06 && this.A01 - view.getTop() > callResponseLayout.A08.getScaledTouchSlop() && callResponseLayout.A00.getVisibility() == 0) {
            callResponseLayout.A00.clearAnimation();
            callResponseLayout.A00.setVisibility(4);
        }
    }

    public boolean A09(View view, int i) {
        return C36361kB.A1a(view, this.A02.A01);
    }

    public int A03(View view, int i, int i2) {
        return view.getLeft();
    }

    public void A07(View view, int i) {
        this.A00 = view.getLeft();
        this.A01 = view.getTop();
        CallResponseLayout callResponseLayout = this.A02;
        if (callResponseLayout.A06) {
            callResponseLayout.A01.setAnimation((Animation) null);
            callResponseLayout.A00.setVisibility(8);
        }
    }
}
