package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity;
import com.whatsapp.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.9mR  reason: invalid class name and case insensitive filesystem */
public class C202699mR {
    public final C19970wo A00;
    public final C19630wG A01;
    public final C18820ts A02;
    public final C24881Ed A03;
    public final C19770wU A04;
    public final AnonymousClass17Y A05;
    public final AF7 A06;

    public void A08(Context context, C203479o6 r15, AnonymousClass7hK r16, String str, boolean z) {
        String str2;
        Context context2 = context;
        C203479o6 r8 = r15;
        AnonymousClass7hK r9 = r16;
        String str3 = str;
        boolean z2 = z;
        if (r15 == null) {
            str2 = "isValidMandateMetadata: Unable to parse ";
        } else {
            String str4 = r15.A0L;
            if (str4 != null && z) {
                str2 = "isValidMandateMetadata: Update mandate is only supported through deeplink URL";
            } else if (!AnonymousClass9B6.A02.contains(r15.A0C) || !C197639c2.A00(r15.A0O)) {
                Log.w("isValidMandateMetadata: Purpose code invalid");
                A01(context, r9, this, str3, z2);
            } else {
                String str5 = r15.A0N;
                String str6 = r15.A0M;
                if (!(str5 == null || str6 == null)) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMyyyy", Locale.US);
                    try {
                        Date parse = simpleDateFormat.parse(str5);
                        Date parse2 = simpleDateFormat.parse(str6);
                        if (!(parse == null || parse2 == null || parse.after(parse2))) {
                            Object[] A1Q = C36441kJ.A1Q();
                            A1Q[0] = r15.A0A;
                            A1Q[1] = r15.A03;
                            A1Q[2] = r15.A0K;
                            int i = 0;
                            while (A1Q[i] != null) {
                                i++;
                                if (i >= 3) {
                                    C18740tg.A06(r15);
                                    C123935xK r6 = new C123935xK(context2, r8, r9, this, str3, z2);
                                    if (TextUtils.isEmpty(str4)) {
                                        Context context3 = r6.A00;
                                        Intent A0H = C36441kJ.A0H(context3, IndiaUpiPaymentTransactionDetailsActivity.class);
                                        A0H.setFlags(268435456);
                                        C202759mb.A03(A0H, r6.A01, r6.A04);
                                        context3.startActivity(A0H);
                                        r6.A02.BY0();
                                        return;
                                    }
                                    this.A04.Boy(new C1502374m(this, r6, str4, 11));
                                    return;
                                }
                            }
                            str2 = "isValidMandateMetadata: missing mandatory fields";
                        }
                    } catch (ParseException unused) {
                    }
                }
                str2 = "isValidMandateMetadata: start and end date invalid";
            }
        }
        Log.w(str2);
        A01(context, r9, this, str3, z2);
    }

    public static String A00(C19970wo r2, C18820ts r3, long j) {
        return C20040wv.A09(r3, r2.A08(j - ((long) TimeZone.getTimeZone("Asia/Kolkata").getRawOffset())));
    }

    public static void A01(Context context, AnonymousClass7hK r5, C202699mR r6, String str, boolean z) {
        r6.A06.BOm(C36381kD.A0m(), (Integer) null, "qr_code_scan_error", str);
        r6.A05.Bp3(new AnonymousClass752(context, r5, 30, z));
    }

    public static boolean A02(C20810yC r1, String str) {
        if (r1.A0E(1433)) {
            String A09 = r1.A09(2834);
            if (TextUtils.isEmpty(A09) || TextUtils.isEmpty(str) || !A09.contains(str)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean A03(String str) {
        if (str == null || str.equals("ONETIME") || str.equals("UNKNOWN")) {
            return false;
        }
        return true;
    }

    public long A04(String str, boolean z) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMyyyy", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        try {
            Date parse = simpleDateFormat.parse(str);
            if (parse != null) {
                if (!z) {
                    Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("Asia/Kolkata"));
                    instance.setTime(parse);
                    instance.set(11, 23);
                    instance.set(12, 59);
                    instance.set(13, 59);
                    instance.set(14, 999);
                    parse = instance.getTime();
                }
                return parse.getTime();
            }
        } catch (ParseException unused) {
        }
        Log.e("PAY: IndiaMandateUtils/getTimestamp, unexpected date format");
        return 0;
    }

    public String A05(long j) {
        return C36381kD.A0r(this.A01.A00, C20040wv.A09(this.A02, this.A00.A08(j - ((long) TimeZone.getTimeZone("Asia/Kolkata").getRawOffset()))), AnonymousClass001.A0L(), R.string.f12nameremoved);
    }

    public String A06(AnonymousClass16X r4, String str) {
        String B7d = AnonymousClass16W.A05.B7d(this.A02, r4);
        if ("MAX".equals(str)) {
            return C36321k7.A0A(this.A01.A00, B7d, R.string.f12nameremoved);
        }
        return B7d;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A07(java.lang.String r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0009
            int r0 = r3.hashCode()
            switch(r0) {
                case -1738378111: goto L_0x00a7;
                case -1681232246: goto L_0x0096;
                case -602281453: goto L_0x0085;
                case 64808441: goto L_0x0075;
                case 1134556285: goto L_0x0065;
                case 1271097434: goto L_0x0055;
                case 1297843654: goto L_0x0045;
                case 1720567065: goto L_0x0035;
                case 1896178312: goto L_0x0025;
                case 1954618349: goto L_0x0015;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.0wG r0 = r2.A01
            android.content.Context r1 = r0.A00
            r0 = 2131895200(0x7f1223a0, float:1.9425226E38)
        L_0x0010:
            java.lang.String r0 = r1.getString(r0)
            return r0
        L_0x0015:
            java.lang.String r0 = "MONTHLY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.0wG r0 = r2.A01
            android.content.Context r1 = r0.A00
            r0 = 2131895368(0x7f122448, float:1.9425567E38)
            goto L_0x0010
        L_0x0025:
            java.lang.String r0 = "ASPRESENTED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.0wG r0 = r2.A01
            android.content.Context r1 = r0.A00
            r0 = 2131895363(0x7f122443, float:1.9425557E38)
            goto L_0x0010
        L_0x0035:
            java.lang.String r0 = "QUARTERLY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.0wG r0 = r2.A01
            android.content.Context r1 = r0.A00
            r0 = 2131895370(0x7f12244a, float:1.9425571E38)
            goto L_0x0010
        L_0x0045:
            java.lang.String r0 = "BIMONTHLY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.0wG r0 = r2.A01
            android.content.Context r1 = r0.A00
            r0 = 2131895364(0x7f122444, float:1.9425559E38)
            goto L_0x0010
        L_0x0055:
            java.lang.String r0 = "FORTNIGHTLY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.0wG r0 = r2.A01
            android.content.Context r1 = r0.A00
            r0 = 2131895366(0x7f122446, float:1.9425563E38)
            goto L_0x0010
        L_0x0065:
            java.lang.String r0 = "HALFYEARLY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.0wG r0 = r2.A01
            android.content.Context r1 = r0.A00
            r0 = 2131895367(0x7f122447, float:1.9425565E38)
            goto L_0x0010
        L_0x0075:
            java.lang.String r0 = "DAILY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.0wG r0 = r2.A01
            android.content.Context r1 = r0.A00
            r0 = 2131895365(0x7f122445, float:1.942556E38)
            goto L_0x0010
        L_0x0085:
            java.lang.String r0 = "ONETIME"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.0wG r0 = r2.A01
            android.content.Context r1 = r0.A00
            r0 = 2131895369(0x7f122449, float:1.942557E38)
            goto L_0x0010
        L_0x0096:
            java.lang.String r0 = "YEARLY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.0wG r0 = r2.A01
            android.content.Context r1 = r0.A00
            r0 = 2131895372(0x7f12244c, float:1.9425575E38)
            goto L_0x0010
        L_0x00a7:
            java.lang.String r0 = "WEEKLY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.0wG r0 = r2.A01
            android.content.Context r1 = r0.A00
            r0 = 2131895371(0x7f12244b, float:1.9425573E38)
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202699mR.A07(java.lang.String):java.lang.String");
    }

    public C202699mR(AnonymousClass17Y r1, C19970wo r2, C19630wG r3, C18820ts r4, C24881Ed r5, AF7 af7, C19770wU r7) {
        this.A01 = r3;
        this.A00 = r2;
        this.A05 = r1;
        this.A04 = r7;
        this.A02 = r4;
        this.A03 = r5;
        this.A06 = af7;
    }
}
