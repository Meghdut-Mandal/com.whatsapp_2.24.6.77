package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.0Ze  reason: invalid class name and case insensitive filesystem */
public abstract class C07760Ze implements IInterface {
    public final IBinder A00;
    public final String A01;

    public C07760Ze(IBinder iBinder, String str) {
        this.A00 = iBinder;
        this.A01 = str;
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
