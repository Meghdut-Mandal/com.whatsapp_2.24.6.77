package X;

import android.text.format.Time;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5Zd  reason: invalid class name and case insensitive filesystem */
public abstract class C109795Zd {
    public static final C132346Te A00(C19700wN r19, C24461Cn r20, C24431Ck r21, C133226Xi r22, C20810yC r23, InputStream inputStream, String str) {
        JSONObject jSONObject;
        try {
            String A00 = AnonymousClass14X.A00(inputStream);
            if (A00 == null || A00.length() == 0) {
                Log.e("gdrive-api-v2/backup/empty input");
                return null;
            }
            JSONObject A1C = C36441kJ.A1C(A00);
            String A01 = AnonymousClass6HO.A01(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (String) null, A1C);
            String A012 = AnonymousClass6HO.A01("updateTime", (String) null, A1C);
            if (A012 == null || A012.length() == 0) {
                Log.e("gdrive-api-v2/backup/no updateTime provided. malformed stream?");
                return null;
            }
            Time time = new Time();
            time.parse3339(A012);
            long millis = time.toMillis(true);
            long optLong = A1C.optLong("sizeBytes", -1);
            String A013 = AnonymousClass6HO.A01("activeTransactionId", (String) null, A1C);
            String A014 = AnonymousClass6HO.A01("metadata", (String) null, A1C);
            if (A014 == null || A014.length() == 0) {
                jSONObject = null;
            } else {
                jSONObject = C36441kJ.A1C(A014);
            }
            if (A01 != null && millis > 0) {
                try {
                    return new C132346Te(r19, r20, r21, r22, r23, str, A01, A013, jSONObject, millis, optLong);
                } catch (JSONException e) {
                    e = e;
                    Log.e("gdrive-api-v2/backup/unable to read stream", e);
                    return null;
                } catch (IOException e2) {
                    e = e2;
                    Log.e("gdrive-api-v2/backup/unable to read stream", e);
                    return null;
                }
            }
            return null;
        } catch (JSONException e3) {
            e = e3;
            Log.e("gdrive-api-v2/backup/unable to read stream", e);
            return null;
        } catch (IOException e4) {
            e = e4;
            Log.e("gdrive-api-v2/backup/unable to read stream", e);
            return null;
        }
    }
}
