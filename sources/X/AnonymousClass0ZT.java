package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.IGmsServiceBroker;

/* renamed from: X.0ZT  reason: invalid class name */
public final class AnonymousClass0ZT implements ServiceConnection {
    public final int A00;
    public final /* synthetic */ C07560Yg A01;

    public AnonymousClass0ZT(C07560Yg r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IGmsServiceBroker r1;
        int i;
        int i2;
        C07560Yg r5 = this.A01;
        if (iBinder == null) {
            synchronized (r5.A0J) {
                i = r5.A02;
            }
            if (i == 3) {
                r5.A0C = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            Handler handler = r5.A0G;
            handler.sendMessage(handler.obtainMessage(i2, r5.A0B.get(), 16));
            return;
        }
        synchronized (r5.A0K) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IGmsServiceBroker)) {
                r1 = new C10410eC(iBinder);
            } else {
                r1 = (IGmsServiceBroker) queryLocalInterface;
            }
            r5.A09 = r1;
        }
        int i3 = this.A00;
        Handler handler2 = r5.A0G;
        handler2.sendMessage(handler2.obtainMessage(7, i3, -1, new AnonymousClass0LE(r5, 0)));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C07560Yg r2 = this.A01;
        synchronized (r2.A0K) {
            r2.A09 = null;
        }
        Handler handler = r2.A0G;
        handler.sendMessage(handler.obtainMessage(6, this.A00, 1));
    }
}
