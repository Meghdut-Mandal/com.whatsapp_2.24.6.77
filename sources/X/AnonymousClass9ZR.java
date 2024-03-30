package X;

import java.util.HashSet;
import java.util.Locale;

/* renamed from: X.9ZR  reason: invalid class name */
public abstract class AnonymousClass9ZR {
    /* JADX WARNING: Code restructure failed: missing block: B:132:?, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:?, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:?, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:?, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006f, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0071, code lost:
        return "sr-RS";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        if (r6.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007d, code lost:
        return "sq-AL";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a8, code lost:
        if (r6.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00aa, code lost:
        return "fr-FR";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00e3, code lost:
        if (r6.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00e5, code lost:
        return "en-GB";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x011a, code lost:
        if (r6.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x011c, code lost:
        return "ar-EG";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(java.lang.String r6) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            boolean r1 = X.AnonymousClass000.A1T(r1, r0)
            java.lang.String r0 = "fil-PH"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0015
            if (r1 == 0) goto L_0x0014
            java.lang.String r6 = "tl-PH"
        L_0x0014:
            return r6
        L_0x0015:
            java.lang.String r4 = "sr-XK"
            java.lang.String r3 = "sr-RS"
            java.lang.String r2 = "sr-BA"
            if (r1 == 0) goto L_0x011f
            java.lang.Object r5 = X.C26621Kw.A01
            monitor-enter(r5)
            java.util.HashSet r0 = X.C26621Kw.A00     // Catch:{ all -> 0x017c }
            if (r0 != 0) goto L_0x0036
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()     // Catch:{ all -> 0x017c }
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch:{ all -> 0x017c }
            java.lang.String[] r0 = r0.getLocales()     // Catch:{ all -> 0x017c }
            java.util.HashSet r0 = X.C36421kH.A0g(r0)     // Catch:{ all -> 0x017c }
            X.C26621Kw.A00 = r0     // Catch:{ all -> 0x017c }
        L_0x0036:
            monitor-exit(r5)     // Catch:{ all -> 0x017c }
            monitor-enter(r5)
            java.util.HashSet r0 = X.C26621Kw.A00     // Catch:{ all -> 0x0179 }
            boolean r0 = r0.contains(r6)     // Catch:{ all -> 0x0179 }
            if (r0 == 0) goto L_0x0042
            r0 = 1
            goto L_0x0050
        L_0x0042:
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r6)     // Catch:{ all -> 0x0179 }
            java.lang.String r1 = r0.getLanguage()     // Catch:{ all -> 0x0179 }
            java.util.HashSet r0 = X.C26621Kw.A00     // Catch:{ all -> 0x0179 }
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x0179 }
        L_0x0050:
            monitor-exit(r5)     // Catch:{ all -> 0x0179 }
            if (r0 != 0) goto L_0x0014
            int r0 = r6.hashCode()
            switch(r0) {
                case 93023040: goto L_0x0114;
                case 93023074: goto L_0x0111;
                case 93023138: goto L_0x010e;
                case 93023177: goto L_0x010b;
                case 93023295: goto L_0x0108;
                case 93023358: goto L_0x0105;
                case 93023368: goto L_0x0102;
                case 93023378: goto L_0x00ff;
                case 93023482: goto L_0x00fc;
                case 93023532: goto L_0x00f9;
                case 93023594: goto L_0x00f6;
                case 93023628: goto L_0x00f3;
                case 93827654: goto L_0x00e8;
                case 96597995: goto L_0x00dd;
                case 96598030: goto L_0x00da;
                case 96598097: goto L_0x00d7;
                case 96598149: goto L_0x00d4;
                case 96598208: goto L_0x00d1;
                case 96598215: goto L_0x00ce;
                case 96598270: goto L_0x00cb;
                case 96598274: goto L_0x00c8;
                case 96598350: goto L_0x00c5;
                case 96598352: goto L_0x00c2;
                case 96598365: goto L_0x00bf;
                case 96598431: goto L_0x00bc;
                case 96598505: goto L_0x00b9;
                case 96598522: goto L_0x00b6;
                case 96598532: goto L_0x00b3;
                case 96598570: goto L_0x00b0;
                case 96598582: goto L_0x00ad;
                case 97640681: goto L_0x00a2;
                case 97640715: goto L_0x009f;
                case 97640743: goto L_0x009c;
                case 97641048: goto L_0x0099;
                case 97641233: goto L_0x0096;
                case 99487714: goto L_0x008b;
                case 104135123: goto L_0x0080;
                case 109617005: goto L_0x0075;
                case 109617346: goto L_0x0072;
                case 109646445: goto L_0x006b;
                case 109647137: goto L_0x0066;
                case 110063884: goto L_0x005b;
                default: goto L_0x005a;
            }
        L_0x005a:
            return r6
        L_0x005b:
            java.lang.String r0 = "ta-MY"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0014
            java.lang.String r6 = "ta-IN"
            return r6
        L_0x0066:
            boolean r0 = r6.equals(r4)
            goto L_0x006f
        L_0x006b:
            boolean r0 = r6.equals(r2)
        L_0x006f:
            if (r0 == 0) goto L_0x0014
            return r3
        L_0x0072:
            java.lang.String r0 = "sq-XK"
            goto L_0x0077
        L_0x0075:
            java.lang.String r0 = "sq-MK"
        L_0x0077:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0014
            java.lang.String r6 = "sq-AL"
            return r6
        L_0x0080:
            java.lang.String r0 = "ms-BN"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0014
            java.lang.String r6 = "ms-MY"
            return r6
        L_0x008b:
            java.lang.String r0 = "hr-BA"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0014
            java.lang.String r6 = "hr-HR"
            return r6
        L_0x0096:
            java.lang.String r0 = "fr-TD"
            goto L_0x00a4
        L_0x0099:
            java.lang.String r0 = "fr-NE"
            goto L_0x00a4
        L_0x009c:
            java.lang.String r0 = "fr-DJ"
            goto L_0x00a4
        L_0x009f:
            java.lang.String r0 = "fr-CM"
            goto L_0x00a4
        L_0x00a2:
            java.lang.String r0 = "fr-BJ"
        L_0x00a4:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0014
            java.lang.String r6 = "fr-FR"
            return r6
        L_0x00ad:
            java.lang.String r0 = "en-UG"
            goto L_0x00df
        L_0x00b0:
            java.lang.String r0 = "en-TZ"
            goto L_0x00df
        L_0x00b3:
            java.lang.String r0 = "en-SS"
            goto L_0x00df
        L_0x00b6:
            java.lang.String r0 = "en-SI"
            goto L_0x00df
        L_0x00b9:
            java.lang.String r0 = "en-RW"
            goto L_0x00df
        L_0x00bc:
            java.lang.String r0 = "en-PK"
            goto L_0x00df
        L_0x00bf:
            java.lang.String r0 = "en-NG"
            goto L_0x00df
        L_0x00c2:
            java.lang.String r0 = "en-MY"
            goto L_0x00df
        L_0x00c5:
            java.lang.String r0 = "en-MW"
            goto L_0x00df
        L_0x00c8:
            java.lang.String r0 = "en-KI"
            goto L_0x00df
        L_0x00cb:
            java.lang.String r0 = "en-KE"
            goto L_0x00df
        L_0x00ce:
            java.lang.String r0 = "en-IL"
            goto L_0x00df
        L_0x00d1:
            java.lang.String r0 = "en-IE"
            goto L_0x00df
        L_0x00d4:
            java.lang.String r0 = "en-GH"
            goto L_0x00df
        L_0x00d7:
            java.lang.String r0 = "en-ER"
            goto L_0x00df
        L_0x00da:
            java.lang.String r0 = "en-CM"
            goto L_0x00df
        L_0x00dd:
            java.lang.String r0 = "en-BI"
        L_0x00df:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0014
            java.lang.String r6 = "en-GB"
            return r6
        L_0x00e8:
            java.lang.String r0 = "bn-IN"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0014
            java.lang.String r6 = "bn-BD"
            return r6
        L_0x00f3:
            java.lang.String r0 = "ar-TD"
            goto L_0x0116
        L_0x00f6:
            java.lang.String r0 = "ar-SA"
            goto L_0x0116
        L_0x00f9:
            java.lang.String r0 = "ar-QA"
            goto L_0x0116
        L_0x00fc:
            java.lang.String r0 = "ar-OM"
            goto L_0x0116
        L_0x00ff:
            java.lang.String r0 = "ar-LB"
            goto L_0x0116
        L_0x0102:
            java.lang.String r0 = "ar-KW"
            goto L_0x0116
        L_0x0105:
            java.lang.String r0 = "ar-KM"
            goto L_0x0116
        L_0x0108:
            java.lang.String r0 = "ar-IL"
            goto L_0x0116
        L_0x010b:
            java.lang.String r0 = "ar-ER"
            goto L_0x0116
        L_0x010e:
            java.lang.String r0 = "ar-DJ"
            goto L_0x0116
        L_0x0111:
            java.lang.String r0 = "ar-BH"
            goto L_0x0116
        L_0x0114:
            java.lang.String r0 = "ar-AE"
        L_0x0116:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0014
            java.lang.String r6 = "ar-EG"
            return r6
        L_0x011f:
            int r0 = r6.hashCode()
            switch(r0) {
                case 93261389: goto L_0x016e;
                case 106369665: goto L_0x0163;
                case 109646445: goto L_0x015a;
                case 109646959: goto L_0x0151;
                case 109647137: goto L_0x0148;
                case 111732429: goto L_0x013d;
                case 115813226: goto L_0x0132;
                case 115813762: goto L_0x0127;
                default: goto L_0x0126;
            }
        L_0x0126:
            return r6
        L_0x0127:
            java.lang.String r0 = "zh-TW"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0014
            java.lang.String r6 = "zh-Hant-TW"
            return r6
        L_0x0132:
            java.lang.String r0 = "zh-CN"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0014
            java.lang.String r6 = "zh-Hans-CN"
            return r6
        L_0x013d:
            java.lang.String r0 = "uz-UZ"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0014
            java.lang.String r6 = "uz-Latn-UZ"
            return r6
        L_0x0148:
            boolean r0 = r6.equals(r4)
            if (r0 == 0) goto L_0x0014
            java.lang.String r6 = "sr-Cyrl-XK"
            return r6
        L_0x0151:
            boolean r0 = r6.equals(r3)
            if (r0 == 0) goto L_0x0014
            java.lang.String r6 = "sr-Cyrl-RS"
            return r6
        L_0x015a:
            boolean r0 = r6.equals(r2)
            if (r0 == 0) goto L_0x0014
            java.lang.String r6 = "sr-Cyrl-BA"
            return r6
        L_0x0163:
            java.lang.String r0 = "pa-IN"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0014
            java.lang.String r6 = "pa-Guru-IN"
            return r6
        L_0x016e:
            java.lang.String r0 = "az-AZ"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0014
            java.lang.String r6 = "az-Latn-AZ"
            return r6
        L_0x0179:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0179 }
            throw r0
        L_0x017c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x017c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9ZR.A00(java.lang.String):java.lang.String");
    }

    public static String A01(Locale locale) {
        String A03;
        Object obj;
        String str;
        String language = locale.getLanguage();
        if (language.equals("pt")) {
            AnonymousClass007 r2 = AnonymousClass9BF.A00;
            HashSet hashSet = C26621Kw.A00;
            if (AnonymousClass1MD.A01.contains(locale.getCountry())) {
                str = "pt-PT";
            } else {
                str = "pt-BR";
            }
            obj = r2.get(str);
        } else {
            if (language.equals("zh")) {
                HashSet hashSet2 = C26621Kw.A00;
                if ("HK".equals(locale.getCountry())) {
                    A03 = "zh-HK";
                } else if ("Hans".equals(C26621Kw.A04(locale))) {
                    A03 = "zh-Hans";
                } else {
                    A03 = "zh-TW";
                }
            } else {
                A03 = C26621Kw.A03(locale);
            }
            obj = AnonymousClass9BF.A00.get(A03);
        }
        String str2 = (String) obj;
        if (str2 == null) {
            return locale.getDisplayLanguage(locale);
        }
        return str2;
    }
}
