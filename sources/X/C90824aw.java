package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.4aw  reason: invalid class name and case insensitive filesystem */
public class C90824aw extends BroadcastReceiver {
    public final /* synthetic */ C95424ku A00;

    public C90824aw(C95424ku r1) {
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        this.A00.A00.startQuery(42, (Object) null, C95424ku.A03, new String[]{"CarConnectionState"}, (String) null, (String[]) null, (String) null);
    }
}
