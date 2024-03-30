package X;

import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: X.4rW  reason: invalid class name and case insensitive filesystem */
public final class C98494rW extends C125255za implements C157927eu {
    public static final C98494rW A00 = new C98494rW();

    public int hashCode() {
        return Arrays.hashCode(new boolean[]{false, false, false, false});
    }

    public boolean equals(Object obj) {
        if (obj instanceof C98494rW) {
            return true;
        }
        return false;
    }

    public JSONObject Bvk() {
        JSONObject A1B = C36441kJ.A1B();
        A1B.put("is_user_scoped", false);
        A1B.put("keep_data_between_sessions", false);
        A1B.put("userid_in_path", false);
        A1B.put("keep_data_on_account_removal", false);
        return A1B;
    }
}
