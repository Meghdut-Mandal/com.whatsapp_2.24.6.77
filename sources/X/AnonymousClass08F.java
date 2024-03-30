package X;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* renamed from: X.08F  reason: invalid class name */
public abstract class AnonymousClass08F {
    public static void A00(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        C09090bo r0 = C09090bo.A0A;
        if (r0 != null && r0.A05 == view) {
            C09090bo.A00((C09090bo) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            C09090bo r1 = C09090bo.A09;
            if (r1 != null && r1.A05 == view) {
                r1.A01();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new C09090bo(view, charSequence);
    }
}
