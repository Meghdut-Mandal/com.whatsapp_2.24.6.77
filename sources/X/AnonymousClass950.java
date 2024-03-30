package X;

import android.bluetooth.BluetoothSocket;
import com.facebook.msys.mci.DefaultCrypto;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

/* renamed from: X.950  reason: invalid class name */
public abstract class AnonymousClass950 {
    public static final C197739cI A00(BluetoothSocket bluetoothSocket) {
        Integer num;
        int connectionType = bluetoothSocket.getConnectionType();
        if (connectionType == 1) {
            num = C023109s.A01;
        } else if (connectionType == 3) {
            num = C023109s.A00;
        } else {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Error occurred attempting to map bluetooth socket connection type to transport type.Connection type ");
            A0u.append(bluetoothSocket.getConnectionType());
            throw C90464aC.A0M(" is unsupported!  Currently only support values are [1 : TYPE_RFCOMM ,and 2: TYPE_L2CAP]", A0u);
        }
        return new C197739cI(new BufferedInputStream(bluetoothSocket.getInputStream(), DefaultCrypto.BUFFER_SIZE), new BufferedOutputStream(bluetoothSocket.getOutputStream(), DefaultCrypto.BUFFER_SIZE), num);
    }
}
