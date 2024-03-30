package X;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothServerSocket;

public final class AVc implements Runnable {
    public final /* synthetic */ AnonymousClass9U8 A00;
    public final /* synthetic */ C006302t A01;
    public final /* synthetic */ C009003v A02;

    public AVc(AnonymousClass9U8 r1, C006302t r2, C009003v r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void run() {
        Object obj;
        AnonymousClass9U8 r4 = this.A00;
        BluetoothAdapter adapter = r4.A01.getAdapter();
        if (adapter == null) {
            ((C22552Aod) this.A02).invoke(r4, AnonymousClass001.A09("bluetooth is not available"));
        } else if (r4.A00 != null) {
            ((C22552Aod) this.A02).invoke(r4, AnonymousClass001.A09("already started"));
        } else {
            try {
                obj = adapter.listenUsingL2capChannel();
            } catch (Throwable th) {
                obj = C90524aI.A0t(th);
            }
            C006302t r2 = this.A01;
            C009003v r1 = this.A02;
            Throwable A002 = AnonymousClass0AK.A00(obj);
            if (A002 == null) {
                r4.A00 = (BluetoothServerSocket) obj;
                r2.invoke(r4);
                return;
            }
            ((C22552Aod) r1).invoke(r4, A002);
        }
    }
}
