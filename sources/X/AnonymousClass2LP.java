package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.2LP  reason: invalid class name */
public class AnonymousClass2LP extends AnonymousClass1MX {
    public final /* synthetic */ AnonymousClass1MN A00;

    public AnonymousClass2LP(AnonymousClass1MN r1) {
        this.A00 = r1;
    }

    public void A01(Context context, Intent intent) {
        if (!"com.whatsapp.alarm.CLIENT_PING_TIMEOUT".equals(intent.getAction())) {
            C36321k7.A1L(intent, "ClientPingManager/timeout/receiver; unexpected intent: ", AnonymousClass000.A0u());
            return;
        }
        Log.i("ClientPingManager/timeout/receiver");
        AnonymousClass1MN.A03(this.A00);
    }
}
