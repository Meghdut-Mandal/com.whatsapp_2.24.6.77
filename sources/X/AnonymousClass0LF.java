package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: X.0LF  reason: invalid class name */
public final class AnonymousClass0LF extends AnonymousClass0LG {
    public final IBinder A00;
    public final /* synthetic */ C07560Yg A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0LF(Bundle bundle, IBinder iBinder, C07560Yg r3, int i) {
        super(bundle, r3, i);
        this.A01 = r3;
        this.A00 = iBinder;
    }

    public final void A01(AnonymousClass0L0 r4) {
        C07560Yg r2 = this.A01;
        AnonymousClass0oG r0 = r2.A0I;
        if (r0 != null) {
            ((C10370e8) r0).A00.onConnectionFailed(r4);
        }
        r2.A01 = r4.A01;
        r2.A05 = System.currentTimeMillis();
    }

    public final boolean A02() {
        try {
            IBinder iBinder = this.A00;
            AnonymousClass006.A01(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            C07560Yg r3 = this.A01;
            String A07 = r3.A07();
            if (!A07.equals(interfaceDescriptor)) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("service descriptor mismatch: ");
                A0u.append(A07);
                Log.w("GmsClient", AnonymousClass000.A0p(" vs. ", interfaceDescriptor, A0u));
            } else {
                IInterface A05 = r3.A05(iBinder);
                if (A05 != null && (C07560Yg.A02(A05, r3, 2, 4) || C07560Yg.A02(A05, r3, 3, 4))) {
                    r3.A07 = null;
                    AnonymousClass0oF r0 = r3.A0H;
                    if (r0 == null) {
                        return true;
                    }
                    ((C10360e7) r0).A00.onConnected((Bundle) null);
                    return true;
                }
            }
            return false;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
