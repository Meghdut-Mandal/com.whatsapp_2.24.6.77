package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.1kd  reason: invalid class name and case insensitive filesystem */
public class C36611kd extends BroadcastReceiver {
    public final AnonymousClass005 A00;

    public void onReceive(Context context, Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("noPopup", true);
        boolean A1T = C36421kH.A1T(intent, "isAndroidWearRefresh");
        ((C28361Si) this.A00.get()).A0G(AnonymousClass3UJ.A02(intent), booleanExtra, A1T);
    }

    public C36611kd(AnonymousClass005 r1) {
        this.A00 = r1;
    }
}
