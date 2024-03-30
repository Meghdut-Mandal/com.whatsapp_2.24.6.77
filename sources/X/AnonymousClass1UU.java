package X;

import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1UU  reason: invalid class name */
public class AnonymousClass1UU {
    public Set A00 = null;
    public final AnonymousClass005 A01;
    public final C19700wN A02;
    public final C19420v0 A03;
    public final AnonymousClass132 A04;
    public final AnonymousClass133 A05;
    public final AnonymousClass1UW A06;

    public static final C134886bl A00(JSONObject jSONObject) {
        AnonymousClass00C.A0D(jSONObject, 0);
        C123805x7 r2 = new C123805x7();
        r2.A00 = Boolean.valueOf(jSONObject.optBoolean("secure", false));
        r2.A01 = Long.valueOf(jSONObject.optLong("expiry", 0));
        r2.A02 = AnonymousClass6HO.A01("domain", (String) null, jSONObject);
        r2.A03 = AnonymousClass6HO.A01(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (String) null, jSONObject);
        r2.A04 = AnonymousClass6HO.A01("path", (String) null, jSONObject);
        r2.A05 = AnonymousClass6HO.A01("value", (String) null, jSONObject);
        Boolean bool = r2.A00;
        C18740tg.A06(bool);
        AnonymousClass00C.A08(bool);
        boolean booleanValue = bool.booleanValue();
        Long l = r2.A01;
        C18740tg.A06(l);
        AnonymousClass00C.A08(l);
        long longValue = l.longValue();
        String str = r2.A02;
        C18740tg.A06(str);
        AnonymousClass00C.A08(str);
        String str2 = r2.A03;
        C18740tg.A06(str2);
        AnonymousClass00C.A08(str2);
        String str3 = r2.A04;
        C18740tg.A06(str3);
        AnonymousClass00C.A08(str3);
        String str4 = r2.A05;
        C18740tg.A06(str4);
        AnonymousClass00C.A08(str4);
        String obj = new Uri.Builder().scheme("https").authority(r2.A02).build().toString();
        AnonymousClass00C.A08(obj);
        return new C134886bl(str, str2, str3, str4, obj, longValue, booleanValue);
    }

    private String A01(String str) {
        byte[] bArr;
        try {
            C1264463z A002 = AnonymousClass132.A00(new JSONArray(str));
            if (A002 == null) {
                bArr = null;
            } else {
                bArr = this.A05.A02(A002, AnonymousClass6JD.A0V);
            }
            if (bArr != null) {
                return new String(bArr, C19430v1.A0D);
            }
            this.A02.A0E("FBCredentialsStore/decryptFbUsers", "Failed to decrypt fb users", true);
            throw new IllegalStateException("Failed to decrypt fb users");
        } catch (JSONException e) {
            this.A02.A0E("FBCredentialsStore/decryptFbUsers", e.getMessage(), true);
            throw new IllegalStateException("Failed to decrypt fb users", e);
        }
    }

    private HashMap A02() {
        String A012;
        AnonymousClass005 r7 = this.A01;
        String string = AnonymousClass1UX.A00((AnonymousClass1UX) r7.get()).getString("pref_fb_user_credentials_encrypted", (String) null);
        if (string == null) {
            C19420v0 r4 = this.A03;
            A012 = ((SharedPreferences) r4.A00.get()).getString("pref_fb_user_credentials", (String) null);
            if (A012 != null) {
                ((AnonymousClass1UX) r7.get()).A01(A05(A012));
                C19420v0.A00(r4).remove("pref_fb_user_credentials").apply();
            }
        } else {
            A012 = A01(string);
        }
        if (A012 == null) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(A012);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            boolean z = false;
            for (Object next2 : hashMap.keySet()) {
                JSONObject jSONObject2 = new JSONObject((String) hashMap.get(next2));
                if (jSONObject2.has("accessToken")) {
                    String string2 = jSONObject2.getString("accessToken");
                    jSONObject2.remove("accessToken");
                    jSONObject2.put("access_token", string2);
                    hashMap.put(next2, jSONObject2.toString());
                    z = true;
                }
            }
            if (!z) {
                return hashMap;
            }
            ((AnonymousClass1UX) r7.get()).A01(A05(A03(hashMap).toString()));
            return hashMap;
        } catch (JSONException e) {
            throw new IllegalStateException("FBCredentialsStore : Failed to parse data from store", e);
        }
    }

    public static JSONObject A03(Map map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    public String A05(String str) {
        String A002;
        C1264463z A012 = this.A05.A01(AnonymousClass6JD.A0V, str.getBytes(C19430v1.A0D));
        if (A012 != null && (A002 = A012.A00()) != null && str.equals(A01(A002))) {
            return A002;
        }
        this.A02.A0E("FBCredentialsStore/encryptFbUsers", "Failed to encrypt fb users", true);
        throw new IllegalStateException("Failed to encrypt fb users");
    }

    public boolean A07(AnonymousClass6OQ r8) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("FBCredentialsStore/storeFbIdentity/FbUserType");
        AnonymousClass6P0 r1 = r8.A01;
        sb.append(r1);
        Log.i(sb.toString());
        HashMap A022 = A02();
        try {
            String str2 = r1.A01;
            JSONObject jSONObject = new JSONObject();
            Object obj = r8.A04.A00;
            C18740tg.A06(obj);
            JSONObject put = jSONObject.put("fbid", ((Number) obj).longValue());
            Object obj2 = r8.A05.A00;
            C18740tg.A06(obj2);
            JSONObject put2 = put.put("password", obj2);
            Object obj3 = r8.A02.A00;
            C18740tg.A06(obj3);
            JSONObject put3 = put2.put("access_token", obj3).put("timestamp", r8.A00).put("ttl", r8.A07).put("analytics_claim", r8.A08).put("usertype", str2);
            C135086c7 r0 = r8.A03;
            if (r0 != null) {
                Object obj4 = r0.A00;
                C18740tg.A06(obj4);
                put3.put("session_cookie_current_user", ((C134886bl) obj4).A00());
            }
            C135086c7 r02 = r8.A06;
            if (r02 != null) {
                Object obj5 = r02.A00;
                C18740tg.A06(obj5);
                put3.put("session_cookie_session_identifier", ((C134886bl) obj5).A00());
            }
            A022.put(str2, put3.toString());
            try {
                ((AnonymousClass1UX) this.A01.get()).A01(A05(A03(A022).toString()));
                Set set = this.A00;
                if (set == null) {
                    set = Collections.synchronizedSet(new HashSet(A02().keySet()));
                    this.A00 = set;
                }
                set.add(str2);
                return true;
            } catch (JSONException e) {
                e = e;
                str = "FBCredentialsStore/storeFbIdentity/setPrefFbUserCredentialsEncrypted/JSONException";
                Log.e(str);
                C18740tg.A0A(e);
                return false;
            }
        } catch (JSONException e2) {
            e = e2;
            str = "FBCredentialsStore/storeFbIdentity/getEntityAsJsonString/JSONException";
            Log.e(str);
            C18740tg.A0A(e);
            return false;
        }
    }

    public AnonymousClass1UU(C19700wN r2, C19420v0 r3, AnonymousClass132 r4, AnonymousClass133 r5, AnonymousClass1UW r6, AnonymousClass005 r7) {
        this.A02 = r2;
        this.A04 = r4;
        this.A03 = r3;
        this.A05 = r5;
        this.A06 = r6;
        this.A01 = r7;
    }

    public AnonymousClass6OQ A04(AnonymousClass6P0 r17) {
        String str;
        Long l;
        String str2;
        C134886bl r5;
        HashMap A022 = A02();
        StringBuilder sb = new StringBuilder();
        sb.append("FBCredentialsStore/getFBIdentity/FbUserType: ");
        AnonymousClass6P0 r4 = r17;
        sb.append(r4);
        Log.i(sb.toString());
        if (A022.isEmpty()) {
            str = "FBCredentialsStore/getFBIdentity/fbUsers is empty";
        } else {
            String str3 = (String) A022.get(r4.A01);
            if (str3 == null || str3.isEmpty()) {
                str = "FBCredentialsStore/getFBIdentity/userCredentials is null";
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str3);
                    long j = jSONObject.getLong("fbid");
                    String string = jSONObject.getString("password");
                    String string2 = jSONObject.getString("access_token");
                    long j2 = jSONObject.getLong("timestamp");
                    C134886bl r6 = null;
                    if (jSONObject.has("ttl")) {
                        l = Long.valueOf(jSONObject.optLong("ttl"));
                    } else {
                        l = null;
                    }
                    if (jSONObject.has("analytics_claim")) {
                        str2 = jSONObject.optString("analytics_claim");
                    } else {
                        str2 = null;
                    }
                    AnonymousClass6P0 r7 = new AnonymousClass6P0(jSONObject.getString("usertype"));
                    if (jSONObject.has("session_cookie_current_user")) {
                        r5 = A00(jSONObject.getJSONObject("session_cookie_current_user"));
                    } else {
                        r5 = null;
                    }
                    if (jSONObject.has("session_cookie_session_identifier")) {
                        r6 = A00(jSONObject.getJSONObject("session_cookie_session_identifier"));
                    }
                    return new AnonymousClass6OQ(r5, r6, r7, l, string, string2, str2, j, j2);
                } catch (JSONException e) {
                    Log.e("FBCredentialsStore/getFBIdentity/getJsonStringAsEntity/JSONException");
                    C18740tg.A0A(e);
                    return null;
                }
            }
        }
        Log.i(str);
        return null;
    }

    public void A06(AnonymousClass6P0 r5) {
        HashMap A022 = A02();
        String str = r5.A01;
        if (!TextUtils.isEmpty((String) A022.get(str))) {
            A022.remove(str);
            ((AnonymousClass1UX) this.A01.get()).A01(A05(new JSONObject(A022).toString()));
            Set set = this.A00;
            if (set == null) {
                set = Collections.synchronizedSet(new HashSet(A02().keySet()));
                this.A00 = set;
            }
            set.remove(str);
        }
    }
}
