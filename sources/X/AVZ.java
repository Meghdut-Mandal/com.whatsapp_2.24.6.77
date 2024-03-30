package X;

import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import java.util.UUID;

public final class AVZ implements Runnable {
    public final AnonymousClass887 A00;
    public final /* synthetic */ AnonymousClass9OE A01;

    public AVZ(AnonymousClass887 r1, AnonymousClass9OE r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void run() {
        Object obj;
        IllegalStateException illegalStateException;
        AnonymousClass9OE r2 = this.A01;
        AnonymousClass9U8 r5 = r2.A03;
        if (r5.A00 != null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("WAITING for device over l2cap for ");
            AnonymousClass887 r7 = this.A00;
            UUID uuid = r7.A02;
            AnonymousClass6YR.A06("lam:LinkedDeviceManager", AnonymousClass000.A0o(uuid, A0u));
            try {
                BluetoothServerSocket bluetoothServerSocket = r5.A00;
                if (bluetoothServerSocket != null) {
                    obj = bluetoothServerSocket.accept();
                } else {
                    obj = null;
                }
            } catch (Throwable th) {
                try {
                    AnonymousClass6YR.A0A("lam:LinkedDeviceManager", "Failed to accept incoming connection", th);
                } catch (Throwable th2) {
                    r2.A05.execute(this);
                    throw th2;
                }
            }
            Throwable A002 = AnonymousClass0AK.A00(obj);
            if (A002 == null) {
                BluetoothSocket bluetoothSocket = (BluetoothSocket) obj;
                AnonymousClass6YR.A04("lam:LinkedDeviceManager/l2cap", AnonymousClass000.A0l(bluetoothSocket, "accepted socket: ", AnonymousClass000.A0u()));
                if (bluetoothSocket != null) {
                    C199069ee r52 = new C199069ee(bluetoothSocket, r7, AnonymousClass97B.A00(this, 20), AnonymousClass97B.A00(this, 21), new C1898895z(this, 4));
                    r2.A04.add(new C22083AgU(r52));
                    AnonymousClass6YR.A06("lam:LinkedDeviceManager", AnonymousClass000.A0l(uuid, "ACCEPTED device over l2cap for ", AnonymousClass000.A0u()));
                    r52.A01();
                    r2.A05.execute(this);
                    return;
                }
                illegalStateException = AnonymousClass001.A09("socket is null");
            } else {
                AnonymousClass6YR.A09("lam:LinkedDeviceManager/l2cap", "accept failed", A002);
                illegalStateException = AnonymousClass001.A09(A002.toString());
            }
            throw illegalStateException;
        }
    }
}
