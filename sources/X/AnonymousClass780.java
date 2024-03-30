package X;

import android.database.Cursor;
import android.util.Log;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.780  reason: invalid class name */
public class AnonymousClass780 implements C160247kh {
    public AnonymousClass6TE Bw3(Cursor cursor) {
        try {
            String string = cursor.getString(1);
            if (string == null) {
                return null;
            }
            JSONObject A1C = C36441kJ.A1C(string);
            String optString = A1C.optString("userId");
            String optString2 = A1C.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            String optString3 = A1C.optString("profilePicUrl");
            return new AnonymousClass6TE(A1C.optString("accessToken"), (List) null, new AnonymousClass6O4(optString, optString2, optString3), A00(A1C.optString("sso_settings_v2")));
        } catch (JSONException e) {
            throw new AnonymousClass78U(e);
        }
    }

    public C120565ri A00(String str) {
        Integer num;
        Integer num2;
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    JSONObject A1C = C36441kJ.A1C(str);
                    long currentTimeMillis = System.currentTimeMillis();
                    Long valueOf = Long.valueOf(currentTimeMillis);
                    long optLong = A1C.optLong("timestamp", currentTimeMillis);
                    Long valueOf2 = Long.valueOf(optLong);
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Current Time: ");
                    A0u.append(valueOf);
                    Log.d("InstagramSSOTransformer", AnonymousClass000.A0l(valueOf2, ", last updated timestamp: ", A0u));
                    if (currentTimeMillis - optLong <= TimeUnit.DAYS.toMillis(45)) {
                        JSONObject optJSONObject = A1C.optJSONObject("sso_eligibility");
                        if (optJSONObject != null) {
                            String valueOf3 = String.valueOf(3);
                            num2 = C023109s.A0C;
                            num = C112035dF.A01(valueOf3, optJSONObject);
                        } else {
                            num = C023109s.A0C;
                            num2 = num;
                        }
                    } else {
                        num = C023109s.A0C;
                        num2 = num;
                    }
                    JSONObject optJSONObject2 = A1C.optJSONObject("nta_eligibility");
                    if (optJSONObject2 != null) {
                        num2 = C112035dF.A01(String.valueOf(3), optJSONObject2);
                    }
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("SSO Eligibility: ");
                    A0u2.append(C90514aH.A0B(num.intValue()));
                    A0u2.append(", NTA Eligibility: ");
                    Log.d("InstagramSSOTransformer", C36381kD.A10(A0u2, C90514aH.A0B(num2.intValue())));
                    return new C120565ri(num, num2);
                }
            } catch (JSONException e) {
                throw new AnonymousClass78U(e);
            }
        }
        num = C023109s.A0C;
        num2 = num;
        StringBuilder A0u22 = AnonymousClass000.A0u();
        A0u22.append("SSO Eligibility: ");
        A0u22.append(C90514aH.A0B(num.intValue()));
        A0u22.append(", NTA Eligibility: ");
        Log.d("InstagramSSOTransformer", C36381kD.A10(A0u22, C90514aH.A0B(num2.intValue())));
        return new C120565ri(num, num2);
    }

    public AnonymousClass6TE Bw2(Cursor cursor) {
        String str;
        int columnIndex = cursor.getColumnIndex("COL_USERNAME");
        int columnIndex2 = cursor.getColumnIndex("COL_FULL_NAME");
        int columnIndex3 = cursor.getColumnIndex("COL_PROFILE_PHOTO_URL");
        int columnIndex4 = cursor.getColumnIndex("COL_SESSION_ID");
        int columnIndex5 = cursor.getColumnIndex("COL_SSO_SETTINGS_CACHE");
        if (columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1 || columnIndex4 == -1) {
            throw new AnonymousClass78U();
        }
        String string = cursor.getString(columnIndex);
        Objects.requireNonNull(string);
        if (columnIndex5 != -1) {
            str = cursor.getString(columnIndex5);
        } else {
            str = "";
        }
        C120565ri A00 = A00(str);
        return new AnonymousClass6TE(cursor.getString(columnIndex4), (List) null, new AnonymousClass6O4(string, cursor.getString(columnIndex2), cursor.getString(columnIndex3)), A00);
    }

    public C1272967s Bw4(Cursor cursor, Integer num) {
        int columnIndex = cursor.getColumnIndex("COL_USERNAME");
        int columnIndex2 = cursor.getColumnIndex("COL_FULL_NAME");
        int columnIndex3 = cursor.getColumnIndex("COL_PROFILE_PHOTO_URL");
        int columnIndex4 = cursor.getColumnIndex("COL_SESSION_ID");
        if (columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1 || columnIndex4 == -1) {
            throw new AnonymousClass78U();
        }
        String string = cursor.getString(columnIndex);
        Objects.requireNonNull(string);
        String string2 = cursor.getString(columnIndex4);
        C108485Tr r9 = C108485Tr.INSTAGRAM;
        return new C1272967s(num, string, string2, "INSTAGRAM", (List) null, new AnonymousClass797(cursor, this, columnIndex2, columnIndex3), r9);
    }
}
