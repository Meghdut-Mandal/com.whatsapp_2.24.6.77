package X;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.9PQ  reason: invalid class name */
public final class AnonymousClass9PQ {
    public final Map A00 = AnonymousClass001.A0J();

    public final void A00(IBinder iBinder) {
        Map map = this.A00;
        synchronized (map) {
            if (iBinder != null) {
                iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
            }
            new C170708Em();
            Iterator A0y = AnonymousClass000.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                A11.getValue();
                try {
                    throw AnonymousClass001.A0A("zzr");
                } catch (RemoteException unused) {
                    String valueOf = String.valueOf(A11.getKey());
                    String valueOf2 = String.valueOf((Object) null);
                    StringBuilder A0i = C90464aC.A0i(valueOf2, C90474aD.A05(valueOf) + 32);
                    A0i.append("onPostInitHandler: Didn't add: ");
                    A0i.append(valueOf);
                    Log.w("WearableClient", AnonymousClass000.A0p("/", valueOf2, A0i));
                }
            }
        }
    }
}
