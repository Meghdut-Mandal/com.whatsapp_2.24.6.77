package X;

import android.net.Uri;
import java.math.BigInteger;
import java.net.URI;
import java.security.SecureRandom;

/* renamed from: X.6No  reason: invalid class name and case insensitive filesystem */
public class C131056No {
    public final String A00;
    public final String A01 = new BigInteger(130, new SecureRandom()).toString(32);

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C131056No)) {
            return false;
        }
        C131056No r4 = (C131056No) obj;
        return r4.A00.equals(this.A00) && r4.A01.equals(this.A01);
    }

    public static String A00(String str) {
        try {
            C194249Ou r0 = C133036Wk.A01;
            URI create = URI.create(str);
            Uri A0D = C90464aC.A0D(create);
            C133036Wk.A02(A0D, create, false);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(A0D.getScheme());
            A0u.append("://");
            A0u.append(A0D.getAuthority());
            return A0u.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C131056No(String str) {
        this.A00 = A00(str);
    }
}
