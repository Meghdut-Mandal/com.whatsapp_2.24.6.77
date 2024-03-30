package X;

import android.bluetooth.BluetoothSocket;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.A2z  reason: case insensitive filesystem */
public final class C21011A2z implements B2N {
    public final BluetoothSocket A00;

    public InputStream BCl() {
        InputStream inputStream = this.A00.getInputStream();
        AnonymousClass00C.A08(inputStream);
        return inputStream;
    }

    public OutputStream BEr() {
        OutputStream outputStream = this.A00.getOutputStream();
        AnonymousClass00C.A08(outputStream);
        return outputStream;
    }

    public C21011A2z(BluetoothSocket bluetoothSocket) {
        this.A00 = bluetoothSocket;
    }

    public Closeable BA3() {
        return this.A00;
    }
}
