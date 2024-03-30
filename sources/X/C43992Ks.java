package X;

import com.whatsapp.util.Log;
import org.json.JSONException;

/* renamed from: X.2Ks  reason: invalid class name and case insensitive filesystem */
public class C43992Ks extends C44022Kv {
    public boolean A00;

    public boolean A04(String str) {
        try {
            super.A04(str);
            this.A00 = C36441kJ.A1C(str).optBoolean("contains_url", false);
            return true;
        } catch (JSONException e) {
            Log.w("ConversationSketchTextEvent: fromJsonString threw: ", e);
            return false;
        }
    }

    public C43992Ks(int i, String str, boolean z) {
        super(i, str, "text");
        this.A00 = z;
    }

    public C43992Ks() {
        super(-1, "unknown", "text");
        this.A00 = false;
    }
}
