package X;

import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3Em  reason: invalid class name and case insensitive filesystem */
public final class C62033Em {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public String A05;

    public final JSONObject A00() {
        JSONObject A1B = C36441kJ.A1B();
        try {
            Integer num = this.A00;
            if (num != null) {
                A1B.put("click_link", num.intValue());
            }
            Integer num2 = this.A01;
            if (num2 != null) {
                A1B.put("permission_granted", num2.intValue());
            }
            Integer num3 = this.A02;
            if (num3 != null) {
                A1B.put("suggestion_accepted", num3.intValue());
            }
            Integer num4 = this.A04;
            if (num4 != null) {
                A1B.put("num_suggestions", num4.intValue());
            }
            Integer num5 = this.A03;
            if (num5 != null) {
                A1B.put("sim_number_invalid", num5.intValue());
            }
            String str = this.A05;
            if (str != null) {
                A1B.put("backup_token_source", str);
            }
            return A1B;
        } catch (JSONException e) {
            Log.e("ExistClientMetrics/toJSON exception: ", e);
            return null;
        }
    }
}
