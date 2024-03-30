package X;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: X.3Mn  reason: invalid class name and case insensitive filesystem */
public abstract class C64073Mn {
    public static final Pattern A00 = Pattern.compile("[0-9]+");

    public static boolean A00(C20810yC r3, String str) {
        if (!r3.A0E(1458)) {
            return false;
        }
        String A09 = r3.A09(1459);
        if (TextUtils.isEmpty(A09) || TextUtils.isEmpty(str) || !A09.contains(str)) {
            return false;
        }
        return true;
    }
}
