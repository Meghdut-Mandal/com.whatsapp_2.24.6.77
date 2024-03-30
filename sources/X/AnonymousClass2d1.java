package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2d1  reason: invalid class name */
public final class AnonymousClass2d1 extends AnonymousClass3DL {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;

    public JSONObject A00() {
        JSONObject A002 = super.A00();
        try {
            Boolean bool = this.A00;
            if (bool != null) {
                A002.put("flash_call_end_success", bool.booleanValue());
            }
            Boolean bool2 = this.A02;
            if (bool2 != null) {
                A002.put("no_flash_call_id_received", bool2.booleanValue());
            }
            Boolean bool3 = this.A01;
            if (bool3 != null) {
                A002.put("invalid_flash_call_received", bool3.booleanValue());
            }
        } catch (JSONException unused) {
        }
        return A002;
    }

    public AnonymousClass2d1(int i, String str) {
        super(i, str);
    }
}
