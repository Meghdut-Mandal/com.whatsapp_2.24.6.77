package X;

import android.database.Cursor;
import android.util.Log;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.77z  reason: invalid class name and case insensitive filesystem */
public class C1510877z implements C160247kh {
    public final C130756Mh A00;

    public AnonymousClass6TE Bw3(Cursor cursor) {
        Integer num;
        Integer num2;
        try {
            String string = cursor.getString(1);
            if (string == null) {
                return null;
            }
            Log.d("FacebookSsoTransformer", string);
            JSONObject A1C = C36441kJ.A1C(string);
            String optString = A1C.optString("userId");
            String optString2 = A1C.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            String optString3 = A1C.optString("profilePicUrl");
            String optString4 = A1C.optString("accessToken");
            String optString5 = A1C.optString("sso_settings_v2");
            AnonymousClass6O4 r5 = new AnonymousClass6O4(optString, optString2, optString3);
            ArrayList A002 = this.A00.A00(A1C.optJSONArray("session_cookies"));
            if (optString5 != null) {
                if (!optString5.isEmpty()) {
                    JSONObject A1C2 = C36441kJ.A1C(optString5);
                    long currentTimeMillis = System.currentTimeMillis();
                    Long valueOf = Long.valueOf(currentTimeMillis);
                    long optLong = A1C2.optLong("timestamp", currentTimeMillis);
                    Long valueOf2 = Long.valueOf(optLong);
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Current Time: ");
                    A0u.append(valueOf);
                    Log.d("FacebookSsoTransformer", AnonymousClass000.A0l(valueOf2, ", last updated timestamp: ", A0u));
                    if (currentTimeMillis - optLong <= TimeUnit.DAYS.toMillis(45)) {
                        JSONObject optJSONObject = A1C2.optJSONObject("sso_eligibility");
                        if (optJSONObject != null) {
                            String valueOf3 = String.valueOf(3);
                            num = C023109s.A0C;
                            num2 = C112035dF.A01(valueOf3, optJSONObject);
                        } else {
                            num2 = C023109s.A0C;
                            num = num2;
                        }
                    } else {
                        num2 = C023109s.A0C;
                        num = num2;
                    }
                    JSONObject optJSONObject2 = A1C2.optJSONObject("nta_eligibility");
                    if (optJSONObject2 != null) {
                        num = C112035dF.A01(String.valueOf(3), optJSONObject2);
                    }
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("SSO Eligibility: ");
                    A0u2.append(C90514aH.A0B(num2.intValue()));
                    A0u2.append(", NTA Eligibility: ");
                    Log.d("FacebookSSOTransformer", C36381kD.A10(A0u2, C90514aH.A0B(num.intValue())));
                    return new AnonymousClass6TE(optString4, A002, r5, new C120565ri(num2, num));
                }
            }
            num2 = C023109s.A0C;
            num = num2;
            StringBuilder A0u22 = AnonymousClass000.A0u();
            A0u22.append("SSO Eligibility: ");
            A0u22.append(C90514aH.A0B(num2.intValue()));
            A0u22.append(", NTA Eligibility: ");
            Log.d("FacebookSSOTransformer", C36381kD.A10(A0u22, C90514aH.A0B(num.intValue())));
            return new AnonymousClass6TE(optString4, A002, r5, new C120565ri(num2, num));
        } catch (JSONException e) {
            throw new AnonymousClass78U(e);
        } catch (JSONException e2) {
            throw new AnonymousClass78U(e2);
        }
    }

    public C1272967s Bw4(Cursor cursor, Integer num) {
        try {
            String string = cursor.getString(1);
            if (string == null) {
                return null;
            }
            JSONObject A1C = C36441kJ.A1C(string);
            JSONObject jSONObject = A1C.getJSONObject("profile");
            ArrayList A002 = this.A00.A00(A1C.optJSONArray("session_cookies"));
            String string2 = jSONObject.getString("uid");
            String string3 = A1C.getString("access_token");
            return new C1272967s(num, string2, string3, "FACEBOOK", A002, new AnonymousClass793(this, jSONObject), C108485Tr.FACEBOOK);
        } catch (JSONException e) {
            throw new AnonymousClass78U(e);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004b, code lost:
        return new X.AnonymousClass6TE(r6.getString("access_token"), (java.util.List) null, r3);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0042 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass6TE Bw2(android.database.Cursor r8) {
        /*
            r7 = this;
            java.lang.String r5 = "access_token"
            r0 = 1
            java.lang.String r0 = r8.getString(r0)     // Catch:{ JSONException -> 0x004c }
            r4 = 0
            if (r0 != 0) goto L_0x000b
            return r4
        L_0x000b:
            org.json.JSONObject r6 = X.C36441kJ.A1C(r0)     // Catch:{ JSONException -> 0x004c }
            java.lang.String r0 = "profile"
            org.json.JSONObject r3 = r6.getJSONObject(r0)     // Catch:{ JSONException -> 0x004c }
            java.lang.String r0 = "uid"
            java.lang.String r2 = r3.getString(r0)     // Catch:{ JSONException -> 0x004c }
            java.lang.String r0 = "name"
            java.lang.String r1 = r3.getString(r0)     // Catch:{ JSONException -> 0x004c }
            java.lang.String r0 = "pic_square"
            java.lang.String r0 = r3.getString(r0)     // Catch:{ JSONException -> 0x004c }
            X.6O4 r3 = new X.6O4     // Catch:{ JSONException -> 0x004c }
            r3.<init>(r2, r1, r0)     // Catch:{ JSONException -> 0x004c }
            X.6Mh r1 = r7.A00     // Catch:{ JSONException -> 0x0042 }
            java.lang.String r0 = "session_cookies"
            org.json.JSONArray r0 = r6.optJSONArray(r0)     // Catch:{ JSONException -> 0x0042 }
            java.util.ArrayList r2 = r1.A00(r0)     // Catch:{ JSONException -> 0x0042 }
            java.lang.String r0 = r6.getString(r5)     // Catch:{ JSONException -> 0x0042 }
            X.6TE r1 = new X.6TE     // Catch:{ JSONException -> 0x0042 }
            r1.<init>(r0, r2, r3)     // Catch:{ JSONException -> 0x0042 }
            return r1
        L_0x0042:
            java.lang.String r0 = r6.getString(r5)     // Catch:{ JSONException -> 0x004c }
            X.6TE r1 = new X.6TE     // Catch:{ JSONException -> 0x004c }
            r1.<init>(r0, r4, r3)     // Catch:{ JSONException -> 0x004c }
            return r1
        L_0x004c:
            r1 = move-exception
            X.78U r0 = new X.78U
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1510877z.Bw2(android.database.Cursor):X.6TE");
    }

    public C1510877z(C130756Mh r1) {
        this.A00 = r1;
    }
}
