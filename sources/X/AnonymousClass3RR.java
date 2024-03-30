package X;

import android.net.Uri;
import com.whatsapp.jid.Jid;
import java.util.List;
import java.util.Set;

/* renamed from: X.3RR  reason: invalid class name */
public abstract class AnonymousClass3RR {
    public static List A00;

    public static final boolean A00(C20810yC r3, Jid jid) {
        AnonymousClass00C.A0D(r3, 0);
        if (jid == null || !r3.A0E(1377)) {
            return false;
        }
        List list = A00;
        if (list == null) {
            String A19 = C36431kI.A19(r3, 1607);
            if (A19.length() == 0) {
                return false;
            }
            list = AnonymousClass099.A0L(A19, new String[]{","}, 0);
            A00 = list;
        }
        return list.contains(jid.user);
    }

    public static final boolean A01(C20810yC r2, AnonymousClass2bI r3) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass11F r0 = r3.A1J.A00;
        if (r0 != null) {
            String rawString = r0.getRawString();
            String A19 = C36431kI.A19(r2, 1924);
            if (A19.length() <= 0 || !AnonymousClass00C.A0J(rawString, A19)) {
                return false;
            }
            return true;
        }
        throw C36381kD.A0l();
    }

    public static final boolean A02(C20810yC r7, AnonymousClass3P8 r8) {
        AnonymousClass00C.A0D(r7, 0);
        if (2 == r8.A06) {
            String str = r8.A01;
            AnonymousClass00C.A07(str);
            try {
                Uri parse = Uri.parse(str);
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                String host = parse.getHost();
                if (host == null || !AnonymousClass099.A0O(host, "whatsapp.com", false) || !AnonymousClass00C.A0J(parse.getPath(), "/survey/") || ((!queryParameterNames.contains("oid") && !queryParameterNames.contains("session")) || !r7.A0E(1377))) {
                    return false;
                }
                return true;
            } catch (Exception e) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("InAppSurveyUtils/isInAppSurveyURL/<");
                A0u.append(str);
                C36321k7.A1J(e, "> is not a valid URL. Error=", A0u);
            }
        }
        return false;
    }
}
