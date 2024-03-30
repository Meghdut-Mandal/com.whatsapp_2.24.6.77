package X;

import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class AE0 implements B34 {
    public final C19970wo A00;
    public final C24601Db A01;
    public final C20810yC A02;
    public final AnonymousClass1EZ A03;

    public static synchronized void A02(C135086c7 r2, AE0 ae0, String str, JSONObject jSONObject) {
        synchronized (ae0) {
            jSONObject.put("v", "2");
            if (!C202349ld.A02(r2)) {
                Object obj = r2.A00;
                C18740tg.A06(obj);
                jSONObject.put("vpa", obj);
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("vpaId", str);
            }
            jSONObject.put("vpaTs", C19970wo.A00(ae0.A00));
        }
    }

    public static synchronized void A03(AE0 ae0, String str, String str2, JSONObject jSONObject) {
        synchronized (ae0) {
            jSONObject.put("v", "2");
            jSONObject.put("psp", str);
            jSONObject.put("sequenceNumberPrefix", str2);
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("devBindingByPsp");
                if (optJSONObject == null) {
                    optJSONObject = C36441kJ.A1B();
                    jSONObject.put("devBindingByPsp", optJSONObject);
                }
                JSONObject optJSONObject2 = optJSONObject.optJSONObject(str);
                if (optJSONObject2 == null) {
                    optJSONObject2 = C36441kJ.A1B();
                    optJSONObject.put(str, optJSONObject2);
                }
                optJSONObject2.put("devBinding", true);
            } catch (JSONException e) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("PAY: IndiaUpiPaymentSharedPrefs getOrInsertFieldByPsP for field: ");
                A0u.append("devBindingByPsp");
                C36351kA.A1P(" threw: ", A0u, e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        r0 = (r1 = r0.optJSONObject(r5)).optBoolean("devBinding", false);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean A05(X.AE0 r4, java.lang.String r5) {
        /*
            monitor-enter(r4)
            r3 = 0
            X.1Db r0 = r4.A01     // Catch:{ JSONException -> 0x0030 }
            java.lang.String r1 = r0.A06()     // Catch:{ JSONException -> 0x0030 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0030 }
            if (r0 != 0) goto L_0x0038
            org.json.JSONObject r2 = X.C36441kJ.A1C(r1)     // Catch:{ JSONException -> 0x0030 }
            java.lang.String r0 = "devBindingByPsp"
            org.json.JSONObject r0 = r2.optJSONObject(r0)     // Catch:{ JSONException -> 0x0030 }
            if (r0 == 0) goto L_0x0029
            org.json.JSONObject r1 = r0.optJSONObject(r5)     // Catch:{ JSONException -> 0x0030 }
            if (r1 == 0) goto L_0x0029
            java.lang.String r0 = "devBinding"
            boolean r0 = r1.optBoolean(r0, r3)     // Catch:{ JSONException -> 0x0030 }
            if (r0 == 0) goto L_0x0029
            goto L_0x0037
        L_0x0029:
            java.lang.String r0 = "devBinding"
            boolean r3 = r2.optBoolean(r0, r3)     // Catch:{ JSONException -> 0x0030 }
            goto L_0x0038
        L_0x0030:
            r1 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiPaymentSharedPrefs readDeviceBinding threw: "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x003a }
            goto L_0x0038
        L_0x0037:
            r3 = r0
        L_0x0038:
            monitor-exit(r4)
            return r3
        L_0x003a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AE0.A05(X.AE0, java.lang.String):boolean");
    }

    public synchronized int A07() {
        int i;
        try {
            String A06 = this.A01.A06();
            if (!TextUtils.isEmpty(A06)) {
                i = C36441kJ.A1C(A06).optInt("device_binding_sim_subscripiton_id", -1);
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs getSimIndex threw: ", e);
        }
        i = 0;
        return i;
    }

    public synchronized C135086c7 A08() {
        String str;
        str = null;
        try {
            String A06 = this.A01.A06();
            if (!TextUtils.isEmpty(A06)) {
                str = C36441kJ.A1C(A06).optString("vpa", (String) null);
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs readAccountHandle threw: ", e);
        }
        return C165577te.A0T(str, "upiHandle");
    }

    public synchronized C135086c7 A09() {
        C135086c7 A0P;
        synchronized (this) {
            byte[] bArr = null;
            try {
                String A06 = this.A01.A06();
                if (!TextUtils.isEmpty(A06)) {
                    JSONObject A1C = C36441kJ.A1C(A06);
                    String optString = A1C.optString("token", (String) null);
                    long optLong = A1C.optLong("tokenTs", 0);
                    long millis = TimeUnit.DAYS.toMillis(20);
                    if (!TextUtils.isEmpty(optString) && C19970wo.A00(this.A00) - optLong < millis) {
                        bArr = Base64.decode(optString, 0);
                    }
                }
            } catch (JSONException e) {
                Log.w("PAY: IndiaUpiPaymentSharedPrefs readToken threw: ", e);
            }
            A0P = C165617ti.A0P(C146356vT.A00(), byte[].class, bArr, "sessionToken");
        }
        return A0P;
    }

    public String A0B() {
        try {
            String A06 = this.A01.A06();
            if (!TextUtils.isEmpty(A06)) {
                return C36441kJ.A1C(A06).optString("psp", (String) null);
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs getPsp threw: ", e);
        }
        return null;
    }

    public synchronized String A0C() {
        String[] A06;
        A06 = A06(this, "device_binding_sim_iccid");
        if (A06[0] == null) {
            A06 = A06(this, "device_binding_sim_id");
        }
        return A06[0];
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044 A[Catch:{ JSONException -> 0x003a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String A0D() {
        /*
            r11 = this;
            r10 = r11
            monitor-enter(r10)
            r8 = 0
            X.1Db r0 = r11.A01     // Catch:{ JSONException -> 0x003a }
            java.lang.String r1 = r0.A06()     // Catch:{ JSONException -> 0x003a }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x003a }
            if (r0 != 0) goto L_0x0045
            org.json.JSONObject r3 = X.C36441kJ.A1C(r1)     // Catch:{ JSONException -> 0x003a }
            java.lang.String r0 = "listKeys"
            java.lang.String r9 = r3.optString(r0, r8)     // Catch:{ JSONException -> 0x003a }
            java.lang.String r2 = "listKeysTs"
            r0 = 0
            long r6 = r3.optLong(r2, r0)     // Catch:{ JSONException -> 0x003a }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ JSONException -> 0x003a }
            long r4 = X.C90484aE.A0K(r0)     // Catch:{ JSONException -> 0x003a }
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ JSONException -> 0x003a }
            if (r0 != 0) goto L_0x0041
            X.0wo r0 = r11.A00     // Catch:{ JSONException -> 0x003a }
            long r2 = X.C19970wo.A00(r0)     // Catch:{ JSONException -> 0x003a }
            long r2 = r2 - r6
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L_0x0042
            goto L_0x0041
        L_0x003a:
            r1 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiPaymentSharedPrefs readListKeys threw: "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0047 }
            goto L_0x0045
        L_0x0041:
            r0 = 0
        L_0x0042:
            if (r0 == 0) goto L_0x0045
            r8 = r9
        L_0x0045:
            monitor-exit(r10)
            return r8
        L_0x0047:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AE0.A0D():java.lang.String");
    }

    public synchronized String A0E() {
        String str;
        str = null;
        try {
            String A06 = this.A01.A06();
            if (!TextUtils.isEmpty(A06)) {
                str = C36441kJ.A1C(A06).optString("vpaId", (String) null);
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs readVpaId threw: ", e);
        }
        return str;
    }

    public synchronized void A0F() {
        try {
            C24601Db r2 = this.A01;
            JSONObject A012 = A01(r2);
            A012.remove("listKeys");
            A012.remove("listKeysTs");
            C165577te.A1B(r2, A012);
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs deleteTokenAndKeys threw: ", e);
        }
        return;
    }

    public synchronized void A0G() {
        try {
            C24601Db r2 = this.A01;
            JSONObject A012 = A01(r2);
            A012.remove("token");
            A012.remove("tokenTs");
            A012.remove("listKeys");
            A012.remove("listKeysTs");
            C165577te.A1B(r2, A012);
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs deleteTokenAndKeys threw: ", e);
        }
        return;
    }

    public synchronized void A0H(int i) {
        try {
            C24601Db r2 = this.A01;
            JSONObject A012 = A01(r2);
            A012.put("device_binding_sim_subscripiton_id", i);
            C165577te.A1B(r2, A012);
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs setSimIndex threw: ", e);
        }
        return;
    }

    public synchronized void A0I(C135086c7 r3, String str) {
        try {
            C24601Db r1 = this.A01;
            JSONObject A012 = A01(r1);
            A02(r3, this, str, A012);
            C165577te.A1B(r1, A012);
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs storeVpaHandle threw: ", e);
        }
        return;
    }

    public synchronized void A0J(String str) {
        JSONObject A1C;
        try {
            C24601Db r5 = this.A01;
            String A06 = r5.A06();
            long A002 = C19970wo.A00(this.A00);
            if (TextUtils.isEmpty(A06)) {
                A1C = C36441kJ.A1B();
            } else {
                A1C = C36441kJ.A1C(A06);
            }
            A1C.put("v", "2");
            A1C.put("listKeys", str);
            A1C.put("listKeysTs", A002);
            C165577te.A1B(r5, A1C);
            C36321k7.A1V("PAY: IndiaUpiPaymentSharedPrefs storeListKeys at timestamp: ", AnonymousClass000.A0u(), A002);
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs storeListKeys threw: ", e);
        }
        return;
    }

    public synchronized void A0K(String str, String str2, String str3) {
        try {
            C24601Db r2 = this.A01;
            JSONObject A0h = C165567td.A0h(r2);
            A03(this, str, str2, A0h);
            if (!TextUtils.isEmpty(str3)) {
                A0h.put("device_binding_sim_id", str3);
            }
            A0h.remove("device_binding_sim_subscripiton_id");
            C165577te.A1B(r2, A0h);
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs storeDeviceBinding threw: ", e);
        }
        return;
    }

    public synchronized void A0L(boolean z) {
        C36331k8.A0w(C90494aF.A0E(this.A01), "is_payment_account_created", z);
    }

    public synchronized boolean A0M() {
        return C36371kC.A1U(this.A01.A03(), "is_payment_account_created");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r2.A02.A0E(1644) == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0N() {
        /*
            r2 = this;
            monitor-enter(r2)
            X.1Db r0 = r2.A01     // Catch:{ all -> 0x001d }
            android.content.SharedPreferences r1 = r0.A03()     // Catch:{ all -> 0x001d }
            java.lang.String r0 = "payment_account_recovered"
            boolean r0 = X.C36371kC.A1U(r1, r0)     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x001a
            X.0yC r1 = r2.A02     // Catch:{ all -> 0x001d }
            r0 = 1644(0x66c, float:2.304E-42)
            boolean r1 = r1.A0E(r0)     // Catch:{ all -> 0x001d }
            r0 = 1
            if (r1 != 0) goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            monitor-exit(r2)
            return r0
        L_0x001d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AE0.A0N():boolean");
    }

    public synchronized boolean A0O() {
        boolean z;
        if (A0N()) {
            String A0B = A0B();
            if (TextUtils.isEmpty(A0B) || !A05(this, A0B)) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    public synchronized boolean A0P() {
        boolean z;
        z = false;
        try {
            String A06 = this.A01.A06();
            if (!TextUtils.isEmpty(A06)) {
                z = C36441kJ.A1C(A06).optBoolean("chatListQrScanOnboardingSheetDismissed", false);
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs isChatListQrScanOnboardingSheetShown threw: ", e);
        }
        return z;
    }

    public boolean A0Q(C175818b6 r7, AF7 af7, String str) {
        ArrayList arrayList;
        if (TextUtils.isEmpty(str) || !A05(this, str)) {
            return false;
        }
        if (!this.A02.A0E(1661)) {
            return true;
        }
        if (r7 == null || (arrayList = r7.A0F) == null) {
            return false;
        }
        boolean contains = arrayList.contains(str);
        if (!contains) {
            C176658cT r2 = new C176658cT();
            r2.A0b = "redo_device_binding";
            C176658cT.A02(r2, 0);
            r2.A01 = Boolean.valueOf(this.A03.A0G("add_bank"));
            af7.BOl(r2);
            B5D(str, true);
        }
        return contains;
    }

    public synchronized boolean B5D(String str, boolean z) {
        boolean z2;
        try {
            C24601Db r2 = this.A01;
            String A06 = r2.A06();
            if (!TextUtils.isEmpty(A06)) {
                JSONObject A1C = C36441kJ.A1C(A06);
                if (TextUtils.isEmpty(str)) {
                    A1C.remove("smsVerifDataSentToPsp");
                    A1C.remove("devBindingByPsp");
                } else {
                    JSONObject optJSONObject = A1C.optJSONObject("smsVerifDataSentToPsp");
                    if (optJSONObject != null) {
                        optJSONObject.remove(str);
                    }
                    JSONObject optJSONObject2 = A1C.optJSONObject("devBindingByPsp");
                    if (optJSONObject2 != null) {
                        optJSONObject2.remove(str);
                    }
                }
                if (z) {
                    A1C.remove("psp");
                }
                A1C.remove("sequenceNumberPrefix");
                A1C.remove("skipDevBinding");
                A1C.remove("smsVerifData");
                A1C.remove("smsVerifDataGateway");
                A1C.remove("devBinding");
                A1C.remove("smsVerifDataGen");
                A1C.remove("device_binding_sim_iccid");
                A1C.remove("device_binding_sim_id");
                A1C.remove("device_binding_sim_subscripiton_id");
                C165577te.A1B(r2, A1C);
            }
            z2 = true;
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs deleteDeviceBinding threw: ", e);
            z2 = false;
        }
        return z2;
    }

    public synchronized boolean BwY(long j, boolean z) {
        this.A03.A0B("tos_no_wallet");
        C36331k8.A0w(C90494aF.A0E(this.A01), "payment_account_recovered", true);
        return true;
    }

    public synchronized boolean Bws(C175898bF r6) {
        boolean z;
        synchronized (this) {
            if (r6 != null) {
                if (r6 instanceof C175818b6) {
                    C175818b6 r62 = (C175818b6) r6;
                    A0I(r62.A08, r62.A0E);
                    String str = r62.A09;
                    try {
                        C24601Db r2 = this.A01;
                        JSONObject A0h = C165567td.A0h(r2);
                        if (!TextUtils.isEmpty(str)) {
                            A0h.put("psp", str);
                        }
                        C165577te.A1B(r2, A0h);
                    } catch (JSONException unused) {
                        Log.w("PAY: IndiaUpiPaymentSharedPrefs storePsp threw");
                    }
                    z = true;
                }
            }
            z = false;
        }
        return z;
    }

    public static String[] A06(AE0 ae0, String... strArr) {
        try {
            String A06 = ae0.A01.A06();
            if (!TextUtils.isEmpty(A06)) {
                JSONObject A1C = C36441kJ.A1C(A06);
                int length = strArr.length;
                String[] strArr2 = new String[length];
                for (int i = 0; i < length; i++) {
                    strArr2[i] = A1C.optString(strArr[i], (String) null);
                }
                return strArr2;
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs readFromPaymentInfo for keys threw: ", e);
        }
        return new String[strArr.length];
    }

    public String A0A() {
        try {
            String A06 = this.A01.A06();
            if (!TextUtils.isEmpty(A06)) {
                return C36441kJ.A1C(A06).optString("sequenceNumberPrefix", "ICIWC");
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs getPaymentSequenceNumberPrefix threw: ", e);
        }
        return "ICIWC";
    }

    public void B5C() {
        C24601Db r2 = this.A01;
        C36341k9.A0u(C90494aF.A0E(r2), "payments_upi_aliases");
        try {
            JSONObject A0h = C165567td.A0h(r2);
            A0h.remove("token");
            A0h.remove("tokenTs");
            A0h.remove("vpa");
            A0h.remove("vpaId");
            A0h.remove("vpaTs");
            A0h.remove("listKeys");
            A0h.remove("listKeysTs");
            A0h.remove("skipDevBinding");
            A0h.remove("devBindingByPsp");
            A0h.remove("psp");
            A0h.remove("sequenceNumberPrefix");
            A0h.remove("devBinding");
            A0h.remove("signedQrCode");
            A0h.remove("signedQrCodeTs");
            C165577te.A1B(r2, A0h);
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs deleteTokenAndKeys threw: ", e);
        }
    }

    public boolean Bsv(C175708av r3) {
        if (this.A03.A0F() || !A08().A02()) {
            return false;
        }
        return true;
    }

    public String toString() {
        String str;
        try {
            JSONObject A0h = C165567td.A0h(this.A01);
            if (!TextUtils.isEmpty(A0h.optString("listKeys"))) {
                str = "[keys exist]";
            } else {
                str = "[no keys]";
            }
            A0h.put("listKeys", str);
            String optString = A0h.optString("vpa");
            if (!TextUtils.isEmpty(optString)) {
                A0h.put("vpa", C200449hQ.A02(optString));
            }
            String optString2 = A0h.optString("smsVerifDataGateway");
            if (!TextUtils.isEmpty(optString2)) {
                A0h.put("smsVerifDataGateway", optString2);
            }
            A04("smsVerifDataGen", A0h);
            A04("smsVerifData", A0h);
            A04("token", A0h);
            JSONObject optJSONObject = A0h.optJSONObject("smsVerifDataSentToPsp");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject(AnonymousClass001.A0C(keys));
                    if (optJSONObject2 != null) {
                        A04("smsVerifData", optJSONObject2);
                    }
                }
            }
            return A0h.toString();
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs toString threw: ", e);
            return "";
        }
    }

    public AE0(C19970wo r1, C20810yC r2, AnonymousClass1EZ r3, C24601Db r4) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r4;
        this.A03 = r3;
    }

    public static String A00(AE0 ae0) {
        return (String) ae0.A08().A00;
    }

    public static JSONObject A01(C24601Db r1) {
        String A06 = r1.A06();
        if (TextUtils.isEmpty(A06)) {
            return new JSONObject();
        }
        return new JSONObject(A06);
    }

    public static void A04(String str, JSONObject jSONObject) {
        String optString = jSONObject.optString(str);
        if (!TextUtils.isEmpty(optString)) {
            jSONObject.put(str, C200449hQ.A00(optString));
        }
    }
}
