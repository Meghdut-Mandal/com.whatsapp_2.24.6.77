package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.9ma  reason: invalid class name and case insensitive filesystem */
public abstract class C202749ma {
    public static JSONObject A05(C207199ui r8, boolean z) {
        JSONArray A0u;
        JSONObject jSONObject = null;
        JSONObject A1B = C36441kJ.A1B();
        AnonymousClass16U r0 = r8.A08;
        if (r0 != null) {
            A1B.put("currency", ((AnonymousClass16V) r0).A02);
        }
        C206839u5 r02 = r8.A0A;
        if (r02 != null) {
            JSONObject A1B2 = C36441kJ.A1B();
            A1B2.put("max_installment_count", r02.A00);
            A1B.put("installment", A1B2);
        }
        JSONArray A00 = A00(r8.A0J);
        if (A00 != null) {
            A1B.put("external_payment_configurations", A00);
        }
        JSONArray A02 = A02(r8.A0I);
        if (A02 != null) {
            A1B.put("beneficiaries", A02);
        }
        String A05 = r8.A05();
        if (A05 != null) {
            A1B.put("payment_configuration", A05);
        }
        String str = r8.A0E;
        if (str != null) {
            A1B.put("payment_type", str);
        }
        String str2 = r8.A06;
        if (str2 != null) {
            A1B.put("transaction_id", str2);
        }
        if (!z) {
            C206979uM r03 = r8.A0B;
            if (r03 != null) {
                A1B.put("total_amount", A04(r03));
            }
            A1B.put("reference_id", r8.A0F);
            String str3 = r8.A0D;
            if (str3 != null) {
                A1B.put("order_request_id", str3);
            }
        }
        String str4 = r8.A0H;
        if (str4 != null) {
            A1B.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str4);
        }
        String str5 = r8.A04;
        if (str5 != null) {
            A1B.put("payment_method", str5);
        }
        String str6 = r8.A05;
        if (str6 != null) {
            A1B.put("payment_status", str6);
        }
        long j = r8.A01;
        if (j > 0) {
            A1B.put("payment_timestamp", j);
        }
        A1B.put("order", A03(r8.A09));
        JSONArray A01 = A01(r8.A0L);
        if (A01 != null) {
            A1B.put("payment_settings", A01);
        }
        String str7 = r8.A0C;
        if (str7 != null) {
            A1B.put("additional_note", str7);
        }
        C207119ua r04 = r8.A02;
        if (r04 != null) {
            jSONObject = r04.A02();
        }
        if (jSONObject != null) {
            A1B.put("paid_amount", jSONObject);
        }
        List<Object> list = r8.A0K;
        if (list == null) {
            A0u = null;
        } else {
            A0u = C90524aI.A0u();
            for (Object put : list) {
                A0u.put(put);
            }
        }
        if (A0u != null) {
            A1B.put("native_payment_methods", A0u);
        }
        return A1B;
    }

    public static JSONArray A00(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONArray A0u = C90524aI.A0u();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C206929uE r3 = (C206929uE) it.next();
            JSONObject A1B = C36441kJ.A1B();
            A1B.put("uri", r3.A02);
            A1B.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r3.A01);
            A1B.put("payment_instruction", r3.A00);
            A0u.put(A1B);
        }
        return A0u;
    }

    public static JSONArray A01(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONArray A0u = C90524aI.A0u();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C206909uC r1 = (C206909uC) it.next();
            JSONObject A1B = C36441kJ.A1B();
            String str = r1.A01;
            A1B.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
            B5M b5m = r1.A00;
            if (b5m != null) {
                String str2 = "payment_gateway";
                if (!str.equals(str2)) {
                    str2 = "payment_link";
                    if (!str.equals(str2)) {
                        str2 = "pix_static_code";
                        if (!str.equals(str2)) {
                            str2 = "pix_dynamic_code";
                            if (!str.equals(str2)) {
                                str2 = "cards";
                                if (!str.equals(str2)) {
                                    str2 = "upi_merchant_configuration";
                                    if (!str.equals(str2)) {
                                    }
                                }
                            }
                        }
                    }
                }
                A1B.put(str2, b5m.Bvn());
            }
            A0u.put(A1B);
        }
        return A0u;
    }

    public static JSONArray A02(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONArray A0u = C90524aI.A0u();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C206319t7.A00((C206319t7) it.next(), A0u, C36441kJ.A1B());
        }
        return A0u;
    }

    public static JSONObject A03(C207009uP r7) {
        JSONObject A1B = C36441kJ.A1B();
        A1B.put("status", r7.A01);
        String str = r7.A00;
        if (str != null) {
            A1B.put("description", str);
        }
        C206979uM r0 = r7.A05;
        if (r0 != null) {
            A1B.put("subtotal", A04(r0));
        }
        C206979uM r02 = r7.A06;
        if (r02 != null) {
            A1B.put("tax", A04(r02));
        }
        C206979uM r03 = r7.A03;
        if (r03 != null) {
            String str2 = r7.A07;
            JSONObject A04 = A04(r03);
            if (!TextUtils.isEmpty(str2)) {
                A04.put("discount_program_name", str2);
            }
            A1B.put("discount", A04);
        }
        C206979uM r04 = r7.A04;
        if (r04 != null) {
            A1B.put("shipping", A04(r04));
        }
        C206899uB r1 = r7.A02;
        if (r1 != null) {
            JSONObject A1B2 = C36441kJ.A1B();
            A1B2.put("timestamp", r1.A00);
            String str3 = r1.A01;
            if (!TextUtils.isEmpty(str3)) {
                A1B2.put("description", str3);
            }
            A1B.put("expiration", A1B2);
        }
        String str4 = r7.A08;
        if (str4 != null) {
            A1B.put("order_type", str4);
        }
        List<C206959uJ> list = r7.A09;
        JSONArray A0u = C90524aI.A0u();
        for (C206959uJ r5 : list) {
            JSONObject A1B3 = C36441kJ.A1B();
            String str5 = r5.A06;
            if (!TextUtils.isEmpty(str5)) {
                A1B3.put("retailer_id", str5);
            }
            String str6 = r5.A00;
            if (str6 != null) {
                JSONObject A1B4 = C36441kJ.A1B();
                A1B4.put("base64Thumbnail", str6);
                A1B3.put("image", A1B4);
            }
            String str7 = r5.A05;
            if (!TextUtils.isEmpty(str7)) {
                A1B3.put("product_id", str7);
            }
            A1B3.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r5.A04);
            A1B3.put("amount", A04(r5.A02));
            A1B3.put("quantity", r5.A01);
            C206979uM r05 = r5.A03;
            if (r05 != null) {
                A1B3.put("sale_amount", A04(r05));
            }
            A0u.put(A1B3);
        }
        A1B.put("items", A0u);
        return A1B;
    }

    public static JSONObject A04(C206979uM r4) {
        JSONObject A1B = C36441kJ.A1B();
        A1B.put("value", r4.A01);
        A1B.put("offset", r4.A00);
        String str = r4.A02;
        if (!TextUtils.isEmpty(str)) {
            A1B.put("description", str);
        }
        return A1B;
    }
}
