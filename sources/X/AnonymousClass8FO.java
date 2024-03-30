package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;

/* renamed from: X.8FO  reason: invalid class name */
public final class AnonymousClass8FO extends AX1 {
    public final /* synthetic */ IBinder A00;
    public final /* synthetic */ C204169pZ A01;

    public AnonymousClass8FO(IBinder iBinder, C204169pZ r2) {
        this.A01 = r2;
        this.A00 = iBinder;
    }

    public final void b() {
        C201499ji r5 = this.A01.A00;
        r5.A01 = (IInterface) r5.A07.a(this.A00);
        C199269f2 r4 = r5.A06;
        r4.A02("linkToDeath", new Object[0]);
        try {
            r5.A01.asBinder().linkToDeath(r5.A05, 0);
        } catch (RemoteException e) {
            r4.A01("linkToDeath failed", e, new Object[0]);
        }
        r5.A02 = false;
        List<Runnable> list = r5.A0B;
        for (Runnable run : list) {
            run.run();
        }
        list.clear();
    }
}
