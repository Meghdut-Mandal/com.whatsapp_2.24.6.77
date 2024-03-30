package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.status.playback.MessageReplyActivity;
import com.whatsapp.textstatuscomposer.TextStatusComposerActivity;

/* renamed from: X.4VI  reason: invalid class name */
public class AnonymousClass4VI extends AnimatorListenerAdapter {
    public int A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4VI(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    public static void A00(TextStatusComposerActivity textStatusComposerActivity, float f, float f2, int i) {
        textStatusComposerActivity.A06.animate().translationY(f).alpha(f2).setDuration((long) 200).setListener(new AnonymousClass4VI(textStatusComposerActivity, i, 4));
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.A02) {
            case 0:
                AnonymousClass2HA r2 = (AnonymousClass2HA) this.A01;
                ViewGroup.LayoutParams layoutParams = r2.getLayoutParams();
                int i = this.A00;
                layoutParams.height = i;
                r2.setLayoutParams(layoutParams);
                if (i == 0) {
                    r2.setVisibility(8);
                    r2.A07(false);
                    return;
                }
                return;
            case 2:
            case 5:
                View view = (View) this.A01;
                int i2 = this.A00;
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = i2;
                    view.setLayoutParams(layoutParams2);
                }
                view.setAlpha(1.0f);
                return;
            case 3:
                ((MessageReplyActivity) this.A01).A03.setBackgroundColor(this.A00);
                return;
            case 4:
                super.onAnimationEnd(animator);
                TextStatusComposerActivity textStatusComposerActivity = (TextStatusComposerActivity) this.A01;
                textStatusComposerActivity.A06.clearAnimation();
                ViewGroup viewGroup = textStatusComposerActivity.A06;
                int i3 = this.A00;
                viewGroup.setVisibility(i3);
                if (i3 == 0) {
                    textStatusComposerActivity.A08.post(C81183wb.A00(this, 22));
                    return;
                }
                ViewGroup.LayoutParams layoutParams3 = textStatusComposerActivity.A06.getLayoutParams();
                if (layoutParams3.height != -2) {
                    layoutParams3.width = -1;
                    layoutParams3.height = -2;
                    textStatusComposerActivity.A06.setLayoutParams(layoutParams3);
                    textStatusComposerActivity.A06.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.A02) {
            case 0:
                AnonymousClass2HA r1 = (AnonymousClass2HA) this.A01;
                if (r1.getVisibility() != 0) {
                    AnonymousClass2HA.A02(r1);
                    r1.setVisibility(0);
                    r1.A07(true);
                    return;
                }
                return;
            case 1:
                View view = (View) this.A01;
                int i = this.A00;
                ViewGroup.MarginLayoutParams A0N = C36411kG.A0N(view);
                A0N.topMargin = i;
                view.setLayoutParams(A0N);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
