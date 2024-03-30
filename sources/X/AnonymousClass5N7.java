package X;

import com.whatsapp.util.Log;
import java.net.ServerSocket;
import java.net.Socket;

/* renamed from: X.5N7  reason: invalid class name */
public class AnonymousClass5N7 extends C19950wm {
    public Socket A00;
    public final C105535Fa A01;
    public final String A02;
    public final C117525mP A03;
    public final ServerSocket A04;
    public final boolean A05;

    public AnonymousClass5N7(C105535Fa r2, C117525mP r3, String str, ServerSocket serverSocket, boolean z) {
        super("ReceiverNetworkingThread");
        this.A02 = str;
        this.A04 = serverSocket;
        this.A01 = r2;
        this.A03 = r3;
        this.A05 = z;
    }

    public void A00() {
        AnonymousClass14X.A02(this.A00);
        AnonymousClass14X.A02(this.A04);
        interrupt();
        Log.i("fpm/WifiDirectCreatorNetworkingThread/sockets closed and thread interrupted");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:27|28|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0081, code lost:
        throw new X.AnonymousClass5R7();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x007c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r6 = this;
            java.lang.String r0 = "fpm/WifiDirectCreatorNetworkingThread/Waiting for donor to connect"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SocketException -> 0x009e, IOException -> 0x008d }
            java.net.ServerSocket r0 = r6.A04     // Catch:{ SocketException -> 0x009e, IOException -> 0x008d }
            java.net.Socket r0 = r0.accept()     // Catch:{ SocketException -> 0x009e, IOException -> 0x008d }
            r6.A00 = r0     // Catch:{ SocketException -> 0x009e, IOException -> 0x008d }
            java.lang.String r0 = "fpm/WifiDirectCreatorNetworkingThread/Donor connected"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SocketException -> 0x009e, IOException -> 0x008d }
            X.5mP r0 = r6.A03     // Catch:{ SocketException -> 0x009e, IOException -> 0x008d }
            com.whatsapp.migration.transfer.service.WifiGroupCreatorP2pTransferService r3 = r0.A00     // Catch:{ SocketException -> 0x009e, IOException -> 0x008d }
            X.64J r1 = r3.A05     // Catch:{ SocketException -> 0x009e, IOException -> 0x008d }
            if (r1 == 0) goto L_0x002f
            X.5D7 r0 = r1.A00     // Catch:{ SocketException -> 0x009e, IOException -> 0x008d }
            if (r0 == 0) goto L_0x002f
            java.lang.String r0 = "fpm/WifiDirectCreatorConnectionHandler/stopping discoverable service"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SocketException -> 0x009e, IOException -> 0x008d }
            X.5D7 r0 = r1.A00     // Catch:{ SocketException -> 0x009e, IOException -> 0x008d }
            android.net.wifi.p2p.WifiP2pManager r2 = r0.A01     // Catch:{ SocketException -> 0x009e, IOException -> 0x008d }
            if (r2 == 0) goto L_0x002f
            android.net.wifi.p2p.WifiP2pManager$Channel r1 = r0.A00     // Catch:{ SocketException -> 0x009e, IOException -> 0x008d }
            r0 = 0
            r2.clearLocalServices(r1, r0)     // Catch:{ SocketException -> 0x009e, IOException -> 0x008d }
        L_0x002f:
            X.5Fa r0 = r3.A04     // Catch:{ SocketException -> 0x009e, IOException -> 0x008d }
            r0.A00()     // Catch:{ SocketException -> 0x009e, IOException -> 0x008d }
            java.net.Socket r0 = r6.A00     // Catch:{ SocketException -> 0x009e, IOException -> 0x008d }
            java.io.InputStream r5 = r0.getInputStream()     // Catch:{ SocketException -> 0x009e, IOException -> 0x008d }
            java.net.Socket r0 = r6.A00     // Catch:{ SocketException -> 0x009e, IOException -> 0x008d }
            java.io.OutputStream r4 = r0.getOutputStream()     // Catch:{ SocketException -> 0x009e, IOException -> 0x008d }
            boolean r0 = r6.A05     // Catch:{ SocketException -> 0x009e, IOException -> 0x008d }
            if (r0 != 0) goto L_0x0089
            r0 = 0
            X.6TD r2 = X.AnonymousClass6XZ.A01(r0, r5)     // Catch:{ SocketException -> 0x009e, IOException -> 0x008d }
            int r1 = r2.A01     // Catch:{ SocketException -> 0x009e, IOException -> 0x008d }
            r0 = 300(0x12c, float:4.2E-43)
            if (r1 != r0) goto L_0x0082
            java.lang.String r3 = r6.A02     // Catch:{ SocketException -> 0x009e, IOException -> 0x008d }
            long r1 = r2.A02     // Catch:{ SocketException -> 0x009e, IOException -> 0x008d }
            int r0 = (int) r1     // Catch:{ SocketException -> 0x007c }
            byte[] r2 = new byte[r0]     // Catch:{ SocketException -> 0x007c }
            int r1 = r5.read(r2)     // Catch:{ SocketException -> 0x007c }
            r0 = -1
            if (r1 == r0) goto L_0x0075
            java.lang.String r1 = X.C19430v1.A0B     // Catch:{ SocketException -> 0x007c }
            java.lang.String r0 = new java.lang.String     // Catch:{ SocketException -> 0x007c }
            r0.<init>(r2, r1)     // Catch:{ SocketException -> 0x007c }
            boolean r0 = r3.equals(r0)     // Catch:{ SocketException -> 0x009e, IOException -> 0x008d }
            if (r0 == 0) goto L_0x0082
            java.lang.String r0 = "fpm/WifiDirectCreatorNetworkingThread/auth token verified"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SocketException -> 0x009e, IOException -> 0x008d }
            X.5Fa r0 = r6.A01     // Catch:{ SocketException -> 0x009e, IOException -> 0x008d }
            r0.A03(r5, r4)     // Catch:{ SocketException -> 0x009e, IOException -> 0x008d }
            return
        L_0x0075:
            java.lang.String r0 = "No bytes to read"
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ SocketException -> 0x007c }
            throw r0     // Catch:{ SocketException -> 0x007c }
        L_0x007c:
            X.5R7 r0 = new X.5R7     // Catch:{ SocketException -> 0x009e, IOException -> 0x008d }
            r0.<init>()     // Catch:{ SocketException -> 0x009e, IOException -> 0x008d }
            throw r0     // Catch:{ SocketException -> 0x009e, IOException -> 0x008d }
        L_0x0082:
            X.5Fa r1 = r6.A01     // Catch:{ SocketException -> 0x009e, IOException -> 0x008d }
            r0 = 107(0x6b, float:1.5E-43)
            r1.A02(r0)     // Catch:{ SocketException -> 0x009e, IOException -> 0x008d }
        L_0x0089:
            r6.A00()     // Catch:{ SocketException -> 0x009e, IOException -> 0x008d }
            return
        L_0x008d:
            r1 = move-exception
            java.lang.String r0 = "fpm/WifiDirectCreatorNetworkingThread/server socket error occurred while waiting for connection"
            com.whatsapp.util.Log.e(r0, r1)
            X.5Fa r1 = r6.A01
            r0 = 601(0x259, float:8.42E-43)
            r1.A02(r0)
            r6.A00()
            return
        L_0x009e:
            java.lang.String r0 = "fpm/WifiDirectCreatorNetworkingThread/socket closed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5N7.run():void");
    }
}
