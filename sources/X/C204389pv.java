package X;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;

/* renamed from: X.9pv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C204389pv implements IBinder.DeathRecipient {
    public final /* synthetic */ C201499ji A00;

    public /* synthetic */ C204389pv(C201499ji r1) {
        this.A00 = r1;
    }

    public final void binderDied() {
        C201499ji r6 = this.A00;
        C199269f2 r3 = r6.A06;
        r3.A02("reportBinderDeath", new Object[0]);
        r6.A0A.get();
        String str = r6.A09;
        Object[] A0L = AnonymousClass001.A0L();
        A0L[0] = str;
        r3.A02("%s : Binder has died.", A0L);
        List<AX1> list = r6.A0B;
        for (AX1 a : list) {
            a.a(new RemoteException(String.valueOf(str).concat(" : Binder has died.")));
        }
        list.clear();
        synchronized (r6.A08) {
            C201499ji.A00(r6);
        }
    }
}
