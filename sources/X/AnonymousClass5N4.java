package X;

import android.os.CancellationSignal;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

/* renamed from: X.5N4  reason: invalid class name */
public class AnonymousClass5N4 extends C19950wm {
    public final Socket A00;
    public final C105535Fa A01;
    public final String A02;
    public final String A03;

    public AnonymousClass5N4(C105535Fa r2, String str, String str2, Socket socket) {
        super("DonorNetworkingThread");
        this.A02 = str;
        this.A03 = str2;
        this.A00 = socket;
        this.A01 = r2;
    }

    public void run() {
        try {
            Log.i("fpm/WifiDirectScannerNetworkingThread/Attempting to connect to receiver");
            Socket socket = this.A00;
            socket.bind((SocketAddress) null);
            socket.connect(new InetSocketAddress(this.A03, 8988), 5000);
            Log.i("fpm/WifiDirectScannerNetworkingThread/Connected to receiver");
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            String str = this.A02;
            byte[] bArr = AnonymousClass6XZ.A00;
            AnonymousClass6XZ.A02((CancellationSignal) null, new AnonymousClass5D8(str.getBytes(C19430v1.A0B), (byte[]) null, 300), outputStream);
            this.A01.A03(inputStream, outputStream);
        } catch (IOException e) {
            Log.e("fpm/WifiDirectScannerNetworkingThread/error connecting to server socket", e);
            this.A01.A02(604);
            AnonymousClass14X.A02(this.A00);
            interrupt();
            Log.i("fpm/WifiDirectScannerNetworkingThread/socket closed and thread interrupted");
        }
    }
}
