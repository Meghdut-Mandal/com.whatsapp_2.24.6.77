package X;

import android.util.Log;
import com.facebook.android.exoplayer2.util.Util;
import java.nio.charset.Charset;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5Y8  reason: invalid class name */
public abstract class AnonymousClass5Y8 {
    public static byte[] A00(byte[] bArr) {
        if (Util.A00 >= 27) {
            return bArr;
        }
        try {
            Charset charset = C114085gc.A05;
            JSONObject A1C = C36441kJ.A1C(new String(bArr, charset));
            StringBuilder A0i = C90524aI.A0i("{\"keys\":[");
            JSONArray jSONArray = A1C.getJSONArray("keys");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    A0i.append(",");
                }
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                A0i.append("{\"k\":\"");
                A0i.append(jSONObject.getString("k").replace('-', '+').replace('_', '/'));
                A0i.append("\",\"kid\":\"");
                A0i.append(jSONObject.getString("kid").replace('-', '+').replace('_', '/'));
                A0i.append("\",\"kty\":\"");
                A0i.append(jSONObject.getString("kty"));
                A0i.append("\"}");
            }
            return AnonymousClass000.A0q("]}", A0i).getBytes(charset);
        } catch (JSONException e) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Failed to adjust response data: ");
            Log.e("ClearKeyUtil", AnonymousClass000.A0q(new String(bArr, C114085gc.A05), A0u), e);
            return bArr;
        }
    }
}
