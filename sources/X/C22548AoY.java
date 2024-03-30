package X;

import android.bluetooth.BluetoothServerSocket;

/* renamed from: X.AoY  reason: case insensitive filesystem */
public final class C22548AoY extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ AnonymousClass9OE this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22548AoY(AnonymousClass9OE r2) {
        super(2);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Throwable th = (Throwable) obj2;
        AnonymousClass00C.A0D(th, 1);
        AnonymousClass6YR.A0A("lam:LinkedDeviceManager", "Failed to start gatt", th);
        AnonymousClass9U8 r3 = this.this$0.A03;
        C22512Anu anu = C22512Anu.A00;
        BluetoothServerSocket bluetoothServerSocket = r3.A00;
        if (bluetoothServerSocket != null) {
            r3.A00 = null;
            AnonymousClass95J.A00(bluetoothServerSocket);
            anu.invoke(r3);
        }
        return AnonymousClass0AJ.A00;
    }
}
