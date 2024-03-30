package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.5Zu  reason: invalid class name and case insensitive filesystem */
public abstract class C109965Zu {
    public static void A00(View view, C1271967i r7, C140456lc r8, C132376Ti r9) {
        TextView A0O = C36391kE.A0O(view, R.id.text);
        String A0L = C140456lc.A0L(r8);
        if (A0L != null) {
            A0O.setText(A0L);
        }
        View A02 = C012005e.A02(view, R.id.checkbox);
        View A022 = C012005e.A02(view, R.id.wabloks_checkbox);
        if (r8.A0T(41, 0) > 0) {
            float x = A022.getX();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{x, C36441kJ.A00(A022.getResources(), R.dimen.f7nameremoved) + x});
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setRepeatCount(3);
            ofFloat.setRepeatMode(2);
            ofFloat.setDuration(50);
            C111565cU.A00(ofFloat, A022, 10);
            ofFloat.addListener(new C162307oN(A022, x, 0));
            ofFloat.start();
            AnonymousClass3T3.A03(r9.A05);
        }
        C67113Yo.A00(A022, A02, r8, r7, 6);
    }
}
