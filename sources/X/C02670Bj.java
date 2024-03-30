package X;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0Bj  reason: invalid class name and case insensitive filesystem */
public abstract class C02670Bj {
    public static Integer A00(int i) {
        if (i == 0) {
            return C023109s.A01;
        }
        if (i == 4) {
            return C023109s.A0G;
        }
        if (i == 8) {
            return C023109s.A0C;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown visibility ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static Integer A01(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return C023109s.A0G;
        }
        return A00(view.getVisibility());
    }

    public static void A02(View view, Integer num) {
        int i;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                if (AnonymousClass01z.A0E(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: Setting view ");
                    sb.append(view);
                    sb.append(" to VISIBLE");
                    Log.v("FragmentManager", sb.toString());
                }
                i = 0;
            } else if (intValue != 2) {
                if (AnonymousClass01z.A0E(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: Setting view ");
                    sb2.append(view);
                    sb2.append(" to INVISIBLE");
                    Log.v("FragmentManager", sb2.toString());
                }
                view.setVisibility(4);
                return;
            } else {
                if (AnonymousClass01z.A0E(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: Setting view ");
                    sb3.append(view);
                    sb3.append(" to GONE");
                    Log.v("FragmentManager", sb3.toString());
                }
                i = 8;
            }
            view.setVisibility(i);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            if (AnonymousClass01z.A0E(2)) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("SpecialEffectsController: Removing view ");
                sb4.append(view);
                sb4.append(" from container ");
                sb4.append(viewGroup);
                Log.v("FragmentManager", sb4.toString());
            }
            viewGroup.removeView(view);
        }
    }
}
