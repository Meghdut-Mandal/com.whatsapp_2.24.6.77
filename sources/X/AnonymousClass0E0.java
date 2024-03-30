package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.0E0  reason: invalid class name */
public abstract class AnonymousClass0E0 extends Binder implements IInterface {
    public abstract boolean A00(int i, Parcel parcel, Parcel parcel2, int i2);

    public final IBinder asBinder() {
        return this;
    }

    public AnonymousClass0E0(String str) {
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
