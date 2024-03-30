package X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.3TP  reason: invalid class name */
public class AnonymousClass3TP {
    public static final List A01;
    public static final List A02;
    public static final Pattern A03;
    public static final Pattern A04 = Pattern.compile("[\\u09BE-\\u09CC\\u09E2\\u09E3]+");
    public static final Pattern A05;
    public static final Pattern A06 = Pattern.compile("[\\u093A\\u093B\\u093E-\\u094C\\u094E\\u094F\\u0955-\\u0957\\u0962\\u0963]+");
    public static final Pattern A07;
    public static final Pattern A08 = Pattern.compile("[\\u0ABE-\\u0ACC\\u0AE2\\u0AE3]+");
    public static final Pattern A09;
    public static final List A0A;
    public static final Pattern A0B;
    public static final Pattern A0C;
    public static final Pattern A0D;
    public static final Pattern A0E;
    public static final Pattern A0F;
    public static final Pattern A0G = Pattern.compile("[\\u0E30-\\u0E59]+");
    public final C18820ts A00;

    static {
        Pattern compile = Pattern.compile("[\\u0600-\\u0604\\u0606-\\u060B\\u060D-\\u061A\\u061C-\\u061E\\u0620-\\u063F\\u0641-\\u064A\\u0656-\\u066F\\u0671-\\u06DC\\u06DE-\\u06FF\\u0750-\\u077F\\u0870-\\u088E\\u0890\\u0891\\u0898-\\u08E1\\u08E3-\\u08FF\\uFB50-\\uFBC2\\uFBD3-\\uFD3D\\uFD40-\\uFD8F\\uFD92-\\uFDC7\\uFDCF\\uFDF0-\\uFDFF\\uFE70-\\uFE74\\uFE76-\\uFEFC]+");
        A0B = compile;
        Pattern compile2 = Pattern.compile("[\\u0980-\\u0983\\u0985-\\u098C\\u098F\\u0990\\u0993-\\u09A8\\u09AA-\\u09B0\\u09B2\\u09B6-\\u09B9\\u09BC-\\u09C4\\u09C7\\u09C8\\u09CB-\\u09CE\\u09D7\\u09DC\\u09DD\\u09DF-\\u09E3\\u09E6-\\u09FE]+");
        A03 = compile2;
        Pattern compile3 = Pattern.compile("[\\u0400-\\u0484\\u0487-\\u052F\\u1C80-\\u1C88\\u1D2B\\u1D78\\u2DE0-\\u2DFF\\uA640-\\uA69F\\uFE2E\\uFE2F]+");
        A0C = compile3;
        Pattern compile4 = Pattern.compile("[\\u0900-\\u0950\\u0955-\\u0963\\u0966-\\u097F\\uA8E0-\\uA8FF]+");
        A05 = compile4;
        Pattern compile5 = Pattern.compile("[\\u0A81-\\u0A83\\u0A85-\\u0A8D\\u0A8F-\\u0A91\\u0A93-\\u0AA8\\u0AAA-\\u0AB0\\u0AB2\\u0AB3\\u0AB5-\\u0AB9\\u0ABC-\\u0AC5\\u0AC7-\\u0AC9\\u0ACB-\\u0ACD\\u0AD0\\u0AE0-\\u0AE3\\u0AE6-\\u0AF1\\u0AF9-\\u0AFF]+");
        A07 = compile5;
        Pattern compile6 = Pattern.compile("[\\u2E80-\\u2E99\\u2E9B-\\u2EF3\\u2F00-\\u2FD5\\u3005\\u3007\\u3021-\\u3029\\u3038-\\u303B\\u3400-\\u4DBF\\u4E00-\\u9FFF\\uF900-\\uFA6D\\uFA70-\\uFAD9]+");
        A09 = compile6;
        Pattern compile7 = Pattern.compile("[\\u0591-\\u05C7\\u05D0-\\u05EA\\u05EF-\\u05F4\\uFB1D-\\uFB36\\uFB38-\\uFB3C\\uFB3E\\uFB40\\uFB41\\uFB43\\uFB44\\uFB46-\\uFB4F]+");
        A0D = compile7;
        Pattern compile8 = Pattern.compile("[A-Za-z\\xAA\\xBA\\xC0-\\xD6\\xD8-\\xF6\\xF8-\\u0249\\u02E0-\\u02E4\\u1D00-\\u1D25\\u1D2C-\\u1D5C\\u1D62-\\u1D65\\u1D6B-\\u1D77\\u1D79-\\u1DBE\\u1E00-\\u1EFF\\u2071\\u207F\\u2090-\\u209C\\u212A\\u212B\\u2132\\u214E\\u2160-\\u2188\\u2C60-\\u2C7F\\uA722-\\uA787\\uA78B-\\uA7CA\\uA7D0\\uA7D1\\uA7D3\\uA7D5-\\uA7D9\\uA7F2-\\uA7FF\\uAB30-\\uAB5A\\uAB5C-\\uAB64\\uAB66-\\uAB69\\uFB00-\\uFB06\\uFF21-\\uFF3A\\uFF41-\\uFF5A]+");
        A0E = compile8;
        Pattern compile9 = Pattern.compile("[\\u0E01-\\u0E3A\\u0E40-\\u0E5B]+");
        A0F = compile9;
        A01 = Arrays.asList(new Pattern[]{compile, compile2, compile3, compile4, compile5, compile6, compile7, compile8, compile9});
        A02 = Arrays.asList(new Pattern[]{compile, compile2, compile4, compile5, compile9});
        A0A = Arrays.asList(new Pattern[]{compile2, compile4, compile5});
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00d8 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(java.lang.String r6, boolean r7) {
        /*
            java.util.List r0 = A0A
            boolean r0 = A01(r6, r0)
            if (r0 == 0) goto L_0x007c
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r4 = 0
            if (r0 != 0) goto L_0x005b
            int r1 = r6.length()
            if (r1 <= 0) goto L_0x0079
            r0 = 0
            char r0 = r6.charAt(r0)
            java.lang.Character r3 = java.lang.Character.valueOf(r0)
            r0 = 1
            if (r1 <= r0) goto L_0x007a
            char r0 = r6.charAt(r0)
            java.lang.Character r2 = java.lang.Character.valueOf(r0)
        L_0x0029:
            java.util.regex.Pattern r0 = A05
            boolean r0 = X.C36361kB.A1Z(r6, r0)
            if (r0 == 0) goto L_0x0063
            java.util.regex.Pattern r1 = A06
        L_0x0033:
            if (r1 == 0) goto L_0x005b
            if (r2 == 0) goto L_0x005c
            java.lang.String r0 = java.lang.String.valueOf(r3)
            boolean r0 = X.C36361kB.A1Z(r0, r1)
            if (r0 != 0) goto L_0x005c
            java.lang.String r0 = java.lang.String.valueOf(r2)
            boolean r0 = X.C36361kB.A1Z(r0, r1)
            if (r0 == 0) goto L_0x005c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = ""
            r1.append(r0)
            r1.append(r3)
            java.lang.String r4 = X.AnonymousClass000.A0o(r2, r1)
        L_0x005b:
            return r4
        L_0x005c:
            if (r3 == 0) goto L_0x005b
            java.lang.String r4 = java.lang.String.valueOf(r3)
            return r4
        L_0x0063:
            java.util.regex.Pattern r0 = A07
            boolean r0 = X.C36361kB.A1Z(r6, r0)
            if (r0 == 0) goto L_0x006e
            java.util.regex.Pattern r1 = A08
            goto L_0x0033
        L_0x006e:
            java.util.regex.Pattern r0 = A03
            boolean r0 = X.C36361kB.A1Z(r6, r0)
            if (r0 == 0) goto L_0x005b
            java.util.regex.Pattern r1 = A04
            goto L_0x0033
        L_0x0079:
            r3 = r4
        L_0x007a:
            r2 = r4
            goto L_0x0029
        L_0x007c:
            int r5 = r6.length()
            r4 = 0
            r3 = 0
            if (r5 <= 0) goto L_0x00ba
            char r0 = r6.charAt(r4)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            if (r2 == 0) goto L_0x00bb
            java.util.regex.Pattern r0 = A0F
            boolean r0 = X.C36361kB.A1Z(r2, r0)
            if (r0 == 0) goto L_0x00bb
            java.util.regex.Pattern r1 = A0G
            boolean r0 = X.C36361kB.A1Z(r2, r1)
            if (r0 == 0) goto L_0x00bb
            r0 = 1
            if (r5 <= r0) goto L_0x00d8
            char r0 = r6.charAt(r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            if (r2 == 0) goto L_0x00d8
            boolean r0 = X.C36361kB.A1Z(r2, r1)
            if (r0 != 0) goto L_0x00d8
            java.util.List r0 = A01
            boolean r0 = A01(r2, r0)
            if (r0 == 0) goto L_0x00d8
            return r2
        L_0x00ba:
            r2 = r3
        L_0x00bb:
            java.util.regex.Pattern r0 = A09
            boolean r0 = X.C36361kB.A1Z(r6, r0)
            if (r0 == 0) goto L_0x00cd
            if (r7 != 0) goto L_0x00cd
            r0 = 2
            if (r5 < r0) goto L_0x00cc
            java.lang.String r6 = r6.substring(r4, r0)
        L_0x00cc:
            r2 = r6
        L_0x00cd:
            if (r2 == 0) goto L_0x00d8
            java.util.List r0 = A01
            boolean r0 = A01(r2, r0)
            if (r0 == 0) goto L_0x00d8
            return r2
        L_0x00d8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3TP.A00(java.lang.String, boolean):java.lang.String");
    }

    public AnonymousClass3TP(C18820ts r1) {
        this.A00 = r1;
    }

    public static boolean A01(String str, List list) {
        if (!TextUtils.isEmpty(str)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (C36361kB.A1Z(str, (Pattern) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }
}
