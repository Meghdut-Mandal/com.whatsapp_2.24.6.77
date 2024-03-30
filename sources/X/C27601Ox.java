package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Ox  reason: invalid class name and case insensitive filesystem */
public class C27601Ox {
    public JSONObject A00;
    public final C19700wN A01;
    public final C19630wG A02;

    public String A00(String str) {
        try {
            JSONObject jSONObject = this.A00;
            if (jSONObject == null) {
                InputStream open = this.A02.A00.getAssets().open("whatsapp-schema-persist-ids.json");
                byte[] bArr = new byte[open.available()];
                open.read(bArr);
                open.close();
                jSONObject = new JSONObject(new String(bArr, DefaultCrypto.UTF_8));
                this.A00 = jSONObject;
            }
            return jSONObject.getJSONObject("data").getString(str);
        } catch (IOException | JSONException e) {
            StringBuilder sb = new StringBuilder("Unable to get persisted ID");
            sb.append(". is JSONException? ");
            sb.append(e instanceof JSONException);
            this.A01.A0E("JSONPersistedQueryProvider", sb.toString(), false);
            return null;
        }
    }

    public C27601Ox(C19700wN r1, C19630wG r2) {
        this.A01 = r1;
        this.A02 = r2;
    }
}
