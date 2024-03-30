package X;

import android.text.TextUtils;

/* renamed from: X.9hQ  reason: invalid class name and case insensitive filesystem */
public abstract class C200449hQ {
    public static void A04(StringBuilder sb, StringBuilder sb2) {
        sb.append("");
        sb2.append(A00(sb.toString()));
    }

    public static String A00(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[data localized ");
        A0u.append(str.getBytes().length);
        return AnonymousClass000.A0q(" bytes]", A0u);
    }

    public static String A01(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = (str.length() + 1) / 2;
        StringBuilder A0p = C90484aE.A0p();
        A0p.append(length);
        A0p.append(" char]");
        return AnonymousClass000.A0q(str.substring(length), A0p);
    }

    public static String A02(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("@")) {
            return "";
        }
        return "SCRUBBED-VPA";
    }

    public static void A03(StringBuilder sb, String str) {
        sb.append(A00(str));
    }
}
