package X;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.15s  reason: invalid class name and case insensitive filesystem */
public class C227715s {
    public final C20810yC A00;
    public final C21510zM A01;
    public final Set A02;

    public static boolean A00(String str, String str2) {
        if (str != null) {
            if (str2.equals("all") || str2.equals("none")) {
                throw new IllegalArgumentException("Name 'none' and 'all' are not supported");
            }
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            String lowerCase2 = str2.toLowerCase(locale);
            String trim = lowerCase.trim();
            if (!TextUtils.isEmpty(trim) && !trim.equals("none")) {
                boolean z = false;
                for (String trim2 : trim.split(";")) {
                    String trim3 = trim2.trim();
                    if (!TextUtils.isEmpty(trim3)) {
                        if (trim3.equals("all")) {
                            z = true;
                        }
                        if (trim3.equals(lowerCase2)) {
                            z = true;
                        }
                        if (trim3.startsWith("-") && lowerCase2.equals(trim3.substring(1))) {
                        }
                    }
                }
                return z;
            }
        }
        return false;
    }

    public C227715s(C20810yC r3, C21510zM r4) {
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet());
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = Collections.unmodifiableSet(new HashSet(unmodifiableSet));
    }
}
