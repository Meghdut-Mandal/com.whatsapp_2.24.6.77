package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;

/* renamed from: X.07r  reason: invalid class name and case insensitive filesystem */
public class C018007r extends AnonymousClass054 {
    public Animator A04(ViewGroup viewGroup, AnonymousClass0X9 r9, AnonymousClass0X9 r10) {
        float f;
        if (r9 == null || r10 == null || !(r9.A00 instanceof TextView)) {
            return null;
        }
        View view = r10.A00;
        if (!(view instanceof TextView)) {
            return null;
        }
        Map map = r9.A02;
        Map map2 = r10.A02;
        float f2 = 1.0f;
        if (map.get("android:textscale:scale") != null) {
            f = ((Number) map.get("android:textscale:scale")).floatValue();
        } else {
            f = 1.0f;
        }
        if (map2.get("android:textscale:scale") != null) {
            f2 = ((Number) map2.get("android:textscale:scale")).floatValue();
        }
        if (f == f2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        ofFloat.addUpdateListener(new AnonymousClass0HY(view, this, 1));
        return ofFloat;
    }

    public void A0S(AnonymousClass0X9 r4) {
        View view = r4.A00;
        if (view instanceof TextView) {
            r4.A02.put("android:textscale:scale", Float.valueOf(view.getScaleX()));
        }
    }

    public void A0T(AnonymousClass0X9 r4) {
        View view = r4.A00;
        if (view instanceof TextView) {
            r4.A02.put("android:textscale:scale", Float.valueOf(view.getScaleX()));
        }
    }
}
