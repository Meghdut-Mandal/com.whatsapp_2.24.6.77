package X;

import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.6Nz  reason: invalid class name and case insensitive filesystem */
public class C131166Nz {
    public static final List A02 = Collections.unmodifiableList(Arrays.asList(new String[]{"FBAN", "FBAV", "FBLC", "FBSV"}));
    public static final List A03 = Collections.unmodifiableList(Arrays.asList(new String[]{"FBBR", "FBBD", "FBBV", "FBCA", "FBPN", "FBDM"}));
    public String A00;
    public final Map A01;

    public C131166Nz(boolean z) {
        HashMap A0J = AnonymousClass001.A0J();
        this.A01 = A0J;
        if (z) {
            A0J.put("FBBR", Build.BOARD);
            A0J.put("FBBD", Build.BRAND);
            A0J.put("FBDM", C90484aE.A0P().toString());
            A0J.put("FBSV", Build.VERSION.RELEASE);
            Object[] A0M = AnonymousClass001.A0M();
            A0M[0] = Build.CPU_ABI;
            A0M[1] = Build.CPU_ABI2;
            A0J.put("FBCA", String.format((Locale) null, "%s:%s", A0M));
        }
    }

    public String A00() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A00);
        A0u.append(" [");
        for (Object next : A02) {
            A0u.append(String.format((Locale) null, "%s/%s;", new Object[]{next, A01(C36431kI.A1A(next, this.A01))}));
        }
        for (Object next2 : A03) {
            A0u.append(String.format((Locale) null, "%s/%s;", new Object[]{next2, A01(C36431kI.A1A(next2, this.A01))}));
        }
        return C90474aD.A0g(A0u);
    }

    public String A01(String str) {
        String str2;
        if (TextUtils.isEmpty(str) || str == null) {
            return "null";
        }
        int length = str.length();
        StringBuilder A0h = C90524aI.A0h(length);
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '&') {
                str2 = "&amp;";
            } else if (charAt < ' ' || charAt > '~') {
                A0h.append("&#");
                A0h.append(Integer.toString(charAt));
                str2 = ";";
            } else {
                A0h.append(charAt);
            }
            A0h.append(str2);
        }
        return A0h.toString().replace("/", "-").replace(";", "-");
    }
}
