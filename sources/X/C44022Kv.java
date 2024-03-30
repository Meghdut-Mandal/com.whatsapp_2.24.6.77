package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2Kv  reason: invalid class name and case insensitive filesystem */
public abstract class C44022Kv extends AnonymousClass3BY {
    public int A00;
    public String A01;
    public String A02;

    public boolean A04(String str) {
        try {
            JSONObject A1C = C36441kJ.A1C(str);
            this.A00 = A1C.optInt("seq_id", -1);
            this.A01 = A1C.optString("event_type", "unknown");
            this.A02 = A1C.optString("message_type", "unknown");
            return true;
        } catch (JSONException e) {
            Log.w("ConversationSketchEvent: fromJsonString threw: ", e);
            return false;
        }
    }

    public C44022Kv(int i, String str, String str2) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
    }

    public static String A01(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(str.getBytes(StandardCharsets.UTF_8));
            byte[] bArr = new byte[32];
            System.arraycopy(digest, 0, bArr, 0, 32);
            return C18750th.A06(bArr).toLowerCase();
        } catch (NoSuchAlgorithmException e) {
            Log.e("ConversationSketchEvent/generateIDHash unable to create id because sha256 instance could not created.", e);
            return null;
        }
    }
}
