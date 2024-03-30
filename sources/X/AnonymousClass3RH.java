package X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.3RH  reason: invalid class name */
public abstract class AnonymousClass3RH {
    public static boolean A01(C19420v0 r10, C20810yC r11, C24601Db r12) {
        if (r11.A0E(6819)) {
            String string = r12.A03().getString("pref_income_verification_state", "not_required");
            long A0V = r10.A0V("payments_income_collection_timestamp");
            if (!TextUtils.equals(string, "collected")) {
                if (!TextUtils.equals(string, "pending")) {
                    if (A0V <= 0 || System.currentTimeMillis() >= r10.A0V("payments_income_collection_timestamp")) {
                        r12.A0N("pending");
                    } else {
                        r12.A0N("not_required");
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static AnonymousClass00I A00(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            Object obj = str;
            if (TextUtils.isEmpty(str2)) {
                List asList = Arrays.asList(str.split("\\|"));
                if (asList.size() == 2) {
                    Object A0t = C36391kE.A0t(asList);
                    str2 = TextUtils.join(".", asList);
                    obj = A0t;
                }
            }
            return C36441kJ.A0W(obj, str2);
        }
        return null;
    }
}
