package X;

import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.HashMap;

/* renamed from: X.9o6  reason: invalid class name and case insensitive filesystem */
public class C203479o6 {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public boolean A0P;

    public static C203479o6 A00(Uri uri, String str) {
        Uri uri2 = uri;
        if (uri == null) {
            return null;
        }
        String str2 = str;
        if (C90514aH.A0y(uri2.toString()).startsWith("upi://mandate")) {
            return new C203479o6(A02(uri2, "pn"), A02(uri2, "am"), A02(uri2, "tr"), A02(uri2, "mc"), A03(uri2, str2), A02(uri2, "purpose"), A02(uri2, "pa"), A02(uri2, "sign"), A02(uri2, "amrule"), A02(uri2, "tn"), A02(uri2, "mn"), A02(uri2, "validitystart"), A02(uri2, "validityend"), A02(uri2, "recur"), A02(uri2, "recurvalue"), A02(uri2, "recurtype"), A02(uri2, "rev"), A02(uri2, "share"), A02(uri2, "block"), A02(uri2, "umn"), str);
        }
        if ("upi".equalsIgnoreCase(uri2.getScheme())) {
            String A022 = A02(uri2, "am");
            String A023 = A02(uri2, "mam");
            String A024 = A02(uri2, "pn");
            String A025 = A02(uri2, "tr");
            String A026 = A02(uri2, "mc");
            String A027 = A02(uri2, "tid");
            String queryParameter = uri2.getQueryParameter("url");
            String A032 = A03(uri2, str2);
            String A028 = A02(uri2, "purpose");
            if (!TextUtils.isEmpty(A022) && A022.equals(A023)) {
                A023 = null;
            }
            return new C203479o6(A024, A022, A025, A026, A027, queryParameter, A032, A028, A023, A02(uri2, "pa"), A02(uri2, "sign"), str2);
        }
        try {
            String obj = uri2.toString();
            C125465zx r1 = new C125465zx();
            HashMap A002 = r1.A00(obj.trim());
            HashMap A003 = r1.A00(C90504aG.A0l("26", A002));
            HashMap A004 = r1.A00(C90504aG.A0l("27", A002));
            return new C203479o6(C90504aG.A0l("59", A002), C90504aG.A0l("54", A002), C90504aG.A0l("01", A004), C90504aG.A0l("52", A002), (String) null, C90504aG.A0l("02", A004), "03", (String) null, C90504aG.A0l("02", A003), C90504aG.A0l("01", A003), (String) null, str2);
        } catch (Exception unused) {
            Log.e("PAY: unknown uri");
            return null;
        }
    }

    public static C203479o6 A01(String str, String str2) {
        C203479o6 A002;
        if (str == null || (A002 = A00(Uri.parse(str), str2)) == null) {
            return null;
        }
        A002.A08 = str;
        return A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if (r11.equals("GALLERY_QR_CODE") != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A03(android.net.Uri r10, java.lang.String r11) {
        /*
            java.lang.String r0 = "am"
            java.lang.String r0 = r10.getQueryParameter(r0)
            boolean r9 = X.C36421kH.A1a(r0)
            java.lang.String r0 = "mode"
            java.lang.String r8 = A02(r10, r0)
            java.lang.String r0 = "SCANNED_QR_CODE"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = "GALLERY_QR_CODE"
            boolean r0 = r11.equals(r0)
            r7 = 0
            if (r0 == 0) goto L_0x0022
        L_0x0021:
            r7 = 1
        L_0x0022:
            java.lang.String r0 = "DEEP_LINK"
            boolean r6 = r11.equals(r0)
            r5 = 0
            java.util.Locale r4 = java.util.Locale.US     // Catch:{ Exception -> 0x003e }
            java.lang.String r3 = "%02d"
            java.lang.Object[] r2 = X.AnonymousClass001.A0L()     // Catch:{ Exception -> 0x003e }
            r1 = 0
            int r0 = java.lang.Integer.parseInt(r8)     // Catch:{ Exception -> 0x003e }
            X.AnonymousClass000.A1L(r2, r0, r1)     // Catch:{ Exception -> 0x003e }
            java.lang.String r5 = java.lang.String.format(r4, r3, r2)     // Catch:{ Exception -> 0x003e }
            goto L_0x0048
        L_0x003e:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PAY: IndiaUpiInitiationModeUtil/getInitiationMode"
            X.C36321k7.A1J(r2, r0, r1)
        L_0x0048:
            if (r7 == 0) goto L_0x0062
            if (r9 == 0) goto L_0x0057
            java.util.HashSet r0 = X.AnonymousClass9B6.A00
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L_0x0056
            java.lang.String r5 = "15"
        L_0x0056:
            return r5
        L_0x0057:
            java.util.HashSet r0 = X.AnonymousClass9B6.A03
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L_0x0056
            java.lang.String r5 = "01"
            return r5
        L_0x0062:
            if (r6 == 0) goto L_0x006f
            java.util.HashSet r0 = X.AnonymousClass9B6.A01
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L_0x0056
            java.lang.String r5 = "04"
            return r5
        L_0x006f:
            java.lang.String r5 = "00"
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203479o6.A03(android.net.Uri, java.lang.String):java.lang.String");
    }

    public C203479o6(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21) {
        this.A09 = A05(str, false);
        this.A0A = A04(str2);
        this.A0K = A05(str3, false);
        this.A06 = A05(str4, false);
        this.A04 = A05(str5, false);
        this.A0C = A05(str6, false);
        this.A0O = A05(str7, true);
        this.A0I = A05(str8, false);
        this.A02 = str21;
        this.A00 = A05(str9, false);
        this.A07 = A05(str10, false);
        this.A05 = A05(str11, false);
        this.A0N = A05(str12, false);
        this.A0M = A05(str13, false);
        this.A03 = A05(str14, false);
        this.A0D = A05(str15, false);
        this.A0E = A05(str16, false);
        this.A0G = A05(str17, false);
        this.A0H = A05(str18, false);
        this.A01 = A05(str19, false);
        this.A0L = A05(str20, false);
    }

    public static String A02(Uri uri, String str) {
        int indexOf;
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter == null || (indexOf = queryParameter.indexOf(63)) <= 0) {
            return queryParameter;
        }
        return queryParameter.replace(queryParameter.substring(indexOf), "");
    }

    private String A04(String str) {
        boolean z;
        if (TextUtils.isEmpty(str) || "null".equalsIgnoreCase(str) || "0".equals(str) || "0.0".equals(str) || "0.00".equals(str)) {
            return null;
        }
        try {
            new BigDecimal(str.trim());
            z = true;
        } catch (NumberFormatException unused) {
            Log.w("PAY: IndiaUpiDeeplinkMetadata - Unable to parse amount field");
            z = false;
        }
        if (z) {
            return str.trim();
        }
        return null;
    }

    public static String A05(String str, boolean z) {
        if (TextUtils.isEmpty(str) || "null".equalsIgnoreCase(str) || "na".equalsIgnoreCase(str)) {
            return null;
        }
        String trim = str.trim();
        if (z) {
            return C90514aH.A0y(trim);
        }
        return trim;
    }

    public static void A06(String str, String str2, StringBuffer stringBuffer) {
        if (!TextUtils.isEmpty(str2)) {
            if (stringBuffer.length() > 0) {
                stringBuffer.append("&");
            }
            stringBuffer.append(str);
            stringBuffer.append("=");
            stringBuffer.append(Uri.encode(str2, "@"));
        }
    }

    public String A07() {
        String A0p;
        StringBuffer A0x = C165607th.A0x();
        A06("pn", this.A09, A0x);
        A06("am", this.A0A, A0x);
        A06("tr", this.A0K, A0x);
        A06("mc", this.A06, A0x);
        A06("tid", this.A0J, A0x);
        A06("url", this.A0F, A0x);
        A06("mode", this.A04, A0x);
        A06("purpose", this.A0C, A0x);
        A06("mam", this.A0B, A0x);
        A06("pa", this.A0O, A0x);
        A06("sign", this.A0I, A0x);
        A06("tn", this.A07, A0x);
        String obj = A0x.toString();
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("upi://pay");
        if (TextUtils.isEmpty(obj)) {
            A0p = "";
        } else {
            A0p = AnonymousClass000.A0p("?", obj, AnonymousClass000.A0u());
        }
        return AnonymousClass000.A0q(A0p, A0u);
    }

    public C203479o6(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.A09 = A05(str, false);
        this.A0A = A04(str2);
        this.A0K = A05(str3, false);
        this.A06 = A05(str4, false);
        this.A0J = A05(str5, false);
        this.A0F = A05(str6, false);
        this.A04 = A05(str7, false);
        this.A0C = A05(str8, false);
        this.A0B = A04(str9);
        this.A0O = A05(str10, true);
        this.A07 = A05((String) null, false);
        this.A0I = A05(str11, false);
        this.A02 = str12;
    }

    public C203479o6() {
    }
}
