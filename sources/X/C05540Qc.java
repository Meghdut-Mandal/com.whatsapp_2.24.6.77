package X;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;

/* renamed from: X.0Qc  reason: invalid class name and case insensitive filesystem */
public abstract class C05540Qc {
    public static Typeface A00(Configuration configuration, Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT < 31 || (i = configuration.fontWeightAdjustment) == Integer.MAX_VALUE || i == 0 || typeface == null) {
            return null;
        }
        int weight = typeface.getWeight() + configuration.fontWeightAdjustment;
        if (weight < 1) {
            weight = 1;
        } else if (weight > 1000) {
            weight = 1000;
        }
        return Typeface.create(typeface, weight, typeface.isItalic());
    }
}
