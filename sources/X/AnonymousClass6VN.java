package X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.net.TrafficStats;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.whatsapp.calling.MultiNetworkCallback;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6VN  reason: invalid class name */
public class AnonymousClass6VN {
    public ConnectivityManager.NetworkCallback A00;
    public Network A01;
    public DatagramSocket A02;
    public boolean A03 = false;
    public final ConnectivityManager A04;
    public final C116855lJ A05;
    public final C30531aM A06;
    public final ScheduledExecutorService A07;

    public AnonymousClass6VN(ConnectivityManager connectivityManager, C30531aM r4) {
        C116855lJ r1 = new C116855lJ(r4);
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.A04 = connectivityManager;
        this.A05 = r1;
        this.A07 = newSingleThreadScheduledExecutor;
        this.A06 = r4;
    }

    public static void A00(Network network, AnonymousClass6VN r6, boolean z) {
        DatagramSocket datagramSocket;
        String str;
        boolean z2 = false;
        C18740tg.A0D(AnonymousClass000.A1W(r6.A02), "alternative socket must not have created");
        if (r6.A02 != null) {
            Log.i("voip/weak-wifi/alt-sock: socket already created");
        } else {
            try {
                TrafficStats.setThreadStatsTag(15);
                r6.A01 = network;
                DatagramSocket datagramSocket2 = new DatagramSocket();
                r6.A02 = datagramSocket2;
                r6.A01.bindSocket(datagramSocket2);
                z2 = true;
            } catch (SocketException unused) {
                str = "voip/weak-wifi/create-sock: socket exception to create alternative socket.";
            } catch (IOException unused2) {
                str = "voip/weak-wifi/create-sock: io exception to bind socket to alternative network.";
            }
            datagramSocket = r6.A02;
            if (datagramSocket != null || !z2) {
                r6.A02(true);
            } else {
                String str2 = null;
                try {
                    datagramSocket.connect(network.getByName("1.1.1.1"), 53);
                    InetAddress localAddress = datagramSocket.getLocalAddress();
                    if (!localAddress.isAnyLocalAddress()) {
                        str2 = localAddress.getHostAddress();
                    }
                    datagramSocket.disconnect();
                } catch (UnknownHostException unused3) {
                    Log.e("voip/weak-wifi/create-sock: unknown host exception to retrieve local ip.");
                }
                int detachFd = ParcelFileDescriptor.fromDatagramSocket(r6.A02).detachFd();
                int localPort = r6.A02.getLocalPort();
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("voip/weak-wifi/create-sock: ip=");
                A0u.append(str2);
                A0u.append("; port=");
                A0u.append(localPort);
                A0u.append("; fd=");
                A0u.append(detachFd);
                C36321k7.A1X("; test_network_cond = ", A0u, z);
                if (z) {
                    Voip.startTestNetworkConditionWithAlternativeSocket(detachFd, str2, localPort);
                    return;
                } else {
                    Voip.switchNetworkWithAlternativeSocket(detachFd, str2, localPort);
                    return;
                }
            }
        }
        Voip.notifyFailureToCreateAlternativeSocket(z);
        Log.e(str);
        datagramSocket = r6.A02;
        if (datagramSocket != null) {
        }
        r6.A02(true);
        Voip.notifyFailureToCreateAlternativeSocket(z);
    }

    private void A02(boolean z) {
        if (this.A02 != null) {
            Log.i("voip/weak-wifi/close-sock");
            this.A02.close();
            this.A02 = null;
        }
        if (z) {
            ConnectivityManager.NetworkCallback networkCallback = this.A00;
            if (networkCallback != null) {
                try {
                    this.A04.unregisterNetworkCallback(networkCallback);
                    Log.i("voip/weak-wifi/unregister-alt-network-callback: succeeded.");
                } catch (IllegalArgumentException unused) {
                    Log.i("voip/weak-wifi/unregister-alt-network-callback: failed.");
                }
                this.A00 = null;
            }
            this.A01 = null;
        }
    }

    public void A03() {
        ScheduledExecutorService scheduledExecutorService = this.A07;
        scheduledExecutorService.execute(new C1497172m(this, 40));
        scheduledExecutorService.shutdown();
    }

    public void A04() {
        this.A07.execute(new C1497172m(this, 41));
    }

    public /* synthetic */ void A05() {
        C18740tg.A0D(this.A03, "provider must not have already shutdown");
        if (!this.A03) {
            Log.e("voip/weak-wifi/shutdown: provider is already shutdown");
            return;
        }
        A02(true);
        Voip.nativeUnregisterMultiNetworkCallback();
        this.A03 = false;
    }

    public /* synthetic */ void A06() {
        C18740tg.A0D(!this.A03, "provider must not have already started");
        if (this.A03) {
            Log.e("voip/weak-wifi/startup: provider is already started");
            return;
        }
        Voip.nativeRegisterMultiNetworkCallback(new MultiNetworkCallback(this));
        this.A03 = true;
    }

    public /* synthetic */ void A07(boolean z) {
        if (!this.A03) {
            Log.i("voip/weak-wifi/closeAlternativeSocket: provider is not running");
        } else {
            A02(z);
        }
    }

    public /* synthetic */ void A08(boolean z, boolean z2) {
        String str;
        String str2;
        String str3;
        if (!this.A03) {
            Log.i("voip/weak-wifi/createAlternativeSocket: provider is not running");
        } else if (this.A01 != null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("voip/weak-wifi/re-use-alt-network: ");
            if (z) {
                str2 = "cellular";
            } else {
                str2 = "wifi";
            }
            A0u.append(str2);
            A0u.append("; test_network_cond=");
            if (z2) {
                str3 = "true";
            } else {
                str3 = "false";
            }
            C36321k7.A1a(A0u, str3);
            if (this.A02 != null) {
                Log.i("voip/weak-wifi/create-alt-sock: previously created sock was not closed");
                Voip.notifyFailureToCreateAlternativeSocket(z2);
                return;
            }
            A00(this.A01, this, z2);
        } else {
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            if (z) {
                builder.addTransportType(0);
                str = "voip/weak-wifi/alt-network: cellular";
            } else {
                builder.addTransportType(1);
                str = "voip/weak-wifi/alt-network: wifi";
            }
            Log.i(str);
            builder.addCapability(12);
            this.A00 = new C91434c0(this, this.A07.schedule(new AnonymousClass75B(this, 14, z2), 5000, TimeUnit.MILLISECONDS), z2);
            int i = Build.VERSION.SDK_INT;
            ConnectivityManager connectivityManager = this.A04;
            NetworkRequest build = builder.build();
            ConnectivityManager.NetworkCallback networkCallback = this.A00;
            if (i >= 26) {
                connectivityManager.requestNetwork(build, networkCallback, 5000);
            } else {
                connectivityManager.requestNetwork(build, networkCallback);
            }
        }
    }
}
