package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.AlarmBroadcastReceiver;

/* renamed from: X.6Ez  reason: invalid class name and case insensitive filesystem */
public abstract class C129096Ez {
    public final Context A00;

    public PendingIntent A03(String str, int i) {
        Context context = this.A00;
        return C65743Th.A01(context, 0, new Intent(str, (Uri) null, context, AlarmBroadcastReceiver.class), i);
    }

    public C129096Ez(Context context) {
        this.A00 = context;
    }
}
