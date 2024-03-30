package X;

import android.content.SharedPreferences;
import org.json.JSONObject;

/* renamed from: X.1NS  reason: invalid class name */
public final class AnonymousClass1NS {
    public final C19890wg A00;

    public AnonymousClass1NS(C19890wg r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public final JSONObject A00(String str) {
        SharedPreferences A002 = this.A00.A00("marketing_opt_out");
        AnonymousClass00C.A08(A002);
        String string = A002.getString(str, new JSONObject().toString());
        if (string == null) {
            string = new JSONObject().toString();
        }
        AnonymousClass00C.A0B(string);
        return new JSONObject(string);
    }
}
