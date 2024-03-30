package X;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0Yb  reason: invalid class name and case insensitive filesystem */
public final class C07520Yb {
    public static HandlerThread A05;
    public static C07520Yb A06;
    public static final Object A07 = new Object();
    public final Context A00;
    public final C07510Ya A01;
    public final HashMap A02;
    public final AnonymousClass0ZY A03;
    public volatile Handler A04;

    public C07520Yb() {
    }

    public static C07520Yb A00(Context context) {
        synchronized (A07) {
            if (A06 == null) {
                A06 = new C07520Yb(context.getApplicationContext(), context.getMainLooper());
            }
        }
        return A06;
    }

    public final void A01(ServiceConnection serviceConnection, AnonymousClass0YA r7) {
        IllegalStateException illegalStateException;
        HashMap hashMap = this.A02;
        synchronized (hashMap) {
            AnonymousClass0ZV r0 = (AnonymousClass0ZV) hashMap.get(r7);
            if (r0 != null) {
                Map map = r0.A05;
                if (map.containsKey(serviceConnection)) {
                    map.remove(serviceConnection);
                    if (map.isEmpty()) {
                        this.A04.sendMessageDelayed(this.A04.obtainMessage(0, r7), 5000);
                    }
                } else {
                    illegalStateException = AnonymousClass001.A09(AnonymousClass000.A0p("Trying to unbind a GmsServiceConnection  that was not bound before.  config=", r7.toString(), AnonymousClass000.A0u()));
                }
            } else {
                illegalStateException = AnonymousClass001.A09(AnonymousClass000.A0p("Nonexistent connection status for service config: ", r7.toString(), AnonymousClass000.A0u()));
            }
            throw illegalStateException;
        }
    }

    public final boolean A02(ServiceConnection serviceConnection, AnonymousClass0YA r6, String str) {
        boolean z;
        HashMap hashMap = this.A02;
        synchronized (hashMap) {
            AnonymousClass0ZV r2 = (AnonymousClass0ZV) hashMap.get(r6);
            if (r2 == null) {
                r2 = new AnonymousClass0ZV(r6, this);
                r2.A05.put(serviceConnection, serviceConnection);
                r2.A00(str);
                hashMap.put(r6, r2);
            } else {
                this.A04.removeMessages(0, r6);
                Map map = r2.A05;
                if (!map.containsKey(serviceConnection)) {
                    map.put(serviceConnection, serviceConnection);
                    int i = r2.A00;
                    if (i == 1) {
                        serviceConnection.onServiceConnected(r2.A01, r2.A02);
                    } else if (i == 2) {
                        r2.A00(str);
                    }
                } else {
                    throw AnonymousClass001.A09(AnonymousClass000.A0p("Trying to bind a GmsServiceConnection that was already connected before.  config=", r6.toString(), AnonymousClass000.A0u()));
                }
            }
            z = r2.A03;
        }
        return z;
    }

    public C07520Yb(Context context, Looper looper) {
        this.A02 = AnonymousClass001.A0J();
        AnonymousClass0ZY r1 = new AnonymousClass0ZY(this);
        this.A03 = r1;
        this.A00 = context.getApplicationContext();
        this.A04 = new AnonymousClass0E8(looper, r1);
        this.A01 = C07510Ya.A00();
    }
}
