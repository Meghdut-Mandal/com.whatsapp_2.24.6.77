package X;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.7uR  reason: invalid class name and case insensitive filesystem */
public abstract class C165957uR extends Binder implements IInterface {
    public abstract boolean a(int i, Parcel parcel, Parcel parcel2, int i2);

    public final IBinder asBinder() {
        return this;
    }

    public static Bundle A00(Parcel parcel) {
        Bundle bundle = (Bundle) C201829kU.A00(parcel, Bundle.CREATOR);
        C201829kU.A01(parcel);
        return bundle;
    }

    public C165957uR(String str) {
        attachInterface(this, str);
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return a(i, parcel, parcel2, i2);
    }
}
