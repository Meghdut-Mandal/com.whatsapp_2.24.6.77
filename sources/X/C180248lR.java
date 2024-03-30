package X;

import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Set;

/* renamed from: X.8lR  reason: invalid class name and case insensitive filesystem */
public class C180248lR extends C167677yY {
    public Integer A00;
    public String A01 = null;
    public final AnonymousClass1N3 A02;
    public final C201649k3 A03;

    public C180248lR(AnonymousClass1N3 r10, C19970wo r11, C18820ts r12, AnonymousClass1DW r13, C20810yC r14, C24601Db r15, AnonymousClass1EU r16, C23075B3f b3f, C201649k3 r18) {
        super(r11, r12, r13, r14, r15, r16, b3f);
        this.A02 = r10;
        this.A03 = r18;
    }

    public void A0a(String str) {
        String A0s;
        String A0s2;
        String A0s3;
        String A0s4;
        String A0s5;
        this.A01 = null;
        if (!TextUtils.isEmpty(str) && this.A0B.A04.A03()) {
            try {
                AnonymousClass00C.A0D(str, 0);
                Uri parse = Uri.parse(str);
                List<String> pathSegments = parse.getPathSegments();
                if (((pathSegments.size() == 3 && (A0s3 = C36401kF.A0s(pathSegments, 0)) != null && A0s3.equalsIgnoreCase("pay") && (A0s4 = C36401kF.A0s(pathSegments, 1)) != null && A0s4.equalsIgnoreCase("br") && (A0s5 = C36401kF.A0s(pathSegments, 2)) != null && A0s5.equalsIgnoreCase("add-credential")) || (pathSegments.size() == 2 && (A0s = C36401kF.A0s(pathSegments, 0)) != null && A0s.equalsIgnoreCase("br") && (A0s2 = C36401kF.A0s(pathSegments, 1)) != null && A0s2.equalsIgnoreCase("add-credential"))) && (parse.getQueryParameterNames().contains("pushAccountData") || parse.getQueryParameterNames().contains("pushData"))) {
                    Uri parse2 = Uri.parse(str);
                    Set<String> queryParameterNames = parse2.getQueryParameterNames();
                    if (queryParameterNames.contains("pushAccountData") && this.A06.A0E(1601)) {
                        this.A01 = parse2.getQueryParameter("pushAccountData");
                        this.A00 = C023109s.A00;
                        Log.i("Push Prov deeplink received for MasterCard");
                        C36341k9.A17(this.A00, 2);
                        return;
                    } else if (queryParameterNames.contains("pushData") && this.A06.A0E(2608)) {
                        this.A01 = parse2.getQueryParameter("pushData");
                        this.A00 = C023109s.A01;
                        Log.i("Push Prov deeplink received for VISA");
                        C36341k9.A17(this.A00, 2);
                        return;
                    }
                }
            } catch (NullPointerException | UnsupportedOperationException unused) {
                Log.i("Unable to read query param pushAccountDataorpushData");
            }
        }
        super.A0a(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
        if (r3.A07.A03().getBoolean("payment_brazil_nux_dismissed", false) == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0c(int r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L_0x0016
            X.0yC r0 = r3.A06
            r2 = 0
            X.AnonymousClass00C.A0D(r0, r2)
            X.1Db r0 = r3.A07
            android.content.SharedPreferences r1 = r0.A03()
            java.lang.String r0 = "payment_brazil_nux_dismissed"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 != 0) goto L_0x002c
        L_0x0016:
            X.9k3 r2 = r3.A03
            X.9Xk r1 = r2.A03
            boolean r0 = r1.A03()
            if (r0 == 0) goto L_0x002e
            X.1EU r0 = r3.A08
            java.util.ArrayList r0 = X.C165577te.A0o(r0)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x002e
        L_0x002c:
            r1 = 0
        L_0x002d:
            return r1
        L_0x002e:
            boolean r0 = r1.A03()
            if (r0 == 0) goto L_0x0036
            r1 = 2
            return r1
        L_0x0036:
            boolean r0 = r2.A05()
            r1 = 1
            if (r0 == 0) goto L_0x002d
            r1 = 3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C180248lR.A0c(int):int");
    }
}
