package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.3CG  reason: invalid class name */
public class AnonymousClass3CG {
    public final Context A00;

    public static void A01(Context context, Context context2, Intent intent, View view, AnonymousClass3T1 r6) {
        AnonymousClass3U9.A09(context2, intent, view, new AnonymousClass3CG(context), AnonymousClass3RL.A01(r6));
    }

    public String A02(int i) {
        return C36401kF.A0o(this.A00, i);
    }

    public AnonymousClass3CG(Context context) {
        this.A00 = context.getApplicationContext();
    }

    public static Bundle A00(Activity activity, View view, AnonymousClass3CG r3) {
        return AnonymousClass3U9.A05(activity, view, r3.A02(R.string.f12nameremoved));
    }
}
