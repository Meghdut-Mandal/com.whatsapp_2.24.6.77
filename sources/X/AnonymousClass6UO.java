package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6UO  reason: invalid class name */
public final class AnonymousClass6UO {
    public static final ClassLoader A00 = AnonymousClass6UO.class.getClassLoader();

    public static void A01(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static Parcel A00(IInterface iInterface, C133816a2 r3) {
        IBinder asBinder;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(r3.A00);
        if (iInterface == null) {
            asBinder = null;
        } else {
            asBinder = iInterface.asBinder();
        }
        obtain.writeStrongBinder(asBinder);
        return obtain;
    }
}
