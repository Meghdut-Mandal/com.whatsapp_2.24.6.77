package X;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;

/* renamed from: X.06i  reason: invalid class name and case insensitive filesystem */
public abstract class C014606i {
    public static int A01(Context context, int i) {
        TypedValue A01 = C014506h.A01(context, i);
        if (A01 == null) {
            return 0;
        }
        int i2 = A01.resourceId;
        if (i2 != 0) {
            return AnonymousClass00F.A00(context, i2);
        }
        return A01.data;
    }

    public static int A00(float f, int i, int i2) {
        return C018107s.A05(C018107s.A06(i2, Math.round(((float) Color.alpha(i2)) * f)), i);
    }

    public static int A02(View view, int i) {
        Context context = view.getContext();
        TypedValue A02 = C014506h.A02(view.getContext(), view.getClass().getCanonicalName(), i);
        int i2 = A02.resourceId;
        if (i2 != 0) {
            return AnonymousClass00F.A00(context, i2);
        }
        return A02.data;
    }
}
