package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.2LO  reason: invalid class name */
public class AnonymousClass2LO extends AnonymousClass1MX {
    public final /* synthetic */ AnonymousClass1MN A00;

    public AnonymousClass2LO(AnonymousClass1MN r1) {
        this.A00 = r1;
    }

    public void A01(Context context, Intent intent) {
        if (!"com.whatsapp.alarm.CLIENT_PING_PERIODIC".equals(intent.getAction())) {
            C36321k7.A1L(intent, "ClientPingManager/periodic/receiver; unexpected intent: ", AnonymousClass000.A0u());
            return;
        }
        Log.i("ClientPingManager/periodic/receiver");
        AnonymousClass1MN.A04(this.A00);
    }
}
