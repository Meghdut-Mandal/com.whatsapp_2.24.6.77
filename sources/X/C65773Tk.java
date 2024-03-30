package X;

import android.net.Uri;
import com.whatsapp.wamsys.SecureUriParser;
import java.util.List;

/* renamed from: X.3Tk  reason: invalid class name and case insensitive filesystem */
public final class C65773Tk {
    public static final C65773Tk A00 = new C65773Tk();

    public final Integer A04(C20810yC r8, AnonymousClass3P8 r9) {
        Uri parseEncodedRFC2396;
        AnonymousClass00C.A0D(r9, 1);
        boolean A01 = A01(r8, r9);
        Integer A0j = C36361kB.A0j();
        if (!A01) {
            if (!A02(r8, r9) || (parseEncodedRFC2396 = SecureUriParser.parseEncodedRFC2396(r9.A01)) == null) {
                return null;
            }
            String queryParameter = parseEncodedRFC2396.getQueryParameter("otp_type");
            if (queryParameter == null) {
                return 0;
            }
            int hashCode = queryParameter.hashCode();
            if (hashCode != -601943542) {
                if (hashCode != 26351735) {
                    if (hashCode == 1470813548 && queryParameter.equals("ZERO_TAP")) {
                        return 1;
                    }
                } else if (!queryParameter.equals("COPY_CODE")) {
                    return null;
                }
            } else if (queryParameter.equals("ONE_TAP")) {
                return 0;
            }
            return null;
        }
        return A0j;
    }

    public static final AnonymousClass3P8 A00(C20810yC r4, AnonymousClass3T1 r5) {
        List<AnonymousClass3P8> list;
        if ((r5 instanceof AnonymousClass2cW) && (list = ((AnonymousClass2cW) r5).A00.A06) != null) {
            for (AnonymousClass3P8 r1 : list) {
                C65773Tk r0 = A00;
                AnonymousClass00C.A0B(r1);
                if (r0.A04(r4, r1) != null) {
                    return r1;
                }
            }
        }
        return null;
    }

    public static final boolean A03(AnonymousClass3T1 r1) {
        if (!(r1 instanceof AnonymousClass2cW) || !AnonymousClass00C.A0J(((AnonymousClass2cW) r1).A00.A04, "AUTHENTICATION")) {
            return false;
        }
        return true;
    }

    public static final boolean A01(C20810yC r3, AnonymousClass3P8 r4) {
        boolean A1V = C36371kC.A1V(r4);
        String A09 = r3.A09(3827);
        if (A09 == null) {
            return A1V;
        }
        if (r4.A06 != 2) {
            return false;
        }
        String str = r4.A01;
        AnonymousClass00C.A07(str);
        if (str.startsWith(A09)) {
            return true;
        }
        return false;
    }

    public static final boolean A02(C20810yC r3, AnonymousClass3P8 r4) {
        boolean A1V = C36371kC.A1V(r4);
        String A09 = r3.A09(3828);
        if (A09 == null) {
            return A1V;
        }
        if (r4.A06 != 2) {
            return false;
        }
        String str = r4.A01;
        AnonymousClass00C.A07(str);
        if (str.startsWith(A09)) {
            return true;
        }
        return false;
    }
}
