package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview;

/* renamed from: X.4VJ  reason: invalid class name */
public class AnonymousClass4VJ extends AnimatorListenerAdapter {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public AnonymousClass4VJ(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A03 = obj2;
        this.A00 = obj3;
        this.A01 = obj4;
        this.A02 = obj;
    }

    public void A00(View view) {
        if (view != null) {
            view.animate().setDuration(250).alpha(1.0f).translationY(0.0f).setInterpolator((TimeInterpolator) this.A03).setListener(new AnonymousClass4VL(this, 18));
        }
    }

    public void onAnimationCancel(Animator animator) {
        if (2 - this.A04 != 0) {
            super.onAnimationCancel(animator);
            return;
        }
        super.onAnimationCancel(animator);
        SolidColorWallpaperPreview solidColorWallpaperPreview = ((AnonymousClass3ZW) this.A00).A04;
        C36391kE.A1C(solidColorWallpaperPreview.getResources(), solidColorWallpaperPreview.A05, R.color.f6nameremoved);
        solidColorWallpaperPreview.A0A = false;
        solidColorWallpaperPreview.A09.setScrollEnabled(true);
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.A04) {
            case 0:
                AnonymousClass00C.A0D(animator, 0);
                super.onAnimationEnd(animator);
                View view = (View) this.A00;
                C63793Ll.A00(view);
                View view2 = (View) this.A01;
                C63793Ll.A00(view2);
                View[] viewArr = new View[2];
                viewArr[0] = view;
                C63793Ll.A01(C36341k9.A0m(view2, viewArr, 1));
                view.clearAnimation();
                view2.clearAnimation();
                ((Animator) this.A02).start();
                return;
            case 1:
                AnonymousClass00C.A0D(animator, 0);
                super.onAnimationEnd(animator);
                ((View) this.A01).clearAnimation();
                return;
            default:
                super.onAnimationEnd(animator);
                ((AnonymousClass3ZW) this.A00).A04.A06.animate().setDuration(250).alpha(1.0f).setInterpolator((TimeInterpolator) this.A03);
                A00((View) this.A01);
                A00((View) this.A02);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.A04) {
            case 0:
                AnonymousClass00C.A0D(animator, 0);
                super.onAnimationStart(animator);
                TransitionDrawable transitionDrawable = (TransitionDrawable) this.A03;
                if (transitionDrawable != null) {
                    transitionDrawable.startTransition(500);
                    return;
                }
                return;
            case 1:
                AnonymousClass00C.A0D(animator, 0);
                super.onAnimationStart(animator);
                ((View) this.A01).setAlpha(0.0f);
                ((View) this.A02).setVisibility(0);
                ((View) this.A00).setVisibility(0);
                ((View) this.A03).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
