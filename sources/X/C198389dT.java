package X;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothSocket;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.UUID;

/* renamed from: X.9dT  reason: invalid class name and case insensitive filesystem */
public final class C198389dT {
    public static final C198389dT A00 = new C198389dT();

    public final B2N A00(AnonymousClass88I r8, AnonymousClass84B r9) {
        AnonymousClass88C r0;
        String str;
        Integer num = r9.A0J;
        int intValue = num.intValue();
        if (intValue == 2) {
            AnonymousClass9Y3 r1 = r9.A01;
            if (!(r8 == null || (r0 = r8.A01) == null || (str = r0.A01) == null)) {
                Object systemService = r1.A00.getSystemService("bluetooth");
                AnonymousClass00C.A0E(systemService, "null cannot be cast to non-null type android.bluetooth.BluetoothManager");
                BluetoothAdapter adapter = ((BluetoothManager) systemService).getAdapter();
                if (adapter.isEnabled()) {
                    C200159gk r4 = AnonymousClass9AO.A01;
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Attempting to connect to remote device at ...");
                    int length = str.length();
                    int i = 6;
                    if (6 > length) {
                        i = length;
                    }
                    String substring = str.substring(length - i);
                    AnonymousClass00C.A08(substring);
                    r4.A01("sup:SocketConnectionProvider", AnonymousClass000.A0q(substring, A0u));
                    BluetoothSocket createRfcommSocketToServiceRecord = adapter.getRemoteDevice(str).createRfcommSocketToServiceRecord(UUID.fromString(AnonymousClass932.A01));
                    if (createRfcommSocketToServiceRecord != null) {
                        r4.A01("sup:SocketConnectionProvider", "Connecting to bluetooth socket...");
                        createRfcommSocketToServiceRecord.connect();
                        UUID uuid = r8.A02;
                        if (uuid != null) {
                            OutputStream outputStream = createRfcommSocketToServiceRecord.getOutputStream();
                            ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
                            C165587tf.A1P(wrap, uuid);
                            byte[] array = wrap.array();
                            AnonymousClass00C.A08(array);
                            outputStream.write(array);
                        }
                        return new C21011A2z(createRfcommSocketToServiceRecord);
                    }
                } else {
                    throw AnonymousClass001.A09("Bluetooth is not enabled.  Cannot attempt to establish RFCOMM socket connection");
                }
            }
            throw C90514aH.A0s("Unable to connect to BT socket over RFCOMM");
        } else if (intValue == 0) {
            Socket socket = (Socket) r9.A01.A0G.invoke();
            socket.setSoTimeout(SearchActionVerificationClientService.NOTIFICATION_ID);
            C200159gk r3 = AnonymousClass9AO.A01;
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("[MEDIA_STREAM_SERVICE]: host ");
            A0u2.append(r9.A02);
            A0u2.append(" port ");
            int i2 = r9.A00;
            r3.A01("sup:SocketConnectionProvider", C36381kD.A10(A0u2, i2));
            socket.connect(new InetSocketAddress(r9.A02, i2));
            return new A30(socket);
        } else {
            StringBuilder A0u3 = AnonymousClass000.A0u();
            A0u3.append("Protocol: ");
            A0u3.append(AnonymousClass95C.A00(num));
            throw C90464aC.A0U(" is unsupported!  Cannot create a socket for media stream connection", A0u3);
        }
    }
}
