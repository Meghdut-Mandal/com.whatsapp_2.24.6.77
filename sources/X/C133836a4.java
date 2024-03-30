package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.6a4  reason: invalid class name and case insensitive filesystem */
public final class C133836a4 implements IInterface, C161347mb {
    public final IBinder A00;

    public final IBinder asBinder() {
        return this.A00;
    }

    public C133836a4(IBinder iBinder) {
        this.A00 = iBinder;
    }

    public final Parcel A00(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            AnonymousClass000.A15(this.A00, parcel, parcel, i);
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
