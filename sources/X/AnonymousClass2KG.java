package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import org.json.JSONObject;

/* renamed from: X.2KG  reason: invalid class name */
public final class AnonymousClass2KG extends C196209Yd {
    public final C25791Hr A00;
    public final AnonymousClass3PX A01;

    public String A05() {
        return "open_webview";
    }

    public void A08(Activity activity, AnonymousClass3T1 r12, C206969uL r13, int i) {
        JSONObject optJSONObject;
        C36321k7.A16(activity, r12, r13, 0);
        AnonymousClass3PX r4 = this.A01;
        AnonymousClass11F r5 = r12.A1J.A00;
        r4.A01(r5, "link_to_webview", (String) null, 0, 4);
        UserJid A0L = r12.A0L();
        if (A0L != null) {
            this.A00.A01(A0L, r12, 0);
        }
        String str = r13.A01;
        String str2 = null;
        if (str == null || (optJSONObject = C36441kJ.A1C(str).optJSONObject("link")) == null) {
            Log.e("CheckoutFromLinkAction/execute: unsupported link type");
        } else if (optJSONObject.optBoolean("in_app_webview")) {
            Intent A1I = AnonymousClass190.A1I(activity, optJSONObject.getString("url"), optJSONObject.optString("success_url"), optJSONObject.optString("cancel_url"));
            A1I.putExtra("message_cta_type", "link_to_webview");
            if (r5 != null) {
                str2 = r5.getRawString();
            }
            A1I.putExtra("webview_receiver_jid", str2);
            activity.startActivity(A1I);
        } else {
            activity.startActivity(C36331k8.A04(optJSONObject.getString("url")));
        }
    }

    public void A09(Activity activity, AnonymousClass3T1 r3, C206969uL r4, Class cls) {
        AnonymousClass00C.A0D(activity, 0);
        C36321k7.A0x(r4, r3);
        A08(activity, r3, r4, 0);
    }

    public boolean A0B(C20810yC r2, AnonymousClass8SX r3) {
        AnonymousClass00C.A0D(r2, 1);
        return !r2.A0E(3051);
    }

    public String A06(Context context, C206969uL r5) {
        String str;
        if (r5 == null || (str = r5.A01) == null) {
            return null;
        }
        return C63893Lv.A00("title", C36441kJ.A1C(str), false);
    }

    public AnonymousClass2KG(C25791Hr r1, AnonymousClass3PX r2) {
        C36321k7.A0x(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }

    public int A03() {
        return R.drawable.ic_link_action;
    }
}
