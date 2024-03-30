package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: X.7uM  reason: invalid class name and case insensitive filesystem */
public abstract class C165907uM extends Binder implements IInterface {
    public C165907uM() {
        attachInterface(this, "com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        AnonymousClass8D0 r2 = (AnonymousClass8D0) this;
        switch (i) {
            case 1:
                ((AnonymousClass8DS) r2).A00.A06((Status) AnonymousClass000.A0W(parcel, Status.CREATOR));
                return true;
            case 2:
                AnonymousClass000.A0W(parcel, Status.CREATOR);
                throw AnonymousClass001.A0D();
            case 3:
                AnonymousClass000.A0W(parcel, Status.CREATOR);
                parcel.readLong();
                throw AnonymousClass001.A0D();
            case 4:
                AnonymousClass000.A0W(parcel, Status.CREATOR);
                throw AnonymousClass001.A0D();
            case 5:
                AnonymousClass000.A0W(parcel, Status.CREATOR);
                parcel.readLong();
                throw AnonymousClass001.A0D();
            case 6:
                AnonymousClass000.A0W(parcel, Status.CREATOR);
                parcel.createTypedArray(C170148Cd.CREATOR);
                throw AnonymousClass001.A0D();
            case 7:
                AnonymousClass000.A0W(parcel, DataHolder.CREATOR);
                throw AnonymousClass001.A0D();
            case 8:
                AnonymousClass000.A0W(parcel, Status.CREATOR);
                AnonymousClass000.A0W(parcel, AnonymousClass8CJ.CREATOR);
                throw AnonymousClass001.A0D();
            case 9:
                AnonymousClass000.A0W(parcel, Status.CREATOR);
                AnonymousClass000.A0W(parcel, AnonymousClass8CJ.CREATOR);
                throw AnonymousClass001.A0D();
            default:
                return false;
        }
    }
}
