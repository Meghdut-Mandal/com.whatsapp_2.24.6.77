package X;

import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.HandlerThread;
import com.whatsapp.util.Log;

/* renamed from: X.6ON  reason: invalid class name */
public abstract class AnonymousClass6ON {
    public static final IntentFilter A07 = new C90994bH();
    public WifiP2pManager.Channel A00;
    public WifiP2pManager A01;
    public C160457l2 A02;
    public String A03;
    public C90854az A04;
    public final HandlerThread A05;
    public final C19630wG A06;

    public void A00() {
        WifiP2pManager.Channel channel;
        Log.i("fpm/WifiDirectManager/shutting down WiFi Direct");
        this.A02 = null;
        WifiP2pManager wifiP2pManager = this.A01;
        if (!(wifiP2pManager == null || (channel = this.A00) == null)) {
            wifiP2pManager.clearServiceRequests(channel, (WifiP2pManager.ActionListener) null);
            wifiP2pManager.stopPeerDiscovery(channel, (WifiP2pManager.ActionListener) null);
            wifiP2pManager.clearLocalServices(channel, (WifiP2pManager.ActionListener) null);
            wifiP2pManager.removeGroup(channel, (WifiP2pManager.ActionListener) null);
            this.A01 = null;
        }
        WifiP2pManager.Channel channel2 = this.A00;
        if (channel2 != null) {
            if (C19550w8.A04()) {
                channel2.close();
            }
            this.A00 = null;
        }
        C90854az r1 = this.A04;
        if (r1 != null) {
            r1.A00 = null;
            try {
                this.A06.A00.unregisterReceiver(r1);
            } catch (IllegalArgumentException e) {
                Log.e("fpm/WifiDirectManager/Receiver not registered", e);
            }
            this.A04 = null;
        }
        HandlerThread handlerThread = this.A05;
        handlerThread.quit();
        handlerThread.interrupt();
    }

    public void A01(C160457l2 r5, String str) {
        String str2;
        this.A02 = r5;
        if (this.A01 == null || this.A00 == null) {
            Context context = this.A06.A00;
            WifiP2pManager wifiP2pManager = (WifiP2pManager) AnonymousClass00F.A05(context, WifiP2pManager.class);
            this.A01 = wifiP2pManager;
            if (wifiP2pManager == null) {
                str2 = "fpm/WifiDirectManager/Unable to get WifiP2pManager";
            } else {
                this.A04 = new C90854az(r5);
                WifiP2pManager.Channel initialize = this.A01.initialize(context, this.A05.getLooper(), new C133706Zr(this));
                this.A00 = initialize;
                if (initialize == null) {
                    str2 = "fpm/WifiDirectManager/Unable to initialize channel";
                } else {
                    WifiP2pManager wifiP2pManager2 = this.A01;
                    wifiP2pManager2.clearServiceRequests(initialize, (WifiP2pManager.ActionListener) null);
                    wifiP2pManager2.stopPeerDiscovery(initialize, (WifiP2pManager.ActionListener) null);
                    wifiP2pManager2.clearLocalServices(initialize, (WifiP2pManager.ActionListener) null);
                    wifiP2pManager2.removeGroup(initialize, (WifiP2pManager.ActionListener) null);
                    C26981Mg.A01(this.A04, context, A07, true);
                    this.A03 = AnonymousClass000.A0q("_chattransfer._whatsapp.com", AnonymousClass000.A0v(str));
                    Log.i("fpm/WifiDirectManager/initialize/success");
                    return;
                }
            }
            Log.i(str2);
            A00();
            return;
        }
        Log.w("fpm/WifiDirectManager/Already initialized, do not need to initialize twice");
    }

    public AnonymousClass6ON(C19630wG r3) {
        this.A06 = r3;
        HandlerThread handlerThread = new HandlerThread("WifiDirectCallbackHandler");
        this.A05 = handlerThread;
        handlerThread.start();
    }
}
