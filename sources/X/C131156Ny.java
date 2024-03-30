package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.voipcalling.CallLinkInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.6Ny  reason: invalid class name and case insensitive filesystem */
public final class C131156Ny {
    public static final List A02 = C90494aF.A0j(new String[]{"ACCEPT", "START", "DENY", "OK", "DISMISS", "OPTIN", "OPTOUT"});
    public final C20810yC A00;
    public final AnonymousClass1Z5 A01;

    public final C134816be A01(JSONObject jSONObject) {
        String str = null;
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        if (!AnonymousClass00C.A0J(optString, CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID) || !jSONObject.has("v2") || !this.A00.A0E(6674)) {
            String A0e = C90474aD.A0e("light", jSONObject);
            String optString2 = jSONObject.optString("dark");
            AnonymousClass00C.A0B(optString);
            return new C134816be((AnonymousClass5TI) null, (AnonymousClass5TJ) null, A0e, optString2, optString);
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("v2");
        String A0e2 = C90474aD.A0e("light", jSONObject2);
        if (jSONObject2.has("dark")) {
            str = jSONObject2.getString("dark");
        }
        AnonymousClass00C.A0B(optString);
        return new C134816be(C111305c4.A00(jSONObject2.optString("role")), C111315c5.A00(jSONObject2.optString("style")), A0e2, str, optString);
    }

    public final AnonymousClass6AW A00(JSONObject jSONObject, int i) {
        AnonymousClass5VF r2;
        AnonymousClass5SO r17;
        C134566bF r22;
        C134636bM r13;
        C134636bM r14;
        int i2 = i;
        try {
            LinkedHashMap A1G = C36431kI.A1G();
            JSONArray jSONArray = jSONObject.getJSONObject("privacy-disclosure").getJSONArray("prompts");
            AnonymousClass00C.A08(jSONArray);
            C12320hr A012 = C63893Lv.A01(jSONArray);
            while (true) {
                if (A012.hasNext()) {
                    JSONObject jSONObject2 = (JSONObject) A012.next();
                    if (jSONObject2 != null) {
                        String A0e = C90474aD.A0e(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, jSONObject2);
                        String A0e2 = C90474aD.A0e("template", jSONObject2);
                        String optString = jSONObject2.optString("height");
                        AnonymousClass00C.A0B(optString);
                        if (optString.length() > 0) {
                            r17 = AnonymousClass5SO.valueOf(optString);
                        } else {
                            r17 = C134856bi.A0B;
                        }
                        C134816be A013 = A01(jSONObject2.optJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_ICON));
                        String optString2 = jSONObject2.optString("title");
                        String optString3 = jSONObject2.optString("body");
                        String optString4 = jSONObject2.optString("footer");
                        JSONArray optJSONArray = jSONObject2.optJSONArray("bullets");
                        ArrayList A0I = AnonymousClass001.A0I();
                        if (optJSONArray != null && optJSONArray.length() > 0) {
                            C12320hr A014 = C63893Lv.A01(optJSONArray);
                            while (A014.hasNext()) {
                                JSONObject jSONObject3 = (JSONObject) A014.next();
                                if (jSONObject3 != null) {
                                    A0I.add(new C134706bT(A01(jSONObject3.optJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_ICON)), C90474aD.A0e("text", jSONObject3), jSONObject3.optString("secondaryText")));
                                }
                            }
                        }
                        C134706bT[] r3 = (C134706bT[]) A0I.toArray(new C134706bT[0]);
                        JSONObject optJSONObject = jSONObject2.optJSONObject("nav");
                        if (optJSONObject == null) {
                            r22 = null;
                        } else {
                            r22 = new C134566bF(optJSONObject.optBoolean("dismissButton"));
                        }
                        JSONObject jSONObject4 = jSONObject2.getJSONObject("primaryButton");
                        if (jSONObject4 == null) {
                            r13 = null;
                        } else {
                            r13 = new C134636bM(C90474aD.A0e("action", jSONObject4), C90474aD.A0e("label", jSONObject4));
                        }
                        AnonymousClass00C.A0B(r13);
                        JSONObject optJSONObject2 = jSONObject2.optJSONObject("secondaryButton");
                        if (optJSONObject2 == null) {
                            r14 = null;
                        } else {
                            r14 = new C134636bM(C90474aD.A0e("action", optJSONObject2), C90474aD.A0e("label", optJSONObject2));
                        }
                        C134856bi r12 = new C134856bi(r13, r14, A013, r22, r17, A0e, A0e2, optString2, optString3, optString4, r3);
                        String str = r12.A07;
                        if (A1G.containsKey(str)) {
                            StringBuilder A0u = AnonymousClass000.A0u();
                            A0u.append("Duplicated prompt name ");
                            A0u.append(str);
                            r2 = new AnonymousClass5VF(AnonymousClass000.A0q(" in the disclosure", A0u));
                            break;
                        }
                        A1G.put(str, r12);
                    }
                } else {
                    ArrayList A0I2 = AnonymousClass001.A0I();
                    String str2 = "START";
                    if (!A1G.containsKey(str2)) {
                        r2 = new AnonymousClass5VF("The START prompt is not defined in the disclosure");
                    } else {
                        while (!C90494aF.A0j(new String[]{null, "ACCEPT", "DENY", "OK", "DISMISS", "OPTIN", "OPTOUT"}).contains(str2) && (!A1G.isEmpty())) {
                            C134856bi r23 = (C134856bi) A1G.get(str2);
                            if (r23 != null) {
                                A0I2.add(r23);
                                A1G.remove(str2);
                                str2 = r23.A00.A00;
                            } else {
                                StringBuilder A0u2 = AnonymousClass000.A0u();
                                A0u2.append("Prompt ");
                                A0u2.append(str2);
                                r2 = new AnonymousClass5VF(AnonymousClass000.A0q(" is not defined in the disclosure", A0u2));
                            }
                        }
                        return new AnonymousClass6AW(i2, A0I2);
                    }
                }
            }
            throw r2;
        } catch (Throwable th) {
            Throwable th2 = C90524aI.A0t(th).exception;
            if (th2 == null) {
                throw new C13170jR();
            }
            this.A01.A01(i2, C36371kC.A0n());
            throw new AnonymousClass5VF(th2);
        }
    }

    public C131156Ny(C20810yC r1, AnonymousClass1Z5 r2) {
        C36321k7.A0x(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
