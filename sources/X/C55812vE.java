package X;

import com.whatsapp.util.Log;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;

/* renamed from: X.2vE  reason: invalid class name and case insensitive filesystem */
public abstract class C55812vE {
    public static final String A00(String str) {
        AnonymousClass00C.A0D(str, 0);
        try {
            URL url = new URL(str);
            String host = url.getHost();
            AnonymousClass00C.A08(host);
            int i = 0;
            int A0C = AnonymousClass099.A0C(str, host, 0, false);
            if (A0C < 0) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("cannot find host ");
                A0u.append(url.getHost());
                C36321k7.A1P(" in ", str, A0u);
                int length = str.length();
                if (length > 34) {
                    length = 34;
                }
                return C36431kI.A16(0, length, str);
            }
            String substring = str.substring(A0C + url.getHost().length());
            AnonymousClass00C.A08(substring);
            String host2 = url.getHost();
            AnonymousClass00C.A08(host2);
            if (AnonymousClass098.A07(C36431kI.A1D(Locale.ROOT, host2), "www.", false)) {
                host2 = host2.substring(4);
                AnonymousClass00C.A08(host2);
            }
            int length2 = substring.length();
            if (length2 > 12 || C36441kJ.A09(host2, length2) > 34) {
                int i2 = length2 - 12;
                int A09 = C36441kJ.A09(host2, length2) - 34;
                if (i2 < A09) {
                    i2 = A09;
                }
                i = length2;
                if (length2 > i2) {
                    i = i2;
                }
                substring = C36431kI.A16(0, length2 - i, substring);
            }
            if (substring.length() == 1) {
                substring = "";
            }
            String A0D = C36321k7.A0D(host2, substring);
            int length3 = A0D.length();
            if (length3 > 34) {
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append(8230);
                String substring2 = A0D.substring(length3 - 34);
                AnonymousClass00C.A08(substring2);
                A0D = AnonymousClass000.A0q(substring2, A0u2);
            }
            if (i > 0) {
                return AnonymousClass000.A0t(AnonymousClass000.A0v(A0D), 8230);
            }
            return A0D;
        } catch (MalformedURLException e) {
            Log.e(AnonymousClass000.A0p("invalid url ", str, AnonymousClass000.A0u()), e);
            int length4 = str.length();
            if (length4 > 34) {
                length4 = 34;
            }
            return C36431kI.A16(0, length4, str);
        }
    }
}
