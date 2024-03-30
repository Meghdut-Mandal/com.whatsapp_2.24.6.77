package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

/* renamed from: X.061  reason: invalid class name */
public abstract class AnonymousClass061 {
    public static ColorStateList A01(Context context, C010404j r3, int i) {
        int resourceId;
        ColorStateList A00;
        TypedArray typedArray = r3.A02;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (A00 = C013105r.A00(context, resourceId)) == null) {
            return r3.A01(i);
        }
        return A00;
    }

    public static ColorStateList A00(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList A00;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (A00 = C013105r.A00(context, resourceId)) == null) {
            return typedArray.getColorStateList(i);
        }
        return A00;
    }

    public static Drawable A02(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable A08;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (A08 = AnonymousClass02X.A03().A08(context, resourceId)) == null) {
            return typedArray.getDrawable(i);
        }
        return A08;
    }

    public static boolean A03(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }
}
