package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.R;

/* renamed from: X.54D  reason: invalid class name */
public final class AnonymousClass54D extends C196209Yd {
    public String A05() {
        return "wa_payment_fbpin_reset";
    }

    public String A06(Context context, C206969uL r3) {
        AnonymousClass00C.A0D(context, 0);
        return C36361kB.A0m(context, R.string.f12nameremoved);
    }

    public void A09(Activity activity, AnonymousClass3T1 r5, C206969uL r6, Class cls) {
        C36321k7.A0w(activity, r6);
        AnonymousClass00C.A0D(cls, 3);
        Intent A0H = C36441kJ.A0H(activity, cls);
        C18740tg.A06(r6);
        A0H.putExtra("screen_name", "brpay_p_pin_change_verify");
        activity.startActivity(A0H);
    }
}
