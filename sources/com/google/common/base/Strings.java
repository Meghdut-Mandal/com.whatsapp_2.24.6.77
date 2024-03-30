package com.google.common.base;

import X.AnonymousClass000;
import X.C90464aC;
import X.C90474aD;
import X.C90504aG;
import X.C90524aI;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Strings {
    public static String A00(String str, Object... objArr) {
        int length;
        String valueOf = String.valueOf(str);
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
                    String A0k = AnonymousClass000.A0k(str2);
                    String hexString = Integer.toHexString(System.identityHashCode(str2));
                    StringBuilder A0i = C90464aC.A0i(hexString, C90474aD.A05(A0k) + 1);
                    A0i.append(A0k);
                    String A0f = C90464aC.A0f(hexString, A0i, '@');
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, C90464aC.A0c("Exception during lenientFormat for ", A0f), e);
                    String A0k2 = AnonymousClass000.A0k(e);
                    StringBuilder A0i2 = C90464aC.A0i(A0k2, C90474aD.A05(A0f) + 9);
                    A0i2.append("<");
                    A0i2.append(A0f);
                    A0i2.append(" threw ");
                    A0i2.append(A0k2);
                    str2 = AnonymousClass000.A0q(">", A0i2);
                }
            }
            objArr[i2] = str2;
            i2++;
        }
        int length2 = valueOf.length();
        StringBuilder A0h = C90524aI.A0h((length * 16) + length2);
        int i3 = 0;
        while (i < length) {
            int indexOf = valueOf.indexOf("%s", i3);
            if (indexOf == -1) {
                break;
            }
            A0h.append(valueOf, i3, indexOf);
            A0h.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        A0h.append(valueOf, i3, length2);
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
