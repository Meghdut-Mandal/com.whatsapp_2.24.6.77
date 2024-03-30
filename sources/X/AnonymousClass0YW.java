package X;

import android.app.Activity;
import android.app.ActivityOptions;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;

/* renamed from: X.0YW  reason: invalid class name */
public class AnonymousClass0YW {
    public static C03540Gb A01(Activity activity, AnonymousClass00I... r6) {
        Pair[] pairArr = null;
        if (r6 != null) {
            int length = r6.length;
            pairArr = new Pair[length];
            for (int i = 0; i < length; i++) {
                AnonymousClass00I r0 = r6[i];
                pairArr[i] = Pair.create(r0.A00, r0.A01);
            }
        }
        return new C03540Gb(A00(activity, pairArr));
    }

    public Bundle A03() {
        return null;
    }

    public static AnonymousClass0YW A02() {
        if (Build.VERSION.SDK_INT >= 23) {
            return new C03540Gb(AnonymousClass0PL.A00());
        }
        return new AnonymousClass0YW();
    }

    public static ActivityOptions A00(Activity activity, Pair... pairArr) {
        return ActivityOptions.makeSceneTransitionAnimation(activity, pairArr);
    }
}
