package X;

import android.content.SharedPreferences;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.1EW  reason: invalid class name */
public final class AnonymousClass1EW {
    public final C19890wg A00;
    public final AnonymousClass00T A01 = new AnonymousClass00U(new AnonymousClass1EX(this));

    public AnonymousClass1EW(C19890wg r3) {
        AnonymousClass00C.A0D(r3, 1);
        this.A00 = r3;
    }

    public void A05(C21667AUj aUj) {
        LinkedHashMap A08 = C000400e.A08(new AnonymousClass011(aUj.A06, aUj));
        LinkedHashMap A012 = A01();
        if (true ^ A012.isEmpty()) {
            A08.putAll(A012);
        }
        A02(A08);
    }

    public void A06(List list) {
        boolean z;
        AnonymousClass00C.A0D(list, 0);
        LinkedHashMap A012 = A01();
        if (!A012.isEmpty()) {
            Iterator it = list.iterator();
            loop0:
            while (true) {
                z = false;
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    Object next = it.next();
                    if (!z) {
                        z = true;
                        if (A012.remove(next) == null) {
                        }
                    }
                }
            }
            if (z) {
                A02(A012);
            }
        }
    }

    public static final C21667AUj A00(String str) {
        C199659fi r3;
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        String string2 = jSONObject.getString("title");
        String string3 = jSONObject.getString("description");
        String string4 = jSONObject.getString("ctaText");
        String string5 = jSONObject.getString("scope");
        int i = jSONObject.getInt(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        boolean optBoolean = jSONObject.optBoolean("isCancelable", true);
        String optString = jSONObject.optString("phoenix_flow");
        AnonymousClass00C.A0B(optString);
        boolean z = false;
        if (optString.length() > 0) {
            z = true;
        }
        C206359tF r4 = null;
        if (z) {
            String string6 = new JSONObject(optString).getString("config");
            AnonymousClass00C.A08(string6);
            r3 = new C199659fi(string6);
        } else {
            r3 = null;
        }
        String optString2 = jSONObject.optString("legacy_payment_step_up_info");
        AnonymousClass00C.A0B(optString2);
        if (optString2.length() > 0) {
            r4 = AnonymousClass9ZX.A01(optString2);
        }
        AnonymousClass00C.A0B(string);
        AnonymousClass00C.A0B(string2);
        AnonymousClass00C.A0B(string3);
        AnonymousClass00C.A0B(string4);
        AnonymousClass00C.A0B(string5);
        return new C21667AUj(r3, r4, string, string2, string3, string4, string5, i, optBoolean);
    }

    private final LinkedHashMap A01() {
        String string = ((SharedPreferences) this.A01.getValue()).getString("framework_alert_list_info", (String) null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (string != null) {
            JSONObject jSONObject = new JSONObject(string);
            Iterator<String> keys = jSONObject.keys();
            AnonymousClass00C.A08(keys);
            while (keys.hasNext()) {
                String next = keys.next();
                AnonymousClass00C.A0B(next);
                String string2 = jSONObject.getString(next);
                AnonymousClass00C.A08(string2);
                linkedHashMap.put(next, A00(string2));
            }
        }
        return linkedHashMap;
    }

    private final void A02(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            C21667AUj aUj = (C21667AUj) entry.getValue();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, aUj.A06);
            jSONObject.put("title", aUj.A08);
            jSONObject.put("description", aUj.A05);
            jSONObject.put("ctaText", aUj.A04);
            jSONObject.put("scope", aUj.A07);
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, aUj.A01);
            jSONObject.put("isCancelable", aUj.A09);
            C199659fi r0 = aUj.A02;
            if (r0 != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("config", r0.A00);
                String obj = jSONObject2.toString();
                AnonymousClass00C.A08(obj);
                jSONObject.put("phoenix_flow", obj);
            }
            C206359tF r02 = aUj.A03;
            if (r02 != null) {
                jSONObject.put("legacy_payment_step_up_info", r02.A00().toString());
            }
            String obj2 = jSONObject.toString();
            AnonymousClass00C.A08(obj2);
            linkedHashMap.put(key, obj2);
        }
        SharedPreferences.Editor edit = ((SharedPreferences) this.A01.getValue()).edit();
        edit.putString("framework_alert_list_info", new JSONObject(linkedHashMap).toString());
        edit.apply();
    }

    public C21667AUj A03(String str) {
        String string = ((SharedPreferences) this.A01.getValue()).getString("framework_alert_list_info", (String) null);
        if (string != null) {
            JSONObject jSONObject = new JSONObject(string);
            Iterator<String> keys = jSONObject.keys();
            AnonymousClass00C.A08(keys);
            while (keys.hasNext()) {
                String next = keys.next();
                if (AnonymousClass00C.A0J(next, str)) {
                    String string2 = jSONObject.getString(next);
                    AnonymousClass00C.A08(string2);
                    return A00(string2);
                }
            }
        }
        return null;
    }

    public ArrayList A04() {
        LinkedHashMap A012 = A01();
        ArrayList arrayList = new ArrayList();
        if (!A012.isEmpty()) {
            arrayList.addAll(A012.values());
        }
        return arrayList;
    }
}
