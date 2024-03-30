package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.9q3  reason: invalid class name and case insensitive filesystem */
public abstract class C204469q3 implements IInterface {
    public final String A00;
    public final IBinder A01;

    public final Parcel A00(Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            AnonymousClass000.A15(this.A01, parcel, parcel, 1);
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public final void A01(Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            AnonymousClass000.A15(this.A01, parcel, obtain, 3);
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public C204469q3(IBinder iBinder, String str) {
        this.A01 = iBinder;
        this.A00 = str;
    }

    public IBinder asBinder() {
        return this.A01;
    }
}
