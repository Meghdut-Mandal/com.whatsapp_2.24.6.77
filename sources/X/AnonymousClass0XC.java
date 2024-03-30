package X;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: X.0XC  reason: invalid class name */
public abstract class AnonymousClass0XC {
    public final int A00;

    public AnonymousClass0XC(int i) {
        this.A00 = i;
    }

    public abstract void A01(Status status);

    public abstract void A02(AnonymousClass0WT r1, boolean z);

    public abstract void A03(C10350e6 r1);

    public abstract void A04(Exception exc);

    public static /* bridge */ /* synthetic */ Status A00(RemoteException remoteException) {
        StringBuilder A0u = AnonymousClass000.A0u();
        AnonymousClass000.A1C(remoteException, A0u);
        A0u.append(": ");
        return new Status(19, AnonymousClass000.A0q(remoteException.getLocalizedMessage(), A0u));
    }
}
