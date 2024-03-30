package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/* renamed from: X.5D3  reason: invalid class name */
public class AnonymousClass5D3 extends AnonymousClass5N2 {
    public final AnonymousClass6IS A00;

    public AnonymousClass5D3(C159567jZ r1, AnonymousClass6IS r2) {
        super(r1);
        this.A00 = r2;
    }

    public void run() {
        Socket accept;
        super.run();
        ServerSocket serverSocket = null;
        try {
            ServerSocket serverSocket2 = new ServerSocket(8988);
            serverSocket = serverSocket2;
            Log.i("fpm/GetIpThread/Waiting for client socket accept...");
            accept = serverSocket2.accept();
            Log.i("fpm/GetIpThread/Client connected, obtaining IP address");
            String hostAddress = accept.getInetAddress().getHostAddress();
            if (hostAddress != null) {
                this.A00.BiD(hostAddress);
            } else {
                Log.e("fpm/GetIpThread/Unable to get host address");
                this.A00.BWY();
            }
            accept.close();
        } catch (IOException e) {
            try {
                Log.e("fpm/GetIpThread/Error connecting with client or server socket closed", e);
                this.A00.BWY();
            } catch (Throwable th) {
                AnonymousClass14X.A02(serverSocket);
                interrupt();
                throw th;
            }
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        AnonymousClass14X.A02(serverSocket);
        interrupt();
        return;
        throw th;
    }
}
