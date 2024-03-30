package X;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: X.65o  reason: invalid class name and case insensitive filesystem */
public final class C1267965o {
    public final C161367md A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1267965o)) {
            return false;
        }
        try {
            C133816a2 r2 = (C133816a2) this.A00;
            Parcel A02 = r2.A02(17, AnonymousClass6UO.A00(((C1267965o) obj).A00, r2));
            boolean A1P = AnonymousClass000.A1P(A02.readInt());
            A02.recycle();
            return A1P;
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public final int hashCode() {
        try {
            C133816a2 r2 = (C133816a2) this.A00;
            Parcel A02 = r2.A02(18, C133816a2.A00(r2));
            int readInt = A02.readInt();
            A02.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }

    public C1267965o(C161367md r1) {
        AnonymousClass006.A01(r1);
        this.A00 = r1;
    }
}
