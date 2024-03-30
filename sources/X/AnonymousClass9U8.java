package X;

import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothServerSocket;
import java.util.concurrent.Executor;

/* renamed from: X.9U8  reason: invalid class name */
public final class AnonymousClass9U8 {
    public BluetoothServerSocket A00;
    public final BluetoothManager A01;
    public final Executor A02;

    public final Integer A00() {
        BluetoothServerSocket bluetoothServerSocket = this.A00;
        if (bluetoothServerSocket != null) {
            return Integer.valueOf(bluetoothServerSocket.getPsm());
        }
        return null;
    }

    public AnonymousClass9U8(BluetoothManager bluetoothManager, Executor executor) {
        this.A01 = bluetoothManager;
        this.A02 = executor;
    }
}
