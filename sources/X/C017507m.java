package X;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.07m  reason: invalid class name and case insensitive filesystem */
public class C017507m extends AnonymousClass055 {
    public ObjectAnimator A0X(View view, ViewGroup viewGroup, AnonymousClass0X9 r7, AnonymousClass0X9 r8) {
        Number number;
        float f = 0.0f;
        float f2 = 0.0f;
        if (!(r7 == null || (number = (Number) r7.A02.get("android:fade:transitionAlpha")) == null)) {
            f2 = number.floatValue();
        }
        if (f2 != 1.0f) {
            f = f2;
        }
        return A01(view, f, 1.0f);
    }

    private ObjectAnimator A01(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        AnonymousClass0W5.A02.A04(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, AnonymousClass0W5.A01, new float[]{f2});
        ofFloat.addListener(new AnonymousClass0DP(view));
        A0A(new C18220so(view, this, 0));
        return ofFloat;
    }

    public ObjectAnimator A0Y(View view, ViewGroup viewGroup, AnonymousClass0X9 r6, AnonymousClass0X9 r7) {
        Property property = AnonymousClass0W5.A00;
        float f = 1.0f;
        Number number = (Number) r6.A02.get("android:fade:transitionAlpha");
        if (number != null) {
            f = number.floatValue();
        }
        return A01(view, f, 0.0f);
    }

    public C017507m(int i) {
        if ((i & -4) == 0) {
            this.A00 = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    public void A0T(AnonymousClass0X9 r4) {
        AnonymousClass055.A02(r4);
        r4.A02.put("android:fade:transitionAlpha", Float.valueOf(AnonymousClass0W5.A02.A00(r4.A00)));
    }

    public C017507m() {
    }
}
