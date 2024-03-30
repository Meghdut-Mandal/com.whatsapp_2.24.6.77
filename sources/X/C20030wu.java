package X;

import android.content.res.Configuration;
import android.os.Build;
import java.util.Locale;

/* renamed from: X.0wu  reason: invalid class name and case insensitive filesystem */
public abstract class C20030wu {
    public static Locale A00(Configuration configuration) {
        Locale locale;
        if (Build.VERSION.SDK_INT >= 24) {
            locale = configuration.getLocales().get(0);
        } else {
            locale = configuration.locale;
        }
        if (locale != null) {
            return locale;
        }
        Locale locale2 = Locale.getDefault();
        if (locale2 == null) {
            return Locale.US;
        }
        return locale2;
    }
}
