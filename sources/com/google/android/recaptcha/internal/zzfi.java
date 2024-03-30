package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.C90504aG;
import X.C90524aI;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzfi {
    public static String zza(String str, Object... objArr) {
        int length;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            String str2 = objArr[i2];
            if (str2 == null) {
                str2 = "null";
            } else {
                try {
                    str2 = str2.toString();
                } catch (Exception e) {
                    String A0p = AnonymousClass000.A0p("@", Integer.toHexString(System.identityHashCode(str2)), AnonymousClass000.A0v(AnonymousClass000.A0k(str2)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(A0p), e);
                    String A0k = AnonymousClass000.A0k(e);
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("<");
                    A0u.append(A0p);
                    A0u.append(" threw ");
                    A0u.append(A0k);
                    str2 = AnonymousClass000.A0q(">", A0u);
                }
            }
            objArr[i2] = str2;
            i2++;
        }
        int length2 = str.length();
        StringBuilder A0h = C90524aI.A0h((length * 16) + length2);
        int i3 = 0;
        while (i < length) {
            int indexOf = str.indexOf("%s", i3);
            if (indexOf == -1) {
                break;
            }
            A0h.append(str, i3, indexOf);
            A0h.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        A0h.append(str, i3, length2);
        if (i < length) {
            A0h.append(" [");
            A0h.append(objArr[i]);
            for (int i4 = i + 1; i4 < length; i4++) {
                C90504aG.A1M(A0h);
                A0h.append(objArr[i4]);
            }
            A0h.append(']');
        }
        return A0h.toString();
    }
}
