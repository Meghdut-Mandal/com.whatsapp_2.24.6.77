package X;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: X.5a6  reason: invalid class name and case insensitive filesystem */
public abstract class C110085a6 {
    public static Object A00(Object obj, int i, boolean z) {
        if (obj != null) {
            boolean z2 = false;
            if (i != 1) {
                if (i == 2) {
                    return Long.valueOf(C36431kI.A09(obj));
                }
                if (i == 3) {
                    return Float.valueOf(C36441kJ.A03(obj));
                }
                if (i != 4) {
                    if (i != 5) {
                        Log.d("Whatsapp", AnonymousClass000.A0r("BloksFieldStatParser/parseValue/unknown type/type=", AnonymousClass000.A0u(), i));
                        return null;
                    }
                    String str = (String) obj;
                    if (str != null) {
                        String[] split = TextUtils.split(str, "\\|");
                        int length = split.length;
                        if (length != 2) {
                            Log.d("Whatsapp", AnonymousClass000.A0r("BloksFieldStatParser/parseValue/invalid enum format/length=", AnonymousClass000.A0u(), length));
                            return null;
                        } else if (z) {
                            return split[1];
                        } else {
                            return Integer.valueOf(C129386Gs.A00(split[0]));
                        }
                    }
                }
            } else if (!(obj instanceof Boolean)) {
                if (1 == AnonymousClass000.A0I(obj)) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            }
            return obj;
        }
        return null;
    }
}
