package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.54C  reason: invalid class name */
public final class AnonymousClass54C extends C196209Yd {
    public String A05() {
        return "wa_payment_learn_more";
    }

    public String A06(Context context, C206969uL r3) {
        AnonymousClass00C.A0D(context, 0);
        return C36361kB.A0m(context, R.string.f12nameremoved);
    }

    public void A09(Activity activity, AnonymousClass3T1 r6, C206969uL r7, Class cls) {
        boolean A1a = C36331k8.A1a(activity, r7);
        AnonymousClass00C.A0D(cls, 3);
        Intent A0H = C36441kJ.A0H(activity, cls);
        C18740tg.A06(r7);
        String str = r7.A01;
        if (str == null || str.length() == 0) {
            str = "{}";
        }
        String optString = C36441kJ.A1C(str).optString("url");
        if (optString == null || optString.length() == 0) {
            Log.e("[NFM]: ConversationRow -- NFM url is unavailable to redirect.");
            return;
        }
        A0H.putExtra("webview_url", optString);
        A0H.putExtra("webview_hide_url", A1a);
        A0H.putExtra("webview_javascript_enabled", A1a);
        A0H.putExtra("webview_avoid_external", A1a);
        activity.startActivity(A0H);
    }
}
