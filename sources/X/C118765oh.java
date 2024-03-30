package X;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: X.5oh  reason: invalid class name and case insensitive filesystem */
public final class C118765oh {
    public final Messenger A00;
    public final C134506b9 A01;

    public C118765oh(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.A00 = new Messenger(iBinder);
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.A01 = new C134506b9(iBinder);
        } else {
            Log.w("MessengerIpcClient", C90464aC.A0c("Invalid interface descriptor: ", interfaceDescriptor));
            throw new RemoteException();
        }
    }
}
