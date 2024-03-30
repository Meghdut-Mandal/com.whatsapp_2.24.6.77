package X;

import android.view.animation.Animation;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.components.CircularRevealView;

/* renamed from: X.4Wm  reason: invalid class name and case insensitive filesystem */
public class C89424Wm implements Animation.AnimationListener {
    public Object A00;
    public final int A01;

    public C89424Wm(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onAnimationEnd(Animation animation) {
        if (this.A01 != 0) {
            C38911qR r2 = (C38911qR) this.A00;
            r2.A03.setVisibility(8);
            TextView textView = r2.A01;
            textView.setText(R.string.f12nameremoved);
            textView.setVisibility(0);
            r2.A02.setText(R.string.f12nameremoved);
            r2.A04.A04();
            return;
        }
        ((CircularRevealView) this.A00).A09 = false;
    }

    public void onAnimationRepeat(Animation animation) {
        if (this.A01 == 0) {
            ((CircularRevealView) this.A00).A09 = true;
        }
    }

    public void onAnimationStart(Animation animation) {
        if (this.A01 == 0) {
            ((CircularRevealView) this.A00).A09 = true;
        }
    }
}
