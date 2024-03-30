package X;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.5JY  reason: invalid class name */
public class AnonymousClass5JY extends C148366yk {
    public final C20810yC A00;
    public final String A01;
    public final String A02;

    public String B7t(C1265864p r9, boolean z) {
        Uri.Builder A03;
        String str = this.A01;
        if (!TextUtils.isEmpty(str)) {
            A03 = C90504aG.A0I(C90474aD.A0b(new Uri.Builder().scheme("https").encodedAuthority(r9.A02).encodedPath(str))).appendQueryParameter("direct_ip", String.valueOf(C90504aG.A1T(r9.A00) ? 1 : 0));
            String str2 = this.A02;
            if (!TextUtils.isEmpty(str2)) {
                A03.appendQueryParameter("hash", str2);
            }
        } else {
            A03 = A03(r9);
        }
        String str3 = r9.A03;
        if (str3 != null) {
            C148366yk.A02(A03, "_nc_cat", str3);
        }
        String str4 = this.A02;
        if (str4 != null) {
            A03.appendQueryParameter("mode", str4);
        }
        HashSet A16 = C36441kJ.A16();
        C20810yC r1 = this.A00;
        if (r1 != null) {
            for (String str5 : r1.A09(4836).split(",")) {
                if (Collections.unmodifiableSet(AnonymousClass6IX.A00).contains(str5)) {
                    A16.add(str5);
                } else {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Mms4DownloadUrlGenerator/loadLowHitRateTypes ");
                    A0u.append(str5);
                    C36321k7.A1Z(A0u, " is not a supported media type. ABProps LOW_CACHE_HIT_RATE_MEDIA_TYPES might have corrupted data");
                }
            }
        }
        if (A16.contains(this.A00)) {
            A03.appendQueryParameter("_nc_map", "whatsapp-nofna");
        }
        return C90474aD.A0b(A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        if (r6 != null) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5JY(X.C20810yC r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r1 = this;
            r1.<init>(r3, r4, r5)
            if (r3 != 0) goto L_0x0008
            r0 = 0
            if (r6 == 0) goto L_0x0009
        L_0x0008:
            r0 = 1
        L_0x0009:
            X.C18740tg.A0C(r0)
            r1.A00 = r2
            r1.A01 = r6
            r1.A02 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5JY.<init>(X.0yC, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
