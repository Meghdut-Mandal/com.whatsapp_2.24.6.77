package X;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;

/* renamed from: X.07p  reason: invalid class name and case insensitive filesystem */
public abstract class C017807p {
    public static float A00(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Motion easing control point value must be between 0 and 1; instead got: ");
        sb.append(parseFloat);
        throw new IllegalArgumentException(sb.toString());
    }

    public static TimeInterpolator A01(TimeInterpolator timeInterpolator, Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (!A02(valueOf, "cubic-bezier") && !A02(valueOf, "path")) {
                return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
            }
            if (A02(valueOf, "cubic-bezier")) {
                String[] split = valueOf.substring("cubic-bezier".length() + 1, valueOf.length() - 1).split(",");
                int length = split.length;
                if (length == 4) {
                    return C017907q.A00(A00(split, 0), A00(split, 1), A00(split, 2), A00(split, 3));
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
                sb.append(length);
                throw new IllegalArgumentException(sb.toString());
            } else if (A02(valueOf, "path")) {
                return C017907q.A01(AnonymousClass0YJ.A00(valueOf.substring("path".length() + 1, valueOf.length() - 1)));
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Invalid motion easing type: ");
                sb2.append(valueOf);
                throw new IllegalArgumentException(sb2.toString());
            }
        } else {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
    }

    public static boolean A02(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("(");
        if (!str.startsWith(sb.toString()) || !str.endsWith(")")) {
            return false;
        }
        return true;
    }
}
