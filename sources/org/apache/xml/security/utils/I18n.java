package org.apache.xml.security.utils;

import X.AnonymousClass000;
import X.C165597tg;
import X.C90514aH;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import org.apache.xml.security.Init;

public class I18n {
    public static String a;
    public static String b;
    public static ResourceBundle c;
    public static boolean d;
    public static String e;
    public static String f;

    public static String a(String str) {
        return b(str);
    }

    public static String a(String str, Exception exc) {
        try {
            Object[] objArr = new Object[1];
            C90514aH.A1U(exc, objArr, 0);
            return MessageFormat.format(c.getString(str), objArr);
        } catch (Throwable unused) {
            if (!Init.c) {
                return "You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library.";
            }
            StringBuffer A0o = C165597tg.A0o(str);
            A0o.append("\". Original Exception was a ");
            A0o.append(AnonymousClass000.A0k(exc));
            A0o.append(" and message ");
            return C165597tg.A0n(exc.getMessage(), A0o);
        }
    }

    public static String a(String str, Object[] objArr) {
        return b(str, objArr);
    }

    public static void a(String str, String str2) {
        a = str;
        if (str == null) {
            a = Locale.getDefault().getLanguage();
        }
        b = str2;
        if (str2 == null) {
            str2 = Locale.getDefault().getCountry();
            b = str2;
        }
        b(a, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r2 != null) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (r3 != null) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(java.lang.String r2, java.lang.String r3) {
        /*
            boolean r0 = d
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = e
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = f
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0019
            return
        L_0x0015:
            if (r2 == 0) goto L_0x0037
        L_0x0017:
            if (r3 == 0) goto L_0x0037
        L_0x0019:
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x0037
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x0037
            e = r2
            f = r3
        L_0x0029:
            java.util.Locale r1 = new java.util.Locale
            r1.<init>(r2, r3)
            java.lang.String r0 = "org/apache/xml/security/resource/xmlsecurity"
            java.util.ResourceBundle r0 = java.util.ResourceBundle.getBundle(r0, r1)
            c = r0
            return
        L_0x0037:
            java.lang.String r3 = b
            f = r3
            java.lang.String r2 = a
            e = r2
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.xml.security.utils.I18n.b(java.lang.String, java.lang.String):void");
    }

    public static String b(String str, Object[] objArr) {
        try {
            return MessageFormat.format(c.getString(str), objArr);
        } catch (Throwable unused) {
            if (Init.c) {
                return C165597tg.A0n("\"", C165597tg.A0o(str));
            }
            return "You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library.";
        }
    }

    public static String b(String str) {
        try {
            return c.getString(str);
        } catch (Throwable unused) {
            if (Init.c) {
                return C165597tg.A0n("\"", C165597tg.A0o(str));
            }
            return "You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library.";
        }
    }
}
