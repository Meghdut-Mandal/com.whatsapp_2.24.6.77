package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Dy  reason: invalid class name and case insensitive filesystem */
public abstract class C03280Dy extends Binder implements IInterface {
    public abstract boolean A02(int i, Parcel parcel, Parcel parcel2, int i2);

    public final IBinder asBinder() {
        return this;
    }

    public C03280Dy(String str) {
        attachInterface(this, str);
    }

    public static Parcel A00(Parcelable parcelable, C07750Zd r4, C03280Dy r5) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(r4.A00);
        obtain.writeStrongBinder(r5.asBinder());
        if (parcelable == null) {
            obtain.writeInt(0);
            return obtain;
        }
        obtain.writeInt(1);
        parcelable.writeToParcel(obtain, 0);
        return obtain;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return A02(i, parcel, parcel2, i2);
    }
}
