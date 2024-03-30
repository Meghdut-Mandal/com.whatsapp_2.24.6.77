package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.0Dz  reason: invalid class name and case insensitive filesystem */
public abstract class C03290Dz extends Binder implements IInterface {
    public abstract boolean A00(int i, Parcel parcel, Parcel parcel2, int i2);

    public final IBinder asBinder() {
        return this;
    }

    public C03290Dz(String str) {
        attachInterface(this, str);
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return A00(i, parcel, parcel2, i2);
    }
}
