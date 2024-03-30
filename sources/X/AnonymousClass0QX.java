package X;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.0QX  reason: invalid class name */
public abstract class AnonymousClass0QX {
    public static String A00(String str, Object... objArr) {
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
        StringBuilder sb = new StringBuilder((length * 16) + length2);
        int i3 = 0;
        while (i < length) {
            int indexOf = str.indexOf("%s", i3);
            if (indexOf == -1) {
                break;
            }
            sb.append(str, i3, indexOf);
            sb.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb.append(str, i3, length2);
        if (i < length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
