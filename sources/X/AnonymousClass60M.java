package X;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.internal.IUiSettingsDelegate;

/* renamed from: X.60M  reason: invalid class name */
public final class AnonymousClass60M {
    public final IUiSettingsDelegate A00;

    public AnonymousClass60M(IUiSettingsDelegate iUiSettingsDelegate) {
        this.A00 = iUiSettingsDelegate;
    }

    public void A00() {
        try {
            C133816a2 r2 = (C133816a2) this.A00;
            Parcel A002 = C133816a2.A00(r2);
            A002.writeInt(0);
            r2.A03(3, A002);
        } catch (RemoteException e) {
            throw AnonymousClass78K.A00(e);
        }
    }
}
