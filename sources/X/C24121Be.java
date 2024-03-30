package X;

import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* renamed from: X.1Be  reason: invalid class name and case insensitive filesystem */
public class C24121Be {
    public String A00 = "static.whatsapp.net";
    public final AnonymousClass1BS A01;
    public final C19770wU A02;
    public final C20810yC A03;
    public final Object A04 = new Object();

    public static void A00(C24121Be r7) {
        AnonymousClass65F r3;
        synchronized (r7.A04) {
            C19770wU r32 = r7.A02;
            AnonymousClass1BS r2 = r7.A01;
            Objects.requireNonNull(r2);
            r32.Boy(new C35731jA((Object) r2, 33));
            C124815yq A0B = r2.A0B();
            String str = "static.whatsapp.net";
            if (A0B != null) {
                List list = A0B.A0A;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            r3 = (AnonymousClass65F) it2.next();
                            if ("primary".equals(r3.A08)) {
                                break;
                            }
                        }
                    } else {
                        r3 = (AnonymousClass65F) it.next();
                        Set set = r3.A0A;
                        if (set != null && set.contains("1")) {
                            break;
                        }
                    }
                }
                str = r3.A04;
            }
            r7.A00 = str;
        }
    }

    public String A01(String str) {
        if (!C20800yB.A01(C21000yV.A02, this.A03, 2565)) {
            return str;
        }
        A00(this);
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = parse.buildUpon();
        Uri.Builder encodedAuthority = buildUpon.scheme("https").encodedAuthority(this.A00);
        StringBuilder sb = new StringBuilder();
        sb.append("wa/static");
        sb.append(parse.getEncodedPath());
        encodedAuthority.encodedPath(sb.toString());
        return C148366yk.A02(Uri.parse(buildUpon.build().toString()).buildUpon(), "_nc_cat", "1").build().toString();
    }

    public C24121Be(C20810yC r2, AnonymousClass1BS r3, C19770wU r4) {
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = r2;
    }
}
