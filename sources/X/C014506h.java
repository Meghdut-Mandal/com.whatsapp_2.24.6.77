package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import com.google.android.material.datepicker.MaterialCalendar;
import com.whatsapp.R;

/* renamed from: X.06h  reason: invalid class name and case insensitive filesystem */
public abstract class C014506h {
    public static TypedValue A01(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean A03(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(A02(context, MaterialCalendar.class.getCanonicalName(), R.attr.f4nameremoved).data, new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    public static int A00(Context context, int i, int i2) {
        TypedValue A01 = A01(context, i);
        if (A01 == null || A01.type != 16) {
            return i2;
        }
        return A01.data;
    }

    public static TypedValue A02(Context context, String str, int i) {
        TypedValue A01 = A01(context, i);
        if (A01 != null) {
            return A01;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)}));
    }

    public static boolean A04(Context context, int i, boolean z) {
        TypedValue A01 = A01(context, i);
        if (A01 == null || A01.type != 18) {
            return z;
        }
        if (A01.data != 0) {
            return true;
        }
        return false;
    }
}
