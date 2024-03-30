package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.6Pw  reason: invalid class name and case insensitive filesystem */
public class C131636Pw {
    public final String A00;
    public final String A01;
    public final String A02;
    public final Map A03;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C131636Pw)) {
            return false;
        }
        C131636Pw r4 = (C131636Pw) obj;
        return C1901797e.A00(this.A01, r4.A01) && C1901797e.A00(this.A00, r4.A00) && C1901797e.A00(this.A02, r4.A02) && C1901797e.A00(this.A03, r4.A03);
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A01;
        objArr[1] = this.A00;
        objArr[2] = this.A02;
        return AnonymousClass000.A0M(this.A03, objArr, 3);
    }

    public String A01() {
        return (String) C90514aH.A0p(Integer.toString(-1), this.A03);
    }

    public String A03(int i) {
        String A1A = C36431kI.A1A(Integer.toString(i), this.A03);
        if (A1A == null) {
            return "";
        }
        return A1A;
    }

    public C131636Pw(String str, String str2, String str3, String str4, Map map) {
        this.A01 = str;
        this.A00 = str3;
        this.A02 = str4;
        map = map == null ? AnonymousClass001.A0J() : map;
        this.A03 = map;
        map.put(Integer.toString(-1), str2);
    }

    public static C131636Pw A00(String str) {
        HashMap A0J;
        Object obj;
        JSONObject A1C = C36441kJ.A1C(str);
        JSONObject optJSONObject = A1C.optJSONObject("bundles");
        if (optJSONObject == null) {
            A0J = null;
            obj = "";
        } else {
            A0J = AnonymousClass001.A0J();
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String A0C = AnonymousClass001.A0C(keys);
                A0J.put(A0C, optJSONObject.getString(A0C));
            }
            obj = A0J.get(Integer.toString(-1));
        }
        String string = A1C.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        C18740tg.A06(obj);
        return new C131636Pw(string, (String) obj, A1C.optString("locale_lang", (String) null), A1C.optString("url", (String) null), A0J);
    }

    public String A02() {
        JSONObject A1B = C36441kJ.A1B();
        A1B.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, this.A01);
        A1B.put("locale_lang", this.A00);
        A1B.put("url", this.A02);
        return C90484aE.A0l(new JSONObject(this.A03), "bundles", A1B);
    }
}
