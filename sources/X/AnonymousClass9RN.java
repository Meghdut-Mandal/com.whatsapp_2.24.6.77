package X;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.9RN  reason: invalid class name */
public final class AnonymousClass9RN {
    public final TextView A00;
    public final C18820ts A01;
    public final String A02;

    public final void A00() {
        TextView textView = this.A00;
        textView.setVisibility(8);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(320);
        textView.startAnimation(alphaAnimation);
    }

    public AnonymousClass9RN(View view, C18820ts r3, String str) {
        C36321k7.A11(r3, view, str);
        this.A01 = r3;
        this.A00 = C36341k9.A0M(view, R.id.update_postcode_tip);
        this.A02 = str;
    }
}
