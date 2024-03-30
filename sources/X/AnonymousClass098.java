package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.098  reason: invalid class name */
public abstract class AnonymousClass098 extends AnonymousClass097 {
    public static final String A05(String str, String str2, String str3, boolean z) {
        AnonymousClass00C.A0D(str, 0);
        AnonymousClass00C.A0D(str2, 1);
        AnonymousClass00C.A0D(str3, 2);
        int i = 0;
        int A0C = AnonymousClass099.A0C(str, str2, 0, z);
        if (A0C < 0) {
            return str;
        }
        int length = str2.length();
        int i2 = length;
        if (length < 1) {
            i2 = 1;
        }
        int length2 = str.length();
        int length3 = (length2 - length) + str3.length();
        if (length3 >= 0) {
            StringBuilder sb = new StringBuilder(length3);
            do {
                sb.append(str, i, A0C);
                sb.append(str3);
                i = A0C + length;
                if (A0C >= length2 || (A0C = AnonymousClass099.A0C(str, str2, A0C + i2, z)) <= 0) {
                    sb.append(str, i, length2);
                    String obj = sb.toString();
                    AnonymousClass00C.A08(obj);
                }
                sb.append(str, i, A0C);
                sb.append(str3);
                i = A0C + length;
                break;
            } while ((A0C = AnonymousClass099.A0C(str, str2, A0C + i2, z)) <= 0);
            sb.append(str, i, length2);
            String obj2 = sb.toString();
            AnonymousClass00C.A08(obj2);
            return obj2;
        }
        throw new OutOfMemoryError();
    }

    public static final boolean A06(CharSequence charSequence) {
        AnonymousClass00C.A0D(charSequence, 0);
        if (charSequence.length() == 0) {
            return true;
        }
        C15020mZ r1 = new C15020mZ(0, charSequence.length() - 1);
        if ((r1 instanceof Collection) && ((Collection) r1).isEmpty()) {
            return true;
        }
        Iterator it = r1.iterator();
        while (it.hasNext()) {
            if (!C06780Vb.A01(charSequence.charAt(((C12260hl) it).A00()))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean A07(String str, String str2, boolean z) {
        String str3 = str;
        AnonymousClass00C.A0D(str, 0);
        String str4 = str2;
        AnonymousClass00C.A0D(str2, 1);
        boolean z2 = z;
        if (!z) {
            return str3.startsWith(str2);
        }
        return str3.regionMatches(z2, 0, str4, 0, str2.length());
    }
}
