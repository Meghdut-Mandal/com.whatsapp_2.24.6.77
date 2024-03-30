package X;

import android.content.SharedPreferences;

/* renamed from: X.1X8  reason: invalid class name */
public class AnonymousClass1X8 {
    public String A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04 = false;
    public boolean A05 = true;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final C21060yb A09;
    public final AnonymousClass005 A0A;

    public static synchronized void A00(AnonymousClass1X8 r4) {
        synchronized (r4) {
            if (!r4.A08) {
                AnonymousClass005 r3 = r4.A0A;
                r4.A01 = ((SharedPreferences) ((C19420v0) r3.get()).A00.get()).getBoolean("pref_fail_too_many", false);
                r4.A02 = ((SharedPreferences) ((C19420v0) r3.get()).A00.get()).getBoolean("pref_no_route_sms", false);
                r4.A03 = ((SharedPreferences) ((C19420v0) r3.get()).A00.get()).getBoolean("pref_no_route_voice", false);
                r4.A06 = ((SharedPreferences) ((C19420v0) r3.get()).A00.get()).getBoolean("pref_fail_too_many_attempts", false);
                r4.A07 = ((SharedPreferences) ((C19420v0) r3.get()).A00.get()).getBoolean("pref_fail_too_many_guesses", false);
                r4.A08 = true;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(java.lang.String r10) {
        /*
            r9 = this;
            r9.A00 = r10
            A00(r9)
            java.lang.String r1 = "verify-tmg"
            boolean r3 = r10.equals(r1)
            r7 = 0
            r8 = 1
            java.lang.String r0 = "verify-tma"
            if (r3 == 0) goto L_0x0044
            r9.A07 = r8
            r9.A06 = r7
            X.005 r3 = r9.A0A
            java.lang.Object r3 = r3.get()
            X.0v0 r3 = (X.C19420v0) r3
            boolean r4 = r9.A01
            boolean r5 = r9.A02
            boolean r6 = r9.A03
        L_0x0023:
            r3.A28(r4, r5, r6, r7, r8)
        L_0x0026:
            java.lang.String r3 = "verify-sms"
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L_0x0036
            java.lang.String r3 = "verify-second-sms"
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x003c
        L_0x0036:
            boolean r3 = r9.A07
            if (r3 == 0) goto L_0x003d
            r9.A00 = r1
        L_0x003c:
            return
        L_0x003d:
            boolean r1 = r9.A06
            if (r1 == 0) goto L_0x003c
            r9.A00 = r0
            return
        L_0x0044:
            boolean r3 = r10.equals(r0)
            if (r3 == 0) goto L_0x0026
            r9.A07 = r7
            r9.A06 = r8
            X.005 r3 = r9.A0A
            java.lang.Object r3 = r3.get()
            X.0v0 r3 = (X.C19420v0) r3
            boolean r4 = r9.A01
            boolean r5 = r9.A02
            boolean r6 = r9.A03
            r7 = 1
            r8 = 0
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1X8.A02(java.lang.String):void");
    }

    public AnonymousClass1X8(C21060yb r3, AnonymousClass005 r4) {
        this.A09 = r3;
        this.A0A = r4;
        this.A08 = false;
    }

    public String A01(String str) {
        A00(this);
        boolean A0F = C18750th.A0F(this.A09);
        A00(this);
        String str2 = this.A00;
        boolean z = this.A04;
        boolean z2 = this.A05;
        boolean z3 = this.A02;
        boolean z4 = this.A03;
        boolean z5 = this.A01;
        if ("register-phone".equals(str2)) {
            if (A0F) {
                return "register-phone-rtd";
            }
            if (z) {
                return "register-phone-no_number";
            }
            if (!z2) {
                return "register-phone-invalid";
            }
            return str;
        } else if (!"verify-sms".equals(str2) && !"verify-second-sms".equals(str2)) {
            String str3 = "verify-tma";
            if (!str3.equals(str2)) {
                str3 = "verify-tmg";
                if (str3.equals(str2)) {
                    return str3;
                }
                return str;
            }
            return str3;
        } else if (A0F) {
            return "verify-sms-rtd";
        } else {
            if (!z3) {
                if (z4) {
                    return "verify-sms-no_routes_voice";
                }
                if (z5) {
                    return str;
                }
                if ("verify-second-sms".equals(str2)) {
                    return str2;
                }
                return "verify-sms-normal";
            } else if (z4) {
                return "verify-sms-no_routes_both";
            } else {
                return "verify-sms-no_routes_sms";
            }
        }
    }

    public void A03(String str) {
        A00(this);
        switch (str.hashCode()) {
            case -1976127222:
                if (str.equals("noRouteVoice")) {
                    this.A03 = true;
                    break;
                }
                break;
            case -1893373339:
                if (str.equals("validNumber")) {
                    this.A05 = true;
                    break;
                }
                break;
            case -1777505757:
                if (str.equals("notEmptyNumber")) {
                    this.A04 = false;
                    break;
                }
                break;
            case -1522953003:
                if (str.equals("failTooMany")) {
                    this.A01 = true;
                    break;
                }
                break;
            case -416647790:
                if (str.equals("notValidNumber")) {
                    this.A05 = false;
                    break;
                }
                break;
            case 1040735990:
                if (str.equals("emptyNumber")) {
                    this.A04 = true;
                    break;
                }
                break;
            case 1164419889:
                if (str.equals("noRouteSms")) {
                    this.A02 = true;
                    break;
                }
                break;
        }
        ((C19420v0) this.A0A.get()).A28(this.A01, this.A02, this.A03, this.A06, this.A07);
    }
}
