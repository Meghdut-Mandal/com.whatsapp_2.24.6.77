package X;

import android.text.TextUtils;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9nY  reason: invalid class name and case insensitive filesystem */
public abstract class C203219nY {
    public static C206979uM A01(JSONObject jSONObject) {
        String str = null;
        if (jSONObject == null) {
            return null;
        }
        long j = jSONObject.getLong("value");
        int i = jSONObject.getInt("offset");
        String optString = jSONObject.optString("description");
        if (!TextUtils.isEmpty(optString)) {
            str = optString;
        }
        return new C206979uM(j, i, str);
    }

    public static C207199ui A03(AnonymousClass16T r29, JSONObject jSONObject) {
        byte[] bArr;
        C206839u5 r8;
        C207119ua A00;
        ArrayList A0I;
        String str = null;
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject2.optString("thumb");
        if (!TextUtils.isEmpty(optString)) {
            bArr = Base64.decode(optString, 0);
        } else {
            bArr = null;
        }
        String optString2 = jSONObject2.optString("title");
        C206979uM A01 = A01(jSONObject2.optJSONObject("total_amount"));
        String string = jSONObject2.getString("reference_id");
        String optString3 = jSONObject2.optString("order_request_id", (String) null);
        AnonymousClass16U A012 = r29.A01(jSONObject2.optString("currency"));
        String optString4 = jSONObject2.optString("payment_configuration");
        String optString5 = jSONObject2.optString("payment_type");
        String optString6 = jSONObject2.optString("transaction_id");
        int optInt = jSONObject2.optInt("transaction_status");
        if (TextUtils.isEmpty(optString6)) {
            optString6 = null;
        }
        String optString7 = jSONObject2.optString("payment_status", (String) null);
        String optString8 = jSONObject2.optString("payment_method");
        if (TextUtils.isEmpty(optString8)) {
            optString8 = null;
        }
        long optLong = jSONObject2.optLong("payment_timestamp");
        String optString9 = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        if (!TextUtils.isEmpty(optString9)) {
            str = optString9;
        }
        boolean optBoolean = jSONObject2.optBoolean("is_interactive");
        String optString10 = jSONObject2.optString("additional_note");
        JSONObject optJSONObject = jSONObject2.optJSONObject("installment");
        if (optJSONObject == null) {
            r8 = null;
        } else {
            r8 = new C206839u5(optJSONObject.getInt("max_installment_count"));
        }
        C207009uP A002 = A00(jSONObject2.getJSONObject("order"));
        ArrayList A05 = A05(jSONObject2.optJSONArray("beneficiaries"));
        ArrayList A06 = A06(jSONObject2.optJSONArray("external_payment_configurations"));
        boolean optBoolean2 = jSONObject2.optBoolean("maybe_paid_externally");
        ArrayList A07 = A07(jSONObject2.optJSONArray("payment_settings"));
        JSONObject optJSONObject2 = jSONObject2.optJSONObject("paid_amount");
        if (optJSONObject2 == null) {
            A00 = null;
        } else {
            A00 = C199449fK.A00(AnonymousClass16W.A06, new C199449fK(), optJSONObject2);
        }
        JSONArray optJSONArray = jSONObject2.optJSONArray("native_payment_methods");
        if (optJSONArray == null) {
            A0I = null;
        } else {
            A0I = AnonymousClass001.A0I();
            for (int i = 0; i < optJSONArray.length(); i++) {
                A0I.add(optJSONArray.getString(i));
            }
        }
        return new C207199ui(A012, A00, A002, r8, A01, optString2, string, optString3, str, optString4, optString5, optString6, optString7, optString8, optString10, jSONObject2.optString("logging_id"), A05, A06, A07, A0I, bArr, optInt, optLong, optBoolean, optBoolean2);
    }

    public static C207009uP A00(JSONObject jSONObject) {
        String str;
        C206899uB r9;
        String optString;
        String str2;
        JSONObject jSONObject2 = jSONObject;
        String string = jSONObject2.getString("status");
        String optString2 = jSONObject2.optString("description");
        C206979uM A01 = A01(jSONObject2.optJSONObject("subtotal"));
        C206979uM A012 = A01(jSONObject2.optJSONObject("tax"));
        JSONObject optJSONObject = jSONObject2.optJSONObject("discount");
        C206979uM A013 = A01(optJSONObject);
        if (optJSONObject != null) {
            str = optJSONObject.optString("discount_program_name");
        } else {
            str = null;
        }
        C206979uM A014 = A01(jSONObject2.optJSONObject("shipping"));
        ArrayList A0I = AnonymousClass001.A0I();
        JSONArray optJSONArray = jSONObject2.optJSONArray("items");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject jSONObject3 = (JSONObject) optJSONArray.get(i);
                JSONObject jSONObject4 = jSONObject3.getJSONObject("amount");
                JSONObject optJSONObject2 = jSONObject3.optJSONObject("sale_amount");
                String optString3 = jSONObject3.optString("product_id");
                if (TextUtils.isEmpty(optString3)) {
                    optString3 = null;
                }
                JSONObject optJSONObject3 = jSONObject3.optJSONObject("image");
                if (optJSONObject3 != null) {
                    str2 = optJSONObject3.optString("base64Thumbnail");
                } else {
                    str2 = null;
                }
                A0I.add(new C206959uJ(A01(jSONObject4), A01(optJSONObject2), jSONObject3.optString("retailer_id"), optString3, jSONObject3.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME), str2, jSONObject3.getInt("quantity")));
            }
        }
        JSONObject optJSONObject4 = jSONObject2.optJSONObject("expiration");
        if (optJSONObject4 != null) {
            long j = optJSONObject4.getLong("timestamp");
            String optString4 = optJSONObject4.optString("description");
            if (TextUtils.isEmpty(optString4)) {
                optString4 = null;
            }
            r9 = new C206899uB(j, optString4);
        } else {
            r9 = null;
        }
        String optString5 = jSONObject2.optString("order_type");
        if (!TextUtils.isEmpty(optString5)) {
            optString = "PAYMENT_REQUEST";
            if (!optString.equals(optString5)) {
                optString = "quick_pay";
                if (!optString.equals(optString5)) {
                    optString = "ORDER";
                }
            }
        } else {
            optString = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        }
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        return new C207009uP(r9, A01, A012, A013, A014, string, optString2, str, optString, A0I);
    }

    public static C207199ui A02(AnonymousClass16T r31, String str, byte[] bArr, boolean z) {
        C206839u5 r10;
        C207119ua r8;
        ArrayList arrayList;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            Log.e("CheckoutInfoContentParser/parseE2ECheckoutInfo/invalid native flow message does not have parameters json");
            return null;
        }
        try {
            JSONObject A1C = C36441kJ.A1C(str2);
            String string = A1C.getString("reference_id");
            String optString = A1C.optString("order_request_id", (String) null);
            String optString2 = A1C.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            AnonymousClass16U A01 = r31.A01(A1C.optString("currency"));
            C206979uM A012 = A01(A1C.optJSONObject("total_amount"));
            String optString3 = A1C.optString("payment_configuration");
            String optString4 = A1C.optString("payment_type");
            JSONObject optJSONObject = A1C.optJSONObject("installment");
            if (optJSONObject == null) {
                r10 = null;
            } else {
                r10 = new C206839u5(optJSONObject.getInt("max_installment_count"));
            }
            C207009uP A00 = A00(A1C.getJSONObject("order"));
            ArrayList A05 = A05(A1C.optJSONArray("beneficiaries"));
            ArrayList A06 = A06(A1C.optJSONArray("external_payment_configurations"));
            String optString5 = A1C.optString("transaction_id");
            String optString6 = A1C.optString("payment_method");
            String optString7 = A1C.optString("payment_status", (String) null);
            String optString8 = A1C.optString("additional_note");
            long optLong = A1C.optLong("payment_timestamp");
            ArrayList A07 = A07(A1C.optJSONArray("payment_settings"));
            JSONObject optJSONObject2 = A1C.optJSONObject("paid_amount");
            if (optJSONObject2 == null) {
                r8 = null;
            } else {
                r8 = C199449fK.A00(AnonymousClass16W.A06, new C199449fK(), optJSONObject2);
            }
            JSONArray optJSONArray = A1C.optJSONArray("native_payment_methods");
            if (optJSONArray == null) {
                arrayList = null;
            } else {
                arrayList = AnonymousClass001.A0I();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.getString(i));
                }
            }
            return new C207199ui(A01, r8, A00, r10, A012, A00.A01(), string, optString, optString2, optString3, optString4, optString5, optString7, optString6, optString8, (String) null, A05, A06, A07, arrayList, bArr, 0, optLong, z, false);
        } catch (JSONException unused) {
            C36321k7.A1P("CheckoutInfoContentParser/parseE2ECheckoutInfo/invalid paramsJson=", str2, AnonymousClass000.A0u());
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        if (r0.formatCase_ == 5) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0051, code lost:
        if (r0 == null) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A04(X.AnonymousClass8SX r3) {
        /*
            int r0 = r3.bitField1_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0014
            X.8Re r1 = r3.buttonsMessage_
            if (r1 != 0) goto L_0x000c
            X.8Re r1 = X.C173308Re.DEFAULT_INSTANCE
        L_0x000c:
            r0 = 0
            X.8Ox r0 = X.C170918Hz.A0E(r1, r0)
            java.lang.String r0 = r0.paramsJson_
            return r0
        L_0x0014:
            boolean r2 = r3.A10()
            if (r2 == 0) goto L_0x0056
            X.8SL r0 = r3.templateMessage_
            if (r0 != 0) goto L_0x0020
            X.8SL r0 = X.AnonymousClass8SL.DEFAULT_INSTANCE
        L_0x0020:
            int r1 = r0.formatCase_
            r0 = 5
            if (r1 != r0) goto L_0x0056
        L_0x0025:
            if (r2 == 0) goto L_0x004f
            X.8SL r0 = r3.templateMessage_
            r2 = r0
            if (r0 != 0) goto L_0x002e
            X.8SL r0 = X.AnonymousClass8SL.DEFAULT_INSTANCE
        L_0x002e:
            int r0 = r0.formatCase_
            r1 = 5
            if (r0 != r1) goto L_0x004f
            if (r2 != 0) goto L_0x0037
            X.8SL r2 = X.AnonymousClass8SL.DEFAULT_INSTANCE
        L_0x0037:
            int r0 = r2.formatCase_
            if (r0 != r1) goto L_0x0053
            java.lang.Object r0 = r2.format_
            X.8SV r0 = (X.AnonymousClass8SV) r0
        L_0x003f:
            X.8Q1 r0 = r0.A0u()
            r1 = 0
            X.B6c r0 = r0.buttons_
            java.lang.Object r0 = r0.get(r1)
            X.8P5 r0 = (X.AnonymousClass8P5) r0
            java.lang.String r0 = r0.buttonParamsJson_
            return r0
        L_0x004f:
            X.8SV r0 = r3.interactiveMessage_
            if (r0 != 0) goto L_0x003f
        L_0x0053:
            X.8SV r0 = X.AnonymousClass8SV.DEFAULT_INSTANCE
            goto L_0x003f
        L_0x0056:
            int r0 = r3.bitField1_
            r0 = r0 & 8
            boolean r0 = X.AnonymousClass000.A1P(r0)
            if (r0 != 0) goto L_0x0025
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203219nY.A04(X.8SX):java.lang.String");
    }

    public static ArrayList A05(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        ArrayList A0I = AnonymousClass001.A0I();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = (JSONObject) jSONArray.get(i);
            A0I.add(new C206319t7(jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME), jSONObject.optString("address_line1"), jSONObject.optString("address_line2"), jSONObject.optString("city"), jSONObject.optString("state"), jSONObject.optString("country"), jSONObject.optString("postal_code")));
        }
        return A0I;
    }

    public static ArrayList A06(JSONArray jSONArray) {
        ArrayList A0I = AnonymousClass001.A0I();
        if (!(jSONArray == null || jSONArray.length() == 0)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                A0I.add(new C206929uE(jSONObject.optString("uri"), jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE), jSONObject.optString("payment_instruction")));
            }
        }
        return A0I;
    }

    public static ArrayList A07(JSONArray jSONArray) {
        B5M b5m;
        C206909uC r1;
        C206839u5 r12;
        B5M aHj;
        ArrayList A0I = AnonymousClass001.A0I();
        if (!(jSONArray == null || jSONArray.length() == 0)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                String optString = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                if (optString.equals("payment_gateway")) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("payment_gateway");
                    if (optJSONObject != null) {
                        String optString2 = optJSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                        aHj = new C21332AHk(optString2, optJSONObject.optString("configuration_name"), optJSONObject.optJSONObject(optString2));
                    }
                } else if (optString.equals("payment_link")) {
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("payment_link");
                    if (optJSONObject2 != null) {
                        aHj = new C21333AHl(optJSONObject2.optString("uri"), optJSONObject2.optString("cancel_url"), optJSONObject2.optString("success_url"));
                    }
                } else {
                    String str = "pix_static_code";
                    if (optString.equals(str) || optString.equals("pix_dynamic_code")) {
                        if (optString.equals("pix_dynamic_code")) {
                            str = "pix_dynamic_code";
                        }
                        JSONObject optJSONObject3 = jSONObject.optJSONObject(str);
                        if (optJSONObject3 != null) {
                            b5m = new C21335AHn(optJSONObject3.optString("code"), optJSONObject3.optString("key"), optJSONObject3.optString("key_type"), optJSONObject3.optString("merchant_name"));
                        }
                    } else {
                        if (optString.equals("cards")) {
                            JSONObject optJSONObject4 = jSONObject.optJSONObject("cards");
                            if (optJSONObject4 != null) {
                                boolean optBoolean = optJSONObject4.optBoolean("enabled", true);
                                String optString3 = optJSONObject4.optString("payment_configuration");
                                JSONObject optJSONObject5 = optJSONObject4.optJSONObject("installment");
                                if (optJSONObject5 == null) {
                                    r12 = null;
                                } else {
                                    r12 = new C206839u5(optJSONObject5.getInt("max_installment_count"));
                                }
                                aHj = new C21331AHj(r12, optString3, optBoolean);
                            }
                        } else if (optString.equals("upi_merchant_configuration")) {
                            JSONObject optJSONObject6 = jSONObject.optJSONObject("upi_merchant_configuration");
                            String optString4 = optJSONObject6.optString("configuration_name");
                            String optString5 = optJSONObject6.optString("tr");
                            C21333AHl aHl = null;
                            JSONObject optJSONObject7 = optJSONObject6.optJSONObject("payment_link");
                            if (optJSONObject7 != null) {
                                aHl = new C21333AHl(optJSONObject7.optString("uri"), optJSONObject7.optString("cancel_url"), optJSONObject7.optString("success_url"));
                            }
                            b5m = new C21334AHm(aHl, optString5, optString4);
                        }
                    }
                    r1 = new C206909uC(b5m, optString);
                    A0I.add(r1);
                }
                r1 = new C206909uC(aHj, optString);
                A0I.add(r1);
            }
        }
        return A0I;
    }
}
