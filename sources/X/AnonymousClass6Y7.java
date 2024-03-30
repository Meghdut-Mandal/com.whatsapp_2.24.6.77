package X;

import android.graphics.Color;
import android.widget.ImageView;
import java.text.NumberFormat;
import java.text.ParseException;

/* renamed from: X.6Y7  reason: invalid class name */
public abstract class AnonymousClass6Y7 {
    public static final ThreadLocal A00 = new C82243yO("#dp");
    public static final ThreadLocal A01 = new C82243yO("#%");
    public static final ThreadLocal A02 = new C82243yO("#px");
    public static final ThreadLocal A03 = new C82243yO("#sp");

    public static float A00(String str) {
        try {
            return A03(str, A01) * 100.0f;
        } catch (ParseException e) {
            throw new AnonymousClass5R5(AnonymousClass000.A0p("can't parse pixel value: ", str, AnonymousClass000.A0u()), e);
        }
    }

    public static float A01(String str) {
        try {
            if (str.endsWith("px")) {
                return A03(str, A02);
            }
            if (str.endsWith("sp")) {
                return (float) C90514aH.A06(A03(str, A03), AnonymousClass000.A0X(AnonymousClass6NR.A00().A00).scaledDensity);
            }
            if (C90514aH.A1Z(str)) {
                return A00(str);
            }
            return (float) C90514aH.A06(A03(str, A00), ((float) AnonymousClass000.A0X(AnonymousClass6NR.A00().A00).densityDpi) / 160.0f);
        } catch (ParseException e) {
            throw new AnonymousClass5R5(AnonymousClass000.A0p("can't parse pixel value: ", str, AnonymousClass000.A0u()), e);
        }
    }

    public static float A02(String str) {
        try {
            return A03(str, A03);
        } catch (ParseException e) {
            throw new AnonymousClass5R5(AnonymousClass000.A0p("can't parse scaled pixel value: ", str, AnonymousClass000.A0u()), e);
        }
    }

    public static C130746Mg A0A(String str) {
        float A012;
        Integer num;
        if ("auto".equalsIgnoreCase(str)) {
            return C130746Mg.A02;
        }
        if (C90514aH.A1Z(str)) {
            A012 = Float.parseFloat(str.substring(0, str.length() - 1));
            num = C023109s.A01;
        } else {
            A012 = A01(str);
            num = C023109s.A00;
        }
        return new C130746Mg(num, A012);
    }

    public static float A03(String str, ThreadLocal threadLocal) {
        return ((NumberFormat) threadLocal.get()).parse(str).floatValue();
    }

    public static int A04(String str) {
        try {
            return Color.parseColor(str);
        } catch (IllegalArgumentException e) {
            throw new AnonymousClass5R5(AnonymousClass000.A0p("can't parse color value: ", str, AnonymousClass000.A0u()), e);
        }
    }

    public static int A05(String str) {
        switch (str.hashCode()) {
            case -1078030475:
                if (str.equals("medium")) {
                    return 2;
                }
                break;
            case 3154575:
                if (str.equals("full")) {
                    return 0;
                }
                break;
            case 3327612:
                if (str.equals("long")) {
                    return 1;
                }
                break;
            case 109413500:
                if (str.equals("short")) {
                    return 3;
                }
                break;
        }
        throw new AnonymousClass5R5(AnonymousClass000.A0p("Can't parse unknown datetime format: ", str, AnonymousClass000.A0u()));
    }

    public static int A06(String str) {
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    return 1;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    return 8388613;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    return 8388611;
                }
                break;
        }
        throw new AnonymousClass5R5(AnonymousClass000.A0p("can't parse unknown textAlign: ", str, AnonymousClass000.A0u()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        throw new X.AnonymousClass5R5(X.AnonymousClass000.A0p("can't parse unknown inputType: ", r2, X.AnonymousClass000.A0u()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009e, code lost:
        switch(r0.ordinal()) {
            case 0: goto L_0x00c4;
            case 1: goto L_0x00c2;
            case 2: goto L_0x00bf;
            case 3: goto L_0x00bd;
            case 4: goto L_0x00ba;
            case 5: goto L_0x00b7;
            case 6: goto L_0x00b4;
            case 7: goto L_0x00b1;
            case 8: goto L_0x00ad;
            case 9: goto L_0x00a9;
            case 10: goto L_0x00a5;
            default: goto L_0x00a1;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a1, code lost:
        return 655361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a5, code lost:
        return 135169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a9, code lost:
        return 180225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ad, code lost:
        return 139265;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b1, code lost:
        return 20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b4, code lost:
        return 12290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b7, code lost:
        return 18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ba, code lost:
        return 129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bd, code lost:
        return 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00bf, code lost:
        return 33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c2, code lost:
        return 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c4, code lost:
        return 131073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A07(java.lang.String r2) {
        /*
            int r0 = r2.hashCode()
            switch(r0) {
                case -2141169668: goto L_0x0090;
                case -2066832464: goto L_0x0085;
                case -1831299680: goto L_0x007a;
                case -1413853096: goto L_0x006f;
                case -1034364087: goto L_0x0064;
                case 3076014: goto L_0x0059;
                case 3556653: goto L_0x004e;
                case 96619420: goto L_0x0043;
                case 106642798: goto L_0x0038;
                case 260133443: goto L_0x002d;
                case 1216389502: goto L_0x0022;
                case 1216985755: goto L_0x0017;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "can't parse unknown inputType: "
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r2, r1)
            X.5R5 r0 = new X.5R5
            r0.<init>(r1)
            throw r0
        L_0x0017:
            java.lang.String r0 = "password"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.5Sz r0 = X.C108305Sz.PASSWORD
            goto L_0x009a
        L_0x0022:
            java.lang.String r0 = "passcode"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.5Sz r0 = X.C108305Sz.PASSCODE
            goto L_0x009a
        L_0x002d:
            java.lang.String r0 = "cap_sentences"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.5Sz r0 = X.C108305Sz.CAP_SENTENCES
            goto L_0x009a
        L_0x0038:
            java.lang.String r0 = "phone"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.5Sz r0 = X.C108305Sz.PHONE
            goto L_0x009a
        L_0x0043:
            java.lang.String r0 = "email"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.5Sz r0 = X.C108305Sz.EMAIL
            goto L_0x009a
        L_0x004e:
            java.lang.String r0 = "text"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.5Sz r0 = X.C108305Sz.TEXT
            goto L_0x009a
        L_0x0059:
            java.lang.String r0 = "date"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.5Sz r0 = X.C108305Sz.DATE
            goto L_0x009a
        L_0x0064:
            java.lang.String r0 = "number"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.5Sz r0 = X.C108305Sz.NUMBER
            goto L_0x009a
        L_0x006f:
            java.lang.String r0 = "amount"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.5Sz r0 = X.C108305Sz.AMOUNT
            goto L_0x009a
        L_0x007a:
            java.lang.String r0 = "cap_letters"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.5Sz r0 = X.C108305Sz.CAP_LETTERS
            goto L_0x009a
        L_0x0085:
            java.lang.String r0 = "text_no_suggestion"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.5Sz r0 = X.C108305Sz.TEXT_NO_SUGGESTIONS
            goto L_0x009a
        L_0x0090:
            java.lang.String r0 = "cap_words"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.5Sz r0 = X.C108305Sz.CAP_WORDS
        L_0x009a:
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x00c4;
                case 1: goto L_0x00c2;
                case 2: goto L_0x00bf;
                case 3: goto L_0x00bd;
                case 4: goto L_0x00ba;
                case 5: goto L_0x00b7;
                case 6: goto L_0x00b4;
                case 7: goto L_0x00b1;
                case 8: goto L_0x00ad;
                case 9: goto L_0x00a9;
                case 10: goto L_0x00a5;
                default: goto L_0x00a1;
            }
        L_0x00a1:
            r0 = 655361(0xa0001, float:9.18356E-40)
            return r0
        L_0x00a5:
            r0 = 135169(0x21001, float:1.89412E-40)
            return r0
        L_0x00a9:
            r0 = 180225(0x2c001, float:2.52549E-40)
            return r0
        L_0x00ad:
            r0 = 139265(0x22001, float:1.95152E-40)
            return r0
        L_0x00b1:
            r0 = 20
            return r0
        L_0x00b4:
            r0 = 12290(0x3002, float:1.7222E-41)
            return r0
        L_0x00b7:
            r0 = 18
            return r0
        L_0x00ba:
            r0 = 129(0x81, float:1.81E-43)
            return r0
        L_0x00bd:
            r0 = 3
            return r0
        L_0x00bf:
            r0 = 33
            return r0
        L_0x00c2:
            r0 = 2
            return r0
        L_0x00c4:
            r0 = 131073(0x20001, float:1.83672E-40)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Y7.A07(java.lang.String):int");
    }

    public static int A08(String str) {
        switch (str.hashCode()) {
            case -1178781136:
                if (str.equals("italic")) {
                    return 2;
                }
                break;
            case -1078030475:
                if (str.equals("medium")) {
                    A0B("medium", "bold");
                    return 1;
                }
                break;
            case -1039745817:
                if (str.equals("normal")) {
                    return 0;
                }
                break;
            case 3029637:
                if (str.equals("bold")) {
                    return 1;
                }
                break;
            case 99152071:
                if (str.equals("heavy")) {
                    A0B("heavy", "bold");
                    return 1;
                }
                break;
            case 102970646:
                if (str.equals("light")) {
                    A0B("light", "normal");
                    return 0;
                }
                break;
            case 1223860979:
                if (str.equals("semibold")) {
                    A0B("semibold", "bold");
                    return 1;
                }
                break;
            case 1734741290:
                if (str.equals("bold_italic")) {
                    return 3;
                }
                break;
        }
        throw new AnonymousClass5R5(AnonymousClass000.A0p("can't parse unknown typeface: ", str, AnonymousClass000.A0u()));
    }

    public static ImageView.ScaleType A09(String str) {
        switch (str.hashCode()) {
            case -1881872635:
                if (str.equals("stretch")) {
                    return ImageView.ScaleType.FIT_XY;
                }
                break;
            case 94852023:
                if (str.equals("cover")) {
                    return ImageView.ScaleType.CENTER_CROP;
                }
                break;
            case 951526612:
                if (str.equals("contain")) {
                    return ImageView.ScaleType.FIT_CENTER;
                }
                break;
        }
        throw new AnonymousClass5R5(AnonymousClass000.A0p("can't parse unknown scaleType: ", str, AnonymousClass000.A0u()));
    }

    public static void A0B(String str, String str2) {
        AnonymousClass6RS.A01("text_style_ignored", AnonymousClass000.A0p(" is not supported, defaulting to ", str2, AnonymousClass000.A0v(str)));
    }
}
