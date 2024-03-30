package X;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6Gs  reason: invalid class name and case insensitive filesystem */
public abstract class C129386Gs {
    public static int A00(String str) {
        if (!(str == null || str.length() == 0)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException e) {
                Log.d("Whatsapp", AnonymousClass000.A0p("NumberUtil/Invalid int value:", str, AnonymousClass000.A0u()), e);
            }
        }
        return -1;
    }

    public static HashMap A01(Map map) {
        HashMap A0J = AnonymousClass001.A0J();
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            C36411kG.A1T(A0J, AnonymousClass000.A11(A0y));
        }
        return A0J;
    }
}
