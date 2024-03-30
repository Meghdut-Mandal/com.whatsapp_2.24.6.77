package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.R;
import org.json.JSONObject;

/* renamed from: X.54B  reason: invalid class name */
public final class AnonymousClass54B extends C196209Yd {
    public String A05() {
        return "payments_care_csat";
    }

    public String A06(Context context, C206969uL r3) {
        AnonymousClass00C.A0D(context, 0);
        return C36361kB.A0m(context, R.string.f12nameremoved);
    }

    public void A09(Activity activity, AnonymousClass3T1 r6, C206969uL r7, Class cls) {
        C36321k7.A0w(activity, r7);
        AnonymousClass00C.A0D(cls, 3);
        C18740tg.A06(r7);
        String str = r7.A01;
        if (str == null || str.length() == 0) {
            str = "{}";
        }
        JSONObject A1C = C36441kJ.A1C(str);
        Intent A0H = C36441kJ.A0H(activity, cls);
        A0H.putExtra("survey_id", A1C.optString("survey_id"));
        A0H.putExtra("entry_point", A1C.optString("entry_point"));
        A0H.putExtra("session_id", A1C.optString("session_id"));
        activity.startActivity(A0H);
    }
}
