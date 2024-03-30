package X;

import android.content.res.Resources;
import java.util.Locale;

/* renamed from: X.3SY  reason: invalid class name */
public abstract class AnonymousClass3SY {
    public static final String A00(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        String upperCase = C36431kI.A16(0, 1, str).toUpperCase(Locale.ROOT);
        AnonymousClass00C.A08(upperCase);
        A0u.append(upperCase);
        String substring = str.substring(1);
        AnonymousClass00C.A08(substring);
        return AnonymousClass000.A0q(substring, A0u);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A01(X.C19730wQ r4, X.C21060yb r5, X.C18820ts r6, X.AnonymousClass13J r7) {
        /*
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            X.C36321k7.A11(r5, r7, r6)
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r2 = X.AnonymousClass9ZR.A01(r1)
            X.AnonymousClass00C.A08(r2)
            java.lang.String[] r0 = X.C26621Kw.A04
            java.lang.String r1 = r1.toLanguageTag()
            X.AnonymousClass00C.A08(r1)
            X.3IV r0 = new X.3IV
            r0.<init>(r2, r1)
            r3.add(r0)
            java.util.Locale r1 = A02()
            boolean r0 = A03()
            if (r0 != 0) goto L_0x0047
            java.lang.String r2 = X.AnonymousClass9ZR.A01(r1)
            X.AnonymousClass00C.A08(r2)
            java.lang.String r1 = r1.toLanguageTag()
            X.AnonymousClass00C.A08(r1)
            X.3IV r0 = new X.3IV
            r0.<init>(r2, r1)
            r3.add(r0)
        L_0x0047:
            r4.A0G()
            com.whatsapp.Me r0 = r4.A00
            if (r0 == 0) goto L_0x009d
            java.lang.String r5 = r0.cc
            java.lang.String r2 = r0.number
            java.util.Locale r1 = r6.A05
            java.util.Locale r0 = r6.A04
            X.3Rk r4 = new X.3Rk
            r4.<init>(r5, r2, r1, r0)
        L_0x005b:
            int r0 = r4.A01
            if (r0 <= 0) goto L_0x00cb
            r5 = 0
        L_0x0060:
            int r0 = r4.A01
            if (r5 >= r0) goto L_0x00d0
            java.lang.String[] r0 = r4.A04
            r2 = r0[r5]
            X.AnonymousClass00C.A05(r2)
            java.util.Iterator r1 = r3.iterator()
        L_0x006f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0086
            java.lang.Object r0 = r1.next()
            X.3IV r0 = (X.AnonymousClass3IV) r0
            java.lang.String r0 = r0.A00
            boolean r0 = X.AnonymousClass00C.A0J(r0, r2)
            if (r0 == 0) goto L_0x006f
        L_0x0083:
            int r5 = r5 + 1
            goto L_0x0060
        L_0x0086:
            java.lang.String[] r0 = r4.A04
            r2 = r0[r5]
            X.AnonymousClass00C.A05(r2)
            java.lang.String[] r0 = r4.A05
            r1 = r0[r5]
            X.AnonymousClass00C.A05(r1)
            X.3IV r0 = new X.3IV
            r0.<init>(r2, r1)
            r3.add(r0)
            goto L_0x0083
        L_0x009d:
            android.telephony.TelephonyManager r0 = r5.A0K()
            if (r0 == 0) goto L_0x00cb
            java.lang.String r1 = r0.getSimCountryIso()
            if (r1 == 0) goto L_0x00cb
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00cb
            java.util.Locale r0 = java.util.Locale.getDefault()
            X.AnonymousClass00C.A08(r0)
            java.lang.String r2 = r1.toUpperCase(r0)
            X.AnonymousClass00C.A08(r2)
            java.util.Locale r1 = A02()
            java.util.Locale r0 = java.util.Locale.getDefault()
            X.3Rk r4 = new X.3Rk
            r4.<init>(r2, r1, r0)
            goto L_0x005b
        L_0x00cb:
            java.lang.String r0 = "LanguageSelectorUtils/error getting locale data"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00d0:
            java.util.Set r0 = X.AnonymousClass9BF.A05
            X.AnonymousClass00C.A09(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x00d9:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0110
            java.lang.String r4 = X.AnonymousClass001.A0C(r5)
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r4)
            java.lang.String r2 = X.AnonymousClass9ZR.A01(r0)
            X.AnonymousClass00C.A08(r2)
            java.util.Iterator r1 = r3.iterator()
        L_0x00f2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0107
            java.lang.Object r0 = r1.next()
            X.3IV r0 = (X.AnonymousClass3IV) r0
            java.lang.String r0 = r0.A00
            boolean r0 = X.AnonymousClass00C.A0J(r0, r2)
            if (r0 == 0) goto L_0x00f2
            goto L_0x00d9
        L_0x0107:
            X.3IV r0 = new X.3IV
            r0.<init>(r2, r4)
            r3.add(r0)
            goto L_0x00d9
        L_0x0110:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3SY.A01(X.0wQ, X.0yb, X.0ts, X.13J):java.util.ArrayList");
    }

    public static final Locale A02() {
        Locale locale = Resources.getSystem().getConfiguration().locale;
        AnonymousClass00C.A07(locale);
        return locale;
    }

    public static final boolean A03() {
        return AnonymousClass00C.A0J(Locale.getDefault().getLanguage(), A02().getLanguage());
    }
}
