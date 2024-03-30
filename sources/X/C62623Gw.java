package X;

import android.app.ProgressDialog;
import android.net.Uri;
import android.telephony.TelephonyManager;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.3Gw  reason: invalid class name and case insensitive filesystem */
public final class C62623Gw {
    public C49972jz A00;
    public final C20050ww A01;
    public final C18820ts A02;
    public final C62603Gu A03;
    public final AnonymousClass13E A04;
    public final C20380xT A05;
    public final C19770wU A06;

    public final void A01(C225314u r12, AnonymousClass1X8 r13, String str) {
        String str2;
        String obj;
        C36321k7.A0v(r13, 1, str);
        C49972jz r0 = this.A00;
        if (r0 != null) {
            r0.A0D(true);
        }
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority("faq.whatsapp.com");
        Uri.Builder appendPath = builder.appendPath("verification.php");
        C18820ts r02 = this.A02;
        String A052 = r02.A05();
        String A062 = r02.A06();
        AnonymousClass1X8.A00(r13);
        C21060yb r7 = r13.A09;
        TelephonyManager A0K = r7.A0K();
        if (A0K != null) {
            str2 = C65603St.A01(A0K.getNetworkOperator(), "000-000");
        } else {
            str2 = "none";
        }
        HashMap A0J = AnonymousClass001.A0J();
        if (r13.A00 != null) {
            A0J.put("platform", "android");
            A0J.put("network", str2);
            A0J.put("lc", A052);
            A0J.put("lg", A062);
            A0J.put("context", r13.A00);
            AnonymousClass1X8.A00(r13);
            StringBuilder A0u = AnonymousClass000.A0u();
            if (C18750th.A0F(r7)) {
                A0u.append("rted ");
            }
            try {
                Class.forName("org.acra.ACRA");
                A0u.append("nw-wap ");
            } catch (ClassNotFoundException unused) {
            }
            if (A0u.length() == 0) {
                obj = null;
            } else {
                obj = A0u.toString();
            }
            A0J.put("diagnostic", obj);
            String str3 = "true";
            String str4 = "false";
            if (r13.A01) {
                str4 = str3;
            }
            A0J.put("fail_too_many", str4);
            String str5 = "false";
            if (r13.A02) {
                str5 = str3;
            }
            A0J.put("no_route_sms", str5);
            String str6 = "false";
            if (r13.A03) {
                str6 = str3;
            }
            A0J.put("no_route_voice", str6);
            String str7 = "false";
            if (r13.A05) {
                str7 = str3;
            }
            A0J.put("valid_number", str7);
            if (!r13.A04) {
                str3 = "false";
            }
            A0J.put("no_number", str3);
            A0J.put("debug-context", r13.A01(r13.A00));
        }
        Iterator it = A0J.keySet().iterator();
        while (it.hasNext()) {
            String A0C = AnonymousClass001.A0C(it);
            String str8 = (String) A0J.get(A0C);
            if (str8 == null) {
                str8 = "";
            }
            appendPath.appendQueryParameter(A0C, str8);
        }
        C49972jz r4 = new C49972jz(r12, this.A01, this.A03, this.A04, appendPath.toString(), r13.A01(str));
        this.A00 = r4;
        C36441kJ.A1E(r4, this.A06);
    }

    public final void A00() {
        ProgressDialog progressDialog;
        C49972jz r1 = this.A00;
        if (r1 != null && (progressDialog = r1.A00) != null && progressDialog.isShowing()) {
            r1.A00.cancel();
        }
    }

    public C62623Gw(C20050ww r2, C18820ts r3, C62603Gu r4, AnonymousClass13E r5, C20380xT r6, C19770wU r7) {
        C36321k7.A1B(r7, r2, r6, r3, r4);
        AnonymousClass00C.A0D(r5, 6);
        this.A06 = r7;
        this.A01 = r2;
        this.A05 = r6;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
    }
}
