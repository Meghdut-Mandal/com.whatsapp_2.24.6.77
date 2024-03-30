package X;

import android.content.SharedPreferences;
import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;

/* renamed from: X.3LA  reason: invalid class name */
public final class AnonymousClass3LA {
    public final SharedPreferences A00;
    public final C19970wo A01;

    public final void A08(String str, String str2, String str3) {
        AnonymousClass00C.A0D(str, 0);
        C36321k7.A0x(str2, str3);
        SharedPreferences.Editor edit = this.A00.edit();
        edit.putString("com.whatsapp.registration.VerifyPhoneNumber.sms_code", str);
        edit.putString("com.whatsapp.registration.VerifyPhoneNumber.sms_cc", str2);
        edit.putString("com.whatsapp.registration.VerifyPhoneNumber.sms_phone_number", str3);
        edit.apply();
    }

    public static long A00(VerifyPhoneNumber verifyPhoneNumber, String str) {
        return verifyPhoneNumber.A16.A02(str);
    }

    public final void A04() {
        C36341k9.A0u(this.A00.edit(), "com.whatsapp.registration.VerifyPhoneNumber.code_verification_retry_time");
    }

    public final void A05() {
        SharedPreferences.Editor edit = this.A00.edit();
        edit.remove("com.whatsapp.registration.VerifyPhoneNumber.sms_code");
        edit.remove("com.whatsapp.registration.VerifyPhoneNumber.sms_cc");
        edit.remove("com.whatsapp.registration.VerifyPhoneNumber.sms_phone_number");
        edit.apply();
    }

    public AnonymousClass3LA(SharedPreferences sharedPreferences, C19970wo r2) {
        C36321k7.A0x(r2, sharedPreferences);
        this.A01 = r2;
        this.A00 = sharedPreferences;
    }

    public static void A01(AnonymousClass3LA r2, String str, long j) {
        r2.A07(str, System.currentTimeMillis() + j);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        r1 = r3.getLong(r0, -1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A02(java.lang.String r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            r1 = -1
            switch(r0) {
                case -795576526: goto L_0x000d;
                case 114009: goto L_0x0018;
                case 112386354: goto L_0x0025;
                case 2120743944: goto L_0x0032;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.System.currentTimeMillis()
            return r1
        L_0x000d:
            boolean r0 = X.C36441kJ.A1M(r5)
            if (r0 == 0) goto L_0x0009
            android.content.SharedPreferences r3 = r4.A00
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.wa_old_request_failed_retry_time"
            goto L_0x003c
        L_0x0018:
            java.lang.String r0 = "sms"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0009
            android.content.SharedPreferences r3 = r4.A00
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.sms_request_failed_retry_time"
            goto L_0x003c
        L_0x0025:
            java.lang.String r0 = "voice"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0009
            android.content.SharedPreferences r3 = r4.A00
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.call_countdown_end_time"
            goto L_0x003c
        L_0x0032:
            boolean r0 = X.C36441kJ.A1N(r5)
            if (r0 == 0) goto L_0x0009
            android.content.SharedPreferences r3 = r4.A00
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.email_retry_time"
        L_0x003c:
            long r1 = r3.getLong(r0, r1)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3LA.A02(java.lang.String):long");
    }

    public final String A03(String str, String str2) {
        C36321k7.A0w(str, str2);
        SharedPreferences sharedPreferences = this.A00;
        if (!str.equals(sharedPreferences.getString("com.whatsapp.registration.VerifyPhoneNumber.sms_cc", (String) null)) || !str2.equals(sharedPreferences.getString("com.whatsapp.registration.VerifyPhoneNumber.sms_phone_number", (String) null))) {
            return null;
        }
        return sharedPreferences.getString("com.whatsapp.registration.VerifyPhoneNumber.sms_code", (String) null);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        r1.remove(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VerifyPhoneNumberPrefs/clearRequestCodeRetryTime/method="
            X.C36321k7.A1Q(r0, r3, r1)
            android.content.SharedPreferences r0 = r2.A00
            android.content.SharedPreferences$Editor r1 = r0.edit()
            int r0 = r3.hashCode()
            switch(r0) {
                case -795576526: goto L_0x001a;
                case 114009: goto L_0x0023;
                case 112386354: goto L_0x002e;
                case 2120743944: goto L_0x0039;
                default: goto L_0x0016;
            }
        L_0x0016:
            r1.apply()
            return
        L_0x001a:
            boolean r0 = X.C36441kJ.A1M(r3)
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.wa_old_request_failed_retry_time"
            goto L_0x0041
        L_0x0023:
            java.lang.String r0 = "sms"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.sms_request_failed_retry_time"
            goto L_0x0041
        L_0x002e:
            java.lang.String r0 = "voice"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.call_countdown_end_time"
            goto L_0x0041
        L_0x0039:
            boolean r0 = X.C36441kJ.A1N(r3)
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.email_retry_time"
        L_0x0041:
            r1.remove(r0)
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3LA.A06(java.lang.String):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        r1.putLong(r0, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(java.lang.String r3, long r4) {
        /*
            r2 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VerifyPhoneNumberPrefs/saveRequestCodeRetryTime/method="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "/endTimeInMs="
            X.C36321k7.A1V(r0, r1, r4)
            android.content.SharedPreferences r0 = r2.A00
            android.content.SharedPreferences$Editor r1 = r0.edit()
            int r0 = r3.hashCode()
            switch(r0) {
                case -795576526: goto L_0x0022;
                case 114009: goto L_0x002b;
                case 112386354: goto L_0x0036;
                case 2120743944: goto L_0x0041;
                default: goto L_0x001e;
            }
        L_0x001e:
            r1.apply()
            return
        L_0x0022:
            boolean r0 = X.C36441kJ.A1M(r3)
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.wa_old_request_failed_retry_time"
            goto L_0x0049
        L_0x002b:
            java.lang.String r0 = "sms"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.sms_request_failed_retry_time"
            goto L_0x0049
        L_0x0036:
            java.lang.String r0 = "voice"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.call_countdown_end_time"
            goto L_0x0049
        L_0x0041:
            boolean r0 = X.C36441kJ.A1N(r3)
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.email_retry_time"
        L_0x0049:
            r1.putLong(r0, r4)
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3LA.A07(java.lang.String, long):void");
    }
}
