package X;

import android.text.TextUtils;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.3St  reason: invalid class name and case insensitive filesystem */
public final class C65603St {
    public static final Pattern A02 = Pattern.compile("(\\d{3})(\\d{2,3})");
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        C65603St r5 = (C65603St) obj;
        return TextUtils.equals(this.A00, r5.A00) && TextUtils.equals(this.A01, r5.A01);
    }

    public static C65603St A00(String str) {
        String str2 = "000";
        String str3 = str2;
        if (str != null) {
            Matcher matcher = A02.matcher(str);
            if (matcher.matches()) {
                str3 = matcher.group(1);
                try {
                    str2 = String.format(Locale.US, "%03d", new Object[]{Integer.valueOf(matcher.group(2))});
                } catch (NumberFormatException e) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("mccmnc/parse mnc not parseable as integer: ");
                    C36351kA.A1Q(matcher.group(2), A0u, e);
                }
            }
        }
        return new C65603St(str3, str2);
    }

    public static String A01(String str, String str2) {
        if (str != null) {
            Matcher matcher = A02.matcher(str);
            if (matcher.matches()) {
                return AnonymousClass000.A0p("-", matcher.group(2), AnonymousClass000.A0v(matcher.group(1)));
            }
        }
        return str2;
    }

    public int hashCode() {
        int A09 = C36341k9.A09(this.A00);
        return (A09 * 31) + C36421kH.A05(this.A01);
    }

    public C65603St(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MccMnc<");
        A0u.append(this.A00);
        A0u.append(",");
        A0u.append(this.A01);
        return AnonymousClass000.A0q(">", A0u);
    }
}
