package X;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.2kE  reason: invalid class name and case insensitive filesystem */
public final class C50112kE extends C132446Tt {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C21060yb A03;
    public final C19630wG A04;
    public final C19420v0 A05;
    public final AnonymousClass3UV A06;
    public final C199929gH A07;
    public final AnonymousClass2d2 A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final WeakReference A0F;
    public final boolean A0G;
    public final boolean A0H;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        String str;
        String str2;
        C66713Xa r5;
        byte[] bArr;
        AnonymousClass00C.A0D(objArr, 0);
        AnonymousClass6M2 r2 = C56442wI.A00;
        Context context = this.A04.A00;
        AnonymousClass00C.A08(context);
        String str3 = this.A0D;
        String A012 = r2.A01(context, str3);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RequestCodeTask/method=");
        String str4 = this.A0C;
        A0u.append(str4);
        A0u.append("/useStandaloneVerification=");
        boolean z = this.A0H;
        A0u.append(z);
        A0u.append("/authContext=");
        String str5 = this.A09;
        C36321k7.A1a(A0u, str5);
        C19420v0 r11 = this.A05;
        String string = C36341k9.A0E(r11).getString("com.whatsapp.registration.RegisterPhone.mistyped_state", (String) null);
        TelephonyManager A0K = this.A03.A0K();
        if (A0K != null) {
            str = A0K.getNetworkOperator();
        } else {
            str = null;
        }
        C65603St A002 = C65603St.A00(str);
        if (A0K != null) {
            str2 = A0K.getSimOperator();
        } else {
            str2 = null;
        }
        C65603St A003 = C65603St.A00(str2);
        if (!z) {
            if (AnonymousClass00C.A0J(str4, "autoconf")) {
                bArr = this.A07.A03(this.A0E);
                if (bArr == null || AnonymousClass000.A1Q(bArr.length)) {
                    Log.e("RequestCodeTaskdoInBackground/no valid clientStartMessage, skip sending autoconf code request");
                    return C36441kJ.A0W(C52082or.ERROR_UNSPECIFIED, (Object) null);
                }
            } else {
                bArr = null;
            }
            AnonymousClass3UV r6 = this.A06;
            String str6 = this.A0B;
            int i = this.A01;
            int i2 = this.A02;
            int i3 = this.A00;
            String str7 = C65983Uf.A00;
            AnonymousClass00C.A09(str7);
            String str8 = this.A0A;
            AnonymousClass2d2 r7 = this.A08;
            AnonymousClass00C.A0D(str6, 0);
            C36331k8.A1G(str3, 1, str4);
            AnonymousClass00C.A0D(r7, 14);
            if (!r6.A0I()) {
                r5 = new C66713Xa(C52082or.ERROR_FAIL_TO_INITIALIZE_WAMSYS);
            } else {
                r6.A0H(true);
                byte[] A0K2 = r6.A0K(str6, str3);
                byte[] A0J = r6.A0J("requestCode");
                LinkedHashMap A004 = AnonymousClass3UV.A00(r6, r7, A002, A003, str7, string, str8);
                AnonymousClass3UV.A08(r6, A004);
                AnonymousClass3UV.A05(r6, A004);
                AnonymousClass3UV.A07(r6, A004);
                AnonymousClass3UV.A04(r6, A004);
                AnonymousClass3UV.A06(r6, A004);
                AnonymousClass3UV.A09(r6, A004);
                String string2 = C36341k9.A0E(r6.A06).getString("pref_autoconf_feo2_query_status", "did_not_query");
                C18740tg.A06(string2);
                AnonymousClass00C.A08(string2);
                A004.put("feo2_query_status", C36351kA.A1b(string2));
                AnonymousClass3Sd r72 = r6.A09;
                String A0G2 = r6.A0G(str6, "code_entrypoint");
                List A022 = AnonymousClass3UV.A02(r6);
                int i4 = i;
                int i5 = i2;
                int i6 = i3;
                r5 = (C66713Xa) AnonymousClass3PM.A00(new C50482kz(r6.A08, r72, str6, str3, A012, str4, str5, A0G2, A022, A004, A0K2, A0J, bArr, i4, i5, i6));
            }
        } else if (str5 != null) {
            try {
                AnonymousClass3UV r52 = this.A06;
                String str9 = this.A0B;
                String str10 = C65983Uf.A00;
                AnonymousClass00C.A09(str10);
                String str11 = this.A0A;
                AnonymousClass2d2 r62 = this.A08;
                AnonymousClass00C.A0D(str9, 0);
                C36331k8.A1G(str3, 1, str4);
                AnonymousClass00C.A0D(r62, 10);
                if (!r52.A0I()) {
                    r5 = new C66713Xa(C52082or.ERROR_FAIL_TO_INITIALIZE_WAMSYS);
                } else {
                    r52.A0H(true);
                    byte[] A0K3 = r52.A0K(str9, str3);
                    byte[] A0J2 = r52.A0J("requestCodeForStandaloneVerification");
                    LinkedHashMap A005 = AnonymousClass3UV.A00(r52, r62, A002, A003, str10, string, str11);
                    r5 = (C66713Xa) AnonymousClass3PM.A00(new C50452kw(r52.A08, r52.A09, str9, str3, A012, str4, str5, AnonymousClass3UV.A02(r52), A005, A0K3, A0J2));
                }
            } catch (Exception e) {
                C36351kA.A1Q("/error ", C36331k8.A0k("RequestCodeTask/doInBackground/", str4), e);
                return C36441kJ.A0W(C52082or.ERROR_UNSPECIFIED, (Object) null);
            }
        } else {
            throw AnonymousClass001.A09("Required value was null.");
        }
        if (r5 == null) {
            Log.e("RequestCodeTask/doInBackground/null requestCodeResult");
            return C36441kJ.A0W(C52082or.ERROR_UNSPECIFIED, (Object) null);
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("RequestCodeTask/code entrypoint response/autoconfType=");
        A0u2.append(r5.A00);
        A0u2.append("/non-null authChallenge=");
        A0u2.append(AnonymousClass000.A1V(r5.A0A));
        A0u2.append("/emailOtpEligible=");
        A0u2.append(r5.A01);
        A0u2.append("/resetMethod=");
        A0u2.append(r5.A0J);
        A0u2.append("/wipeWait=");
        A0u2.append(r5.A04);
        A0u2.append("/smsWait=");
        A0u2.append(r5.A0M);
        A0u2.append(";voiceWait=");
        A0u2.append(r5.A0O);
        A0u2.append(";waOldWait=");
        A0u2.append(r5.A0P);
        A0u2.append(";emailOtpWait=");
        C36321k7.A1a(A0u2, r5.A0D);
        r11.A13(r5.A00);
        C52082or r4 = r5.A06;
        if (r4 == C52082or.YES_WITH_CODE) {
            C36321k7.A1Z(C36331k8.A0k("RequestCodeTask/doInBackground/", str4), "/status/error/yes-with-code");
        }
        return C36441kJ.A0W(r4, r5);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass00I r6 = (AnonymousClass00I) obj;
        AnonymousClass00C.A0D(r6, 0);
        AnonymousClass4UE r4 = (AnonymousClass4UE) this.A0F.get();
        if (r4 != null) {
            String str = this.A0C;
            if (!AnonymousClass00C.A0J(str, "sms") || !this.A0G) {
                r4.BKC(this.A0G, str);
                Object obj2 = r6.A00;
                AnonymousClass00C.A07(obj2);
                r4.BTw((C52082or) obj2, (C66713Xa) r6.A01, str);
                return;
            }
            C36341k9.A0H().postDelayed(new AnonymousClass737(r4, this, r6, 2), 2000);
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RequestCodeTask/method=");
        A0u.append(this.A0C);
        C36321k7.A1Z(A0u, "/error/callback null");
    }

    public C50112kE(C21060yb r2, C19630wG r3, C19420v0 r4, AnonymousClass3UV r5, C199929gH r6, AnonymousClass2d2 r7, AnonymousClass4UE r8, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, int i3, boolean z, boolean z2) {
        C36321k7.A0z(str, str2);
        AnonymousClass00C.A0D(r3, 10);
        AnonymousClass00C.A0D(r2, 14);
        AnonymousClass00C.A0D(r4, 16);
        C36361kB.A1M(r5, r6);
        this.A0G = z;
        this.A0B = str;
        this.A0D = str2;
        this.A0C = str3;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A0E = str4;
        this.A0A = str5;
        this.A04 = r3;
        this.A08 = r7;
        this.A0H = z2;
        this.A09 = str6;
        this.A03 = r2;
        this.A05 = r4;
        this.A06 = r5;
        this.A07 = r6;
        this.A0F = AnonymousClass001.A0F(r8);
        if (str3.equals("sms")) {
            C18740tg.A05(str5);
        }
    }

    public void A0A() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RequestCodeTaskonPreExecute/method=");
        String str = this.A0C;
        C36321k7.A1a(A0u, str);
        C36341k9.A0x(C36331k8.A05(this.A05), "registration_code_request_method", str);
        AnonymousClass4UE r1 = (AnonymousClass4UE) this.A0F.get();
        if (r1 != null) {
            r1.Bu4(this.A0G, str);
        }
    }
}
