package X;

import android.telephony.PhoneNumberUtils;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.util.regex.Pattern;

/* renamed from: X.3U8  reason: invalid class name */
public class AnonymousClass3U8 {
    public static final String[] A00 = {"((?:0[1-3]|[457][0-3])\\d{6})", "([04-9][4-6]\\d{6})", "((?:[04-8][7-9]|9[78])\\d{6})", "(5\\d{6})", "(6\\d{6})", "(9\\d{6})", "(7\\d{6})"};
    public static final Pattern[] A01 = new Pattern[7];

    public static String A00(C203559oI r2, AnonymousClass11F r3) {
        if (r3 == null) {
            Log.w("contact/phonenumber/jid/null");
            return null;
        } else if (r3 instanceof C177638e7) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append('+');
            return AnonymousClass000.A0q(r3.user, A0u);
        } else {
            String A06 = A06(r3);
            if (!PhoneNumberUtils.isGlobalPhoneNumber(A06)) {
                return A06;
            }
            C18740tg.A06(A06);
            return A01(r2, A06);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e1 A[Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A01(X.C203559oI r11, java.lang.String r12) {
        /*
            java.lang.String r4 = " "
            java.lang.String r5 = "ZZ"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            r0 = 43
            r1.append(r0)
            java.lang.String r3 = X.AnonymousClass000.A0q(r12, r1)
            X.AUN r2 = r11.A0F(r3, r5)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            int r6 = r2.countryCode_     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            long r0 = r2.nationalNumber_     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            r8 = 1
            r10 = 0
            java.lang.String r9 = "+"
            r0 = 52
            if (r0 != r6) goto L_0x0049
            int r7 = r1.length()     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            r0 = 11
            if (r7 != r0) goto L_0x00de
            char r7 = r1.charAt(r10)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            r0 = 49
            if (r7 != r0) goto L_0x00de
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0v(r9)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            r7.append(r6)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            java.lang.String r0 = r1.substring(r8)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            r7.append(r0)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
        L_0x0043:
            java.lang.String r0 = r7.toString()     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            goto L_0x00df
        L_0x0049:
            r0 = 225(0xe1, float:3.15E-43)
            if (r0 != r6) goto L_0x008a
            java.util.regex.Pattern r0 = A08(r10)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            boolean r0 = X.C36361kB.A1Z(r1, r0)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            if (r0 == 0) goto L_0x0061
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0v(r9)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            r7.append(r6)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            java.lang.String r0 = "01"
            goto L_0x00a2
        L_0x0061:
            java.util.regex.Pattern r0 = A08(r8)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            boolean r0 = X.C36361kB.A1Z(r1, r0)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            if (r0 == 0) goto L_0x0075
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0v(r9)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            r7.append(r6)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            java.lang.String r0 = "05"
            goto L_0x00a2
        L_0x0075:
            r0 = 2
            java.util.regex.Pattern r0 = A08(r0)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            boolean r0 = X.C36361kB.A1Z(r1, r0)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            if (r0 == 0) goto L_0x00de
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0v(r9)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            r7.append(r6)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            java.lang.String r0 = "07"
            goto L_0x00a2
        L_0x008a:
            r0 = 245(0xf5, float:3.43E-43)
            if (r0 != r6) goto L_0x00de
            r0 = 3
            java.util.regex.Pattern r0 = A08(r0)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            boolean r0 = X.C36361kB.A1Z(r1, r0)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            if (r0 == 0) goto L_0x00a9
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0v(r9)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            r7.append(r6)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            java.lang.String r0 = "95"
        L_0x00a2:
            r7.append(r0)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            r7.append(r1)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            goto L_0x0043
        L_0x00a9:
            r0 = 4
            java.util.regex.Pattern r0 = A08(r0)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            boolean r0 = X.C36361kB.A1Z(r1, r0)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            if (r0 != 0) goto L_0x00d4
            r0 = 5
            java.util.regex.Pattern r0 = A08(r0)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            boolean r0 = X.C36361kB.A1Z(r1, r0)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            if (r0 != 0) goto L_0x00d4
            r0 = 6
            java.util.regex.Pattern r0 = A08(r0)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            boolean r0 = X.C36361kB.A1Z(r1, r0)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            if (r0 == 0) goto L_0x00de
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0v(r9)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            r7.append(r6)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            java.lang.String r0 = "97"
            goto L_0x00a2
        L_0x00d4:
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0v(r9)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            r7.append(r6)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            java.lang.String r0 = "96"
            goto L_0x00a2
        L_0x00de:
            r0 = 0
        L_0x00df:
            if (r0 == 0) goto L_0x00e5
            X.AUN r2 = r11.A0F(r0, r5)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
        L_0x00e5:
            java.lang.Integer r0 = X.C023109s.A01     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            java.lang.String r3 = r11.A0J(r2, r0)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00f4 }
            return r3
        L_0x00ec:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "contact/formatter-exception num:"
            goto L_0x00fb
        L_0x00f4:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "contact/formatter-init-exception num:"
        L_0x00fb:
            X.AnonymousClass000.A1D(r0, r3, r4, r1)
            java.lang.String r0 = r2.getMessage()
            X.C36351kA.A1Q(r0, r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U8.A01(X.9oI, java.lang.String):java.lang.String");
    }

    public static String A06(AnonymousClass11F r4) {
        String str;
        int indexOf;
        if (r4 instanceof PhoneUserJid) {
            return r4.user;
        }
        if (!AnonymousClass143.A0G(r4) || r4 == null || (str = r4.user) == null || (indexOf = str.indexOf("-")) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static Pattern A08(int i) {
        Pattern[] patternArr = A01;
        if (patternArr[i] == null) {
            patternArr[i] = Pattern.compile(A00[i]);
        }
        return patternArr[i];
    }

    public static String A02(C18820ts r1, AnonymousClass141 r2) {
        return r1.A0H(A03(r2));
    }

    public static String A03(AnonymousClass141 r0) {
        return A04(C36351kA.A0j(r0));
    }

    public static String A04(AnonymousClass11F r1) {
        return A00(C203559oI.A00(), r1);
    }

    public static String A05(AnonymousClass11F r2) {
        String A03 = AnonymousClass3U2.A03(A04(r2));
        if (A03 != null) {
            return AnonymousClass000.A0p("+", A03, AnonymousClass000.A0u());
        }
        return null;
    }

    public static String A07(AnonymousClass11F r0) {
        return A04(r0);
    }
}
