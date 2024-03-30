package X;

import android.os.LocaleList;

/* renamed from: X.5Vq  reason: invalid class name and case insensitive filesystem */
public abstract class C108955Vq {
    public static String A00() {
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        if (adjustedDefault.size() > 0) {
            return adjustedDefault.get(0).toLanguageTag();
        }
        return null;
    }
}
