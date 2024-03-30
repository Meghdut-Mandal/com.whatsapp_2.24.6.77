package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: X.9pZ  reason: invalid class name and case insensitive filesystem */
public final class C204169pZ implements ServiceConnection {
    public final /* synthetic */ C201499ji A00;

    public /* synthetic */ C204169pZ(C201499ji r1) {
        this.A00 = r1;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C201499ji r3 = this.A00;
        r3.A06.A02("ServiceConnectionImpl.onServiceConnected(%s)", AnonymousClass000.A1b(componentName));
        r3.A01().post(new AnonymousClass8FO(iBinder, this));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C201499ji r4 = this.A00;
        C199269f2 r3 = r4.A06;
        Object[] A0L = AnonymousClass001.A0L();
        A0L[0] = componentName;
        r3.A02("ServiceConnectionImpl.onServiceDisconnected(%s)", A0L);
        r4.A01().post(new AnonymousClass8FN(this, 0));
    }
}
