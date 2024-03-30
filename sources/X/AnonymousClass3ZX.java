package X;

import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.whatsapp.mediaview.MediaViewBaseFragment;

/* renamed from: X.3ZX  reason: invalid class name */
public class AnonymousClass3ZX implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ View A04;
    public final /* synthetic */ AnonymousClass4R6 A05;
    public final /* synthetic */ AnonymousClass2XU A06;

    public AnonymousClass3ZX(View view, AnonymousClass4R6 r2, AnonymousClass2XU r3, int i, int i2, int i3, int i4) {
        this.A06 = r3;
        this.A04 = view;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = i4;
        this.A05 = r2;
    }

    public boolean onPreDraw() {
        View view = this.A04;
        C36351kA.A1D(view, this);
        int[] A1O = C36441kJ.A1O();
        view.getLocationOnScreen(A1O);
        AnonymousClass2XU r3 = this.A06;
        r3.A02 = this.A01 - A1O[0];
        r3.A04 = this.A02 - A1O[1];
        float f = (float) this.A03;
        r3.A01 = f / C36441kJ.A01(view);
        float f2 = (float) this.A00;
        float A022 = f2 / C36441kJ.A02(view);
        r3.A00 = A022;
        float f3 = r3.A01;
        if (f3 < A022) {
            r3.A01 = A022;
            r3.A02 = (int) (((float) r3.A02) - (((C36441kJ.A01(view) * r3.A01) - f) / 2.0f));
        } else {
            r3.A00 = f3;
            r3.A04 = (int) (((float) r3.A04) - (((C36441kJ.A02(view) * r3.A00) - f2) / 2.0f));
        }
        AnonymousClass4R6 r6 = this.A05;
        MediaViewBaseFragment mediaViewBaseFragment = r3.A06;
        r3.A03 = C36341k9.A04(mediaViewBaseFragment.A0a());
        Drawable drawable = r3.A05;
        int[] A1O2 = C36441kJ.A1O();
        // fill-array-data instruction
        A1O2[0] = 0;
        A1O2[1] = 255;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(drawable, "alpha", A1O2);
        ofInt.setDuration(220);
        ofInt.setInterpolator(new AccelerateInterpolator());
        ofInt.start();
        AnonymousClass2UK r10 = mediaViewBaseFragment.A08;
        r10.setPivotX(0.0f);
        r10.setPivotY(0.0f);
        r10.setScaleX(r3.A01);
        r10.setScaleY(r3.A00);
        r10.setTranslationX((float) r3.A02);
        r10.setTranslationY((float) r3.A04);
        View findViewWithTag = mediaViewBaseFragment.A08.findViewWithTag(mediaViewBaseFragment.A1c());
        if (findViewWithTag != null) {
            findViewWithTag.setAlpha(0.0f);
            findViewWithTag.animate().setDuration(110).alpha(1.0f).setInterpolator(new DecelerateInterpolator(2.0f));
        }
        C36431kI.A0L(r10, 220).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setListener(new AnonymousClass4VE(r6, r3, 4));
        return true;
    }
}
