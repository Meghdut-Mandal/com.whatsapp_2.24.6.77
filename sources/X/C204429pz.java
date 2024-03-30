package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.9pz  reason: invalid class name and case insensitive filesystem */
public abstract class C204429pz implements IInterface {
    public final IBinder A00;

    public C204429pz(IBinder iBinder) {
        this.A00 = iBinder;
    }

    public final IBinder asBinder() {
        return this.A00;
    }

    public final void A00(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            AnonymousClass000.A15(this.A00, parcel, obtain, i);
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
