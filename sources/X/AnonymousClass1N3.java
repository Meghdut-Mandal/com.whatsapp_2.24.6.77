package X;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1N3  reason: invalid class name */
public class AnonymousClass1N3 {
    public static final Map A05;
    public final C24801Dv A00;
    public final AnonymousClass17Y A01;
    public final C21060yb A02;
    public final C18820ts A03;
    public final AnonymousClass1M4 A04;

    static {
        HashMap hashMap = new HashMap();
        A05 = hashMap;
        hashMap.put("terms-of-service", "https://www.whatsapp.com/legal/#terms-of-service");
        hashMap.put("privacy-policy", "https://www.whatsapp.com/legal/#privacy-policy");
        hashMap.put("end-to-end-encryption", "https://faq.whatsapp.com/general/28030015/");
        hashMap.put("facebook-companies", "https://www.facebook.com/help/111814505650678");
        hashMap.put("how-whatsapp-works-with-the-meta-companies", "https://www.whatsapp.com/legal/privacy-policy-eea#privacy-policy-how-we-work-with-other-meta-companies");
        hashMap.put("privacy-policy-managing-and-deleting-your-information", "https://www.whatsapp.com/legal/#privacy-policy-managing-and-deleting-your-information");
        hashMap.put("privacy-policy-our-global-operations", "https://www.whatsapp.com/legal/#privacy-policy-our-global-operations");
        hashMap.put("terms-of-service-age", "https://www.whatsapp.com/legal/terms-of-service");
        hashMap.put("cookies", "https://www.whatsapp.com/legal/#cookies");
    }

    public Uri A01(String str, boolean z, boolean z2, boolean z3) {
        StringBuilder sb;
        String str2;
        if (z) {
            sb = new StringBuilder();
            if (z3) {
                sb.append(str);
                str2 = "-uk/preview";
            } else {
                sb.append(str);
                str2 = "-uk";
            }
        } else {
            if (z2) {
                sb = new StringBuilder();
                if (z3) {
                    sb.append(str);
                    str2 = "-eea/preview";
                } else {
                    sb.append(str);
                    str2 = "-eea";
                }
            }
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            C18820ts r2 = this.A03;
            buildUpon.appendQueryParameter("lg", r2.A06());
            buildUpon.appendQueryParameter("lc", r2.A05());
            buildUpon.build().toString();
            return buildUpon.build();
        }
        sb.append(str2);
        str = sb.toString();
        Uri.Builder buildUpon2 = Uri.parse(str).buildUpon();
        C18820ts r22 = this.A03;
        buildUpon2.appendQueryParameter("lg", r22.A06());
        buildUpon2.appendQueryParameter("lc", r22.A05());
        buildUpon2.build().toString();
        return buildUpon2.build();
    }

    public AnonymousClass1N3(C24801Dv r1, AnonymousClass17Y r2, C21060yb r3, C18820ts r4, AnonymousClass1M4 r5) {
        this.A01 = r2;
        this.A04 = r5;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
    }

    public Uri A00(String str) {
        String str2;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        C18820ts r2 = this.A03;
        buildUpon.appendQueryParameter("lg", r2.A06());
        buildUpon.appendQueryParameter("lc", r2.A05());
        if (this.A04.A04()) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        buildUpon.appendQueryParameter("eea", str2);
        return buildUpon.build();
    }
}
