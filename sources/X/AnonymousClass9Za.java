package X;

import android.content.Context;
import android.text.SpannableString;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9Za  reason: invalid class name */
public abstract class AnonymousClass9Za {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r14.isEmpty() != false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C206369tH A00(android.content.Context r13, java.util.List r14) {
        /*
            r3 = 1
            r12 = 0
            if (r14 == 0) goto L_0x000b
            boolean r1 = r14.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x000c
        L_0x000b:
            r0 = 1
        L_0x000c:
            r11 = 0
            if (r0 != 0) goto L_0x005d
            java.lang.Object r2 = r14.get(r12)
            X.9uC r2 = (X.C206909uC) r2
            java.lang.String r1 = r2.A01
            java.lang.String r0 = "payment_link"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x005d
            X.B5M r0 = r2.A00
            if (r0 == 0) goto L_0x005d
            X.AHl r0 = (X.C21333AHl) r0
            java.lang.String r0 = r0.A02
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r1 = r0.getHost()
            r0 = 2131891873(0x7f1216a1, float:1.9418478E38)
            java.lang.String r6 = X.C36351kA.A0w(r13, r1, r3, r0)
            X.AnonymousClass00C.A08(r6)
            r0 = 2131887154(0x7f120432, float:1.9408907E38)
            java.lang.String r10 = X.C36361kB.A0m(r13, r0)
            X.9Vr r3 = new X.9Vr
            r3.<init>(r11, r12)
            X.9Vp r1 = new X.9Vp
            r1.<init>(r11, r12)
            X.9Vq r2 = new X.9Vq
            r2.<init>(r11, r12)
            java.lang.String r4 = "checkout_lite"
            java.lang.String r5 = ""
            r8 = r5
            r9 = r5
            r13 = 0
            X.9tH r0 = new X.9tH
            r7 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x005d:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9Za.A00(android.content.Context, java.util.List):X.9tH");
    }

    public static LinkedHashMap A01(Context context, String str, List list) {
        LinkedHashMap A02 = A02(str);
        C206369tH A00 = A00(context, list);
        if (A00 != null) {
            A02.put("checkout_lite", A00);
        }
        return A02;
    }

    public static final LinkedHashMap A02(String str) {
        LinkedHashMap A1G = C36431kI.A1G();
        if (str != null) {
            try {
                JSONArray jSONArray = C36441kJ.A1C(str).getJSONArray("payment_options");
                AnonymousClass00C.A0B(jSONArray);
                for (Object obj : C15060md.A00(new C12790if(new AnonymousClass7TH(jSONArray), new C18650tV(C15040mb.A05(0, jSONArray.length()), 0))).toArray(new JSONObject[0])) {
                    JSONObject jSONObject = (JSONObject) obj;
                    AnonymousClass00C.A0D(jSONObject, 0);
                    String string = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                    JSONArray jSONArray2 = jSONObject.getJSONArray("url_regex_list");
                    AnonymousClass00C.A0B(jSONArray2);
                    ArrayList A14 = C36441kJ.A14(r2);
                    for (Object add : C15060md.A00(new C12790if(new AnonymousClass7TG(jSONArray2), new C18650tV(C15040mb.A05(0, jSONArray2.length()), 0))).toArray(new String[0])) {
                        A14.add(add);
                    }
                    JSONObject jSONObject2 = jSONObject.getJSONObject("title");
                    String string2 = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                    String string3 = jSONObject2.getString("default_text");
                    JSONObject jSONObject3 = jSONObject.getJSONObject("subtitle");
                    String string4 = jSONObject3.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                    String string5 = jSONObject3.getString("default_text");
                    JSONObject jSONObject4 = jSONObject.getJSONObject("button");
                    String string6 = jSONObject4.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                    String string7 = jSONObject4.getString("default_text");
                    C195719Vr r3 = new C195719Vr((SpannableString) null, false);
                    C195699Vp r2 = new C195699Vp((SpannableString) null, false);
                    C195709Vq r1 = new C195709Vq((SpannableString) null, false);
                    C90474aD.A1A(string, string2, string3);
                    C90474aD.A1A(string4, string5, string6);
                    AnonymousClass00C.A0B(string7);
                    String str2 = string3;
                    String str3 = string2;
                    String str4 = string;
                    C195719Vr r19 = r3;
                    C195709Vq r18 = r1;
                    C195699Vp r17 = r2;
                    C206369tH r16 = new C206369tH(r17, r18, r19, str4, str3, str2, string4, string5, string6, string7, A14, 0, true);
                    A1G.put(r16.A0A, r16);
                }
            } catch (JSONException e) {
                C36321k7.A1W("OrderDetailsPaymentOptions/parseOptions failed to parse payment options json: ", AnonymousClass000.A0u(), e);
            }
        }
        return A1G;
    }
}
