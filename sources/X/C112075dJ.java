package X;

import android.content.Context;
import android.content.res.Configuration;
import java.util.Locale;

/* renamed from: X.5dJ  reason: invalid class name and case insensitive filesystem */
public abstract class C112075dJ {
    public static Context A00(Context context, String str) {
        String[] split = str.split("_");
        Locale locale = new Locale(str);
        if (split.length == 2) {
            locale = new Locale(split[0], split[1]);
        }
        Locale.setDefault(locale);
        Configuration A0U = AnonymousClass000.A0U(context);
        A0U.setLocale(locale);
        A0U.setLayoutDirection(locale);
        return context.createConfigurationContext(A0U);
    }
}
