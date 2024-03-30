package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.77y  reason: invalid class name and case insensitive filesystem */
public class C1510777y implements C160247kh {
    public final C130756Mh A00;

    public AnonymousClass6TE Bw2(Cursor cursor) {
        try {
            String string = cursor.getString(1);
            if (string == null) {
                return null;
            }
            JSONObject A1C = C36441kJ.A1C(string);
            ArrayList A002 = this.A00.A00(A1C.getJSONArray("session_cookies"));
            JSONObject jSONObject = A1C.getJSONObject("profile");
            return new AnonymousClass6TE(A1C.getString("access_token"), A002, new AnonymousClass6O4(jSONObject.getString("uid"), jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME), jSONObject.getString("profile_pic_url")));
        } catch (JSONException e) {
            throw new AnonymousClass78U(e);
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
            return new C1272967s(num, string2, string3, "FACEBOOK", A002, new AnonymousClass792(this, jSONObject), C108485Tr.FACEBOOK_LITE);
        } catch (JSONException e) {
            throw new AnonymousClass78U(e);
        }
    }

    public C1510777y(C130756Mh r1) {
        this.A00 = r1;
    }

    public /* synthetic */ AnonymousClass6TE Bw3(Cursor cursor) {
        return null;
    }
}
