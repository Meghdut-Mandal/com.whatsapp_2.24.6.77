package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2d2  reason: invalid class name */
public final class AnonymousClass2d2 extends AnonymousClass3DL {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;

    public JSONObject A00() {
        JSONObject A002 = super.A00();
        try {
            Integer num = this.A03;
            if (num != null) {
                A002.put("is_sim_number", num.intValue());
            }
            Boolean bool = this.A01;
            if (bool != null) {
                A002.put("is_sim_absent", bool.booleanValue());
            }
            Boolean bool2 = this.A00;
            if (bool2 != null) {
                A002.put("is_permission_granted", bool2.booleanValue());
            }
            Boolean bool3 = this.A02;
            if (bool3 != null) {
                A002.put("isUserChoosingToMigrateFromConsumerAppDirectly", bool3.booleanValue());
            }
        } catch (JSONException unused) {
        }
        return A002;
    }

    public AnonymousClass2d2(int i, String str) {
        super(i, str);
    }
}
