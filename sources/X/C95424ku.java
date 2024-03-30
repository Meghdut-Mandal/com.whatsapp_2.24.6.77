package X;

import android.content.AsyncQueryHandler;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;

/* renamed from: X.4ku  reason: invalid class name and case insensitive filesystem */
public final class C95424ku extends C001600r {
    public static final Uri A03 = new Uri.Builder().scheme("content").authority("androidx.car.app.connection").build();
    public final AsyncQueryHandler A00;
    public final Context A01;
    public final C90824aw A02 = new C90824aw(this);

    public void A05() {
        IntentFilter intentFilter = new IntentFilter("androidx.car.app.connection.action.CAR_CONNECTION_UPDATED");
        int i = Build.VERSION.SDK_INT;
        Context context = this.A01;
        C90824aw r0 = this.A02;
        if (i >= 33) {
            C108965Vr.A00(r0, context, intentFilter);
        } else {
            context.registerReceiver(r0, intentFilter);
        }
        this.A00.startQuery(42, (Object) null, A03, new String[]{"CarConnectionState"}, (String) null, (String[]) null, (String) null);
    }

    public void A06() {
        this.A01.unregisterReceiver(this.A02);
        this.A00.cancelOperation(42);
    }

    public C95424ku(Context context) {
        this.A01 = context;
        this.A00 = new C90784ao(context.getContentResolver(), this);
    }
}
