package X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import com.whatsapp.util.Log;

/* renamed from: X.1Mi  reason: invalid class name and case insensitive filesystem */
public class C27001Mi implements C26991Mh {
    public C91454c2 A00;
    public Handler A01;
    public final AnonymousClass1MP A02;
    public final C20720y3 A03;
    public final AnonymousClass19O A04;
    public final C21060yb A05;

    public static boolean A00(Network network, C27001Mi r2) {
        NetworkCapabilities networkCapabilities;
        ConnectivityManager A0E = r2.A05.A0E();
        if (A0E == null || network == null || (networkCapabilities = A0E.getNetworkCapabilities(network)) == null || !networkCapabilities.hasTransport(1) || !networkCapabilities.hasCapability(17)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r6 != false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void A01() {
        /*
            r8 = this;
            X.4c2 r0 = r8.A00
            X.C18740tg.A06(r0)
            android.net.Network r0 = r0.A00
            if (r0 == 0) goto L_0x0028
            r7 = 1
            long r2 = r0.getNetworkHandle()
        L_0x000e:
            boolean r6 = A00(r0, r8)
            r5 = 1
            r4 = 0
            X.1MP r0 = r8.A02
            r0.A00()
            X.0y3 r1 = r8.A03
            if (r7 == 0) goto L_0x0020
            r0 = 1
            if (r6 == 0) goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            r1.A0D(r2, r0, r4)
            r1.A0H(r6, r5)
            return
        L_0x0028:
            r7 = 0
            r2 = -1
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27001Mi.A01():void");
    }

    public long BAe() {
        Network activeNetwork;
        ConnectivityManager A0E = this.A05.A0E();
        if (A0E == null || (activeNetwork = A0E.getActiveNetwork()) == null) {
            return -1;
        }
        return activeNetwork.getNetworkHandle();
    }

    public void BoM() {
        Handler handler = this.A01;
        C18740tg.A06(handler);
        handler.post(new C35711j8(this, 30));
    }

    public void BuX(Handler handler) {
        boolean z = false;
        if (this.A00 == null) {
            z = true;
        }
        C18740tg.A0C(z);
        this.A01 = handler;
        this.A00 = new C91454c2(this);
        ConnectivityManager A0E = this.A05.A0E();
        if (A0E != null) {
            try {
                A0E.registerDefaultNetworkCallback(this.A00, handler);
            } catch (SecurityException unused) {
            }
        } else {
            Log.e("xmpp/handler/network/startNetworkCallbacks cm null");
        }
    }

    public void Bv7() {
        boolean z = false;
        if (this.A00 != null) {
            z = true;
        }
        C18740tg.A0C(z);
        ConnectivityManager A0E = this.A05.A0E();
        if (A0E != null) {
            A0E.unregisterNetworkCallback(this.A00);
        }
        this.A00 = null;
        this.A01 = null;
    }

    public boolean isConnected() {
        C91454c2 r0 = this.A00;
        if (r0 == null || r0.A00 == null) {
            return false;
        }
        return true;
    }

    public C27001Mi(C21060yb r1, AnonymousClass1MP r2, C20720y3 r3, AnonymousClass19O r4) {
        this.A05 = r1;
        this.A03 = r3;
        this.A02 = r2;
        this.A04 = r4;
    }
}
