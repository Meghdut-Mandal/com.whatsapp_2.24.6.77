package X;

import android.bluetooth.BluetoothServerSocket;
import java.util.ArrayDeque;
import java.util.Iterator;

/* renamed from: X.AgS  reason: case insensitive filesystem */
public final class C22081AgS extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass9OE $linkedDeviceManager;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22081AgS(AnonymousClass9OE r2) {
        super(0);
        this.$linkedDeviceManager = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass9OE r4 = this.$linkedDeviceManager;
        ArrayDeque arrayDeque = r4.A04;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            try {
                ((AnonymousClass00S) it.next()).invoke();
            } catch (Throwable th) {
                new AnonymousClass03N(th);
            }
        }
        arrayDeque.clear();
        AnonymousClass9U8 r3 = r4.A03;
        C22514Anw anw = C22514Anw.A00;
        BluetoothServerSocket bluetoothServerSocket = r3.A00;
        if (bluetoothServerSocket != null) {
            r3.A00 = null;
            AnonymousClass95J.A00(bluetoothServerSocket);
            anw.invoke(r3);
        }
        r4.A02.A00(C22515Anx.A00);
        return AnonymousClass0AJ.A00;
    }
}
