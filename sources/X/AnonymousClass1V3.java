package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.1V3  reason: invalid class name */
public class AnonymousClass1V3 extends BroadcastReceiver {
    public final /* synthetic */ AnonymousClass1V1 A00;

    public AnonymousClass1V3(AnonymousClass1V1 r1) {
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            for (AnonymousClass1V6 A04 : this.A00.A02) {
                A04.A04();
            }
        }
    }
}
