package X;

import android.content.Context;
import android.os.Build;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;
import com.whatsapp.util.Log;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: X.9jn  reason: invalid class name and case insensitive filesystem */
public class C201529jn {
    public C202119l4 A00;
    public final AnonymousClass1N4 A01;
    public final AF7 A02;
    public final C19730wQ A03;
    public final C21100yf A04;
    public final C21060yb A05;
    public final C19970wo A06;
    public final C19630wG A07;
    public final C20810yC A08;
    public final AnonymousClass19A A09;
    public final C202269lR A0A;
    public final AE0 A0B;
    public final C29121Vk A0C;
    public final C24611Dc A0D;
    public final C111495cN A0E;

    private String A00(String str) {
        TelephonyManager A0K = this.A05.A0K();
        try {
            Method A0G = AnonymousClass001.A0G(Class.forName(AnonymousClass000.A0k(A0K)), Integer.TYPE, str, new Class[1], 0);
            Object[] objArr = new Object[1];
            AnonymousClass000.A1L(objArr, 1, 0);
            Object invoke = A0G.invoke(A0K, objArr);
            if (invoke != null) {
                return invoke.toString();
            }
        } catch (Exception e) {
            Log.e("IndiaUpiSimSwapDetectionUtils/getDeviceInfoBySlot device info exception: ", e);
        }
        return null;
    }

    public String A04() {
        int i;
        try {
            Context context = this.A07.A00;
            if (AnonymousClass00F.A01(context, "android.permission.READ_PHONE_STATE") != 0 || ((i = Build.VERSION.SDK_INT) >= 30 && AnonymousClass00F.A01(context, "android.permission.READ_PHONE_NUMBERS") != 0)) {
                return null;
            }
            C19730wQ r0 = this.A03;
            r0.A0G();
            String A032 = AnonymousClass3U8.A03(r0.A0E);
            if (i >= 22) {
                return this.A00.A04(A032);
            }
            TelephonyManager A0K = this.A05.A0K();
            String line1Number = A0K.getLine1Number();
            AnonymousClass1N4 r2 = this.A01;
            AF7 af7 = this.A02;
            if (A01(r2, af7, line1Number, A032)) {
                this.A0D.A04("store first iccid");
                return A0K.getSimSerialNumber();
            } else if (A01(r2, af7, A00("getLine1Number"), A032)) {
                this.A0D.A04("store second iccid");
                return A00("getSimSerialNumber");
            } else {
                if (A0K.getSimSerialNumber() != null) {
                    return A0K.getSimSerialNumber();
                }
                return null;
            }
        } catch (Exception e) {
            this.A0D.A0A("Unable to get device bind ICCID", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0090, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0091, code lost:
        com.whatsapp.util.Log.w("PAY: IndiaUpiPaymentSharedPrefs logDeviceBindingStatus threw: ", r5);
        r1 = "";
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A02() {
        /*
            r13 = this;
            X.0yf r1 = r13.A04
            X.0yi r0 = X.C21100yf.A0j
            boolean r0 = r1.A09(r0)
            r4 = 0
            if (r0 == 0) goto L_0x00d6
            X.0wQ r0 = r13.A03
            r0.A0G()
            X.142 r0 = r0.A0E
            java.lang.String r3 = X.AnonymousClass3U8.A03(r0)
            X.1Dc r2 = r13.A0D
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "checkSimWithWaRegisteredNumberIsInstalled : device binding status: "
            r7.append(r0)
            X.AE0 r0 = r13.A0B
            java.lang.String r5 = "device_binding_sim_id"
            java.lang.String r9 = "device_binding_sim_iccid"
            org.json.JSONObject r8 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x0090 }
            java.lang.String r11 = "skipDevBinding"
            monitor-enter(r0)     // Catch:{ JSONException -> 0x0090 }
            r10 = 0
            X.1Db r1 = r0.A01     // Catch:{ JSONException -> 0x0044 }
            java.lang.String r6 = r1.A06()     // Catch:{ JSONException -> 0x0044 }
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch:{ JSONException -> 0x0044 }
            if (r1 != 0) goto L_0x004a
            org.json.JSONObject r1 = X.C36441kJ.A1C(r6)     // Catch:{ JSONException -> 0x0044 }
            boolean r10 = r1.optBoolean(r11, r4)     // Catch:{ JSONException -> 0x0044 }
            goto L_0x004a
        L_0x0044:
            r6 = move-exception
            java.lang.String r1 = "PAY: IndiaUpiPaymentSharedPrefs readDeviceBinding threw: "
            com.whatsapp.util.Log.w(r1, r6)     // Catch:{ all -> 0x008d }
        L_0x004a:
            monitor-exit(r0)     // Catch:{ JSONException -> 0x0090 }
            r8.put(r11, r10)     // Catch:{ JSONException -> 0x0090 }
            java.lang.String[] r1 = new java.lang.String[]{r9}     // Catch:{ JSONException -> 0x0090 }
            java.lang.String[] r1 = X.AE0.A06(r0, r1)     // Catch:{ JSONException -> 0x0090 }
            r1 = r1[r4]     // Catch:{ JSONException -> 0x0090 }
            java.lang.String r1 = X.C200449hQ.A01(r1)     // Catch:{ JSONException -> 0x0090 }
            r8.put(r9, r1)     // Catch:{ JSONException -> 0x0090 }
            java.lang.String[] r1 = new java.lang.String[]{r5}     // Catch:{ JSONException -> 0x0090 }
            java.lang.String[] r1 = X.AE0.A06(r0, r1)     // Catch:{ JSONException -> 0x0090 }
            r1 = r1[r4]     // Catch:{ JSONException -> 0x0090 }
            java.lang.String r1 = X.C200449hQ.A01(r1)     // Catch:{ JSONException -> 0x0090 }
            r8.put(r5, r1)     // Catch:{ JSONException -> 0x0090 }
            java.lang.String r6 = r0.A0B()     // Catch:{ JSONException -> 0x0090 }
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch:{ JSONException -> 0x0090 }
            if (r1 != 0) goto L_0x0088
            java.lang.String r1 = "psp"
            r8.put(r1, r6)     // Catch:{ JSONException -> 0x0090 }
            java.lang.String r5 = "devBinding"
            boolean r1 = X.AE0.A05(r0, r6)     // Catch:{ JSONException -> 0x0090 }
            r8.put(r5, r1)     // Catch:{ JSONException -> 0x0090 }
        L_0x0088:
            java.lang.String r1 = r8.toString()     // Catch:{ JSONException -> 0x0090 }
            goto L_0x0098
        L_0x008d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ JSONException -> 0x0090 }
            throw r1     // Catch:{ JSONException -> 0x0090 }
        L_0x0090:
            r5 = move-exception
            java.lang.String r1 = "PAY: IndiaUpiPaymentSharedPrefs logDeviceBindingStatus threw: "
            com.whatsapp.util.Log.w(r1, r5)
            java.lang.String r1 = ""
        L_0x0098:
            X.C165567td.A18(r2, r1, r7)
            X.0wo r7 = r13.A06
            X.0yC r8 = r13.A08
            X.19A r9 = r13.A09
            X.9lR r10 = r13.A0A
            X.1Vk r11 = r13.A0C
            X.8gJ r6 = new X.8gJ
            r6.<init>(r7, r8, r9, r10, r11)
            int r5 = android.os.Build.VERSION.SDK_INT
            r1 = 22
            if (r5 < r1) goto L_0x00b7
            X.9l4 r0 = r13.A00
            int r0 = r0.A03(r6, r3)
            return r0
        L_0x00b7:
            r12 = 1
            java.lang.String r1 = "Check sim on version < 22"
            r2.A06(r1)
            X.0yb r1 = r13.A05
            android.telephony.TelephonyManager r6 = r1.A0K()
            java.lang.String r9 = r6.getLine1Number()
            X.1N4 r11 = r13.A01
            X.AF7 r10 = r13.A02
            boolean r1 = A01(r11, r10, r9, r3)
            if (r1 == 0) goto L_0x00d7
            java.lang.String r0 = "Phone 1 matched"
        L_0x00d3:
            r2.A06(r0)
        L_0x00d6:
            return r4
        L_0x00d7:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "checkSimWithWaRegisteredNumberIsInstalled Phone 1 not matched | sim number : "
            r5.append(r1)
            r5.append(r9)
            java.lang.String r8 = " | waNumber : "
            r5.append(r8)
            X.C165567td.A18(r2, r3, r5)
            java.lang.String r5 = r6.getSimSerialNumber()
            java.lang.String r6 = r0.A0C()
            boolean r0 = android.text.TextUtils.equals(r5, r6)
            if (r0 == 0) goto L_0x00fc
            java.lang.String r0 = "ICCID 1 matched"
            goto L_0x00d3
        L_0x00fc:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "checkSimWithWaRegisteredNumberIsInstalled ICCID 1 not matched simId : "
            r1.append(r0)
            java.lang.String r0 = X.C200449hQ.A01(r5)
            r1.append(r0)
            java.lang.String r5 = " | storedId : "
            r1.append(r5)
            java.lang.String r0 = X.C200449hQ.A01(r6)
            X.C165567td.A18(r2, r0, r1)
            java.lang.String r0 = "getLine1Number"
            java.lang.String r7 = r13.A00(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Phone "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " phone2 "
            r1.append(r0)
            X.C165567td.A18(r2, r7, r1)
            boolean r0 = A01(r11, r10, r7, r3)
            if (r0 == 0) goto L_0x013b
            java.lang.String r0 = "Phone 2 matched"
            goto L_0x00d3
        L_0x013b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "checkSimWithWaRegisteredNumberIsInstalled Phone 2 not matched | sim number : "
            X.C36321k7.A1O(r0, r9, r8, r3, r1)
            X.C165607th.A1E(r2, r1)
            java.lang.String r0 = "getSimSerialNumber"
            java.lang.String r3 = r13.A00(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ID"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " ID2 "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r3, r1)
            r2.A04(r0)
            boolean r0 = android.text.TextUtils.equals(r6, r3)
            if (r0 == 0) goto L_0x016c
            java.lang.String r0 = "ICCID 2 matched"
            goto L_0x00d3
        L_0x016c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "checkSimWithWaRegisteredNumberIsInstalled ICCID 2 not matched simId : "
            r1.append(r0)
            java.lang.String r0 = X.C200449hQ.A01(r3)
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = X.C200449hQ.A01(r6)
            X.C165567td.A18(r2, r0, r1)
            java.lang.String r0 = "IndiaUpiSimSwapDetectionUtils : No ICCID matched on API 22 or lower"
            r2.A06(r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201529jn.A02():int");
    }

    public C201529jn(AnonymousClass1N4 r8, C19730wQ r9, C21100yf r10, C21060yb r11, C19970wo r12, C19630wG r13, C20810yC r14, AnonymousClass19A r15, C202269lR r16, AE0 ae0, C29121Vk r18, AF7 af7, C111495cN r20) {
        C24611Dc A0a = C165607th.A0a("IndiaUpiSimSwapDetectionUtils");
        this.A0D = A0a;
        this.A07 = r13;
        this.A06 = r12;
        this.A08 = r14;
        this.A03 = r9;
        this.A04 = r10;
        this.A09 = r15;
        C21060yb r2 = r11;
        this.A05 = r11;
        AnonymousClass1N4 r4 = r8;
        this.A01 = r8;
        this.A0E = r20;
        this.A0A = r16;
        this.A0C = r18;
        AF7 af72 = af7;
        this.A02 = af72;
        AE0 ae02 = ae0;
        this.A0B = ae02;
        if (Build.VERSION.SDK_INT >= 22) {
            this.A00 = new C202119l4(r2, A0a, r4, af72, ae02);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        if (r4 > 10) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01(X.AnonymousClass1N4 r7, X.AF7 r8, java.lang.String r9, java.lang.String r10) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r2 = 0
            if (r0 == 0) goto L_0x0008
            return r2
        L_0x0008:
            java.lang.String r1 = X.AnonymousClass3U2.A03(r9)
            java.lang.String r6 = X.AnonymousClass3U2.A03(r10)
            java.lang.String r0 = X.AnonymousClass3SI.A02(r6)
            java.lang.String r5 = X.AnonymousClass3U2.A02(r7, r0, r1)
            int r4 = r5.length()
            r0 = 12
            java.lang.String r3 = "91"
            if (r4 == r0) goto L_0x0036
            boolean r0 = r5.startsWith(r3)
            if (r0 == 0) goto L_0x0032
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1 = 0
            java.lang.String r0 = "incorrect_country_prefix_validation"
            r8.BOm(r2, r1, r0, r1)
        L_0x0032:
            r0 = 10
            if (r4 <= r0) goto L_0x0041
        L_0x0036:
            boolean r0 = r5.startsWith(r3)
            if (r0 == 0) goto L_0x0041
            boolean r0 = android.text.TextUtils.equals(r5, r6)
            return r0
        L_0x0041:
            java.lang.String r0 = ""
            java.lang.String r0 = r6.replaceFirst(r3, r0)
            boolean r0 = android.text.TextUtils.equals(r5, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201529jn.A01(X.1N4, X.AF7, java.lang.String, java.lang.String):boolean");
    }

    public SmsManager A03(int i) {
        return C202119l4.A00(i);
    }

    public List A05(Context context) {
        return C202119l4.A02(context);
    }
}
