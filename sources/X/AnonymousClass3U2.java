package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;

/* renamed from: X.3U2  reason: invalid class name */
public abstract class AnonymousClass3U2 {
    public static int A00(AnonymousClass1N4 r9, String str, String str2) {
        try {
            int length = str.length();
            if (length < 1 || length > 3) {
                C36321k7.A1R("enterphone/cc/bad-length cc=", str, AnonymousClass000.A0u());
                return 2;
            }
            Charset charset = AnonymousClass1M4.A06;
            try {
                if (AnonymousClass1M5.A02.indexOfKey(Integer.parseInt(str)) >= 0) {
                    if (str2 == null || str2.length() == 0 || str2.replaceAll("\\D", "").length() == 0) {
                        C36321k7.A1R("enterphone/num/error/empty cc=", str, AnonymousClass000.A0u());
                        return 4;
                    }
                    int parseInt = Integer.parseInt(str);
                    String A03 = r9.A03(parseInt, str2.replaceAll("\\D", ""));
                    int length2 = A03.length();
                    AnonymousClass1N4.A01(r9);
                    Iterator it = r9.A01.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        AnonymousClass3O9 r1 = (AnonymousClass3O9) it.next();
                        if (r1.A00 == parseInt) {
                            int A00 = AnonymousClass3O9.A00(r1, length2);
                            if (A00 != 0) {
                                if (A00 < 0) {
                                    return 5;
                                }
                                return 6;
                            }
                        }
                    }
                    int i = length + length2;
                    if (i <= 15 && i >= 8) {
                        return 1;
                    }
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("enterphone/num/error/length cc=");
                    A0u.append(str);
                    C36321k7.A1R(" ph=", A03, A0u);
                    return 7;
                }
            } catch (NumberFormatException unused) {
            }
            C36321k7.A1R("enterphone/cc/bad-name ", str, AnonymousClass000.A0u());
            return 3;
        } catch (IOException e) {
            Log.e("enterphone/error trimLeadingZero or nativeNameFromCallingCode from CountryPhoneInfo IOException", e);
            return 7;
        }
    }

    public static String A03(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("\\D", "");
    }

    public static int A01(AnonymousClass1N4 r3, String str, String str2) {
        int A00 = A00(r3, str, str2);
        if (A00 != 7 && A00 != 5 && A00 != 6) {
            return A00;
        }
        int length = str.length() + str2.length();
        if (length > 17 || length < 6) {
            C36321k7.A1R("enterphone/num/allow-landline/error/length input=", str2, AnonymousClass000.A0u());
            return 7;
        }
        C36321k7.A1Q("enterphone/num/allow-landline/ok/length input=", str2, AnonymousClass000.A0u());
        return 1;
    }

    public static String A02(AnonymousClass1N4 r1, String str, String str2) {
        try {
            return r1.A03(Integer.parseInt(str), str2);
        } catch (IOException e) {
            Log.e("phonenumberutils/trim/error", e);
            return str2;
        }
    }

    public static boolean A04(String str, String str2, String str3) {
        if (!str.equals(str2)) {
            String replaceAll = str.replaceAll("[^0-9]", "");
            String replaceAll2 = str2.replaceAll("[^0-9]", "");
            if (replaceAll2.equals(replaceAll) || C36431kI.A1B(str3, replaceAll2).equals(replaceAll)) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        r7 = "9";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        r6 = X.C36321k7.A0D(r11, r9);
        r5 = A06(r8, r9, r6, r7, r2);
        r4 = A06(r10, r9, r6, r7, r2);
        r1 = r2 - r11.length();
        r3 = A06(r9, r8, r10, r7, r1);
        r2 = A06(r6, r8, r10, r7, r2);
        r0 = A06(r8, r9, r6, r7, r1);
        r1 = A06(r10, r9, r6, r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        if (r5 != false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        if (r4 != false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        if (r3 != false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005e, code lost:
        if (r2 != false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        if (r0 != false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0063, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0065, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A05(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            int r0 = r11.hashCode()
            r1 = 0
            switch(r0) {
                case 1693: goto L_0x0009;
                case 1695: goto L_0x0015;
                case 1696: goto L_0x001f;
                case 49686: goto L_0x002b;
                default: goto L_0x0008;
            }
        L_0x0008:
            return r1
        L_0x0009:
            java.lang.String r0 = "52"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0008
            r2 = 2
            java.lang.String r7 = "1"
            goto L_0x0036
        L_0x0015:
            java.lang.String r0 = "54"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0008
            r2 = 2
            goto L_0x0028
        L_0x001f:
            java.lang.String r0 = "55"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0008
            r2 = 4
        L_0x0028:
            java.lang.String r7 = "9"
            goto L_0x0036
        L_0x002b:
            java.lang.String r0 = "237"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0008
            r2 = 3
            java.lang.String r7 = "6"
        L_0x0036:
            java.lang.String r6 = X.C36321k7.A0D(r11, r9)
            boolean r5 = A06(r8, r9, r6, r7, r2)
            boolean r4 = A06(r10, r9, r6, r7, r2)
            int r0 = r11.length()
            int r1 = r2 - r0
            boolean r3 = A06(r9, r8, r10, r7, r1)
            boolean r2 = A06(r6, r8, r10, r7, r2)
            boolean r0 = A06(r8, r9, r6, r7, r1)
            boolean r1 = A06(r10, r9, r6, r7, r1)
            if (r5 != 0) goto L_0x0065
            if (r4 != 0) goto L_0x0065
            if (r3 != 0) goto L_0x0065
            if (r2 != 0) goto L_0x0065
            if (r0 != 0) goto L_0x0065
            r0 = 0
            if (r1 == 0) goto L_0x0066
        L_0x0065:
            r0 = 1
        L_0x0066:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U2.A05(java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    public static boolean A06(String str, String str2, String str3, String str4, int i) {
        if (str.length() < i) {
            return false;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.insert(i, str4);
        String obj = sb.toString();
        if (obj.equals(str2) || obj.equals(str3)) {
            return true;
        }
        return false;
    }
}
