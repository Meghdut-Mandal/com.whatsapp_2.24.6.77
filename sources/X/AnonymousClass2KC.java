package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.2KC  reason: invalid class name */
public final class AnonymousClass2KC extends C196209Yd {
    public String A05() {
        return "wa_payment_transaction_details";
    }

    public String A06(Context context, C206969uL r3) {
        AnonymousClass00C.A0D(context, 0);
        return C36361kB.A0m(context, R.string.f12nameremoved);
    }

    public void A09(Activity activity, AnonymousClass3T1 r6, C206969uL r7, Class cls) {
        C36321k7.A0w(activity, r7);
        AnonymousClass00C.A0D(cls, 3);
        Intent A0H = C36441kJ.A0H(activity, cls);
        C18740tg.A06(r7);
        String str = r7.A01;
        if (str == null || str.length() == 0) {
            str = "{}";
        }
        String optString = C36441kJ.A1C(str).optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        if (optString == null || optString.length() == 0) {
            Log.e("[NFM]: WaViewTransactionAction - ConversationRow -- transaction-id is unavailable");
            return;
        }
        A0H.putExtra("referral_screen", "chat");
        A0H.putExtra("extra_transaction_id", optString);
        activity.startActivity(A0H);
    }
}
