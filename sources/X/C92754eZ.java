package X;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;
import java.util.List;
import java.util.Objects;

/* renamed from: X.4eZ  reason: invalid class name and case insensitive filesystem */
public abstract class C92754eZ extends FrameLayout {
    public static int[] getViewIdsToIgnoreScaling() {
        return new int[]{R.id.logo_button, R.id.play_pause_fullscreen, R.id.loading};
    }

    public void A07() {
        AnonymousClass5NK r2 = (AnonymousClass5NK) this;
        C65083Qq r0 = r2.A0H;
        if (r0 != null) {
            if (r0.A0X()) {
                C124685yd r02 = r2.A0r;
                if (r02 != null) {
                    C128896Ea r1 = r02.A09;
                    if (r1.A01) {
                        r1.A00();
                    }
                }
                r2.A0H.A0A();
            }
            if (!r2.A0B()) {
                r2.A0D();
            }
            r2.removeCallbacks(r2.A0t);
            AnonymousClass5NK.A05(r2);
            r2.A09(500);
        }
    }

    public void A08() {
        AnonymousClass5NK r2 = (AnonymousClass5NK) this;
        C120275rF r1 = r2.A0D;
        if (r1 != null) {
            r1.A00 = true;
            r2.A0D = null;
        }
        r2.A0R = false;
        r2.A0V.removeCallbacksAndMessages(0);
    }

    public void A09(int i) {
        AnonymousClass5NK r3 = (AnonymousClass5NK) this;
        r3.A08();
        C120275rF r1 = new C120275rF(r3);
        r3.A0D = r1;
        Objects.requireNonNull(r1);
        r3.postDelayed(new C1497472p(r1, 7), (long) i);
    }

    public void A0A(int i, int i2) {
        AnonymousClass5NK r3 = (AnonymousClass5NK) this;
        C65083Qq r0 = r3.A0H;
        if (r0 != null && r0.A08() != null) {
            ArgbEvaluator argbEvaluator = new ArgbEvaluator();
            Object[] A0M = AnonymousClass001.A0M();
            C36331k8.A1W(A0M, i);
            AnonymousClass000.A1L(A0M, i2, 1);
            ValueAnimator ofObject = ValueAnimator.ofObject(argbEvaluator, A0M);
            ofObject.setDuration(150);
            C111565cU.A00(ofObject, r3, 39);
            ofObject.start();
        }
    }

    public boolean A0B() {
        View view;
        AnonymousClass5NK r2 = (AnonymousClass5NK) this;
        if (r2.A0M) {
            view = r2.A0k;
        } else {
            view = r2.A0l;
        }
        if (view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public abstract void A0C();

    public abstract void A0D();

    public abstract List getFullscreenControls();

    public abstract List getInlineControls();

    public abstract void setCloseButtonListener(C158607hm r1);

    public abstract void setFullscreenButtonClickListener(C158607hm r1);

    public abstract void setMusicAttributionClickListener(C158607hm r1);

    public abstract void setPlayer(C65083Qq r1);

    public abstract void setPlayerElevation(int i);

    public abstract void setWatchMoreVideosText(String str);

    public C92754eZ(Context context) {
        super(context);
    }
}
